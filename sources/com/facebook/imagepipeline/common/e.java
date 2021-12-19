package com.facebook.imagepipeline.common;

import com.a;
import com.bytedance.covode.number.Covode;
import com.facebook.common.k.b;

public class e {

    /* renamed from: b  reason: collision with root package name */
    public static final e f47751b = new e(-1, false);

    /* renamed from: c  reason: collision with root package name */
    public static final e f47752c = new e(-2, false);

    /* renamed from: d  reason: collision with root package name */
    public static final e f47753d = new e(-1, true);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f47754a;

    /* renamed from: e  reason: collision with root package name */
    private final int f47755e;

    public final boolean a() {
        if (this.f47755e == -1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f47755e != -2) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(28927);
    }

    public final int c() {
        if (!a()) {
            return this.f47755e;
        }
        throw new IllegalStateException("Rotation is set to use EXIF");
    }

    public String toString() {
        return a.a(null, "%d defer:%b", new Object[]{Integer.valueOf(this.f47755e), Boolean.valueOf(this.f47754a)});
    }

    public int hashCode() {
        int hashCode;
        Integer valueOf = Integer.valueOf(this.f47755e);
        Boolean valueOf2 = Boolean.valueOf(this.f47754a);
        int i2 = 0;
        if (valueOf == null) {
            hashCode = 0;
        } else {
            hashCode = valueOf.hashCode();
        }
        if (valueOf2 != null) {
            i2 = valueOf2.hashCode();
        }
        return b.a(hashCode, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f47755e == eVar.f47755e && this.f47754a == eVar.f47754a) {
            return true;
        }
        return false;
    }

    private e(int i2, boolean z) {
        this.f47755e = i2;
        this.f47754a = z;
    }
}
