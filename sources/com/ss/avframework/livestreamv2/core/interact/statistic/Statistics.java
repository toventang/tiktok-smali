package com.ss.avframework.livestreamv2.core.interact.statistic;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;

public class Statistics {
    private List<Cell> mList = new ArrayList();
    private int mWindowSizeMs;

    static {
        Covode.recordClassIndex(100300);
    }

    /* access modifiers changed from: package-private */
    public int getWindowLen() {
        return this.mWindowSizeMs;
    }

    public int getSize() {
        int size;
        MethodCollector.i(13733);
        synchronized (this.mList) {
            try {
                update_l(System.currentTimeMillis());
                size = this.mList.size();
            } finally {
                MethodCollector.o(13733);
            }
        }
        return size;
    }

    public double getAverageSize() {
        MethodCollector.i(13667);
        synchronized (this.mList) {
            try {
                update_l(System.currentTimeMillis());
                double d2 = 0.0d;
                for (Cell cell : this.mList) {
                    d2 += cell.data;
                }
                if (this.mList.size() > 0) {
                    double size = (double) this.mList.size();
                    Double.isNaN(size);
                    return d2 / size;
                }
                MethodCollector.o(13667);
                return 0.0d;
            } finally {
                MethodCollector.o(13667);
            }
        }
    }

    public float getRatePerSecond() {
        MethodCollector.i(13732);
        synchronized (this.mList) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                update_l(currentTimeMillis);
                int size = this.mList.size();
                float f2 = 0.0f;
                if (size > 0) {
                    float f3 = ((float) (currentTimeMillis - this.mList.get(size - 1).timeMs)) / 1000.0f;
                    if (f3 != 0.0f) {
                        f2 = ((float) size) / f3;
                    }
                    return f2;
                }
                MethodCollector.o(13732);
                return 0.0f;
            } finally {
                MethodCollector.o(13732);
            }
        }
    }

    public Statistics(int i2) {
        this.mWindowSizeMs = i2;
    }

    public void add(double d2) {
        MethodCollector.i(13783);
        synchronized (this.mList) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                update_l(currentTimeMillis);
                this.mList.add(new Cell(d2, currentTimeMillis));
            } finally {
                MethodCollector.o(13783);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void update_l(long j2) {
        long j3 = j2 - ((long) this.mWindowSizeMs);
        while (!this.mList.isEmpty() && this.mList.get(0).timeMs < j3) {
            this.mList.remove(0);
        }
    }

    /* access modifiers changed from: package-private */
    public class Cell {
        double data;
        long timeMs;

        static {
            Covode.recordClassIndex(100301);
        }

        public Cell(Statistics statistics, double d2) {
            this(d2, System.currentTimeMillis());
        }

        public Cell(double d2, long j2) {
            this.data = d2;
            this.timeMs = j2;
        }
    }
}
