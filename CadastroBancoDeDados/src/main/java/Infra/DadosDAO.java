package Infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DadosDAO<E> {
    
    private static EntityManagerFactory emf;
    private EntityManager em;
    private Class<E> classe;
    
    static {
        try {
            emf = Persistence.createEntityManagerFactory("CadastroBancoDeDados");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public DadosDAO() {
        this(null);
    }
    
    public DadosDAO(Class<E> classe) {
        this.classe = classe;
        this.em = emf.createEntityManager();
    }
    
    public DadosDAO<E> abrirT() {
        if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }
        return this;
    }
    
    public DadosDAO<E> fecharT() {
        if (em.getTransaction().isActive()) {
            em.getTransaction().commit();
        }
        if (em.isOpen()) {
            em.close();
        }
        return this;
    }
    
    public DadosDAO<E> incluirDados(E entidade) {
        em.persist(entidade);
        em.getTransaction().commit();
        return this;
    }
    
    public List<E> obterTodos(int qntd, int deslocamento) {
        if (classe == null) {
            throw new UnsupportedOperationException("Classe não definida");
        }
        
        String jpql = "select e from " + classe.getName() + " e";
        
        TypedQuery<E> query = em.createQuery(jpql, classe);
        
        query.setMaxResults(qntd);
        query.setFirstResult(deslocamento);
        
        return query.getResultList();        
    }
    
    public List<E> obterTodos() {
        return obterTodos(Integer.MAX_VALUE, 0);
    }
    
    public void closeEntityManagerFactory() {
        if (emf.isOpen()) {
            emf.close(); 
        }
    }
}
