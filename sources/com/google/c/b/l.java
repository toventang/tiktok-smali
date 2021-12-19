package com.google.c.b;

import com.bytedance.covode.number.Covode;

public enum l {
    EXPLICIT {
        /* access modifiers changed from: package-private */
        @Override // com.google.c.b.l
        public final boolean a() {
            return false;
        }
    },
    REPLACED {
        /* access modifiers changed from: package-private */
        @Override // com.google.c.b.l
        public final boolean a() {
            return false;
        }
    },
    COLLECTED {
        /* access modifiers changed from: package-private */
        @Override // com.google.c.b.l
        public final boolean a() {
            return true;
        }
    },
    EXPIRED {
        /* access modifiers changed from: package-private */
        @Override // com.google.c.b.l
        public final boolean a() {
            return true;
        }
    },
    SIZE {
        /* access modifiers changed from: package-private */
        @Override // com.google.c.b.l
        public final boolean a() {
            return true;
        }
    };

    /* access modifiers changed from: package-private */
    public abstract boolean a();

    static {
        Covode.recordClassIndex(33338);
    }

    /* synthetic */ l(byte b2) {
        this();
    }
}
