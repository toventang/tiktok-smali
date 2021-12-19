package com.bytedance.android.livesdk.watch;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdk.callback.b;
import com.bytedance.android.livesdk.feed.FullDraggableContainer;
import com.bytedance.android.livesdkapi.depend.d.h;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public class g implements d {
    static {
        Covode.recordClassIndex(13243);
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public void addLiveDuration(long j2) {
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public void addLiveDurationTask(b bVar) {
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public b createDrawerFeedFragment(FullDraggableContainer fullDraggableContainer, Bundle bundle) {
        return null;
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public h createLiveRoomFragment(EnterRoomConfig enterRoomConfig) {
        l.d(enterRoomConfig, "");
        return null;
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public void dislikeLiveFromSharePanel(Room room, String str, String str2) {
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public int getLiveRoomChangeCount() {
        return 0;
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public c getPreFetchManager() {
        return null;
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public void logDislikeLiveFromLongPressSharePanel(Room room, String str, String str2) {
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public void logDislikeLiveFromSharePanel(Room room, String str, String str2) {
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public void logReportLiveFromSharePanel(Room room, String str, String str2, String str3) {
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public DialogInterface openLongPressDialog(IHostLongPressCallback iHostLongPressCallback, Context context, Room room, String str, String str2, String str3) {
        return null;
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public void openShareSettingsDialog(Activity activity, String str) {
        l.d(str, "");
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public void preloadWatchResource(Context context) {
        l.d(context, "");
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public void setLiveRoomChangeCount(int i2) {
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public boolean shouldDislikeActionShow(String str, String str2) {
        return false;
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public void showMaskLayer(long j2, boolean z) {
    }

    public static final class a implements a {
        static {
            Covode.recordClassIndex(13244);
        }

        @Override // com.bytedance.android.livesdk.watch.a
        public final void a() {
        }

        @Override // com.bytedance.android.livesdk.watch.a
        public final void a(Runnable runnable) {
            l.d(runnable, "");
        }

        @Override // com.bytedance.android.livesdk.watch.a
        public final void b() {
        }

        @Override // com.bytedance.android.livesdk.watch.a
        public final boolean c() {
            return false;
        }

        a() {
        }
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public a createShareGuideEvasionStrategy(DataChannel dataChannel) {
        l.d(dataChannel, "");
        return new a();
    }

    @Override // com.bytedance.android.livesdk.watch.d
    public List<?> audienceToolbarList(DataChannel dataChannel, Context context) {
        l.d(dataChannel, "");
        l.d(context, "");
        return new ArrayList();
    }
}
