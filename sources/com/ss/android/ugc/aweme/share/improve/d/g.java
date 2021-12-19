package com.ss.android.ugc.aweme.share.improve.d;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.share.improve.c.c;
import com.ss.android.ugc.aweme.share.improve.d.h;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.sharer.b;
import com.ss.android.ugc.aweme.sharer.n;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class g implements o {

    /* renamed from: a  reason: collision with root package name */
    public final b f123877a;

    static {
        Covode.recordClassIndex(81313);
    }

    public static final class a implements h.a.AbstractC3215a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f123878a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AwemeSharePackage f123879b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f123880c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f123881d;

        static {
            Covode.recordClassIndex(81314);
        }

        static final class b extends m implements h.f.a.a<z> {
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(81316);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.f123881d.invoke(false);
                return z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.share.improve.d.h.a.AbstractC3215a
        public final void b() {
            this.f123879b.f124595i.putString("share_form", "url_form");
        }

        @Override // com.ss.android.ugc.aweme.share.improve.d.h.a.AbstractC3215a
        public final void a() {
            h.a.a(this.f123879b, this.f123878a.f123877a.a(), this.f123880c, new C3214a(this), new b(this));
            this.f123879b.f124595i.putString("share_form", "video_form");
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.d.g$a$a  reason: collision with other inner class name */
        static final class C3214a extends m implements h.f.a.b<String, z> {
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(81315);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3214a(a aVar) {
                super(1);
                this.this$0 = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(String str) {
                String str2 = str;
                l.d(str2, "");
                this.this$0.f123878a.f123877a.a(new n(c.a(str2, d.a()), null, null, null, null, 62), this.this$0.f123880c);
                this.this$0.f123881d.invoke(true);
                return z.f158842a;
            }
        }

        a(g gVar, AwemeSharePackage awemeSharePackage, Context context, h.f.a.b bVar) {
            this.f123878a = gVar;
            this.f123879b = awemeSharePackage;
            this.f123880c = context;
            this.f123881d = bVar;
        }
    }

    public g(b bVar) {
        l.d(bVar, "");
        this.f123877a = bVar;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.d.o
    public final boolean a(Context context, AwemeSharePackage awemeSharePackage, h.f.a.b<? super Boolean, z> bVar) {
        l.d(context, "");
        l.d(awemeSharePackage, "");
        l.d(bVar, "");
        if (!com.ss.android.ugc.aweme.share.m.c.a(this.f123877a, true)) {
            return h.a.a(context, awemeSharePackage, this.f123877a.a(), new a(this, awemeSharePackage, context, bVar));
        }
        if (!h.a.a(awemeSharePackage.a(), context)) {
            return true;
        }
        awemeSharePackage.f124595i.putString("share_form", "url_form");
        return false;
    }
}
