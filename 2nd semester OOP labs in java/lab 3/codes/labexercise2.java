public class labexercise2 {
    public static void main(String[] args) {
        int READ = 1;   
        int WRITE = 2;  
        int EXECUTE = 4; 
        int permissions = 0; 
        permissions |= READ;  
        System.out.println("After granting READ: " + permissions);

        permissions |= WRITE; 
        System.out.println("After granting WRITE: " + permissions);
      System.out.println("Can EXECUTE? " + ((permissions & EXECUTE) != 0));

       permissions ^= WRITE;
        System.out.println("After toggling WRITE: " + permissions);

       System.out.println("Read: " + ((permissions & READ) != 0));
        System.out.println("Write: " + ((permissions & WRITE) != 0));
        System.out.println("Execute " + ((permissions & EXECUTE) != 0));
    }
}
