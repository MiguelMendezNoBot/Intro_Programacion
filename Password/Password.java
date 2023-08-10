public class Password
{
    private static final int lengthDefault = 8;
    private int length = lengthDefault;
    private String password;
    
    public Password(int length){
        setLength(length);
        password = generatePass(this.length);
    }
    public Password(){
    }
    
    public boolean isStrong(){
        int uppercase = 0;
        int lowercase = 0;
        int number = 0;
        if(password != null){
            for(int i = 0; i < password.length(); i++){
                char letter = password.charAt(i);
                if(letter >= 65 && letter <= 90){
                    uppercase++;
                }else if(letter >= 97 && letter <= 122){
                    lowercase++;
                }else if(letter >= 48 && letter <= 57){
                    number++;
                }else{
                    System.out.println("Caracter invalido detectado");
                    break;
                }
            }
        }
        return uppercase >= 2 && lowercase >= 1 && number >= 5;
    }
    
    private String generatePass(int length){
        String pass = "";
        char letter;
        for(int i = 0; i < length; i++){
            int randNum = (int) (Math.random() * 3) + 1;
            if(randNum == 1){
                letter = (char)(Math.random() * (90 - 65) + 65);
                pass += letter;
            }else if(randNum == 2){
                letter = (char)(Math.random() * (122 - 97) + 97);
                pass += letter;
            }else{
                letter = (char)(Math.random() * (57 - 48) + 48);
                pass += letter;
            }
        }
        return pass;
    }
    
    public int getLength(){
        return length;
    }
    public String getPassword(){
        return password;
    }
    public void setLength(int length){
        if(length > 0){
            this.length = length;
        }
    }
    
    @Override
    public String toString(){
        return password;
    }
}
