package com.ss.android.ugc.playerkit.videoview;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public final class f implements i {

    /* renamed from: a  reason: collision with root package name */
    public Set<k> f148963a = new LinkedHashSet(1);

    /* renamed from: b  reason: collision with root package name */
    public boolean f148964b;

    /* renamed from: c  reason: collision with root package name */
    public SurfaceTexture f148965c;

    /* renamed from: d  reason: collision with root package name */
    private final KeepSurfaceTextureView f148966d;

    static {
        Covode.recordClassIndex(98090);
    }

    @Override // com.ss.android.ugc.playerkit.videoview.i
    public final int e() {
        return 0;
    }

    @Override // com.ss.android.ugc.playerkit.videoview.i
    public final boolean f() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.videoview.i
    public final void g() {
        this.f148964b = true;
    }

    @Override // com.ss.android.ugc.playerkit.videoview.i
    public final void h() {
        this.f148964b = false;
    }

    @Override // com.ss.android.ugc.playerkit.videoview.i
    public final View a() {
        return this.f148966d;
    }

    @Override // com.ss.android.ugc.playerkit.videoview.i
    public final Surface b() {
        return this.f148966d.getSurface();
    }

    @Override // com.ss.android.ugc.playerkit.videoview.i
    public final boolean c() {
        return this.f148966d.f148878e;
    }

    @Override // com.ss.android.ugc.playerkit.videoview.i
    public final void d() {
        this.f148966d.c();
    }

    private void i() {
        this.f148966d.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            /* class com.ss.android.ugc.playerkit.videoview.f.AnonymousClass1 */

            static {
                Covode.recordClassIndex(98091);
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                Iterator it = new ArrayList(f.this.f148963a).iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                for (k kVar : new ArrayList(f.this.f148963a)) {
                    kVar.aB_();
                }
                f fVar = f.this;
                if (!fVar.f148964b) {
                    surfaceTexture = null;
                }
                fVar.f148965c = surfaceTexture;
                if (!f.this.f148964b) {
                    return true;
                }
                return false;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
                for (k kVar : new ArrayList(f.this.f148963a)) {
                    kVar.b(i2, i3);
                }
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
                f.this.f148964b = false;
                for (k kVar : new ArrayList(f.this.f148963a)) {
                    kVar.a(i2, i3);
                }
            }
        });
    }

    @Override // com.ss.android.ugc.playerkit.videoview.i
    public final void a(k kVar) {
        this.f148963a.add(kVar);
    }

    @Override // com.ss.android.ugc.playerkit.videoview.i
    public final void b(k kVar) {
        this.f148963a.remove(kVar);
    }

    public f(KeepSurfaceTextureView keepSurfaceTextureView) {
        this.f148966d = keepSurfaceTextureView;
        i();
    }

    public f(ViewGroup viewGroup) {
        MethodCollector.i(6157);
        KeepSurfaceTextureView keepSurfaceTextureView = new KeepSurfaceTextureView(viewGroup.getContext());
        this.f148966d = keepSurfaceTextureView;
        if (viewGroup instanceof FrameLayout) {
            viewGroup.addView(keepSurfaceTextureView, 0, new FrameLayout.LayoutParams(-1, -1, 17));
        } else if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13, -1);
            viewGroup.addView(keepSurfaceTextureView, 0, layoutParams);
        } else {
            viewGroup.addView(keepSurfaceTextureView, 0, new ViewGroup.LayoutParams(-1, -1));
        }
        i();
        MethodCollector.o(6157);
    }
}
