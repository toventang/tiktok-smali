package com.ss.android.ugc.aweme.story.feed.detail;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.story.g;
import f.a.d.f;
import h.a.n;
import h.f.b.l;

public final class b extends a {
    static {
        Covode.recordClassIndex(90111);
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f137692a;

        static {
            Covode.recordClassIndex(90112);
        }

        a(b bVar) {
            this.f137692a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f137692a.f137688d = false;
            this.f137692a.a(n.a(obj));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.detail.b$b  reason: collision with other inner class name */
    static final class C3620b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f137693a;

        static {
            Covode.recordClassIndex(90113);
        }

        C3620b(b bVar) {
            this.f137693a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f137693a.f137688d = false;
            com.ss.android.ugc.aweme.story.j.a.c("StoryCommonDetailOperator", String.valueOf(((Throwable) obj).getMessage()));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.story.feed.detail.a
    public final void a(com.ss.android.ugc.aweme.feed.param.b bVar) {
        l.d(bVar, "");
        String aid = bVar.getAid();
        com.ss.android.ugc.aweme.story.api.b e2 = g.f137757a.e();
        l.b(aid, "");
        f.a.b.b a2 = e2.a(aid, false).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new a(this), new C3620b(this));
        l.b(a2, "");
        f.a.j.a.a(a2, this.f137685a);
    }
}
