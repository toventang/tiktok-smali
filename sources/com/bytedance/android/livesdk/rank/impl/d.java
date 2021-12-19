package com.bytedance.android.livesdk.rank.impl;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.d.a;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.livesetting.gift.LiveAnchorGiftDisableSetting;
import com.bytedance.android.livesdk.livesetting.rank.RankSupportAreaSetting;
import com.bytedance.android.livesdk.model.message.bp;
import com.bytedance.android.livesdk.rank.api.c;
import com.bytedance.android.livesdk.rank.api.d;
import com.bytedance.android.livesdk.rank.api.j;
import com.bytedance.android.livesdk.rank.impl.api.model.Rank;
import com.bytedance.android.livesdk.rank.impl.api.model.RankPage;
import com.bytedance.android.livesdk.rank.impl.ranks.RankEntranceWidget;
import com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class d implements a.AbstractC0347a, com.bytedance.android.livesdk.rank.api.d {
    private List<bp> canShowRankEntrances = new ArrayList();
    private boolean notMatchAgeGate;
    private boolean rankAreaSupported;
    private final Map<Long, com.bytedance.android.livesdk.rank.api.b.a> rankControllerMap = new HashMap();
    private boolean settingLoaded;

    static {
        Covode.recordClassIndex(12215);
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.livesdk.rank.api.d
    public int getCurrentRoomAudienceNum() {
        return com.bytedance.android.livesdk.rank.impl.c.a.f20657c;
    }

    @Override // com.bytedance.android.livesdk.rank.api.d
    public LiveRecyclableWidget getHourlyRankWidget() {
        return new RankEntranceWidget();
    }

    @Override // com.bytedance.android.livesdk.rank.api.d
    public c getRankOptOutPresenter() {
        return new com.bytedance.android.livesdk.rank.impl.e.c();
    }

    @Override // com.bytedance.android.livesdk.rank.api.d
    public LiveRecyclableWidget getRankWidget() {
        return new OnlineAudienceRankWidget();
    }

    public boolean isRankAreaSupported() {
        if (!this.settingLoaded) {
            loadSetting();
            this.settingLoaded = true;
        }
        return this.rankAreaSupported;
    }

    public d() {
        a.f16900a = this;
    }

    private void loadSetting() {
        this.notMatchAgeGate = LiveAnchorGiftDisableSetting.INSTANCE.getValue();
        this.rankAreaSupported = RankSupportAreaSetting.INSTANCE.getValue();
    }

    @Override // com.bytedance.android.livesdk.rank.api.d
    public boolean isRoomOnRank() {
        int i2;
        int i3 = com.bytedance.android.livesdk.rank.impl.c.a.f20655a;
        if ((1 > i3 || 99 < i3) && (1 > (i2 = com.bytedance.android.livesdk.rank.impl.c.a.f20656b) || 99 < i2)) {
            return false;
        }
        return true;
    }

    public boolean matchAgeGate() {
        if (!this.settingLoaded) {
            loadSetting();
            this.settingLoaded = true;
        }
        if (!this.notMatchAgeGate) {
            return true;
        }
        return false;
    }

    public String getRankDisabledReason() {
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room == null) {
            return "hide_due_to_empty_room";
        }
        if (room.getOwner() == null) {
            return "hide_due_to_empty_owner";
        }
        if (u.a().b().a().getSecret() == 1) {
            return "hide_due_to_secret_audience";
        }
        if (room.getOwner().getSecret() == 1) {
            return "hide_due_to_secret_anchor";
        }
        if (this.notMatchAgeGate) {
            return "hide_due_to_age_gate";
        }
        if (!this.rankAreaSupported) {
            return "hide_due_to_unsupported_area";
        }
        return "";
    }

    @Override // com.bytedance.android.livesdk.rank.api.d
    public Class<? extends LiveRecyclableWidget> getRankWidgetClass(int i2) {
        if (i2 == 4) {
            return RankEntranceWidget.class;
        }
        if (i2 == 5) {
            return OnlineAudienceRankWidget.class;
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.rank.api.d
    public void setRankEntranceList(List<bp> list) {
        this.canShowRankEntrances.clear();
        this.canShowRankEntrances.addAll(list);
    }

    @Override // com.bytedance.android.livesdk.rank.api.d
    public int getCurrentRoomRank(int i2) {
        if (i2 == j.HOURLY_RANK.getType()) {
            return com.bytedance.android.livesdk.rank.impl.c.a.f20655a;
        }
        if (i2 == j.WEEKLY_RANK.getType()) {
            return com.bytedance.android.livesdk.rank.impl.c.a.f20656b;
        }
        return -1;
    }

    @Override // com.bytedance.android.livesdk.d.a.AbstractC0347a
    public boolean filter(com.bytedance.android.livesdk.model.j jVar) {
        if (!TextUtils.equals(jVar.f19087c, "hourly_rank") && !TextUtils.equals(jVar.f19087c, "weekly_rank")) {
            return true;
        }
        if (!this.settingLoaded) {
            loadSetting();
            this.settingLoaded = true;
        }
        if (!this.rankAreaSupported || this.notMatchAgeGate) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.rank.api.d
    public boolean isRankEnabled(int i2) {
        if (!matchAgeGate()) {
            return false;
        }
        for (bp bpVar : this.canShowRankEntrances) {
            if (bpVar.f19348e == i2 && bpVar.f19344a) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.rank.api.d
    public void registerRankController(long j2, com.bytedance.android.livesdk.rank.api.b.a aVar) {
        if (aVar != null) {
            this.rankControllerMap.put(Long.valueOf(j2), aVar);
        }
    }

    @Override // com.bytedance.android.livesdk.rank.api.d
    public void unregisterRankController(long j2, com.bytedance.android.livesdk.rank.api.b.a aVar) {
        if (aVar != null) {
            this.rankControllerMap.remove(Long.valueOf(j2));
        }
    }

    @Override // com.bytedance.android.livesdk.rank.api.d
    public boolean isRankEnabledInTheRoom(int i2, long j2) {
        com.bytedance.android.livesdk.rank.api.b.a aVar;
        if (isRankEnabled(i2) && (aVar = this.rankControllerMap.get(Long.valueOf(j2))) != null) {
            return aVar.a();
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.rank.api.d
    public void setRankEnabled(long j2, boolean z) {
        com.bytedance.android.livesdk.rank.api.b.a aVar = this.rankControllerMap.get(Long.valueOf(j2));
        if (aVar != null) {
            aVar.a(z);
        }
    }

    static final /* synthetic */ z lambda$getRankRoomIds$0$RankService(d.a aVar, RankPage rankPage) {
        ArrayList<Long> arrayList = new ArrayList<>();
        for (Rank rank : rankPage.getRanks()) {
            arrayList.add(Long.valueOf(rank.getRoomId()));
        }
        aVar.a(arrayList);
        return null;
    }

    @Override // com.bytedance.android.livesdk.rank.api.d
    public void getRankRoomIds(long j2, long j3, int i2, Fragment fragment, DataChannel dataChannel, d.a aVar) {
        new com.bytedance.android.livesdk.rank.impl.ranks.a.d(j2, j3, dataChannel, new ArrayList(), com.bytedance.android.livesdk.rank.impl.api.model.d.UNKNOWN.getValue()).a(i2, fragment, new e(aVar));
    }
}
