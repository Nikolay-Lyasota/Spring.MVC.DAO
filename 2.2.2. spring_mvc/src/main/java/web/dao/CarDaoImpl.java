package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.Model.Car;

import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    @Autowired
    private List<Car> repo;

    @Override
    public List<Car> getCars() {
        return repo;
    }
}
