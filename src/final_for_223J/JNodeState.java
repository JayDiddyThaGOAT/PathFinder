package final_for_223J;

import java.awt.*;

public enum JNodeState {
    EMPTY(Color.white), WALL(Color.blue),
    START(Color.green), END(Color.red),
    VISITED(Color.yellow), ERROR(new Color(204, 0, 0));

    private Color color;
    JNodeState(Color _color)
    {
        color = _color;
    }

    public Color getColor(){ return color;}
}


