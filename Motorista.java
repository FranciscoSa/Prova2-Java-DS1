public class Motorista{
    String nome = "";
    int anoNascimento = 0;
    char tipoCNH = ' ';

    public Motorista (String nome, int anoNascimento){
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.tipoCNH = 'N';
    }

    public void tirarCNH (char tipoCNH){
        if (tipoCNH == 'A' || tipoCNH == 'B' || tipoCNH == 'Z'){
            this.tipoCNH = tipoCNH;
        }
    }
}