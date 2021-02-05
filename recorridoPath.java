
import java.io.File;
import java.util.Scanner;


public class recorridoPath {
    
    public static void main(String[] args) {
        System.out.println("Path: ");
        Scanner teclado = new Scanner(System.in);
        String ruta = teclado. nextLine();

        listFiles(ruta);
    }

    public static void listFiles(String r) {
        File ruta = new File(r);

        if (ruta.exists()) {
            File[] arcDirec = ruta.listFiles();

            if (arcDirec == null)
                System.out.println("It's empty");
            else {
                for (int i = 0; i < arcDirec.length; i++) {
                    if (arcDirec[i].isFile())
                        System.out.println(arcDirec[i]);
                        
                    else if (arcDirec[i].isDirectory()){
                        System.out.println(arcDirec[i]);
                        listFiles(arcDirec[i].getAbsolutePath());
                    }
                }
            }
        }
        else
            System.out.println("The path doesn't exist");
    }
}
