package com.spring.dao;

import java.util.List;


public interface VehicleDao {
    public void insert(Vehicle vehicle); //seen

    public void update(Vehicle vehicle);//seen

    public void delete(Vehicle vehicle);//seen

    public Vehicle findByVehicleNo(String vehicleNo); //seen

    public List<Vehicle> findAll();//seen

    public String getColor(String vehicleNo);//seen

    public int countAll();//seen
}
