package code1;

public class Test3 {
	public static String validatePlayer(int noOfPlayers,String playername[]) {
		int n=noOfPlayers;
		int k=0;
		String[] s=playername;
		String a=null;
		for(int i=0;i<n;i++) {
			k=0;
			for(int j=0;j<s[i].length();j++){
				if(s[i].charAt(j)=='a') {
					k++;
				}
			}
			if(k==1) {
				a=s[i];
			}
		}
		return a;
		
	}

}
