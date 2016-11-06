package ru.needforsite.gpushop.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import ru.needforsite.gpushop.Model.GPU;

import java.util.List;

/**
 * Created by igorfrolov on 04.11.16.
 */
@Repository
public class GPUDaoImpl  implements GPUDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addGPU(GPU gpu) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(gpu);
    }

    @Override
    public void updateGPU(GPU gpu) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(gpu);
    }

    @Override
    public void removeGPU(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        GPU gpu = (GPU) session.load(GPU.class, new Integer(id));
        if (gpu!=null){
            session.delete(gpu);
        }
    }

    @Override
    public GPU getGPUById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        GPU gpu = (GPU) session.load(GPU.class, new Integer(id));
        return gpu;
    }

    @Override
    public List<GPU> listGPU() {
        Session session = this.sessionFactory.getCurrentSession();
        List<GPU> gpuList = session.createQuery("from GPU").list();
        for (GPU gpu: gpuList){
        }
        return gpuList;
    }
}

