package com.h520t.unaryquadriticfunction;

import java.math.BigDecimal;
import java.util.Random;

/**
 * @author Administrator
 * @des ${TODO}
 * @Version $Rev$
 * @updateAuthor $Author$
 * @updateDes ${TODO}
 */
public class UQFBean {
    private int a, b, c;

    public UQFBean(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getDataSet() {
        Random random = new Random(20);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 35; i++) {
            double x = random.nextDouble();
            BigDecimal bigX = new BigDecimal(x).setScale(2, BigDecimal.ROUND_HALF_UP);
            BigDecimal bigPow = bigX.multiply(bigX);
            BigDecimal y = bigX.multiply(bigPow).add(bigX.multiply(new BigDecimal(b)))
                    .add(new BigDecimal(c)).setScale(5,BigDecimal.ROUND_HALF_UP);
            stringBuilder.append(a).append("*").append(bigX).append("^2 + ").append(b).append("*")
                    .append(bigX).append(" + ").append(c)
                    .append(" = ").append(y).append("\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "UQFBean{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
