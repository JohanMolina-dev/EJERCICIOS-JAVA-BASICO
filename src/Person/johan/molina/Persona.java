package Person.johan.molina;

public class Persona {

    //Constantes IMC
    public static final int PESO_BAJO = -1;
    public static final int PESO_NORMAL = 0;
    public static final int OBESIDAD = 1;
    //Atributos:
    private int DNI;
    private  int edad;
    private String nombre;
    private char sexo;
    private double peso;
    private double altura;


    /*
    Un constructor con el nombre, edad y sexo, el resto por defecto.
     */
    public Persona(){
        nombre= "Johan";
        sexo ='H';
        peso = 0;
        altura = 0;
        DNI= generarDNI();
        edad = 0;



    }




    /*
            Un constructor con todos los atributos como parámetro.
             */
    public Persona( int pEdad, String pNombre, char pSexo, double pPeso, double pAltura) {
        this.DNI = generarDNI();
        this.edad = pEdad;
        this.nombre = pNombre;
        this.sexo = pSexo;
        this.peso = pPeso;
        this.altura = pAltura;
    }

    /*
       Getters
        */
    public int getDNI() {
        return DNI;
    }

    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void getInfoPersona(){
        getDNI();
        getNombre();
        getEdad();
        getSexo();
        getPeso();
        getAltura();

    }
    /*
    Seters
     */
    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }

    public void setSexo(char pSexo) {
        this.sexo = pSexo;
    }

    public void setPeso(double pPeso) {
        this.peso = pPeso;
    }

    public void setAltura(double pAltura) {
        this.altura = pAltura;
    }
    public void setEdad(int pEdad) {
        this.edad = pEdad;
    }
    /*
    Metodos: =>
     */

    @Override
    public String toString() {
        return "Persona{" +
                "DNI=" + DNI +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public int indiceMsCorporal(){
        int imc = (int) (this.peso / (this.altura*this.altura));
        int resultado = 0;
        if(imc<20){
            resultado = PESO_BAJO;
            mensaje("¡Tu peso es bajo!");

        }else if(imc>=20 && imc<=25){
            resultado = PESO_NORMAL;
            mensaje("¡Estas en tu peso ideal!");
        }else {
            resultado = OBESIDAD;
            mensaje("Tu peso esta por encima del ideal !Visita a tu medico!");
        }
        return resultado;
    }

    public boolean esMayordeEdad(int edad){
        if(getEdad()>18){
            return true;
        }

        return false;
    }
    public void comprobarSexo(char sexo){
        if(getSexo() =='H'|| getSexo()=='M'){
            System.out.println("Sexo correcto");
        }else{
            setSexo('H');
        }





    }

    private int generarDNI() {
        String[] arreglo = generarNumeroRandom();
        int numeroDeDNI = getNumeroDeDNI(arreglo);
        return numeroDeDNI;
    }

    private int getNumeroDeDNI(String[] arreglo) {
        StringBuffer cadena = new StringBuffer();
        for (int x = 0; x< arreglo.length; x++){
            cadena =cadena.append(arreglo[x]);
        }


        int numeroDeDNI = Integer.parseInt(String.valueOf(cadena));
        return numeroDeDNI;
    }

    private String[] generarNumeroRandom() {
        String[] arreglo = new String[8];


        for (int i =0; i<8; i++){
            int numRandom = (int)(Math.random()*9+1);
            String numCadena = String.valueOf(numRandom);
            arreglo[i]=numCadena;
        }
        return arreglo;
    }
    private static void mensaje(String s){
        System.out.println(s);
    }

}
