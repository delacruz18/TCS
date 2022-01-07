package way2automation.Paginas;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.io.*;


public class LecturaDatos {

    private WebDriver driver;
    FileReader f;
    BufferedReader bf;
    String texto = "";
    String[] Lineas;
    static  String pri_nomb1;
    static String seg_nomb1;
    static  String pri_apell1;
    static  String seg_apell1;
    static  String telefono1;
    static  String fecha1;


    public LecturaDatos(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public String leerTxt() throws IOException { //direccion del archivo

        int characterCount = 0;
        int lineas;
        try {
            FileReader fr = new FileReader("C:\\Users\\User\\Downloads\\Proyecto TCS\\Datos\\insumo.txt");
            BufferedReader bf = new BufferedReader(fr);
            String temp = "";// guarda el texto
            String bfRead;  //texto leido

            while ((bfRead = bf.readLine()) != null) { //haz el ciclo, mientras bfRead tiene datos
                temp = temp + "\n" + bfRead; //guardado el texto del archivo
            }

            texto = temp; //Almacenado fuer del try
            System.out.println("1. los datos son " + texto);
        } catch (Exception e) {
            System.err.println("No se encontro archivo" + "\n");
        }

        return texto;

    }

    public void datos() throws IOException {
        File file = new File("C:\\Users\\User\\Downloads\\Proyecto TCS\\Datos\\insumo.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line;
        String TextLine;
        int sentenceCount = 0;
        int wordCount = 0;

        System.out.println("\n" + "3. Datos de los asociados");

        String[] Frases = new String[0];
        String part00 ;
        while ((line = bufferedReader.readLine()) != null) {
            part00 = null;
            String[] part01 = new String[0];
            Frases = null;

            if (line.equals("")) {//si está en blanco
                System.err.println("No se encontro archivo" + "\n");
            } else {

                String words[] = line.split("\\s+");
                wordCount += words.length;
                System.out.println("\n" + "Asociado numero " + wordCount);
                Lineas = texto.split("\n");// divide en renglones
                part00 = Lineas[wordCount];
                Frases = part00.split("-");// divide en frases

                String pri_nomb = Frases[0]; // primer nombre
                String seg_nomb = Frases[1]; // segundo nombre
                String pri_apell = Frases[2];// primer apellido
                String seg_apell = Frases[3];//segundo apellido
                String telefono = Frases[4];// telefono
                String fecha = Frases[5];// fecha
                System.out.println("Primer nombre:" + pri_nomb);
                System.out.println("Segundo nombre:" + seg_nomb);
                System.out.println("Primer Apellido:" + pri_apell);
                System.out.println("Segundo Apellido:" + seg_apell);
                System.out.println("Telefono:" + telefono);
                System.out.println("Fecha de ingreso:"+"\n" +"Dia:"+ fecha.substring(0,2)+" Mes:"+fecha.substring(3,5)+" Años:"+fecha.substring(6,10));

                pri_nomb1 = pri_nomb; //Almacenado fuer del try
                seg_nomb1 = seg_nomb; //Almacenado fuer del try
                pri_apell1 =pri_apell;
                seg_apell1 = seg_apell;
                telefono1=telefono;
                fecha1=fecha;


            }

        }
        System.out.println("\n" + "2. El numero de lineas es " + wordCount + "\n");


    }

    public  String getPri_nomb1() {
        return pri_nomb1;
    }

    public String getSeg_nomb1() {
        return seg_nomb1;
    }

    public  String getPri_apell1() {
        return pri_apell1;
    }

    public  String getSeg_apell1() {
        return seg_apell1;
    }

    public  String getTelefono1() {
        return telefono1;
    }


}



