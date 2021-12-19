package com.bytedance.android.live.publicscreen.a;

import android.content.Context;
import com.bytedance.android.live.base.a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.a.c.b;
import com.bytedance.android.live.publicscreen.a.d.h;
import com.bytedance.android.livesdk.model.message.g;
import com.bytedance.android.livesdk.model.message.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import java.util.List;

public interface e extends a {
    static {
        Covode.recordClassIndex(6710);
    }

    void addOnRegistryReadyListener(com.bytedance.android.live.publicscreen.a.e.e eVar);

    void clearMockChatMessage();

    b createGameMessageView(Context context, int i2, com.bytedance.android.live.publicscreen.a.c.a aVar);

    g getCurrentBottomMessage(long j2);

    long getHotDuration(long j2);

    List<com.bytedance.android.live.publicscreen.a.e.e> getOnRegistryReadyListeners();

    Class<? extends LiveRecyclableWidget> getPublicScreenWidgetClass(boolean z);

    Long getStartStreamingTimestamp(long j2);

    f getTextMessageConfig();

    void hideWarningMessage(long j2);

    void insertBottomMessage(long j2, String str, com.bytedance.android.livesdk.model.message.c.b bVar, long j3, int i2, int i3, int i4);

    long insertMessage(long j2, com.bytedance.android.livesdk.ac.b.a aVar, boolean z);

    i mockChatMessage(long j2, String str, User user);

    void onStartStreaming(long j2);

    void onStopStreaming(long j2);

    void removeModelByToken(long j2, long j3);

    void resetDuration(long j2);

    boolean uiOptimized(boolean z);

    void updateGameMessageViewUserCount(int i2);

    void updateMessage(long j2, long j3, com.bytedance.android.livesdk.ac.b.a aVar);

    void updateModel(long j2, h hVar);
}
