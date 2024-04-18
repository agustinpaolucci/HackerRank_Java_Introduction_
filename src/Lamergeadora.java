public class Lamergeadora {

    private String usuario;
    


    public Lamergeadora() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Lamergeadora{" +
                "usuario='" + usuario + '\'' +
                ", email='" + email + '\'' +
                ", edad=" + edad +
                '}';
    }
}

