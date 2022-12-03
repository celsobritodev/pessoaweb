package br.com.senacrs.testes;

import br.com.senacrs.bean.Pessoa;
import br.com.senacrs.dao.PessoaDAO;
import br.com.senacrs.util.DAOFactory;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        /*
  
        try {
       ConnectionFactory.getConnection();
        } catch (Exception ex ){
            JOptionPane.showMessageDialog(null,ex.getMessage());
            JOptionPane.showMessageDialog(null,ex.getCause());
        }
    }

         */
 /*    
Pessoa pessoa = new Pessoa();
pessoa.setNome("Angelo");
pessoa.setSobrenome("Luz");
pessoa.getEndereco().setBairro("Fragata");
pessoa.getEndereco().setCep("09719-000");
pessoa.getEndereco().setRua("Rua Dr. Javanes");

PessoaDAO pd = DAOFactory.createPessoaDAO();
pd.inserir(pessoa);
         */
        PessoaDAO pd = DAOFactory.createPessoaDAO();
        List<Pessoa> pessoas = pd.listar();
        for (Pessoa pessoa : pessoas) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("sobrenome: " + pessoa.getSobrenome());
            System.out.println("rua: " + pessoa.getEndereco().getRua());
            System.out.println("cep: " + pessoa.getEndereco().getCep());
            System.out.println("bairro: " + pessoa.getEndereco().getBairro());
            System.out.println("-------------------------------------------------------------");
        }

    }

}
