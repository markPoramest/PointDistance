package com.company;

import java.util.List;

class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance() {
        return Math.sqrt(x * x + y * y);
    }
}

public class PointDistance {
    List<Point> points;

    public PointDistance(List<Point> points) {
        this.points = points;
    }

    // find the closest pair of points
    public double getClosestDistance() {
        double minDistance = Double.MAX_VALUE;
        for (int i = 0; i < points.size(); i++) {
            for (int j = i + 1; j < points.size(); j++) {
                double distance = points.get(i).getDistance();
                if (distance < minDistance) {
                    minDistance = distance;
                }
            }
        }
        return minDistance;
    }
}
