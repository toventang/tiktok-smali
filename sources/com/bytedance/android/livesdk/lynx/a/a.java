package com.bytedance.android.livesdk.lynx.a;

import com.bytedance.android.live.b.n;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.network.h;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.google.gson.o;
import com.lynx.tasm.LynxEnv;
import h.a.ag;
import h.f.a.b;
import h.f.b.l;
import h.q;
import h.r;
import h.z;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final C0391a f18753c = new C0391a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f18754a = "{}";

    /* renamed from: b  reason: collision with root package name */
    public Map<String, ? extends Object> f18755b = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    private final b<o, z> f18756d;

    static {
        Covode.recordClassIndex(11093);
    }

    /* renamed from: com.bytedance.android.livesdk.lynx.a.a$a  reason: collision with other inner class name */
    public static final class C0391a {
        static {
            Covode.recordClassIndex(11094);
        }

        private C0391a() {
        }

        public /* synthetic */ C0391a(byte b2) {
            this();
        }

        public static void a(o oVar) {
            String str;
            User owner;
            String valueOf;
            Set<Map.Entry<String, String>> entrySet;
            h a2 = h.a();
            l.b(a2, "");
            Map<String, String> b2 = a2.b();
            if (!(b2 == null || (entrySet = b2.entrySet()) == null)) {
                for (T t : entrySet) {
                    oVar.a((String) t.getKey(), (String) t.getValue());
                    String str2 = (String) t.getKey();
                    if (str2 != null) {
                        int hashCode = str2.hashCode();
                        if (hashCode != -102670958) {
                            if (hashCode != 96572) {
                                if (hashCode == 25209764 && str2.equals("device_id")) {
                                    oVar.a("deviceId", (String) t.getValue());
                                }
                            } else if (str2.equals("aid")) {
                                oVar.a("appId", (String) t.getValue());
                            }
                        } else if (str2.equals("version_name")) {
                            oVar.a("appVersion", (String) t.getValue());
                        }
                    }
                }
            }
            oVar.a("screenWidth", Float.valueOf(y.e(y.c())));
            oVar.a("screenHeight", Float.valueOf(y.e(y.b())));
            l.b(LynxEnv.b(), "");
            oVar.a("lynx_version", "2.1.5-rc.33-cxxshared");
            Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
            String str3 = "0";
            if (room == null || (str = String.valueOf(room.getId())) == null) {
                str = str3;
            }
            oVar.a("room_id", str);
            f b3 = u.a().b();
            l.b(b3, "");
            oVar.a("user_id", String.valueOf(b3.c()));
            Room room2 = (Room) DataChannelGlobal.f34575d.b(ac.class);
            if (!(room2 == null || (owner = room2.getOwner()) == null || (valueOf = String.valueOf(owner.getId())) == null)) {
                str3 = valueOf;
            }
            oVar.a("anchor_id", str3);
            oVar.a("status_bar_height", Float.valueOf(y.e(com.bytedance.android.live.core.f.ac.a(y.e()))));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super com.google.gson.o, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(b<? super o, z> bVar) {
        l.d(bVar, "");
        this.f18756d = bVar;
    }

    public final void a(String str, com.bytedance.android.livesdk.browser.c.a aVar, b<? super o, z> bVar, b<? super Map<String, ? extends Object>, z> bVar2) {
        Object obj;
        Map map;
        l.d(str, "");
        l.d(aVar, "");
        l.d(bVar, "");
        l.d(bVar2, "");
        o oVar = new o();
        o oVar2 = new o();
        C0391a.a(oVar2);
        oVar2.a("location", str);
        this.f18756d.invoke(oVar2);
        bVar.invoke(oVar2);
        oVar.a("__globalProps", oVar2);
        try {
            obj = q.m223constructorimpl(n.a((com.google.gson.l) oVar));
        } catch (Throwable th) {
            obj = q.m223constructorimpl(r.a(th));
        }
        if (q.m228isFailureimpl(obj)) {
            obj = "{}";
        }
        this.f18754a = (String) obj;
        try {
            map = q.m223constructorimpl(n.a(oVar));
        } catch (Throwable th2) {
            map = q.m223constructorimpl(r.a(th2));
        }
        Map a2 = ag.a();
        if (q.m228isFailureimpl(map)) {
            map = a2;
        }
        this.f18755b = (Map) map;
    }
}
