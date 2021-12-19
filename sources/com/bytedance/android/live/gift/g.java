package com.bytedance.android.live.gift;

import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.ab.c.o;
import com.bytedance.android.livesdk.chatroom.c.ao;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.a;
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
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public class g implements IGiftService {
    static {
        Covode.recordClassIndex(5082);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void clearAssets(String str) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void clearFastGift(long j2) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void downloadAssets(String str, long j2, a aVar, int i2) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public boolean enableRedEnvelope() {
        return true;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void exitRoom(Boolean bool) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public u findGiftById(long j2) {
        return null;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public AssetsModel getAssets(String str, long j2) {
        return null;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public b getAssetsManager() {
        return null;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public String getAssetsPath(String str, long j2) {
        return "";
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public t getBoostChartInfo() {
        return null;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public u getFastGift(long j2) {
        return null;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public com.bytedance.android.livesdk.gift.a.b getFirstRechargeManager() {
        return null;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public com.bytedance.android.livesdk.ac.b getGiftInterceptor(long j2, boolean z) {
        return null;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public y getGiftMessage(long j2, w wVar, User user) {
        return null;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public List<GiftPage> getGiftPages() {
        return null;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public LiveWidget getGiftWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public String getLowAgeReportUrl() {
        return "";
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public Widget getRedEnvelopeWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public o getSendGiftResultLog(w wVar) {
        return null;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public LiveWidget getWishListWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public com.bytedance.android.livesdkapi.depend.d.a.b giftPlayControllerManager() {
        return null;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public long giftVideoResourcesClear(boolean z) {
        return 0;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void initGiftResource() {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void initGiftResourceManager(Context context) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public boolean isAssetsDownloaded(String str, long j2) {
        return false;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public boolean isFirstRecharge() {
        return false;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void loadBehavior(Context context, DataChannel dataChannel, int i2) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void logBoostCardLiveEndClick(int i2) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void logBoostCardLiveEndShow() {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void monitorBroadcastClicked(long j2) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void monitorBroadcastMonitor(long j2, boolean z) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void monitorGiftIconShow(boolean z, az azVar, String str, String str2) {
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void onPlayFragmentCreate() {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void onTurnTableUrlEmpty(String str) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void openGiftDialog(String str) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void openGiftDialogFromJSB(ao aoVar) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void openRechargeFAQPage(Context context) {
        l.d(context, "");
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void playGiftVideo(long j2, aa aaVar) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void removeAnimationEngine(n nVar) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void resetRoomStatus() {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public f.a.t<d<w>> sendGift(long j2, long j3, long j4, int i2) {
        return null;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void sendGiftInternal(long j2, int i2, com.bytedance.android.livesdk.gift.e.a aVar) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void setGiftAnimationEngine(n nVar, com.bytedance.android.livesdk.gift.a.a aVar) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void syncGiftList(int i2) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void syncGiftList(com.bytedance.android.livesdk.gift.e.b bVar, long j2, int i2, boolean z) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public List<u> getStickerGifts() {
        return new ArrayList();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public String getAmountString(long j2) {
        return String.valueOf(j2);
    }
}
