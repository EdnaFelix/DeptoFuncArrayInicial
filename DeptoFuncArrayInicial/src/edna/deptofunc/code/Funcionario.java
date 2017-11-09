package edna.deptofunc.code;

public class Funcionario {
    private int matricula;
    private String nome;
    private Departamento alocado;
    private Departamento chefia;
    
    public Funcionario (int mat, String nome, Departamento depto){
        matricula = mat;
        this.nome = nome;
        alocado = depto;
        chefia = null;

        if (alocado != null) {
            alocado.alocarFunc (this);
        }
    }
    
    public int getMatricula(){
        return matricula;
    }
    
    public void setMatricula (int matricula){
        this.matricula = matricula;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void getNome (String nome){
        this.nome = nome;
    }
    
    public Departamento getDepartamentoAlocado (){
        return alocado;
    }
    
    public void setDepartamentoAlocado(Departamento alocado){
        this.alocado = alocado; 
    }
    
    public Departamento getDepartamentoChefia(){
        return chefia;
    }
    
    public void setDepartamentoChefia (Departamento chefia){
        this.chefia = chefia;
        
        if (this != chefia.getChefe ( )) {
            chefia.alocarFunc (this);
        }
        
        this.setDepartamentoAlocado (chefia);
    }
}