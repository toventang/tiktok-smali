package com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.log;

import android.net.Uri;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.p;
import com.bytedance.ies.bullet.c.c.i;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.common.r;
import f.a.d.f;
import h.f.b.l;
import org.json.JSONObject;

public final class PdpLogHelper implements au {

    /* renamed from: c  reason: collision with root package name */
    public static final a f73814c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final f.a.l.b<Integer> f73815a;

    /* renamed from: b  reason: collision with root package name */
    public final f.a.b.a f73816b = new f.a.b.a();

    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PdpLogHelper f73817a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f73818b;

        static {
            Covode.recordClassIndex(45460);
        }

        public b(PdpLogHelper pdpLogHelper, i iVar) {
            this.f73817a = pdpLogHelper;
            this.f73818b = iVar;
        }

        public static final class a implements p {

            /* renamed from: a  reason: collision with root package name */
            public final JSONObject f73819a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f73820b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Integer f73821c;

            /* renamed from: d  reason: collision with root package name */
            private final String f73822d = "onPageGlide";

            static {
                Covode.recordClassIndex(45461);
            }

            @Override // com.bytedance.ies.bullet.c.c.a.p
            public final String a() {
                return this.f73822d;
            }

            @Override // com.bytedance.ies.bullet.c.c.a.p
            public final /* bridge */ /* synthetic */ Object b() {
                return this.f73819a;
            }

            a(b bVar, Integer num) {
                this.f73820b = bVar;
                this.f73821c = num;
                JSONObject jSONObject = new JSONObject();
                l.b(num, "");
                this.f73819a = jSONObject.put("state", PdpLogHelper.a(num.intValue()).getValue());
            }
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Integer num = (Integer) obj;
            this.f73818b.onEvent(new a(this, num));
            l.b(num, "");
            PdpLogHelper.a(num.intValue()).getValue();
        }
    }

    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f73823a = new c();

        static {
            Covode.recordClassIndex(45462);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(45458);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            dispose();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(45459);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void dispose() {
        this.f73816b.dispose();
    }

    public PdpLogHelper() {
        f.a.l.b<Integer> bVar = new f.a.l.b<>();
        l.b(bVar, "");
        this.f73815a = bVar;
    }

    public static a a(int i2) {
        if (i2 == 3) {
            return a.EXPANDED;
        }
        if (i2 == 4) {
            return a.COLLAPSED;
        }
        if (i2 != 5) {
            return a.COLLAPSED;
        }
        return a.HIDDEN;
    }

    public static void a(int i2, long j2, String str) {
        String str2;
        String queryParameter;
        d a2 = new d().a("success", i2).a("load_time", String.valueOf(((float) (System.currentTimeMillis() - j2)) / 1000.0f));
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        d a3 = a2.a("schema_url", str2);
        Uri parse = Uri.parse(str);
        String str3 = null;
        if (parse != null) {
            str3 = parse.getQueryParameter("channel");
        }
        if (!(str3 == null || str3.length() == 0 || str3 == null)) {
            a3.a("channel", str3);
        }
        Uri parse2 = Uri.parse(str);
        if (!(parse2 == null || (queryParameter = parse2.getQueryParameter("bundle")) == null || queryParameter.length() == 0 || queryParameter == null)) {
            a3.a("bundle", queryParameter);
        }
        r.a("ttmp_oc_anchor_pdp_load", a3.f66730a);
    }
}
