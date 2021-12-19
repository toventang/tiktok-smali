package com.bytedance.android.live.broadcast.bgbroadcast;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.api.StatusApi;
import com.bytedance.android.live.broadcast.api.c.c;
import com.bytedance.android.live.broadcast.f.a;
import com.bytedance.android.live.broadcast.utils.d;
import com.bytedance.android.live.broadcast.utils.f;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.c.h;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.chatroom.c.r;
import com.bytedance.android.livesdk.chatroom.ui.Cdo;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.dj;
import com.bytedance.android.livesdk.j.dp;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftInterfaceOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.gift.LivePrefetchGiftImageSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.bv;
import com.bytedance.android.livesdk.model.message.n;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.message.IMessageService;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidgetProvider;
import com.zhiliaoapp.musically.R;
import f.a.t;
import f.a.v;
import f.a.w;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final class c extends com.bytedance.android.livesdk.ui.a implements com.bytedance.android.live.broadcast.api.d.b, f, a.AbstractC0113a, com.bytedance.android.livesdkapi.depend.model.a.a, com.bytedance.ies.sdk.datachannel.e {

    /* renamed from: f  reason: collision with root package name */
    public static final a f7740f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.android.livesdkapi.depend.model.a.b f7741a;

    /* renamed from: b  reason: collision with root package name */
    public f.a.b.b f7742b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.livesdkapi.a f7743c;

    /* renamed from: d  reason: collision with root package name */
    public b f7744d;

    /* renamed from: e  reason: collision with root package name */
    public com.bytedance.android.live.broadcast.f.a f7745e;

    /* renamed from: g  reason: collision with root package name */
    private String f7746g;

    /* renamed from: h  reason: collision with root package name */
    private CharSequence f7747h;

    /* renamed from: i  reason: collision with root package name */
    private CharSequence f7748i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f7749j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f7750k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f7751l;

    /* renamed from: m  reason: collision with root package name */
    private DataChannel f7752m;
    private boolean n;
    private boolean o;
    private boolean p = true;
    private final ServiceConnection q = new b(this);
    private final com.bytedance.android.livesdk.gift.e.b r = new C0110c(this);
    private Room s;
    private com.bytedance.android.live.n.i t;
    private Cdo u;
    private com.bytedance.android.live.broadcast.b.f v;
    private HashMap w;

    /* access modifiers changed from: package-private */
    public static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final l f7761a = new l();

        static {
            Covode.recordClassIndex(3831);
        }

        l() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(3818);
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void beforeLiveCoreStartStream() {
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void connected() {
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void onCaptureFirstFrame() {
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void onFirstRTMPConnect() {
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void onInfo(float f2) {
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void onNetworkLow() {
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void onNetworkStatus(int i2) {
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void onReconnect() {
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void onReconnected() {
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void onStreamStart() {
        this.p = false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(3819);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.f, com.bytedance.android.livesdkapi.depend.model.a.a
    public final Fragment c() {
        return this;
    }

    @Override // com.bytedance.android.live.broadcast.f.a.AbstractC0113a
    public final void a(boolean z, String str) {
        if (!this.mStatusDestroyed) {
            k().a(z, str);
        }
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.f
    public final void f() {
        com.bytedance.android.livesdkapi.a aVar = this.f7743c;
        if (aVar != null) {
            aVar.startBgActivity();
        }
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.f
    public final /* synthetic */ Activity i() {
        return getActivity();
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.f, com.bytedance.android.livesdk.ui.a
    public final boolean isViewValid() {
        if (!this.mStatusDestroyed) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class e extends h.f.b.j implements h.f.a.a<z> {
        static {
            Covode.recordClassIndex(3824);
        }

        e(c cVar) {
            super(0, cVar, c.class, "onFinishBroadcastCancelClick", "onFinishBroadcastCancelClick()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ((c) this.receiver).e();
            return z.f158842a;
        }
    }

    static final class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f7760a;

        static {
            Covode.recordClassIndex(3830);
        }

        k(c cVar) {
            this.f7760a = cVar;
        }

        public final void run() {
            if (!this.f7760a.mStatusDestroyed) {
                c.a(this.f7760a).h();
            }
        }
    }

    private final long r() {
        Room room = this.s;
        if (room == null) {
            h.f.b.l.a("mRoom");
        }
        return room.getId();
    }

    @Override // com.bytedance.ies.sdk.datachannel.e
    public final DataChannel h() {
        DataChannel dataChannel = this.f7752m;
        if (dataChannel == null) {
            h.f.b.l.a("dataChannel");
        }
        return dataChannel;
    }

    @Override // com.bytedance.android.live.broadcast.f.a.AbstractC0113a
    public final void n() {
        ao.a(getContext(), (int) R.string.gue);
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.w;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static final class o implements Cdo.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Cdo f7766a;

        static {
            Covode.recordClassIndex(3834);
        }

        o(Cdo doVar) {
            this.f7766a = doVar;
        }

        @Override // com.bytedance.android.livesdk.chatroom.ui.Cdo.a
        public final void a() {
            ao.a(this.f7766a.getContext(), y.a((int) R.string.gsq), 0);
        }
    }

    static final class p implements Cdo.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Cdo f7767a;

        static {
            Covode.recordClassIndex(3835);
        }

        p(Cdo doVar) {
            this.f7767a = doVar;
        }

        @Override // com.bytedance.android.livesdk.chatroom.ui.Cdo.b
        public final void a() {
            ao.a(this.f7767a.getContext(), y.a((int) R.string.gsq), 0);
        }
    }

    private final void j() {
        if (this.o) {
            com.bytedance.android.livesdkapi.a aVar = this.f7743c;
            if (aVar != null) {
                aVar.setLiveStatusListener(null);
            }
            androidx.fragment.app.e activity = getActivity();
            if (activity != null) {
                activity.unbindService(this.q);
            }
            this.o = false;
        }
    }

    private final Cdo k() {
        Cdo doVar = this.u;
        if (doVar != null) {
            return doVar;
        }
        Cdo a2 = Cdo.a(getActivity());
        h.f.b.l.b(a2, "");
        return a2;
    }

    private static long q() {
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        if (b2 != null) {
            return b2.c();
        }
        return 0;
    }

    @Override // com.bytedance.android.live.broadcast.f.a.AbstractC0113a
    public final void l() {
        if (!this.mStatusDestroyed) {
            Cdo k2 = k();
            new q(this);
            k2.a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (!this.f7751l) {
            j();
            c.a.a("ttlive_page_stop").b("pc_broadcast").a();
        }
    }

    private final void p() {
        Intent intent;
        try {
            j();
            com.bytedance.android.livesdkapi.a aVar = this.f7743c;
            if (aVar != null) {
                aVar.stopService();
            }
            if (this.f7750k) {
                androidx.fragment.app.e activity = getActivity();
                if (activity != null) {
                    Context context = getContext();
                    if (context != null) {
                        h.f.b.l.b(context, "");
                        intent = a(context);
                    } else {
                        intent = null;
                    }
                    activity.stopService(intent);
                }
                this.f7750k = false;
            }
        } catch (Throwable th) {
            com.bytedance.android.live.core.c.a.a(6, "ALogger", th.getMessage());
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.a.a
    public final void a() {
        try {
            com.bytedance.android.livesdk.s.b b2 = com.bytedance.android.livesdk.s.j.b("control_view");
            if (b2 != null) {
                b2.a();
            }
        } catch (Throwable th) {
            com.bytedance.android.live.core.c.a.a(6, "ALogger", th.getMessage());
        }
        try {
            com.bytedance.android.livesdk.s.b b3 = com.bytedance.android.livesdk.s.j.b("msg_view");
            if (b3 != null) {
                b3.a();
            }
        } catch (Throwable th2) {
            com.bytedance.android.live.core.c.a.a(6, "ALogger", th2.getMessage());
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.a.a
    public final boolean b() {
        androidx.fragment.app.i childFragmentManager = getChildFragmentManager();
        h.f.b.l.b(childFragmentManager, "");
        List<Fragment> f2 = childFragmentManager.f();
        h.f.b.l.b(f2, "");
        for (T t2 : f2) {
            if ((t2 instanceof com.bytedance.android.livesdkapi.depend.a.a) && t2 != null) {
                Objects.requireNonNull(t2, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.chat.OnBackPressedListener");
                if (t2.i_()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void e() {
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("anchor_close_live_cancel");
        DataChannel dataChannel = this.f7752m;
        if (dataChannel == null) {
            h.f.b.l.a("dataChannel");
        }
        com.bytedance.android.livesdk.ab.b a3 = a2.a(dataChannel);
        Room room = this.s;
        if (room == null) {
            h.f.b.l.a("mRoom");
        }
        com.bytedance.android.livesdkapi.depend.model.live.i streamType = room.getStreamType();
        h.f.b.l.b(streamType, "");
        a3.a("live_type", com.bytedance.android.livesdkapi.depend.model.live.j.a(streamType)).b();
        com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.ae;
        h.f.b.l.b(bVar, "");
        com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar, (Object) false);
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.f
    public final void g() {
        com.bytedance.android.livesdkapi.a aVar = this.f7743c;
        if (aVar != null) {
            aVar.startStream(false, PrivacyCert.Builder.Companion.with("bpea-575").usage("").tag("start video/audio capture when live starts").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
    }

    @Override // com.bytedance.android.live.broadcast.f.a.AbstractC0113a
    public final void m() {
        if (!this.mStatusDestroyed && getActivity() != null) {
            com.bytedance.android.live.broadcast.b.f fVar = this.v;
            if (fVar == null) {
                fVar = com.bytedance.android.live.broadcast.b.f.a(getContext(), this.f7745e);
                com.bytedance.android.live.broadcast.f.a aVar = this.f7745e;
                if (aVar != null) {
                    aVar.f7859h = fVar;
                }
                androidx.fragment.app.i childFragmentManager = getChildFragmentManager();
                h.f.b.l.b(childFragmentManager, "");
                fVar.show(childFragmentManager, "IllegalReviewDialog");
            }
            this.v = fVar;
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (!this.f7751l) {
            b bVar = this.f7744d;
            if (bVar == null) {
                h.f.b.l.a("mStrategy");
            }
            bVar.f();
            c.a.a("ttlive_page_pause").b("pc_broadcast").a();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!this.f7751l) {
            b bVar = this.f7744d;
            if (bVar == null) {
                h.f.b.l.a("mStrategy");
            }
            bVar.e();
            c.a.a("ttlive_page_resume").b("pc_broadcast").a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        Intent intent;
        super.onStart();
        if (!this.f7751l) {
            if (!this.n && !this.o) {
                androidx.fragment.app.e activity = getActivity();
                if (activity != null) {
                    Context context = getContext();
                    if (context != null) {
                        h.f.b.l.b(context, "");
                        intent = a(context);
                    } else {
                        intent = null;
                    }
                    activity.bindService(intent, this.q, 1);
                }
                this.o = true;
            }
            c.a.a("ttlive_page_start").b("pc_broadcast").a();
        }
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.f
    public final void d() {
        if (!this.mStatusDestroyed) {
            Room room = this.s;
            if (room == null) {
                h.f.b.l.a("mRoom");
            }
            DataChannel dataChannel = this.f7752m;
            if (dataChannel == null) {
                h.f.b.l.a("dataChannel");
            }
            f.a.a(room, dataChannel);
            ((com.bytedance.android.live.publicscreen.a.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.publicscreen.a.e.class)).clearMockChatMessage();
            this.n = true;
            androidx.fragment.app.e activity = getActivity();
            if (activity != null) {
                activity.setRequestedOrientation(1);
            }
            Bundle bundle = new Bundle();
            b bVar = this.f7744d;
            if (bVar == null) {
                h.f.b.l.a("mStrategy");
            }
            bVar.a(bundle);
            LiveWidgetProvider.Companion.getInstance().clear();
            com.bytedance.android.livesdkapi.depend.model.a.b bVar2 = this.f7741a;
            if (bVar2 != null) {
                bVar2.a(bundle);
            }
            b bVar3 = this.f7744d;
            if (bVar3 == null) {
                h.f.b.l.a("mStrategy");
            }
            bVar3.i();
            p();
            a();
        }
    }

    @Override // com.bytedance.android.live.broadcast.f.a.AbstractC0113a
    public final void o() {
        a(8, PrivacyCert.Builder.Companion.with("bpea-580").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        p();
        com.bytedance.android.live.core.c.a.a(3, "BgBroadcastFragment", "room close forceEndLive");
        d();
        com.bytedance.android.live.broadcast.d.b.b(10004, q(), r(), this.p);
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        DataChannelGlobal.f34575d.c(dj.class);
        DataChannel dataChannel = this.f7752m;
        if (dataChannel == null) {
            h.f.b.l.a("dataChannel");
        }
        dataChannel.b(this);
        com.bytedance.android.live.broadcast.f.a aVar = this.f7745e;
        if (aVar != null) {
            aVar.b();
        }
        Cdo doVar = this.u;
        if (doVar != null) {
            com.bytedance.android.livesdk.utils.p.b(doVar);
        }
        p();
        this.mStatusDestroyed = true;
        f.a.b.b bVar = this.f7742b;
        if (bVar != null) {
            bVar.dispose();
        }
        com.bytedance.android.live.u.f.c();
        super.onDestroy();
        if (!this.f7751l) {
            a(1, PrivacyCert.Builder.Companion.with("bpea-578").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            IMessageService iMessageService = (IMessageService) com.bytedance.android.live.t.a.a(IMessageService.class);
            Room room = this.s;
            if (room == null) {
                h.f.b.l.a("mRoom");
            }
            iMessageService.release(room.getId());
            Room room2 = this.s;
            if (room2 == null) {
                h.f.b.l.a("mRoom");
            }
            room2.getId();
            b.a.a("BgBroadcastFragment_OnDestroy");
            b bVar2 = this.f7744d;
            if (bVar2 == null) {
                h.f.b.l.a("mStrategy");
            }
            bVar2.g();
            c.a.a("ttlive_page_destroy").b("pc_broadcast").a();
        }
    }

    public static final class b implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f7753a;

        static {
            Covode.recordClassIndex(3820);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(c cVar) {
            this.f7753a = cVar;
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            h.f.b.l.d(componentName, "");
            this.f7753a.f7743c = null;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            h.f.b.l.d(componentName, "");
            h.f.b.l.d(iBinder, "");
            this.f7753a.f7743c = (com.bytedance.android.livesdkapi.a) iBinder;
            b a2 = c.a(this.f7753a);
            com.bytedance.android.livesdkapi.a aVar = this.f7753a.f7743c;
            if (aVar == null) {
                h.f.b.l.b();
            }
            a2.a(aVar);
            if (this.f7753a.f7743c instanceof BgBroadcastServiceImpl) {
                com.bytedance.android.livesdkapi.a aVar2 = this.f7753a.f7743c;
                Objects.requireNonNull(aVar2, "null cannot be cast to non-null type com.bytedance.android.live.broadcast.bgbroadcast.BgBroadcastServiceImpl");
                ((BgBroadcastServiceImpl) aVar2).setLiveStreamCallback(this.f7753a);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.c$c  reason: collision with other inner class name */
    public static final class C0110c extends com.bytedance.android.livesdk.gift.e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f7754a;

        static {
            Covode.recordClassIndex(3821);
        }

        @Override // com.bytedance.android.livesdk.gift.e.b
        public final void a(List<? extends com.bytedance.android.livesdk.model.u> list) {
            h.f.b.l.d(list, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C0110c(c cVar) {
            this.f7754a = cVar;
        }

        @Override // com.bytedance.android.livesdk.gift.e.b
        public final void b(List<? extends GiftPage> list) {
            h.f.b.l.d(list, "");
            this.f7754a.f7742b = t.a(new a(list)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).g();
        }

        /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.c$c$a */
        static final class a<T> implements w {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List f7755a;

            static {
                Covode.recordClassIndex(3822);
            }

            a(List list) {
                this.f7755a = list;
            }

            @Override // f.a.w
            public final void subscribe(v<Object> vVar) {
                ImageModel imageModel;
                if (LivePrefetchGiftImageSetting.INSTANCE.getValue()) {
                    List<T> list = this.f7755a;
                    ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list, 10));
                    for (T t : list) {
                        arrayList.add(t.gifts);
                    }
                    for (T t2 : h.a.n.b((Iterable) arrayList)) {
                        if (t2 != null) {
                            imageModel = t2.f19759b;
                        } else {
                            imageModel = null;
                        }
                        com.bytedance.android.live.core.f.k.a(imageModel);
                    }
                }
            }
        }
    }

    public static final class j extends com.bytedance.android.live.n.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f7759a;

        static {
            Covode.recordClassIndex(3829);
        }

        j(c cVar) {
            this.f7759a = cVar;
        }

        @Override // com.bytedance.android.live.n.u
        public final void a(bv bvVar) {
            h.f.b.l.d(bvVar, "");
            com.bytedance.android.live.broadcast.f.a aVar = this.f7759a.f7745e;
            if (aVar != null) {
                aVar.a(bvVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final m f7762a = new m();

        static {
            Covode.recordClassIndex(3832);
        }

        m() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.core.c.a.a("BgBroadcastFragment", (Throwable) obj);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<z, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(3827);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            h.f.b.l.d(zVar, "");
            this.this$0.d();
            return z.f158842a;
        }
    }

    static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f7758a;

        static {
            Covode.recordClassIndex(3828);
        }

        i(c cVar) {
            this.f7758a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            r rVar = (r) obj;
            c cVar = this.f7758a;
            h.f.b.l.b(rVar, "");
            cVar.onEvent(rVar);
        }
    }

    static final class n implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Cdo f7763a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f7764b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f7765c;

        static {
            Covode.recordClassIndex(3833);
        }

        n(Cdo doVar, c cVar, boolean z) {
            this.f7763a = doVar;
            this.f7764b = cVar;
            this.f7765c = z;
        }

        public final void onClick(View view) {
            com.bytedance.android.live.broadcast.f.a aVar = this.f7764b.f7745e;
            if (aVar != null) {
                aVar.a();
                this.f7763a.dismiss();
            }
        }
    }

    public static final /* synthetic */ b a(c cVar) {
        b bVar = cVar.f7744d;
        if (bVar == null) {
            h.f.b.l.a("mStrategy");
        }
        return bVar;
    }

    @Override // com.bytedance.android.live.broadcast.f.a.AbstractC0113a
    public final void b(CharSequence charSequence) {
        if (!this.mStatusDestroyed) {
            k().b(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class d extends h.f.b.j implements h.f.a.b<PrivacyCert, z> {
        static {
            Covode.recordClassIndex(3823);
        }

        d(c cVar) {
            super(1, cVar, c.class, "onFinishBroadcastConfirmClick", "onFinishBroadcastConfirmClick(Lcom/bytedance/bpea/basics/PrivacyCert;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(PrivacyCert privacyCert) {
            PrivacyCert privacyCert2 = privacyCert;
            h.f.b.l.d(privacyCert2, "");
            ((c) this.receiver).a(privacyCert2);
            return z.f158842a;
        }
    }

    static final class q implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f7768a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f7769b = null;

        static {
            Covode.recordClassIndex(3836);
        }

        q(c cVar) {
            this.f7768a = cVar;
        }

        public final void onClick(View view) {
            com.bytedance.android.livesdk.browser.c.d webViewManager = ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).webViewManager();
            Context context = this.f7768a.getContext();
            d.a b2 = com.bytedance.android.livesdk.browser.c.e.b(this.f7769b);
            b2.f14292c = true;
            webViewManager.a(context, b2);
        }
    }

    private static Intent a(Context context) {
        Intent intent = new Intent();
        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IHostApp.class);
        h.f.b.l.b(a2, "");
        intent.setComponent(new ComponentName(context, ((IHostApp) a2).getBgBroadcastServiceName()));
        return intent;
    }

    private final void b(boolean z) {
        String str;
        if (z && !com.bytedance.common.utility.m.a(this.f7746g)) {
            com.bytedance.android.livesdk.browser.c.d webViewManager = ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).webViewManager();
            Context context = getContext();
            d.a b2 = com.bytedance.android.livesdk.browser.c.e.b(this.f7746g);
            b2.f14292c = true;
            b2.f14291b = y.a((int) R.string.gl9);
            webViewManager.a(context, b2);
        }
        StringBuilder sb = new StringBuilder("room close onLiveEnd endByBanned:");
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        com.bytedance.android.live.core.c.a.a(3, "BgBroadcastFragment", sb.append(str).toString());
        d();
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.f
    public final void a(com.bytedance.android.live.n.i iVar) {
        Bundle bundle;
        h.f.b.l.d(iVar, "");
        if (!this.mStatusDestroyed && getChildFragmentManager().a("AbsInteractionFragment") == null) {
            DataChannel dataChannel = this.f7752m;
            if (dataChannel == null) {
                h.f.b.l.a("dataChannel");
            }
            Room room = this.s;
            if (room == null) {
                h.f.b.l.a("mRoom");
            }
            dataChannel.b(df.class, room);
            this.t = iVar;
            Fragment b2 = iVar.b();
            Bundle arguments = getArguments();
            if (arguments != null) {
                bundle = arguments.getBundle("extra");
            } else {
                bundle = null;
            }
            b2.setArguments(bundle);
            DataChannel dataChannel2 = this.f7752m;
            if (dataChannel2 == null) {
                h.f.b.l.a("dataChannel");
            }
            iVar.a(dataChannel2, new j(this));
            getChildFragmentManager().a().a(R.id.bqk, iVar.b(), "AbsInteractionFragment").c();
            iVar.a(new k(this));
            LivePerformanceManager.getInstance().setIsAnchor(true);
        }
    }

    public final void a(PrivacyCert privacyCert) {
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("anchor_close_live_confirm");
        DataChannel dataChannel = this.f7752m;
        if (dataChannel == null) {
            h.f.b.l.a("dataChannel");
        }
        com.bytedance.android.livesdk.ab.b a3 = a2.a(dataChannel);
        Room room = this.s;
        if (room == null) {
            h.f.b.l.a("mRoom");
        }
        com.bytedance.android.livesdkapi.depend.model.live.i streamType = room.getStreamType();
        h.f.b.l.b(streamType, "");
        a3.a("live_type", com.bytedance.android.livesdkapi.depend.model.live.j.a(streamType)).b();
        com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.ae;
        h.f.b.l.b(bVar, "");
        com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar, (Object) true);
        com.bytedance.android.live.broadcast.d.b.b(10001, q(), r(), this.p);
        a(1, privacyCert);
        d();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Boolean bool;
        Window window;
        com.bytedance.android.livesdk.util.b.a(getActivity());
        super.onActivityCreated(bundle);
        if (!this.f7751l) {
            com.bytedance.android.live.u.f.a();
            com.bytedance.android.live.u.f.b();
            androidx.fragment.app.e activity = getActivity();
            if (!(activity == null || (window = activity.getWindow()) == null)) {
                window.setSoftInputMode(50);
            }
            Room room = this.s;
            if (room == null) {
                h.f.b.l.a("mRoom");
            }
            if (Room.isValid(room)) {
                Room room2 = this.s;
                if (room2 == null) {
                    h.f.b.l.a("mRoom");
                }
                if (room2.isPullUrlValid()) {
                    Room room3 = this.s;
                    if (room3 == null) {
                        h.f.b.l.a("mRoom");
                    }
                    long id = room3.getId();
                    DataChannel dataChannel = this.f7752m;
                    if (dataChannel == null) {
                        h.f.b.l.a("dataChannel");
                    }
                    b.a.a(id, dataChannel, "BgBroadcastFragment_OnActivityCreated");
                    androidx.fragment.app.i childFragmentManager = getChildFragmentManager();
                    h.f.b.l.b(childFragmentManager, "");
                    Fragment a2 = childFragmentManager.a("AbsInteractionFragment");
                    if (a2 != null) {
                        try {
                            childFragmentManager.a().a(a2).e();
                        } catch (Exception e2) {
                            com.bytedance.android.livesdk.ab.i.b();
                            com.bytedance.android.live.core.c.a.a(6, "ttlive_exception", e2.getStackTrace());
                        }
                    }
                    Room room4 = this.s;
                    if (room4 == null) {
                        h.f.b.l.a("mRoom");
                    }
                    long id2 = room4.getId();
                    getContext();
                    com.bytedance.android.live.broadcast.f.a aVar = new com.bytedance.android.live.broadcast.f.a(id2);
                    this.f7745e = aVar;
                    aVar.a(this);
                    this.f7750k = true;
                    ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).resetRoomStatus();
                    Intent intent = null;
                    if (!LiveGiftInterfaceOptimizeSetting.INSTANCE.getValue()) {
                        com.bytedance.android.live.base.a a3 = com.bytedance.android.live.t.a.a(IGiftService.class);
                        h.f.b.l.b(a3, "");
                        com.bytedance.android.livesdk.gift.a.b firstRechargeManager = ((IGiftService) a3).getFirstRechargeManager();
                        Room room5 = this.s;
                        if (room5 == null) {
                            h.f.b.l.a("mRoom");
                        }
                        long id3 = room5.getId();
                        Room room6 = this.s;
                        if (room6 == null) {
                            h.f.b.l.a("mRoom");
                        }
                        firstRechargeManager.a(id3, room6.getOwnerUserId());
                        IGiftService iGiftService = (IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class);
                        com.bytedance.android.livesdk.gift.e.b bVar = this.r;
                        Room room7 = this.s;
                        if (room7 == null) {
                            h.f.b.l.a("mRoom");
                        }
                        iGiftService.syncGiftList(bVar, room7.getId(), 2, true);
                    } else {
                        Room room8 = this.s;
                        if (room8 == null) {
                            h.f.b.l.a("mRoom");
                        }
                        RoomAuthStatus roomAuthStatus = room8.getRoomAuthStatus();
                        if (roomAuthStatus != null) {
                            bool = Boolean.valueOf(roomAuthStatus.enableGift);
                        } else {
                            bool = null;
                        }
                        if (com.bytedance.android.livesdk.utils.p.a(bool)) {
                            com.bytedance.android.live.base.a a4 = com.bytedance.android.live.t.a.a(IGiftService.class);
                            h.f.b.l.b(a4, "");
                            com.bytedance.android.livesdk.gift.a.b firstRechargeManager2 = ((IGiftService) a4).getFirstRechargeManager();
                            Room room9 = this.s;
                            if (room9 == null) {
                                h.f.b.l.a("mRoom");
                            }
                            long id4 = room9.getId();
                            Room room10 = this.s;
                            if (room10 == null) {
                                h.f.b.l.a("mRoom");
                            }
                            firstRechargeManager2.a(id4, room10.getOwnerUserId());
                            IGiftService iGiftService2 = (IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class);
                            Room room11 = this.s;
                            if (room11 == null) {
                                h.f.b.l.a("mRoom");
                            }
                            iGiftService2.clearFastGift(room11.getId());
                            IGiftService iGiftService3 = (IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class);
                            com.bytedance.android.livesdk.gift.e.b bVar2 = this.r;
                            Room room12 = this.s;
                            if (room12 == null) {
                                h.f.b.l.a("mRoom");
                            }
                            iGiftService3.syncGiftList(bVar2, room12.getId(), 2, true);
                        }
                    }
                    com.bytedance.android.live.broadcast.api.c.a.a("live_page_load", String.valueOf(System.currentTimeMillis()));
                    b bVar3 = this.f7744d;
                    if (bVar3 == null) {
                        h.f.b.l.a("mStrategy");
                    }
                    bVar3.c();
                    if (Build.VERSION.SDK_INT >= 26) {
                        androidx.fragment.app.e activity2 = getActivity();
                        if (activity2 != null) {
                            Context context = getContext();
                            if (context != null) {
                                h.f.b.l.b(context, "");
                                intent = a(context);
                            }
                            activity2.startForegroundService(intent);
                            return;
                        }
                        return;
                    }
                    androidx.fragment.app.e activity3 = getActivity();
                    if (activity3 != null) {
                        Context context2 = getContext();
                        if (context2 != null) {
                            h.f.b.l.b(context2, "");
                            intent = a(context2);
                        }
                        activity3.startService(intent);
                        return;
                    }
                    return;
                }
            }
            androidx.fragment.app.e activity4 = getActivity();
            if (activity4 != null) {
                activity4.finish();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        b bVar;
        DataChannelGlobal.f34575d.a(this, this, dp.class, new h(this));
        com.bytedance.android.livesdk.ab.m.f13604j = true;
        if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        ad a2 = ae.a(this, (ad.b) null);
        h.f.b.l.b(a2, "");
        this.f7752m = DataChannel.a.a(a2, this).a(com.bytedance.android.livesdk.j.ao.class, getChildFragmentManager());
        super.onCreate(bundle);
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (!Room.isValid(room) || room == null || room.getStreamUrl() == null) {
            this.f7751l = true;
            androidx.fragment.app.e activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        this.s = room;
        if (room == null) {
            h.f.b.l.a("mRoom");
        }
        if (room.isScreenshot) {
            Room room2 = this.s;
            if (room2 == null) {
                h.f.b.l.a("mRoom");
            }
            DataChannel dataChannel = this.f7752m;
            if (dataChannel == null) {
                h.f.b.l.a("dataChannel");
            }
            bVar = new com.bytedance.android.live.broadcast.bgbroadcast.a.j(room2, this, dataChannel);
        } else {
            Room room3 = this.s;
            if (room3 == null) {
                h.f.b.l.a("mRoom");
            }
            DataChannel dataChannel2 = this.f7752m;
            if (dataChannel2 == null) {
                h.f.b.l.a("dataChannel");
            }
            bVar = new com.bytedance.android.live.broadcast.bgbroadcast.b.b(room3, this, dataChannel2);
        }
        this.f7744d = bVar;
        bVar.a();
        h.a aVar = new h.a();
        Room room4 = this.s;
        if (room4 == null) {
            h.f.b.l.a("mRoom");
        }
        aVar.f13533b = room4;
        aVar.f13532a = "live_take_detail";
        com.bytedance.android.livesdk.ab.c.h a3 = aVar.a();
        DataChannelGlobal.f34575d.a(com.bytedance.android.livesdk.ab.c.j.class, a3);
        DataChannel dataChannel3 = this.f7752m;
        if (dataChannel3 == null) {
            h.f.b.l.a("dataChannel");
        }
        dataChannel3.a(com.bytedance.android.livesdk.ab.c.i.class, a3);
        com.bytedance.android.livesdk.util.b.a(getActivity());
        ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) com.bytedance.android.livesdk.an.a.a().a(r.class).a(com.bytedance.android.livesdk.util.rxutils.i.a(this, com.bytedance.android.livesdk.util.rxutils.b.b.DESTROY)).a(com.bytedance.android.livesdk.util.rxutils.autodispose.e.a((Fragment) this))).a(new i(this));
        com.bytedance.android.livesdk.ab.a a4 = c.a.a("ttlive_enter_obs_broadcast_all");
        a4.f13426c = true;
        a4.a();
        HashMap hashMap = new HashMap();
        Room room5 = this.s;
        if (room5 == null) {
            h.f.b.l.a("mRoom");
        }
        hashMap.put("anchor_id", String.valueOf(room5.getOwnerUserId()));
        Room room6 = this.s;
        if (room6 == null) {
            h.f.b.l.a("mRoom");
        }
        hashMap.put("room_id", String.valueOf(room6.getId()));
        DataChannelGlobal.f34575d.a(dj.class, hashMap);
        DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.j.w.class, Long.valueOf(System.currentTimeMillis()));
    }

    public final void onEvent(r rVar) {
        String str;
        int intValue;
        h.f.b.l.d(rVar, "");
        int i2 = rVar.f15142a;
        if (i2 != 6) {
            if (i2 == 7) {
                com.bytedance.android.livesdk.ac.b.a aVar = rVar.f15145d;
                if (aVar instanceof com.bytedance.android.livesdk.model.message.n) {
                    com.bytedance.android.livesdk.model.message.n nVar = (com.bytedance.android.livesdk.model.message.n) aVar;
                    if (nVar.f19656a == 4) {
                        n.a aVar2 = nVar.f19658g;
                        if (aVar2 != null) {
                            this.f7746g = aVar2.f19659a;
                            this.f7747h = com.bytedance.android.livesdk.chatroom.f.c.a(aVar2.f19661c, "");
                            this.f7748i = com.bytedance.android.livesdk.chatroom.f.c.a(aVar2.f19662d, "");
                            this.f7749j = com.bytedance.android.livesdk.chatroom.f.c.a(aVar2.f19663e, "");
                        }
                        b(true);
                        com.bytedance.android.live.broadcast.d.b.b(10003, q(), r(), this.p);
                        a(1, PrivacyCert.Builder.Companion.with("bpea-579").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                        com.bytedance.android.live.core.c.a.a(3, "BgBroadcastFragment", "room close LiveEvent.ACTION_SHOW_LIVE_END_DIALOG");
                        return;
                    }
                }
                b(false);
                com.bytedance.android.live.broadcast.d.b.b(rVar.f15143b, q(), r(), this.p);
                a(1, PrivacyCert.Builder.Companion.with("bpea-579").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                com.bytedance.android.live.core.c.a.a(3, "BgBroadcastFragment", "room close LiveEvent.ACTION_SHOW_LIVE_END_DIALOG");
                return;
            } else if (i2 != 8) {
                if (i2 == 17) {
                    a(PrivacyCert.Builder.Companion.with("bpea-802").usage("").tag("bg broadacst close live immediately").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                    return;
                }
                return;
            }
        }
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("anchor_close_live_popup");
        DataChannel dataChannel = this.f7752m;
        if (dataChannel == null) {
            h.f.b.l.a("dataChannel");
        }
        a2.a(dataChannel).a("live_type", com.bytedance.android.livesdkapi.depend.model.live.j.a(com.bytedance.android.livesdkapi.depend.model.live.i.THIRD_PARTY)).b();
        if (getContext() != null) {
            Context context = getContext();
            if (context == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(context, "");
            DataChannel dataChannel2 = this.f7752m;
            if (dataChannel2 == null) {
                h.f.b.l.a("dataChannel");
            }
            if (!com.bytedance.android.live.broadcast.utils.e.a(context, dataChannel2, new d(this), new e(this))) {
                DataChannel dataChannel3 = this.f7752m;
                if (dataChannel3 == null) {
                    h.f.b.l.a("dataChannel");
                }
                Integer num = (Integer) dataChannel3.b(com.bytedance.android.livesdk.rank.api.e.class);
                if (num == null || (intValue = num.intValue()) <= 0) {
                    str = y.a((int) R.string.dwa);
                } else {
                    str = getResources().getQuantityString(R.plurals.fg, intValue, Integer.valueOf(intValue));
                }
                b.a aVar3 = new b.a(getContext());
                aVar3.f18285b = str;
                aVar3.a(R.string.dwc, (DialogInterface.OnClickListener) new f(this), false).b(R.string.dwb, (DialogInterface.OnClickListener) new g(this), false).a().show();
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.f.a.AbstractC0113a
    public final void a(CharSequence charSequence) {
        if (!this.mStatusDestroyed) {
            k().a(charSequence);
        }
    }

    @Override // com.bytedance.android.live.broadcast.f.a.AbstractC0113a
    public final void a(boolean z) {
        Cdo doVar;
        if (this.mStatusDestroyed || (doVar = this.u) == null) {
            return;
        }
        if (z) {
            doVar.setCancelable(false);
            doVar.show();
            doVar.a(new n(doVar, this, z));
            doVar.f16142a = new o(doVar);
            doVar.f16143b = new p(doVar);
            c.a.a("ttlive_illegal_dialog_show").b("pc_broadcast").a();
            return;
        }
        doVar.dismiss();
    }

    /* access modifiers changed from: package-private */
    public static final class g implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f7757a;

        static {
            Covode.recordClassIndex(3826);
        }

        g(c cVar) {
            this.f7757a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
            this.f7757a.e();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f7756a;

        static {
            Covode.recordClassIndex(3825);
        }

        f(c cVar) {
            this.f7756a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
            this.f7756a.a(PrivacyCert.Builder.Companion.with("bpea-581").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        if (!this.f7751l) {
            Room room = this.s;
            if (room == null) {
                h.f.b.l.a("mRoom");
            }
            f.a.a(room);
            b bVar = this.f7744d;
            if (bVar == null) {
                h.f.b.l.a("mStrategy");
            }
            bVar.d();
        }
    }

    private final void a(int i2, PrivacyCert privacyCert) {
        StatusApi c2 = d.a.a().c();
        Room room = this.s;
        if (room == null) {
            h.f.b.l.a("mRoom");
        }
        long id = room.getId();
        Room room2 = this.s;
        if (room2 == null) {
            h.f.b.l.a("mRoom");
        }
        c2.sendStatus(id, 4, room2.getStreamId(), i2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(l.f7761a, m.f7762a);
        com.bytedance.android.livesdkapi.a aVar = this.f7743c;
        if (aVar != null) {
            aVar.stopStream(i2, privacyCert);
        }
        com.bytedance.android.live.broadcast.f.a aVar2 = this.f7745e;
        if (aVar2 != null) {
            aVar2.c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (!this.f7751l) {
            b bVar = this.f7744d;
            if (bVar == null) {
                h.f.b.l.a("mStrategy");
            }
            bVar.a(i2, i3, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        if (this.f7751l) {
            return null;
        }
        b bVar = this.f7744d;
        if (bVar == null) {
            h.f.b.l.a("mStrategy");
        }
        return com.a.a(layoutInflater, bVar.b(), viewGroup, false);
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void onStreamEnd(int i2, int i3, String str) {
        String str2 = str;
        if (str2 == null) {
            str2 = "";
        }
        com.bytedance.android.live.broadcast.d.b.a(i2, i3, str2, q(), r(), this.p);
    }
}
