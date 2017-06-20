/*
 * Copyright 2017 (c) Raúl Granel Blasco - raul.granel@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package library;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Properties;

/**
 *
 * @author (c) Raúl Granel Blasco - raul.granel@gmail.com
 */
public class UtilesBD {

    private static final String PROTOCOL = "jdbc:mysql";    // MySQL.
    private static final String HOST = "localhost";         // IP.
    private static final String PORT = "3306";              // MySQL.

    private static Properties cargarPropiedades(String fichero) {
        Properties p;
        try (FileReader fr = new FileReader(fichero)) {
            p = new Properties();
            p.load(fr);
        } catch (Exception e) {
            p = null;
        }
        return p;
    }

    public static Connection obtenerConexion() throws SQLException {

        final String FICHERO = "db.properties";

        Properties p = cargarPropiedades(FICHERO);

        String cadenaConexion = String.format("%s://%s:%s/%s?user=%s&password=%s",
                p.getProperty("protocol", PROTOCOL),
                p.getProperty("host", HOST),
                p.getProperty("port", PORT),
                p.getProperty("db"),
                p.getProperty("user"),
                p.getProperty("password")
        );
        return DriverManager.getConnection(cadenaConexion);
    }

    // Obtenemos una fecha SQL de la base de datos.
    public static String convertirSQLDate2String(java.sql.Date sqlDate) {

        // Obtenemos el tiempo en milisegundos Unix y lo almacenamos en una variable.
        long ms = sqlDate.getTime();

        // Instanciamos una fecha de java con los milisegundos de Unix.
        java.util.Date utilDate = new java.util.Date(ms);

        // Le damos el formato deseado a la variable.
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Devolvemos la fecha java (utilDate) utilizando el formato establecido en (sdf).
        return sdf.format(utilDate);
    }

    // Comprueba existencia en la Base de Datos una PRIMARY KEY tipo INT.
    public static int buscarIdEntero(int primaryKey, ResultSet rs, String nombreCampo) throws SQLException {

        int posicion = -1;            // No encontrado.
        boolean busquedaOK = true;      // Seguir busqueda.

        while (busquedaOK) {
            if (rs.next()) {
                if (primaryKey == rs.getInt(nombreCampo)) {
                    posicion = rs.getRow();         //Sí encontrado.
                    busquedaOK = false;
                } else {
                    busquedaOK = false;             // Parar la búsqueda.
                }
            }
        }
        return posicion;
    }

    // Comprueba existencia en la Base de Datos una PRIMARY KEY tipo String.
    public static int buscarIDString(String primaryKey, ResultSet rs, String nombreCampo) throws SQLException {

        int posicion = -1;            // No encontrado.
        boolean busquedaOK = true;      // Seguir busqueda.

        while (busquedaOK) {
            if (rs.next()) {
                if (primaryKey.equals(rs.getString(nombreCampo))) {
                    posicion = rs.getRow();         //Sí encontrado.
                    busquedaOK = false;
                } else {
                    busquedaOK = false;             // Parar la búsqueda.
                }
            }
        }
        return posicion;
    }
    
}
