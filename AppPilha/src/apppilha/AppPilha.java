package apppilha;

public class AppPilha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PilhaSequencial p = new PilhaSequencial();

        try {
            for (int i = 0; i < 5; i++) {
                p.empilha(i);
            }

            for (int i = 0; i < 5; i++) {
                System.out.println(p.desempilha());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
