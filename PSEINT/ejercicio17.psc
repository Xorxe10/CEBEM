SubProceso ordenar(vec)
	band <- falso
	Mientras band = falso Hacer
			/**/
		Fin Mientras
	FinSubProceso
	
	Proceso OrdenamientoBurbuja
		Dimension vec[10]
		rellenarArrayConValoresAleatorios(vec)
		Escribir 'numeros sin ordenar'
		mostrarArray(vec)
		ordenar(vec)
		Escribir 'numeros ordenados'
		mostrarArray(vec)
	FinProceso