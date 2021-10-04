package khoa.service.service;

import khoa.service.entity.Khoa;
import khoa.service.repository.KhoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class KhoaService {
    @Autowired
    private KhoaRepository khoaRepository;

    

    public Khoa saveKhoa(Khoa khoa){
       return khoaRepository.save(khoa);
    }
    public List<Khoa> getAllKhoa(){
        return khoaRepository.findAll();
    }
    public Khoa getKhoaById(Long id){
        return khoaRepository.findById(id).get();
    }

    public void deleteKhoa(Long khoaId){
        khoaRepository.deleteById(khoaId);
    }

    public Khoa updateKhoa(Long khoaId, Khoa khoa) {
        Khoa khoaFormDB =  khoaRepository.findById(khoaId).get();
        khoaFormDB.setKhoaName(khoa.getKhoaName());
        khoaRepository.save(khoaFormDB);
        return khoaFormDB;
    }

}
