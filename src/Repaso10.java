import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

/*
 * Autor adrian ponce
 * repaso 10
 * hacer el cuadrado se mueva hacia los lados
 * 
 * 
 */

public class Repaso10 extends GraphicsProgram {


	//declaro una varible de instancia para almacenar el rectangulo
	//como es de instancia, se ve desde el ini y desde el run
	GRect rectangulo;
	GRect rectangulo2;


	//declaro una variable de tipo aleatorio 
	RandomGenerator aleatorio = new RandomGenerator();

	public void init(){
		//cambiamos el tamaño de la pantalla
		setSize(800,600);
		//creo el rectangulo de 120 de acho por 80 alto
		rectangulo = new GRect(120,80);
		rectangulo2 = new GRect(0,0);
		//inserto el "escuchador" del raton
		addMouseListeners();



	}


	public void run(){

		//añado el rectangulo en el centro exacto de la pantalla

		add (rectangulo, getWidth()/2 - rectangulo.getWidth()/2, getHeight()/2 - rectangulo.getHeight()/2);
		//add(rectangulo2);
	}


	//añado el método que escucha el evento del clic del raton

	public void mouseClicked(MouseEvent evento){
		// si en la psocicion dentro del rectangulo se cambie de collor

		// GObject choque = null;	
		// choque = getElementAt(rectangulo.getWidth(),rectangulo.getHeight());		
		// if (choque != rectangulo){

		if (getElementAt( evento.getX(), evento.getY()) == rectangulo){

			//	int  altoCirculo = aleatorio.nextInt(20);
			//	int posicion = aleatorio.nextInt(800);
			//			GRect rectangulo3 = new GRect (aleatorio.nextInt(200) , aleatorio.nextInt(200) );
			//			rectangulo3.setFilled(true);
			//			rectangulo3.setFillColor(aleatorio.nextColor());

			rectangulo.setFilled(true);
			rectangulo.setFillColor(aleatorio.nextColor());
			double distanciaAlCentroDelRectangulo = evento.getX()- rectangulo.getX();	
			double distanciaAlAlturaDelRectangulo = evento.getY()- rectangulo.getY();	

			if ((distanciaAlAlturaDelRectangulo < rectangulo.getHeight()/2)){
				if  ( (distanciaAlCentroDelRectangulo > rectangulo.getWidth()/2) ){

					rectangulo.move(20, -20);
				}else{
					rectangulo.move(-20, -20);
				}
			}
<<<<<<< HEAD
			
					// test
			if  ( distanciaAlCentroDelRectangulo < rectangulo.getWidth()/2 && distanciaAlAlturaDelRectangulo > rectangulo.getHeight()/2 ) {
				
				rectangulo.move(-20, -20);
				
			}else
			{
				rectangulo.move(-20,20);
=======
			if ((distanciaAlAlturaDelRectangulo > rectangulo.getHeight()/2)){
				if  ( (distanciaAlCentroDelRectangulo > rectangulo.getWidth()/2) ){

					rectangulo.move(20, 20);
				}else{
					rectangulo.move(-20, 20);
				}

>>>>>>> origin/master
			}



			//add(rectangulo3,aleatorio.nextInt(getWidth()), aleatorio.nextInt(getHeight()));
		}
	}



}
