package com.shopsimulator.shopsimulator.controller;
import com.shopsimulator.shopsimulator.entity.Bonus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.shopsimulator.shopsimulator.service.BonusService;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/shopsim")
public class BonusController {

    @Autowired
    private BonusService bonusService;

    @PostMapping("/bonus")
    public String saveBonus(@RequestBody Bonus bonus) throws ExecutionException, InterruptedException {
        return bonusService.saveBonus(bonus);
    }

    @DeleteMapping("/bonus/{name}")
    public String deleteBonus(@PathVariable String name) throws ExecutionException, InterruptedException {
        return bonusService.deleteBonus(name);
    }

    @GetMapping("/bonus/{name}")
    public Bonus getBonusDetails(@PathVariable String name) throws ExecutionException, InterruptedException {
        return bonusService.getBonusDetails(name);
    }

    @GetMapping("/bonus")
    public List<Bonus> getAllBonusDetails() throws ExecutionException, InterruptedException {
        return bonusService.getAllBonusDetails();
    }

}
