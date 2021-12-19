package com.ss.android.ugc.aweme.bullet.bridge.common;

import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.fe.a.e;
import h.f.b.l;
import org.json.JSONObject;

public final class GetNativeItemMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f68979b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f68980c = "getNativeItem";

    static {
        Covode.recordClassIndex(42528);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42529);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68980c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetNativeItemMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        try {
            String a2 = e.a.f91018a.a(jSONObject.optString("key"), "");
            if (!TextUtils.isEmpty(a2)) {
                aVar.a(a2);
            } else {
                aVar.a(-1, "value is null");
            }
        } catch (Exception e2) {
            aVar.a(-1, e2.getMessage());
            e2.printStackTrace();
        }
    }
}
