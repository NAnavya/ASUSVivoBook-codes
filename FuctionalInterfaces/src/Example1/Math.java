package Example1;

@FunctionalInterface   //optional
public interface Math {
     public abstract int calculate(int i,int j);
}


//Functional interfaces : Which contain only one Abstract method but any no.of default and static methods but before java8 in the java7 the interfaces must contain only abstract methods and static final variables no other things are allowed
// Default methods : A method with logic
// LambdaExpressions are used only for Functions Interfaces