package com.ss.android.ugc.aweme.commercialize.tasks.a;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.c.a.c;
import com.bytedance.ies.ugc.aweme.rich.c.a.g;
import com.ss.android.ugc.aweme.commercialize.tasks.e;
import com.ss.android.ugc.aweme.crossplatform.activity.l;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

public final class k extends a {
    public static final a O = new a((byte) 0);

    static {
        Covode.recordClassIndex(46487);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(46488);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.c.a.b
    public final boolean b() {
        if (this.f75300d.length() == 0) {
            return false;
        }
        return e.a(this.f75300d);
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.c.a.a
    public final g a() {
        Intent c2 = c();
        String str = this.f75300d;
        if (!(str == null || str.length() == 0)) {
            com.ss.android.ugc.aweme.crossplatform.activity.e.a();
            com.ss.android.ugc.aweme.crossplatform.activity.e.a(new l(str, "Jump directly to open the landing page"));
        }
        if (!com.ss.android.ugc.aweme.commercialize.tasks.a.f75298a.b()) {
            return e.a(this.f35145b, c2);
        }
        com.ss.android.ugc.aweme.commercialize.tasks.a.f75298a.a(this.f35145b, this.f75300d, this.f75301e, a(c2));
        return new g(true);
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.c.a.b
    public final void a(boolean z) {
        com.bytedance.ies.ugc.aweme.rich.b.a b2 = this.f35146c.b();
        if (b2 instanceof AwemeRawAd) {
            com.bytedance.ies.ugc.aweme.rich.a.a.a(this.f75309m, "open_url_h5", (AwemeRawAd) b2).b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(c cVar, Bundle bundle) {
        super(cVar, bundle);
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(bundle, "");
    }
}
