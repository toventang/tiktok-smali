package com.ss.android.ugc.aweme.bullet.bridge.ad;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.commercialize.utils.k;
import com.ss.android.ugc.aweme.commercialize.utils.n;
import h.f.b.l;

public final class OpenAdUrlMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f68913b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f68914c = "openAdUrl";

    static {
        Covode.recordClassIndex(42468);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42469);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68914c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenAdUrlMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    static final class b implements n.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f68915a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OpenAdUrlMethod f68916b;

        static {
            Covode.recordClassIndex(42470);
        }

        b(k kVar, OpenAdUrlMethod openAdUrlMethod) {
            this.f68915a = kVar;
            this.f68916b = openAdUrlMethod;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.utils.n.a
        public final void sendLog(boolean z) {
            String str;
            f.b a2 = f.a();
            a2.f74804a = "draw_ad";
            String str2 = "deeplink_success";
            if (z) {
                str = str2;
            } else {
                str = "deeplink_failed";
            }
            a2.f74805b = str;
            a2.a(Long.valueOf(this.f68915a.f75781a)).e(this.f68915a.f75782b).b(Long.valueOf(this.f68915a.f75783c)).a(this.f68916b.e());
            if (!z) {
                str2 = "deeplink_failed";
            }
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", str2, String.valueOf(this.f68915a.f75781a), this.f68915a.f75782b, String.valueOf(this.f68915a.f75783c)).c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0170, code lost:
        if (r4 != null) goto L_0x015f;
     */
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(org.json.JSONObject r19, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.a r20) {
        /*
        // Method dump skipped, instructions count: 395
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.bridge.ad.OpenAdUrlMethod.a(org.json.JSONObject, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod$a):void");
    }
}
