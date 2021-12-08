package com.example.demo.controller;


import com.example.demo.dto.MenuDto;
<<<<<<< HEAD
import com.example.demo.model.Menu;
import com.example.demo.service.MenuService;
import com.example.demo.service.ProfilService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
=======
import com.example.demo.dto.ProfilMenu;
import com.example.demo.model.Menu;
import com.example.demo.model.Profil;
import com.example.demo.repository.MenuRepository;
import com.example.demo.service.MenuService;
import com.example.demo.service.ProfilService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
>>>>>>> 8c493b383944aaf7cef5c17ad6eb5d1afec31270

@RestController
@RequestMapping("api")
@CrossOrigin(origins = "*", maxAge = 3600, allowedHeaders = "*")
@AllArgsConstructor
public class MenuController {
    private final MenuService menuService;
    private final ProfilService profilService;


    @GetMapping("/menus")
    public List<Menu> getAllMenus() {
        return menuService.getListMenu();
    }


    @PostMapping("/menus")
    public Menu newMenu(@RequestBody MenuDto menuDto) {
        return menuService.createMenu(menuDto);
    }

    @PutMapping("/menus/{id}")
    public Menu updateMenu(@PathVariable(value = "id") Long id, @RequestBody Menu menu) {
        Menu updatedMenu = menuService.getMenuById(id);
        updatedMenu.setId(menu.getId());
        updatedMenu.setLibelle(menu.getLibelle());
        updatedMenu.setIcon(menu.getIcon());
        updatedMenu.setCode(menu.getCode());
        updatedMenu.setRoute(menu.getRoute());
        updatedMenu.setParent_Id(menu.getParent_Id());
        updatedMenu.setPriorite(menu.getPriorite());
        updatedMenu.setProfil_id(menu.getProfil_id());
        return menuService.updateMenu(id, updatedMenu);
    }

    @GetMapping("/getInfo/{id}")
<<<<<<< HEAD
    public List<Menu> getInfo(@PathVariable Long id){
            return menuService.getMenuByProfil(id);
=======
    public List<ProfilMenu> getInfo(@PathVariable Long id){
            return menuService.getJoinInformation(id);
>>>>>>> 8c493b383944aaf7cef5c17ad6eb5d1afec31270
        }

        @GetMapping("/menus/{id}")
    public Menu getMenuById(@PathVariable(value = "id") Long id) {
        return menuService.getMenuById(id);
    }

    @DeleteMapping("/menus/{id}")
    public void deleteMenu(@PathVariable(value = "id") Long id) {
        menuService.deleteMenuById(id);
    }
    }
