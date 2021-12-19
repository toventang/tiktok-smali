package com.bytedance.android.live.broadcast;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.d;
import com.bytedance.android.live.broadcast.api.e.a;
import com.bytedance.android.live.broadcast.bgbroadcast.BgBroadcastServiceImpl;
import com.bytedance.android.live.broadcast.c.a.f;
import com.bytedance.android.live.broadcast.c.c;
import com.bytedance.android.live.broadcast.preview.a;
import com.bytedance.android.live.broadcast.preview.ak;
import com.bytedance.android.live.broadcast.preview.d.d;
import com.bytedance.android.live.broadcast.preview.p;
import com.bytedance.android.live.broadcast.stream.d;
import com.bytedance.android.live.broadcast.widget.LinkVideo2View;
import com.bytedance.android.live.broadcast.widget.StickerTipWidget;
import com.bytedance.android.live.broadcast.widget.TaskFinishAnimationWidget;
import com.bytedance.android.live.broadcast.widget.i;
import com.bytedance.android.live.n.j;
import com.bytedance.android.livesdk.j.af;
import com.bytedance.android.livesdk.j.dj;
import com.bytedance.android.livesdk.j.dp;
import com.bytedance.android.livesdk.j.e;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdkapi.a;
import com.bytedance.android.livesdkapi.depend.model.a.h;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.avframework.livestreamv2.core.Client;
import com.ss.avframework.livestreamv2.core.LiveCore;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.f.b.l;
import java.util.Map;

public class b implements IBroadcastService {
    private static Activity currentActivity;
    private ak startLiveManager;

    static {
        Covode.recordClassIndex(3728);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public String getLiveCoreVersion() {
        return "10.6.1.9-a";
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public boolean haveNewFilter() {
        return false;
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Activity getBroadcastActivity() {
        return currentActivity;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public a createBgBroadcastBinder() {
        return new BgBroadcastServiceImpl();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public String getLiveComposerFilePath() {
        return p.INST.getLiveComposerFilePath();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public d getSubscribeEntranceHelper() {
        return new com.bytedance.android.live.broadcast.preview.d.b();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Fragment getSubscribeSettingFragment() {
        return d.a.a("creator_tools_page");
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void init() {
        m.a().b();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void showEndPageForPaidEvent() {
        DataChannelGlobal.f34575d.d(dp.class);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Map<String, String> getRoomInfo() {
        return (Map) DataChannelGlobal.f34575d.b(dj.class);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public t<Integer> loadShortVideoRes() {
        m.a();
        return t.b((Object) 1);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public h startLiveManager() {
        if (this.startLiveManager == null) {
            this.startLiveManager = new ak();
        }
        return this.startLiveManager;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public com.bytedance.android.live.broadcast.api.b.a stickerPresenter() {
        return c.a().b();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void setBroadcastActivity(Activity activity) {
        currentActivity = activity;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public com.bytedance.android.livesdkapi.depend.model.a convertStickerBean(Effect effect) {
        return f.a(effect);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void setApplyLivePermission(com.bytedance.android.livesdkapi.l.a aVar) {
        DataChannelGlobal.f34575d.a(e.class, aVar);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void setDetailLivePermission(com.bytedance.android.livesdkapi.l.b bVar) {
        DataChannelGlobal.f34575d.a(af.class, bVar);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public j createLiveBroadcastEndFragment(Bundle bundle) {
        com.bytedance.android.livesdk.chatroom.end.f fVar = new com.bytedance.android.livesdk.chatroom.end.f();
        fVar.setArguments(bundle);
        return fVar;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public <T> Class<T> getWidgetClass(int i2) {
        if (i2 == 1) {
            return StickerTipWidget.class;
        }
        if (i2 != 2) {
            return null;
        }
        return TaskFinishAnimationWidget.class;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public com.bytedance.android.livesdkapi.depend.model.a.f createStartLiveFragment(com.bytedance.android.livesdkapi.j.a aVar) {
        com.bytedance.android.live.broadcast.preview.b bVar = (com.bytedance.android.live.broadcast.preview.b) com.bytedance.android.live.broadcast.preview.b.f8114a.getValue();
        if (bVar == null) {
            return null;
        }
        com.bytedance.android.live.broadcast.g.b.f7876a = aVar;
        return bVar.a();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void onLiveTabShow(Context context) {
        l.d(context, "");
        com.bytedance.android.b.a(context);
        com.bytedance.android.live.u.h.a();
        if (com.bytedance.android.live.u.h.f12829a) {
            com.bytedance.android.live.u.h.b(a.RunnableC0117a.f8094a);
            com.bytedance.android.b.a((int) R.layout.b9g);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public com.bytedance.android.live.broadcast.api.e.c createCoverController(Fragment fragment, Room room) {
        return new i(fragment, room);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public com.bytedance.android.livesdk.chatroom.interact.a createLinkVideoView(Context context, a.C0103a aVar) {
        return new LinkVideo2View(context, aVar);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public com.bytedance.android.livesdkapi.depend.model.a.a createBgBroadcastFragment(com.bytedance.android.livesdkapi.depend.model.a.b bVar, Bundle bundle) {
        com.bytedance.android.live.broadcast.bgbroadcast.c cVar = new com.bytedance.android.live.broadcast.bgbroadcast.c();
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("extra", bundle);
        cVar.setArguments(bundle2);
        cVar.f7741a = bVar;
        return cVar;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Client createGuestClient(Context context, LiveCore.InteractConfig interactConfig) {
        d.a aVar = new d.a(context);
        aVar.v = ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getProjectKey();
        aVar.E = new com.bytedance.android.live.broadcast.d.e();
        aVar.t = new com.bytedance.android.live.broadcast.d.f();
        aVar.q = 0;
        aVar.F = new com.bytedance.android.live.broadcast.d.d();
        return new com.bytedance.android.live.broadcast.stream.c(aVar.a()).a(interactConfig);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public com.bytedance.android.livesdkapi.depend.model.a.c createLiveBroadcastFragment(com.bytedance.android.livesdkapi.depend.model.a.b bVar, Bundle bundle) {
        l.d(bVar, "");
        LivePerformanceManager instance = LivePerformanceManager.getInstance();
        instance.monitorPerformance("create_live");
        instance.startTimerMonitor();
        instance.onEnterRoom();
        if (bundle != null) {
            bundle.putLong("live.intent.extra.EXTRA_ENTER_ROOM_STAR_TIME", System.currentTimeMillis());
        }
        o oVar = new o();
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("extra", bundle);
        oVar.setArguments(bundle2);
        oVar.f7960d = bVar;
        return oVar;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public com.bytedance.android.live.broadcast.api.e.b createLinkInRoomView(com.bytedance.android.live.broadcast.api.d.a aVar, Context context, int i2) {
        if (i2 == 1) {
            return new com.bytedance.android.live.broadcast.widget.a(context);
        }
        if (i2 == 0) {
            return new com.bytedance.android.live.broadcast.widget.b(aVar, context);
        }
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void showGuideBirthdayEditDialog(Activity activity, String str, String str2, IBroadcastService.a aVar) {
        p.a(activity, str, str2, aVar);
    }
}
