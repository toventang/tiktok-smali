package com.bytedance.android.live.liveinteract.platform.common.f;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f11941a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11942b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11943c;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f11944d;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f11945e;

    static {
        Covode.recordClassIndex(6523);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f11944d, aVar.f11944d) && l.a(this.f11945e, aVar.f11945e);
    }

    public final int hashCode() {
        Boolean bool = this.f11944d;
        int i2 = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.f11945e;
        if (bool2 != null) {
            i2 = bool2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "PermissionStatus(coHost=" + this.f11944d + ", multiGuest=" + this.f11945e + ")";
    }

    private a() {
        this.f11944d = null;
        this.f11945e = null;
    }

    public final boolean a() {
        if (this.f11944d == null || this.f11945e == null) {
            return false;
        }
        return true;
    }

    public final int b() {
        if (!a()) {
            return -1;
        }
        Boolean bool = this.f11944d;
        if (bool == null) {
            l.b();
        }
        if (bool.booleanValue()) {
            Boolean bool2 = this.f11945e;
            if (bool2 == null) {
                l.b();
            }
            if (bool2.booleanValue()) {
                return 3;
            }
        }
        Boolean bool3 = this.f11944d;
        if (bool3 == null) {
            l.b();
        }
        if (bool3.booleanValue()) {
            Boolean bool4 = this.f11945e;
            if (bool4 == null) {
                l.b();
            }
            if (!bool4.booleanValue()) {
                return 1;
            }
        }
        Boolean bool5 = this.f11945e;
        if (bool5 == null) {
            l.b();
        }
        if (!bool5.booleanValue()) {
            return 0;
        }
        Boolean bool6 = this.f11944d;
        if (bool6 == null) {
            l.b();
        }
        if (!bool6.booleanValue()) {
            return 2;
        }
        return 0;
    }

    public /* synthetic */ a(byte b2) {
        this();
    }
}
