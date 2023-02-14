public class DataTypes {
    public static void main(String[] args){
        //el tipo de dato int tiene un limite, hasta 10 digitos.
        int n = 1124214252;
        //hay 4 tipos de datos numericos ENTEROS:
        //byte (1 byte), short (2 bytes), int (4 bytes) y long (8 bytes).
        long nL = 2353532532636432643L;  // si o si hay que colocar una 'L' al final, sino lo va a considerar
        // un int.

        //tipos de datos numericos con decimales:
        //float (4 bytes) y double (8 bytes). doble sirve para tener mas precision con los decimales, ya que
        // puede tener mas decimales.
        double nD = 3422.2353532532;
        float nF = 123.456F;        //al igual que con long, aca hay que poner la F al final, sino los va a
        // considerar como double.

        //el tipo de dato char sire para caracteres rango unicode, acepta solo un digito, un caracter (ocupa 2
        // bytes)
        //se clasifica dentro de los tipo de datos texto, pero aca se usa comilla simple '' y no comilla doble.
        //ej: char ejChar = '#', 'a';

        //booleanos: true o false. Ocupan 2 bytes.

        //a partir de java 10 ya no es necesario tipar las variables para declararlas, se puede
        //poner var x = "hola mundo";
        //y automaticamente java detectara que tipo de dato es, igual que javascript.

        var salario = 1000;         //tipo int
        var pension = salario*0.03; //tipo double
        System.out.println(salario);
        System.out.println(pension);

        var totalSalary = salario - pension;
        System.out.println(totalSalary);    //tipo de dato double.

        var employeeName = "Agustin Vessoni";   //los Strings siempre van con comillas dobles "".
        System.out.println("El empleado es " + employeeName + " su salario es " + salario);

        //este codigo (java 11) no podria ser ejecutado en una maquina virtual de una version menor con la que
        // fue compilado el programa. debe ser la misma o mayor.

    }
}
