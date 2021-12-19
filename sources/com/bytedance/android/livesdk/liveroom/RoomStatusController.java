package com.bytedance.android.livesdk.liveroom;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ae;
import com.bytedance.android.livesdk.ab;
import com.bytedance.android.livesdk.au.a;
import com.bytedance.android.livesdk.live.data.RoomStatsViewModel;
import com.bytedance.android.livesdk.live.model.c;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.android.livesdk.widget.LiveVerticalViewPager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.g.h;
import com.bytedance.covode.number.Covode;
import f.a.t;
import java.util.ArrayList;
import java.util.Map;

public class RoomStatusController implements ISubController {
    private static final long ROOM_REFRESH_TIME = ((long) (LiveFeedRefreshTimeSetting.INSTANCE.getValue() * 1000));
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    public h mListProvider;
    private final Runnable mRefreshRoomStatsTimer = new Runnable() {
        /* class com.bytedance.android.livesdk.liveroom.RoomStatusController.AnonymousClass1 */

        static {
            Covode.recordClassIndex(10485);
        }

        public final void run() {
            int currentItem;
            if (RoomStatusController.this.mListProvider != null) {
                ArrayList arrayList = new ArrayList(100);
                ArrayList arrayList2 = new ArrayList(RoomStatusController.this.mListProvider.b());
                if (!com.bytedance.common.utility.h.a(arrayList2)) {
                    try {
                        if (RoomStatusController.this.mListProvider.a() > 0 && (currentItem = RoomStatusController.this.mViewPager.getCurrentItem() % RoomStatusController.this.mListProvider.a()) >= 0) {
                            if (currentItem < arrayList2.size()) {
                                arrayList.addAll(arrayList2.subList(Math.max(0, currentItem - 50), currentItem));
                                arrayList.addAll(arrayList2.subList(currentItem + 1, Math.min(arrayList2.size(), currentItem + 50)));
                            }
                        }
                        arrayList.addAll(arrayList2);
                    } catch (Throwable unused) {
                    }
                }
                RoomStatusController.this.mRoomStatsViewModel.a(arrayList);
            }
        }
    };
    public RoomStatsViewModel mRoomStatsViewModel;
    LiveVerticalViewPager mViewPager;

    static final /* synthetic */ void lambda$refreshRoomStats$2$RoomStatusController(Throwable th) {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void init() {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onCreate() {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onResume() {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onDestory() {
        resetRefreshTimer();
    }

    private void resetRefreshTimer() {
        this.mHandler.removeCallbacks(this.mRefreshRoomStatsTimer);
    }

    public void refreshTimer() {
        resetRefreshTimer();
        this.mHandler.postDelayed(this.mRefreshRoomStatsTimer, ROOM_REFRESH_TIME);
    }

    static {
        Covode.recordClassIndex(10484);
    }

    public void setListProvider(h hVar) {
        this.mListProvider = hVar;
    }

    public void setViewPager(LiveVerticalViewPager liveVerticalViewPager) {
        this.mViewPager = liveVerticalViewPager;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$refreshRoomStats$1$RoomStatusController(Room room) {
        this.mListProvider.a(room.getId());
    }

    public RoomStatusController(ab abVar) {
        RoomStatsViewModel roomStatsViewModel = (RoomStatsViewModel) ae.a(abVar, new a()).a(RoomStatsViewModel.class);
        this.mRoomStatsViewModel = roomStatsViewModel;
        roomStatsViewModel.f18675a.observe(abVar, new a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: refreshRoomStats */
    public void bridge$lambda$0$RoomStatusController(Map<String, c> map) {
        h hVar = this.mListProvider;
        if (hVar != null && hVar.b() != null) {
            t.b((Iterable) new ArrayList(this.mListProvider.b())).a(new b(map)).a(new c(this), d.f18699a);
            refreshTimer();
        }
    }

    static final /* synthetic */ boolean lambda$refreshRoomStats$0$RoomStatusController(Map map, Room room) {
        String valueOf = String.valueOf(room.getId());
        if (!map.containsKey(valueOf) || ((c) map.get(valueOf)).f18687b) {
            return false;
        }
        return true;
    }
}
