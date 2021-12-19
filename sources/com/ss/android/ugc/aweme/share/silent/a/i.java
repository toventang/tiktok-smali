package com.ss.android.ugc.aweme.share.silent.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.share.model.c;
import com.ss.android.ugc.aweme.sharer.k;
import com.ss.android.ugc.aweme.sharer.n;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import h.f.b.z;

public final class i implements a {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.sharer.b f124316a;

    static {
        Covode.recordClassIndex(81628);
    }

    public i(com.ss.android.ugc.aweme.sharer.b bVar) {
        l.d(bVar, "");
        this.f124316a = bVar;
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f124317a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f124318b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f124319c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f124320d;

        static {
            Covode.recordClassIndex(81629);
        }

        a(i iVar, c cVar, Context context, h.f.a.b bVar) {
            this.f124317a = iVar;
            this.f124318b = cVar;
            this.f124319c = context;
            this.f124320d = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            c cVar = this.f124318b;
            l.b(str, "");
            cVar.a(str);
            this.f124317a.f124316a.a(new k(this.f124318b.f124107b, null, null, 6), this.f124319c);
            this.f124318b.b("url_form");
            this.f124320d.invoke(this.f124318b);
        }
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f124321a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f124322b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f124323c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f124324d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c f124325e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f124326f;

        static {
            Covode.recordClassIndex(81630);
        }

        b(i iVar, z.e eVar, String str, Context context, c cVar, h.f.a.b bVar) {
            this.f124321a = iVar;
            this.f124322b = eVar;
            this.f124323c = str;
            this.f124324d = context;
            this.f124325e = cVar;
            this.f124326f = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f124322b.element = (T) (((String) this.f124322b.element) + ' ' + ((String) obj));
            com.ss.android.ugc.aweme.sharer.b bVar = this.f124321a.f124316a;
            n nVar = new n(com.ss.android.ugc.aweme.share.improve.c.c.a(this.f124323c, this.f124324d), this.f124323c, this.f124322b.element, null, null, 56);
            String str = nVar.f124588g;
            if (str == null) {
                str = "";
            }
            nVar.a("content_url", str);
            nVar.a("media_type", "video/mp4");
            bVar.a(nVar, this.f124324d);
            this.f124325e.b("video_form");
            this.f124326f.invoke(this.f124325e);
        }
    }

    @Override // com.ss.android.ugc.aweme.share.silent.a.a
    public final void a(Context context, String str, c cVar, h.f.a.b<? super c, h.z> bVar) {
        String str2 = "";
        l.d(context, str2);
        l.d(str, str2);
        l.d(cVar, str2);
        l.d(bVar, str2);
        boolean z = true;
        if (com.bytedance.ies.abmock.b.a().a(true, "whatsapp_share_type", 0) != 1) {
            z = false;
        }
        if (z || com.ss.android.ugc.aweme.share.f.b.a()) {
            ShareInfo shareInfo = cVar.f124109d.getShareInfo();
            l.b(shareInfo, str2);
            String shareUrl = shareInfo.getShareUrl();
            l.b(shareUrl, str2);
            com.ss.android.ugc.aweme.share.improve.c.c.b(shareUrl, "aweme", this.f124316a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).e(new a(this, cVar, context, bVar));
            return;
        }
        z.e eVar = new z.e();
        eVar.element = com.ss.android.ugc.aweme.share.f.b.b() ? (T) context.getString(R.string.le) : com.ss.android.ugc.aweme.share.f.b.c() ? (T) context.getString(R.string.lf) : com.ss.android.ugc.aweme.share.f.b.d() ? (T) context.getString(R.string.lg) : null;
        if (com.ss.android.ugc.aweme.share.m.c.a(this.f124316a)) {
            ShareInfo shareInfo2 = cVar.f124109d.getShareInfo();
            l.b(shareInfo2, str2);
            String shareUrl2 = shareInfo2.getShareUrl();
            l.b(shareUrl2, str2);
            com.ss.android.ugc.aweme.share.improve.c.c.b(shareUrl2, "aweme", this.f124316a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).e(new b(this, eVar, str, context, cVar, bVar));
            return;
        }
        com.ss.android.ugc.aweme.sharer.b bVar2 = this.f124316a;
        n nVar = new n(com.ss.android.ugc.aweme.share.improve.c.c.a(str, context), str, null, null, null, 60);
        String str3 = nVar.f124588g;
        if (str3 != null) {
            str2 = str3;
        }
        nVar.a("content_url", str2);
        nVar.a("media_type", "video/mp4");
        bVar2.a(nVar, context);
        cVar.b("video_form");
        bVar.invoke(cVar);
    }
}
