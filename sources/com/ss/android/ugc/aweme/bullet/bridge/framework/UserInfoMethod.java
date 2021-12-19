package com.ss.android.ugc.aweme.bullet.bridge.framework;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;

public final class UserInfoMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69185b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f69186c = "userInfo";

    /* renamed from: d  reason: collision with root package name */
    private k.a f69187d = k.a.PROTECT;

    static {
        Covode.recordClassIndex(42662);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42663);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q, com.bytedance.ies.bullet.c.c.a.e
    public final k.a b() {
        return this.f69187d;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69186c;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e
    public final void a(k.a aVar) {
        l.d(aVar, "");
        this.f69187d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserInfoMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ea  */
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(org.json.JSONObject r17, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.a r18) {
        /*
        // Method dump skipped, instructions count: 266
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.bridge.framework.UserInfoMethod.a(org.json.JSONObject, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod$a):void");
    }
}
