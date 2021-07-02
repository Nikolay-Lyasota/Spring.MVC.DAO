package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    @Autowired
    private CarDao carDao;

    public List<Car> getCars(Integer amount) {
        if (amount == null || amount > 5) {
            amount = 5;
        }
        return carDao.getCars().stream().limit(amount).collect(Collectors.toList());
    }
}
