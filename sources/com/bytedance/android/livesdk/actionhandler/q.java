package com.bytedance.android.livesdk.actionhandler;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.livesdk.utils.h;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.depend.model.live.s;
import com.bytedance.android.livesdkapi.host.j;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.a;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;
import java.util.HashMap;
import java.util.Map;

public final class q implements f {
    static {
        Covode.recordClassIndex(7565);
    }

    @Override // com.bytedance.android.livesdk.actionhandler.f
    public final boolean canHandle(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (uri != null) {
            str = uri.getHost();
        } else {
            str = null;
        }
        if (TextUtils.equals("live", str)) {
            return true;
        }
        if (uri != null) {
            str2 = uri.getHost();
        } else {
            str2 = null;
        }
        if (!TextUtils.equals("webcast_room", str2)) {
            return false;
        }
        if (uri != null) {
            str3 = uri.getPath();
        } else {
            str3 = null;
        }
        if (!TextUtils.equals("/", str3)) {
            if (uri != null) {
                str4 = uri.getPath();
            }
            if (TextUtils.equals("", str4)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.actionhandler.f
    public final boolean handle(Context context, Uri uri) {
        l.d(context, "");
        l.d(uri, "");
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        a.a(enterRoomConfig, uri);
        return a(enterRoomConfig, context, uri);
    }

    @Override // com.bytedance.android.livesdk.actionhandler.f
    public final boolean handle(Context context, Uri uri, Map<String, String> map) {
        Boolean bool;
        l.d(context, "");
        l.d(uri, "");
        l.d(map, "");
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        a.a(enterRoomConfig, uri);
        String str = map.get("from_notification");
        if (str != null) {
            bool = Boolean.valueOf(Boolean.parseBoolean(str));
        } else {
            bool = null;
        }
        if (uri.getQueryParameter("enter_from_merge") == null && l.a((Object) bool, (Object) true)) {
            enterRoomConfig.f23299c.J = "push";
        }
        if (uri.getQueryParameter("enter_method") == null && l.a((Object) bool, (Object) true)) {
            enterRoomConfig.f23299c.L = "push";
        }
        return a(enterRoomConfig, context, uri);
    }

    private static boolean a(EnterRoomConfig enterRoomConfig, Context context, Uri uri) {
        long j2;
        Long g2;
        s.a aVar;
        com.bytedance.android.livesdk.utils.a.a(uri, enterRoomConfig);
        HashMap hashMap = new HashMap();
        String uri2 = uri.toString();
        l.b(uri2, "");
        hashMap.put("schema_uri", uri2);
        c.a("ttlive_push_event_schema", 0, hashMap);
        String queryParameter = uri.getQueryParameter("slim_room");
        if (queryParameter == null) {
            queryParameter = "";
        }
        if (!TextUtils.isEmpty(queryParameter)) {
            String a2 = h.a(queryParameter);
            l.b(a2, "");
            try {
                Object a3 = com.bytedance.android.livesdk.util.a.a(a2, SlimRoom.class);
                l.b(a3, "");
                SlimRoom slimRoom = (SlimRoom) a3;
                l.d(enterRoomConfig, "");
                if (slimRoom != null) {
                    enterRoomConfig.f23297a.f23349m = true;
                    enterRoomConfig.f23297a.f23348l = slimRoom.getId();
                    enterRoomConfig.f23297a.f23338b = slimRoom.buildPullUrl();
                    enterRoomConfig.f23297a.f23339c = slimRoom.getSdkParams();
                    enterRoomConfig.f23297a.f23340d = slimRoom.getMultiStreamData();
                    enterRoomConfig.f23297a.f23342f = slimRoom.getMultiStreamDefaultQualitySdkKey();
                    s streamUrlExtraSafely = slimRoom.getStreamUrlExtraSafely();
                    if (streamUrlExtraSafely != null) {
                        aVar = streamUrlExtraSafely.n;
                    } else {
                        aVar = null;
                    }
                    l.b(aVar, "");
                    if (aVar != null) {
                        enterRoomConfig.f23297a.f23343g = aVar.f23192a;
                        enterRoomConfig.f23297a.f23344h = aVar.f23193b;
                        enterRoomConfig.f23297a.f23345i = aVar.f23194c;
                    }
                    enterRoomConfig.f23297a.f23346j = slimRoom.getStreamType().ordinal();
                }
            } catch (Exception unused) {
                if (Logger.debug()) {
                    com.bytedance.android.live.core.c.a.a(3, "RoomActionHandler2", "parseObject error");
                }
            }
        }
        String queryParameter2 = uri.getQueryParameter("unique_id");
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        l.b(queryParameter2, "");
        String c2 = p.c(queryParameter2, "@", "");
        String str = enterRoomConfig.f23298b.f23310b;
        if (str == null || (g2 = p.g(str)) == null) {
            j2 = -1;
        } else {
            j2 = g2.longValue();
        }
        if (enterRoomConfig.f23299c.R <= 0) {
            if (!TextUtils.isEmpty(c2)) {
                ((j) com.bytedance.android.live.t.a.a(j.class)).a(context, enterRoomConfig, c2);
                return true;
            } else if (!TextUtils.isEmpty(enterRoomConfig.f23298b.f23310b)) {
                ((j) com.bytedance.android.live.t.a.a(j.class)).a(context, enterRoomConfig, j2);
                return true;
            }
        }
        if (enterRoomConfig.f23299c.R > 0) {
            return ((j) com.bytedance.android.live.t.a.a(j.class)).a(context, enterRoomConfig);
        }
        return false;
    }
}
