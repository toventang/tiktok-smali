package com.ss.android.ugc.aweme.qainvitation.b.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.model.g;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class d extends c<c, b> implements a {

    /* renamed from: a  reason: collision with root package name */
    private final h f119069a = i.a((h.f.a.a) a.f119074a);

    /* renamed from: b  reason: collision with root package name */
    private String f119070b;

    /* renamed from: c  reason: collision with root package name */
    private String f119071c;

    static {
        Covode.recordClassIndex(77340);
    }

    private final c e() {
        return (c) this.f119069a.getValue();
    }

    static final class a extends m implements h.f.a.a<c> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f119074a = new a();

        static {
            Covode.recordClassIndex(77341);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return new c();
        }
    }

    @Override // com.ss.android.ugc.aweme.qainvitation.b.b.a
    public final boolean a() {
        return i();
    }

    public d() {
        a(e());
        this.f119070b = "";
        this.f119071c = "";
    }

    @Override // com.ss.android.ugc.aweme.common.c
    public final void b() {
        b bVar;
        super.b();
        c cVar = (c) this.f76396h;
        if (cVar != null && cVar.f119050a && (bVar = (b) this.f76397i) != null) {
            bVar.d();
        }
    }

    @Override // com.ss.android.ugc.aweme.qainvitation.b.b.a
    public final boolean d() {
        T t;
        b bVar = this.f76396h;
        if (bVar == null || (t = bVar.mData) == null || !t.a()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void c() {
        String str;
        String str2;
        super.c();
        T t = e().mData;
        if (t != null) {
            c cVar = (c) this.f76396h;
            String str3 = "";
            if (cVar != null && cVar.f119050a) {
                LogPbBean logPbBean = t.f121537b;
                if (logPbBean == null || (str2 = logPbBean.getImprId()) == null) {
                    str2 = str3;
                }
                this.f119070b = str2;
            }
            String str4 = t.f121538c;
            if (str4 == null) {
                str4 = str3;
            }
            this.f119071c = str4;
            ac.a.f91473a.a(this.f119071c, t.f121537b);
            b bVar = (b) this.f76397i;
            if (bVar != null) {
                g gVar = e().f119051b;
                if (!(gVar == null || (str = gVar.f121532c) == null)) {
                    str3 = str;
                }
                bVar.a(t, str3);
            }
            b bVar2 = (b) this.f76397i;
            if (bVar2 != null) {
                bVar2.b(true);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.qainvitation.b.b.a
    public final void a(com.ss.android.ugc.aweme.common.m mVar) {
        l.d(mVar, "");
        if (!(mVar instanceof b)) {
            mVar = null;
        }
        a_((b) mVar);
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        super.a_(exc);
        b bVar = (b) this.f76397i;
        if (bVar != null) {
            bVar.e();
        }
        b bVar2 = (b) this.f76397i;
        if (bVar2 != null) {
            bVar2.b(false);
        }
        this.f119070b = "";
    }

    @Override // com.ss.android.ugc.aweme.qainvitation.b.b.a
    public final void a(boolean z, g gVar) {
        l.d(gVar, "");
        super.a(Boolean.valueOf(z), gVar);
    }
}
