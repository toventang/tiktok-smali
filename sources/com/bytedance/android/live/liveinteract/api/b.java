package com.bytedance.android.live.liveinteract.api;

import android.view.SurfaceView;
import com.bytedance.android.live.base.a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.d.d;
import com.bytedance.covode.number.Covode;
import java.util.Set;

public interface b extends a {
    static {
        Covode.recordClassIndex(5163);
    }

    long getBattleId();

    long getChannelId();

    String getCurrentInviteeList();

    int getCurrentLinkMode();

    String getCurrentPkState();

    Set<Long> getHasInvitedUidSet();

    String getInviteeList();

    SurfaceView getLinkInAnchorSurface();

    int getLinkState(User user);

    String getLinkStatus4H5();

    e getLinkWidgetFactory();

    int getLinkedGuestNum();

    long getRivalAnchorUidWhenAnchorLinkMic();

    String getRoomScene();

    Set<Long> getUninvitedUidSet();

    aw getUserRole(long j2);

    void handleLiveRoomStopped();

    boolean isAnchorVideoEnable();

    boolean isAudienceApplied();

    boolean isBattleStarter();

    boolean isBattling();

    boolean isInCoHost();

    boolean isInMultiGuest();

    boolean isInRandomLinkMic();

    boolean isInteracting();

    boolean isLinkingMic();

    boolean isMultiLiveFloatLayout();

    boolean isMultiLiveGridLayout();

    boolean isRoomInBattle();

    d linkCrossRoomWidget();

    void preloadWidgetView();

    void registerInteractStateChangeListener(d dVar);

    void removeInteractStateChangeListener(d dVar);
}
