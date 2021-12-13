/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedro.ieslaencanta.com.dawpingpong.modelo;

/**
 *
 * @author Pedro
 */

public class Campo {

   
    private static int width, height;
    private Barra barraizquierda, barraderecha;
    private Pelota pelota;
    private int borde = 10;
    private int marcador1,marcador2;

    public Campo(int anchopixels, int altopixels) {
          this.pelota = new Pelota(new Coordenada2D(anchopixels / 2 -5, altopixels / 2 -5), 20);
      }
    private void initPelota(){
     
    }
    public boolean detectarColisionBarraDerecha() {
        boolean colision = false;
       
        return colision;
    }

    public boolean detectarColisionBarraIzquierda() {
        boolean colision = false;
       
        return colision;
    }

    public void cambiarAnguloColisionBarraIzquierda() {
       
        
    }

    public void cambiarAnguloColisionBarraDerecha() {
       
  


    }
    
    public void moverPelota() {
        this.pelota.mover();
      
    }
    public void moverBarraIzquierdaArriba(){
      
    }
    
    public void moverBarraIzquierdaAbajo(){
       
    }
    public void moverBarraDerechaArriba(){
       
    }
    public void moveBarraDerechaAbajo(){
      
    }
    public void rotateX() {
       
    }
    public void setVelocidad(float velocidad){
        this.pelota.setVelocidad(velocidad);
    }
    public float getVelocidad(){
        return this.pelota.getVelocidad();
    }
    /**
     * @return the barraizquierda
     */
    public Barra getBarraizquierda() {
        return barraizquierda;
    }

    /**
     * @return the barraderecha
     */
    public Barra getBarraderecha() {
        return barraderecha;
    }

    /**
     * @return the pelota
     */
    public Pelota getPelota() {
        return pelota;
    }


    /**
     * @return the borde
     */
    public int getBorde() {
        return borde;
    }

    /**
     * @return the width
     */
    public static int getWidth() {
        return width;
    }

    /**
     * @return the height
     */
    public static int getHeight() {
        return height;
    }

    /**
     * @param aWidth the width to set
     */
    public static void setWidth(int aWidth) {
        width = aWidth;
    }

    /**
     * @param aHeight the height to set
     */
    public static void setHeight(int aHeight) {
        height = aHeight;
    }

    /**
     * @param borde the borde to set
     */
    public void setBorde(int borde) {
        this.borde = borde;
    }

    /**
     * @param barraizquierda the barraizquierda to set
     */
    public void setBarraizquierda(Barra barraizquierda) {
        this.barraizquierda = barraizquierda;
    }

    /**
     * @param barraderecha the barraderecha to set
     */
    public void setBarraderecha(Barra barraderecha) {
        this.barraderecha = barraderecha;
    }
}
