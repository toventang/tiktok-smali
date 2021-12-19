package com.ss.android.ugc.aweme.tools.draft.j;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.DraftDBSaveResult;
import com.ss.android.ugc.aweme.draft.n;
import com.ss.android.ugc.aweme.port.internal.c;
import com.ss.android.ugc.aweme.port.internal.d;
import com.ss.android.ugc.aweme.port.internal.e;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bn;
import com.ss.android.ugc.aweme.tools.draft.ai;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final h f139798a = i.a((h.f.a.a) b.f139803a);

    /* renamed from: b  reason: collision with root package name */
    private final h f139799b = i.a((h.f.a.a) C3690a.f139802a);

    /* renamed from: c  reason: collision with root package name */
    private boolean f139800c = true;

    /* renamed from: d  reason: collision with root package name */
    private final List<n> f139801d = new ArrayList();

    static {
        Covode.recordClassIndex(91380);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.c
    public final e a() {
        return (e) this.f139798a.getValue();
    }

    @Override // com.ss.android.ugc.aweme.port.internal.c
    public final d b() {
        return (d) this.f139799b.getValue();
    }

    @Override // com.ss.android.ugc.aweme.port.internal.c
    public final boolean d() {
        return this.f139800c;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.j.a$a  reason: collision with other inner class name */
    static final class C3690a extends m implements h.f.a.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3690a f139802a = new C3690a();

        static {
            Covode.recordClassIndex(91381);
        }

        C3690a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            return new b();
        }
    }

    static final class b extends m implements h.f.a.a<com.ss.android.ugc.aweme.tools.draft.h.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f139803a = new b();

        static {
            Covode.recordClassIndex(91382);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.tools.draft.h.c invoke() {
            return new com.ss.android.ugc.aweme.tools.draft.h.c();
        }
    }

    @Override // com.ss.android.ugc.aweme.port.internal.c
    public final List<com.ss.android.ugc.aweme.draft.model.c> c() {
        List<com.ss.android.ugc.aweme.draft.model.c> a2 = ai.a().a((com.ss.android.ugc.aweme.draft.m) null);
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.port.internal.c
    public final void a(boolean z) {
        this.f139800c = z;
    }

    @Override // com.ss.android.ugc.aweme.port.internal.c
    public final VideoPublishEditModel b(com.ss.android.ugc.aweme.draft.model.c cVar) {
        l.d(cVar, "");
        new bn("DraftInternalService");
        VideoPublishEditModel a2 = bn.a(cVar);
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.port.internal.c
    public final void c(com.ss.android.ugc.aweme.draft.model.c cVar) {
        l.d(cVar, "");
        c.a().notifyDraftUpdate(cVar);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.c
    public final DraftDBSaveResult a(com.ss.android.ugc.aweme.draft.model.c cVar) {
        l.d(cVar, "");
        DraftDBSaveResult a2 = ai.a().a(cVar);
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.port.internal.c
    public final void a(n nVar) {
        l.d(nVar, "");
        if (!this.f139801d.contains(nVar)) {
            this.f139801d.add(nVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.port.internal.c
    public final int a(com.ss.android.ugc.aweme.draft.model.c cVar, String str) {
        l.d(cVar, "");
        l.d(str, "");
        return ai.a().a(cVar, str);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.c
    public final VideoPublishEditModel b(com.ss.android.ugc.aweme.draft.model.c cVar, String str) {
        l.d(cVar, "");
        l.d(str, "");
        new bn(str);
        VideoPublishEditModel a2 = bn.a(cVar);
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.port.internal.c
    public final void a(com.ss.android.ugc.aweme.draft.model.c cVar, boolean z) {
        l.d(cVar, "");
        Iterator<T> it = this.f139801d.iterator();
        while (it.hasNext()) {
            it.next().a(cVar, z);
        }
    }
}
