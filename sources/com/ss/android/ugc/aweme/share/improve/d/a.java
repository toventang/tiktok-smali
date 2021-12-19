package com.ss.android.ugc.aweme.share.improve.d;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.share.improve.c.c;
import com.ss.android.ugc.aweme.share.improve.d.h;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.sharer.b;
import com.ss.android.ugc.aweme.sharer.n;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Arrays;

public final class a implements o {

    /* renamed from: a  reason: collision with root package name */
    public final b f123850a;

    static {
        Covode.recordClassIndex(81292);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.d.a$a  reason: collision with other inner class name */
    public static final class C3208a implements h.a.AbstractC3215a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f123851a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AwemeSharePackage f123852b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f123853c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f123854d;

        static {
            Covode.recordClassIndex(81293);
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.d.a$a$b */
        static final class b extends m implements h.f.a.a<z> {
            final /* synthetic */ C3208a this$0;

            static {
                Covode.recordClassIndex(81295);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C3208a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.f123854d.invoke(false);
                return z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.share.improve.d.h.a.AbstractC3215a
        public final void b() {
            this.f123852b.f124595i.putString("share_form", "url_form");
        }

        @Override // com.ss.android.ugc.aweme.share.improve.d.h.a.AbstractC3215a
        public final void a() {
            h.a.a(this.f123852b, this.f123851a.f123850a.a(), this.f123853c, new C3209a(this), new b(this));
            this.f123852b.f124595i.putString("share_form", "video_form");
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.d.a$a$a  reason: collision with other inner class name */
        static final class C3209a extends m implements h.f.a.b<String, z> {
            final /* synthetic */ C3208a this$0;

            static {
                Covode.recordClassIndex(81294);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3209a(C3208a aVar) {
                super(1);
                this.this$0 = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(String str) {
                String str2;
                String str3 = str;
                l.d(str3, "");
                if (com.ss.android.ugc.aweme.share.m.h.a(this.this$0.f123851a.f123850a, this.this$0.f123852b.f124590d, 1)) {
                    str2 = this.this$0.f123852b.f124593g;
                } else {
                    str2 = "";
                }
                String string = d.a().getString(R.string.gfk);
                l.b(string, "");
                String a2 = com.a.a(string, Arrays.copyOf(new Object[]{this.this$0.f123852b.f124595i.getString("author_name")}, 1));
                l.b(a2, "");
                this.this$0.f123851a.f123850a.a(new n(c.a(str3, d.a()), null, str2, a2, null, 42), this.this$0.f123853c);
                this.this$0.f123854d.invoke(true);
                return z.f158842a;
            }
        }

        C3208a(a aVar, AwemeSharePackage awemeSharePackage, Context context, h.f.a.b bVar) {
            this.f123851a = aVar;
            this.f123852b = awemeSharePackage;
            this.f123853c = context;
            this.f123854d = bVar;
        }
    }

    public a(b bVar) {
        l.d(bVar, "");
        this.f123850a = bVar;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.d.o
    public final boolean a(Context context, AwemeSharePackage awemeSharePackage, h.f.a.b<? super Boolean, z> bVar) {
        l.d(context, "");
        l.d(awemeSharePackage, "");
        l.d(bVar, "");
        if (!com.ss.android.ugc.aweme.share.m.c.a(this.f123850a, false)) {
            return h.a.a(context, awemeSharePackage, this.f123850a.a(), new C3208a(this, awemeSharePackage, context, bVar));
        }
        if (!h.a.a(awemeSharePackage.a(), context)) {
            return true;
        }
        awemeSharePackage.f124595i.putString("share_form", "url_form");
        return false;
    }
}
