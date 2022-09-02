package com.company;

import java.util.List;

class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
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
                double distance = getDistance(points.get(i), points.get(j));
                if (distance < minDistance) {
                    minDistance = distance;
                }
            }
        }
        return minDistance;
    }

    // find the distance between two points
    public double getDistance(Point p1, Point p2) {
        double xDiff = p1.getX() - p2.getX();
        double yDiff = p1.getY() - p2.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}
