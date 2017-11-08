package edna.deptofunc.tests;

import edna.deptofunc.code.Funcionario;
import edna.deptofunc.code.Departamento;
import org.junit.Assert;
import org.junit.Test;

public class DepartamentoTest {
	@Test
	public void criaDeptoValido() {
		
		Funcionario ana = new Funcionario(123,"Ana",null);

		Assert.assertEquals(ana.getMatricula(), 123);
		Assert.assertEquals(ana.getNome(), "Ana");
		Assert.assertNull(ana.getDepartamentoAlocado());
		Assert.assertNull(ana.getDepartamentoChefia());
		
		Departamento vendas = new Departamento(1,"Vendas",ana);
		
		Assert.assertEquals(vendas.getCodDepto(), 1);
		Assert.assertEquals(vendas.getNome(), "Vendas");
		
		Assert.assertEquals(vendas.getChefe().getMatricula(),123);
                Funcionario Edna = new Funcionario(777, "Edna", null);
                
                Departamento Executivo = new Departamento(7, "Executivo", Edna);
                ana.setDepartamentoChefia(Executivo);
                
		Assert.assertEquals(ana.getDepartamentoChefia().getCodDepto(),7);
                
                ana.setDepartamentoAlocado(vendas);
                
		Assert.assertEquals(ana.getDepartamentoAlocado().getCodDepto(),1);
		
		Funcionario joao = new Funcionario(789,"Joao", vendas);
		Assert.assertEquals(1, joao.getDepartamentoAlocado().getCodDepto() );
		Assert.assertNull( joao.getDepartamentoChefia() );
		
		Funcionario[] funcionarios = vendas.getFuncionarios();
		boolean temAna = false;
		for(Funcionario funcionario : funcionarios) {
                        if (funcionario == null) { break; }

			if(funcionario.getMatricula() == 123) {
				temAna=true;
				break;
			}
		}
		Assert.assertTrue(temAna);
		
		Funcionario jose = new Funcionario(456,"Jose",null);
		vendas.alocarFunc(jose);
                jose.setDepartamentoAlocado (vendas);
		Assert.assertEquals(1, jose.getDepartamentoAlocado().getCodDepto());
		
		funcionarios = vendas.getFuncionarios();
		boolean temJose = false;
		for(Funcionario funcionario : funcionarios) {
                        if (funcionario == null) { break; }

			if(funcionario.getMatricula() == 456) {
				temJose=true;
				break;
			}
		}
		Assert.assertTrue(temJose);
	}
}
