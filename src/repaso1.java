/*
 * Repaso 1 pinta un rectangulo en la esquina superior izquierda
 */

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class repaso1 extends GraphicsProgram{

	//declaro una variable instancia para guardar el rectángulo
	GRect rectangulo;

	// recuerda que init se ejecuta simpre antes que el run

	public void init(){
		setSize(800,600);
		rectangulo = new GRect (120,80);
	}


	public void run(){
		//añado el objeto al lienzo para que se muestre 
		//Si no especifico la posicion , aprece en 0,0
		add(rectangulo);

	}

}
