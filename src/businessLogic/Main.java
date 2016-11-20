/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import UI.video.VentanaInicio;
import UI.video.*;

public class Main {

    public static int skip = 0;
    public static Intro1 i1 = new Intro1();
    public static Intro2 i2 = new Intro2();
    public static Intro3 i3 = new Intro3();
    public static Intro4 i4 = new Intro4();
    public static Intro5 i5 = new Intro5();
    public static Intro6 i6 = new Intro6();
    public static VentanaInicio inicio = new VentanaInicio();

    public static void main(String[] args) throws InterruptedException {

        i1.setVisible(true);
        Thread.sleep(10000);
        if (skip != 1) {
            i2.setVisible(true);
            Thread.sleep(10000);
            i1.dispose();
            if (skip != 1) {
                i3.setVisible(true);
                i2.dispose();
                Thread.sleep(10000);
                if (skip != 1) {
                    i4.setVisible(true);
                    i3.dispose();
                    Thread.sleep(10000);
                    if (skip != 1) {
                        i5.setVisible(true);
                        i4.dispose();
                        Thread.sleep(12000);
                        if (skip != 1) {
                            i6.setVisible(true);
                            i5.dispose();
                            Thread.sleep(7560);
                            if (skip != 1) {
                                inicio.setVisible(true);
                                i6.dispose();
                            }
                        }
                    }
                }
            }
        } else {
            inicio.setVisible(true);
        }
    }

    public void mostrarInicio() {
        i1.dispose();
        i2.dispose();
        i3.dispose();
        i4.dispose();
        i5.dispose();
        i6.dispose();

    }

}
