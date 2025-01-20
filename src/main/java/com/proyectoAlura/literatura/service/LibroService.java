package com.proyectoAlura.literatura.service;

import com.proyectoAlura.literatura.model.Idioma;
import com.proyectoAlura.literatura.model.Libro;
import com.proyectoAlura.literatura.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class LibroService {

    private LibroRepository libroRepository;

    @Autowired
    public LibroService(LibroRepository repository) {
        this.libroRepository = repository;
    }

    public LibroService(){};

    public List<Libro> obtenerTodosLosLibros() {
        return libroRepository.findAll();
    }

    public Optional<Libro> obtenerLibroPorNombre(String nombre){
        return libroRepository.obtenerLibroPorNombre(nombre);
    }

    public List<Libro>obtenerLibrosPorIdioma(Idioma idioma){
        return libroRepository.obtenerLibrosPorIdioma(idioma);
    }

    public void guardarLibro(Libro libro){
        libroRepository.save(libro);
    }
}
