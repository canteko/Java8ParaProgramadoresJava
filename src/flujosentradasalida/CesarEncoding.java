package flujosentradasalida;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * @author Openwebinars
 *
 */
public class CesarEncoding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		encodeCesar("mensaje.txt", "mensaje_cifrado.txt");
		decodeCesar("mensaje_cifrado.txt", "mensaje_descifrado.txt");
	}
	
	public static char encodeDecodeCharCesar(char receivedChar, boolean encode) {
		final int OFFSET = 3;
		
		char result;
		if (Character.isLetter(receivedChar)) {
			int intValue = (int) receivedChar - 'A';
			int intResult = (encode ? (intValue + OFFSET) : (intValue - OFFSET)) % 26;
			result = (char) ('A' + intResult);
		}
		else
			result = receivedChar;
		
		return result;
	}
	
	public static char decodeCharCesar(char charToDecode) {
		return encodeDecodeCharCesar(charToDecode, false);
	}
	
	public static char encodeCharCesar(char charToDecode) {
		return encodeDecodeCharCesar(charToDecode, true);
	}
	
	public static void closeReader(Reader buffer) {
		if (buffer != null) {
			try {
				buffer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
	}
	
	public static void closeWriter(Writer buffer) {
		if (buffer != null) {
			try {
				buffer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
	}
	
	public static void encodeCesar(String sourceFile, String targetFile) {
		encodeDecodeCesar(sourceFile, targetFile, true);
	}
	
	public static void decodeCesar(String sourceFile, String targetFile) {
		encodeDecodeCesar(sourceFile, targetFile, false);
	}
	
	public static void encodeDecodeCesar(String sourceFile, String targetFile, boolean encode) {
		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			br = new BufferedReader(new FileReader(sourceFile));
			bw = new BufferedWriter(new FileWriter(targetFile));

			String linea = null;

			while ((linea = br.readLine()) != null) {
				StringBuilder sb = new StringBuilder(linea.length());
				for (char c : linea.toUpperCase().toCharArray()) {
					char result = (encode ? encodeCharCesar(c) : decodeCharCesar(c));
					sb.append(result);
				}
				bw.write(sb.toString());
				bw.newLine();

			}
			System.out.println("El mensaje ha sido cifrado correctamente");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			closeReader(br);
			closeWriter(bw);
		}
	}

}