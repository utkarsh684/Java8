package com.example.nice.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nice.entity.journalEntry;





@RestController
@RequestMapping("/journal")
public class journalEntryController {
    
    private Map<Long, journalEntry> map=new HashMap<>();

    @GetMapping("/get")
    public List<journalEntry> getAll(){
        return new ArrayList<>(map.values());
    }

    @PostMapping
    public boolean postAll(@RequestBody journalEntry myEntry){

        map.put(myEntry.getId(),myEntry);
        return true;

    }

    @GetMapping("/id/{myid}")
    public journalEntry getById(@PathVariable Long myid){

        return map.get(myid);

    }

    @DeleteMapping("/id/{myid}")
    public journalEntry deleteById(@PathVariable Long myid){
        return map.remove(myid);
    }

    @PutMapping("/id/{id}")
    public journalEntry updateById(@PathVariable Long id, @RequestBody journalEntry entry){
        return map.put(id, entry);
    }
    

}
