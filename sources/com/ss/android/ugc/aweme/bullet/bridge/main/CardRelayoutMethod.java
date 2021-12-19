package com.ss.android.ugc.aweme.bullet.bridge.main;

import android.view.ViewGroup;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;
import org.json.JSONObject;

public final class CardRelayoutMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69191b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f69192c = "cardRelayout";

    /* renamed from: d  reason: collision with root package name */
    private k.a f69193d = k.a.PRIVATE;

    static {
        Covode.recordClassIndex(42666);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42667);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q, com.bytedance.ies.bullet.c.c.a.e
    public final k.a b() {
        return this.f69193d;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69192c;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e
    public final void a(k.a aVar) {
        l.d(aVar, "");
        this.f69193d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardRelayoutMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        BulletContainerView bulletContainerView = (BulletContainerView) this.f32005a.c(BulletContainerView.class);
        if (bulletContainerView != null) {
            int optInt = jSONObject.optInt("height", 0);
            if (optInt >= 0) {
                ViewGroup.LayoutParams layoutParams = bulletContainerView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = optInt;
                }
                bulletContainerView.requestLayout();
                bulletContainerView.invalidate();
                aVar.a(new JSONObject(), 1, "");
                return;
            }
            aVar.a(-1, "invalid height: ".concat(String.valueOf(optInt)));
            return;
        }
        aVar.a(-1, "BulletContainerView not found");
    }
}
