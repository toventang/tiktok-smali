package android.ss.com.vboost.c;

import com.bytedance.covode.number.Covode;

public enum g {
    VENDOR(1),
    PLATFORM(2);
    
    private int provider;

    static {
        Covode.recordClassIndex(39);
    }

    private g(int i2) {
        this.provider = i2;
    }
}
