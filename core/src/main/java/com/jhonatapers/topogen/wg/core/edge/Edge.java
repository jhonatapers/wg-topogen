package com.jhonatapers.topogen.wg.core.edge;

public class Edge {

    private Endpoint source;
    private Endpoint target;
    private Direction direction;

    public Edge(Endpoint source, Endpoint target, Direction direction) {
        this.source = source;
        this.target = target;
        this.direction = direction;
    }

    public Endpoint getSource() {
        return source;
    }

    public Endpoint getTarget() {
        return target;
    }

    public Direction getDirection() {
        return direction;
    }

}
