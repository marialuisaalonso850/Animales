import javax.swing.JOptionPane;

public class Mascotas {
	public int codigo;
    public String nombre;
    public String especie;
    public int edad;

    public Mascotas(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }
    
    
    public void mostrarInformacion() {
    	String info = "Detalles del animal:\n"
                + "Nombre: " + nombre + "\n"
                + "Tipo: " + especie + "\n"
                + "edad: " + edad +  "\n";
    			hacerSonido();
        JOptionPane.showMessageDialog(null, info);
    }

   
    public void hacerSonido() {
    	 if (especie.equalsIgnoreCase("gato")) {
             System.out.println("Soy un gato y puedo trepar árboles.");
         } else if (especie.equalsIgnoreCase("perro")) {
             System.out.println("Soy un perro y puedo jugar a buscar la pelota.");
         } else if (especie.equalsIgnoreCase("pato")) {
             System.out.println("Soy un pato y puedo nadar en el agua.");
         } else {
             System.out.println("Este método no tiene una implementación especial para esta especie.");
         }
     }
    }


