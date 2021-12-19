package com.bytedance.android.livesdk.subscribe;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.o.a;
import com.bytedance.android.livesdk.ab.e;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.g;
import h.f.b.l;

public class b implements a {
    static {
        Covode.recordClassIndex(12648);
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.o.a
    public Fragment getSubscribeInfoListFragment(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        l.d(str, "");
        a aVar = new a();
        Bundle bundle = new Bundle();
        bundle.putString("enter_from", str);
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // com.bytedance.android.live.o.a
    public void openUserSubscribeEntry(Context context, Room room, String str) {
        SubscribeInfo subscribeInfo;
        l.d(context, "");
        l.d(room, "");
        l.d(str, "");
        g gVar = new g(LiveSubscribeLynxUrl.INSTANCE.getValue().getUser_subscribe_entry());
        gVar.a("anchor_id", u.a().b().a(room.getOwnerUserId()));
        gVar.a("room_id", room.getId());
        gVar.a("enter_from_merge", e.a());
        gVar.a("enter_method", e.d());
        gVar.a("show_entrance", str);
        gVar.a("request_id", e.k());
        gVar.a("video_id", e.f());
        User owner = room.getOwner();
        int i2 = 1;
        if (owner == null || (subscribeInfo = owner.getSubscribeInfo()) == null || !subscribeInfo.isSubscribed()) {
            i2 = 0;
        }
        gVar.a("is_subscribe", i2);
        Uri parse = Uri.parse(gVar.a());
        l.b(parse, "");
        ((IActionHandlerService) com.bytedance.android.live.t.a.a(IActionHandlerService.class)).handle(context, parse);
    }

    @Override // com.bytedance.android.live.o.a
    public void openUserSubscribeState(Context context, Room room, String str) {
        SubscribeInfo subscribeInfo;
        l.d(context, "");
        l.d(room, "");
        l.d(str, "");
        g gVar = new g(LiveSubscribeLynxUrl.INSTANCE.getValue().getUser_subscribe_state());
        gVar.a("anchor_id", u.a().b().a(room.getOwnerUserId()));
        gVar.a("room_id", room.getId());
        gVar.a("enter_from_merge", e.a());
        gVar.a("enter_method", e.d());
        gVar.a("show_entrance", str);
        gVar.a("request_id", e.k());
        gVar.a("video_id", e.f());
        User owner = room.getOwner();
        int i2 = 1;
        if (owner == null || (subscribeInfo = owner.getSubscribeInfo()) == null || !subscribeInfo.isSubscribed()) {
            i2 = 0;
        }
        gVar.a("is_subscribe", i2);
        Uri parse = Uri.parse(gVar.a());
        l.b(parse, "");
        ((IActionHandlerService) com.bytedance.android.live.t.a.a(IActionHandlerService.class)).handle(context, parse);
    }
}
