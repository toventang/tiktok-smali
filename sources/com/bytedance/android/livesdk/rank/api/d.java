package com.bytedance.android.livesdk.rank.api;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.model.message.bp;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import java.util.ArrayList;
import java.util.List;

public interface d extends com.bytedance.android.live.base.a {

    public interface a {
        static {
            Covode.recordClassIndex(12161);
        }

        void a(ArrayList<Long> arrayList);
    }

    static {
        Covode.recordClassIndex(12160);
    }

    int getCurrentRoomAudienceNum();

    int getCurrentRoomRank(int i2);

    LiveRecyclableWidget getHourlyRankWidget();

    c getRankOptOutPresenter();

    void getRankRoomIds(long j2, long j3, int i2, Fragment fragment, DataChannel dataChannel, a aVar);

    LiveRecyclableWidget getRankWidget();

    Class<? extends LiveRecyclableWidget> getRankWidgetClass(int i2);

    boolean isRankEnabled(int i2);

    boolean isRankEnabledInTheRoom(int i2, long j2);

    boolean isRoomOnRank();

    void registerRankController(long j2, com.bytedance.android.livesdk.rank.api.b.a aVar);

    void setRankEnabled(long j2, boolean z);

    void setRankEntranceList(List<bp> list);

    void unregisterRankController(long j2, com.bytedance.android.livesdk.rank.api.b.a aVar);
}
