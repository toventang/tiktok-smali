package com.ss.android.ugc.aweme.services;

import android.widget.FrameLayout;
import com.bytedance.android.livesdkapi.depend.d.k;
import com.bytedance.android.livesdkapi.view.TextureRenderView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.e.a;
import com.ss.android.ugc.aweme.live.e.b;
import com.ss.android.ugc.aweme.live.e.c;
import h.f.b.l;
import h.p;
import org.json.JSONObject;

public final class ProfileDependentComponentImpl$newLivePlayHelper$1 implements c {
    final /* synthetic */ b $callback;
    final /* synthetic */ Runnable $onStreamPlay;
    private final c livePlayHelper;

    static {
        Covode.recordClassIndex(79552);
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final void destroy() {
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final Boolean getLivePlayControllerIsPlaying() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final String getPlayerTag() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final TextureRenderView getTextureView() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final void pause() {
    }

    public final void setLinkCallback(a aVar) {
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final void setPlayControllerShouldDestroy(boolean z) {
    }

    public final c getLivePlayHelper() {
        return this.livePlayHelper;
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final JSONObject getStaticLog() {
        return new JSONObject();
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final void pauseWithStreamData() {
        this.livePlayHelper.pauseWithStreamData();
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final void stop() {
        this.livePlayHelper.stop();
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final void stopWithStreamData() {
        this.livePlayHelper.stopWithStreamData();
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final void switchCndAbrSwitchResolution() {
        this.livePlayHelper.switchCndAbrSwitchResolution();
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final void changeSRSupportScene(boolean z) {
        this.livePlayHelper.changeSRSupportScene(z);
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final void setMute(boolean z) {
        this.livePlayHelper.setMute(z);
    }

    public final p<Integer, Integer> resolutionOfLiveFromStream(LiveRoomStruct liveRoomStruct) {
        return new p<>(0, 0);
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final void setLivePlayerEntranceParam(com.bytedance.android.livesdkapi.depend.model.c.a aVar) {
        l.d(aVar, "");
        this.livePlayHelper.setLivePlayerEntranceParam(aVar);
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final void setPlayerLogCache(k kVar) {
        l.d(kVar, "");
        l.d(kVar, "");
    }

    public final p<Integer, Integer> sizeOfLiveFromRoom(LiveRoomStruct liveRoomStruct) {
        return new p<>(0, 0);
    }

    ProfileDependentComponentImpl$newLivePlayHelper$1(Runnable runnable, b bVar) {
        this.$onStreamPlay = runnable;
        this.$callback = bVar;
        this.livePlayHelper = LiveOuterService.s().a(runnable, new ProfileDependentComponentImpl$newLivePlayHelper$1$livePlayHelper$1(this));
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final void play(boolean z, LiveRoomStruct liveRoomStruct, FrameLayout frameLayout) {
        l.d(liveRoomStruct, "");
        this.livePlayHelper.play(z, liveRoomStruct, frameLayout);
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final void playWithStreamData(boolean z, LiveRoomStruct liveRoomStruct, FrameLayout frameLayout) {
        l.d(liveRoomStruct, "");
        this.livePlayHelper.playWithStreamData(z, liveRoomStruct, frameLayout);
    }
}
