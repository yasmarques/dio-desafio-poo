import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    @Override
    public Double calcularXp() {
        return XP_PADRAO + 40d;

    }
    
    
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo()+ ", descricao=" + getDescricao() + ", data=" + data + "]";
    }



}
