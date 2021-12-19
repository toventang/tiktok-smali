package com.bytedance.android.livesdk.actionhandler;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.kakao.usermgmt.StringSet;
import java.util.HashMap;
import java.util.Map;

public class r implements g {
    static {
        Covode.recordClassIndex(7566);
    }

    @Override // com.bytedance.android.livesdk.actionhandler.f
    public boolean canHandle(Uri uri) {
        return TextUtils.equals("webcast_profile", uri.getHost());
    }

    @Override // com.bytedance.android.livesdk.actionhandler.f
    public boolean handle(Context context, Uri uri) {
        String queryParameter = uri.getQueryParameter("user_id");
        long j2 = 0;
        try {
            if (!TextUtils.isEmpty(queryParameter)) {
                j2 = Long.parseLong(queryParameter);
            }
        } catch (Throwable unused) {
        }
        String queryParameter2 = uri.getQueryParameter("sec_user_id");
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(queryParameter2)) {
            hashMap.put("sec_user_id", queryParameter2);
        }
        return a(j2, uri.getQueryParameter(StringSet.type), hashMap);
    }

    @Override // com.bytedance.android.livesdk.actionhandler.f
    public boolean handle(Context context, Uri uri, Map<String, String> map) {
        return handle(context, uri);
    }

    public static boolean a(long j2, String str, Map<String, String> map) {
        boolean z;
        Object b2 = DataChannelGlobal.f34575d.b(ac.class);
        if (j2 == 0) {
            j2 = u.a().b().c();
        }
        if (!map.containsKey("show_follow") || !Boolean.parseBoolean(map.get("show_follow"))) {
            z = false;
        } else {
            z = true;
        }
        if (b2 == null || !TextUtils.equals(str, "half")) {
            ((IHostAction) a.a(IHostAction.class)).openUserProfilePage(j2, map);
        } else {
            UserProfileEvent userProfileEvent = new UserProfileEvent(j2);
            if (z) {
                userProfileEvent.mSource = "mic_room";
            }
            if (!TextUtils.isEmpty(map.get("click_user_position"))) {
                userProfileEvent.mClickUserPosition = map.get("click_user_position");
                if ("redpacket".equals(userProfileEvent.mClickUserPosition)) {
                    userProfileEvent.mReportType = "report_user";
                }
            }
            com.bytedance.android.livesdk.an.a.a().a(userProfileEvent);
        }
        return true;
    }
}
