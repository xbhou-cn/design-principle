package xb.hou.promote;

/**
 * 抽出共通，每次拓展不用修改代码
 *
 * @author HZ
 */
public class ChartDisplay {
    public void display(Chart chart) {
        chart.display();
    }

    public static void main(String[] args) {
        new ChartDisplay().display(new PieChart());
    }
}

/**
 * 抽取共通
 */
interface Chart {
    void display();
}

class PieChart implements Chart {
    @Override
    public void display() {
        System.out.println("饼图展示");
    }
}

class BarChart implements Chart {
    @Override
    public void display() {
        System.out.println("柱状图展示");
    }
}