package com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.discover.ui.search.jsbridge.c;
import h.f.b.l;
import org.json.JSONObject;

public final class SearchKeywordChangeMethod extends BaseBridgeMethod implements au {

    /* renamed from: c  reason: collision with root package name */
    public static final a f82708c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public k.b f82709b;

    /* renamed from: d  reason: collision with root package name */
    private final String f82710d = c.f82732a;

    static {
        Covode.recordClassIndex(51515);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51516);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f82710d;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchKeywordChangeMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.c.c.a.k
    public final void a(JSONObject jSONObject, k.b bVar) {
        l.d(jSONObject, "");
        l.d(bVar, "");
        super.a(jSONObject, bVar);
        this.f82709b = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x010d, code lost:
        if (r7.equals("search_history") != false) goto L_0x010f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x013d A[Catch:{ Exception -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x014a A[Catch:{ Exception -> 0x0160 }] */
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(org.json.JSONObject r11, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.a r12) {
        /*
        // Method dump skipped, instructions count: 369
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.SearchKeywordChangeMethod.a(org.json.JSONObject, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod$a):void");
    }
}
