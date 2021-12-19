package com.squareup.wire;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

/* access modifiers changed from: package-private */
public final class Preconditions {
    static {
        Covode.recordClassIndex(36111);
    }

    private Preconditions() {
    }

    static void checkNotNull(Object obj, String str) {
        Objects.requireNonNull(obj, str);
    }
}
