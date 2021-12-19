package com.ss.android.ugc.aweme.bullet.bridge.ad;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ad.b.b;
import com.ss.android.ugc.aweme.ad.b.c;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class GetPageDataMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f68878b = new a((byte) 0);

    static {
        Covode.recordClassIndex(42448);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return "getPageData";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42449);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private static Map<String, String> k() {
        l.b(b.a.f65586a, "");
        if (b.a() == null) {
            return new LinkedHashMap();
        }
        l.b(b.a.f65586a, "");
        c a2 = b.a();
        if (a2 == null) {
            l.b();
        }
        return a2.m();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetPageDataMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        if (r1 != null) goto L_0x002f;
     */
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(org.json.JSONObject r7, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.a r8) {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.bridge.ad.GetPageDataMethod.a(org.json.JSONObject, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod$a):void");
    }
}
