package com.bytedance.android.livesdk.usermanage;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.c.c;
import com.bytedance.android.live.broadcast.model.j;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.liveinteract.api.b;
import com.bytedance.android.live.s.a.a;
import com.bytedance.android.live.s.e;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.c.h;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.j.ci;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveMuteCommentsListSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveReportOptimizeUrlSetting;
import com.bytedance.android.livesdk.usermanage.a;
import com.bytedance.android.livesdk.usermanage.f;
import com.bytedance.android.livesdk.usermanage.g;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.android.livesdkapi.model.d;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import f.a.ab;
import f.a.h.a;
import h.f.b.l;
import h.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class i implements e {
    static {
        Covode.recordClassIndex(12993);
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.s.e
    public ab<j> getMuteDuration() {
        f b2 = u.a().b();
        l.b(b2, "");
        long c2 = b2.c();
        j jVar = g.f22029a.get(Long.valueOf(c2));
        if (jVar != null) {
            ab<j> a2 = ab.a(jVar);
            l.b(a2, "");
            return a2;
        }
        ab<j> a3 = ab.a((Callable) new g.c(c2)).b(j.f7923b).b(a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        l.b(a3, "");
        return a3;
    }

    @Override // com.bytedance.android.live.s.e
    public String getReportScene() {
        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(b.class);
        l.b(a2, "");
        if (((b) a2).isRoomInBattle()) {
            return "manual_pk";
        }
        com.bytedance.android.live.base.a a3 = com.bytedance.android.live.t.a.a(b.class);
        l.b(a3, "");
        if (((b) a3).isInCoHost()) {
            return "anchor";
        }
        com.bytedance.android.live.base.a a4 = com.bytedance.android.live.t.a.a(b.class);
        l.b(a4, "");
        if (((b) a4).getLinkedGuestNum() > 0) {
            return "audience";
        }
        return "regular";
    }

    @Override // com.bytedance.android.live.s.e
    public void fetchMuteDurationList(h.f.a.b<? super List<j>, z> bVar) {
        l.d(bVar, "");
        l.d(bVar, "");
        double[] value = LiveMuteCommentsListSetting.INSTANCE.getValue();
        ArrayList arrayList = new ArrayList(value.length);
        for (double d2 : value) {
            arrayList.add(new j((long) d2));
        }
        bVar.invoke(arrayList);
    }

    @Override // com.bytedance.android.live.s.e
    public void setMuteDuration(j jVar) {
        l.d(jVar, "");
        l.d(jVar, "");
        f b2 = u.a().b();
        l.b(b2, "");
        long c2 = b2.c();
        if (!l.a(g.f22029a.get(Long.valueOf(c2)), jVar)) {
            g.f22029a.put(Long.valueOf(c2), jVar);
            DataChannelGlobal.f34575d.c(ci.class, jVar);
            g.f fVar = new g.f(jVar);
            f.a.e.b.b.a((Object) fVar, "run is null");
            a.a(new f.a.e.e.a.f(fVar)).b(a.b(f.a.k.a.f158006c)).a(f.a.e.b.a.f157195h).cG_();
        }
    }

    @Override // com.bytedance.android.live.s.e
    public void report(Context context, c cVar) {
        l.d(cVar, "");
        d dVar = new d(cVar.f22967c, cVar.f22968d, cVar.f22968d, cVar.w, "share", com.bytedance.android.livesdk.ab.e.a(), com.bytedance.android.livesdk.ab.e.d(), com.bytedance.android.livesdk.ab.e.e(), "report_anchor", cVar.t);
        dVar.s = cVar.N;
        report(context, dVar);
    }

    @Override // com.bytedance.android.live.s.e
    public void fetchAdminList(com.bytedance.android.live.s.a aVar, long j2) {
        String str;
        com.bytedance.android.live.base.model.user.b a2;
        l.d(aVar, "");
        l.d(aVar, "");
        WeakReference weakReference = new WeakReference(aVar);
        AdminApi adminApi = (AdminApi) com.bytedance.android.live.network.e.a().a(AdminApi.class);
        String a3 = u.a().b().a(j2);
        f b2 = u.a().b();
        if (b2 == null || (a2 = b2.a()) == null) {
            str = null;
        } else {
            str = a2.getSecUid();
        }
        adminApi.fetchAdministrators(j2, a3, str).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new a.C0482a(weakReference), new a.b(weakReference));
    }

    @Override // com.bytedance.android.live.s.e
    public void report(Context context, d dVar) {
        int i2;
        int d2;
        int i3;
        com.bytedance.android.livesdk.browser.c.d webViewManager;
        com.bytedance.android.live.core.widget.a a2;
        com.bytedance.android.livesdk.ab.c.c cVar;
        String str;
        String str2 = "";
        l.d(dVar, str2);
        String value = LiveReportOptimizeUrlSetting.INSTANCE.getValue();
        if (TextUtils.isEmpty(value)) {
            com.bytedance.android.livesdk.ab.a a3 = c.a.d("ttlive_report_user_error").a("error_code", (Long) -1L).a("error_msg", "live report url is empty");
            a3.f13426c = true;
            a3.a();
            return;
        }
        String a4 = dVar.a(value);
        d.b a5 = com.bytedance.android.livesdk.browser.c.e.a(a4).a(8, 8, 0, 0);
        int i4 = -1;
        if (dVar.f23286m) {
            i2 = -1;
        } else {
            i2 = -16777216;
        }
        a5.f14310k = i2;
        a5.s = true;
        a5.t = true;
        if (dVar.f23278e != 0) {
            i4 = dVar.f23278e;
        } else if (dVar.f23286m) {
            i4 = (int) y.e((int) ((((float) y.b()) * 1.0f) / 2.0f));
        }
        a5.f14302c = i4;
        if (dVar.f23279f != 0) {
            d2 = dVar.f23279f;
        } else if (dVar.f23286m) {
            d2 = (int) y.e(y.c());
        } else {
            d2 = y.d(R.dimen.wl);
        }
        a5.f14301b = d2;
        if (dVar.f23286m) {
            i3 = 80;
        } else {
            i3 = 5;
        }
        a5.f14309j = i3;
        com.bytedance.android.live.b.f fVar = (com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class);
        if (fVar != null && (webViewManager = fVar.webViewManager()) != null && (a2 = webViewManager.a(a5)) != null && (context instanceof androidx.fragment.app.e)) {
            com.bytedance.android.live.core.widget.a.a(p.a(context), a2);
            HashMap hashMap = new HashMap();
            String valueOf = String.valueOf(dVar.f23276c);
            l.b(valueOf, str2);
            hashMap.put("anchor_id", valueOf);
            String valueOf2 = String.valueOf(dVar.f23275b);
            l.b(valueOf2, str2);
            hashMap.put("room_id", valueOf2);
            String valueOf3 = String.valueOf(dVar.f23277d);
            l.b(valueOf3, str2);
            hashMap.put("to_user_id", valueOf3);
            String str3 = dVar.f23281h;
            l.b(str3, str2);
            hashMap.put("request_page", str3);
            hashMap.put("event_page", "live_detail");
            String a6 = dVar.a();
            l.b(a6, str2);
            hashMap.put("admin_type", a6);
            if (l.a((Object) dVar.o, (Object) "3")) {
                hashMap.put("report_type", "report_question");
            } else if (!TextUtils.isEmpty(dVar.n)) {
                String str4 = dVar.n;
                l.b(str4, str2);
                hashMap.put("report_type", str4);
            }
            com.bytedance.android.livesdk.chatroom.d a7 = com.bytedance.android.livesdk.chatroom.d.a();
            l.b(a7, str2);
            if (!m.a(a7.e())) {
                com.bytedance.android.livesdk.chatroom.d a8 = com.bytedance.android.livesdk.chatroom.d.a();
                l.b(a8, str2);
                String e2 = a8.e();
                l.b(e2, str2);
                hashMap.put("enter_live_method", e2);
            }
            hashMap.put("small_picture_order", com.bytedance.android.livesdk.ab.e.l());
            h n = com.bytedance.android.livesdk.ab.e.n();
            if (!(n == null || (cVar = n.f13529d) == null || (str = cVar.f13483d) == null)) {
                str2 = str;
            }
            hashMap.put("live_window_mode", str2);
            if (y.f()) {
                hashMap.put("room_orientation", "portrait");
            } else {
                hashMap.put("room_orientation", "landscape");
            }
            hashMap.put("report_click_time", String.valueOf(System.currentTimeMillis()));
            b.a.a("livesdk_live_user_report").a((Map<String, String>) hashMap).a("scene", dVar.s).a().b();
            c.a.a("ttlive_report_user").a("report_url", a4).a();
        }
    }

    @Override // com.bytedance.android.live.s.e
    public com.bytedance.android.live.s.d configUserHelper(com.bytedance.android.livesdk.ui.a aVar, DataChannel dataChannel, f.a.b.a aVar2) {
        l.d(aVar, "");
        l.d(dataChannel, "");
        l.d(aVar2, "");
        return new h(aVar, dataChannel, aVar2);
    }

    @Override // com.bytedance.android.live.s.e
    public void unmuteUser(User user, long j2, com.bytedance.android.live.s.g gVar) {
        l.d(user, "");
        l.d(gVar, "");
        l.d(user, "");
        l.d(gVar, "");
        WeakReference weakReference = new WeakReference(gVar);
        ((MuteApi) com.bytedance.android.live.network.e.a().a(MuteApi.class)).unmute(j2, user.getId(), user.getSecUid()).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new g.C0484g(user, weakReference, j2), new g.h(weakReference, j2, user));
    }

    @Override // com.bytedance.android.live.s.e
    public void fetchKickOutList(com.bytedance.android.live.s.b bVar, long j2, int i2, int i3) {
        String str;
        com.bytedance.android.live.base.model.user.b a2;
        l.d(bVar, "");
        l.d(bVar, "");
        WeakReference weakReference = new WeakReference(bVar);
        bVar.a();
        KickOutApi kickOutApi = (KickOutApi) com.bytedance.android.live.network.e.a().a(KickOutApi.class);
        f b2 = u.a().b();
        if (b2 == null || (a2 = b2.a()) == null) {
            str = null;
        } else {
            str = a2.getSecUid();
        }
        kickOutApi.getKickedOutList(j2, i3, i2, str).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new f.a(weakReference), new f.b(weakReference));
    }

    @Override // com.bytedance.android.live.s.e
    public void fetchMuteList(com.bytedance.android.live.s.c cVar, long j2, int i2, int i3) {
        String str;
        com.bytedance.android.live.base.model.user.b a2;
        l.d(cVar, "");
        l.d(cVar, "");
        WeakReference weakReference = new WeakReference(cVar);
        cVar.c();
        MuteApi muteApi = (MuteApi) com.bytedance.android.live.network.e.a().a(MuteApi.class);
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        if (b2 == null || (a2 = b2.a()) == null) {
            str = null;
        } else {
            str = a2.getSecUid();
        }
        muteApi.getMuteList(j2, i3, i2, str).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new g.a(weakReference), new g.b(weakReference));
    }

    @Override // com.bytedance.android.live.s.e
    public void kickOut(com.bytedance.android.live.s.b bVar, boolean z, long j2, long j3) {
        l.d(bVar, "");
        l.d(bVar, "");
        WeakReference weakReference = new WeakReference(bVar);
        if (z) {
            ((KickOutApi) com.bytedance.android.live.network.e.a().a(KickOutApi.class)).kickOut(j2, j3).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new f.c(weakReference, z, j2, j3), new f.d(weakReference, z, j2, j3));
        } else {
            ((KickOutApi) com.bytedance.android.live.network.e.a().a(KickOutApi.class)).unKickOut(j2, j3).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new f.e(weakReference, false, j2, j3), new f.C0483f(weakReference, false, j2, j3));
        }
    }

    @Override // com.bytedance.android.live.s.e
    public void muteUser(User user, long j2, j jVar, com.bytedance.android.live.s.g gVar) {
        long j3;
        l.d(user, "");
        l.d(jVar, "");
        l.d(gVar, "");
        l.d(user, "");
        l.d(jVar, "");
        l.d(gVar, "");
        if (l.a(jVar, j.f7923b)) {
            j3 = 0;
        } else {
            j3 = 1;
        }
        WeakReference weakReference = new WeakReference(gVar);
        ((MuteApi) com.bytedance.android.live.network.e.a().a(MuteApi.class)).mute(j2, user.getId(), j3, user.getSecUid(), jVar.f7925a).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new g.d(user, weakReference, j2), new g.e(weakReference, j2, user));
    }

    @Override // com.bytedance.android.live.s.e
    public Dialog getEnsureKickOutDialog(Context context, long j2, long j3, long j4, com.bytedance.android.live.s.f fVar) {
        return new b(context, j2, j3, j4, fVar);
    }

    @Override // com.bytedance.android.live.s.e
    public void updateAdmin(com.bytedance.android.live.s.a aVar, boolean z, com.bytedance.android.live.s.a.a aVar2, long j2, long j3, String str) {
        l.d(aVar, "");
        a.a(aVar, z, aVar2, j2, j3, str);
    }

    @Override // com.bytedance.android.live.s.e
    public void updateAdmin(com.bytedance.android.live.s.a aVar, boolean z, User user, long j2, long j3, String str) {
        l.d(aVar, "");
        l.d(aVar, "");
        if (user != null) {
            a.a(aVar, z, a.C0265a.a(user), j2, j3, str);
        }
    }
}
