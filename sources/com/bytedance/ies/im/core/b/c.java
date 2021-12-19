package com.bytedance.ies.im.core.b;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.a.b;
import com.bytedance.ies.im.core.api.g.d;
import com.bytedance.ies.im.core.api.j.a;
import com.bytedance.ies.im.core.e.e;
import com.bytedance.im.core.d.bd;
import com.bytedance.keva.Keva;
import h.f.b.l;

public final class c implements b, com.bytedance.ies.im.core.api.g.b, a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f34002a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f34003b = new c();

    @Override // com.bytedance.ies.im.core.api.j.a
    public final void a(String str) {
    }

    private c() {
    }

    static {
        Covode.recordClassIndex(20252);
    }

    @Override // com.bytedance.ies.im.core.api.g.b
    public final void a(d dVar) {
        l.d(dVar, "");
        com.bytedance.ies.im.core.api.a.b().b("PlatformManager", "onNetworkStateChanged: ".concat(String.valueOf(dVar)));
        if (dVar.f33990a == com.bytedance.ies.im.core.api.g.c.CONNECTED) {
            e.a(e.a.NET);
        }
    }

    @Override // com.bytedance.ies.im.core.api.j.a
    public final void a(com.bytedance.ies.im.core.api.j.b bVar) {
        l.d(bVar, "");
        com.bytedance.ies.im.core.api.a.b().b("PlatformManager", "onStateChanged: " + bVar.f33996a);
        if (bVar.f33996a == com.bytedance.common.wschannel.b.c.CONNECTED) {
            e.a(e.a.WS);
        }
    }

    @Override // com.bytedance.ies.im.core.api.j.a
    public final void a(WsChannelMsg wsChannelMsg, bd bdVar) {
        l.d(wsChannelMsg, "");
        l.d(wsChannelMsg, "");
    }

    @Override // com.bytedance.ies.im.core.api.a.b
    public final void a(com.bytedance.ies.im.core.api.a.a aVar, com.bytedance.ies.im.core.api.a.c cVar) {
        String str;
        String str2 = "";
        l.d(aVar, str2);
        String string = Keva.getRepo("ies_im_core").getString("last_login_uid", str2);
        l.b(string, str2);
        if (cVar != null) {
            str = cVar.f33946a;
        } else {
            str = null;
        }
        Keva repo = Keva.getRepo("ies_im_core");
        if (str != null) {
            str2 = str;
        }
        repo.storeString("last_login_uid", str2);
        com.bytedance.ies.im.core.api.a.a aVar2 = com.bytedance.ies.im.core.api.a.a.UNKNOWN;
        if (!com.bytedance.ies.im.core.api.a.e().a() || str == null || str.length() == 0) {
            aVar2 = com.bytedance.ies.im.core.api.a.a.LOGOUT;
        } else if (string.length() == 0 && com.bytedance.ies.im.core.api.e.a.b(str)) {
            aVar2 = com.bytedance.ies.im.core.api.a.a.LOGIN;
        } else if (string.length() > 0 && com.bytedance.ies.im.core.api.e.a.b(str) && (!l.a((Object) string, (Object) str))) {
            aVar2 = com.bytedance.ies.im.core.api.a.a.SWITCH;
        }
        com.bytedance.ies.im.core.api.a.b().b("PlatformManager", "onAccountChange: " + aVar + ", " + aVar2 + ", " + string + ", " + str);
        if (aVar2 != com.bytedance.ies.im.core.api.a.a.UNKNOWN) {
            com.bytedance.ies.im.core.f.d.f34136b.a(aVar2, cVar);
            e.f34007c.a(aVar2, cVar);
        }
    }
}
