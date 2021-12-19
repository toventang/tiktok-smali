package com.ss.android.ugc.aweme.live.e;

import android.widget.FrameLayout;
import com.bytedance.android.livesdkapi.depend.d.k;
import com.bytedance.android.livesdkapi.depend.model.c.a;
import com.bytedance.android.livesdkapi.view.TextureRenderView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import org.json.JSONObject;

public interface c {
    static {
        Covode.recordClassIndex(69429);
    }

    void changeSRSupportScene(boolean z);

    void destroy();

    Boolean getLivePlayControllerIsPlaying();

    String getPlayerTag();

    JSONObject getStaticLog();

    TextureRenderView getTextureView();

    void pause();

    void pauseWithStreamData();

    void play(boolean z, LiveRoomStruct liveRoomStruct, FrameLayout frameLayout);

    void playWithStreamData(boolean z, LiveRoomStruct liveRoomStruct, FrameLayout frameLayout);

    void setLivePlayerEntranceParam(a aVar);

    void setMute(boolean z);

    void setPlayControllerShouldDestroy(boolean z);

    void setPlayerLogCache(k kVar);

    void stop();

    void stopWithStreamData();

    void switchCndAbrSwitchResolution();
}
