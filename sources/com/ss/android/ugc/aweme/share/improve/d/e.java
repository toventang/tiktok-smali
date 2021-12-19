package com.ss.android.ugc.aweme.share.improve.d;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.share.improve.c.c;
import com.ss.android.ugc.aweme.share.improve.d.h;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.sharer.n;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class e implements o {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.sharer.b f123871a;

    static {
        Covode.recordClassIndex(81306);
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ h.f.a.b $actionCallback;

        static {
            Covode.recordClassIndex(81308);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h.f.a.b bVar) {
            super(0);
            this.$actionCallback = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$actionCallback.invoke(false);
            return z.f158842a;
        }
    }

    public e(com.ss.android.ugc.aweme.sharer.b bVar) {
        l.d(bVar, "");
        this.f123871a = bVar;
    }

    static final class a extends m implements h.f.a.b<String, z> {
        final /* synthetic */ h.f.a.b $actionCallback;
        final /* synthetic */ Context $context;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(81307);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, Context context, h.f.a.b bVar) {
            super(1);
            this.this$0 = eVar;
            this.$context = context;
            this.$actionCallback = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            String str2 = str;
            String str3 = "";
            l.d(str2, str3);
            com.ss.android.ugc.aweme.sharer.b bVar = this.this$0.f123871a;
            n nVar = new n(c.a(str2, d.a()), null, null, null, null, 62);
            String str4 = nVar.f124588g;
            if (str4 != null) {
                str3 = str4;
            }
            nVar.a("content_url", str3);
            nVar.a("media_type", "video/mp4");
            bVar.a(nVar, this.$context);
            this.$actionCallback.invoke(true);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.share.improve.d.o
    public final boolean a(Context context, AwemeSharePackage awemeSharePackage, h.f.a.b<? super Boolean, z> bVar) {
        l.d(context, "");
        l.d(awemeSharePackage, "");
        l.d(bVar, "");
        h.a.a(awemeSharePackage, this.f123871a.a(), context, new a(this, context, bVar), new b(bVar));
        awemeSharePackage.f124595i.putString("share_form", "video_form");
        return true;
    }
}
