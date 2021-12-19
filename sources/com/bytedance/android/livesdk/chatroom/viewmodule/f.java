package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget;
import com.bytedance.android.livesdk.event.n;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

final /* synthetic */ class f implements f.a.d.f {

    /* renamed from: a  reason: collision with root package name */
    private final BottomRightBannerWidget f16503a;

    static {
        Covode.recordClassIndex(9143);
    }

    f(BottomRightBannerWidget bottomRightBannerWidget) {
        this.f16503a = bottomRightBannerWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        BottomRightBannerWidget bottomRightBannerWidget = this.f16503a;
        n nVar = (n) obj;
        if (nVar != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            int i2 = BottomRightBannerWidget.AnonymousClass2.f16260a[nVar.f17206a.ordinal()];
            try {
                jSONObject2.put("code", i2 != 1 ? i2 != 2 ? i2 != 3 ? "0" : "3" : "2" : "1");
                jSONObject.put("args", jSONObject2);
                if (bottomRightBannerWidget.f16246a != null && bottomRightBannerWidget.f16246a.f14314b != null && bottomRightBannerWidget.f16246a.f14314b.a() != null) {
                    bottomRightBannerWidget.f16246a.f14314b.a().a("H5_loginStatus", jSONObject);
                }
            } catch (JSONException unused) {
            }
        }
    }
}
