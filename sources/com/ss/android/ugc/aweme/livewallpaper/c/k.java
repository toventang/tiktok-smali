package com.ss.android.ugc.aweme.livewallpaper.c;

import android.graphics.SurfaceTexture;
import com.bytedance.covode.number.Covode;

public final class k extends SurfaceTexture {

    /* renamed from: a  reason: collision with root package name */
    public h f108828a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f108829b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f108830c = false;

    static {
        Covode.recordClassIndex(69704);
    }

    public final void releaseTexImage() {
        super.releaseTexImage();
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.SurfaceTexture, java.lang.Object
    public final void finalize() {
        a();
        super.finalize();
    }

    public final void release() {
        a();
        super.release();
    }

    private void a() {
        if (!this.f108830c) {
            this.f108828a.b();
            this.f108830c = true;
        }
    }

    public k(h hVar) {
        super(hVar.c());
        hVar.a();
        this.f108828a = hVar;
        hVar.d();
    }
}
