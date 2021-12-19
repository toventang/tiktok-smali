package com.ss.android.ugc.aweme.cz.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.c;
import h.f.b.l;

public final class d {

    /* renamed from: f  reason: collision with root package name */
    public static final a f79322f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f79323a;

    /* renamed from: b  reason: collision with root package name */
    public final String f79324b;

    /* renamed from: c  reason: collision with root package name */
    public final c f79325c;

    /* renamed from: d  reason: collision with root package name */
    public final String f79326d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f79327e;

    static {
        Covode.recordClassIndex(49234);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f79323a == dVar.f79323a && l.a(this.f79324b, dVar.f79324b) && l.a(this.f79325c, dVar.f79325c) && l.a(this.f79326d, dVar.f79326d) && this.f79327e == dVar.f79327e;
    }

    public final int hashCode() {
        boolean z = this.f79323a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        String str = this.f79324b;
        int i7 = 0;
        int hashCode = (i6 + (str != null ? str.hashCode() : 0)) * 31;
        c cVar = this.f79325c;
        int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        String str2 = this.f79326d;
        if (str2 != null) {
            i7 = str2.hashCode();
        }
        int i8 = (hashCode2 + i7) * 31;
        if (!this.f79327e) {
            i2 = 0;
        }
        return i8 + i2;
    }

    public final String toString() {
        return "ChooseMusicResultBean(isCancelCurrentMusic=" + this.f79323a + ", musicOrigin=" + this.f79324b + ", music=" + this.f79325c + ", musicLocalPath=" + this.f79326d + ", isShowTips=" + this.f79327e + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49235);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static d a(Boolean bool, String str, c cVar, String str2) {
            boolean z;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            return new d(z, str, cVar, str2);
        }
    }

    public /* synthetic */ d(boolean z, String str, c cVar, String str2) {
        this(z, str, cVar, str2, true);
    }

    public d(boolean z, String str, c cVar, String str2, boolean z2) {
        this.f79323a = z;
        this.f79324b = str;
        this.f79325c = cVar;
        this.f79326d = str2;
        this.f79327e = z2;
    }
}
