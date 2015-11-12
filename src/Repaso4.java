import acm.graphics.*;
import acm.program.GraphicsProgram;

/*
 * Autor adrian ponce
 * Laclase repaso 3 tiene que dibujar un rectángulo
 * esquina superior en el centro  del centro de la pantalla en el lado superior de la pantalla
 * 
 */

public class Repaso4 extends GraphicsProgram {
	
	
	//declaro una varible de instancia para almacenar el rectangulo
	//como es de instancia, se ve desde el ini y desde el run
	GRect rectangulo;
	
	//declaro otra varible de  instancia que guardará el punto x de la pantalla en el que empezara a empezar a pintarse el rectnagulo
	
	double distanciaX;
	double distanciaY;
	
	public void init(){
		//cambiamos el tamaño de la pantalla
		setSize(400,400);
		//creo el rectangulo de 120 de acho por 80 alto
		rectangulo = new GRect(160,80);
		add (rectangulo);
		
	}
	
	
	public void run(){
		distanciaX = getWidth()/2 - rectangulo.getWidth()/2 ;
		distanciaY= getHeight()/2 - rectangulo.getHeight()/2;
		rectangulo.setLocation(distanciaX , distanciaY );
	}

}
