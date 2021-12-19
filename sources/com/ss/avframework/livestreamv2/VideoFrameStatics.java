package com.ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;

public class VideoFrameStatics {
    private List<Long> mList = new ArrayList();
    private final int mWinMs;

    static {
        Covode.recordClassIndex(99949);
    }

    private void update() {
        if (!this.mList.isEmpty()) {
            Long valueOf = Long.valueOf(System.currentTimeMillis() - ((long) this.mWinMs));
            while (!this.mList.isEmpty()) {
                Long l2 = this.mList.get(0);
                if (l2.longValue() < valueOf.longValue()) {
                    this.mList.remove(l2);
                } else {
                    return;
                }
            }
        }
    }

    public void add() {
        MethodCollector.i(11831);
        synchronized (this.mList) {
            try {
                update();
                this.mList.add(Long.valueOf(System.currentTimeMillis()));
            } finally {
                MethodCollector.o(11831);
            }
        }
    }

    public float getRealRatePerSecond() {
        MethodCollector.i(11984);
        synchronized (this.mList) {
            try {
                update();
                if (!this.mList.isEmpty()) {
                    List<Long> list = this.mList;
                    Long valueOf = Long.valueOf(list.get(list.size() - 1).longValue() - this.mList.get(0).longValue());
                    if (valueOf.longValue() == 0) {
                        return 0.0f;
                    }
                    float size = (((float) this.mList.size()) * 1000.0f) / ((float) valueOf.longValue());
                    MethodCollector.o(11984);
                    return size;
                }
                MethodCollector.o(11984);
                return 0.0f;
            } finally {
                MethodCollector.o(11984);
            }
        }
    }

    public VideoFrameStatics(int i2) {
        this.mWinMs = i2;
    }
}
