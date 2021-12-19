package com.google.android.gms.signin;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.internal.p;
import java.util.Arrays;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f52099a = new a();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f52100b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f52101c;

    /* renamed from: d  reason: collision with root package name */
    public final String f52102d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f52103e;

    /* renamed from: f  reason: collision with root package name */
    public final String f52104f;

    /* renamed from: g  reason: collision with root package name */
    public final String f52105g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f52106h;

    /* renamed from: i  reason: collision with root package name */
    public final Long f52107i;

    /* renamed from: j  reason: collision with root package name */
    public final Long f52108j;

    private a() {
    }

    static {
        Covode.recordClassIndex(32393);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f52100b), Boolean.valueOf(this.f52101c), this.f52102d, Boolean.valueOf(this.f52103e), Boolean.valueOf(this.f52106h), this.f52104f, this.f52105g, this.f52107i, this.f52108j});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f52100b != aVar.f52100b || this.f52101c != aVar.f52101c || !p.a(this.f52102d, aVar.f52102d) || this.f52103e != aVar.f52103e || this.f52106h != aVar.f52106h || !p.a(this.f52104f, aVar.f52104f) || !p.a(this.f52105g, aVar.f52105g) || !p.a(this.f52107i, aVar.f52107i) || !p.a(this.f52108j, aVar.f52108j)) {
            return false;
        }
        return true;
    }
}
