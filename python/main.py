from car import Car

if __name__=="__main__":
    print("Hola Mundo con Python")
    carro1 = Car()
    carro1.license = "AMS234"
    carro1.driver = "Hector Lara"
    print(vars(carro1))

    carro = Car()
    carro.driver = "Raul  Lara"
    carro.license = "asdf-1234"
    print(vars(carro))