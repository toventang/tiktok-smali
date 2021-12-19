package com.bytedance.android.livesdk.widgets.giftwidget.b;

import android.os.SystemClock;
import androidx.fragment.app.i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.gift.d.e;
import com.bytedance.android.livesdk.gift.model.a;
import com.bytedance.android.livesdk.gift.model.w;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.ao;
import com.bytedance.android.livesdk.service.b.d;
import com.bytedance.android.livesdk.service.c.f.a;
import com.bytedance.android.livesdk.service.c.f.d;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.wishlist.b;
import com.bytedance.android.livesdk.wishlist.c;
import com.bytedance.android.livesdk.z.c.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import java.util.HashMap;

final /* synthetic */ class al implements f {

    /* renamed from: a  reason: collision with root package name */
    private final ag f22734a;

    /* renamed from: b  reason: collision with root package name */
    private final d f22735b;

    /* renamed from: c  reason: collision with root package name */
    private final Room f22736c;

    /* renamed from: d  reason: collision with root package name */
    private final long f22737d;

    /* renamed from: e  reason: collision with root package name */
    private final long f22738e;

    static {
        Covode.recordClassIndex(13402);
    }

    al(ag agVar, d dVar, Room room, long j2, long j3) {
        this.f22734a = agVar;
        this.f22735b = dVar;
        this.f22736c = room;
        this.f22737d = j2;
        this.f22738e = j3;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        i iVar;
        String concat;
        ag agVar = this.f22734a;
        d dVar = this.f22735b;
        Room room = this.f22736c;
        long j2 = this.f22737d;
        long j3 = this.f22738e;
        com.bytedance.android.live.network.response.d dVar2 = (com.bytedance.android.live.network.response.d) obj;
        if (dVar2.data != null) {
            if (agVar.f22702c != null) {
                iVar = (i) agVar.f22702c.b(ao.class);
                agVar.f22702c.c(b.class, new c(dVar.f21286b, dVar.f21291g));
                agVar.f22702c.c(e.class);
            } else {
                iVar = null;
            }
            a aVar = ((w) dVar2.data).f17949a;
            if (aVar == null || aVar.f17859a <= 0) {
                if (dVar.s) {
                    long j4 = dVar.f21286b;
                    HashMap hashMap = new HashMap();
                    Room room2 = (Room) DataChannelGlobal.f34575d.b(ac.class);
                    User user = (User) u.a().b().a();
                    hashMap.put("user_id", Long.valueOf(user.getId()));
                    hashMap.put("gift_id", Long.valueOf(j4));
                    if (room2 != null) {
                        hashMap.put("anchor_id", Long.valueOf(room2.getOwnerUserId()));
                        hashMap.put("room_id", Long.valueOf(room2.getId()));
                    }
                    com.bytedance.android.live.core.d.c.a(com.bytedance.android.livesdk.ab.d.d.a("ttlive_fast_gift_send"), 1, hashMap);
                    com.bytedance.android.livesdk.ab.a.a.a();
                    com.bytedance.android.livesdk.ab.a.a.a(com.bytedance.android.livesdk.ab.a.b.Gift.info, "ttlive_fast_gift_send", hashMap);
                    b.a.a("ttlive_fast_gift_send").a("user_id", user.getId()).a("gift_id", j4).a().b();
                }
                agVar.f22701b = false;
                boolean z = (dVar.f21293i == null || room.getOwner() == null) ? true : dVar.f21293i.getId() == room.getOwner().getId();
                agVar.a((w) dVar2.data);
                if (dVar.q) {
                    b.a.a("send_announcements").a().a("gift_id", (Number) Long.valueOf(dVar.f21286b)).a("reason", "gift").a("scene", com.bytedance.android.livesdk.u.a.b().getDesc()).b();
                }
                com.bytedance.android.livesdk.service.c.f.c.a(dVar.r, ((w) dVar2.data).u, dVar.f21285a.toString(), j2, "0", "Success");
                agVar.a(dVar, ((w) dVar2.data).p);
                com.bytedance.android.livesdk.service.c.g.a.a(dVar.f21286b, SystemClock.uptimeMillis() - j3, dVar.f21294j, j.a(room.getStreamType()));
                int i2 = dVar.f21290f;
                long j5 = dVar.f21286b;
                int i3 = ((w) dVar2.data).f17958j;
                String str = dVar.f21294j;
                boolean z2 = dVar.f21295k;
                boolean z3 = dVar.s;
                String str2 = dVar.t;
                int i4 = dVar.f21297m;
                String str3 = dVar.f21296l;
                String str4 = ((w) dVar2.data).s;
                String str5 = dVar.p;
                String str6 = dVar.o;
                int i5 = dVar.f21287c;
                long j6 = dVar.f21289e;
                l.d(str3, "");
                l.d(str4, "");
                com.bytedance.android.livesdk.service.c.f.a aVar2 = a.b.f21408a;
                d.b bVar = new d.b(i2, j5, z2, str, str2, i4, str3, str5, str6, z, i5, j6);
                if (!aVar2.f21406g || j5 != aVar2.f21405f) {
                    if (aVar2.f21406g) {
                        aVar2.f21403d.removeCallbacks(aVar2.f21407h);
                        aVar2.a();
                    }
                    aVar2.f21400a = bVar;
                    aVar2.f21404e = 1;
                    aVar2.f21406g = true;
                    aVar2.f21403d.postDelayed(aVar2.f21407h, 3000);
                    if (j5 != aVar2.f21405f) {
                        aVar2.f21405f = j5;
                    }
                    aVar2.f21401b = z3;
                    aVar2.f21402c = str4;
                } else {
                    if (i3 == 1) {
                        aVar2.f21404e++;
                    } else {
                        aVar2.f21404e = i3;
                    }
                    aVar2.f21402c += "," + str4;
                    aVar2.f21403d.removeCallbacks(aVar2.f21407h);
                    aVar2.f21403d.postDelayed(aVar2.f21407h, 3000);
                }
                com.bytedance.android.livesdk.service.c.g.a.a((Throwable) null);
                if (com.bytedance.android.livesdk.utils.a.a(agVar.f22702c)) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("anchor_id", String.valueOf(room.getOwner().getId()));
                    hashMap2.put("room_id", String.valueOf(room.getId()));
                    com.bytedance.android.livesdk.utils.a.a("live_ad", "live_gift", null, hashMap2);
                    return;
                }
                return;
            }
            agVar.b();
            com.bytedance.android.livesdk.service.c.a.e.a("4017038", dVar.f21294j, dVar.t);
            com.bytedance.android.livesdk.service.c.a.e.a(dVar.r, "4017038", "limited", dVar.f21294j, dVar.t);
            if (aVar.f17862d != 1 || iVar == null) {
                int i6 = aVar.f17859a / 60;
                int i7 = aVar.f17859a % 60;
                if (i6 >= 10) {
                    concat = String.valueOf(i6);
                } else {
                    concat = "0".concat(String.valueOf(i6));
                }
                String a2 = y.a().getString(R.string.dzi) != null ? com.a.a(y.a().getString(R.string.dzi), new Object[]{concat + ":" + (i7 >= 10 ? String.valueOf(i7) : "0".concat(String.valueOf(i7)))}) : null;
                if (!dVar.s) {
                    com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.z.b.c());
                    a.C0498a.f22936a.f22932b = (long) (aVar.f17859a * 1000);
                    a.C0498a.f22936a.a();
                    a.C0498a.f22936a.f22931a = true;
                }
                com.bytedance.android.livesdk.utils.ao.a(a2);
                return;
            }
            a.C0498a.f22936a.f22932b = (long) (aVar.f17859a * 1000);
            long j7 = aVar.f17861c;
            com.bytedance.android.livesdk.z.a.a aVar3 = new com.bytedance.android.livesdk.z.a.a();
            aVar3.f22923c = j7;
            aVar3.f22924d = aVar.f17860b / 60;
            aVar3.show(iVar, "GiftLimitDialog");
            b.a.a("livesdk_consume_limit_prompt_popup_show").a().a("limit_prompt_money", aVar.f17861c).b();
        }
    }
}
