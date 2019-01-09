"""
Haz un programa en Java y Python que calcule el combinatorio de dos números. 
Si hay un error en la introducción debe indicarlos.

autor:José Sillero Salado
"""

numero1 = int(input("Introduce un numero"))
numero2 = int(input("Introduce un numero menor que el anterior"))

while numero1<=numero2:
    numero1 = int(input("Introduce un numero"))
    numero2 = int(input("Introduce un numero menor que el anterior"))
    if numero1<=numero2:
        print("ERROR:el segundo numero tiene que ser menor que el primero.")


numerom=numero1-numero2;

fac1=0

for i in range(numero1):    
    if fac1==0:
        fac1=numero1*(numero1-1-i)
    elif (numero1-1-i)!=0:
        fac1=fac1*(numero1-1-i)

fac2=0

for i in range(numero2):    
    if fac2==0:
        fac2=numero2*(numero2-1-i)
    elif (numero2-1-i)!=0:
        fac2=fac2*(numero2-1-i)
 
facm=0
        
for i in range(numerom):    
    if facm==0:
        facm=numerom*(numerom-1-i)
    elif (numerom-1-i)!=0:
        facm=facm*(numerom-1-i)
        
combinatorio=(fac1/(fac2*facm))

print("El combinatorio es ", combinatorio)        
        

        