import javax.swing.JOptionPane;

public class OficinaCarro {
    public String MarcaVeiculo;
    public String ModeloVeiculo;
    public String AnoVeiculo;
    public String ProblemaVeiculo;
    public String DataEntrada;
    public static void main(String[] args) throws Exception{
        
        OficinaCarro veiculo = new OficinaCarro();
        veiculo.MarcaVeiculo = JOptionPane.showInputDialog("Qual a marca do veículo?");
        veiculo.ModeloVeiculo = JOptionPane.showInputDialog("Qual o modelo do veículo?");
        veiculo.AnoVeiculo = JOptionPane.showInputDialog("Qual o ano de fabricação do veículo?");
        veiculo.ProblemaVeiculo = JOptionPane.showInputDialog("Qual o problema do veículo? Ex: batida, mecânico...");
        veiculo.DataEntrada = JOptionPane.showInputDialog("Digite a data que você deu entrada na oficina. Ex: 01\01\01");
    
    }
public class DonoVeiculo{
    public String NomeDono;
    public String CpfDono;
    public String Rg;
    public String Rua;
    public String Num;

    public void OficinaCarro(String[] args) {

    DonoVeiculo pessoa = new DonoVeiculo();
    pessoa.NomeDono = JOptionPane.showInputDialog("Qual o nome completo do propietário do veículo");
    pessoa.CpfDono = JOptionPane.showInputDialog("Qual o CPF do propietário do veículo");
    pessoa.Rg = JOptionPane.showInputDialog("Qual o RG do propietário do veículo");
    pessoa.Rua = JOptionPane.showInputDialog("Qual o nome da rua/avenida do propietário do veículo");
    pessoa.Num = JOptionPane.showInputDialog("Qual o número da casa do propietário do veículo");
    }
}

public class RetiradaVeiculo{
    public String DataRetirada;
    public String NomeResponsavel;
    public String CPF;
    public String NomeFuncionarioEntrega;
    public String RegistroFuncionario;

    public void OficinaCarro(String[] args){
    
    RetiradaVeiculo retirada = new RetiradaVeiculo();
    retirada.DataRetirada = JOptionPane.showInputDialog("Digite a data que foi feita a retirada do veículo na oficina. Ex: 01\01\01");
    retirada.NomeResponsavel = JOptionPane.showInputDialog("Qual o nome completo da pessoa que retirou veículo");
    retirada.CPF = JOptionPane.showInputDialog("Qual o CPF do responsável que retirou o veículo");
    retirada.NomeFuncionarioEntrega = JOptionPane.showInputDialog("Qual o nome do funcionário que entregou o veículo");
    retirada.RegistroFuncionario = JOptionPane.showInputDialog("Qual o registro do funcionário?");

    System.out.println("Marca: " + MarcaVeiculo + "n\Modelo: " + ModeloVeiculo + "n\Ano: " + AnoVeiculo + "n\Problema: "
    + ProblemaVeiculo + "n\Data da Entrada: " + DataEntrada + "n\ Nome do propietário: " + DonoVeiculo + 
    "n\CPF: " + CpfDono + "n\ RG: " + Rg + "n\Endereço: " + Rua + Num + "n\ Data da retirada: " + DataRetirada + "n\Nome do responsável: " + 
    "n\ CPF: " + CPF + "n\Nome do funcionário que entregou: " + NomeFuncionarioEntrega + "n\Registro" + RegistroFuncionario );
    }

    

}
}
    
