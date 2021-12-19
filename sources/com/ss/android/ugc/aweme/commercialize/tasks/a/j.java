package com.ss.android.ugc.aweme.commercialize.tasks.a;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.c.a.g;
import com.ss.android.common.util.f;
import com.ss.android.ugc.aweme.commercialize.d.a;
import com.ss.android.ugc.aweme.commercialize.tasks.e;
import com.ss.android.ugc.aweme.commercialize.util.a.b;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import h.z;
import java.util.concurrent.Callable;

public final class j extends com.bytedance.ies.ugc.aweme.rich.c.a.a {

    /* renamed from: d  reason: collision with root package name */
    public final long f75329d;

    /* renamed from: e  reason: collision with root package name */
    public final String f75330e;

    /* renamed from: f  reason: collision with root package name */
    public final long f75331f;

    /* renamed from: g  reason: collision with root package name */
    public final String f75332g;

    /* renamed from: h  reason: collision with root package name */
    public final String f75333h;

    /* renamed from: i  reason: collision with root package name */
    private final String f75334i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f75335j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f75336k;

    /* renamed from: l  reason: collision with root package name */
    private final String f75337l;

    /* renamed from: m  reason: collision with root package name */
    private final h f75338m = i.a((h.f.a.a) new d(this));

    static {
        Covode.recordClassIndex(46482);
    }

    private final Intent c() {
        return (Intent) this.f75338m.getValue();
    }

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f75339a;

        static {
            Covode.recordClassIndex(46485);
        }

        c(j jVar) {
            this.f75339a = jVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                com.bytedance.ies.ugc.aweme.rich.b.a b2 = this.f75339a.f35146c.b();
                if (b2 instanceof AwemeRawAd) {
                    com.ss.android.ugc.aweme.commercialize.d dVar = com.ss.android.ugc.aweme.commercialize.d.f73752a;
                    l.b(dVar, "");
                    dVar.f73753b = (AwemeRawAd) b2;
                }
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            }
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.a<Intent> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(46486);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Intent invoke() {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(this.this$0.f75332g));
            intent.putExtra("open_url", this.this$0.f75332g);
            return intent;
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.c.a.b
    public final boolean b() {
        if (!this.f75335j && !TextUtils.isEmpty(this.f75332g)) {
            return f.a(this.f35145b, c());
        }
        return false;
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.c.a.a
    public final g a() {
        String str;
        Intent c2 = c();
        String str2 = this.f75332g;
        if (TextUtils.isEmpty(this.f75334i)) {
            str = this.f75333h;
        } else {
            str = this.f75334i;
        }
        if (this.f75336k) {
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
        if (!TextUtils.isEmpty(this.f75337l)) {
            parse = parse.buildUpon().appendQueryParameter("source_aid", this.f75337l).build();
        }
        c2.setData(parse);
        return e.a(this.f35145b, c2);
    }

    static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.commercialize.util.a.b, z> {
        final /* synthetic */ String $backUrlTag;
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(46484);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(j jVar, String str) {
            super(1);
            this.this$0 = jVar;
            this.$backUrlTag = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.commercialize.util.a.b bVar) {
            com.ss.android.ugc.aweme.commercialize.util.a.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.f75396b = this.this$0.f75329d;
            bVar2.f75397c = this.this$0.f75330e;
            bVar2.f75398d = this.this$0.f75331f;
            bVar2.f75395a = this.$backUrlTag;
            return z.f158842a;
        }
    }

    static final class a extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ com.bytedance.ies.ugc.aweme.rich.b.a $commonAdData;
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(46483);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(j jVar, com.bytedance.ies.ugc.aweme.rich.b.a aVar) {
            super(1);
            this.this$0 = jVar;
            this.$commonAdData = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                com.bytedance.ies.ugc.aweme.rich.a.a.a(this.this$0.f75333h, "deeplink_success", (AwemeRawAd) this.$commonAdData).b();
            } else {
                com.bytedance.ies.ugc.aweme.rich.a.a.a(this.this$0.f75333h, "deeplink_failed", (AwemeRawAd) this.$commonAdData).b();
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.c.a.b
    public final void a(boolean z) {
        com.bytedance.ies.ugc.aweme.rich.b.a b2 = this.f35146c.b();
        if (z && (b2 instanceof AwemeRawAd)) {
            com.bytedance.ies.ugc.aweme.rich.a.a.a(this.f75333h, "open_url_app", (AwemeRawAd) b2).b();
            com.ss.android.ugc.aweme.commercialize.util.adrouter.a.f75399a.a(new a(this, b2));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(com.bytedance.ies.ugc.aweme.rich.c.a.c cVar, Bundle bundle) {
        super(cVar, bundle);
        l.d(cVar, "");
        l.d(bundle, "");
        this.f75329d = bundle.getLong("creative_id", 0);
        String string = bundle.getString("log_extra", "");
        l.b(string, "");
        this.f75330e = string;
        this.f75331f = bundle.getLong("group_id", 0);
        String string2 = bundle.getString("open_url", "");
        l.b(string2, "");
        this.f75332g = string2;
        String string3 = bundle.getString("log_tag", "draw_ad");
        l.b(string3, "");
        this.f75333h = string3;
        this.f75334i = bundle.getString("back_url_tag");
        this.f75335j = bundle.getBoolean("forbidden_open_3rd_app", false);
        this.f75336k = bundle.getBoolean("use_adx_deeplink", false);
        this.f75337l = bundle.getString("aweme_id");
    }
}
