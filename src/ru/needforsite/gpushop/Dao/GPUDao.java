package ru.needforsite.gpushop.Dao;

import ru.needforsite.gpushop.Model.GPU;

import java.util.List;

/**
 * Created by igorfrolov on 04.11.16.
 */
public interface GPUDao {

    public void addGPU(GPU gpu);

    public void updateGPU(GPU gpu);

    public void removeGPU(int id);

    public GPU getGPUById(int id);

    public List<GPU> listGPU();
}
