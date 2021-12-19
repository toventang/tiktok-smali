package androidx.work;

import android.os.Build;
import com.bytedance.covode.number.Covode;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f4479a = new c(new a());

    /* renamed from: b  reason: collision with root package name */
    public h f4480b = h.NOT_REQUIRED;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4481c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4482d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4483e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4484f;

    /* renamed from: g  reason: collision with root package name */
    public long f4485g = -1;

    /* renamed from: h  reason: collision with root package name */
    public long f4486h = -1;

    /* renamed from: i  reason: collision with root package name */
    public d f4487i = new d();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f4488a;

        /* renamed from: b  reason: collision with root package name */
        boolean f4489b;

        /* renamed from: c  reason: collision with root package name */
        h f4490c = h.NOT_REQUIRED;

        /* renamed from: d  reason: collision with root package name */
        boolean f4491d;

        /* renamed from: e  reason: collision with root package name */
        boolean f4492e;

        /* renamed from: f  reason: collision with root package name */
        long f4493f = -1;

        /* renamed from: g  reason: collision with root package name */
        long f4494g = -1;

        /* renamed from: h  reason: collision with root package name */
        d f4495h = new d();

        static {
            Covode.recordClassIndex(1747);
        }
    }

    public final boolean a() {
        if (this.f4487i.a() > 0) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(1746);
    }

    public c() {
    }

    public final int hashCode() {
        long j2 = this.f4485g;
        long j3 = this.f4486h;
        return (((((((((((((this.f4480b.hashCode() * 31) + (this.f4481c ? 1 : 0)) * 31) + (this.f4482d ? 1 : 0)) * 31) + (this.f4483e ? 1 : 0)) * 31) + (this.f4484f ? 1 : 0)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f4487i.hashCode();
    }

    private c(a aVar) {
        boolean z;
        this.f4481c = aVar.f4488a;
        if (Build.VERSION.SDK_INT < 23 || !aVar.f4489b) {
            z = false;
        } else {
            z = true;
        }
        this.f4482d = z;
        this.f4480b = aVar.f4490c;
        this.f4483e = aVar.f4491d;
        this.f4484f = aVar.f4492e;
        if (Build.VERSION.SDK_INT >= 24) {
            this.f4487i = aVar.f4495h;
            this.f4485g = aVar.f4493f;
            this.f4486h = aVar.f4494g;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f4481c == cVar.f4481c && this.f4482d == cVar.f4482d && this.f4483e == cVar.f4483e && this.f4484f == cVar.f4484f && this.f4485g == cVar.f4485g && this.f4486h == cVar.f4486h && this.f4480b == cVar.f4480b) {
            return this.f4487i.equals(cVar.f4487i);
        }
        return false;
    }
}
