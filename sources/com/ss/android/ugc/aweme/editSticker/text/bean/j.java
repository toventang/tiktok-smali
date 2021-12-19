package com.ss.android.ugc.aweme.editSticker.text.bean;

import com.bytedance.covode.number.Covode;

public enum j {
    VERTICAL(0),
    HORIZONTAL(1);
    
    public static final a Companion = new a((byte) 0);
    private final int orientation;

    public static final class a {
        static {
            Covode.recordClassIndex(55657);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static j a(int i2) {
            if (i2 == j.VERTICAL.getOrientation() || i2 != j.HORIZONTAL.getOrientation()) {
                return j.VERTICAL;
            }
            return j.HORIZONTAL;
        }
    }

    public final int getOrientation() {
        return this.orientation;
    }

    static {
        Covode.recordClassIndex(55656);
    }

    private j(int i2) {
        this.orientation = i2;
    }
}
