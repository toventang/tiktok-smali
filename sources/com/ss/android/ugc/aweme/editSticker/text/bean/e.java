package com.ss.android.ugc.aweme.editSticker.text.bean;

import com.bytedance.covode.number.Covode;

public enum e {
    MATCH_PARENT(0),
    DIMENSION(1);
    
    public static final a Companion = new a((byte) 0);
    private final int mode;

    public static final class a {
        static {
            Covode.recordClassIndex(55649);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static e a(int i2) {
            if (i2 == e.MATCH_PARENT.getMode() || i2 != e.DIMENSION.getMode()) {
                return e.MATCH_PARENT;
            }
            return e.DIMENSION;
        }
    }

    public final int getMode() {
        return this.mode;
    }

    static {
        Covode.recordClassIndex(55648);
    }

    private e(int i2) {
        this.mode = i2;
    }
}
