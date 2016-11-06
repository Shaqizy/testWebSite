package ru.needforsite.gpushop.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.needforsite.gpushop.Dao.GPUDao;
import ru.needforsite.gpushop.Model.GPU;

import java.util.List;

/**
 * Created by igorfrolov on 04.11.16.
 */
@Service
public class GPUServiceImpl implements GPUService {

    private GPUDao gpuDao;

    public void setGpuDao(GPUDao gpuDao) {
        this.gpuDao = gpuDao;
    }

    @Override
    @Transactional
    public void addGPU(GPU gpu) {
        this.gpuDao.addGPU(gpu);
    }

    @Override
    @Transactional
    public void updateGPU(GPU gpu) {
        this.gpuDao.updateGPU(gpu);
    }

    @Override
    @Transactional
    public void removeGPU(int id) {
        this.gpuDao.removeGPU(id);
    }

    @Override
    @Transactional
    public GPU getGPUById(int id) {
        return this.gpuDao.getGPUById(id);
    }

    @Override
    @Transactional
    public List<GPU> listGPU() {
        return this.gpuDao.listGPU();
    }
}
