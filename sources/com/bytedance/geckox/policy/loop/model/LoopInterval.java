package com.bytedance.geckox.policy.loop.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class LoopInterval {
    @c(a = "interval")
    private int interval;

    static {
        Covode.recordClassIndex(17409);
    }

    public enum a {
        lv_1(1),
        lv_2(2),
        lv_3(3);
        
        private int level;

        public final int getLevel() {
            return this.level;
        }

        static {
            Covode.recordClassIndex(17410);
        }

        private a(int i2) {
            this.level = i2;
        }
    }

    public int getInterval() {
        return this.interval;
    }

    public LoopInterval(int i2) {
        this.interval = i2;
    }
}
