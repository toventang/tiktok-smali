package com.ss.android.ugc.aweme.choosemusic.model;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class s {

    /* renamed from: c  reason: collision with root package name */
    public static final a f70681c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f70682a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f70683b;

    static {
        Covode.recordClassIndex(43579);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f70682a == sVar.f70682a && l.a(this.f70683b, sVar.f70683b);
    }

    public final int hashCode() {
        int i2 = this.f70682a * 31;
        Intent intent = this.f70683b;
        return i2 + (intent != null ? intent.hashCode() : 0);
    }

    public final String toString() {
        return "ChooseMusicResult(resultCode=" + this.f70682a + ", intent=" + this.f70683b + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(43580);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public /* synthetic */ s() {
        this(Integer.MAX_VALUE, null);
    }

    public s(int i2, Intent intent) {
        this.f70682a = i2;
        this.f70683b = intent;
    }
}
