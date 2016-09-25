
public interface CryptoAlgo {
	interface CryptoBreak {
		void decrypt(String encrypred);
	}
	void encrypt(String text);
}

