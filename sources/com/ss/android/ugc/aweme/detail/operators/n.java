package com.ss.android.ugc.aweme.detail.operators;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.common.f;
import com.ss.android.ugc.aweme.detail.i.i;
import com.ss.android.ugc.aweme.detail.i.j;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.util.List;

public final class n extends k {

    /* renamed from: c  reason: collision with root package name */
    public static final a f79815c = new a((byte) 0);

    static {
        Covode.recordClassIndex(49648);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49649);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b extends j {

        /* renamed from: a  reason: collision with root package name */
        public com.ss.android.ugc.aweme.feed.param.b f79816a;

        static {
            Covode.recordClassIndex(49650);
        }

        @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o, com.ss.android.ugc.aweme.detail.i.j
        public final void c() {
            String upvoteId;
            super.c();
            com.ss.android.ugc.aweme.feed.param.b bVar = this.f79816a;
            if (bVar == null || (upvoteId = bVar.getUpvoteId()) == null || upvoteId.length() == 0) {
                com.ss.android.ugc.aweme.common.b bVar2 = this.f76396h;
                l.b(bVar2, "");
                T t = bVar2.mData;
                if (t != null) {
                    com.ss.android.ugc.aweme.notice.api.services.b.f112773a.b().a((Aweme) t);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.k, com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean init(Fragment fragment) {
        l.d(fragment, "");
        this.f79810b = new b();
        return super.init(fragment);
    }

    public final List<Aweme> a(com.ss.android.ugc.aweme.feed.param.b bVar) {
        String aid;
        String upvoteId;
        String str;
        j jVar = this.f79810b;
        if (!(jVar instanceof b)) {
            jVar = null;
        }
        b bVar2 = (b) jVar;
        if (bVar2 != null) {
            bVar2.f79816a = bVar;
        }
        if (bVar == null || (aid = bVar.getAid()) == null || aid.length() == 0 || ((upvoteId = bVar.getUpvoteId()) != null && upvoteId.length() != 0)) {
            return null;
        }
        i iVar = this.f79809a;
        l.b(iVar, "");
        T t = iVar.mData;
        if (t == null) {
            com.ss.android.ugc.aweme.notice.api.services.a b2 = com.ss.android.ugc.aweme.notice.api.services.b.f112773a.b();
            String aid2 = bVar.getAid();
            l.b(aid2, "");
            t = b2.a(aid2);
        }
        StringBuilder append = new StringBuilder("getAwemeList:").append(bVar.getAid()).append(", ");
        if (t != null) {
            str = t.getAid();
        } else {
            str = null;
        }
        f.b("DetailFromNoticeOperator", append.append(str).toString());
        if (t != null) {
            Aweme a2 = AwemeService.b().a(t);
            l.b(a2, "");
            return h.a.n.c(a2);
        }
        return null;
    }
}
