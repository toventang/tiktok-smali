package com.bytedance.android.livesdk.olddialog.widget;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.firstrecharge.d;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.olddialog.widget.LiveNewGiftPanelWidget;
import com.bytedance.android.livesdk.service.a.b;
import com.bytedance.android.livesdk.service.a.c;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.service.c.a.e;
import com.bytedance.android.livesdk.utils.a.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.f.b.l;
import java.util.List;

final /* synthetic */ class r implements LiveNewGiftPanelWidget.a {

    /* renamed from: a  reason: collision with root package name */
    private final LiveNewGiftPanelWidget f20170a;

    static {
        Covode.recordClassIndex(11901);
    }

    r(LiveNewGiftPanelWidget liveNewGiftPanelWidget) {
        this.f20170a = liveNewGiftPanelWidget;
    }

    @Override // com.bytedance.android.livesdk.olddialog.widget.LiveNewGiftPanelWidget.a
    public final void a(Boolean bool, Long l2, int i2) {
        int i3;
        String str;
        User owner;
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.f20170a;
        e eVar = e.f21319i;
        boolean booleanValue = bool.booleanValue();
        long longValue = l2.longValue();
        boolean z = liveNewGiftPanelWidget.f20134h;
        int i4 = liveNewGiftPanelWidget.n;
        String tabNameByIndex = GiftManager.inst().getTabNameByIndex(liveNewGiftPanelWidget.n);
        int i5 = 0;
        if (eVar.f21325d != null) {
            List<? extends u> list = eVar.f21325d;
            if (list == null) {
                l.b();
            }
            int size = list.size();
            i3 = 1;
            for (int i6 = 0; i6 < size; i6++) {
                List<? extends u> list2 = eVar.f21325d;
                if (list2 == null) {
                    l.b();
                }
                if (((u) list2.get(i6)).f19761d == longValue) {
                    i3 = (i6 % 8) + 1;
                }
            }
        } else {
            i3 = 1;
        }
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        b a2 = b.a.a("gift_preview").a();
        String str2 = eVar.f21328g;
        if (str2 == null) {
            str2 = "icon";
        }
        b a3 = a2.a("gift_enter_from", str2).a("tab_position", i4 + 1).a("tab_name", tabNameByIndex).a("page_position", eVar.f21324c + 1).a("gift_id", longValue).a("gift_price", i2).a("show_type", booleanValue ? "call" : "click").a("gift_position", i3).a("timestamp", a.a()).a("gift_dialog_request_id", c.f21167a).a("room_orientation", z ? "portrait" : "landscape").a("send_gift_scene", com.bytedance.android.livesdk.u.a.b().getDesc()).a("actual_gift_position", GiftManager.inst().getGiftPosition(longValue)).a("is_first_screen", b.a.C0448a.f21165a.f21164a ? "first_screen" : "other_screen");
        String str3 = "1";
        com.bytedance.android.livesdk.ab.b a4 = a3.a(e.f21320j, e.b() ? str3 : "0");
        if (GiftManager.inst().isDynamicGift(longValue)) {
            str = str3;
        } else {
            str = "0";
        }
        com.bytedance.android.livesdk.ab.b a5 = a4.a("dynamic_preview", str).a("special_gift", d.u.i() == longValue ? "first_recharge_gift" : "null");
        u findGiftById = GiftManager.inst().findGiftById(longValue);
        com.bytedance.android.livesdk.ab.b a6 = a5.a(findGiftById != null ? findGiftById.K : null);
        if (!(room == null || (owner = room.getOwner()) == null || !owner.isSubscribed())) {
            i5 = 1;
        }
        com.bytedance.android.livesdk.ab.b a7 = a6.a("is_subscription", i5);
        List list3 = (List) DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.wishlist.d.class);
        if (list3 == null || !list3.contains(Long.valueOf(longValue))) {
            str3 = "0";
        }
        a7.a("is_wishlist_gift", str3).b();
    }
}
