package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.event.c;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import f.a.d.f;
import org.json.JSONException;
import org.json.JSONObject;

final /* synthetic */ class l implements f {

    /* renamed from: a  reason: collision with root package name */
    private final BottomRightBannerWidget f16511a;

    static {
        Covode.recordClassIndex(9149);
    }

    l(BottomRightBannerWidget bottomRightBannerWidget) {
        this.f16511a = bottomRightBannerWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        c cVar;
        BottomRightBannerWidget bottomRightBannerWidget = this.f16511a;
        if ((obj instanceof c) && (cVar = (c) obj) != null && cVar.f17182a == 1) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(StringSet.type, cVar.f17183b);
                jSONObject.put("data", cVar.f17184c.toString());
                if (bottomRightBannerWidget.f16249d != null) {
                    bottomRightBannerWidget.f16249d.a(bottomRightBannerWidget.f16246a, "H5_roomStatusChange", jSONObject);
                }
            } catch (JSONException unused) {
            }
        }
    }
}
