package com.bytedance.android.livesdk;

import android.text.TextUtils;
import com.bytedance.android.livesdk.ab.d;
import com.bytedance.android.livesdk.ab.f;
import com.bytedance.android.livesdk.chatroom.d.c;
import com.bytedance.android.livesdk.chatroom.g.k;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.d.i;
import com.bytedance.android.livesdkapi.depend.d.p;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.android.livesdkapi.session.b;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class ag implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final ab f13697a;

    /* renamed from: b  reason: collision with root package name */
    private final String f13698b;

    static {
        Covode.recordClassIndex(7604);
    }

    ag(ab abVar, String str) {
        this.f13697a = abVar;
        this.f13698b = str;
    }

    public final void run() {
        String str;
        ab abVar = this.f13697a;
        i c2 = abVar.c();
        if (c2 != null) {
            abVar.f13401k = null;
            if (abVar.f13402l == null) {
                com.bytedance.android.livesdk.ab.i.b();
                com.bytedance.android.livesdk.ab.i.c("LiveRoomFragment", "mPageChangeListener is null !");
                return;
            }
            abVar.f13402l.f13411a = c2;
            EnterRoomConfig w = c2.w();
            if (w.f23299c.ab == null) {
                EnterRoomConfig.RoomsData roomsData = w.f23299c;
                if (k.a(w)) {
                    str = "draw";
                } else {
                    str = "click";
                }
                roomsData.ab = str;
            }
            String str2 = w.f23299c.ab;
            w.f23299c.M = str2;
            w.f23299c.af.f23352b = Long.valueOf(abVar.p);
            c.a(w, 0);
            c2.k();
            if ((TextUtils.equals(str2, "draw") || w.f23299c.aw) && ab.f13391a != null) {
                f.a(str2, w);
            }
            if (c2.g() == null || c2.g() == p.IDLE) {
                ao.a(abVar.getContext(), (int) R.string.gqe);
                if (ab.f13391a != null) {
                    f.a(w, "", 0, "init_state_invalid");
                }
                Event event = new Event("room_fg_enter_room_fail", 33025, b.BussinessApiCall);
                event.a("fail to enter room, because live play fg status is null or idle.");
                f.a.f23366a.a().a(event);
                abVar.f13394c.getRoomAction().a();
            }
            d.a(str2);
            if (ab.f13391a != null) {
                com.bytedance.android.livesdk.ab.f.a(c2.w());
                ab.f13391a.b(w);
            }
            abVar.f13393b.refreshTimer();
        }
        abVar.h();
    }
}
