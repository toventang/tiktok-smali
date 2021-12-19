package com.ss.android.ugc.aweme.bullet.bridge.common;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.fe.a.e;
import h.f.b.l;
import org.json.JSONObject;

public final class SetNativeItemMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69034b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f69035c = "setNativeItem";

    static {
        Covode.recordClassIndex(42573);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42574);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69035c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetNativeItemMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        try {
            if (e.a.f91018a.a(jSONObject.getString("key"), (Object) jSONObject.getString("value"))) {
                aVar.a((Object) null);
            } else {
                aVar.a(-1, "");
            }
        } catch (Exception e2) {
            aVar.a(-1, "");
            e2.printStackTrace();
        }
    }
}
