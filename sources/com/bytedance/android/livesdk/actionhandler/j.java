package com.bytedance.android.livesdk.actionhandler;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.android.livesdkapi.session.b;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public final class j implements f {
    static {
        Covode.recordClassIndex(7558);
    }

    @Override // com.bytedance.android.livesdk.actionhandler.f
    public final boolean canHandle(Uri uri) {
        return TextUtils.equals("live_square", uri.getHost());
    }

    @Override // com.bytedance.android.livesdk.actionhandler.f
    public final boolean handle(Context context, Uri uri) {
        HashMap hashMap = new HashMap();
        hashMap.put("intercept", "new_style");
        hashMap.put("live.intent.extra.FROM_NEW_STYLE_SOURCE", "referral_task");
        hashMap.put("enter_from_merge", uri.getQueryParameter("enter_from_merge"));
        hashMap.put("enter_method", uri.getQueryParameter("enter_method"));
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.f23299c.J = uri.getQueryParameter("enter_from_merge");
        enterRoomConfig.f23299c.L = uri.getQueryParameter("enter_method");
        EnterRoomLinkSession.a(enterRoomConfig).a(new Event("live_square_handler", 4608, b.BussinessApiCall));
        if (a.a(com.bytedance.android.b.a.b.class) == null) {
            return true;
        }
        ((com.bytedance.android.b.a.b) a.a(com.bytedance.android.b.a.b.class)).getStartLiveRoomInterceptor().a(hashMap);
        return true;
    }

    @Override // com.bytedance.android.livesdk.actionhandler.f
    public final boolean handle(Context context, Uri uri, Map<String, String> map) {
        return handle(context, uri);
    }
}
