package com.bytedance.android.livesdk.watch;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import com.bytedance.android.live.p.h;
import com.bytedance.android.live.u.g;
import com.bytedance.android.livesdk.ab;
import com.bytedance.android.livesdk.ad;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdk.callback.b;
import com.bytedance.android.livesdk.chatroom.d.a;
import com.bytedance.android.livesdk.chatroom.detail.r;
import com.bytedance.android.livesdk.chatroom.ui.br;
import com.bytedance.android.livesdk.drawerfeed.d;
import com.bytedance.android.livesdk.feed.FullDraggableContainer;
import com.bytedance.android.livesdk.n.b;
import com.bytedance.android.livesdk.rank.api.j;
import com.bytedance.android.livesdk.survey.ui.a.v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public class f implements d {
    private int liveRoomChangeCount = 1;

    static {
        Covode.recordClassIndex(13242);
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public int getLiveRoomChangeCount() {
        return this.liveRoomChangeCount;
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public c getPreFetchManager() {
        return r.a.a();
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public void setLiveRoomChangeCount(int i2) {
        this.liveRoomChangeCount = i2;
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public void addLiveDuration(long j2) {
        br.aq.add(Long.valueOf(j2));
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public v createShareGuideEvasionStrategy(DataChannel dataChannel) {
        l.d(dataChannel, "");
        return new v(dataChannel);
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public void addLiveDurationTask(b bVar) {
        a a2 = a.a();
        if (bVar != null) {
            a2.f15184a.add(bVar);
            if (a2.f15185b) {
                a2.a(bVar);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public void preloadWatchResource(Context context) {
        l.d(context, "");
        h.a();
        ((h) com.bytedance.android.live.t.a.a(h.class)).preloadAudienceToolbarWidget();
        com.bytedance.android.b.a((int) R.layout.bh2);
        ((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).preloadWidgetView();
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public com.bytedance.android.livesdkapi.depend.d.h createLiveRoomFragment(EnterRoomConfig enterRoomConfig) {
        String concat;
        l.d(enterRoomConfig, "");
        ab.f13391a = new com.bytedance.android.livesdk.ab.f();
        com.bytedance.android.livesdk.live.a.a aVar = com.bytedance.android.livesdk.live.c.a.a().f18672a;
        if ((aVar == null || TextUtils.isEmpty(aVar.f18651a) || (!aVar.f18651a.equals(com.bytedance.android.livesdkapi.depend.d.a.FEED.typeName) && !aVar.f18651a.equals(com.bytedance.android.livesdkapi.depend.d.a.FEED_WITH_PREVIEW.typeName))) && enterRoomConfig != null) {
            String str = enterRoomConfig.f23299c.J;
            String str2 = enterRoomConfig.f23299c.L;
            String str3 = enterRoomConfig.f23299c.J;
            if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
                if (!TextUtils.isEmpty(str)) {
                    concat = "from_merge_".concat(String.valueOf(str));
                } else if (!TextUtils.isEmpty(str3)) {
                    concat = "extra_from_merge_".concat(String.valueOf(str3));
                } else {
                    concat = "method_".concat(String.valueOf(str2));
                }
                com.bytedance.android.livesdk.live.c.a.a().f18672a = new com.bytedance.android.livesdk.live.a.a(concat);
            }
        }
        g.a(ad.f13646a);
        ab abVar = new ab();
        l.b(abVar, "");
        return abVar;
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public List<?> audienceToolbarList(DataChannel dataChannel, Context context) {
        l.d(dataChannel, "");
        l.d(context, "");
        return com.bytedance.android.livesdk.chatroom.interaction.a.a(dataChannel, context);
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public b createDrawerFeedFragment(FullDraggableContainer fullDraggableContainer, Bundle bundle) {
        d dVar = new d();
        dVar.f17122h = null;
        dVar.f17118d = bundle;
        dVar.f17120f = fullDraggableContainer;
        return dVar;
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public void showMaskLayer(long j2, boolean z) {
        com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.event.h(j2, z));
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public boolean shouldDislikeActionShow(String str, String str2) {
        if (l.a((Object) str2, (Object) j.HOURLY_RANK.getRankName()) || !n.a((Iterable) ((ArrayList) com.bytedance.android.livesdk.n.a.f19824a.getValue()), (Object) str)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public void openShareSettingsDialog(Activity activity, String str) {
        l.d(str, "");
        if (activity instanceof e) {
            l.d(str, "");
            com.bytedance.android.livesdk.ai.h hVar = new com.bytedance.android.livesdk.ai.h();
            Bundle bundle = new Bundle();
            bundle.putString("enter_from", str);
            hVar.setArguments(bundle);
            i supportFragmentManager = ((e) activity).getSupportFragmentManager();
            l.b(supportFragmentManager, "");
            hVar.show(supportFragmentManager, com.bytedance.android.livesdk.ai.h.f13786b);
        }
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public void dislikeLiveFromSharePanel(Room room, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        com.bytedance.android.livesdk.n.a.a(room, str, str2, b.a.SHARING_PANEL);
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public void logDislikeLiveFromLongPressSharePanel(Room room, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        com.bytedance.android.livesdk.n.a.b(room, str, str2, b.a.LONG_PRESS);
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public void logDislikeLiveFromSharePanel(Room room, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        com.bytedance.android.livesdk.n.a.b(room, str, str2, b.a.SHARING_PANEL);
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public void logReportLiveFromSharePanel(Room room, String str, String str2, String str3) {
        if (room != null) {
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            com.bytedance.android.livesdk.watch.chatroom.b.a(room, str, str2, str3);
        }
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public DialogInterface openLongPressDialog(IHostLongPressCallback iHostLongPressCallback, Context context, Room room, String str, String str2, String str3) {
        if (context == null || room == null || !(context instanceof e)) {
            return null;
        }
        com.bytedance.android.livesdk.n.d dVar = new com.bytedance.android.livesdk.n.d();
        dVar.f19830a = !shouldDislikeActionShow(str, str2);
        dVar.f19833d = str;
        dVar.f19834e = str2;
        l.d(room, "");
        dVar.f19832c = room;
        dVar.f19835f = str3;
        dVar.f19831b = iHostLongPressCallback;
        i supportFragmentManager = ((e) context).getSupportFragmentManager();
        l.b(supportFragmentManager, "");
        dVar.show(supportFragmentManager, "LiveLongPressDialog");
        return dVar;
    }
}
