package modelo;

public class Conexion
{
    //Declaramos el objeto de prueba
    private static Conexion objetoPrb;

    //Declaramos el constructor de acceso privado para evitar que el objeto se instancie con el operador new
    private Conexion() {

    }

    /*Declaramos el metodo de acceso al constructor utilizando la palabra reservada "static" para hacer
    posible el acceso mediante el clase.metodo
     */
    public static Conexion getObjeto()
    {
        if(objetoPrb == null)
        {
            objetoPrb = new Conexion();
        }
        return objetoPrb;
    }

    //Metodo de prueba simulando conexión a DB
    public void conectar()
    {
        System.out.println("Me conecte a la bd");
    }

    //Metodo de prueba simulando desconexión de DB
    public void desconectar()
    {
        System.out.println("Me desconecte de la bd");
    }
}
