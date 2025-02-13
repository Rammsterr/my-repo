package se.rajo.cat_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.rajo.cat_api.model.Cat;
import se.rajo.cat_api.repository.CatRepository;

import java.util.List;

@Service
public class CatService {
    private final CatRepository catRepository;

    @Autowired // Detta används inte i senare lektioner
    public CatService(CatRepository catRepository){
    this.catRepository = catRepository;
    }

    public List<Cat> getAllCats(){
        return catRepository.findAll();
    }

    public Cat getCatById(int id) {
        return catRepository.findById(id).orElse(null); // orElseThrow
    }

    public Cat createCat (Cat cat) {
        return catRepository.save(cat);
    }

    public Cat updateCat (Cat cat, int id) {
        Cat existingCat = catRepository.findById(id).orElse(null);
        if(existingCat != null) {
            existingCat.setName(cat.getName());
            existingCat.setBreed(cat.getBreed());
            return catRepository.save(existingCat);

        }
        return null;
    }
    public void deleteCat (int id){
        catRepository.deleteById(id);
    }
}
