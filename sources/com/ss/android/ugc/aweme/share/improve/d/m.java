package com.ss.android.ugc.aweme.share.improve.d;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.share.improve.d.h;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.share.m.c;
import com.ss.android.ugc.aweme.sharer.b;
import com.ss.android.ugc.aweme.sharer.k;
import com.ss.android.ugc.aweme.sharer.n;
import com.ss.android.ugc.aweme.utils.cr;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.z;
import h.z;
import java.io.File;

public final class m implements o {

    /* renamed from: a  reason: collision with root package name */
    public final b f123903a;

    static {
        Covode.recordClassIndex(81336);
    }

    public static final class a implements h.a.AbstractC3215a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f123904a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f123905b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AwemeSharePackage f123906c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f123907d;

        static {
            Covode.recordClassIndex(81337);
        }

        static final class b extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(81340);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.f123907d.invoke(false);
                return z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.share.improve.d.h.a.AbstractC3215a
        public final void b() {
            this.f123906c.f124595i.putString("share_form", "url_form");
        }

        @Override // com.ss.android.ugc.aweme.share.improve.d.h.a.AbstractC3215a
        public final void a() {
            z.e eVar = new z.e();
            eVar.element = com.ss.android.ugc.aweme.share.f.b.b() ? (T) this.f123905b.getString(R.string.le) : com.ss.android.ugc.aweme.share.f.b.c() ? (T) this.f123905b.getString(R.string.lf) : com.ss.android.ugc.aweme.share.f.b.d() ? (T) this.f123905b.getString(R.string.lg) : null;
            h.a.a(this.f123906c, this.f123904a.f123903a.a(), this.f123905b, new C3217a(this, eVar), new b(this));
            this.f123906c.f124595i.putString("share_form", "video_form");
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.d.m$a$a  reason: collision with other inner class name */
        static final class C3217a extends h.f.b.m implements h.f.a.b<String, h.z> {
            final /* synthetic */ z.e $shareQuote;
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(81338);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3217a(a aVar, z.e eVar) {
                super(1);
                this.this$0 = aVar;
                this.$shareQuote = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(String str) {
                final String str2 = str;
                l.d(str2, "");
                if (c.a(this.this$0.f123904a.f123903a)) {
                    this.this$0.f123906c.a(this.this$0.f123904a.f123903a, new h.f.a.b<com.ss.android.ugc.aweme.sharer.h, h.z>(this) {
                        /* class com.ss.android.ugc.aweme.share.improve.d.m.a.C3217a.AnonymousClass1 */
                        final /* synthetic */ C3217a this$0;

                        static {
                            Covode.recordClassIndex(81339);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.sharer.h hVar) {
                            com.ss.android.ugc.aweme.sharer.h hVar2 = hVar;
                            l.d(hVar2, "");
                            String str = ((k) hVar2).f124573b;
                            this.this$0.$shareQuote.element = (T) (((String) this.this$0.$shareQuote.element) + ' ' + str);
                            com.ss.android.ugc.aweme.sharer.b bVar = this.this$0.this$0.f123904a.f123903a;
                            Uri a2 = cr.a(this.this$0.this$0.f123905b, new File(str2));
                            l.b(a2, "");
                            bVar.a(new n(a2, null, this.this$0.$shareQuote.element, null, null, 58), this.this$0.this$0.f123905b);
                            return h.z.f158842a;
                        }
                    });
                } else {
                    com.ss.android.ugc.aweme.sharer.b bVar = this.this$0.f123904a.f123903a;
                    Uri a2 = cr.a(this.this$0.f123905b, new File(str2));
                    l.b(a2, "");
                    bVar.a(new n(a2, null, this.$shareQuote.element, null, null, 58), this.this$0.f123905b);
                }
                this.this$0.f123907d.invoke(true);
                return h.z.f158842a;
            }
        }

        a(m mVar, Context context, AwemeSharePackage awemeSharePackage, h.f.a.b bVar) {
            this.f123904a = mVar;
            this.f123905b = context;
            this.f123906c = awemeSharePackage;
            this.f123907d = bVar;
        }
    }

    public m(b bVar) {
        l.d(bVar, "");
        this.f123903a = bVar;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.d.o
    public final boolean a(Context context, AwemeSharePackage awemeSharePackage, h.f.a.b<? super Boolean, h.z> bVar) {
        l.d(context, "");
        l.d(awemeSharePackage, "");
        l.d(bVar, "");
        if (!c.a(this.f123903a, false)) {
            return h.a.a(context, awemeSharePackage, this.f123903a.a(), new a(this, context, awemeSharePackage, bVar));
        }
        if (!h.a.a(awemeSharePackage.a(), context)) {
            return true;
        }
        awemeSharePackage.f124595i.putString("share_form", "url_form");
        return false;
    }
}
