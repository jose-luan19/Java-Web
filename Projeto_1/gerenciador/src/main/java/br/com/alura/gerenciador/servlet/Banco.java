package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> listaEmpresas = new ArrayList<Empresa>();
	private static Integer chaveSequencial = 1;
	
	//Bloco estático que simula um DB e que já deixa cadastrado essas duas empresas.
//	static {
//        Empresa empresa = new Empresa();
//        empresa.setNome("Alura");
//        Empresa empresa2 = new Empresa();
//        empresa2.setNome("Caelum");
//        listaEmpresas.add(empresa);
//        listaEmpresas.add(empresa2);
//    }
	
	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		listaEmpresas.add(empresa);
		System.out.println("Adicionou a empresa: "+ empresa.getNome());
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.listaEmpresas;
	}

	public void removeEmpresa(Integer id) {
		Iterator<Empresa> it = listaEmpresas.iterator();
		
		while (it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId() == id ) {
	        	it.remove();
	        	System.out.println("Removeu a empresas: "+emp.getNome()+" id: "+ emp.getId() );
	        }
		}
		
		//Não é possivel iterar uma coleção e modifica-la ao mesmo tempo
//		for (Empresa empresa: listaEmpresas) { 
//	        if(empresa.getId() == id ) {
//	        	listaEmpresas.remove(empresa);
//	        }
//	    }
		
	}

	public Empresa buscaEmpresaPeloId(Integer id) {
		for (Empresa empresa: listaEmpresas) { 
	        if(empresa.getId() == id ) {
	        	return empresa;
	        }
	    }
		return null;
	}

}
