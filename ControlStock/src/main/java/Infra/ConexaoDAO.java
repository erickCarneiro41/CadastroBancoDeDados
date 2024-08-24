package Infra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ConexaoDAO<E> {

    private static EntityManagerFactory emf;
    private EntityManager em;
    private Class<E> classe;

    static {
        try {
            emf = Persistence.createEntityManagerFactory("ControlStock");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ConexaoDAO() {}

    public ConexaoDAO(Class<E> classe) {
        this.classe = classe;
    }

    public ConexaoDAO<E> abrirT() {
        if (emf != null) {
            this.em = emf.createEntityManager();
            em.getTransaction().begin();
            System.out.println("Transação iniciada.");
        } else {
            System.err.println("Falha ao criar EntityManagerFactory.");
        }
        return this;
    }

    public ConexaoDAO<E> fecharT() {
        if (em != null) {
            em.getTransaction().commit();
            em.close();
            System.out.println("Transação concluída e EntityManager fechado.");
        } else {
            System.err.println("EntityManager não foi inicializado.");
        }
        return this;
    }

    public ConexaoDAO<E> incluirDados(E entidade) {
        if (em != null) {
            em.persist(entidade);
            System.out.println("Entidade persistida.");
        } else {
            System.err.println("EntityManager não foi inicializado.");
        }
        return this;
    }

    public Long contagem(String jpql, Object... params) {
        Long result = null;
        if (em != null) {
            Query query = em.createQuery(jpql);
            for (int i = 0; i < params.length; i++) {
                query.setParameter("id", params[i]); // Use o nome do parâmetro
            }
            result = (Long) query.getSingleResult();
        } else {
            System.err.println("EntityManager não foi inicializado.");
        }
        return result;
    }
}
