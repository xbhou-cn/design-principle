package xb.hou;
/**
 * 每一次新增一个图表类，都要修改ChartDisplay的display方法，违反开闭原则
 *
 * @author HZ
 */
public class ChartDisplay {
    public void display(String type) {
        if ("pie".equals(type)) {
            new PieChart().display();
        } else if ("bar".equals(type)) {
            new BarChart().display();
        }
    }

    public static void main(String[] args) {
        new ChartDisplay().display("bar");
    }
}

class PieChart {
    public void display() {
        System.out.println("饼图展示");
    }
}

class BarChart {
    public void display() {
        System.out.println("柱状图展示");
    }
}