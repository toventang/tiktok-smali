package com.ss.android.ugc.aweme.editSticker.text.bean;

import com.bytedance.covode.number.Covode;

public enum f {
    LEFT(1),
    TOP(2),
    RIGHT(4),
    BOTTOM(8);
    
    public static final a Companion = new a((byte) 0);
    private final int gravity;

    public static final class a {
        static {
            Covode.recordClassIndex(55651);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getGravity() {
        return this.gravity;
    }

    static {
        Covode.recordClassIndex(55650);
    }

    private f(int i2) {
        this.gravity = i2;
    }
}
