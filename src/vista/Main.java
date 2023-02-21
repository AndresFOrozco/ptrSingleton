package vista;

import modelo.Conexion;

public class Main
{
    public static void main(String[] args)
    {
        //Probamos que nuestro objeto no se puede instanciar con el operador new
        //Conexion conexionPrueba = new Conexion();

        //Instanciamos el objeto mediante el metodo de acceso
        Conexion conexionPrb = Conexion.getObjeto();
        conexionPrb.conectar();
        conexionPrb.desconectar();

        boolean rpta = conexionPrb instanceof Conexion;
        System.out.println(rpta);
    }
}
