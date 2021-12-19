package com.ss.android.ugc.aweme.commercialize.util.adrouter;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.log.a.a;
import com.ss.android.ugc.aweme.commercialize.util.adrouter.a.e;
import com.ss.android.ugc.aweme.commercialize.util.adrouter.c;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Locale;
import java.util.Objects;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f75461a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(46555);
    }

    public static final class a extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f75462a;

        static {
            Covode.recordClassIndex(46556);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.a.e, com.ss.android.ugc.aweme.commercialize.util.adrouter.e
        public final boolean a() {
            String str;
            String str2 = this.f75462a.f75409c.f75440a;
            if (TextUtils.isEmpty(str2)) {
                return false;
            }
            Uri parse = Uri.parse(str2);
            l.b(parse, "");
            String scheme = parse.getScheme();
            if (scheme != null) {
                Locale locale = Locale.getDefault();
                l.b(locale, "");
                Objects.requireNonNull(scheme, "null cannot be cast to non-null type java.lang.String");
                str = scheme.toLowerCase(locale);
                l.b(str, "");
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str) || !l.a((Object) "market", (Object) str)) {
                return super.a();
            }
            return false;
        }

        a(b bVar) {
            this.f75462a = bVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.util.adrouter.d$a$a  reason: collision with other inner class name */
        static final class C1719a extends m implements b<Boolean, z> {
            final /* synthetic */ b $params;

            static {
                Covode.recordClassIndex(46557);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1719a(b bVar) {
                super(1);
                this.$params = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(Boolean bool) {
                String str;
                boolean booleanValue = bool.booleanValue();
                a.b a2 = com.ss.android.ugc.aweme.commercialize.log.a.a.a();
                a2.f74715a = this.$params.f75411e.f75435a;
                String str2 = "landing_deeplink_success";
                if (booleanValue) {
                    str = str2;
                } else {
                    str = "landing_deeplink_failed";
                }
                a2.f74716b = str;
                a2.a(Long.valueOf(this.$params.f75407a.f75416c)).c(this.$params.f75407a.f75417d).b(Long.valueOf(this.$params.f75407a.f75418e)).a(this.$params.f75411e.f75436b).c();
                String str3 = this.$params.f75411e.f75435a;
                if (!booleanValue) {
                    str2 = "landing_deeplink_failed";
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a(str3, str2, String.valueOf(this.$params.f75407a.f75416c), this.$params.f75407a.f75417d, String.valueOf(this.$params.f75407a.f75418e)).b("refer", this.$params.f75411e.f75436b).c();
                return z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.a.a
        public final void a(boolean z, b bVar) {
            l.d(bVar, "");
            super.a(z, bVar);
            if (z) {
                a.b a2 = com.ss.android.ugc.aweme.commercialize.log.a.a.a();
                a2.f74715a = bVar.f75411e.f75435a;
                a2.f74716b = "landing_open_url_app";
                a2.a(Long.valueOf(bVar.f75407a.f75416c)).c(bVar.f75407a.f75417d).b(Long.valueOf(bVar.f75407a.f75418e)).a(bVar.f75411e.f75436b).c();
                com.bytedance.ies.ugc.aweme.rich.a.a.a(bVar.f75411e.f75435a, "landing_open_url_app", String.valueOf(bVar.f75407a.f75416c), bVar.f75407a.f75417d, String.valueOf(bVar.f75407a.f75418e)).b("refer", bVar.f75411e.f75436b).c();
                a.f75399a.a(new C1719a(bVar));
            }
        }
    }

    public static final f a(Context context, b bVar) {
        l.d(context, "");
        l.d(bVar, "");
        return new c.a().a(bVar).a(context).a(a.f75399a.c(null)).a(a.f75399a.b((b<? super Boolean, z>) null)).a(new com.ss.android.ugc.aweme.commercialize.util.adrouter.a.b()).a(new com.ss.android.ugc.aweme.commercialize.util.adrouter.a.c()).a(new a(bVar)).f75460a;
    }
}
