package com.squareup.a.a.a;

import com.a;
import com.bytedance.covode.number.Covode;
import k.i;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final i f57507a = i.encodeUtf8(":status");

    /* renamed from: b  reason: collision with root package name */
    public static final i f57508b = i.encodeUtf8(":method");

    /* renamed from: c  reason: collision with root package name */
    public static final i f57509c = i.encodeUtf8(":path");

    /* renamed from: d  reason: collision with root package name */
    public static final i f57510d = i.encodeUtf8(":scheme");

    /* renamed from: e  reason: collision with root package name */
    public static final i f57511e = i.encodeUtf8(":authority");

    /* renamed from: f  reason: collision with root package name */
    public static final i f57512f = i.encodeUtf8(":host");

    /* renamed from: g  reason: collision with root package name */
    public static final i f57513g = i.encodeUtf8(":version");

    /* renamed from: h  reason: collision with root package name */
    public final i f57514h;

    /* renamed from: i  reason: collision with root package name */
    public final i f57515i;

    /* renamed from: j  reason: collision with root package name */
    final int f57516j;

    public final int hashCode() {
        return ((this.f57514h.hashCode() + 527) * 31) + this.f57515i.hashCode();
    }

    public final String toString() {
        return a.a("%s: %s", new Object[]{this.f57514h.utf8(), this.f57515i.utf8()});
    }

    static {
        Covode.recordClassIndex(35900);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (!this.f57514h.equals(fVar.f57514h) || !this.f57515i.equals(fVar.f57515i)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public f(i iVar, String str) {
        this(iVar, i.encodeUtf8(str));
    }

    public f(String str, String str2) {
        this(i.encodeUtf8(str), i.encodeUtf8(str2));
    }

    public f(i iVar, i iVar2) {
        this.f57514h = iVar;
        this.f57515i = iVar2;
        this.f57516j = iVar.size() + 32 + iVar2.size();
    }
}
