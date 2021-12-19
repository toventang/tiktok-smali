package com.bytedance.android.livesdk.widgets.giftwidget.b;

import android.os.SystemClock;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.w;
import com.bytedance.android.livesdk.service.b.d;
import com.bytedance.android.livesdk.service.c.a.e;
import com.bytedance.android.livesdk.service.c.d.a;
import com.bytedance.android.livesdk.service.c.g.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.j;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import java.util.HashMap;

final /* synthetic */ class ai implements f {

    /* renamed from: a  reason: collision with root package name */
    private final ag f22725a;

    /* renamed from: b  reason: collision with root package name */
    private final Room f22726b;

    /* renamed from: c  reason: collision with root package name */
    private final long f22727c;

    /* renamed from: d  reason: collision with root package name */
    private final long f22728d;

    /* renamed from: e  reason: collision with root package name */
    private final d f22729e;

    static {
        Covode.recordClassIndex(13399);
    }

    ai(ag agVar, Room room, long j2, long j3, d dVar) {
        this.f22725a = agVar;
        this.f22726b = room;
        this.f22727c = j2;
        this.f22728d = j3;
        this.f22729e = dVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        ag agVar = this.f22725a;
        Room room = this.f22726b;
        long j2 = this.f22727c;
        long j3 = this.f22728d;
        d dVar = this.f22729e;
        com.bytedance.android.live.network.response.d dVar2 = (com.bytedance.android.live.network.response.d) obj;
        agVar.f22701b = false;
        w wVar = (w) dVar2.data;
        long j4 = dVar2.extra.now;
        long currentTimeMillis = System.currentTimeMillis();
        for (Prop prop : wVar.n) {
            prop.setNowTimeDiff((j4 - currentTimeMillis) / 1000);
        }
        agVar.a(wVar);
        String a2 = j.a(room.getStreamType());
        long uptimeMillis = SystemClock.uptimeMillis() - j3;
        String str = dVar.f21294j;
        HashMap hashMap = new HashMap();
        hashMap.put("prop_id", Long.valueOf(j2));
        a.a(hashMap);
        hashMap.put("event_module", "bottom_tab");
        if (m.a(str)) {
            str = "direct_gift_tab";
        }
        hashMap.put("gift_enter_from", str);
        hashMap.put("live_type", a2);
        if (!m.a(com.bytedance.android.livesdk.chatroom.d.a().e())) {
            hashMap.put("enter_live_method", com.bytedance.android.livesdk.chatroom.d.a().e());
        }
        c.a(com.bytedance.android.livesdk.ab.d.d.a("ttlive_gift_send_status"), 0, uptimeMillis, hashMap);
        com.bytedance.android.livesdk.service.c.d.a aVar = a.b.f21397a;
        e.f fVar = new e.f(j2);
        if (!aVar.f21395e || j2 != aVar.f21394d) {
            if (aVar.f21395e) {
                aVar.f21392b.removeCallbacks(aVar.f21396f);
                aVar.a();
            }
            aVar.f21391a = fVar;
            aVar.f21393c = 1;
            aVar.f21395e = true;
            aVar.f21392b.postDelayed(aVar.f21396f, 3000);
            if (j2 != aVar.f21394d) {
                aVar.f21394d = j2;
                return;
            }
            return;
        }
        aVar.f21393c++;
        aVar.f21392b.removeCallbacks(aVar.f21396f);
        aVar.f21392b.postDelayed(aVar.f21396f, 3000);
    }
}
