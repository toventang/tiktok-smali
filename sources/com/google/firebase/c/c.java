package com.google.firebase.c;

import com.bytedance.covode.number.Covode;

public interface c {
    static {
        Covode.recordClassIndex(33712);
    }

    a a(String str);

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        
        private final int code;

        public final int getCode() {
            return this.code;
        }

        static {
            Covode.recordClassIndex(33713);
        }

        private a(int i2) {
            this.code = i2;
        }
    }
}
