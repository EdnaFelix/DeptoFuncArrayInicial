package edna.deptofunc.code;

public class Departamento{
    private int codDepto;
    private String nome;
    private Funcionario chefe;
    private Funcionario[] aloca;
    private int funcionarios = 0;
    
    public Departamento(int codDepto, String nome, Funcionario chefe){
        this.codDepto = codDepto;
        this.nome = nome;
        this.chefe = chefe;
        // aloca = null;
        aloca = new Funcionario[ 10000 ];
    }
    
    public int getCodDepto(){
        return codDepto;
    }
    
    public void setCodDepto(int codDepto){
        this.codDepto = codDepto;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Funcionario getChefe(){
        return chefe;
    }
    
    public void setChefe(Funcionario chefe){
        this.chefe = chefe;
    }
    
    public Funcionario[] getAloca(){
        return aloca;
    }
    
    public void setAloca(Funcionario[] aloca){
        this.aloca = aloca;
    }

    public Funcionario[] getFuncionarios() {
        return aloca;
    }

    public void alocarFunc(Funcionario jose) {
        aloca[ funcionarios ] = jose;
        funcionarios++;
    }
}
