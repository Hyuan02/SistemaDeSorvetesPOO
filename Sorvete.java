import java.util.ArrayList;
/**
 * Escreva a descrição da classe Sorvete aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Sorvete extends Produto
{
    private ArrayList<Sabor> sabores;
    
    
    public Sorvete(String nome, int codigo, float preco){
        super(nome, codigo, preco);
        sabores = new ArrayList<Sabor>();
    } 
    
    public void AddSabor(Sabor sabor){
        sabores.add(sabor);
    }
}
