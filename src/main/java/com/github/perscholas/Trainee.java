package com.github.perscholas;

/**
 * Created by leon on 6/10/2020.
 */
public class Trainee extends AbstractEmployee {

    // TODO - Ensure that each of the arguments passed through the constructor are assigned to a respective instance variable
    public Trainee(Long id, String name, String address, Long phoneNumber, Double basicSalary) {
        super(id,name,address,phoneNumber,basicSalary,250.8,1000.5);
    }

    // TODO - Modify to ensure the respective test case passes
    public  Trainee() {
        super();
    }



    @Override
    public void calculateSalary() {

    }
}
