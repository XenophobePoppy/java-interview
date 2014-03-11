public Class ReserveString {
	public ReserveString {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String a = "abcdefg";
		char b[] = a.toCharArray();
		char c[] = new char[b.length];

		for (int = 0; i < b.length; i++) {
			c[i] = b[b.length - 1 - i];
		}

		String d = String.valueOf(c);

		System.out.pirnt(d);
	}
}