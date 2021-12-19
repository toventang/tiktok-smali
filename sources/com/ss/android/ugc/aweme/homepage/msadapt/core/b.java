package com.ss.android.ugc.aweme.homepage.msadapt.core;

import com.bytedance.covode.number.Covode;

public enum b {
    SINGLE_SCREEN(0),
    DUAL_SCREEN(1);
    
    public static final a Companion = new a((byte) 0);
    private final int id;

    public static final class a {
        static {
            Covode.recordClassIndex(63206);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getId() {
        return this.id;
    }

    static {
        Covode.recordClassIndex(63205);
    }

    private b(int i2) {
        this.id = i2;
    }
}
