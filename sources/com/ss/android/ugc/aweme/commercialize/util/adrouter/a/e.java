package com.ss.android.ugc.aweme.commercialize.util.adrouter.a;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.f;
import com.ss.android.ugc.aweme.commercialize.d.a;
import com.ss.android.ugc.aweme.commercialize.util.a.b;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import h.z;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public class e extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f75404d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private final h f75405a = i.a((h.f.a.a) new d(this));

    static {
        Covode.recordClassIndex(46540);
    }

    private final Intent e() {
        return (Intent) this.f75405a.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(46541);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f75406a;

        static {
            Covode.recordClassIndex(46543);
        }

        c(e eVar) {
            this.f75406a = eVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                com.ss.android.ugc.aweme.commercialize.d dVar = com.ss.android.ugc.aweme.commercialize.d.f73752a;
                l.b(dVar, "");
                dVar.f73753b = this.f75406a.d().f75407a.f75414a;
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            }
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.a<Intent> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(46544);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Intent invoke() {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(this.this$0.d().f75409c.f75440a));
            intent.putExtra("open_url", this.this$0.d().f75409c.f75440a);
            return intent;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.e
    public boolean a() {
        if (!d().f75409c.f75441b && !TextUtils.isEmpty(d().f75409c.f75440a)) {
            return f.a(c(), e());
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.e
    public final boolean b() {
        String str;
        com.ss.android.ugc.aweme.commercialize.util.adrouter.a.f75399a.a("ad_lynx_download_ThirdAppOpenUrlHandler_doHandle", (JSONObject) null, "begin", String.valueOf(d().f75407a.f75416c));
        Intent e2 = e();
        String str2 = d().f75409c.f75440a;
        if (TextUtils.isEmpty(d().f75409c.f75442c)) {
            str = d().f75411e.f75435a;
        } else {
            str = d().f75409c.f75442c;
        }
        if (d().f75409c.f75443d) {
            String a2 = com.ss.android.ugc.aweme.commercialize.util.a.a.a(str2, str);
            if (a2 != null) {
                str2 = a2;
            }
            com.ss.android.ugc.aweme.commercialize.util.a.a.f75391a = new b.a().a(new b(this, str)).f75479a;
        } else if (p.a((CharSequence) str2, (CharSequence) "__back_url__", false)) {
            String builder = Uri.parse(a.AbstractC1652a.f73756a).buildUpon().appendQueryParameter("tag", str).toString();
            l.b(builder, "");
            String encode = Uri.encode(builder);
            l.b(encode, "");
            str2 = p.a(str2, "__back_url__", encode, false);
            b.i.b(new c(this), b.i.f4824a);
        }
        Uri parse = Uri.parse(str2);
        if (!TextUtils.isEmpty(d().f75407a.f75421h)) {
            parse = parse.buildUpon().appendQueryParameter("source_aid", d().f75407a.f75421h).build();
        }
        e2.setData(parse);
        com.ss.android.ugc.aweme.commercialize.util.adrouter.a.f75399a.a("ad_lynx_download_ThirdAppOpenUrlHandler_doHandle", (JSONObject) null, "startActivitySafely", String.valueOf(d().f75407a.f75416c));
        return a(c(), e2);
    }

    static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.commercialize.util.a.b, z> {
        final /* synthetic */ String $backUrlTag;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(46542);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar, String str) {
            super(1);
            this.this$0 = eVar;
            this.$backUrlTag = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.commercialize.util.a.b bVar) {
            com.ss.android.ugc.aweme.commercialize.util.a.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.f75396b = this.this$0.d().f75407a.f75416c;
            bVar2.f75397c = this.this$0.d().f75407a.f75417d;
            bVar2.f75398d = this.this$0.d().f75407a.f75418e;
            bVar2.f75395a = this.$backUrlTag;
            return z.f158842a;
        }
    }
}
