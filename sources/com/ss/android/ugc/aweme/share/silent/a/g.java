package com.ss.android.ugc.aweme.share.silent.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.share.model.c;
import com.ss.android.ugc.aweme.sharer.b;
import com.ss.android.ugc.aweme.sharer.k;
import f.a.d.f;
import h.f.b.l;
import h.z;

public final class g implements a {

    /* renamed from: a  reason: collision with root package name */
    public final b f124303a;

    static {
        Covode.recordClassIndex(81624);
    }

    public g(b bVar) {
        l.d(bVar, "");
        this.f124303a = bVar;
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f124304a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f124305b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f124306c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f124307d;

        static {
            Covode.recordClassIndex(81625);
        }

        a(g gVar, Context context, c cVar, h.f.a.b bVar) {
            this.f124304a = gVar;
            this.f124305b = context;
            this.f124306c = cVar;
            this.f124307d = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            b bVar = this.f124304a.f124303a;
            l.b(str, "");
            bVar.a(new k(str, null, null, 6), this.f124305b);
            this.f124306c.b("url_form");
            this.f124307d.invoke(this.f124306c);
        }
    }

    @Override // com.ss.android.ugc.aweme.share.silent.a.a
    public final void a(Context context, String str, c cVar, h.f.a.b<? super c, z> bVar) {
        l.d(context, "");
        l.d(str, "");
        l.d(cVar, "");
        l.d(bVar, "");
        ShareInfo shareInfo = cVar.f124109d.getShareInfo();
        l.b(shareInfo, "");
        String shareUrl = shareInfo.getShareUrl();
        l.b(shareUrl, "");
        com.ss.android.ugc.aweme.share.improve.c.c.b(shareUrl, "aweme", this.f124303a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).e(new a(this, context, cVar, bVar));
    }
}
