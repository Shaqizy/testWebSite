package ru.needforsite.gpushop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.needforsite.gpushop.Model.GPU;
import ru.needforsite.gpushop.Service.GPUService;

/**
 * Created by igorfrolov on 04.11.16.
 */
@Controller
public class GPUController {
    private GPUService gpuService;

    @Autowired(required = true)
    @Qualifier(value = "gpuService")
    public void setGpuService(GPUService gpuService){
        this.gpuService = gpuService;
    }

    @RequestMapping(value = "gpus", method = RequestMethod.GET)
    public String listGpus(Model model){
        model.addAttribute("GPU", new GPU());
        model.addAttribute("listGPU", this.gpuService.listGPU());

        return "gpus";
    }

    @RequestMapping(value = "/gpus/add", method = RequestMethod.POST)
    public String addGpu(@ModelAttribute("GPU") GPU gpu){
        if(gpu.getId() == 0){
            this.gpuService.addGPU(gpu);
        }else {
            this.gpuService.updateGPU(gpu);
        }

        return "redirect:/gpus";
    }

    @RequestMapping("/remove/{id}")
    public String removeGpu(@PathVariable("id") int id){
        this.gpuService.removeGPU(id);

        return "redirect:/gpus";
    }

    @RequestMapping("edit/{id}")
    public String editGpu(@PathVariable("id") int id, Model model){
        model.addAttribute("GPU", this.gpuService.getGPUById(id));
        model.addAttribute("listGPU", this.gpuService.listGPU());

        return "gpus";
    }

    @RequestMapping("gpudata/{id}")
    public String gpuData(@PathVariable("id") int id, Model model){
        model.addAttribute("GPU", this.gpuService.getGPUById(id));

        return "gpudata";
    }
}