package com.ss.android.ugc.asve.recorder;

import android.opengl.EGLContext;
import com.bytedance.covode.number.Covode;
import com.ss.android.medialib.camera.b;
import h.f.b.l;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class f implements b.a, g {

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList<g> f62298a = new CopyOnWriteArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final d f62299b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f62300c;

    static {
        Covode.recordClassIndex(38281);
    }

    @Override // com.ss.android.medialib.camera.b.a
    public final void a() {
        Iterator<T> it = this.f62298a.iterator();
        while (it.hasNext()) {
            it.next().a(null, 0, 0, 0, 0, 0, 0);
        }
    }

    public f(d dVar, boolean z) {
        l.d(dVar, "");
        this.f62299b = dVar;
        this.f62300c = z;
    }

    @Override // com.ss.android.vesdk.ax.j
    public final void a(EGLContext eGLContext, int i2, int i3, int i4, int i5, long j2, long j3) {
        Iterator<T> it = this.f62298a.iterator();
        while (it.hasNext()) {
            it.next().a(eGLContext, i2, i3, i4, i5, j2, j3);
        }
    }
}
