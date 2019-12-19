package gerenciamento;

/**
 *
 * @author Patric
 */
public class Gerenciamento {
    private int id;
    private String nome;
    private String usuario;
    
    public Gerenciamento(int id, String nome, String usuario){
        this.id = id;
        this.nome = nome;
        this.usuario = usuario;
    }   

    protected void finalize(){
            System.out.println("Arquivo de "+id+" foi removido");
    }
    
    
    
    public boolean equals(Object o){
        if(o instanceof Gerenciamento){
            Gerenciamento t = (Gerenciamento)o;
            return t.id == this.id && t.usuario.equals(this.usuario) && t.nome.equals(this.nome);
        }
        return false;
    }
    
    public void mostrarInfo(){
        System.out.println(id + " "+nome+" "+ usuario);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
