package com.bytedance.android.live.liveinteract.platform.common.g;

import com.bytedance.android.live.core.f.w;
import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.h.a;
import java.util.concurrent.TimeUnit;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    String f11983a;

    /* renamed from: b  reason: collision with root package name */
    String f11984b;

    /* renamed from: c  reason: collision with root package name */
    float f11985c;

    /* renamed from: d  reason: collision with root package name */
    long f11986d;

    /* renamed from: e  reason: collision with root package name */
    int f11987e;

    /* renamed from: f  reason: collision with root package name */
    int f11988f;

    /* renamed from: g  reason: collision with root package name */
    int f11989g;

    /* renamed from: h  reason: collision with root package name */
    int f11990h;

    /* renamed from: i  reason: collision with root package name */
    private b f11991i;

    static {
        Covode.recordClassIndex(6537);
    }

    public final void b() {
        b bVar = this.f11991i;
        if (bVar != null && !bVar.isDisposed()) {
            this.f11991i.dispose();
        }
    }

    public final void a() {
        this.f11985c = ((float) w.a()) / 1024.0f;
        this.f11991i = com.bytedance.android.livesdk.utils.b.b.b(5000, TimeUnit.MILLISECONDS).a(a.b(f.a.k.a.f158006c)).d(new k(this)).a(l.f11993a, false).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(m.f11994a, n.f11995a);
    }

    public j(String str, String str2, long j2, int i2, int i3, int i4, int i5) {
        this.f11983a = str;
        this.f11984b = str2;
        this.f11986d = j2;
        this.f11987e = i2;
        this.f11988f = i3;
        this.f11989g = i4;
        this.f11990h = i5;
    }
}
