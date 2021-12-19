package com.ss.android.ugc.aweme.bullet.bridge.ad;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.bullet.c.e.a.c;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.ss.android.ugc.aweme.ad.c.k;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;
import org.json.JSONObject;

public final class DidSelectVoteCardOptionMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f68869b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f68870c = "didSelectVoteCardOption";

    static {
        Covode.recordClassIndex(42436);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42437);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68870c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DidSelectVoteCardOptionMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        Object b2;
        l.d(jSONObject, "");
        l.d(aVar, "");
        if (jSONObject.has("vote_result")) {
            c b3 = this.f32005a.b(BulletContainerView.class);
            int i2 = 0;
            if (!(b3 == null || (b2 = b3.b()) == null)) {
                i2 = b2.hashCode();
            }
            com.ss.android.ugc.d.a.c.a(new k(i2, jSONObject.optInt("vote_result")));
        }
    }
}
