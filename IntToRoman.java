class Solution{
	public String romanToInt(int num){
		int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

		String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

		StringBuilder roman = new StringBuilder();

		for(int i=0; i<values.length && num > 0; i++){
			while(num >= values[i]){
				roman.append(symbols[i]);
				num=num-values[i];
			}
		}
		return roman.toString();
	}
	public static void main(String[] args){

		Solution sol = new Solution();

		System.out.println(sol.romanToInt(58));
		System.out.println(sol.romanToInt(3749));
		System.out.println(sol.romanToInt(1994));
	}
}

