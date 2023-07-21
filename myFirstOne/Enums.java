package myFirstOne;
enum Enums {
	MONDAY,
	TUESDAY,
	WEDNESDAY;
	

	public static void main(String[] args) {
		Enums var=Enums.MONDAY;
		System.out.println(var);
		for(Enums var1:Enums.values()) {
			System.out.println(var1);
		}

	}

}
