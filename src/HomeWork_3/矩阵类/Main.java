package HomeWork_3.矩阵类;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat d = new DecimalFormat("#");
        Scanner cin = new Scanner(System.in);
        Matrix matrix = new Matrix(cin.nextInt(), cin.nextInt());
        Matrix t; // 暂存矩阵
        matrix.input(cin); // 输入信息
        System.out.println("row:" + matrix.height() + " " + "column:" + matrix.width());
        matrix.set(cin.nextInt(), cin.nextInt(), cin.nextDouble());
        System.out.println("after set value:");
        System.out.print(matrix.toString());
        int r = cin.nextInt();
        int c = cin.nextInt();
        System.out.println("value on (" + r + "," + c + "):" + d.format(matrix.get(r, c)));
        Matrix tmp = new Matrix(cin.nextInt(), cin.nextInt());
        tmp.input(cin);
        System.out.println("after add:");
        t = matrix.add(tmp);
        t.print();
        System.out.println("矩阵中的最大值：" + t.getMax());
        System.out.println("after multiply:");
        tmp = new Matrix(cin.nextInt(), cin.nextInt());
        tmp.input(cin);
        t = matrix.multiply(tmp);
        t.print();
        System.out.println("矩阵中的最大值：" + t.getMax());
        System.out.println("after transpose:");
        t = matrix.transpose();
        t.print();
        System.out.println("矩阵中的最大值：" + t.getMax());
    }
}

class Matrix {
    private int row, col;
    private double[][] d;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        d = new double[row][col];
    }

    public void input(Scanner cin) {
        for (int i = 1; i <= this.row; i++) {
            for (int j = 1; j <= this.col; j++) {
                double val = cin.nextDouble();
                this.set(i, j, val);
            }
        }
    }

    // 将第row行第col列的元素赋值为value
    public void set(int row, int col, double value) {
        d[--row][--col] = value;
    }

    // 取第row行第col列的元素
    public double get(int row, int col) {
        return d[--row][--col];
    }

    // 返回矩阵的列数
    public int width() {
        return col;
    }

    // 返回矩阵的行数
    public int height() {
        return row;
    }

    // 返回当前矩阵与矩阵b相加后的矩阵
    public Matrix add(Matrix b) {
        Matrix t = new Matrix(this.row, this.col);

        for (int i = 1; i <= this.row; ++i) {
            for (int j = 1; j <= this.col; ++j) {
                t.set(i, j, this.get(i, j) + b.get(i, j));
            }
        }
        return t;
    }

    // 返回当前矩阵与矩阵b相乘后的矩阵
    public Matrix multiply(Matrix b) {
        Matrix t = new Matrix(this.row, b.width());

        for (int i = 1; i <= this.row; ++i) {
            for (int j = 1; j <= b.width(); ++j) {
                double tt = 0;
                for (int k = 1; k <= this.col; k++) {
                    tt += this.get(i, k) * b.get(k, j);
                }
                t.set(i, j, tt);
            }
        }
        return t;
    }

    // 返回当前矩阵的转置矩阵
    public Matrix transpose() {
        Matrix t = new Matrix(this.row, this.col);

        for (int i = 1; i <= this.row; i++) {
            for (int j = 1; j <= this.col; j++) {
                t.set(j, i, this.get(i, j));
            }
        }
        return t;
    }

    // 返回矩阵中的最大值及其所在行和列
    public String getMax() {
        DecimalFormat d = new DecimalFormat("#"); // 控制输出格式，无小数
        double max = this.get(1, 1);
        int maxr = 1; // 最大值所在行
        int maxc = 1; // 最大值所在列
        for (int i = 1; i <= this.row; ++i) {
            for (int j = 1; j <= this.col; ++j) {
                if (max < this.get(i, j)) {
                    max = this.get(i, j);
                    maxr = i;
                    maxc = j;
                }
            }
        }
        return "max: [ " + maxr + ", " + maxc + " ] = " + d.format(max);
    }

    public void print() {
        DecimalFormat d = new DecimalFormat("#"); // 控制输出格式，无小数
        for (int i = 1; i <= this.row; ++i) {
            for (int j = 1; j <= this.col - 1; ++j) {
                System.out.print(d.format(this.get(i, j)) + " ");

            }
            System.out.println(d.format(this.get(i, col)));
        }
    }
}
