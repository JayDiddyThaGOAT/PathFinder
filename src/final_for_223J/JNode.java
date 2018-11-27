package final_for_223J;

import javax.swing.*;
import java.util.*;

public class JNode extends JButton {
    private int row, col;
    private JNodeState state;
    private JNode previous;
    private int gCost, hCost, fCost;

    public JNode(int _row, int _col, JNodeState _state) {
        super();
        setBackground(_state.getColor());

        row = _row;
        col = _col;
        state = _state;

        previous = null;
        gCost = 0; //Distance to start node
        hCost = 0; //Distance to end node
        fCost = 0; //gCost + hCost
    }


    public JNode(int _row, int _col){
        this(_row, _col, JNodeState.EMPTY);
    }

    public void setState(JNodeState _state){
        if (state == _state) return;
        state = _state;
        setBackground(state.getColor());
    }

    public void setPrevious(JNode _previous){ previous = _previous;}

    public void setG(int g)
    {
        gCost = g;
    }

    public void setH(int h)
    {
        hCost = h;
    }

    public void setF()
    {
        fCost = gCost + hCost;
    }

    public JNodeState getState(){ return state; }
    public JNode getPrevious(){ return previous;}
    public int getRow(){ return row;}
    public int getCol(){ return col; }
    public int getG(){ return gCost; }
    public int getH(){ return hCost; }
    public int getF(){ return fCost; }

    public String toString()
    {
        return "(" + row + ", " + col + ")";
    }

    public boolean equals(Object o)
    {
        if (o == this)
            return true;

        if (!(o instanceof JNode))
            return false;

        JNode c = (JNode)o;

        boolean sameRow = row == c.getRow();
        boolean sameCol = col == c.getCol();
        return sameRow && sameCol;
    }
}
