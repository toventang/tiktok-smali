package com.ss.android.ugc.aweme.share.improve.d;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.share.improve.d.h;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.share.m.c;
import com.ss.android.ugc.aweme.sharer.b;
import com.ss.android.ugc.aweme.sharer.n;
import com.ss.android.ugc.aweme.utils.cr;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.File;

public final class f implements o {

    /* renamed from: a  reason: collision with root package name */
    public final b f123872a;

    static {
        Covode.recordClassIndex(81309);
    }

    public static final class a implements h.a.AbstractC3215a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f123873a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AwemeSharePackage f123874b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f123875c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f123876d;

        static {
            Covode.recordClassIndex(81310);
        }

        static final class b extends m implements h.f.a.a<z> {
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(81312);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.f123876d.invoke(false);
                return z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.share.improve.d.h.a.AbstractC3215a
        public final void b() {
            this.f123874b.f124595i.putString("share_form", "url_form");
        }

        @Override // com.ss.android.ugc.aweme.share.improve.d.h.a.AbstractC3215a
        public final void a() {
            h.a.a(this.f123874b, this.f123873a.f123872a.a(), this.f123875c, new C3213a(this), new b(this));
            this.f123874b.f124595i.putString("share_form", "video_form");
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.d.f$a$a  reason: collision with other inner class name */
        static final class C3213a extends m implements h.f.a.b<String, z> {
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(81311);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3213a(a aVar) {
                super(1);
                this.this$0 = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(String str) {
                String str2 = str;
                l.d(str2, "");
                com.ss.android.ugc.aweme.sharer.b bVar = this.this$0.f123873a.f123872a;
                Uri a2 = cr.a(this.this$0.f123875c, new File(str2));
                l.b(a2, "");
                bVar.a(new n(a2, null, null, null, null, 62), this.this$0.f123875c);
                this.this$0.f123876d.invoke(true);
                return z.f158842a;
            }
        }

        a(f fVar, AwemeSharePackage awemeSharePackage, Context context, h.f.a.b bVar) {
            this.f123873a = fVar;
            this.f123874b = awemeSharePackage;
            this.f123875c = context;
            this.f123876d = bVar;
        }
    }

    public f(b bVar) {
        l.d(bVar, "");
        this.f123872a = bVar;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.d.o
    public final boolean a(Context context, AwemeSharePackage awemeSharePackage, h.f.a.b<? super Boolean, z> bVar) {
        l.d(context, "");
        l.d(awemeSharePackage, "");
        l.d(bVar, "");
        if (!c.a(this.f123872a, true)) {
            return h.a.a(context, awemeSharePackage, this.f123872a.a(), new a(this, awemeSharePackage, context, bVar));
        }
        if (!h.a.a(awemeSharePackage.a(), context)) {
            return true;
        }
        awemeSharePackage.f124595i.putString("share_form", "url_form");
        return false;
    }
}
