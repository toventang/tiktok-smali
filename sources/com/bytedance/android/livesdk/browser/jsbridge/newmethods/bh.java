package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.bg;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.util.rxutils.i;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.web.jsbridge2.e;
import com.bytedance.ies.web.jsbridge2.g;
import com.google.gson.a.c;
import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import f.a.b.b;
import java.util.HashMap;
import java.util.Map;

public final class bh extends e<a, Object> {

    /* renamed from: a  reason: collision with root package name */
    private bg.a f14559a;

    /* renamed from: b  reason: collision with root package name */
    private b f14560b;

    static {
        Covode.recordClassIndex(8103);
    }

    static final class a {
        @c(a = "title")

        /* renamed from: a  reason: collision with root package name */
        String f14565a;
        @c(a = "desc")

        /* renamed from: b  reason: collision with root package name */
        String f14566b;
        @c(a = "image")

        /* renamed from: c  reason: collision with root package name */
        String f14567c;
        @c(a = "url")

        /* renamed from: d  reason: collision with root package name */
        String f14568d;

        static {
            Covode.recordClassIndex(8106);
        }

        a() {
        }
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public final void onTerminate() {
        b bVar = this.f14560b;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f14559a = null;
    }

    public bh(bg.a aVar) {
        this.f14559a = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.e
    public final /* synthetic */ void invoke(a aVar, g gVar) {
        a aVar2 = aVar;
        final Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        Map<String, String> d2 = b.a.a("").d();
        if (room == null || !TextUtils.isEmpty(aVar2.f14568d)) {
            com.bytedance.android.livesdk.browser.i.b c2 = this.f14559a.c();
            if (aVar2 != null) {
                c2 = new com.bytedance.android.livesdk.browser.i.b(aVar2.f14565a, aVar2.f14566b, aVar2.f14567c, aVar2.f14568d);
            } else if (c2 == null) {
                return;
            }
            if (!TextUtils.isEmpty(c2.f14431d)) {
                Uri.Builder buildUpon = Uri.parse(c2.f14431d).buildUpon();
                buildUpon.appendQueryParameter("share_ht_uid", String.valueOf(u.a().b().c()));
                com.bytedance.android.live.share.a share = ((com.bytedance.android.live.share.c) com.bytedance.android.live.t.a.a(com.bytedance.android.live.share.c.class)).share();
                androidx.fragment.app.e a2 = p.a(gVar.f35646a);
                c.a a3 = com.bytedance.android.livesdkapi.depend.e.c.a();
                a3.f22990m = c2.f14428a;
                a3.n = c2.f14429b;
                a3.o = c2.f14430c;
                a3.f22989l = buildUpon.toString();
                a3.A = d2;
                a3.N = ((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).getReportScene();
                share.a(a2, a3.a(), new com.bytedance.android.livesdkapi.depend.e.b() {
                    /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.bh.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(8105);
                    }

                    @Override // com.bytedance.android.livesdkapi.depend.e.b
                    public final void a(Throwable th) {
                        com.bytedance.android.live.core.c.a.a("SharePanelMethod", th);
                    }

                    @Override // com.bytedance.android.livesdkapi.depend.e.b
                    public final void a(String str, String str2, Bundle bundle) {
                        String str3;
                        String str4 = "";
                        if (bundle != null) {
                            str3 = bundle.getString("shareIdList", str4);
                        } else {
                            str3 = str4;
                        }
                        bh bhVar = bh.this;
                        Room room = room;
                        if (room != null) {
                            str4 = room.getLabels();
                        }
                        bhVar.a(0, str, str4, str3);
                        bh.a(room, str, str2, str3);
                    }
                });
                return;
            }
            return;
        }
        com.bytedance.android.live.share.a share2 = ((com.bytedance.android.live.share.c) com.bytedance.android.live.t.a.a(com.bytedance.android.live.share.c.class)).share();
        androidx.fragment.app.e a4 = p.a(gVar.f35646a);
        c.a a5 = com.bytedance.android.livesdkapi.depend.e.c.a(room);
        a5.A = d2;
        a5.N = ((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).getReportScene();
        share2.a(a4, a5.a(), new com.bytedance.android.livesdkapi.depend.e.b() {
            /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.bh.AnonymousClass1 */

            static {
                Covode.recordClassIndex(8104);
            }

            @Override // com.bytedance.android.livesdkapi.depend.e.b
            public final void a(Throwable th) {
                com.bytedance.android.live.core.c.a.a("SharePanelMethod", th);
            }

            @Override // com.bytedance.android.livesdkapi.depend.e.b
            public final void a(String str, String str2, Bundle bundle) {
                String str3 = "";
                if (bundle != null) {
                    str3 = bundle.getString("shareIdList", str3);
                }
                bh.this.a(room.getId(), str, room.getLabels(), str3);
                bh.a(room, str, str2, str3);
            }
        });
    }

    public final void a(long j2, String str, String str2, String str3) {
        this.f14560b = ((com.bytedance.android.live.share.c) com.bytedance.android.live.t.a.a(com.bytedance.android.live.share.c.class)).sendShare(j2, str, 1, str2, str3).a(bi.f14569a, i.f22196a);
    }

    public static void a(Room room, String str, String str2, String str3) {
        long j2;
        long j3;
        String mD5String = MD5Utils.getMD5String("share_success" + System.currentTimeMillis());
        b.a.a("share_info").a("bind_id", mD5String).a("to_user_id", str3).b();
        HashMap hashMap = new HashMap();
        hashMap.put("share_platform", str);
        hashMap.put("share_type", str2);
        hashMap.put("bind_id", mD5String);
        if (room != null) {
            hashMap.put("log_pb", room.getLog_pb());
        }
        String g2 = com.bytedance.android.livesdk.ab.e.g();
        Room room2 = (Room) DataChannelGlobal.f34575d.b(ac.class);
        f b2 = u.a().b();
        if (room2 != null) {
            j2 = room2.getOwnerUserId();
        } else {
            j2 = -1;
        }
        if (b2 != null) {
            j3 = b2.c();
        } else {
            j3 = -2;
        }
        if (j2 != j3 && ((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).isRoomInBattle()) {
            hashMap.put("connection_type", "manual_pk");
            hashMap.put("pk_id", String.valueOf(((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).getBattleId()));
        }
        if (TextUtils.isEmpty(g2) || !"click_push_live_cd_user".equals(g2)) {
            hashMap.put("is_subscribe", "0");
        } else {
            hashMap.put("is_subscribe", "1");
        }
        if (y.f()) {
            hashMap.put("room_orientation", "portrait");
        } else {
            hashMap.put("room_orientation", "landscape");
        }
        b.a.a("share").a((Map<String, String>) hashMap).f("click").a().b();
    }
}
