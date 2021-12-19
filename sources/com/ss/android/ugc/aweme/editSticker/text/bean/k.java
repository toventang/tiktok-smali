package com.ss.android.ugc.aweme.editSticker.text.bean;

import com.bytedance.covode.number.Covode;

public enum k {
    NONE(0),
    LINEAR(1);
    
    public static final a Companion = new a((byte) 0);
    private final int type;

    public static final class a {
        static {
            Covode.recordClassIndex(55659);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static k a(int i2) {
            if (i2 == k.NONE.getType() || i2 != k.LINEAR.getType()) {
                return k.NONE;
            }
            return k.LINEAR;
        }
    }

    public final int getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(55658);
    }

    private k(int i2) {
        this.type = i2;
    }
}
