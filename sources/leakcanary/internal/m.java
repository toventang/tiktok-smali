package leakcanary.internal;

import com.bytedance.covode.number.Covode;

public enum m {
    LEAKCANARY_LOW("LeakCanary Low Priority", 2),
    LEAKCANARY_RESULT("LeakCanary Result", 3);
    
    private final int importance;
    private final String nameStr;

    public final int getImportance() {
        return this.importance;
    }

    public final String getNameStr() {
        return this.nameStr;
    }

    static {
        Covode.recordClassIndex(105877);
    }

    private m(String str, int i2) {
        this.nameStr = str;
        this.importance = i2;
    }
}
