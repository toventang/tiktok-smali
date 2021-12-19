package com.bytedance.jedi.a.g.b;

import com.bytedance.covode.number.Covode;

public enum e {
    EXPLICIT {
        /* access modifiers changed from: package-private */
        @Override // com.bytedance.jedi.a.g.b.e
        public final boolean a() {
            return false;
        }
    },
    REPLACED {
        /* access modifiers changed from: package-private */
        @Override // com.bytedance.jedi.a.g.b.e
        public final boolean a() {
            return false;
        }
    },
    COLLECTED {
        /* access modifiers changed from: package-private */
        @Override // com.bytedance.jedi.a.g.b.e
        public final boolean a() {
            return true;
        }
    },
    EXPIRED {
        /* access modifiers changed from: package-private */
        @Override // com.bytedance.jedi.a.g.b.e
        public final boolean a() {
            return true;
        }
    },
    SIZE {
        /* access modifiers changed from: package-private */
        @Override // com.bytedance.jedi.a.g.b.e
        public final boolean a() {
            return true;
        }
    };

    /* access modifiers changed from: package-private */
    public abstract boolean a();

    static {
        Covode.recordClassIndex(24044);
    }

    /* synthetic */ e(byte b2) {
        this();
    }
}
