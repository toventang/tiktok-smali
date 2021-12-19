package com.bytedance.android.livesdk.ab;

import android.text.TextUtils;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.c.a;
import com.bytedance.android.livesdk.ab.j;
import com.bytedance.android.livesdk.chatroom.d;
import com.bytedance.android.livesdk.chatroom.g.k;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.j;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.e.a.a;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public boolean f13557a = true;

    static {
        Covode.recordClassIndex(7514);
    }

    public final void b(final EnterRoomConfig enterRoomConfig) {
        if (enterRoomConfig != null && enterRoomConfig.f23298b != null && enterRoomConfig.f23299c != null) {
            final String str = enterRoomConfig.f23298b.f23317i;
            final String str2 = enterRoomConfig.f23298b.f23318j;
            final String str3 = enterRoomConfig.f23298b.f23309a;
            final long j2 = enterRoomConfig.f23299c.R;
            final String str4 = enterRoomConfig.f23299c.ad;
            final String str5 = enterRoomConfig.f23299c.s;
            final String str6 = enterRoomConfig.f23298b.r;
            final String str7 = enterRoomConfig.f23298b.f23310b;
            a.a().a(null, new Callable() {
                /* class com.bytedance.android.livesdk.ab.f.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(7515);
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String str;
                    HashMap hashMap = new HashMap();
                    hashMap.put("room_id", String.valueOf(j2));
                    hashMap.put("anchor_id", String.valueOf(str7));
                    hashMap.put("request_id", str3);
                    if (!TextUtils.isEmpty(str4)) {
                        hashMap.put("moment_room_source", str4);
                    }
                    hashMap.put("is_preview", enterRoomConfig.f23299c.q);
                    hashMap.put("is_sale", "unknown");
                    hashMap.put("orientation", String.valueOf(enterRoomConfig.f23299c.r));
                    if (!m.a(enterRoomConfig.f23299c.W)) {
                        hashMap.put("live_window_mode", enterRoomConfig.f23299c.W);
                    }
                    if (enterRoomConfig.f23299c.ae != -1) {
                        hashMap.put("small_picture_order", String.valueOf(enterRoomConfig.f23299c.ae));
                    }
                    if (f.this.f13557a) {
                        if (!TextUtils.isEmpty(enterRoomConfig.f23298b.f23309a)) {
                            hashMap.put("request_id", enterRoomConfig.f23298b.f23309a);
                        }
                        if (!TextUtils.isEmpty(enterRoomConfig.f23298b.f23315g)) {
                            hashMap.put("log_pb", enterRoomConfig.f23298b.f23315g);
                        }
                        k.a(f.this.f13557a, enterRoomConfig);
                        f.this.f13557a = false;
                    } else {
                        d.a(Long.valueOf(j2));
                        d.b(Long.valueOf(u.a().b().c()));
                        k.a(f.this.f13557a, enterRoomConfig);
                    }
                    if (!TextUtils.isEmpty(str5) && "draw".equals(enterRoomConfig.f23299c.ab)) {
                        hashMap.put("scene_id", str5);
                    }
                    String str2 = "0";
                    if (TextUtils.isEmpty(str6) || !"click_push_live_cd_user".equals(str6)) {
                        hashMap.put("is_subscribe", str2);
                    } else {
                        hashMap.put("is_subscribe", "1");
                    }
                    hashMap.put("growth_deepevent", "1");
                    if (enterRoomConfig.f23298b.f23320l) {
                        str = "1";
                    } else {
                        str = str2;
                    }
                    hashMap.put("is_video_head", str);
                    hashMap.put("live_type", j.a(enterRoomConfig.f23299c.S));
                    hashMap.put("request_page", str);
                    hashMap.put("anchor_type", str2);
                    if (!m.a(d.a().e())) {
                        hashMap.put("enter_live_method", d.a().e());
                    }
                    if (!TextUtils.isEmpty(enterRoomConfig.f23298b.D)) {
                        hashMap.put("enter_live_method", enterRoomConfig.f23298b.D);
                    }
                    if (!TextUtils.isEmpty(enterRoomConfig.f23298b.E)) {
                        hashMap.put("order", enterRoomConfig.f23298b.E);
                    }
                    if (!TextUtils.isEmpty(enterRoomConfig.f23298b.F)) {
                        hashMap.put("watch_user_cnt", enterRoomConfig.f23298b.F);
                    }
                    hashMap.put("request_page", d.a().e());
                    if (!TextUtils.isEmpty(e.m())) {
                        hashMap.put("list_item_id", String.valueOf(j2));
                    }
                    if (enterRoomConfig.f23299c.aw) {
                        str2 = "1";
                    }
                    hashMap.put("is_return", str2);
                    if (!TextUtils.isEmpty(enterRoomConfig.f23298b.f23314f)) {
                        hashMap.put("live_reason", enterRoomConfig.f23298b.f23314f);
                    }
                    hashMap.put("has_banner", String.valueOf(com.bytedance.android.b.a.a.f6785g.c()));
                    b.a.a("rec_live_play").a((Map<String, String>) hashMap).a().b("live_view").f(enterRoomConfig.f23299c.ab).b();
                    return null;
                }
            }, 0);
        }
    }

    public static void a(EnterRoomConfig enterRoomConfig) {
        EnterRoomConfig enterRoomConfig2 = f.a.f23366a.a().f23354b;
        if (DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.ab.c.b.class) == null) {
            a.C0285a aVar = new a.C0285a();
            aVar.f13467a = enterRoomConfig2.f23299c.L;
            aVar.f13468b = enterRoomConfig.f23299c.J;
            aVar.f13469c = enterRoomConfig.f23298b.f23321m;
            if (enterRoomConfig.f23298b.n != 0) {
                aVar.f13470d = Long.valueOf(enterRoomConfig.f23298b.n);
            }
            aVar.f13471e = enterRoomConfig.f23298b.f23311c;
            aVar.f13472f = enterRoomConfig.f23298b.o;
            aVar.f13475i = enterRoomConfig.f23298b.p;
            aVar.f13476j = enterRoomConfig.f23298b.r;
            aVar.f13477k = enterRoomConfig.f23298b.s;
            aVar.f13478l = enterRoomConfig.f23298b.q;
            aVar.f13479m = enterRoomConfig.f23298b.f23314f;
            aVar.D = enterRoomConfig.f23298b.H;
            aVar.F = (long) com.bytedance.android.b.a.a.f6785g.a().size();
            aVar.G = enterRoomConfig.f23298b.K;
            aVar.H = enterRoomConfig.f23298b.L;
            aVar.E = enterRoomConfig.f23298b.J;
            aVar.I = enterRoomConfig.f23298b.I;
            aVar.o = enterRoomConfig.f23298b.x;
            aVar.p = enterRoomConfig.f23298b.y;
            aVar.q = enterRoomConfig.f23298b.z;
            aVar.r = enterRoomConfig.f23298b.A;
            aVar.s = enterRoomConfig.f23298b.B;
            aVar.t = Boolean.valueOf(enterRoomConfig.f23298b.f23320l);
            aVar.n = enterRoomConfig.f23299c.M;
            aVar.u = enterRoomConfig.f23298b.f23315g;
            aVar.v = enterRoomConfig.f23298b.f23309a;
            aVar.C = enterRoomConfig.f23298b.G;
            aVar.L = enterRoomConfig.f23299c.aG;
            String str = enterRoomConfig2.f23299c.q;
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            aVar.w = str;
            if (enterRoomConfig2.f23299c.ae != -1) {
                aVar.y = Long.valueOf(enterRoomConfig2.f23299c.ae);
            }
            if (enterRoomConfig.f23299c.au.f23307c == 1) {
                aVar.z = "1";
                aVar.B = enterRoomConfig.f23299c.au.f23308d;
            } else {
                aVar.z = "0";
            }
            aVar.J = enterRoomConfig.f23298b.f23312d;
            aVar.K = enterRoomConfig.f23298b.f23313e;
            aVar.M = Long.valueOf(enterRoomConfig.f23299c.aH);
            aVar.N = Long.valueOf(enterRoomConfig.f23299c.aI);
            com.bytedance.android.livesdk.utils.a.a(enterRoomConfig, aVar);
            DataChannelGlobal.f34575d.a(com.bytedance.android.livesdk.ab.c.b.class, aVar.a());
        }
    }

    public static void a(String str, EnterRoomConfig enterRoomConfig) {
        String str2 = enterRoomConfig.f23298b.f23309a;
        if (TextUtils.isEmpty(str2)) {
            str2 = enterRoomConfig.f23298b.f23309a;
        }
        String str3 = enterRoomConfig.f23298b.f23315g;
        long j2 = enterRoomConfig.f23299c.R;
        String str4 = enterRoomConfig.f23298b.f23310b;
        String c2 = e.c();
        String str5 = enterRoomConfig.f23299c.ad;
        String str6 = enterRoomConfig.f23299c.s;
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", String.valueOf(j2));
        hashMap.put("anchor_id", str4);
        d.a(Long.valueOf(j2));
        d.b(Long.valueOf(u.a().b().c()));
        String str7 = enterRoomConfig.f23299c.J;
        String str8 = enterRoomConfig.f23299c.L;
        hashMap.put("request_id", str2);
        hashMap.put("log_pb", str3);
        hashMap.put("action_type", str);
        hashMap.put("enter_from_merge", str7);
        hashMap.put("enter_method", str8);
        if (!TextUtils.isEmpty(str5)) {
            hashMap.put("moment_room_source", str5);
        }
        if (!TextUtils.isEmpty(str6) && "draw".equals(str)) {
            hashMap.put("scene_id", str6);
        }
        String str9 = "0";
        if ("draw".equals(str)) {
            hashMap.put("orientation", str9);
        }
        if (!m.a(enterRoomConfig.f23299c.W)) {
            hashMap.put("live_window_mode", enterRoomConfig.f23299c.W);
        }
        String g2 = e.g();
        if (TextUtils.isEmpty(g2) || !"click_push_live_cd_user".equals(g2)) {
            hashMap.put("is_subscribe", str9);
        } else {
            hashMap.put("is_subscribe", "1");
        }
        if (enterRoomConfig.f23299c.ae != -1) {
            hashMap.put("small_picture_order", String.valueOf(enterRoomConfig.f23299c.ae));
        }
        if (!TextUtils.isEmpty(e.m())) {
            hashMap.put("list_item_id", String.valueOf(j2));
        }
        if (!m.a(d.a().e())) {
            hashMap.put("enter_live_method", d.a().e());
        }
        if (enterRoomConfig.f23299c.aw) {
            str9 = "1";
        }
        hashMap.put("is_return", str9);
        b.a.a("live_show").a((Map<String, String>) hashMap).a().d("").b("live_view").c("core").e(c2).b();
    }

    public static void a(EnterRoomConfig enterRoomConfig, String str, long j2, String str2) {
        if (enterRoomConfig != null) {
            if (TextUtils.isEmpty(str)) {
                str = enterRoomConfig.f23299c.D;
            }
            if (j2 == 0) {
                j2 = enterRoomConfig.f23299c.R;
            }
            if (TextUtils.equals(e.d(), "push")) {
                b.a.a("livesdk_push_error").a(new j.a().a("anchor_id", str).a("anchor_status", str2).a("room_id", String.valueOf(j2)).f13591a).b();
            }
        }
    }
}
