package com.bytedance.android.livesdk.al;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.c.c;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.n.k;
import com.bytedance.android.live.p.q;
import com.bytedance.android.live.t.a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdk.callback.b;
import com.bytedance.android.livesdk.chatroom.api.LiveEventApi;
import com.bytedance.android.livesdk.feed.FullDraggableContainer;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.bd;
import com.bytedance.android.livesdk.j.ch;
import com.bytedance.android.livesdk.live.api.RoomStatApi;
import com.bytedance.android.livesdk.livesetting.broadcast.Live3dtouchOptimizeEnableSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveEventDetailSetting;
import com.bytedance.android.livesdk.livesetting.other.ToolBarButtonWithTextExperiment;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveReportOptimizeUrlSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSharePanelShowDislikeSetting;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.d.g;
import com.bytedance.android.livesdkapi.depend.d.j;
import com.bytedance.android.livesdkapi.depend.d.n;
import com.bytedance.android.livesdkapi.depend.model.a.c;
import com.bytedance.android.livesdkapi.depend.model.a.f;
import com.bytedance.android.livesdkapi.depend.model.a.h;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.android.livesdkapi.service.d;
import com.bytedance.android.livesdkapi.service.e;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.message.IMessageService;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public final class b implements d {

    /* renamed from: c  reason: collision with root package name */
    private static volatile b f13941c;

    /* renamed from: a  reason: collision with root package name */
    private final com.bytedance.android.livesdkapi.f.b f13942a = c.f13946a;

    /* renamed from: b  reason: collision with root package name */
    private h f13943b;

    /* renamed from: d  reason: collision with root package name */
    private final e f13944d = new e() {
        /* class com.bytedance.android.livesdk.al.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(7732);
        }
    };

    static {
        Covode.recordClassIndex(7731);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final Fragment a(Context context, Bundle bundle) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final Fragment b(Context context, Bundle bundle) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final int l() {
        return R.drawable.c_u;
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final int m() {
        return R.string.eb5;
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(Activity activity) {
        ((IBroadcastService) a.a(IBroadcastService.class)).setBroadcastActivity(activity);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final boolean a(Context context, Uri uri) {
        return ((IActionHandlerService) a.a(IActionHandlerService.class)).handleWithoutHost(context, uri.toString());
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final f a(com.bytedance.android.livesdkapi.j.a aVar) {
        return ((IBroadcastService) a.a(IBroadcastService.class)).createStartLiveFragment(aVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final g a(String str) {
        return ((com.bytedance.android.live.i.a.d) a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayControllerManager().a(str);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(String str, k kVar) {
        ((com.bytedance.android.live.i.a.d) a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayControllerManager().a(str, kVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(Context context) {
        ((com.bytedance.android.livesdk.watch.d) a.a(com.bytedance.android.livesdk.watch.d.class)).preloadWatchResource(context);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final com.bytedance.android.livesdkapi.depend.d.h a(EnterRoomConfig enterRoomConfig) {
        return ((com.bytedance.android.livesdk.watch.d) a.a(com.bytedance.android.livesdk.watch.d.class)).createLiveRoomFragment(enterRoomConfig);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final c a(com.bytedance.android.livesdkapi.depend.model.a.b bVar, Bundle bundle) {
        return ((IBroadcastService) a.a(IBroadcastService.class)).createLiveBroadcastFragment(bVar, bundle);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(long j2, com.bytedance.android.livesdkapi.service.a aVar) {
        if (aVar != null) {
            ((RoomStatApi) com.bytedance.android.live.network.e.a().a(RoomStatApi.class)).checkRoom(String.valueOf(j2)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new d(aVar), new e(aVar));
        }
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(long j2, com.bytedance.android.livesdkapi.service.b bVar) {
        com.bytedance.android.livesdk.chatroom.b.f.a(j2, bVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(Context context, com.bytedance.android.livesdkapi.depend.e.c cVar) {
        ((com.bytedance.android.live.s.e) a.a(com.bytedance.android.live.s.e.class)).report(context, cVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final String a(long j2, EnterRoomConfig enterRoomConfig, Context context) {
        com.bytedance.android.d.c warmUp = ((com.bytedance.android.live.i.a.d) a.a(com.bytedance.android.live.i.a.d.class)).warmUp(j2, enterRoomConfig, context);
        if (warmUp != null) {
            return warmUp.getPlayerTag();
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final boolean a(String str, Context context) {
        return ((com.bytedance.android.live.i.a.d) a.a(com.bytedance.android.live.i.a.d.class)).preCreatedSurface(str, context);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(com.bytedance.android.livesdkapi.depend.d.b.c cVar) {
        ((IWalletService) a.a(IWalletService.class)).walletCenter().a(cVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(com.bytedance.android.livesdkapi.depend.d.e eVar) {
        if (Live3dtouchOptimizeEnableSetting.INSTANCE.enable()) {
            DataChannelGlobal.f34575d.a(bd.class, new f(eVar));
        }
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(Map<String, Class> map, Map<Class, com.bytedance.android.e.a.a.b> map2) {
        com.bytedance.android.live.network.h.a().a(map2);
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Class> entry : map.entrySet()) {
            if (com.bytedance.android.livesdk.ac.b.a.class.isAssignableFrom(entry.getValue())) {
                hashMap.put(entry.getKey(), entry.getValue());
            } else {
                throw new IllegalArgumentException("Class must extend from BaseLiveMessage");
            }
        }
        ((IMessageService) a.a(IMessageService.class)).registerMessageClass(hashMap);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(int i2) {
        ((com.bytedance.android.b.a.b) a.a(com.bytedance.android.b.a.b.class)).preloadInboxTopLivesFeedAction(i2);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(Context context, boolean z, Room room, com.bytedance.android.livesdkapi.depend.e.c cVar, IHostLongPressCallback iHostLongPressCallback, com.bytedance.android.livesdkapi.depend.e.b bVar) {
        ((com.bytedance.android.live.f.a) a.a(com.bytedance.android.live.f.a.class)).onLongPress(context, z, room, cVar, iHostLongPressCallback, bVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(Context context, com.bytedance.android.livesdkapi.model.d dVar) {
        com.bytedance.android.livesdk.browser.c.d webViewManager;
        com.bytedance.android.live.core.widget.a a2;
        androidx.fragment.app.e a3 = p.a(context);
        if (a3 != null) {
            String value = LiveReportOptimizeUrlSetting.INSTANCE.getValue();
            if (TextUtils.isEmpty(value)) {
                com.bytedance.android.livesdk.ab.a a4 = c.a.d("ttlive_report_user_error").a("error_code", (Integer) -1).a("error_msg", "live report url is empty");
                a4.f13426c = true;
                a4.a();
                return;
            }
            d.b a5 = com.bytedance.android.livesdk.browser.c.e.a(dVar.a(value)).a(8, 8, 0, 0);
            a5.f14310k = -1;
            a5.s = true;
            a5.f14302c = (int) y.e(y.b());
            a5.f14301b = (int) y.e(y.c());
            a5.J = true;
            a5.f14309j = 80;
            com.bytedance.android.live.b.f fVar = (com.bytedance.android.live.b.f) a.a(com.bytedance.android.live.b.f.class);
            if (fVar != null && (webViewManager = fVar.webViewManager()) != null && (a2 = webViewManager.a(a5)) != null) {
                com.bytedance.android.live.core.widget.a.a(a3, a2);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(Context context, String str, String str2, Bundle bundle, DialogInterface.OnDismissListener onDismissListener) {
        com.bytedance.android.livesdk.browser.c.d webViewManager;
        com.bytedance.android.live.core.widget.a a2;
        androidx.fragment.app.e a3 = p.a(context);
        if (a3 != null) {
            float f2 = bundle.getFloat("bundle_dialog_screen_size", 0.95f);
            d.b a4 = com.bytedance.android.livesdk.browser.c.e.a(Uri.parse(LiveEventDetailSetting.INSTANCE.getValue()).buildUpon().appendQueryParameter("event_id", str).appendQueryParameter("user_id", str2).appendQueryParameter("aid", String.valueOf(((IHostContext) a.a(IHostContext.class)).appId())).build().toString() + bundle.getString("bundle_url_extra_param", "")).a(8, 8, 0, 0);
            a4.f14310k = -1;
            a4.s = true;
            a4.f14302c = (int) y.e((int) (((float) y.b()) * f2));
            a4.f14301b = (int) y.e(y.c());
            a4.f14309j = 80;
            com.bytedance.android.live.b.f fVar = (com.bytedance.android.live.b.f) a.a(com.bytedance.android.live.b.f.class);
            if (fVar != null && (webViewManager = fVar.webViewManager()) != null && (a2 = webViewManager.a(a4)) != null) {
                if (onDismissListener != null) {
                    a2.f9304d = onDismissListener;
                }
                com.bytedance.android.live.core.widget.a.a(a3, a2);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final Map<String, Object> a(long j2) {
        return ((com.bytedance.android.b.a.b) a.a(com.bytedance.android.b.a.b.class)).getFeedTab(j2);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(b.a aVar, com.bytedance.android.livesdk.callback.b bVar) {
        if (aVar == b.a.AUDIENCE_LIVE_PLAY_DURATION) {
            ((com.bytedance.android.livesdk.watch.d) a.a(com.bytedance.android.livesdk.watch.d.class)).addLiveDurationTask(bVar);
        }
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final Map<String, com.bytedance.ies.web.a.d> a(WeakReference<Context> weakReference, com.bytedance.ies.web.a.a aVar) {
        return ((IWalletService) a.a(IWalletService.class)).getLiveWalletJSB(weakReference, aVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(com.bytedance.android.livesdkapi.depend.e.c cVar) {
        ((com.bytedance.android.livesdk.watch.d) a.a(com.bytedance.android.livesdk.watch.d.class)).dislikeLiveFromSharePanel(cVar.H, cVar.z, cVar.A);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void b(com.bytedance.android.livesdkapi.depend.e.c cVar) {
        ((com.bytedance.android.livesdk.watch.d) a.a(com.bytedance.android.livesdk.watch.d.class)).logDislikeLiveFromSharePanel(cVar.H, cVar.z, cVar.A);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(Room room, String str, String str2) {
        ((com.bytedance.android.livesdk.watch.d) a.a(com.bytedance.android.livesdk.watch.d.class)).logDislikeLiveFromLongPressSharePanel(room, str, str2);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(Room room, String str, String str2, String str3) {
        ((com.bytedance.android.livesdk.watch.d) a.a(com.bytedance.android.livesdk.watch.d.class)).logReportLiveFromSharePanel(room, str, str2, str3);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final boolean a(String str, String str2) {
        return ((com.bytedance.android.livesdk.watch.d) a.a(com.bytedance.android.livesdk.watch.d.class)).shouldDislikeActionShow(str, str2);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final boolean a(Context context, Uri uri, Map<String, String> map) {
        return ((IActionHandlerService) a.a(IActionHandlerService.class)).handleWithoutHost(context, uri, map);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(Context context, int i2) {
        ((com.bytedance.android.live.p.h) a.a(com.bytedance.android.live.p.h.class)).preloadToolbarView(context, i2, ToolBarButtonWithTextExperiment.hasText() ? q.ICON_WITH_TEXT : q.ICON);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(Locale locale) {
        com.bytedance.android.live.core.c.a.a(3, "i18n_translation", "notify I18nDataCenter when locale changed");
        com.bytedance.android.livesdk.i18n.b.a().a(locale);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void e() {
        DataChannelGlobal.f34575d.d(ch.class);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final Fragment h() {
        return new com.bytedance.android.livesdk.ao.b();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final JSONObject p() {
        return com.bytedance.android.livesdk.ao.e.a();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final com.bytedance.android.livesdkapi.depend.d.f r() {
        return a.a();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final j s() {
        return h.b();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final boolean w() {
        return LiveSharePanelShowDislikeSetting.INSTANCE.getValue();
    }

    private b() {
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final Fragment d() {
        return ((IBroadcastService) a.a(IBroadcastService.class)).getSubscribeSettingFragment();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final g f() {
        return ((com.bytedance.android.live.i.a.d) a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayController();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final com.bytedance.android.livesdkapi.depend.d.a.b g() {
        return ((IGiftService) a.a(IGiftService.class)).giftPlayControllerManager();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final Context j() {
        return ((IBroadcastService) a.a(IBroadcastService.class)).getBroadcastActivity();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final Map<String, String> k() {
        return ((IBroadcastService) a.a(IBroadcastService.class)).getRoomInfo();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void n() {
        ((IWalletService) a.a(IWalletService.class)).walletCenter().d();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final n o() {
        return ((com.bytedance.android.b.a.b) a.a(com.bytedance.android.b.a.b.class)).getStartLiveRoomInterceptor();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void t() {
        IBroadcastService iBroadcastService = (IBroadcastService) a.a(IBroadcastService.class);
        if (iBroadcastService != null) {
            iBroadcastService.showEndPageForPaidEvent();
        }
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final com.bytedance.android.live.broadcast.api.d u() {
        return ((IBroadcastService) a.a(IBroadcastService.class)).getSubscribeEntranceHelper();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final com.bytedance.android.live.l.a x() {
        return ((com.bytedance.android.live.l.b) a.a(com.bytedance.android.live.l.b.class)).getINegativeTest();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void y() {
        ((com.bytedance.android.live.p.h) a.a(com.bytedance.android.live.p.h.class)).releaseToolbarView();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final h i() {
        if (this.f13943b == null) {
            this.f13943b = ((IBroadcastService) a.a(IBroadcastService.class)).startLiveManager();
        }
        return this.f13943b;
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final String q() {
        IBroadcastService iBroadcastService = (IBroadcastService) a.a(IBroadcastService.class);
        if (iBroadcastService == null) {
            return "";
        }
        return iBroadcastService.getLiveCoreVersion();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final boolean v() {
        com.bytedance.android.livesdk.rank.api.c rankOptOutPresenter = ((com.bytedance.android.livesdk.rank.api.d) a.a(com.bytedance.android.livesdk.rank.api.d.class)).getRankOptOutPresenter();
        if (com.bytedance.android.livesdk.ai.a.b()) {
            return true;
        }
        if (rankOptOutPresenter == null || !rankOptOutPresenter.d()) {
            return false;
        }
        return true;
    }

    public static b a() {
        MethodCollector.i(4063);
        if (f13941c == null) {
            synchronized (b.class) {
                try {
                    if (f13941c == null) {
                        f13941c = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4063);
                    throw th;
                }
            }
        }
        b bVar = f13941c;
        MethodCollector.o(4063);
        return bVar;
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final com.bytedance.android.livesdk.watch.c b() {
        return ((com.bytedance.android.livesdk.watch.d) a.a(com.bytedance.android.livesdk.watch.d.class)).getPreFetchManager();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void c() {
        com.bytedance.android.live.core.c.a.a(4, "LiveIconGeneratorLog", "LiveServiceApiImpl#requestTabListForyouPage");
        ((com.bytedance.android.b.a.b) a.a(com.bytedance.android.b.a.b.class)).requestTabListForyouPage();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final long a(boolean z) {
        return ((IGiftService) a.a(IGiftService.class)).giftVideoResourcesClear(z);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final int b(String str) {
        str.hashCode();
        if (str.equals("share_setting")) {
            return R.drawable.c_v;
        }
        if (!str.equals("moderator_setting_action")) {
            return 0;
        }
        return 2131234708;
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final int c(String str) {
        str.hashCode();
        if (str.equals("share_setting")) {
            return R.string.ehp;
        }
        if (!str.equals("moderator_setting_action")) {
            return 0;
        }
        return R.string.ej1;
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void d(String str) {
        ((com.bytedance.android.live.i.a.d) a.a(com.bytedance.android.live.i.a.d.class)).stopRoomPlayer(str, false);
        ((com.bytedance.android.live.i.a.d) a.a(com.bytedance.android.live.i.a.d.class)).recycleRoomPlayer(str);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void e(String str) {
        long id;
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        LiveEventApi liveEventApi = (LiveEventApi) com.bytedance.android.live.network.e.a().a(LiveEventApi.class);
        if (room == null) {
            id = 0;
        } else {
            id = room.getId();
        }
        liveEventApi.bindLiveEvent(id, u.a().b().c(), Long.parseLong(str)).d(g.f13950a);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final com.bytedance.android.livesdkapi.b.d b(Bundle bundle) {
        return ((com.bytedance.android.live.b.f) a.a(com.bytedance.android.live.b.f.class)).createLiveBrowserFragment(bundle);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final com.bytedance.android.live.n.j a(Bundle bundle) {
        return ((IBroadcastService) a.a(IBroadcastService.class)).createLiveBroadcastEndFragment(bundle);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final String b(int i2) {
        return ((IHostShare) a.a(IHostShare.class)).getBundleKey(i2);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void b(long j2) {
        ((com.bytedance.android.livesdk.watch.d) a.a(com.bytedance.android.livesdk.watch.d.class)).addLiveDuration(j2);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void b(Activity activity) {
        ((com.bytedance.android.livesdk.watch.d) a.a(com.bytedance.android.livesdk.watch.d.class)).openShareSettingsDialog(activity, "live_page");
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final <T> T a(String str, T t) {
        return (T) com.bytedance.android.livesdk.ao.e.a(str, t);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final com.bytedance.android.livesdk.container.c b(Context context, Uri uri) {
        return ((com.bytedance.android.live.b.g) a.a(com.bytedance.android.live.b.g.class)).createHybridView(context, uri);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final Fragment c(Context context, Bundle bundle) {
        return ((com.bytedance.android.live.b.f) a.a(com.bytedance.android.live.b.f.class)).createLynxFragment(context, bundle);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final Fragment a(Context context, String str) {
        return ((com.bytedance.android.live.o.a) a.a(com.bytedance.android.live.o.a.class)).getSubscribeInfoListFragment(context, str);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final Fragment a(Uri uri, Context context) {
        return ((com.bytedance.android.live.b.g) a.a(com.bytedance.android.live.b.g.class)).createPageFragment(uri, context);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final com.bytedance.android.livesdkapi.depend.model.a.a b(com.bytedance.android.livesdkapi.depend.model.a.b bVar, Bundle bundle) {
        return ((IBroadcastService) a.a(IBroadcastService.class)).createBgBroadcastFragment(bVar, bundle);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final com.bytedance.android.livesdk.watch.b a(FullDraggableContainer fullDraggableContainer, Bundle bundle) {
        return ((com.bytedance.android.livesdk.watch.d) a.a(com.bytedance.android.livesdk.watch.d.class)).createDrawerFeedFragment(fullDraggableContainer, bundle);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final com.bytedance.android.livesdkapi.depend.d.b a(Context context, ViewGroup viewGroup) {
        return ((com.bytedance.android.livesdk.p) a.a(com.bytedance.android.livesdk.p.class)).getBarrageLauncher(context, viewGroup);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final androidx.fragment.app.d a(androidx.fragment.app.e eVar, com.bytedance.android.livesdkapi.depend.d.b.b bVar, Bundle bundle, com.bytedance.android.livesdkapi.depend.d.b.d dVar) {
        return ((IWalletService) a.a(IWalletService.class)).createRechargeDialogFragment(eVar, bVar, bundle, dVar);
    }
}
