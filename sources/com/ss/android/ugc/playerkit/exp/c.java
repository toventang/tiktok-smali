package com.ss.android.ugc.playerkit.exp;

import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import h.i;

public final class c {
    static {
        Covode.recordClassIndex(97982);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.a<a<T>> {
        final /* synthetic */ Object $defValue;
        final /* synthetic */ String $key;

        static {
            Covode.recordClassIndex(97983);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, Object obj) {
            super(0);
            this.$key = str;
            this.$defValue = obj;
        }

        @Override // h.f.a.a
        public final /* synthetic */ Object invoke() {
            return new a(this.$key, this.$defValue);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.a<T> {
        final /* synthetic */ Object $defValue;
        final /* synthetic */ String $key;

        static {
            Covode.recordClassIndex(97984);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str, Object obj) {
            super(0);
            this.$key = str;
            this.$defValue = obj;
        }

        @Override // h.f.a.a
        public final T invoke() {
            return (T) new a(this.$key, this.$defValue).a();
        }
    }

    static final <T> h<a<T>> a(String str, T t) {
        return i.a(h.m.SYNCHRONIZED, new a(str, t));
    }

    static final <T> h<T> b(String str, T t) {
        return i.a(h.m.SYNCHRONIZED, new b(str, t));
    }
}
