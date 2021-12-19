package com.bytedance.android.livesdk.chatroom.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.android.live.broadcast.view.LinkCrossGuestBgView;
import com.bytedance.android.live.broadcast.view.LiveCenterContainerView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.BaseLinkControlWidget;
import com.bytedance.android.live.liveinteract.api.BaseLinkWidget;
import com.bytedance.android.live.liveinteract.api.al;
import com.bytedance.android.live.liveinteract.api.t;
import com.bytedance.android.live.n.p;
import com.bytedance.android.live.p.s;
import com.bytedance.android.livesdk.chatroom.c.r;
import com.bytedance.android.livesdk.chatroom.c.v;
import com.bytedance.android.livesdk.chatroom.widget.BroadcastCountDownWidget;
import com.bytedance.android.livesdk.chatroom.widget.BroadcastFilterStyleWidget;
import com.bytedance.android.livesdk.chatroom.widget.CountDownView;
import com.bytedance.android.livesdk.chatroom.widget.LiveCenterEntranceWidget;
import com.bytedance.android.livesdk.chatroom.widget.NetSpeedMonitorWidget;
import com.bytedance.android.livesdk.j.bp;
import com.bytedance.android.livesdk.j.bq;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastLiveCenterSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnableBitrateMonitorSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkEntranceExperiment;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisableMixStreamTypeSetting;
import com.bytedance.android.livesdk.widget.GestureDetectLayout;
import com.bytedance.android.livesdkapi.depend.model.a.c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.android.widget.Widget;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.ss.android.common.util.NetworkUtils;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class dw extends al implements p, c.a, c.b {
    public AtomicBoolean n = new AtomicBoolean(false);
    public boolean o;
    public com.bytedance.android.live.broadcast.api.d.a p;
    public com.bytedance.android.livesdk.chatroom.interact.b q;
    public BaseLinkControlWidget r;
    private final i s = i.VIDEO;
    private boolean t;
    private boolean u;
    private BroadcastFilterStyleWidget v;
    private final h.h w = com.bytedance.android.livesdkapi.m.d.a(new d(this));
    private final h.h x = com.bytedance.android.livesdkapi.m.d.a(new c(this));
    private HashMap y;

    static {
        Covode.recordClassIndex(8958);
    }

    private final ao p() {
        return (ao) this.w.getValue();
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.al
    public final View b(int i2) {
        if (this.y == null) {
            this.y = new HashMap();
        }
        View view = (View) this.y.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.y.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.al
    public final void o() {
        HashMap hashMap = this.y;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, com.bytedance.android.livesdk.chatroom.ui.al, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        o();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.ui.al
    public final i h() {
        return this.s;
    }

    static final class d extends m implements h.f.a.a<ao> {
        final /* synthetic */ dw this$0;

        static {
            Covode.recordClassIndex(8962);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(dw dwVar) {
            super(0);
            this.this$0 = dwVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ao invoke() {
            return new ao(this.this$0.getContext());
        }
    }

    @Override // com.bytedance.android.live.n.p
    public final FrameLayout c() {
        return (FrameLayout) b(R.id.ead);
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.n.set(true);
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ dw f16199a;

        static {
            Covode.recordClassIndex(8959);
        }

        a(dw dwVar) {
            this.f16199a = dwVar;
        }

        public final void run() {
            if (!this.f16199a.mStatusDestroyed) {
                LinkCrossGuestBgView linkCrossGuestBgView = (LinkCrossGuestBgView) this.f16199a.b(R.id.sl);
                l.b(linkCrossGuestBgView, "");
                linkCrossGuestBgView.setVisibility(8);
            }
        }
    }

    static final class b implements CountDownView.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ dw f16200a;

        static {
            Covode.recordClassIndex(8960);
        }

        b(dw dwVar) {
            this.f16200a = dwVar;
        }

        @Override // com.bytedance.android.livesdk.chatroom.widget.CountDownView.a
        public final void a() {
            if (!this.f16200a.n.get()) {
                com.bytedance.android.livesdk.an.a.a().a(new r(3));
            } else {
                this.f16200a.o = true;
            }
        }
    }

    static final class c extends m implements h.f.a.a<ScaleGestureDetector> {
        final /* synthetic */ dw this$0;

        static {
            Covode.recordClassIndex(8961);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(dw dwVar) {
            super(0);
            this.this$0 = dwVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ScaleGestureDetector invoke() {
            return new ScaleGestureDetector(this.this$0.getContext(), new com.bytedance.android.live.broadcast.api.b(this.this$0.p, this.this$0.i()));
        }
    }

    private final void q() {
        ((LinkCrossGuestBgView) b(R.id.sl)).post(new a(this));
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.o) {
            com.bytedance.android.livesdk.an.a.a().a(new r(3));
            this.o = false;
        }
        this.n.set(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        i().c(com.bytedance.android.live.broadcast.api.h.class, Float.valueOf(0.0f));
    }

    /* access modifiers changed from: package-private */
    public static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ dw f16203a;

        static {
            Covode.recordClassIndex(8967);
        }

        h(dw dwVar) {
            this.f16203a = dwVar;
        }

        public final void run() {
            if (!this.f16203a.mStatusDestroyed) {
                LinkCrossGuestBgView linkCrossGuestBgView = (LinkCrossGuestBgView) this.f16203a.b(R.id.sl);
                l.b(linkCrossGuestBgView, "");
                com.bytedance.android.live.liveinteract.api.d linkCrossRoomWidget = ((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).linkCrossRoomWidget();
                l.b(linkCrossRoomWidget, "");
                int a2 = linkCrossRoomWidget.a();
                com.bytedance.android.live.liveinteract.api.d linkCrossRoomWidget2 = ((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).linkCrossRoomWidget();
                l.b(linkCrossRoomWidget2, "");
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, linkCrossRoomWidget2.b());
                com.bytedance.android.live.liveinteract.api.d linkCrossRoomWidget3 = ((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).linkCrossRoomWidget();
                l.b(linkCrossRoomWidget3, "");
                layoutParams.leftMargin = linkCrossRoomWidget3.a();
                com.bytedance.android.live.liveinteract.api.d linkCrossRoomWidget4 = ((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).linkCrossRoomWidget();
                l.b(linkCrossRoomWidget4, "");
                layoutParams.topMargin = linkCrossRoomWidget4.c();
                linkCrossGuestBgView.setLayoutParams(layoutParams);
                LinkCrossGuestBgView linkCrossGuestBgView2 = (LinkCrossGuestBgView) this.f16203a.b(R.id.sl);
                l.b(linkCrossGuestBgView2, "");
                linkCrossGuestBgView2.setVisibility(0);
            }
        }
    }

    @Override // com.bytedance.android.live.n.p
    public final void d() {
        BroadcastFilterStyleWidget broadcastFilterStyleWidget;
        if (isViewValid() && (broadcastFilterStyleWidget = this.v) != null) {
            com.bytedance.android.livesdkapi.e b2 = ((com.bytedance.android.livesdkapi.host.b) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdkapi.host.b.class)).b();
            if (!b2.a(com.bytedance.android.livesdk.h.b.HAS_SHOW_FILTER_GUIDE)) {
                b2.b(com.bytedance.android.livesdk.h.b.HAS_SHOW_FILTER_GUIDE);
                View view = broadcastFilterStyleWidget.f16534a;
                if (view == null) {
                    l.a("filterArrow1");
                }
                view.setVisibility(0);
                View view2 = broadcastFilterStyleWidget.f16535b;
                if (view2 == null) {
                    l.a("filterArrow2");
                }
                view2.setVisibility(0);
                LiveTextView liveTextView = broadcastFilterStyleWidget.f16537d;
                if (liveTextView == null) {
                    l.a("filterStyleText");
                }
                liveTextView.setText(y.a((int) R.string.gyz));
                View view3 = broadcastFilterStyleWidget.f16536c;
                if (view3 == null) {
                    l.a("filterStyle");
                }
                view3.setClickable(true);
                view3.setVisibility(0);
                view3.setOnClickListener(new BroadcastFilterStyleWidget.c(view3, broadcastFilterStyleWidget));
                return;
            }
            View view4 = broadcastFilterStyleWidget.f16536c;
            if (view4 == null) {
                l.a("filterStyle");
            }
            view4.setVisibility(8);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.al
    public final Object[] k() {
        ArrayList d2;
        Object[] objArr = new Object[2];
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.bytedance.android.live.p.l.SLOT);
        if (com.bytedance.android.live.m.c.a(i())) {
            arrayList.add(com.bytedance.android.live.p.l.QUESTION);
        }
        if (!s.a((Room) i().b(df.class))) {
            arrayList.add(com.bytedance.android.live.p.l.SHARE);
        }
        arrayList.add(com.bytedance.android.live.p.l.EFFECT);
        arrayList.add(com.bytedance.android.live.p.l.CLOSE_ROOM);
        arrayList.add(com.bytedance.android.live.p.l.MORE);
        objArr[0] = arrayList;
        if (LinkEntranceExperiment.INSTANCE.getValue()) {
            d2 = n.d(com.bytedance.android.live.p.l.COHOST, com.bytedance.android.live.p.l.MULTIGUEST, com.bytedance.android.live.p.l.INTERACTION_PK);
        } else {
            d2 = n.d(com.bytedance.android.live.p.l.INTERACTION, com.bytedance.android.live.p.l.INTERACTION_PK);
        }
        objArr[1] = d2;
        return objArr;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006f, code lost:
        if (r7 > r1) goto L_0x0054;
     */
    @Override // com.bytedance.android.livesdk.chatroom.ui.al
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l() {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.dw.l():void");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.ui.al
    public final boolean n() {
        Boolean bool;
        boolean z;
        LiveCenterContainerView liveCenterContainerView = (LiveCenterContainerView) b(R.id.cc5);
        if (liveCenterContainerView != null) {
            DataChannel dataChannel = liveCenterContainerView.f8663c;
            if (dataChannel != null) {
                bool = (Boolean) dataChannel.b(com.bytedance.android.live.broadcast.api.i.class);
            } else {
                bool = null;
            }
            if (!com.bytedance.android.livesdk.utils.p.a(bool) && liveCenterContainerView.f8664d == bp.SCROLLING && BroadcastLiveCenterSetting.INSTANCE.enable()) {
                int abs = Math.abs((int) liveCenterContainerView.f8661a);
                int abs2 = (int) Math.abs(liveCenterContainerView.getTranslationX());
                if (1 <= abs2 && abs > abs2) {
                    if (Math.abs(liveCenterContainerView.getTranslationX()) < Math.abs(liveCenterContainerView.f8661a / 2.0f)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        LiveCenterContainerView.a(liveCenterContainerView, "swipe", false, 2);
                    } else {
                        LiveCenterContainerView.b(liveCenterContainerView, "swipe", false, 2);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.android.live.n.p
    public final void a(com.bytedance.android.live.broadcast.api.d.a aVar) {
        this.p = aVar;
    }

    @Override // com.bytedance.android.live.n.p
    public final void a(com.bytedance.android.livesdk.chatroom.interact.b bVar) {
        this.q = bVar;
    }

    static final class f extends m implements h.f.a.b<com.bytedance.android.livesdk.chatroom.c.p, z> {
        final /* synthetic */ dw this$0;

        static {
            Covode.recordClassIndex(8965);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(dw dwVar) {
            super(1);
            this.this$0 = dwVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.android.livesdk.chatroom.c.p pVar) {
            com.bytedance.android.livesdk.chatroom.c.p pVar2 = pVar;
            l.d(pVar2, "");
            this.this$0.a(pVar2);
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.b<String, z> {
        final /* synthetic */ dw this$0;

        static {
            Covode.recordClassIndex(8966);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(dw dwVar) {
            super(1);
            this.this$0 = dwVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            String str2 = str;
            l.d(str2, "");
            ((LinkCrossGuestBgView) this.this$0.b(R.id.sl)).setTipText(str2);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.a.c.a
    public final void a(boolean z) {
        int i2;
        LinearLayout linearLayout = (LinearLayout) b(R.id.cfi);
        if (linearLayout != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            linearLayout.setVisibility(i2);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.al, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        com.bytedance.android.live.broadcast.api.c.a.a("timer_start", String.valueOf(System.currentTimeMillis()));
    }

    static final class e extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ dw this$0;

        static {
            Covode.recordClassIndex(8963);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(dw dwVar) {
            super(1);
            this.this$0 = dwVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            bool.booleanValue();
            com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class);
            l.b(a2, "");
            final com.bytedance.android.live.liveinteract.api.e linkWidgetFactory = ((com.bytedance.android.live.liveinteract.api.b) a2).getLinkWidgetFactory();
            linkWidgetFactory.a(this.this$0.q);
            BaseLinkControlWidget a3 = linkWidgetFactory.a(new BaseLinkControlWidget.a(this) {
                /* class com.bytedance.android.livesdk.chatroom.ui.dw.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f16201a;

                static {
                    Covode.recordClassIndex(8964);
                }

                @Override // com.bytedance.android.live.liveinteract.api.BaseLinkControlWidget.a
                public final void a(LiveWidget liveWidget) {
                    this.f16201a.this$0.f().unload(liveWidget);
                }

                @Override // com.bytedance.android.live.liveinteract.api.BaseLinkControlWidget.a
                public final LiveWidget a(int i2) {
                    if (i2 == 0) {
                        LiveWidget a2 = linkWidgetFactory.a();
                        ((BaseLinkWidget) a2).a(this.f16201a.this$0);
                        this.f16201a.this$0.f().load(R.id.cwb, (Widget) a2, false);
                        return a2;
                    } else if (i2 == 1) {
                        com.bytedance.android.live.liveinteract.api.e eVar = linkWidgetFactory;
                        FrameLayout frameLayout = (FrameLayout) this.f16201a.this$0.b(R.id.bqc);
                        l.b(frameLayout, "");
                        LiveWidget b2 = eVar.b(frameLayout);
                        this.f16201a.this$0.f().load(R.id.cwb, (Widget) b2, false);
                        return b2;
                    } else if (i2 == 2) {
                        BaseLinkWidget a3 = linkWidgetFactory.a((FrameLayout) this.f16201a.this$0.b(R.id.bqc));
                        a3.a(this.f16201a.this$0);
                        this.f16201a.this$0.f().load(R.id.d54, (Widget) a3, false);
                        return a3;
                    } else if (i2 != 4) {
                        return null;
                    } else {
                        LiveWidget b3 = linkWidgetFactory.b();
                        this.f16201a.this$0.f().load(R.id.ji, (Widget) b3, false);
                        return b3;
                    }
                }

                {
                    this.f16201a = r1;
                }
            });
            this.this$0.r = a3;
            this.this$0.f().load(R.id.bqf, a3);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.live.n.p
    public final void a(int i2) {
        NetSpeedMonitorWidget netSpeedMonitorWidget = this.f15864a;
        if (netSpeedMonitorWidget != null) {
            if (netSpeedMonitorWidget.f16593e == NetworkUtils.h.NONE) {
                netSpeedMonitorWidget.f16589a = 3;
            } else if (i2 != 0) {
                netSpeedMonitorWidget.f16589a = i2;
            }
            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.chatroom.widget.l(netSpeedMonitorWidget.f16589a));
            if (netSpeedMonitorWidget.f16590b != i2) {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("room_id", String.valueOf(com.bytedance.android.livesdk.ab.e.i()));
                jSONObject.put("quality", i2);
                com.bytedance.ies.xbridge.e.b.a(new com.bytedance.ies.xbridge.e.a("anchor_center_net_quality_changed", currentTimeMillis, new com.bytedance.ies.xbridge.model.a.a.d(jSONObject)));
                netSpeedMonitorWidget.f16590b = i2;
            }
        }
    }

    public final void a(com.bytedance.android.livesdk.chatroom.c.p pVar) {
        if (isViewValid()) {
            ((LinkCrossGuestBgView) b(R.id.sl)).setDataChannel(i());
            int i2 = pVar.f15136a;
            if (i2 == 0) {
                this.u = true;
            } else if (i2 == 1) {
                this.u = false;
                q();
            } else if (i2 == 2) {
                q();
            } else if (i2 == 3 && this.u) {
                ((LinkCrossGuestBgView) b(R.id.sl)).post(new h(this));
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.ui.al
    public final boolean a(MotionEvent motionEvent) {
        p();
        if (ao.a()) {
            ao p2 = p();
            GestureDetectLayout gestureDetectLayout = (GestureDetectLayout) b(R.id.d1y);
            l.b(gestureDetectLayout, "");
            int width = gestureDetectLayout.getWidth();
            GestureDetectLayout gestureDetectLayout2 = (GestureDetectLayout) b(R.id.d1y);
            l.b(gestureDetectLayout2, "");
            int height = gestureDetectLayout2.getHeight();
            GestureDetectLayout gestureDetectLayout3 = (GestureDetectLayout) b(R.id.d1y);
            l.b(gestureDetectLayout3, "");
            int top = gestureDetectLayout3.getTop();
            GestureDetectLayout gestureDetectLayout4 = (GestureDetectLayout) b(R.id.d1y);
            l.b(gestureDetectLayout4, "");
            int left = gestureDetectLayout4.getLeft();
            p2.f15897d = width;
            p2.f15898e = height;
            p2.f15899f = top;
            p2.f15900g = left;
            ao p3 = p();
            if (ao.a()) {
                if ((motionEvent.getAction() & 255) == 2) {
                    for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
                        com.bytedance.android.livesdk.an.a.a().a(new v(207, p3.a(motionEvent, (long) motionEvent.getPointerId(i2))));
                    }
                } else {
                    com.bytedance.android.livesdk.an.a.a().a(new v(207, p3.a(motionEvent, (long) motionEvent.getPointerId(motionEvent.getActionIndex()))));
                }
                com.bytedance.android.live.core.c.a.a(6, "AmazingEngineTouch", "notifyTouchEvent: ACTION_AMAZING_TOUCH");
                int action = motionEvent.getAction() & 255;
                p3.f15895b.onTouchEvent(motionEvent);
                if (action == 0) {
                    p3.f15896c = false;
                }
                if (motionEvent.getPointerCount() > 1) {
                    p3.f15896c = true;
                }
                if (!p3.f15896c) {
                    p3.f15894a.a(motionEvent);
                }
                if (action == 0) {
                    p3.f15901h = true;
                    p3.f15902i = motionEvent;
                } else if (action == 1) {
                    p3.f15901h = false;
                    ao.a(202, p3.a(motionEvent, true));
                }
            }
            return true;
        } else if (i().b(bq.class) != bp.DISMISS || ((ScaleGestureDetector) this.x.getValue()).onTouchEvent(motionEvent)) {
            return false;
        } else {
            return true;
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, com.bytedance.android.livesdk.chatroom.ui.al, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        ((LiveCenterContainerView) b(R.id.cc5)).setDataChannel(i());
        ((LiveCenterContainerView) b(R.id.cc5)).setGestureDetectLayout((GestureDetectLayout) b(R.id.d1y));
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.ui.al
    public final void a(View view, Bundle bundle) {
        if (TestDisableMixStreamTypeSetting.INSTANCE.getValue()) {
            f().load(b(R.id.ecn), ((com.bytedance.android.live.f.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.f.a.class)).getStreamInfoWidget());
        }
        i().b((androidx.lifecycle.m) this, com.bytedance.android.live.broadcast.api.g.class, (h.f.a.b) new e(this)).a((Object) this, t.class, (h.f.a.b) new f(this)).a((Object) this, al.class, (h.f.a.b) new g(this));
        if (com.bytedance.android.live.m.c.a(i())) {
            f().load(R.id.dfs, ((com.bytedance.android.live.m.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.m.a.class)).getQAWidget());
        }
        if (LiveEnableBitrateMonitorSetting.INSTANCE.getValue() == 1) {
            RecyclableWidgetManager f2 = f();
            NetSpeedMonitorWidget netSpeedMonitorWidget = new NetSpeedMonitorWidget();
            this.f15864a = netSpeedMonitorWidget;
            f2.load(R.id.cu6, netSpeedMonitorWidget);
        }
        RecyclableWidgetManager f3 = f();
        BroadcastCountDownWidget broadcastCountDownWidget = new BroadcastCountDownWidget();
        b bVar = new b(this);
        l.d(bVar, "");
        broadcastCountDownWidget.f16532a = bVar;
        f3.load(R.id.afm, broadcastCountDownWidget);
        if (BroadcastLiveCenterSetting.INSTANCE.enable()) {
            RecyclableWidgetManager f4 = f();
            LiveCenterEntranceWidget liveCenterEntranceWidget = new LiveCenterEntranceWidget();
            this.f15865b = liveCenterEntranceWidget;
            f4.load(R.id.cc7, liveCenterEntranceWidget);
        } else {
            RecyclableWidgetManager f5 = f();
            BroadcastFilterStyleWidget broadcastFilterStyleWidget = new BroadcastFilterStyleWidget();
            this.v = broadcastFilterStyleWidget;
            f5.load(R.id.b32, broadcastFilterStyleWidget);
        }
        super.a(view, bundle);
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.a.c.b
    public final void a(String str, boolean z) {
        BroadcastFilterStyleWidget broadcastFilterStyleWidget;
        AnimationSet animationSet;
        if (isViewValid() && str != null && str.length() != 0) {
            if (!(!this.t || (broadcastFilterStyleWidget = this.v) == null || !broadcastFilterStyleWidget.isViewValid || str == null || str.length() == 0)) {
                LiveTextView liveTextView = broadcastFilterStyleWidget.f16537d;
                if (liveTextView == null) {
                    l.a("filterStyleText");
                }
                liveTextView.setText(str);
                View view = broadcastFilterStyleWidget.f16536c;
                if (view == null) {
                    l.a("filterStyle");
                }
                view.clearAnimation();
                View view2 = broadcastFilterStyleWidget.f16536c;
                if (view2 == null) {
                    l.a("filterStyle");
                }
                if (z) {
                    animationSet = (AnimationSet) broadcastFilterStyleWidget.f16538e.getValue();
                } else {
                    animationSet = (AnimationSet) broadcastFilterStyleWidget.f16539f.getValue();
                }
                view2.startAnimation(animationSet);
            }
            this.t = true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.bytedance.android.b.a(R.layout.b91, viewGroup);
    }
}
