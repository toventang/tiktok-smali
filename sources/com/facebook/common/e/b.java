package com.facebook.common.e;

import com.bytedance.covode.number.Covode;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final b f47082a = new b();

    /* renamed from: b  reason: collision with root package name */
    public String f47083b = "unknown";

    /* renamed from: c  reason: collision with root package name */
    private int f47084c = 5;

    @Override // com.facebook.common.e.c
    public final void a(String str, String str2) {
    }

    @Override // com.facebook.common.e.c
    public final void a(String str, String str2, Throwable th) {
    }

    @Override // com.facebook.common.e.c
    public final void b(String str, String str2) {
    }

    @Override // com.facebook.common.e.c
    public final void b(String str, String str2, Throwable th) {
    }

    @Override // com.facebook.common.e.c
    public final void c(String str, String str2) {
    }

    @Override // com.facebook.common.e.c
    public final void c(String str, String str2, Throwable th) {
    }

    @Override // com.facebook.common.e.c
    public final void d(String str, String str2) {
    }

    @Override // com.facebook.common.e.c
    public final void d(String str, String str2, Throwable th) {
    }

    @Override // com.facebook.common.e.c
    public final void e(String str, String str2) {
    }

    static {
        Covode.recordClassIndex(28648);
    }

    private b() {
    }

    @Override // com.facebook.common.e.c
    public final void a(int i2) {
        this.f47084c = i2;
    }

    @Override // com.facebook.common.e.c
    public final boolean b(int i2) {
        if (this.f47084c <= i2) {
            return true;
        }
        return false;
    }
}
