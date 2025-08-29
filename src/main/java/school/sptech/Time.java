package school.sptech;

public class Time {
    String nome;
    Integer vitorias = 0;
    Integer empates = 0;
    Integer derrotas = 0;

    public void registrarVitoria(){
        vitorias++;
    }

    public void registrarEmpate(){
        empates++;
    }

    public void registrarDerrota(){
        derrotas++;
    }

    public Integer getPontos(){
        return (vitorias * 3) + empates;
    }

    public Integer getTotalPartidas(){
        return vitorias + empates + derrotas;
    }

    public Integer getAproveitamento(){
        int total = getTotalPartidas();
        return (vitorias * 100) / total;
    }

    public void compararAproveitamento(Time adversario){
        Integer aproveitamento = getAproveitamento();
        Integer aproveitamentoAdversario = adversario.getAproveitamento();

        if (aproveitamento > aproveitamentoAdversario) {
            System.out.println("O time " + nome + " tem um aproveitamento maior que o time " + adversario.nome + ".");
        } else if (aproveitamento < aproveitamentoAdversario) {
            System.out.println("O time " + adversario.nome + " tem um aproveitamento maior que o time " + nome + ".");
        } else {
            System.out.println("Os times " + nome + " e " + adversario.nome + " têm o mesmo aproveitamento.");
        }
    }

    public void exibirInformacoes(){
        System.out.println("Time: " + nome);
        System.out.println("Vitórias: " + vitorias);
        System.out.println("Empates: " + empates);
        System.out.println("Derrotas: " + derrotas);
        System.out.println();
        System.out.println("Pontos: " + getPontos());
        System.out.println("Total de Partidas: " + getTotalPartidas());
        System.out.println("Aproveitamento: " + getAproveitamento() + "%");
        System.out.println();
        System.out.println("---");
    }
}

