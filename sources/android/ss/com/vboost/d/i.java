package android.ss.com.vboost.d;

import com.bytedance.covode.number.Covode;

enum i {
    FIFO,
    LIFO,
    SMALL,
    LAGER;

    static {
        Covode.recordClassIndex(60);
    }
}
