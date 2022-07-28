package project.fahiru.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.fahiru.repository.FahesRepository;

@Service
@RequiredArgsConstructor
public class FahesServiceImpl implements FahesService{

    private final FahesRepository fahesRepository;

}
