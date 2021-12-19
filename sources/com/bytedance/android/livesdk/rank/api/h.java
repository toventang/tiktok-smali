package com.bytedance.android.livesdk.rank.api;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.model.message.bp;
import com.bytedance.android.livesdk.rank.api.b.a;
import com.bytedance.android.livesdk.rank.api.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import h.f.b.l;
import java.util.List;

public class h implements d {
    static {
        Covode.recordClassIndex(12165);
    }

    @Override // com.bytedance.android.livesdk.rank.api.d
    public int getCurrentRoomAudienceNum() {
        return -1;
    }

    @Override // com.bytedance.android.livesdk.rank.api.d
    public int getCurrentRoomRank(int i2) {
        return -1;
    }

    @Override // com.bytedance.android.livesdk.rank.api.d
    public LiveRecyclableWidget getHourlyRankWidget() {
        return null;
    }

    @Override // com.bytedance.android.livesdk.rank.api.d
    public c getRankOptOutPresenter() {
        return null;
    }

    @Override // com.bytedance.android.livesdk.rank.api.d
    public void getRankRoomIds(long j2, long j3, int i2, Fragment fragment, DataChannel dataChannel, d.a aVar) {
        l.d(fragment, "");
        l.d(dataChannel, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.android.livesdk.rank.api.d
    public LiveRecyclableWidget getRankWidget() {
        return null;
    }

    @Override // com.bytedance.android.livesdk.rank.api.d
    public Class<? extends LiveRecyclableWidget> getRankWidgetClass(int i2) {
        return null;
    }

    @Override // com.bytedance.android.livesdk.rank.api.d
    public boolean isRankEnabled(int i2) {
        return false;
    }

    @Override // com.bytedance.android.livesdk.rank.api.d
    public boolean isRankEnabledInTheRoom(int i2, long j2) {
        return false;
    }

    @Override // com.bytedance.android.livesdk.rank.api.d
    public boolean isRoomOnRank() {
        return false;
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.livesdk.rank.api.d
    public void registerRankController(long j2, a aVar) {
    }

    @Override // com.bytedance.android.livesdk.rank.api.d
    public void setRankEnabled(long j2, boolean z) {
    }

    @Override // com.bytedance.android.livesdk.rank.api.d
    public void setRankEntranceList(List<bp> list) {
    }

    @Override // com.bytedance.android.livesdk.rank.api.d
    public void unregisterRankController(long j2, a aVar) {
    }
}
