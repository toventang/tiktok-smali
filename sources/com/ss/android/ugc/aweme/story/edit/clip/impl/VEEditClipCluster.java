package com.ss.android.ugc.aweme.story.edit.clip.impl;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.story.base.c.a;
import com.ss.android.ugc.aweme.story.edit.clip.a.b;
import com.ss.android.ugc.aweme.story.edit.clip.a.c;
import com.ss.android.ugc.aweme.story.edit.clip.a.e;
import com.ss.android.ugc.aweme.story.edit.clip.a.h;
import h.f.b.l;
import h.p;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class VEEditClipCluster implements c<VEEditClip>, h<VEEditClip>, h {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, VEEditClip> f137567a;

    /* renamed from: b  reason: collision with root package name */
    public final d f137568b;

    /* renamed from: c  reason: collision with root package name */
    private final LiveData<VEEditClip> f137569c;

    /* renamed from: d  reason: collision with root package name */
    private final LiveData<p<VEEditClip, Boolean>> f137570d;

    /* renamed from: e  reason: collision with root package name */
    private final m f137571e;

    static {
        Covode.recordClassIndex(89997);
    }

    @Override // com.ss.android.ugc.aweme.story.edit.clip.a.c
    public final List<VEEditClip> getClips() {
        return this.f137568b.getClips();
    }

    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            destroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.edit.clip.a.h
    public final /* bridge */ /* synthetic */ c a() {
        return this.f137568b;
    }

    @Override // com.ss.android.ugc.aweme.story.edit.clip.a.h
    public final LiveData<VEEditClip> b() {
        return this.f137569c;
    }

    @Override // com.ss.android.ugc.aweme.story.edit.clip.a.h
    public final LiveData<p<VEEditClip, Boolean>> c() {
        return this.f137570d;
    }

    @v(a = i.a.ON_DESTROY)
    public final void destroy() {
        for (VEEditClip vEEditClip : a().getClips()) {
            a(vEEditClip, e.DESTROYED);
        }
        this.f137568b.f137573a.clear();
    }

    public /* synthetic */ VEEditClipCluster(m mVar) {
        this(mVar, new d());
    }

    private final void b(VEEditClip vEEditClip) {
        vEEditClip.d();
        a.a(this.f137569c, vEEditClip);
        a.a(this.f137570d, h.v.a(vEEditClip, true));
    }

    private final void c(VEEditClip vEEditClip) {
        vEEditClip.e();
        a.a(this.f137570d, h.v.a(vEEditClip, false));
    }

    public final void a(VEEditClip vEEditClip) {
        if (!l.a(vEEditClip, b.a(this))) {
            VEEditClip vEEditClip2 = (VEEditClip) b.a(this);
            if (vEEditClip2 != null) {
                a(vEEditClip2, e.CREATED);
            }
            a(vEEditClip, e.LOADED);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.ss.android.ugc.aweme.story.edit.clip.a.c
    public final /* synthetic */ void add(VEEditClip vEEditClip, int i2) {
        VEEditClip vEEditClip2 = vEEditClip;
        l.d(vEEditClip2, "");
        this.f137568b.add(vEEditClip2, i2);
        this.f137567a.put(vEEditClip2.f137559g.getClipId(), vEEditClip2);
    }

    private VEEditClipCluster(m mVar, d dVar) {
        l.d(mVar, "");
        l.d(dVar, "");
        this.f137571e = mVar;
        this.f137568b = dVar;
        this.f137567a = new LinkedHashMap();
        this.f137569c = new t();
        this.f137570d = new t();
        mVar.getLifecycle().a(this);
    }

    private final void a(VEEditClip vEEditClip, e eVar) {
        if (vEEditClip != null && vEEditClip.f137555c != e.DESTROYED) {
            int i2 = c.f137572a[eVar.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        if (vEEditClip.f137555c.compareTo((Enum) e.LOADED) >= 0) {
                            c(vEEditClip);
                        }
                        if (vEEditClip.f137555c.compareTo((Enum) e.CREATED) >= 0) {
                            vEEditClip.f();
                        }
                    }
                } else if (vEEditClip.f137555c.compareTo((Enum) e.LOADED) < 0) {
                    if (vEEditClip.f137555c.compareTo((Enum) e.CREATED) < 0) {
                        vEEditClip.c();
                    }
                    b(vEEditClip);
                }
            } else if (vEEditClip.f137555c.compareTo((Enum) e.CREATED) < 0) {
                vEEditClip.c();
            } else if (vEEditClip.f137555c.compareTo((Enum) e.CREATED) > 0) {
                c(vEEditClip);
            }
        }
    }
}
