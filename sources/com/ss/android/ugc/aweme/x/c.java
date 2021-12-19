package com.ss.android.ugc.aweme.x;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final a f145132c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f145133a;

    /* renamed from: b  reason: collision with root package name */
    public final Bitmap f145134b;

    static {
        Covode.recordClassIndex(94911);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f145133a, cVar.f145133a) && l.a(this.f145134b, cVar.f145134b);
    }

    public final int hashCode() {
        String str = this.f145133a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Bitmap bitmap = this.f145134b;
        if (bitmap != null) {
            i2 = bitmap.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "VideoCoverLoadResult(coverPath=" + this.f145133a + ", bitmap=" + this.f145134b + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(94912);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static c a(String str) {
            return new c(str, null);
        }
    }

    public c(String str, Bitmap bitmap) {
        this.f145133a = str;
        this.f145134b = bitmap;
    }
}
