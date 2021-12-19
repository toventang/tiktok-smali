package android.ss.com.vboost.d;

import com.bytedance.covode.number.Covode;

enum c {
    DIRECT,
    ASYNC;

    static {
        Covode.recordClassIndex(50);
    }
}
