package com.ss.android.ugc.aweme.dsp.playpage.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final g f83745b = new g("");

    /* renamed from: c  reason: collision with root package name */
    public static final a f83746c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f83747a;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof g) && l.a(this.f83747a, ((g) obj).f83747a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f83747a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "MDScene(pageName=" + this.f83747a + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52245);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(52244);
    }

    public g(String str) {
        l.d(str, "");
        this.f83747a = str;
    }
}
