import acm.program.*;

public class EjerciciosCoding extends ConsoleProgram {

	//	Cuando	las	ardillas	se	reúnen	para	una	fiesta,	les	gusta	tener	bellotas.	Una	
	//	fiesta	de	ardillas	tiene	éxito	cuando	el	número	de	bellotas	es	de	entre	40	y	60,	
	//	ambos	inclusive.	A	menos	que	sea	el	fin	de	semana,	en	cuyo	caso	no	hay	limite	de	
	//	bellotas.	
	//	Crea	una	función	llamada	fiestaArdillas	que	reciba	como	parámetro	el	número	de	
	//	bellotas	y	si	es	fin	de	semana	o	no,	y	que	devuelva	true	si	la	fiesta	con	los	valores	
	//	dados	tiene	éxito,	o	false	en	caso	contrario

	//	fiestaArdillas (30,	false)	 falsa	
	//	fiestaArdillas (50,	false)	 verdadera	
	//	fiestaArdillas (70,	true)	 verdadera

	public boolean ardilla(int bellota, boolean festivo) {

		if (!festivo && (bellota >= 40 && bellota <= 60) ){
			return true;
		}
		if (festivo ){
			return true;
		}
		return false;
	}

	//	Estás	conduciendo	demasiado	rápido,	y	un	policía	te	detiene.	Escribir	el	código	
	//	para	calcular	el	resultado,	codificado	como	un	valor	int:	
	//	0	=	sin	multa,	
	//	1	=	multa	pequeña,	
	//	2	=	multa	grande.
	//	Si	la	velocidad	es	de	60	o	menos,	el	resultado	es	0	
	//	Si	la	velocidad	es	de	entre	61	y	80	inclusive,	el	resultado	es	1	
	//	Si	la	velocidad	es	81	o	más,	el	resultado	es	2	
	//	a	menos	que	sea	tu	cumpleaños	:	en	ese	día,	tu	velocidad	puede	ser	5	puntos	
	//	superior	en	todos	los	casos.	
	//	Crea	una	función	llamada	multa	que	reciba	como	parámetro	la	velocidad	del	coche		
	//	y	si	es	tu	cumpleaños	o	no,	y	que	devuelva	el	valor	correspondiente
	//	multa (60,	false)	 0	
	//	multa (65,	false)	 1	
	//	multa (65,	true)	 0

	public int poli(int velocidad, boolean cumple) {
		if (cumple){
			if (velocidad <=65 )
				return 0;
			if (velocidad <= 85){
				return 1;
			}else{
				return 2;
			}
		}
		if(!cumple) {
			if (velocidad <=60 )
				return 0;
			if (velocidad <= 80){
				return 1;
			}else{
				return 2;
			}	
		}
		return 0;
	}

	//	Diremos	que	un	número	es	muy	vanidoso	si	se	trata	de	un	múltiplo	de	11	o	si	
	//	es	uno	más	de	un	múltiplo	de	11.	Devuelve	true	si	el	número	no	negativo	dado	es	
	//	muy	vanidoso.	(Utiliza	el	operador	"mod"		%	)
	//	muyVanidoso (22)	 verdadera	
	//	muyVanidoso (23)	 verdadera
	//	muyVanidoso (24)	 falsa

	public  boolean muyVanidoso(int valor){
		if ((valor%11)<2){
		return true;
		}
		return false;
	}
	
	
//	Suena	tu	móvil.	Crea	una	función	que	devuelva true	si	debes responder.	
//	Normalmente	sí	contestas,	salvo	por	la	mañana, que	sólo	respondes	si	es	tu	madre.	
//	En	todos	los	casos,	si	estás	dormido,	no	contestas.	
//	contesta(boolean	matinal,	boolean	madre,	boolean	dormido)
//	contesta (falso,	falso,	falso)	 verdadera	
//	contesta (falso,	false,	true)	 falsa	
//	contesta (true,	false,	false)	 falsa

	public boolean contesta(boolean	matinal,boolean	madre,boolean dormido){
		
		if  (matinal && !madre){
			return false;
		}
		if (dormido){
			return false;
	
		}
		if (matinal && madre){
			return true;
			}
		return true;
	}
	
//	Dados	tres	enteros,	a b c,	crea	una	función	que	devuelva true	si	uno	de	ellos	es	
//	10	menos	que	uno	de	los	otros.	
//	menorPor10 (1,	7,	11)	 verdadera	
//	menorPor10 (1,	7,	10)	 falsa	
//	menorPor10 (11,	1,	7)	 verdadera
	
	public boolean menorPor10(int a, int b, int c){
		return true;
	}


	public void run(){
		println("ejercicio 1");
		println(ardilla(30, false));
		println(ardilla(50, false));
		println(ardilla(70, true));
		println("ejercicio 2");
		println(poli(60, false));
		println(poli(65, false));
		println(poli(65, true));
		println("ejercicio 3");
		println(muyVanidoso(22));		
		println(muyVanidoso(23));	
		println(muyVanidoso(24));	
		println("ejercicio 4");
		println(contesta( false, false, false));
		println(contesta( false, false, true));
		println(contesta( true, false,	false));
		println("ejercicio 5");
		println(menorPor10(1, 7, 11));
		println(menorPor10(1, 7, 10));
		println(menorPor10(11, 1, 7));
	}

}
