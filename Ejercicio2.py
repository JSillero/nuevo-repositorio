'''
Created on 16 nov. 2018
2.- Haz un programa en Java y Python que calcule el elemento N (se pide al usuario) de la serie de Fibonacci.

@author: d18sisaj
'''
fib=1 
fibant=0 
aux=0
posicion = int(input("Introduce la posicion de la sucecison de Fibonacci deseada: "))

for i in range(posicion-1):
    aux=fib
    fib=fib+fibant
    fibant=aux
    
print("El  numero en la posicion ",posicion," de la sucesion de Fibonacci es:  ",fib) 