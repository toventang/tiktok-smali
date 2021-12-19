package android.ss.com.vboost;

import com.bytedance.covode.number.Covode;

public enum f {
    BEGIN(1),
    END(2);
    
    private int status;

    public final int getStatus() {
        return this.status;
    }

    static {
        Covode.recordClassIndex(68);
    }

    private f(int i2) {
        this.status = i2;
    }
}
