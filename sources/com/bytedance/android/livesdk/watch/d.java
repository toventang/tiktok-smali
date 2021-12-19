package com.bytedance.android.livesdk.watch;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.bytedance.android.live.base.a;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdk.callback.b;
import com.bytedance.android.livesdk.feed.FullDraggableContainer;
import com.bytedance.android.livesdkapi.depend.d.h;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;

public interface d extends a {
    static {
        Covode.recordClassIndex(13240);
    }

    void addLiveDuration(long j2);

    void addLiveDurationTask(b bVar);

    List<?> audienceToolbarList(DataChannel dataChannel, Context context);

    b createDrawerFeedFragment(FullDraggableContainer fullDraggableContainer, Bundle bundle);

    h createLiveRoomFragment(EnterRoomConfig enterRoomConfig);

    a createShareGuideEvasionStrategy(DataChannel dataChannel);

    void dislikeLiveFromSharePanel(Room room, String str, String str2);

    int getLiveRoomChangeCount();

    c getPreFetchManager();

    void logDislikeLiveFromLongPressSharePanel(Room room, String str, String str2);

    void logDislikeLiveFromSharePanel(Room room, String str, String str2);

    void logReportLiveFromSharePanel(Room room, String str, String str2, String str3);

    DialogInterface openLongPressDialog(IHostLongPressCallback iHostLongPressCallback, Context context, Room room, String str, String str2, String str3);

    void openShareSettingsDialog(Activity activity, String str);

    void preloadWatchResource(Context context);

    void setLiveRoomChangeCount(int i2);

    boolean shouldDislikeActionShow(String str, String str2);

    void showMaskLayer(long j2, boolean z);
}
