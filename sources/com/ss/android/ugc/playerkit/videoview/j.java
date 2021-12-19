package com.ss.android.ugc.playerkit.videoview;

import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.playerkit.model.c;

public final class j implements i {

    /* renamed from: a  reason: collision with root package name */
    public i f148968a;

    static {
        Covode.recordClassIndex(98095);
    }

    @Override // com.ss.android.ugc.playerkit.videoview.i
    public final View a() {
        return this.f148968a.a();
    }

    @Override // com.ss.android.ugc.playerkit.videoview.i
    public final Surface b() {
        return this.f148968a.b();
    }

    @Override // com.ss.android.ugc.playerkit.videoview.i
    public final boolean c() {
        return this.f148968a.c();
    }

    @Override // com.ss.android.ugc.playerkit.videoview.i
    public final void d() {
        this.f148968a.d();
    }

    @Override // com.ss.android.ugc.playerkit.videoview.i
    public final int e() {
        return this.f148968a.e();
    }

    @Override // com.ss.android.ugc.playerkit.videoview.i
    public final boolean f() {
        return this.f148968a.f();
    }

    @Override // com.ss.android.ugc.playerkit.videoview.i
    public final void g() {
        this.f148968a.g();
    }

    @Override // com.ss.android.ugc.playerkit.videoview.i
    public final void h() {
        this.f148968a.h();
    }

    @Override // com.ss.android.ugc.playerkit.videoview.i
    public final void a(k kVar) {
        this.f148968a.a(kVar);
    }

    @Override // com.ss.android.ugc.playerkit.videoview.i
    public final void b(k kVar) {
        this.f148968a.b(kVar);
    }

    public static j a(ViewGroup viewGroup) {
        j jVar = new j();
        c.f148702a.isUseSurfaceControl();
        c.f148702a.isUseSurfaceView();
        jVar.f148968a = new f(viewGroup);
        jVar.a().setTag(jVar);
        return jVar;
    }

    public static j a(KeepSurfaceTextureView keepSurfaceTextureView) {
        Object tag = keepSurfaceTextureView.getTag();
        if (tag instanceof j) {
            return (j) tag;
        }
        j jVar = new j();
        jVar.f148968a = new f(keepSurfaceTextureView);
        keepSurfaceTextureView.setTag(jVar);
        return jVar;
    }
}
