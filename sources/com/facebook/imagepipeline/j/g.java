package com.facebook.imagepipeline.j;

import com.bytedance.covode.number.Covode;

public final class g implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f48000a = a(Integer.MAX_VALUE, true, true);

    /* renamed from: b  reason: collision with root package name */
    int f48001b;

    /* renamed from: c  reason: collision with root package name */
    boolean f48002c;

    /* renamed from: d  reason: collision with root package name */
    boolean f48003d;

    @Override // com.facebook.imagepipeline.j.h
    public final int a() {
        return this.f48001b;
    }

    @Override // com.facebook.imagepipeline.j.h
    public final boolean b() {
        return this.f48002c;
    }

    @Override // com.facebook.imagepipeline.j.h
    public final boolean c() {
        return this.f48003d;
    }

    static {
        Covode.recordClassIndex(29021);
    }

    public final int hashCode() {
        int i2;
        int i3 = this.f48001b;
        int i4 = 0;
        if (this.f48002c) {
            i2 = 4194304;
        } else {
            i2 = 0;
        }
        int i5 = i3 ^ i2;
        if (this.f48003d) {
            i4 = 8388608;
        }
        return i5 ^ i4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f48001b == gVar.f48001b && this.f48002c == gVar.f48002c && this.f48003d == gVar.f48003d) {
            return true;
        }
        return false;
    }

    public static h a(int i2, boolean z, boolean z2) {
        return new g(i2, z, z2);
    }

    private g(int i2, boolean z, boolean z2) {
        this.f48001b = i2;
        this.f48002c = z;
        this.f48003d = z2;
    }
}
