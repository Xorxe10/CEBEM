Algoritmo ConjeturadeCollatz
	Escribir 'Ingresa un n�mero'
	Leer numero
	Si numero % 2 = 0 Entonces
		numero <- trunc(numero/2)
		Escribir numero
	SiNo
		numero <- numero*3+1
		Escribir numero
	Fin Si
FinAlgoritmo
