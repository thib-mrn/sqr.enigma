package enigma;

/** Class that represents a reflector in the enigma.
 *  @author
 */
public class Reflector extends Rotor {
	
	int[] reflection;
	
	/*
		Contruit un Reflecteur en fonction des paramètres indiqués
	*/
	public static Reflector reflectorFactory(String str){
		char[] s = str.trim().replace(" ", "").toCharArray();
		int[] cipher = new int[26];
		for (int i = 0; i< 26; i++){
			cipher[i] = toIndex(s[i]);
		}
		return new Reflector(cipher);
	}
	
	Reflector(int[] r){
		super(r,0);
		reflection = r;
	}
        
    public int convertForward(int p) {
        return ((reflection[((p)%26+26)%26])%26+26)%26;
    }

    @Override
    public int convertBackward(int unused) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void advance() {
    }

}
