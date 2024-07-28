package exerc1;

public class numero1 {
    
    // Método 
   
	public static boolean Palindromo(String str) {
        		
		// Remover espaços em branco e converter para minúsculas
       		str = str.replaceAll("\\s+", "").toLowerCase();
       	// comparar a escrita 
       	int esquerda = 0;
        int direita = str.length() - 1;
        
        while (esquerda < direita) {
            if (str.charAt(esquerda) != str.charAt(direita)) {
                return false; 
            }
            esquerda++;
            direita--;
        }
        
        return true; 
    }
    
    public static void main(String[] args) {
        String palavra1 = "osso";
        String palavra2 = "radar";
        String palavra3 = "arara";
        
        // Testando as strings
        System.out.println(palavra1 + " é palíndromo? " + Palindromo(palavra1));
        System.out.println(palavra2 + " é palíndromo? " + Palindromo(palavra2));
        System.out.println(palavra3 + " é palíndromo? " + Palindromo(palavra3));
    }
}
