public class NegativeLifespanException extends Exception{
    public NegativeLifespanException(Person person){
        super("Person " + person.getName()
                + " was born in " + person.getBirthDate() + " died in: " + person.getDeathDate() + " Died before BirthDate!!!");
    }

}
