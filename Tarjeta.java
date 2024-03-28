public class Tarjeta {
    private String data;

    public Tarjeta(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void createcard() {
        System.out.println("Tarjeta creada");
    }
}
