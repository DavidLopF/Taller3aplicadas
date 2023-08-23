num1 = 0
num2 = 0

try:
    num1 = int(input("Ingrese el primer numero: "))
    num2 = int(input("Ingrese el segundo numero: "))

    if num1 == 0 or num2 == 0:
        print("El factorial de 0 es 1")
    else:
        factorial = 1
        for i in range(1, num1 + 1):
            factorial = factorial * i

        if factorial == num2:
            print("SI")
        else:
            print("NO")
except:
    print("Ingrese solo numeros")
