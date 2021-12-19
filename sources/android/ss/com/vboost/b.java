package android.ss.com.vboost;

import com.bytedance.covode.number.Covode;

public enum b {
    SILVER(1),
    GOLD(2),
    SUPER(3);
    
    private int index;

    public final int getIndex() {
        return this.index;
    }

    static {
        Covode.recordClassIndex(12);
    }

    public static b valueOf(int i2) {
        if (i2 == 1) {
            return SILVER;
        }
        if (i2 == 2) {
            return GOLD;
        }
        if (i2 != 3) {
            return null;
        }
        return SUPER;
    }

    private b(int i2) {
        this.index = i2;
    }
}
