package com.ss.android.ugc.aweme.crossplatform.d;

import com.bytedance.covode.number.Covode;

public enum d {
    NONE(0),
    DYNAMIC(1),
    FROCE_DYNAMIC(2);
    
    public static final a Companion = new a((byte) 0);
    private final int value;

    public static final class a {
        static {
            Covode.recordClassIndex(48887);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(48886);
    }

    public static final d parse(int i2) {
        if (i2 == 1) {
            return DYNAMIC;
        }
        if (i2 != 2) {
            return NONE;
        }
        return FROCE_DYNAMIC;
    }

    private d(int i2) {
        this.value = i2;
    }
}
