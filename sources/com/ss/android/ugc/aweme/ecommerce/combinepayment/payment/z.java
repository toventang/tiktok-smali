package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.appcontext.g;
import com.ss.android.ugc.aweme.base.m;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import h.v;
import java.util.HashMap;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    static final HashMap<String, String> f85690a = ag.c(v.a("ui0024", a((int) R.string.bfa)), v.a("ui0002", a((int) R.string.bfb)), v.a("ui0012", a((int) R.string.bfa)), v.a("ui0028", a((int) R.string.bfc)), v.a("ui0017", a((int) R.string.bf_)), v.a("ui0018", a((int) R.string.bfc)), v.a("ui0019", a((int) R.string.bfc)), v.a("ui0020", a((int) R.string.bfd)), v.a("ui0031", a((int) R.string.bfi)), v.a("ui0034", a((int) R.string.bfe)), v.a("tp0002", a((int) R.string.bff)), v.a("tp0005", a((int) R.string.bfh)), v.a("tp0006", a((int) R.string.bfl)), v.a("tp0007", a((int) R.string.bff)), v.a("tp0009", a((int) R.string.bff)), v.a("tp0014", a((int) R.string.bff)), v.a("tp0018", a((int) R.string.bff)), v.a("tp0019", a((int) R.string.bff)), v.a("tp0023", a((int) R.string.bfg)), v.a("tp0024", a((int) R.string.bfm)), v.a("tp0027", a((int) R.string.bff)), v.a("tp0030", a((int) R.string.bff)), v.a("tp0031", a((int) R.string.bff)), v.a("tp0033", a((int) R.string.bff)), v.a("tp0034", a((int) R.string.bff)), v.a("tp0035", a((int) R.string.bff)), v.a("tp0040", a((int) R.string.bf9)), v.a("sy0001", a((int) R.string.bfk)), v.a("sy0002", a((int) R.string.bfk)), v.a("ot0001", a((int) R.string.bfk)), v.a("ot0002", a((int) R.string.bfj)));

    /* renamed from: b  reason: collision with root package name */
    public static final z f85691b = new z();

    private z() {
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f85692a;

        static {
            Covode.recordClassIndex(53593);
        }

        a(String str) {
            this.f85692a = str;
        }

        public final void run() {
            String str = z.f85690a.get(this.f85692a);
            if (str != null) {
                new com.ss.android.ugc.aweme.tux.a.i.a(d.a()).a(str).a();
            } else {
                new com.ss.android.ugc.aweme.tux.a.i.a(d.a()).a(z.a((int) R.string.bfk)).a();
            }
        }
    }

    static {
        Covode.recordClassIndex(53592);
    }

    public static String a(int i2) {
        String string = g.a().getString(i2);
        l.b(string, "");
        return string;
    }

    public static void a(String str) {
        m.f68150a.execute(new a(str));
    }
}
