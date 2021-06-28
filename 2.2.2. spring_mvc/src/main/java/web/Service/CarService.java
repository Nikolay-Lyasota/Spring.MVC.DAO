package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.Model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    @Autowired
    private List<Car> repo;

    public List<Car> getCars(int carsCount) {
        return repo.stream().limit(carsCount).collect(Collectors.toList());
    }
}
