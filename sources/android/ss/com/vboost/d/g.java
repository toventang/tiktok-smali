package android.ss.com.vboost.d;

import com.bytedance.covode.number.Covode;

public enum g {
    USE_PROVIDERS,
    USE_OURS,
    USER_CANCEL,
    ONE_TIME,
    ETERNAL;

    static {
        Covode.recordClassIndex(58);
    }
}
