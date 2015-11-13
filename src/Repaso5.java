import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

/*
 * Autor adrian ponce
 * repaso 5 añade soporte al programra para poder escuchar los clicls de raton
 * lo que hara es cambiar el color de rleleno aleatoraimente de un rectangulo cada vez que pulse un clic
 * 
 * 
 */

public class Repaso5 extends GraphicsProgram {


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
		rectangulo2 = new GRect(340,260);
		//inserto el "escuchador" del raton
		addMouseListeners();



	}


	public void run(){

		//añado el rectangulo en el centro exacto de la pantalla

		add (rectangulo, getWidth()/2 - rectangulo.getWidth()/2, getHeight()/2 - rectangulo.getHeight()/2);
		add(rectangulo2);
	}

	
	//añado el método que escucha el evento del clic del raton
	
	public void mouseClicked(MouseEvent evento){
		
		if (evento.getButton() == MouseEvent.BUTTON1){
		
		rectangulo.setFilled(true);
		rectangulo.setFillColor(aleatorio.nextColor());
		}
	}
	
	
	
}
