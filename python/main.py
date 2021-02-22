from car import Car
from account import Account

if __name__=="__main__":
    print("Hola Mundo con Python")

    car = Car("AMDS-1234", Account("Andres Herrera", "AEHS3456"))
    print(vars(car))
    print(vars(car.driver))