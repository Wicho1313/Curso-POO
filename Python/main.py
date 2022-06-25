from car import Car
from account import Account

if __name__ =="__main__":
    car = Car("sdas12", Account("Andres Herrera","xv3341"))

    print(vars(car))
    print(vars(car.driver))