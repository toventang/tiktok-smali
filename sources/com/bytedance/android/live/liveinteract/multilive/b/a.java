package com.bytedance.android.live.liveinteract.multilive.b;

import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.e;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.b.a.d;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.f.b.l;
import h.p;
import h.v;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a */
    public static com.bytedance.android.live.liveinteract.multiguest.opt.a.a f11749a;

    /* renamed from: b */
    public static final a f11750b = new a();

    /* renamed from: c */
    private static n f11751c = n.NORMAL;

    /* renamed from: d */
    private static long f11752d;

    /* renamed from: e */
    private static n f11753e = n.NORMAL;

    /* renamed from: f */
    private static long f11754f;

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.b.a$a */
    public enum EnumC0242a {
        DEFAULT_MODE("default_mode"),
        MANUAL_SETTING("manual_setting"),
        CLOSE_MODE("close_mode");
        
        private final String value;

        public final String getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(6401);
        }

        private EnumC0242a(String str) {
            this.value = str;
        }
    }

    private a() {
    }

    public static void a(Map<String, String> map) {
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            l.b(idStr, "");
            map.put("room_id", idStr);
            f b2 = u.a().b();
            l.b(b2, "");
            map.put("user_id", String.valueOf(b2.c()));
            map.put("enter_method", e.d());
            map.put("enter_from_merge", e.a());
            map.put("action_type", e.e());
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = f11749a;
            n nVar = aVar != null ? aVar.q : null;
            map.put("layout_setting", a(nVar).getFirst());
            map.put("window_setting", a(nVar).getSecond());
            String requestId = room.getRequestId();
            if (requestId != null) {
                map.put("request_id", requestId);
            }
        }
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = f11749a;
        map.put("guest_cnt", String.valueOf(aVar2 != null ? aVar2.f11297g : 0));
    }

    public static void a(Map<String, String> map, n nVar) {
        l.d(map, "");
        map.put("layout_setting", a(nVar).getFirst());
        map.put("window_setting", a(nVar).getSecond());
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = f11749a;
        map.put("guest_cnt", String.valueOf(aVar != null ? aVar.f11297g : 0));
    }

    public static void a(String str, Map<String, String> map) {
        b.a.a(str).a().a(map).b();
    }

    public static boolean a() {
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = f11749a;
        n nVar = aVar != null ? aVar.q : null;
        return nVar == n.GRID_FIX || nVar == n.FLOATING_FIX || nVar == n.GRID || nVar == n.FLOATING;
    }

    public static n b() {
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = f11749a;
        if (aVar != null) {
            return aVar.q;
        }
        return null;
    }

    public static n c() {
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = f11749a;
        if (aVar != null) {
            return aVar.p;
        }
        return null;
    }

    static {
        Covode.recordClassIndex(6400);
    }

    private static p<String, String> d() {
        com.bytedance.android.livesdk.chatroom.model.c.a aVar;
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = f11749a;
        if (aVar2 == null || (aVar = aVar2.f11299i) == null) {
            aVar = d.a().w;
        }
        if (aVar != null) {
            if (aVar.f15742c == 3 && aVar.f15743d == 4) {
                return v.a("on", "on");
            }
            if (aVar.f15742c == 3 && aVar.f15743d == 3) {
                return v.a("off", "on");
            }
            if (aVar.f15742c == 4 && aVar.f15743d == 4) {
                return v.a("on", "on");
            }
        }
        return v.a("err", "err");
    }

    public static void a(String str) {
        l.d(str, "");
        HashMap hashMap = new HashMap();
        a(hashMap);
        hashMap.put("connection_type", "guest");
        hashMap.put("way_of_open", str);
        a("livesdk_layoutsettings_open", hashMap);
    }

    public static void b(String str) {
        l.d(str, "");
        HashMap hashMap = new HashMap();
        a(hashMap);
        hashMap.put("connection_type", "guest");
        hashMap.put("switch_to", str);
        a("livesdk_layoutwindowsettings_switch", hashMap);
    }

    public static p<String, String> a(n nVar) {
        if (nVar != null) {
            int i2 = b.f11756a[nVar.ordinal()];
            if (i2 == 1) {
                return v.a("floating", "fixed");
            }
            if (i2 == 2) {
                return v.a("floating", "unfixed");
            }
            if (i2 == 3) {
                return v.a("grid", "fixed");
            }
            if (i2 == 4) {
                return v.a("grid", "unfixed");
            }
        }
        return v.a("normal_floating", "not_existed");
    }

    public static void a(EnumC0242a aVar) {
        n nVar;
        l.d(aVar, "");
        HashMap hashMap = new HashMap();
        a(hashMap);
        hashMap.put("connection_type", "guest");
        hashMap.put("trigger", aVar.getValue());
        hashMap.put("guest_mode_status", b(aVar).getSecond());
        hashMap.put("switch_to", b(aVar).getFirst());
        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class);
        l.b(a2, "");
        hashMap.put("guest_cnt", String.valueOf(((com.bytedance.android.live.liveinteract.api.b) a2).getLinkedGuestNum()));
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = f11749a;
        n nVar2 = null;
        if (aVar2 != null) {
            nVar = aVar2.q;
        } else {
            nVar = null;
        }
        hashMap.put("layout_setting", a(nVar).getFirst());
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar3 = f11749a;
        if (aVar3 != null) {
            nVar2 = aVar3.q;
        }
        hashMap.put("window_setting", a(nVar2).getSecond());
        a("livesdk_permissionsettiings_followers_only_on_and_off", hashMap);
    }

    private static p<String, String> b(EnumC0242a aVar) {
        com.bytedance.android.livesdk.chatroom.model.c.a aVar2;
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar3 = f11749a;
        if (aVar3 != null) {
            aVar2 = aVar3.f11299i;
        } else {
            aVar2 = null;
        }
        int i2 = b.f11757b[aVar.ordinal()];
        if (i2 == 1) {
            if (aVar2 != null) {
                if (aVar2.f15742c == 3 && aVar2.f15743d == 4) {
                    return v.a("off", "on");
                }
                if (aVar2.f15742c == 3 && aVar2.f15743d == 3) {
                    return v.a("on", "on");
                }
                if (aVar2.f15742c == 4 && aVar2.f15743d == 4) {
                    return v.a("off", "off");
                }
            }
            return v.a("err", "err");
        } else if (i2 == 2) {
            return d();
        } else {
            if (i2 == 3) {
                return v.a("off", "off");
            }
            throw new h.n();
        }
    }

    public static void c(String str) {
        l.d(str, "");
        if (f11753e != null) {
            HashMap hashMap = new HashMap();
            a(hashMap);
            hashMap.put("trigger", str);
            n nVar = f11753e;
            f11753e = null;
            hashMap.put("layout_setting", a(nVar).getFirst());
            hashMap.put("window_setting", a(nVar).getSecond());
            hashMap.put("duration", String.valueOf(System.currentTimeMillis() - f11754f));
            a("livesdk_multilive_mode_connection_duration", hashMap);
            if (nVar != f11751c) {
                b(str, nVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r4 != null) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r3, com.bytedance.android.live.liveinteract.api.b.n r4) {
        /*
            java.lang.String r0 = ""
            h.f.b.l.d(r3, r0)
            com.bytedance.android.live.liveinteract.api.b.n r0 = com.bytedance.android.live.liveinteract.multilive.b.a.f11751c
            if (r4 != r0) goto L_0x000a
            return
        L_0x000a:
            if (r0 == 0) goto L_0x000f
            b(r3, r0)
        L_0x000f:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            a(r2)
            java.lang.String r0 = "trigger"
            r2.put(r0, r3)
            if (r4 != 0) goto L_0x0026
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a r0 = com.bytedance.android.live.liveinteract.multilive.b.a.f11749a
            if (r0 == 0) goto L_0x004e
            com.bytedance.android.live.liveinteract.api.b.n r4 = r0.q
        L_0x0024:
            if (r4 == 0) goto L_0x0028
        L_0x0026:
            com.bytedance.android.live.liveinteract.multilive.b.a.f11751c = r4
        L_0x0028:
            h.p r0 = a(r4)
            java.lang.Object r1 = r0.getFirst()
            java.lang.String r0 = "layout_setting"
            r2.put(r0, r1)
            h.p r0 = a(r4)
            java.lang.Object r1 = r0.getSecond()
            java.lang.String r0 = "window_setting"
            r2.put(r0, r1)
            java.lang.String r0 = "livesdk_multilive_mode_watch_start"
            a(r0, r2)
            long r0 = java.lang.System.currentTimeMillis()
            com.bytedance.android.live.liveinteract.multilive.b.a.f11752d = r0
            return
        L_0x004e:
            r4 = 0
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multilive.b.a.a(java.lang.String, com.bytedance.android.live.liveinteract.api.b.n):void");
    }

    public static void b(String str, n nVar) {
        l.d(str, "");
        if (f11751c != null) {
            HashMap hashMap = new HashMap();
            a(hashMap);
            if ((!l.a((Object) str, (Object) "live_over")) && (!l.a((Object) str, (Object) "manual_setting_switch")) && (!l.a((Object) str, (Object) "connection_start"))) {
                str = "others";
            }
            hashMap.put("trigger", str);
            if (nVar == null) {
                nVar = f11751c;
            }
            f11751c = null;
            hashMap.put("layout_setting", a(nVar).getFirst());
            hashMap.put("window_setting", a(nVar).getSecond());
            hashMap.put("duration", String.valueOf(System.currentTimeMillis() - f11752d));
            a("livesdk_multilive_mode_watch_duration", hashMap);
        }
    }

    private void a(String str, Integer num) {
        n nVar;
        l.d(str, "");
        HashMap hashMap = new HashMap();
        a(hashMap);
        hashMap.put("trigger", str);
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = f11749a;
        if (aVar != null) {
            nVar = aVar.q;
            if (nVar != null) {
                f11753e = nVar;
            }
        } else {
            nVar = null;
        }
        hashMap.put("layout_setting", a(nVar).getFirst());
        hashMap.put("window_setting", a(nVar).getSecond());
        if (num != null) {
            hashMap.put("guest_cnt", String.valueOf(num.intValue()));
        }
        a("livesdk_multilive_mode_connection_start", hashMap);
        f11754f = System.currentTimeMillis();
        a(str, nVar);
    }

    public static void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        HashMap hashMap = new HashMap();
        a(hashMap);
        hashMap.put("connection_type", "guest");
        hashMap.put("switch_to", str);
        hashMap.put("decision", str2);
        a("livesdk_layoutwindowsettings_confirm", hashMap);
    }

    public static void a(String str, String str2, int i2) {
        l.d(str, "");
        l.d(str2, "");
        HashMap hashMap = new HashMap();
        a(hashMap);
        hashMap.put("connection_type", "guest");
        hashMap.put("switch_to", str);
        hashMap.put("way_of_switch", str2);
        hashMap.put("is_success", String.valueOf(i2));
        a("livesdk_camera_on_and_off", hashMap);
    }

    public static /* synthetic */ void a(a aVar, String str, Integer num, int i2) {
        if ((i2 & 4) != 0) {
            num = null;
        }
        aVar.a(str, num);
    }
}
