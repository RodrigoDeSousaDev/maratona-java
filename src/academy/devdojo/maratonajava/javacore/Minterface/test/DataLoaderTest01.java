package academy.devdojo.maratonajava.javacore.Minterface.test;

import academy.devdojo.maratonajava.javacore.Minterface.dominio.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Minterface.dominio.FileLoarder;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoarder fileLoarder = new FileLoarder();

        databaseLoader.load();
        fileLoarder.load();

        databaseLoader.remove();
        fileLoarder.remove();
        databaseLoader.checkPermission();
        fileLoarder.checkPermission();
    }
}
