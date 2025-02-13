package se.rajo.cat_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.rajo.cat_api.model.Cat;
import se.rajo.cat_api.service.CatService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cats")
public class CatController {
    private final CatService catService;

    @Autowired
    public CatController(CatService catService){
        this.catService = catService;
    }

    @GetMapping
    public List<Cat> getAllCats (){
        return catService.getAllCats();
    }

    @GetMapping("/{id}")
    public Cat getCatById(@PathVariable int id){
        return ResponseEntity.ok().body(catService.getCatById(id)
        ).getBody();
    }

    @PostMapping("/")
    public Cat createCat(@RequestBody Cat cat){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(catService.createCat(cat))
                .getBody();
    }

    @PutMapping("/{id}")
    public Cat updateCat(@RequestBody Cat cat, @PathVariable int id){
        return ResponseEntity.ok().body(
                catService.updateCat(cat, id))
                .getBody();
    }
    @DeleteMapping("/{id}")
    public void deleteCat(@PathVariable int id) {
        catService.deleteCat(id);
    }
}
