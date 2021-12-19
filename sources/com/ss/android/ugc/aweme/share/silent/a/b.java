package com.ss.android.ugc.aweme.share.silent.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.share.model.c;
import com.ss.android.ugc.aweme.sharer.k;
import f.a.d.f;
import h.f.b.l;
import h.z;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.sharer.b f124293a;

    static {
        Covode.recordClassIndex(81618);
    }

    public b(com.ss.android.ugc.aweme.sharer.b bVar) {
        l.d(bVar, "");
        this.f124293a = bVar;
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f124294a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f124295b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f124296c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f124297d;

        static {
            Covode.recordClassIndex(81619);
        }

        a(b bVar, Context context, c cVar, h.f.a.b bVar2) {
            this.f124294a = bVar;
            this.f124295b = context;
            this.f124296c = cVar;
            this.f124297d = bVar2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            com.ss.android.ugc.aweme.sharer.b bVar = this.f124294a.f124293a;
            l.b(str, "");
            bVar.a(new k(str, null, null, 6), this.f124295b);
            this.f124296c.b("url_form");
            this.f124297d.invoke(this.f124296c);
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
        com.ss.android.ugc.aweme.share.improve.c.c.b(shareUrl, "aweme", this.f124293a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).e(new a(this, context, cVar, bVar));
    }
}
