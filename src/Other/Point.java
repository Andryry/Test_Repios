package Other;

import java.util.Objects;

public class Point {
    int y;
    int x;

    public Point(int y, int x) {
        this.y = y;
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {
       if (this == o){
           return true;
       }
       if (o == null || this.getClass()!= o.getClass()) {
           return false;
       }
       Point point = (Point) o;
       return this.x == point.x && this.y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(y, x);
    }
}
