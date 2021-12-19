package com.bytedance.android.live.liveinteract.api;

import android.view.SurfaceView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.d.d;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class j implements b {
    static {
        Covode.recordClassIndex(5196);
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public long getBattleId() {
        return 0;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public long getChannelId() {
        return 0;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public String getCurrentInviteeList() {
        return "";
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public int getCurrentLinkMode() {
        return 0;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public String getCurrentPkState() {
        return "";
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public String getInviteeList() {
        return "";
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public SurfaceView getLinkInAnchorSurface() {
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public int getLinkState(User user) {
        return 0;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public String getLinkStatus4H5() {
        return "";
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public e getLinkWidgetFactory() {
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public int getLinkedGuestNum() {
        return 0;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public long getRivalAnchorUidWhenAnchorLinkMic() {
        return 0;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public String getRoomScene() {
        return "";
    }

    public Set<Long> getSocialInvitingUserId() {
        return null;
    }

    public Set<Long> getSocialOnlineAndWaitingUserId() {
        return null;
    }

    public Set<Long> getSocialOnlineUserIds() {
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public aw getUserRole(long j2) {
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public void handleLiveRoomStopped() {
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public boolean isAnchorVideoEnable() {
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public boolean isAudienceApplied() {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public boolean isBattleStarter() {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public boolean isBattling() {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public boolean isInCoHost() {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public boolean isInMultiGuest() {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public boolean isInRandomLinkMic() {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public boolean isInteracting() {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public boolean isLinkingMic() {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public boolean isMultiLiveFloatLayout() {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public boolean isMultiLiveGridLayout() {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public boolean isRoomInBattle() {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public d linkCrossRoomWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public void preloadWidgetView() {
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public void registerInteractStateChangeListener(d dVar) {
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public void removeInteractStateChangeListener(d dVar) {
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public Set<Long> getHasInvitedUidSet() {
        return new LinkedHashSet();
    }

    public Set<Long> getSocialLocalInviteUIDs() {
        return new HashSet();
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public Set<Long> getUninvitedUidSet() {
        return new LinkedHashSet();
    }
}
