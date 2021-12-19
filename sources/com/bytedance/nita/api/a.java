package com.bytedance.nita.api;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.a.b.c;
import com.a.b.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.nita.api.c;
import com.bytedance.nita.f.b;
import h.f.b.l;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final String f41611a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f41612b;

    /* renamed from: c  reason: collision with root package name */
    public final e f41613c;

    /* renamed from: d  reason: collision with root package name */
    public final g f41614d;

    /* renamed from: e  reason: collision with root package name */
    public final f f41615e;

    /* renamed from: f  reason: collision with root package name */
    public final int f41616f;

    /* renamed from: g  reason: collision with root package name */
    public final int f41617g;

    static {
        Covode.recordClassIndex(25457);
    }

    @Override // com.bytedance.nita.api.c
    public final void a(View view, Activity activity) {
        l.c(view, "");
        l.c(activity, "");
    }

    @Override // com.bytedance.nita.api.c
    public final String a() {
        return this.f41611a;
    }

    @Override // com.bytedance.nita.api.c
    public final e c() {
        return this.f41613c;
    }

    @Override // com.bytedance.nita.api.c
    public final int[] d() {
        return this.f41612b;
    }

    @Override // com.bytedance.nita.api.c
    public final int e() {
        return this.f41616f;
    }

    @Override // com.bytedance.nita.api.c
    public final g f() {
        return this.f41614d;
    }

    @Override // com.bytedance.nita.api.c
    public final f g() {
        return this.f41615e;
    }

    @Override // com.bytedance.nita.api.c
    public final b b() {
        if (c.f4932b != null) {
            d dVar = c.f4932b;
            l.a((Object) dVar, "");
            if (dVar.f4935c) {
                return com.bytedance.nita.f.c.f41668a;
            }
        }
        return com.bytedance.nita.f.a.f41667a;
    }

    @Override // com.bytedance.nita.api.c
    public final ViewGroup b(Context context) {
        l.c(context, "");
        return c.a.a(context);
    }

    public final void a(Context context) {
        com.bytedance.nita.a.f41606c.a(this.f41611a, this.f41617g, context);
    }

    public final View a(int i2, Activity activity) {
        l.c(activity, "");
        return (View) com.bytedance.nita.f.d.a(this.f41611a, i2, activity);
    }

    public a(String str, int[] iArr, e eVar, g gVar, f fVar, int i2, int i3) {
        l.c(str, "");
        l.c(iArr, "");
        l.c(eVar, "");
        l.c(gVar, "");
        l.c(fVar, "");
        this.f41611a = str;
        this.f41612b = iArr;
        this.f41613c = eVar;
        this.f41614d = gVar;
        this.f41615e = fVar;
        this.f41616f = i2;
        this.f41617g = i3;
    }
}
