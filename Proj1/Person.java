
/**
 * Escreva uma descrição da classe Person aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Person
{
    private String name, ID;
    private boolean hasVoted;
    
    public Person(String name, String ID){
        if(name != null) this.name = name;
        else this.name = "?";
        this.ID = ID;
    }
}
