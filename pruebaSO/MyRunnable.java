package pruebaSO;

//import java.awt.List;
import java.io.File;
//import java.io.FilenameFilter;
import java.util.ArrayList;
//import java.util.Collection;

public class MyRunnable {
	private static ArrayList<File> archivos = new ArrayList<File>();
	
	public static void main(String[] args) {
        walkin(new File("C:\\Users\\Sistel-Support\\Desktop\\Yessica"));//\\AWSAmazon\\Clientes\\HONDUCOMPRAS")); 
        //System.out.println(archivos);
    }
 
    public static void walkin(File dir) {
        File listFile[] = dir.listFiles();
        if (listFile != null) {
            for (int i = 0; i < listFile.length; i++) {
                if (listFile[i].isDirectory()) {
                    walkin(listFile[i]);
                } else {
                	if (listFile[i].isFile()) {
                    	archivos.add(listFile[i]);
                    	System.out.println(archivos.get(i));
                    	}         	
                }
            }
        }
    }
}