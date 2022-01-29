package com.kevin.dojoninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevin.dojoninjas.models.Dojo;
import com.kevin.dojoninjas.models.Ninja;
import com.kevin.dojoninjas.repositories.DojoRepository;
import com.kevin.dojoninjas.repositories.NinjaRepository;

@Service
public class dojoninjasService {
@Autowired
private DojoRepository dRepo;
@Autowired
private NinjaRepository nRepo;

public List<Dojo> allDojos() {
	return this.dRepo.findAll();
}

public Dojo createDojo(Dojo dojo) {
	return this.dRepo.save(dojo);
}

public Ninja createNinja(Ninja ninja) {
	return this.nRepo.save(ninja);
}

public Dojo getOneDojo(Long id)  {
	return this.dRepo.findById(id).orElse(null);
}
}
