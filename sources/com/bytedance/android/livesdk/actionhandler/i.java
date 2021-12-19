package com.bytedance.android.livesdk.actionhandler;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.chatroom.c.ao;
import com.bytedance.android.livesdk.gift.g.a.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Map;

public final class i implements f {
    static {
        Covode.recordClassIndex(7557);
    }

    @Override // com.bytedance.android.livesdk.actionhandler.f
    public final boolean canHandle(Uri uri) {
        String str;
        if (uri != null) {
            str = uri.getHost();
        } else {
            str = null;
        }
        return TextUtils.equals("webcast_gift_dialog", str);
    }

    @Override // com.bytedance.android.livesdk.actionhandler.f
    public final boolean handle(Context context, Uri uri) {
        long j2;
        String str;
        String queryParameter;
        if (uri == null || (queryParameter = uri.getQueryParameter("gift_id")) == null) {
            j2 = 0;
        } else {
            j2 = Long.parseLong(queryParameter);
        }
        if (uri == null || (str = uri.getQueryParameter("gift_enter_from")) == null) {
            str = "";
        }
        l.b(str, "");
        ao aoVar = new ao();
        aoVar.f15103b = j2;
        aoVar.f15102a = a.GIFT;
        aoVar.f15104c = str;
        ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).openGiftDialogFromJSB(aoVar);
        return true;
    }

    @Override // com.bytedance.android.livesdk.actionhandler.f
    public final boolean handle(Context context, Uri uri, Map<String, String> map) {
        return handle(context, uri);
    }
}
