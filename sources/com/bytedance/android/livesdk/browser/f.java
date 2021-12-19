package com.bytedance.android.livesdk.browser;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.network.h;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.google.gson.o;
import h.f.b.l;
import h.q;
import h.r;
import java.util.Map;
import java.util.Set;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f14413a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(7982);
    }

    private static o a(String str) {
        User owner;
        String valueOf;
        String str2;
        o oVar = new o();
        try {
            Uri parse = Uri.parse(str);
            l.b(parse, "");
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            l.b(queryParameterNames, "");
            for (T t : queryParameterNames) {
                oVar.a(t, parse.getQueryParameter(t));
                String str3 = "0";
                if (!oVar.b("room_id")) {
                    Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
                    if (room == null || (str2 = String.valueOf(room.getId())) == null) {
                        str2 = str3;
                    }
                    oVar.a("room_id", str2);
                }
                if (!oVar.b("user_id")) {
                    com.bytedance.android.livesdk.at.f b2 = u.a().b();
                    l.b(b2, "");
                    oVar.a("user_id", String.valueOf(b2.c()));
                }
                if (!oVar.b("anchor_id")) {
                    Room room2 = (Room) DataChannelGlobal.f34575d.b(ac.class);
                    if (!(room2 == null || (owner = room2.getOwner()) == null || (valueOf = String.valueOf(owner.getId())) == null)) {
                        str3 = valueOf;
                    }
                    oVar.a("anchor_id", str3);
                }
            }
            q.m223constructorimpl(parse);
        } catch (Throwable th) {
            q.m223constructorimpl(r.a(th));
        }
        return oVar;
    }

    public static String a(Context context, String str, String str2, boolean z) {
        String str3;
        int i2;
        com.google.gson.l lVar;
        Resources resources;
        Configuration configuration;
        User owner;
        String valueOf;
        Set<Map.Entry<String, String>> entrySet;
        l.d(str2, "");
        o oVar = new o();
        h a2 = h.a();
        l.b(a2, "");
        Map<String, String> b2 = a2.b();
        if (!(b2 == null || (entrySet = b2.entrySet()) == null)) {
            for (T t : entrySet) {
                oVar.a((String) t.getKey(), (String) t.getValue());
                String str4 = (String) t.getKey();
                if (str4 != null) {
                    int hashCode = str4.hashCode();
                    if (hashCode != -102670958) {
                        if (hashCode != 96572) {
                            if (hashCode == 25209764 && str4.equals("device_id")) {
                                oVar.a("deviceId", (String) t.getValue());
                            }
                        } else if (str4.equals("aid")) {
                            oVar.a("appId", (String) t.getValue());
                        }
                    } else if (str4.equals("version_name")) {
                        oVar.a("appVersion", (String) t.getValue());
                    }
                }
            }
        }
        oVar.a("screenWidth", Float.valueOf(y.e(y.c())));
        oVar.a("screenHeight", Float.valueOf(y.e(y.b())));
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        String str5 = "0";
        if (room == null || (str3 = String.valueOf(room.getId())) == null) {
            str3 = str5;
        }
        oVar.a("room_id", str3);
        com.bytedance.android.livesdk.at.f b3 = u.a().b();
        l.b(b3, "");
        oVar.a("user_id", String.valueOf(b3.c()));
        Room room2 = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (!(room2 == null || (owner = room2.getOwner()) == null || (valueOf = String.valueOf(owner.getId())) == null)) {
            str5 = valueOf;
        }
        oVar.a("anchor_id", str5);
        oVar.a("status_bar_height", Float.valueOf(y.e(com.bytedance.android.live.core.f.ac.a(y.e()))));
        oVar.a("initTimestamp", String.valueOf(System.currentTimeMillis()));
        if (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 2) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        oVar.a("orientation", Integer.valueOf(i2));
        if (str == null || str.length() == 0) {
            lVar = null;
        } else {
            lVar = a(str);
        }
        oVar.a("queryItems", lVar);
        oVar.a("containerID", str2);
        oVar.a("offline", Integer.valueOf(z ? 1 : 0));
        String oVar2 = oVar.toString();
        l.b(oVar2, "");
        return oVar2;
    }
}
