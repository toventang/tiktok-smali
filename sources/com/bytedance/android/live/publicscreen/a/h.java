package com.bytedance.android.live.publicscreen.a;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.a.c.a;
import com.bytedance.android.live.publicscreen.a.c.b;
import com.bytedance.android.live.publicscreen.a.e.e;
import com.bytedance.android.livesdk.model.message.g;
import com.bytedance.android.livesdk.model.message.i;
import com.bytedance.android.livesdkapi.depend.d.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import h.a.z;
import h.f.b.l;
import java.util.List;

public class h implements e {
    static {
        Covode.recordClassIndex(6720);
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public void addOnRegistryReadyListener(e eVar) {
        l.d(eVar, "");
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public void clearMockChatMessage() {
    }

    public c createExternalLauncher(Context context, ViewGroup viewGroup, long j2) {
        l.d(context, "");
        l.d(viewGroup, "");
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public b createGameMessageView(Context context, int i2, a aVar) {
        l.d(context, "");
        l.d(aVar, "");
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public g getCurrentBottomMessage(long j2) {
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public long getHotDuration(long j2) {
        return 0;
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public Class<? extends LiveRecyclableWidget> getPublicScreenWidgetClass(boolean z) {
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public Long getStartStreamingTimestamp(long j2) {
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public f getTextMessageConfig() {
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public void hideWarningMessage(long j2) {
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public void insertBottomMessage(long j2, String str, com.bytedance.android.livesdk.model.message.c.b bVar, long j3, int i2, int i3, int i4) {
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public long insertMessage(long j2, com.bytedance.android.livesdk.ac.b.a aVar, boolean z) {
        l.d(aVar, "");
        return 0;
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public i mockChatMessage(long j2, String str, User user) {
        return null;
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public void onStartStreaming(long j2) {
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public void onStopStreaming(long j2) {
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public void removeModelByToken(long j2, long j3) {
    }

    public void removeOnRegistryReadyListener(e eVar) {
        l.d(eVar, "");
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public void resetDuration(long j2) {
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public boolean uiOptimized(boolean z) {
        return false;
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public void updateGameMessageViewUserCount(int i2) {
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public void updateMessage(long j2, long j3, com.bytedance.android.livesdk.ac.b.a aVar) {
        l.d(aVar, "");
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public void updateModel(long j2, com.bytedance.android.live.publicscreen.a.d.h hVar) {
        l.d(hVar, "");
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public List<e> getOnRegistryReadyListeners() {
        return z.INSTANCE;
    }
}
