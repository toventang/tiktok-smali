package com.ss.android.ugc.aweme.share.improve.d;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.share.improve.d.h;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.sharer.b;
import com.ss.android.ugc.aweme.sharer.n;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class c implements o {

    /* renamed from: a  reason: collision with root package name */
    public final b f123860a;

    static {
        Covode.recordClassIndex(81300);
    }

    public static final class a implements h.a.AbstractC3215a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f123861a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AwemeSharePackage f123862b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f123863c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sharer.b f123864d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f123865e;

        static {
            Covode.recordClassIndex(81301);
        }

        static final class b extends m implements h.f.a.a<z> {
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(81303);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.f123865e.invoke(false);
                return z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.share.improve.d.h.a.AbstractC3215a
        public final void b() {
            this.f123862b.f124595i.putString("share_form", "url_form");
        }

        @Override // com.ss.android.ugc.aweme.share.improve.d.h.a.AbstractC3215a
        public final void a() {
            h.a.a(this.f123862b, this.f123861a.f123860a.a(), this.f123863c, new C3212a(this), new b(this));
            this.f123862b.f124595i.putString("share_form", "video_form");
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.d.c$a$a  reason: collision with other inner class name */
        static final class C3212a extends m implements h.f.a.b<String, z> {
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(81302);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3212a(a aVar) {
                super(1);
                this.this$0 = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(String str) {
                String str2 = str;
                l.d(str2, "");
                com.ss.android.ugc.aweme.sharer.b bVar = this.this$0.f123864d;
                if (bVar != null) {
                    n nVar = new n(com.ss.android.ugc.aweme.share.improve.c.c.a(str2, this.this$0.f123863c), null, null, null, null, 62);
                    String str3 = nVar.f124588g;
                    if (str3 == null) {
                        str3 = "";
                    }
                    nVar.a("content_url", str3);
                    l.b("597615686992125", "");
                    nVar.a("fb_app_id", "597615686992125");
                    nVar.a("media_type", "video/mp4");
                    bVar.a((com.ss.android.ugc.aweme.sharer.h) nVar, this.this$0.f123863c);
                }
                this.this$0.f123865e.invoke(true);
                return z.f158842a;
            }
        }

        a(c cVar, AwemeSharePackage awemeSharePackage, Context context, com.ss.android.ugc.aweme.sharer.b bVar, h.f.a.b bVar2) {
            this.f123861a = cVar;
            this.f123862b = awemeSharePackage;
            this.f123863c = context;
            this.f123864d = bVar;
            this.f123865e = bVar2;
        }
    }

    public c(b bVar) {
        l.d(bVar, "");
        this.f123860a = bVar;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.d.o
    public final boolean a(Context context, AwemeSharePackage awemeSharePackage, h.f.a.b<? super Boolean, z> bVar) {
        l.d(context, "");
        l.d(awemeSharePackage, "");
        l.d(bVar, "");
        b a2 = com.ss.android.ugc.aweme.sharer.c.a("facebook_story", null);
        if (!com.ss.android.ugc.aweme.share.m.c.a(this.f123860a, false) && a2 != null && a2.b(context)) {
            return h.a.a(context, awemeSharePackage, this.f123860a.a(), new a(this, awemeSharePackage, context, a2, bVar));
        }
        if (!h.a.a(awemeSharePackage.a(), context)) {
            return true;
        }
        awemeSharePackage.f124595i.putString("share_form", "url_form");
        return false;
    }
}
