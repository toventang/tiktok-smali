package com.ss.android.ugc.aweme.cz.a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {

    /* renamed from: l  reason: collision with root package name */
    public static final a f79310l = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f79311a;

    /* renamed from: b  reason: collision with root package name */
    public final int f79312b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f79313c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f79314d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f79315e;

    /* renamed from: f  reason: collision with root package name */
    public final String f79316f;

    /* renamed from: g  reason: collision with root package name */
    public final String f79317g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f79318h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f79319i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f79320j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f79321k;

    static {
        Covode.recordClassIndex(49232);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f79311a, cVar.f79311a) && this.f79312b == cVar.f79312b && this.f79313c == cVar.f79313c && this.f79314d == cVar.f79314d && l.a(this.f79315e, cVar.f79315e) && l.a(this.f79316f, cVar.f79316f) && l.a(this.f79317g, cVar.f79317g) && this.f79318h == cVar.f79318h && this.f79319i == cVar.f79319i && this.f79320j == cVar.f79320j && this.f79321k == cVar.f79321k;
    }

    public final int hashCode() {
        String str = this.f79311a;
        int i2 = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f79312b) * 31;
        boolean z = this.f79313c;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode + i4) * 31;
        boolean z2 = this.f79314d;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        Bundle bundle = this.f79315e;
        int hashCode2 = (i11 + (bundle != null ? bundle.hashCode() : 0)) * 31;
        String str2 = this.f79316f;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f79317g;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        int i12 = (hashCode3 + i2) * 31;
        boolean z3 = this.f79318h;
        if (z3) {
            z3 = true;
        }
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = z3 ? 1 : 0;
        int i16 = (i12 + i13) * 31;
        boolean z4 = this.f79319i;
        if (z4) {
            z4 = true;
        }
        int i17 = z4 ? 1 : 0;
        int i18 = z4 ? 1 : 0;
        int i19 = z4 ? 1 : 0;
        int i20 = (i16 + i17) * 31;
        boolean z5 = this.f79320j;
        if (z5) {
            z5 = true;
        }
        int i21 = z5 ? 1 : 0;
        int i22 = z5 ? 1 : 0;
        int i23 = z5 ? 1 : 0;
        int i24 = (i20 + i21) * 31;
        if (!this.f79321k) {
            i3 = 0;
        }
        return i24 + i3;
    }

    public final String toString() {
        return "ChooseMusicRequestBean(title=" + this.f79311a + ", musicChooseType=" + this.f79312b + ", allowClear=" + this.f79313c + ", isPhotoMvMode=" + this.f79314d + ", bundle=" + this.f79315e + ", shootWay=" + this.f79316f + ", creationId=" + this.f79317g + ", isBeatMusicSticker=" + this.f79318h + ", hideLocalMusic=" + this.f79319i + ", isMvThemeMusic=" + this.f79320j + ", isLongVideo=" + this.f79321k + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49233);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static c a(String str, int i2, boolean z, boolean z2, Bundle bundle, String str2, String str3, boolean z3, boolean z4, boolean z5) {
            return new c(str, i2, z, false, bundle, str2, str3, z3, z4, z5);
        }

        public static /* synthetic */ c a(String str, int i2, boolean z, Bundle bundle, String str2, String str3, boolean z2, boolean z3, boolean z4, int i3) {
            boolean z5 = z3;
            boolean z6 = z4;
            if ((i3 & 256) != 0) {
                z5 = false;
            }
            if ((i3 & 512) != 0) {
                z6 = false;
            }
            return a(str, i2, z, false, bundle, str2, str3, z2, z5, z6);
        }
    }

    public /* synthetic */ c(String str, int i2, boolean z, boolean z2, Bundle bundle, String str2, String str3, boolean z3, boolean z4, boolean z5) {
        this(str, i2, z, z2, bundle, str2, str3, z3, z4, false, z5);
    }

    public c(String str, int i2, boolean z, boolean z2, Bundle bundle, String str2, String str3, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f79311a = str;
        this.f79312b = i2;
        this.f79313c = z;
        this.f79314d = z2;
        this.f79315e = bundle;
        this.f79316f = str2;
        this.f79317g = str3;
        this.f79318h = z3;
        this.f79319i = z4;
        this.f79320j = z5;
        this.f79321k = z6;
    }
}
