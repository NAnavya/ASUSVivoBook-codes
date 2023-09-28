import java.util.Optional;

public class OptionalClass {
	public static void main(String []args) {
		Optional<String> fullName=Optional.of("Hcl");
		fullName=Optional.ofNullable(null);
		System.out.println("FullName:"+fullName.orElseGet(()->"Tech"));
	}

}
