package com.ss.android.ugc.aweme.share.improve.d;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.share.improve.d.h;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.utils.cr;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.File;

public final class n implements o {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.sharer.b f123908a;

    static {
        Covode.recordClassIndex(81341);
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ h.f.a.b $actionCallback;

        static {
            Covode.recordClassIndex(81343);
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

    public n(com.ss.android.ugc.aweme.sharer.b bVar) {
        l.d(bVar, "");
        this.f123908a = bVar;
    }

    static final class a extends m implements h.f.a.b<String, z> {
        final /* synthetic */ h.f.a.b $actionCallback;
        final /* synthetic */ Context $context;
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(81342);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(n nVar, Context context, h.f.a.b bVar) {
            super(1);
            this.this$0 = nVar;
            this.$context = context;
            this.$actionCallback = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            String str2 = str;
            l.d(str2, "");
            com.ss.android.ugc.aweme.sharer.b bVar = this.this$0.f123908a;
            Uri a2 = cr.a(this.$context, new File(str2));
            l.b(a2, "");
            bVar.a(new com.ss.android.ugc.aweme.sharer.n(a2, null, null, null, null, 62), this.$context);
            this.$actionCallback.invoke(true);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.share.improve.d.o
    public final boolean a(Context context, AwemeSharePackage awemeSharePackage, h.f.a.b<? super Boolean, z> bVar) {
        l.d(context, "");
        l.d(awemeSharePackage, "");
        l.d(bVar, "");
        h.a.a(awemeSharePackage, this.f123908a.a(), context, new a(this, context, bVar), new b(bVar));
        awemeSharePackage.f124595i.putString("share_form", "video_form");
        return true;
    }
}
