package com.ss.android.ugc.aweme.bullet.bridge.framework;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.bullet.kit.rn.f;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;
import java.util.Objects;
import org.json.JSONObject;

public final class ComponentDidMountMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69079b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f69080c = "componentDidMount";

    static {
        Covode.recordClassIndex(42596);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42597);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69080c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComponentDidMountMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        if (h() != com.bytedance.ies.bullet.service.f.a.b.b.WEB && (g() instanceof f)) {
            com.bytedance.ies.bullet.c.c.i g2 = g();
            Objects.requireNonNull(g2, "null cannot be cast to non-null type com.bytedance.ies.bullet.kit.rn.IRnKitContainerApi");
            ((f) g2).m();
        }
    }
}
