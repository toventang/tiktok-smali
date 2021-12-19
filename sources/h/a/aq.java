package h.a;

import com.bytedance.covode.number.Covode;

enum aq {
    Ready,
    NotReady,
    Done,
    Failed;

    static {
        Covode.recordClassIndex(105054);
    }
}
