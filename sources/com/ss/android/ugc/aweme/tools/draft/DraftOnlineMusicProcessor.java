package com.ss.android.ugc.aweme.tools.draft;

import androidx.lifecycle.i;
import androidx.lifecycle.v;
import b.g;
import b.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.concurrent.Callable;

public final class DraftOnlineMusicProcessor implements au, bb {

    /* renamed from: a  reason: collision with root package name */
    public boolean f139334a = true;

    /* renamed from: b  reason: collision with root package name */
    public String f139335b;

    /* renamed from: c  reason: collision with root package name */
    final c f139336c;

    /* renamed from: d  reason: collision with root package name */
    m<? super Boolean, ? super String, z> f139337d;

    /* renamed from: e  reason: collision with root package name */
    h.f.a.a<z> f139338e;

    static {
        Covode.recordClassIndex(91085);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        this.f139337d = null;
        this.f139338e = null;
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.bb
    public final void a() {
        if (com.ss.android.ugc.aweme.shortvideo.s.c.a(com.ss.android.ugc.aweme.port.in.i.f115645a)) {
            com.ss.android.ugc.aweme.shortvideo.c cVar = this.f139336c.f83185f;
            l.b(cVar.getMusicId(), "");
            c cVar2 = this.f139336c;
            l.b(cVar, "");
            j jVar = new j();
            b.i.b(new a(this, cVar, cVar2, jVar), b.i.f4824a);
            b.i<TResult> iVar = jVar.f4869a;
            l.b(iVar, "");
            iVar.a(new b(this), b.i.f4826c, null);
            return;
        }
        com.ss.android.ugc.aweme.shortvideo.c cVar3 = this.f139336c.f83185f;
        l.b(cVar3, "");
        if (ax.a(cVar3)) {
            c cVar4 = this.f139336c;
            com.ss.android.ugc.aweme.shortvideo.c cVar5 = cVar4.f83185f;
            l.b(cVar5, "");
            cVar4.f83187h = ax.b(cVar5);
            bj.a("draft_music_process, Network not available, Online music file exist");
            m<? super Boolean, ? super String, z> mVar = this.f139337d;
            if (mVar != null) {
                mVar.invoke(true, null);
            }
        } else {
            bj.b("draft_music_process, Network not available, Online music file not exist, draft resume fail");
        }
        h.f.a.a<z> aVar = this.f139338e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DraftOnlineMusicProcessor f139339a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.c f139340b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f139341c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f139342d;

        static {
            Covode.recordClassIndex(91086);
        }

        a(DraftOnlineMusicProcessor draftOnlineMusicProcessor, com.ss.android.ugc.aweme.shortvideo.c cVar, c cVar2, j jVar) {
            this.f139339a = draftOnlineMusicProcessor;
            this.f139340b = cVar;
            this.f139341c = cVar2;
            this.f139342d = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x006b, code lost:
            if (com.bytedance.common.utility.m.a(r0) == false) goto L_0x0013;
         */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x010e  */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x0018  */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
            // Method dump skipped, instructions count: 326
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.DraftOnlineMusicProcessor.a.call():java.lang.Object");
        }
    }

    static final class b<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DraftOnlineMusicProcessor f139344a;

        static {
            Covode.recordClassIndex(91088);
        }

        b(DraftOnlineMusicProcessor draftOnlineMusicProcessor) {
            this.f139344a = draftOnlineMusicProcessor;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            h.f.a.a<z> aVar = this.f139344a.f139338e;
            if (aVar != null) {
                aVar.invoke();
            }
            m<? super Boolean, ? super String, z> mVar = this.f139344a.f139337d;
            if (mVar != null) {
                mVar.invoke(Boolean.valueOf(this.f139344a.f139334a), this.f139344a.f139335b);
            }
            return z.f158842a;
        }
    }

    public DraftOnlineMusicProcessor(c cVar, m<? super Boolean, ? super String, z> mVar, h.f.a.a<z> aVar) {
        l.d(cVar, "");
        this.f139336c = cVar;
        this.f139337d = mVar;
        this.f139338e = aVar;
    }
}
