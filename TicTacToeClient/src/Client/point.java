/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

/**
 *  x je souřadnice, která vede vodorovně mřížkou
 *  y je souřadnice, která vede svisle mřížkou
 * @author xminks
 */
public class point {

    private final int x;
    private final int y;

    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
