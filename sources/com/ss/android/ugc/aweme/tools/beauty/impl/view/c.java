package com.ss.android.ugc.aweme.tools.beauty.impl.view;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.tools.beauty.b.c.d;
import com.ss.android.ugc.aweme.tools.beauty.b.c.e;
import com.ss.android.ugc.aweme.tools.beauty.g.b;
import com.ss.android.ugc.aweme.tools.beauty.g.m;
import com.ss.android.ugc.aweme.tools.beauty.service.f;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public m f139050a;

    /* renamed from: b  reason: collision with root package name */
    public f.b f139051b;

    /* renamed from: c  reason: collision with root package name */
    public f.a f139052c;

    /* renamed from: d  reason: collision with root package name */
    g f139053d;

    /* renamed from: e  reason: collision with root package name */
    private a f139054e;

    static {
        Covode.recordClassIndex(90941);
    }

    public final b b() {
        return this.f139050a.g();
    }

    public final void a() {
        d dVar = (d) this.f139053d.a(d.class);
        if (dVar != null) {
            dVar.b();
        }
    }

    public final void c(ComposerBeauty composerBeauty) {
        a aVar = this.f139054e;
        if (aVar != null) {
            aVar.a(composerBeauty);
        }
    }

    public final boolean b(String str) {
        l.d(str, "");
        return this.f139050a.b(str);
    }

    public final String d(ComposerBeauty composerBeauty) {
        l.d(composerBeauty, "");
        return this.f139050a.h(composerBeauty);
    }

    public final void e(ComposerBeauty composerBeauty) {
        l.d(composerBeauty, "");
        this.f139050a.c(composerBeauty);
    }

    public final void a(ComposerBeauty composerBeauty) {
        l.d(composerBeauty, "");
        f.b bVar = this.f139051b;
        if (bVar != null) {
            bVar.a(composerBeauty);
        }
    }

    public final void b(ComposerBeauty composerBeauty) {
        l.d(composerBeauty, "");
        a aVar = this.f139054e;
        if (aVar != null) {
            l.d(composerBeauty, "");
            com.ss.android.ugc.aweme.tools.beauty.service.b bVar = aVar.f139043a;
            if (bVar != null) {
                bVar.a(composerBeauty);
            }
        }
    }

    public final void a(String str) {
        l.d(str, "");
        a aVar = this.f139054e;
        if (aVar != null) {
            l.d(str, "");
            com.ss.android.ugc.aweme.tools.beauty.service.b bVar = aVar.f139043a;
            if (bVar != null) {
                bVar.b(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        e eVar = (e) this.f139053d.a(e.class);
        if (eVar != null) {
            eVar.a(z);
        }
    }

    public final void a(String str, boolean z) {
        l.d(str, "");
        this.f139050a.a(str, z);
    }

    public final int[] a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        f.a aVar = this.f139052c;
        if (aVar != null) {
            return aVar.a(str, str2);
        }
        return null;
    }

    public c(m mVar, f.b bVar, f.a aVar, a aVar2, g gVar) {
        l.d(mVar, "");
        l.d(gVar, "");
        this.f139050a = mVar;
        this.f139051b = bVar;
        this.f139052c = aVar;
        this.f139054e = aVar2;
        this.f139053d = gVar;
    }
}
