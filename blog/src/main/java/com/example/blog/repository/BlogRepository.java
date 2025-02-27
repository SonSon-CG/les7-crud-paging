//package com.example.blog.repository;
//
//import com.example.blog.model.Blog;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.persistence.EntityManager;
//import javax.persistence.NoResultException;
//import javax.persistence.PersistenceContext;
//import javax.persistence.TypedQuery;
//import java.util.List;
//
//@Transactional
//@Repository
//public class BlogRepository implements IBlogRepository {
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Override
//    public List<Blog> findAll() {
//        TypedQuery<Blog> query = entityManager.createQuery("select c from Blog c", Blog.class);
//        return query.getResultList();
//
//    }
//
//    @Override
//    public Blog findById(Long id) {
//        TypedQuery<Blog> query = entityManager.createQuery("select c from Blog c where c.id=:id", Blog.class);
//        query.setParameter("id", id);
//        try {
//            return query.getSingleResult();
//        } catch (NoResultException e) {
//            return null;
//        }
//    }
//
//    @Override
//    public void save(Blog blog) {
//        try{ if (blog.getId() != null) {
//            entityManager.merge(blog);
//        } else {
//            entityManager.persist(blog);
//        }
//        }catch (Exception e) {
//            e.printStackTrace();
//        } catch (Throwable e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//
//    @Override
//    public void remove(Long id) {
//        Blog blog = findById(id);
//        if (blog != null) {
//            entityManager.remove(blog);
//        }
//    }
//}
