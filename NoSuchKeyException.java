package teste_trabalho;

public class NoSuchKeyException extends Exception {
    @Override
    public String toString() {
        return "Essa Key não existe caralho";
    }
}
