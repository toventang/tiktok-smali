package com.bytedance.android.livesdkapi.session;

import android.net.Uri;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;
import h.q;
import h.r;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(13886);
    }

    public static final void a(EnterRoomConfig enterRoomConfig, Uri uri) {
        long j2;
        Object obj;
        Integer e2;
        Long g2;
        l.d(enterRoomConfig, "");
        l.d(uri, "");
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.f23299c;
        String queryParameter = uri.getQueryParameter("room_id");
        if (queryParameter == null || (g2 = p.g(queryParameter)) == null) {
            j2 = -1;
        } else {
            j2 = g2.longValue();
        }
        roomsData.R = j2;
        int i2 = -1;
        if (enterRoomConfig.f23299c.R > 0) {
            enterRoomConfig.f23299c.r = -1;
        }
        enterRoomConfig.f23298b.q = uri.getQueryParameter("inner_push_type");
        enterRoomConfig.f23298b.r = uri.getQueryParameter("gd_label");
        enterRoomConfig.f23298b.f23310b = uri.getQueryParameter("user_id");
        enterRoomConfig.f23298b.f23321m = uri.getQueryParameter("enter_from_module");
        enterRoomConfig.f23298b.f23309a = uri.getQueryParameter("request_id");
        enterRoomConfig.f23298b.f23315g = uri.getQueryParameter("log_pb");
        enterRoomConfig.f23298b.p = uri.getQueryParameter("top_message_type");
        enterRoomConfig.f23298b.t = uri.getQueryParameter("pop_type");
        enterRoomConfig.f23298b.f23311c = uri.getQueryParameter("video_id");
        enterRoomConfig.f23298b.f23317i = uri.getQueryParameter("request_page");
        enterRoomConfig.f23298b.f23318j = uri.getQueryParameter("anchor_type");
        enterRoomConfig.f23298b.H = uri.getQueryParameter("magic3_source");
        enterRoomConfig.f23298b.I = uri.getQueryParameter("magic3_activityId");
        enterRoomConfig.f23298b.J = uri.getQueryParameter("magic3_comptype");
        enterRoomConfig.f23298b.x = uri.getQueryParameter("search_id");
        enterRoomConfig.f23298b.z = uri.getQueryParameter("search_result_id");
        enterRoomConfig.f23299c.D = uri.getQueryParameter("user_id");
        enterRoomConfig.f23299c.X = uri.getQueryParameter("enter_live_source");
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.f23299c;
        String queryParameter2 = uri.getQueryParameter("enter_from_merge");
        String str = "webview";
        if (queryParameter2 == null) {
            queryParameter2 = str;
        }
        roomsData2.J = queryParameter2;
        EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.f23299c;
        String queryParameter3 = uri.getQueryParameter("enter_method");
        if (queryParameter3 != null) {
            str = queryParameter3;
        }
        roomsData3.L = str;
        enterRoomConfig.f23299c.f23332k = uri.getQueryParameter("tip");
        enterRoomConfig.f23299c.f23331j = uri.getQueryParameter("tip_i18n");
        enterRoomConfig.f23299c.f23330i = uri.getQueryParameter("back_room");
        EnterRoomConfig.RoomsData roomsData4 = enterRoomConfig.f23299c;
        String queryParameter4 = uri.getQueryParameter("tab_index");
        if (!(queryParameter4 == null || (e2 = p.e(queryParameter4)) == null)) {
            i2 = e2.intValue();
        }
        roomsData4.t = i2;
        enterRoomConfig.f23299c.T = uri.getQueryParameter("backurl");
        EnterRoomConfig.RoomsData roomsData5 = enterRoomConfig.f23299c;
        try {
            String queryParameter5 = uri.getQueryParameter("extra_params");
            if (queryParameter5 == null) {
                queryParameter5 = "{}";
            }
            obj = q.m223constructorimpl(new JSONObject(queryParameter5).getString("auto_route_schema"));
        } catch (Throwable th) {
            obj = q.m223constructorimpl(r.a(th));
        }
        if (q.m228isFailureimpl(obj)) {
            obj = null;
        }
        roomsData5.aF = (String) obj;
    }
}
