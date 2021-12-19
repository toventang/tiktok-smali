package com.ss.android.ugc.aweme.share.improve.d;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.share.improve.d.h;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.share.m.c;
import com.ss.android.ugc.aweme.sharer.n;
import com.ss.android.ugc.aweme.utils.cr;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.File;

public final class b implements o {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.sharer.b f123855a;

    static {
        Covode.recordClassIndex(81296);
    }

    public static final class a implements h.a.AbstractC3215a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f123856a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AwemeSharePackage f123857b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f123858c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f123859d;

        static {
            Covode.recordClassIndex(81297);
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.d.b$a$b  reason: collision with other inner class name */
        static final class C3211b extends m implements h.f.a.a<z> {
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(81299);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3211b(a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.f123859d.invoke(false);
                return z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.share.improve.d.h.a.AbstractC3215a
        public final void b() {
            this.f123857b.f124595i.putString("share_form", "url_form");
        }

        @Override // com.ss.android.ugc.aweme.share.improve.d.h.a.AbstractC3215a
        public final void a() {
            h.a.a(this.f123857b, this.f123856a.f123855a.a(), this.f123858c, new C3210a(this), new C3211b(this));
            this.f123857b.f124595i.putString("share_form", "video_form");
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.d.b$a$a  reason: collision with other inner class name */
        static final class C3210a extends m implements h.f.a.b<String, z> {
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(81298);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3210a(a aVar) {
                super(1);
                this.this$0 = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(String str) {
                String str2 = str;
                l.d(str2, "");
                com.ss.android.ugc.aweme.sharer.b bVar = this.this$0.f123856a.f123855a;
                Uri a2 = cr.a(this.this$0.f123858c, new File(str2));
                l.b(a2, "");
                bVar.a(new n(a2, null, null, null, null, 62), this.this$0.f123858c);
                this.this$0.f123859d.invoke(true);
                return z.f158842a;
            }
        }

        a(b bVar, AwemeSharePackage awemeSharePackage, Context context, h.f.a.b bVar2) {
            this.f123856a = bVar;
            this.f123857b = awemeSharePackage;
            this.f123858c = context;
            this.f123859d = bVar2;
        }
    }

    public b(com.ss.android.ugc.aweme.sharer.b bVar) {
        l.d(bVar, "");
        this.f123855a = bVar;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.d.o
    public final boolean a(Context context, AwemeSharePackage awemeSharePackage, h.f.a.b<? super Boolean, z> bVar) {
        l.d(context, "");
        l.d(awemeSharePackage, "");
        l.d(bVar, "");
        if (!c.a(this.f123855a, true)) {
            return h.a.a(context, awemeSharePackage, this.f123855a.a(), new a(this, awemeSharePackage, context, bVar));
        }
        if (!h.a.a(awemeSharePackage.a(), context)) {
            return true;
        }
        awemeSharePackage.f124595i.putString("share_form", "url_form");
        return false;
    }
}
