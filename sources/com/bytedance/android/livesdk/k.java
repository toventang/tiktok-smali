package com.bytedance.android.livesdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.d;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.u.h;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.c.o;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.chatroom.c.ao;
import com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget;
import com.bytedance.android.livesdk.firstrecharge.d;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.b;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.n;
import com.bytedance.android.livesdk.gift.model.t;
import com.bytedance.android.livesdk.gift.model.w;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.dj;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeTitle;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeWebUrlLynxFaq;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftResourceCacheSetting;
import com.bytedance.android.livesdk.livesetting.redenvelope.AgeRestrictedConfig;
import com.bytedance.android.livesdk.livesetting.redenvelope.RedEnvelopeLibraConfig;
import com.bytedance.android.livesdk.manage.a;
import com.bytedance.android.livesdk.model.aa;
import com.bytedance.android.livesdk.model.az;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.newvideogift.a.e;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.service.assets.i;
import com.bytedance.android.livesdk.service.network.GiftRetrofitApi;
import com.bytedance.android.livesdk.widgets.giftwidget.GiftWidget;
import com.bytedance.android.livesdk.wishlist.widget.WishListWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.message.IMessageService;
import com.bytedance.android.widget.Widget;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.ugc.live.a.a.e;
import com.zhiliaoapp.musically.R;
import f.a.v;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class k implements IGiftService {
    static {
        Covode.recordClassIndex(10290);
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void resetRoomStatus() {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public b getAssetsManager() {
        return a.b.f18870a;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public d getFirstRechargeManager() {
        return d.u;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public LiveWidget getGiftWidget() {
        return new GiftWidget();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public Widget getRedEnvelopeWidget() {
        return new RedEnvelopeWidget();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public LiveWidget getWishListWidget() {
        return new WishListWidget();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public com.bytedance.android.livesdkapi.depend.d.a.b giftPlayControllerManager() {
        return e.a();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public boolean isFirstRecharge() {
        return d.u.b();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public List<GiftPage> getGiftPages() {
        return GiftManager.inst().getGiftPageList();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public List<u> getStickerGifts() {
        return GiftManager.inst().getStickerGifts();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public t getBoostChartInfo() {
        t tVar = new t();
        tVar.f17941c = com.bytedance.android.livesdk.boostcard.b.f14217c;
        tVar.f17942d = com.bytedance.android.livesdk.boostcard.b.f14218d;
        tVar.f17940b = com.bytedance.android.livesdk.boostcard.b.f14222h;
        tVar.f17939a = com.bytedance.android.livesdk.boostcard.b.f14216b;
        tVar.f17943e = com.bytedance.android.livesdk.boostcard.b.f14215a;
        return tVar;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public String getLowAgeReportUrl() {
        if (((IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class)).isInMusicallyRegion()) {
            return "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast-va.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
        }
        return "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void onPlayFragmentCreate() {
        if (h.c()) {
            com.bytedance.android.b.a((int) R.layout.bgt);
            com.bytedance.android.b.a((int) R.layout.bea);
            com.bytedance.android.b.a((int) R.layout.bfs);
        }
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public boolean enableRedEnvelope() {
        boolean z;
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room == null || room.mRoomAuthStatus == null || !room.mRoomAuthStatus.showRedEnvelope()) {
            z = false;
        } else {
            z = true;
        }
        if (!RedEnvelopeLibraConfig.INSTANCE.enableEnvelopeFunc() || AgeRestrictedConfig.INSTANCE.isLimit() || !z) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void initGiftResource() {
        initGiftResourceManager(y.e());
        f.a.t.a(new l(this)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(f.a.h.a.b(f.a.k.a.f158006c)).g();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void logBoostCardLiveEndShow() {
        String str;
        String str2 = com.bytedance.android.livesdk.boostcard.b.f14219e;
        String str3 = com.bytedance.android.livesdk.boostcard.b.f14221g;
        String str4 = com.bytedance.android.livesdk.boostcard.b.f14220f;
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("end_live_show").a();
        Map map = (Map) DataChannelGlobal.f34575d.b(dj.class);
        if (map == null || (str = (String) map.get("anchor_id")) == null) {
            str = "0";
        }
        com.bytedance.android.livesdk.ab.b a3 = a2.a("anchor_id", str).a("task_id", str2).a("card_id", str3);
        f b2 = com.bytedance.android.livesdk.userservice.u.a().b();
        l.b(b2, "");
        a3.a("user_id", b2.c()).a("task_source", str4).b();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void clearFastGift(long j2) {
        GiftManager.inst().clearFastGift(j2);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public long giftVideoResourcesClear(boolean z) {
        return a.b();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$initGiftResource$0$GiftService(v vVar) {
        syncGiftList(1);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void openGiftDialogFromJSB(ao aoVar) {
        com.bytedance.android.livesdk.an.a.a().a(aoVar);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void syncGiftList(int i2) {
        GiftManager.inst().syncGiftList(i2);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void clearAssets(String str) {
        com.ss.ugc.live.a.a.f.a().f154042b.clear();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public u findGiftById(long j2) {
        return GiftManager.inst().findGiftById(j2);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public u getFastGift(long j2) {
        return GiftManager.inst().getFastGift(j2);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void exitRoom(Boolean bool) {
        Activity activity;
        Application application;
        d dVar = d.u;
        dVar.q = null;
        WeakReference<Activity> weakReference = dVar.n;
        if (weakReference != null && (activity = weakReference.get()) != null && (application = activity.getApplication()) != null) {
            application.unregisterActivityLifecycleCallbacks(dVar.s);
        }
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void onTurnTableUrlEmpty(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("error_msg", str);
        c.a(com.bytedance.android.livesdk.ab.d.d.b("ttlive_turn_table_url_empty"), 1, hashMap);
        com.bytedance.android.livesdk.ab.a.a.a();
        com.bytedance.android.livesdk.ab.a.a.a(com.bytedance.android.livesdk.ab.a.b.Gift.info, "ttlive_turn_table_url_empty", hashMap);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void openGiftDialog(String str) {
        com.bytedance.android.livesdk.gift.g.a.a aVar;
        com.bytedance.android.livesdk.an.a a2 = com.bytedance.android.livesdk.an.a.a();
        if ("gift".equals(str)) {
            aVar = com.bytedance.android.livesdk.gift.g.a.a.GIFT;
        } else {
            aVar = com.bytedance.android.livesdk.gift.g.a.a.PROP;
        }
        a2.a(new ao(aVar));
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void removeAnimationEngine(n nVar) {
        com.bytedance.android.livesdk.service.animation.a a2 = com.bytedance.android.livesdk.service.animation.a.a();
        if (a2.f21177a.containsKey(nVar)) {
            com.bytedance.android.livesdk.gift.a.a aVar = a2.f21177a.get(nVar);
            if (aVar != null) {
                aVar.a();
            }
            a2.f21177a.remove(nVar);
        }
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public o getSendGiftResultLog(w wVar) {
        int i2;
        u findGiftById = GiftManager.inst().findGiftById(wVar.f17954f);
        if (findGiftById == null) {
            i2 = 0;
        } else {
            i2 = findGiftById.f19763f;
        }
        return new o(wVar.f17954f, findGiftById, wVar.f17960l, wVar.q, wVar.r, wVar.f17958j, wVar.f17957i, wVar.f17955g, (long) i2);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void initGiftResourceManager(Context context) {
        e.a aVar = new e.a(context);
        aVar.f154034b = new com.bytedance.android.livesdk.manage.a.c();
        aVar.f154033a = new com.bytedance.android.livesdk.manage.b.a(context);
        aVar.f154038f = 5;
        aVar.f154037e = 3;
        if (LiveGiftResourceCacheSetting.INSTANCE.getValue() != 0) {
            aVar.f154039g = LiveGiftResourceCacheSetting.INSTANCE.getValue();
        }
        com.ss.ugc.live.a.a.e a2 = aVar.a();
        if (com.ss.ugc.live.a.a.f.f154041a == null) {
            com.ss.ugc.live.a.a.f.f154041a = new com.ss.ugc.live.a.a.f(a2);
        }
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void monitorBroadcastClicked(long j2) {
        b.a.a("announcements_click").a().a("gift_id", (Number) Long.valueOf(j2)).a("reason", "gift").a("scene", com.bytedance.android.livesdk.u.a.b().getDesc()).b();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void logBoostCardLiveEndClick(int i2) {
        String str;
        String str2;
        String str3 = com.bytedance.android.livesdk.boostcard.b.f14219e;
        String str4 = com.bytedance.android.livesdk.boostcard.b.f14221g;
        String str5 = com.bytedance.android.livesdk.boostcard.b.f14220f;
        Integer valueOf = Integer.valueOf(i2);
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("end_live_click").a();
        Map map = (Map) DataChannelGlobal.f34575d.b(dj.class);
        if (map == null || (str = (String) map.get("anchor_id")) == null) {
            str = "0";
        }
        com.bytedance.android.livesdk.ab.b a3 = a2.a("anchor_id", str).a("task_id", str3).a("card_id", str4).a("task_source", str5);
        f b2 = com.bytedance.android.livesdk.userservice.u.a().b();
        l.b(b2, "");
        com.bytedance.android.livesdk.ab.b a4 = a3.a("user_id", b2.c());
        if (valueOf != null) {
            if (valueOf.intValue() == 0) {
                str2 = "think_again";
            } else if (valueOf.intValue() == 1) {
                str2 = "confirm";
            }
            a4.a("click_button", str2).b();
        }
        str2 = "no_selection";
        a4.a("click_button", str2).b();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public String getAmountString(long j2) {
        if (j2 >= 10000 && j2 < 1000000) {
            double d2 = (double) j2;
            Double.isNaN(d2);
            return com.a.a(Locale.getDefault(), "%.1f", new Object[]{Double.valueOf(d2 / 1000.0d)}) + "K";
        } else if (j2 >= 1000000) {
            double d3 = (double) j2;
            Double.isNaN(d3);
            return com.a.a(Locale.getDefault(), "%.1f", new Object[]{Double.valueOf(d3 / 1000000.0d)}) + "M";
        } else if (j2 >= 1000) {
            return new StringBuffer(String.valueOf(j2)).insert(1, ',').toString();
        } else {
            return String.valueOf(j2);
        }
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void openRechargeFAQPage(Context context) {
        String str;
        com.bytedance.android.livesdk.wallet.c cVar;
        com.bytedance.android.livesdk.wallet.c cVar2;
        String str2;
        Integer num;
        String str3;
        String str4;
        d dVar = d.u;
        if (context instanceof Activity) {
            if (dVar.r != null) {
                com.bytedance.android.livesdk.wallet.c cVar3 = dVar.r;
                Integer num2 = null;
                if (!(cVar3 == null || (str = cVar3.f22407c) == null || str.length() == 0 || (((cVar = dVar.r) != null && cVar.f22408d == 0) || ((cVar2 = dVar.r) != null && cVar2.f22409e == 0)))) {
                    com.bytedance.android.livesdk.firstrecharge.e.a(dVar.o);
                    String value = LiveFirstRechargeWebUrlLynxFaq.INSTANCE.getValue();
                    try {
                        Uri.Builder buildUpon = Uri.parse(value).buildUpon();
                        buildUpon.appendQueryParameter("gift_enter_from", dVar.o);
                        com.bytedance.android.livesdk.wallet.c cVar4 = dVar.r;
                        if (cVar4 == null || (str4 = cVar4.f22407c) == null) {
                            str2 = null;
                        } else {
                            str2 = str4.toString();
                        }
                        buildUpon.appendQueryParameter("price", str2);
                        com.bytedance.android.livesdk.wallet.c cVar5 = dVar.r;
                        if (cVar5 != null) {
                            num = Integer.valueOf(cVar5.f22408d);
                        } else {
                            num = null;
                        }
                        buildUpon.appendQueryParameter("diamond_count", String.valueOf(num));
                        com.bytedance.android.livesdk.wallet.c cVar6 = dVar.r;
                        if (cVar6 != null) {
                            num2 = Integer.valueOf(cVar6.f22409e);
                        }
                        buildUpon.appendQueryParameter("giving_count", String.valueOf(num2));
                        if (LiveFirstRechargeTitle.INSTANCE.getValue()) {
                            str3 = "1";
                        } else {
                            str3 = "0";
                        }
                        buildUpon.appendQueryParameter("title_ab", str3);
                        buildUpon.appendQueryParameter("pay_method", "google_pay");
                        String uri = buildUpon.build().toString();
                        l.b(uri, "");
                        value = uri;
                    } catch (Exception unused) {
                    }
                    ((IActionHandlerService) com.bytedance.android.live.t.a.a(IActionHandlerService.class)).handle(context, value);
                    return;
                }
            }
            com.bytedance.android.livesdk.utils.ao.a(y.e(), (int) R.string.glj);
        }
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public AssetsModel getAssets(String str, long j2) {
        return a.b.f18870a.a(j2);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public String getAssetsPath(String str, long j2) {
        return a.c(j2);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public com.bytedance.android.livesdk.ac.b getGiftInterceptor(long j2, boolean z) {
        return new com.bytedance.android.livesdk.w.a(j2);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public boolean isAssetsDownloaded(String str, long j2) {
        return a.a(a.b.f18870a.a(j2));
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void monitorBroadcastMonitor(long j2, boolean z) {
        String str;
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("receive_announcements").a().a("gift_id", (Number) Long.valueOf(j2)).a("reason", "gift").a("scene", com.bytedance.android.livesdk.u.a.b().getDesc());
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        a2.a("is_own_send", str).b();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void playGiftVideo(long j2, aa aaVar) {
        com.bytedance.android.livesdk.gift.model.o oVar = new com.bytedance.android.livesdk.gift.model.o();
        com.bytedance.android.livesdk.model.message.y yVar = new com.bytedance.android.livesdk.model.message.y();
        com.bytedance.android.livesdkapi.h.b bVar = new com.bytedance.android.livesdkapi.h.b();
        bVar.f23211c = 0;
        bVar.f23212d = com.bytedance.android.livesdk.utils.a.a.a();
        yVar.O = bVar;
        yVar.f19707i = j2;
        yVar.s = true;
        yVar.f13611c = true;
        yVar.f19703a = true;
        yVar.f19705g = d.a.a();
        oVar.f17914a = yVar;
        oVar.f17914a.f19704f = aaVar;
        com.bytedance.android.livesdk.an.a.a().a(oVar);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void setGiftAnimationEngine(n nVar, com.bytedance.android.livesdk.gift.a.a aVar) {
        com.bytedance.android.livesdk.service.animation.a a2 = com.bytedance.android.livesdk.service.animation.a.a();
        if (!a2.f21177a.containsKey(nVar)) {
            a2.f21177a.put(nVar, aVar);
            return;
        }
        throw new Exception("GiftType " + nVar.toString() + " already has been set, or you should call release firstly.");
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void sendGiftInternal(long j2, int i2, com.bytedance.android.livesdk.gift.e.a aVar) {
        sendGiftLocal(j2, i2, aVar);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public com.bytedance.android.livesdk.model.message.y getGiftMessage(long j2, w wVar, User user) {
        return i.a(j2, wVar, null, user);
    }

    private void sendGiftLocal(long j2, int i2, com.bytedance.android.livesdk.gift.e.a aVar) {
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null && room.getOwner() != null) {
            User owner = room.getOwner();
            long id = room.getId();
            ((GiftRetrofitApi) com.bytedance.android.live.network.e.a().a(GiftRetrofitApi.class)).send(j2, room.getId(), owner.getId(), i2).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new m(aVar, id, owner, j2, SystemClock.uptimeMillis()), new n(aVar, j2, id));
        }
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void loadBehavior(Context context, DataChannel dataChannel, int i2) {
        if (i2 == com.bytedance.android.live.p.l.FAST_GIFT.ordinal()) {
            com.bytedance.android.live.p.l.FAST_GIFT.load(dataChannel, new com.bytedance.android.livesdk.toolbar.a.d(context));
        } else if (i2 == com.bytedance.android.live.p.l.GIFT.ordinal()) {
            com.bytedance.android.live.p.l.GIFT.load(dataChannel, new com.bytedance.android.livesdk.toolbar.a.f(dataChannel));
        } else if (i2 == com.bytedance.android.live.p.l.DUMMY_GIFT.ordinal()) {
            com.bytedance.android.live.p.l.DUMMY_GIFT.load(dataChannel, new com.bytedance.android.livesdk.toolbar.a.c(dataChannel));
        } else if (i2 == com.bytedance.android.live.p.l.DUMMY_FAST_GIFT.ordinal()) {
            com.bytedance.android.livesdk.toolbar.a.b bVar = new com.bytedance.android.livesdk.toolbar.a.b(dataChannel);
            Room room = (Room) dataChannel.b(df.class);
            if (room != null && GiftManager.inst().getFastGift(room.getId()) != null) {
                com.bytedance.android.live.p.l.DUMMY_FAST_GIFT.load(dataChannel, bVar);
            }
        }
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void downloadAssets(String str, long j2, com.bytedance.android.livesdk.gift.assets.a aVar, int i2) {
        a.b.f18870a.a(j2, aVar, i2);
    }

    static final /* synthetic */ void lambda$sendGiftLocal$2$GiftService(com.bytedance.android.livesdk.gift.e.a aVar, long j2, long j3, Throwable th) {
        com.bytedance.android.livesdk.service.c.g.a.a(th);
        if (aVar != null) {
            aVar.a(th);
        }
        com.bytedance.android.livesdk.service.c.g.a.a(j2, j3, th);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void syncGiftList(com.bytedance.android.livesdk.gift.e.b bVar, long j2, int i2, boolean z) {
        GiftManager.inst().syncGiftList(bVar, j2, i2, z);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public f.a.t<com.bytedance.android.live.network.response.d<w>> sendGift(long j2, long j3, long j4, int i2) {
        return ((GiftRetrofitApi) com.bytedance.android.live.network.e.a().a(GiftRetrofitApi.class)).send(j2, j3, j4, i2);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void monitorGiftIconShow(boolean z, az azVar, String str, String str2) {
        String str3 = "";
        l.d(azVar, str3);
        l.d(str, str3);
        l.d(str2, str3);
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("gift_icon_show").a("is_click_available", z ? 1 : 0);
        if (!z) {
            str3 = azVar.getDescription();
        }
        a2.a("un_available_click_reason", str3).a("user_type", str).a("icon_show_position", str2).a().b();
    }

    static final /* synthetic */ void lambda$sendGiftLocal$1$GiftService(com.bytedance.android.livesdk.gift.e.a aVar, long j2, User user, long j3, long j4, com.bytedance.android.live.network.response.d dVar) {
        if (dVar != null) {
            com.bytedance.android.livesdk.service.c.g.a.a((Throwable) null);
            w wVar = (w) dVar.data;
            if (aVar != null) {
                aVar.a(wVar);
            }
            for (com.bytedance.android.livesdk.model.message.y yVar : i.b(j2, wVar, user, d.a.a())) {
                ((IMessageService) com.bytedance.android.live.t.a.a(IMessageService.class)).get().insertMessage(yVar);
            }
            com.bytedance.android.livesdk.service.c.g.a.a(j3, SystemClock.uptimeMillis() - j4, null, null);
        }
    }
}
