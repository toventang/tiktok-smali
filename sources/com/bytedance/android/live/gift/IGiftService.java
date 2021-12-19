package com.bytedance.android.live.gift;

import android.content.Context;
import com.bytedance.android.live.base.a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.ab.c.o;
import com.bytedance.android.livesdk.chatroom.c.ao;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.b;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.n;
import com.bytedance.android.livesdk.gift.model.t;
import com.bytedance.android.livesdk.gift.model.w;
import com.bytedance.android.livesdk.model.aa;
import com.bytedance.android.livesdk.model.az;
import com.bytedance.android.livesdk.model.message.y;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.widget.Widget;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import java.util.List;

public interface IGiftService extends a {
    static {
        Covode.recordClassIndex(5075);
    }

    void clearAssets(String str);

    void clearFastGift(long j2);

    void downloadAssets(String str, long j2, com.bytedance.android.livesdk.gift.assets.a aVar, int i2);

    boolean enableRedEnvelope();

    void exitRoom(Boolean bool);

    u findGiftById(long j2);

    String getAmountString(long j2);

    AssetsModel getAssets(String str, long j2);

    b getAssetsManager();

    String getAssetsPath(String str, long j2);

    t getBoostChartInfo();

    u getFastGift(long j2);

    com.bytedance.android.livesdk.gift.a.b getFirstRechargeManager();

    com.bytedance.android.livesdk.ac.b getGiftInterceptor(long j2, boolean z);

    y getGiftMessage(long j2, w wVar, User user);

    List<GiftPage> getGiftPages();

    LiveWidget getGiftWidget();

    String getLowAgeReportUrl();

    Widget getRedEnvelopeWidget();

    o getSendGiftResultLog(w wVar);

    List<u> getStickerGifts();

    LiveWidget getWishListWidget();

    com.bytedance.android.livesdkapi.depend.d.a.b giftPlayControllerManager();

    long giftVideoResourcesClear(boolean z);

    void initGiftResource();

    void initGiftResourceManager(Context context);

    boolean isAssetsDownloaded(String str, long j2);

    boolean isFirstRecharge();

    void loadBehavior(Context context, DataChannel dataChannel, int i2);

    void logBoostCardLiveEndClick(int i2);

    void logBoostCardLiveEndShow();

    void monitorBroadcastClicked(long j2);

    void monitorBroadcastMonitor(long j2, boolean z);

    void monitorGiftIconShow(boolean z, az azVar, String str, String str2);

    void onPlayFragmentCreate();

    void onTurnTableUrlEmpty(String str);

    void openGiftDialog(String str);

    void openGiftDialogFromJSB(ao aoVar);

    void openRechargeFAQPage(Context context);

    void playGiftVideo(long j2, aa aaVar);

    void removeAnimationEngine(n nVar);

    void resetRoomStatus();

    f.a.t<d<w>> sendGift(long j2, long j3, long j4, int i2);

    void sendGiftInternal(long j2, int i2, com.bytedance.android.livesdk.gift.e.a aVar);

    void setGiftAnimationEngine(n nVar, com.bytedance.android.livesdk.gift.a.a aVar);

    void syncGiftList(int i2);

    void syncGiftList(com.bytedance.android.livesdk.gift.e.b bVar, long j2, int i2, boolean z);
}
