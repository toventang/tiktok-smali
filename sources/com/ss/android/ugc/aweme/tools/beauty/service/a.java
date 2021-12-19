package com.ss.android.ugc.aweme.tools.beauty.service;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.tools.beauty.g.m;
import com.ss.android.ugc.aweme.tools.beauty.service.c;
import com.ss.android.ugc.tools.b.a.d;
import h.f.b.l;
import java.util.List;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f139143a;

    /* renamed from: b  reason: collision with root package name */
    public String f139144b;

    /* renamed from: c  reason: collision with root package name */
    public final m f139145c;

    /* renamed from: d  reason: collision with root package name */
    public final e f139146d;

    /* renamed from: f  reason: collision with root package name */
    private final String f139147f;

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.service.a$a  reason: collision with other inner class name */
    public static final class C3675a {

        /* renamed from: a  reason: collision with root package name */
        public e f139148a;

        /* renamed from: b  reason: collision with root package name */
        public String f139149b = "default";

        /* renamed from: c  reason: collision with root package name */
        public BeautyFilterConfig f139150c;

        /* renamed from: d  reason: collision with root package name */
        public f f139151d;

        /* renamed from: e  reason: collision with root package name */
        public h.f.a.a<? extends d> f139152e;

        /* renamed from: f  reason: collision with root package name */
        public m.b f139153f = new com.ss.android.ugc.aweme.tools.beauty.data.a();

        static {
            Covode.recordClassIndex(90997);
        }
    }

    static {
        Covode.recordClassIndex(90996);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.c
    public final boolean a() {
        return this.f139143a;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.c
    public final String b() {
        return this.f139144b;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.c
    public final m g() {
        return this.f139145c;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.c
    public final void c() {
        this.f139145c.l();
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.c
    public final boolean f() {
        return this.f139146d.a();
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.c
    public final com.ss.android.ugc.aweme.dependence.beauty.b.d<List<BeautyComposerInfo>> d() {
        if (!this.f139143a) {
            return new com.ss.android.ugc.aweme.dependence.beauty.b.d<>();
        }
        return this.f139145c.c();
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.c
    public final com.ss.android.ugc.aweme.dependence.beauty.b.d<List<BeautyComposerInfo>> e() {
        if (!this.f139143a) {
            return new com.ss.android.ugc.aweme.dependence.beauty.b.d<>();
        }
        return this.f139145c.n();
    }

    private void b(String str, c.a aVar) {
        l.d(str, "");
        this.f139145c.a(str, aVar);
    }

    public final void a(String str, c.a aVar) {
        l.d(str, "");
        this.f139143a = true;
        b(str, aVar);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.c
    public final void a(boolean z, com.ss.android.ugc.aweme.tools.beauty.a aVar) {
        l.d(aVar, "");
        if (this.f139143a) {
            if (this.f139146d.c() >= 3) {
                aVar = com.ss.android.ugc.aweme.tools.beauty.a.FEMALE;
            }
            if (aVar != com.ss.android.ugc.aweme.tools.beauty.a.CUR) {
                this.f139145c.a(z, aVar);
            } else {
                m.a.a(this.f139145c, z, null, 2);
            }
        }
    }

    public a(String str, m mVar, e eVar) {
        l.d(str, "");
        l.d(mVar, "");
        l.d(eVar, "");
        this.f139147f = str;
        this.f139145c = mVar;
        this.f139146d = eVar;
        this.f139144b = str;
    }
}
