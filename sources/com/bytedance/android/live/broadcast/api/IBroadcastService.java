package com.bytedance.android.live.broadcast.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.api.e.a;
import com.bytedance.android.live.broadcast.api.e.c;
import com.bytedance.android.live.n.j;
import com.bytedance.android.livesdkapi.depend.model.a.b;
import com.bytedance.android.livesdkapi.depend.model.a.f;
import com.bytedance.android.livesdkapi.depend.model.a.h;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.avframework.livestreamv2.core.Client;
import com.ss.avframework.livestreamv2.core.LiveCore;
import f.a.t;
import h.z;
import java.util.Map;

public interface IBroadcastService extends com.bytedance.android.live.base.a {

    public interface a {
        static {
            Covode.recordClassIndex(3663);
        }

        z a();

        z a(String str);

        z a(String str, String str2);
    }

    static {
        Covode.recordClassIndex(3662);
    }

    com.bytedance.android.livesdkapi.depend.model.a convertStickerBean(Effect effect);

    com.bytedance.android.livesdkapi.a createBgBroadcastBinder();

    com.bytedance.android.livesdkapi.depend.model.a.a createBgBroadcastFragment(b bVar, Bundle bundle);

    c createCoverController(Fragment fragment, Room room);

    Client createGuestClient(Context context, LiveCore.InteractConfig interactConfig);

    com.bytedance.android.live.broadcast.api.e.b createLinkInRoomView(com.bytedance.android.live.broadcast.api.d.a aVar, Context context, int i2);

    com.bytedance.android.livesdk.chatroom.interact.a createLinkVideoView(Context context, a.C0103a aVar);

    j createLiveBroadcastEndFragment(Bundle bundle);

    com.bytedance.android.livesdkapi.depend.model.a.c createLiveBroadcastFragment(b bVar, Bundle bundle);

    f createStartLiveFragment(com.bytedance.android.livesdkapi.j.a aVar);

    Activity getBroadcastActivity();

    String getLiveComposerFilePath();

    String getLiveCoreVersion();

    Map<String, String> getRoomInfo();

    d getSubscribeEntranceHelper();

    Fragment getSubscribeSettingFragment();

    <T> Class<T> getWidgetClass(int i2);

    boolean haveNewFilter();

    void init();

    t<Integer> loadShortVideoRes();

    void onLiveTabShow(Context context);

    void setApplyLivePermission(com.bytedance.android.livesdkapi.l.a aVar);

    void setBroadcastActivity(Activity activity);

    void setDetailLivePermission(com.bytedance.android.livesdkapi.l.b bVar);

    void showEndPageForPaidEvent();

    void showGuideBirthdayEditDialog(Activity activity, String str, String str2, a aVar);

    h startLiveManager();

    com.bytedance.android.live.broadcast.api.b.a stickerPresenter();
}
