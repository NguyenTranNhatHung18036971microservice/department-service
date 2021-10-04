package khoa.service.controller;

import khoa.service.entity.Khoa;
import khoa.service.service.KhoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/khoa")
public class KhoaController {
    @Autowired
    private KhoaService khoaService;

    @PostMapping("/save")
    public Khoa saveKhoa(@RequestBody Khoa khoa){
        return khoaService.saveKhoa(khoa);
    }
    @GetMapping("/get")
    public List<Khoa> getAllKhoa(){
        return khoaService.getAllKhoa();
    }
    @GetMapping("/{id}")
    public Khoa findKhoaById(@PathVariable("id") Long id){
        return khoaService.getKhoaById(id);
    }

    @PutMapping("/update/{id}")
    public Khoa updateKhoa(@PathVariable("id") Long id,@RequestBody Khoa khoa){
        return khoaService.updateKhoa(id,khoa);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteKhoa(@PathVariable("id") Long id){
        khoaService.deleteKhoa(id);
        return "delete successfully";
    }

}
