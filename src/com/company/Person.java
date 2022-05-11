package com.company;

public class Person {
    //Implement the `Person` abstract class. It should contain:
    //
    //* two String fields: `name`, `address`
    //* non-arguments constructor which will set `name`, `address` fields as empty strings
    //* two-arguments constructor: `String name`, `String address`
    //* `getter` methods which will be responsible for returning `name`, `address` fields values
    //* `setter` methods which will be responsible for setting `name`, `address` fields values
    //* `toString` method which should return string in the following format: `?->?`, where `?` is the name and adress value accordingly
    //
    //Person{name= ?, address= ?}
    //
    //name-> ?, address-> ?
    //? means variable name and address accordingly
    //
    //Implement the `Student` class. It should extend the `Person` class. Implementation should meet the below criteria:
    //
    //* three fields: type of study, year of study, study price
    //* three-arguments constructor: type of study, year of study, study price
    //* `getter` methods which will be responsible for returning declared fields
    //* `setter` methods which will be responsible for setting declared fields
    //* `toString` method which should return details information about a student
    //
    //Implement the `Lecturer` class. It should extend the `Person` class. Implementation should meet the below criteria:
    //
    //* two fields: specialization, salary
    //* two-arguments constructor: specialization, salary
    //* `getter` methods which will be responsible for returning declared fields
    //* `setter` methods which will be responsible for setting declared fields
    //* `toString` method which should return detials information about a lecturer
    //
    //Please provide an example usage of above implementation.

    String name, address;
    Person() {
        this.name = "";
        this.address = "";
    }

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "name->" + name + "address->" + address;
    }
}

