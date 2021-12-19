package com.bytedance.android.live.liveinteract.multilive.e;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.liveinteract.api.b.k;
import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.live.liveinteract.multiguest.a.b.b;
import com.bytedance.android.live.liveinteract.multiguest.a.c.d;
import com.bytedance.android.live.liveinteract.multiguest.a.c.f;
import com.bytedance.android.live.liveinteract.multiguest.g.a.a;
import com.bytedance.android.live.liveinteract.multiguest.g.b.a;
import com.bytedance.android.live.liveinteract.multilive.c.o;
import com.bytedance.android.live.liveinteract.platform.common.d.a;
import com.bytedance.android.live.liveinteract.platform.common.g.v;
import com.bytedance.android.livesdk.at.j;
import com.bytedance.android.livesdk.b.a.g;
import com.bytedance.android.livesdk.chatroom.c.q;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.l;
import h.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class f extends com.bytedance.android.live.liveinteract.multiguest.g.c.a implements f.a, a.AbstractC0218a, a.AbstractC0250a {
    public static final a s = new a((byte) 0);
    private final com.bytedance.android.live.liveinteract.platform.common.d.a A;
    private boolean B;
    private boolean C;
    private int D = 1;
    private final h.h E = h.i.a((h.f.a.a) new d(this));
    private final d.a F;
    private final View.OnLayoutChangeListener G;

    /* renamed from: a  reason: collision with root package name */
    public Context f11828a;

    /* renamed from: b  reason: collision with root package name */
    public final FrameLayout f11829b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f11830c;

    /* renamed from: d  reason: collision with root package name */
    public List<u<String, g, com.bytedance.android.live.liveinteract.multiguest.g.b.a>> f11831d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.a.c.d f11832e;

    /* renamed from: f  reason: collision with root package name */
    public final int f11833f;

    /* renamed from: g  reason: collision with root package name */
    public final int f11834g;

    /* renamed from: h  reason: collision with root package name */
    public Room f11835h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f11836i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f11837j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f11838k = true;

    /* renamed from: l  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.platform.common.e.a.a f11839l;

    /* renamed from: m  reason: collision with root package name */
    public DataChannel f11840m;
    public boolean n;
    @com.bytedance.android.live.liveinteract.api.c.d(a = "MULTI_GUEST_DATA_HOLDER")
    public com.bytedance.android.live.liveinteract.multiguest.opt.a.a o;
    public n p;
    final View.OnClickListener q;
    final View.OnClickListener r;
    private final FrameLayout t;
    private e u;
    private com.bytedance.android.live.liveinteract.multiguest.g.b.a v;
    private final int w;
    private final int x;
    private final int y;
    private final com.bytedance.android.live.liveinteract.multiguest.a.c.f z;

    static {
        Covode.recordClassIndex(6451);
    }

    private static boolean a(int i2) {
        return i2 == 11 || i2 == 12 || i2 == 13 || i2 == 14 || i2 == 15;
    }

    private final com.bytedance.android.live.liveinteract.multilive.a.h.f i() {
        return (com.bytedance.android.live.liveinteract.multilive.a.h.f) this.E.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(6452);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.c.f.a
    public final void a() {
        h();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final int e() {
        return this.D;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final void a(boolean z2) {
        MethodCollector.i(6800);
        com.bytedance.android.livesdk.an.a a2 = com.bytedance.android.livesdk.an.a.a();
        k kVar = new k(true);
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.o;
        if (aVar == null) {
            l.a("mDataHolder");
        }
        kVar.f9999b = aVar.f11298h;
        a2.a(kVar);
        DataChannel dataChannel = this.f11840m;
        if (dataChannel == null) {
            l.a("mDataChannel");
        }
        k kVar2 = new k(true);
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = this.o;
        if (aVar2 == null) {
            l.a("mDataHolder");
        }
        kVar2.f9999b = aVar2.f11298h;
        l.b(kVar2, "");
        dataChannel.b(com.bytedance.android.live.liveinteract.api.h.class, kVar2);
        this.f11838k = z2;
        this.f11836i = true;
        View a3 = com.a.a(LayoutInflater.from(this.f11829b.getContext()), R.layout.bf2, this.f11829b, false);
        if (a3 != null) {
            TextView textView = (TextView) a3;
            this.f11830c = textView;
            if (textView != null) {
                textView.setVisibility(4);
            }
            this.f11829b.addView(this.f11830c);
            com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = this.f11832e;
            if (dVar == null) {
                l.a("mInfoCenter");
            }
            dVar.a(this.F);
            this.z.a();
            com.bytedance.android.live.liveinteract.platform.common.g.h.a("connection_request");
            h();
            this.f11829b.addOnLayoutChangeListener(this.G);
            com.bytedance.android.live.liveinteract.multilive.a.h.f i2 = i();
            FrameLayout frameLayout = this.f11829b;
            l.d(frameLayout, "");
            i2.f11584a = frameLayout;
            i();
            MethodCollector.o(6800);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        MethodCollector.o(6800);
        throw nullPointerException;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final void a(String str) {
        if (!this.C && this.f11838k && this.f11836i) {
            if (this.A.a(str) > InteractFirstFrameTimeOutDurationSetting.DEFAULT && this.f11829b.getVisibility() == 0) {
                this.f11829b.setVisibility(4);
            }
            this.A.b(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0210, code lost:
        if (r0.a(r12) == false) goto L_0x01bf;
     */
    @Override // com.bytedance.android.live.liveinteract.platform.common.d.a.AbstractC0250a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.android.live.liveinteract.platform.common.e.a.a r27) {
        /*
        // Method dump skipped, instructions count: 702
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multilive.e.f.a(com.bytedance.android.live.liveinteract.platform.common.e.a.a):void");
    }

    public final void a(boolean z2, m<? super String, ? super g, Boolean> mVar) {
        Iterator<u<String, g, com.bytedance.android.live.liveinteract.multiguest.g.b.a>> it = this.f11831d.iterator();
        while (it.hasNext()) {
            u<String, g, com.bytedance.android.live.liveinteract.multiguest.g.b.a> next = it.next();
            if (mVar.invoke(next.getFirst(), next.getSecond()).booleanValue()) {
                if (z2) {
                    i().a((View) next.getThird());
                }
                it.remove();
                com.bytedance.android.live.core.c.a.a(3, "MultiLiveGuestVideoWindowManager", "delete guest window ".concat(String.valueOf(z2)));
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final boolean a(n nVar) {
        l.d(nVar, "");
        return i().a(nVar);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final void a(String str, SurfaceView surfaceView) {
        MethodCollector.i(6923);
        l.d(str, "");
        l.d(surfaceView, "");
        if (this.f11838k || !this.f11836i) {
            MethodCollector.o(6923);
            return;
        }
        com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
        l.b(a2, "");
        if (TextUtils.equals(str, a2.f14184e)) {
            surfaceView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            FrameLayout frameLayout = this.t;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            FrameLayout frameLayout2 = this.t;
            if (frameLayout2 != null) {
                frameLayout2.addView(surfaceView);
            }
            FrameLayout frameLayout3 = this.t;
            if (frameLayout3 != null) {
                frameLayout3.setVisibility(0);
            }
            com.bytedance.android.livesdk.b.a.d.a().s = surfaceView;
            MethodCollector.o(6923);
            return;
        }
        com.bytedance.android.live.liveinteract.multiguest.g.b.a a3 = a(0, str);
        if (a3 == null && (a3 = c(str)) == null) {
            MethodCollector.o(6923);
            return;
        }
        Room room = this.f11835h;
        Long l2 = null;
        String valueOf = room != null ? String.valueOf(room.getOwnerUserId()) : null;
        b.a presenter = a3.getPresenter();
        if (presenter != null) {
            l2 = Long.valueOf(presenter.b());
        }
        if (TextUtils.equals(valueOf, String.valueOf(l2.longValue()))) {
            StringBuilder append = new StringBuilder("Multi Live Anchor attach to window exception, cur interactId: ").append(str).append(", anchorLinkMicId:");
            com.bytedance.android.livesdk.b.a.d a4 = com.bytedance.android.livesdk.b.a.d.a();
            l.b(a4, "");
            com.bytedance.android.live.core.d.c.a(new Throwable(), append.append(a4.f14184e).toString());
        }
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.w, this.x));
        surfaceView.setZOrderMediaOverlay(true);
        a3.a(surfaceView);
        MethodCollector.o(6923);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.b.a.AbstractC0218a
    public final void a(com.bytedance.android.live.liveinteract.multiguest.g.b.a aVar) {
        l.d(aVar, "");
        if (l.a(aVar, this.v)) {
            this.v = null;
        }
        a(true, (m<? super String, ? super g, Boolean>) new i(aVar));
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = this.o;
        if (aVar2 == null) {
            l.a("mDataHolder");
        }
        aVar2.f11297g = this.f11831d.size();
        h();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final void a(DataChannel dataChannel) {
        l.d(dataChannel, "");
        this.f11840m = dataChannel;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final void a(com.bytedance.android.live.liveinteract.multilive.c.m mVar) {
        n a2;
        ArrayList<o> arrayList;
        l.d(mVar, "");
        if (l.a((Object) mVar.f11763a, (Object) "onLayoutChange")) {
            com.bytedance.android.live.liveinteract.multilive.c.n nVar = mVar.f11764b;
            if (!(nVar == null || (arrayList = nVar.f11768b) == null)) {
                Iterator<o> it = arrayList.iterator();
                while (it.hasNext()) {
                    o next = it.next();
                    long a3 = g.a.f14199a.a(next.f11769a);
                    if (a3 > 0) {
                        com.bytedance.android.livesdk.b.a.g gVar = g.a.f14199a;
                        gVar.b(a3);
                        gVar.f14198c.put(Long.valueOf((long) next.f11770b), Long.valueOf(a3));
                    }
                }
            }
            com.bytedance.android.live.liveinteract.multilive.c.n nVar2 = mVar.f11764b;
            if (!(nVar2 == null || (a2 = nVar2.a()) == null)) {
                i().a(a2);
            }
            com.bytedance.android.live.liveinteract.multilive.c.n nVar3 = mVar.f11764b;
            n a4 = nVar3 != null ? nVar3.a() : null;
            if (this.p != a4) {
                this.p = a4;
                if (a4 == n.NORMAL) {
                    com.bytedance.android.live.liveinteract.multilive.b.a.c("connection_end");
                    com.bytedance.android.live.liveinteract.multilive.b.a.a("other", a4);
                    return;
                }
                com.bytedance.android.live.liveinteract.multilive.b.a.c("manual_setting_switch");
                com.bytedance.android.live.liveinteract.multilive.b.a.a(com.bytedance.android.live.liveinteract.multilive.b.a.f11750b, "manual_setting_switch", null, 6);
            }
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.android.live.liveinteract.multilive.a.h.f> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(6456);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.live.liveinteract.multilive.a.h.f invoke() {
            return new com.bytedance.android.live.liveinteract.multilive.a.h.f(f.a(this.this$0));
        }
    }

    public final void g() {
        if (!this.f11837j) {
            com.bytedance.android.live.liveinteract.platform.common.g.h.b("connection_request");
            com.bytedance.android.live.liveinteract.platform.common.g.h.f11965b = "connection_request";
        }
    }

    private final void j() {
        for (u<String, g, com.bytedance.android.live.liveinteract.multiguest.g.b.a> uVar : this.f11831d) {
            i().a((View) uVar.getThird());
        }
        this.f11831d.clear();
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.o;
        if (aVar == null) {
            l.a("mDataHolder");
        }
        aVar.f11297g = 0;
    }

    public final void h() {
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.o;
        if (aVar == null) {
            l.a("mDataHolder");
        }
        if (aVar.f11298h) {
            TextView textView = this.f11830c;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        this.f11829b.post(new j(this));
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final void b() {
        MethodCollector.i(6804);
        this.f11836i = false;
        this.f11829b.removeOnLayoutChangeListener(this.G);
        this.z.b();
        this.f11829b.removeAllViews();
        com.bytedance.android.livesdk.an.a a2 = com.bytedance.android.livesdk.an.a.a();
        k kVar = new k(false);
        kVar.f9999b = false;
        a2.a(kVar);
        DataChannel dataChannel = this.f11840m;
        if (dataChannel == null) {
            l.a("mDataChannel");
        }
        k kVar2 = new k(false);
        kVar2.f9999b = false;
        l.b(kVar2, "");
        dataChannel.b(com.bytedance.android.live.liveinteract.api.h.class, kVar2);
        MethodCollector.o(6804);
    }

    public final boolean f() {
        if (this.f11837j) {
            return true;
        }
        com.bytedance.android.livesdk.at.f b2 = com.bytedance.android.livesdk.userservice.u.a().b();
        l.b(b2, "");
        if (!b2.e()) {
            com.bytedance.android.livesdk.at.f b3 = com.bytedance.android.livesdk.userservice.u.a().b();
            Context context = this.f11828a;
            j.a a2 = com.bytedance.android.livesdk.at.j.a();
            a2.f14158a = y.a((int) R.string.grm);
            a2.f14161d = "interact";
            a2.f14160c = 0;
            b3.a(context, a2.a()).b(new com.bytedance.android.livesdk.at.g());
            return false;
        } else if (com.bytedance.android.livesdk.userservice.u.a().b().a(com.bytedance.android.livesdk.at.h.INTERACT)) {
            return false;
        } else {
            return true;
        }
    }

    public static final class h extends d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f11845a;

        static {
            Covode.recordClassIndex(6460);
        }

        @Override // com.bytedance.android.live.liveinteract.multiguest.a.c.d.a
        public final void a() {
            if (this.f11845a.f11838k) {
                com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
                l.b(a2, "");
                if (!TextUtils.isEmpty(a2.f14184e)) {
                    this.f11845a.n = false;
                    if (this.f11845a.f11839l != null) {
                        f fVar = this.f11845a;
                        com.bytedance.android.live.liveinteract.platform.common.e.a.a aVar = fVar.f11839l;
                        if (aVar == null) {
                            l.b();
                        }
                        fVar.a(aVar);
                        return;
                    }
                    return;
                }
                return;
            }
            com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = this.f11845a.f11832e;
            if (dVar == null) {
                l.a("mInfoCenter");
            }
            List<com.bytedance.android.livesdk.chatroom.model.b.e> list = dVar.f11074b;
            ArrayList<com.bytedance.android.livesdk.chatroom.model.b.e> arrayList = new ArrayList();
            for (com.bytedance.android.livesdk.chatroom.model.b.e eVar : list) {
                if (eVar.f15724e == 2) {
                    arrayList.add(eVar);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (com.bytedance.android.livesdk.chatroom.model.b.e eVar2 : arrayList) {
                Iterator<u<String, g, com.bytedance.android.live.liveinteract.multiguest.g.b.a>> it = this.f11845a.f11831d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    u<String, g, com.bytedance.android.live.liveinteract.multiguest.g.b.a> next = it.next();
                    if (TextUtils.equals(eVar2.a(), next.getThird().getPresenter().c())) {
                        arrayList2.add(next);
                        this.f11845a.a(false, (m<? super String, ? super g, Boolean>) new a(eVar2));
                        break;
                    }
                }
            }
            arrayList2.addAll(this.f11845a.f11831d);
            this.f11845a.f11831d = arrayList2;
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = this.f11845a.o;
            if (aVar2 == null) {
                l.a("mDataHolder");
            }
            aVar2.f11297g = this.f11845a.f11831d.size();
            this.f11845a.h();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(f fVar) {
            this.f11845a = fVar;
        }

        static final class a extends h.f.b.m implements m<String, g, Boolean> {
            final /* synthetic */ com.bytedance.android.livesdk.chatroom.model.b.e $info;

            static {
                Covode.recordClassIndex(6461);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(com.bytedance.android.livesdk.chatroom.model.b.e eVar) {
                super(2);
                this.$info = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ Boolean invoke(String str, g gVar) {
                l.d(str, "");
                l.d(gVar, "");
                return Boolean.valueOf(l.a((Object) str, (Object) this.$info.a()));
            }
        }

        @Override // com.bytedance.android.live.liveinteract.multiguest.a.c.d.a
        public final void a(long j2, String str) {
            com.bytedance.android.live.liveinteract.multiguest.g.b.a a2;
            l.d(str, "");
            if (!this.f11845a.f11838k && this.f11845a.f11836i && (a2 = this.f11845a.a(j2, str)) != null) {
                a2.c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f11846a;

        static {
            Covode.recordClassIndex(6463);
        }

        j(f fVar) {
            this.f11846a = fVar;
        }

        public final void run() {
            final int i2;
            com.bytedance.android.livesdk.chatroom.model.c.a aVar;
            Context context;
            Resources resources;
            Context context2;
            Resources resources2;
            final int size = this.f11846a.f11831d.size();
            int i3 = 0;
            float f2 = 2.14748365E9f;
            for (int i4 = 0; i4 < size; i4++) {
                com.bytedance.android.live.liveinteract.multiguest.g.b.a third = this.f11846a.f11831d.get(i4).getThird();
                if (third != null && third.getY() < f2) {
                    f2 = third.getY();
                }
            }
            if (2.14748365E9f == f2 || f2 < 10.0f) {
                i2 = this.f11846a.f11834g;
            } else {
                i2 = (int) (((this.f11846a.f11829b.getY() + ((float) this.f11846a.f11829b.getHeight())) - f2) + ((float) this.f11846a.f11833f));
            }
            if (!LiveAppBundleUtils.isPluginAvailable(com.bytedance.android.livesdk.utils.b.LINK_MIC)) {
                LiveAppBundleUtils.ensurePluginAvailable(this.f11846a.f11828a, com.bytedance.android.livesdk.utils.b.LINK_MIC);
                TextView textView = this.f11846a.f11830c;
                if (textView != null) {
                    textView.setVisibility(4);
                }
                v.b();
                if (size > 0) {
                    i3 = this.f11846a.f11833f;
                }
                f.a(this.f11846a).b(com.bytedance.android.live.liveinteract.api.i.class, new com.bytedance.android.live.liveinteract.api.b.j(size, i2 + i3));
                return;
            }
            f fVar = this.f11846a;
            com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = fVar.f11832e;
            if (dVar == null) {
                l.a("mInfoCenter");
            }
            int f3 = dVar.f();
            ViewGroup.LayoutParams layoutParams = null;
            if (fVar.f11837j) {
                TextView textView2 = fVar.f11830c;
                String quantityString = (textView2 == null || (context2 = textView2.getContext()) == null || (resources2 = context2.getResources()) == null) ? null : resources2.getQuantityString(R.plurals.fm, f3, Integer.valueOf(f3));
                com.bytedance.android.live.core.f.f.a(R.string.e55, Integer.valueOf(f3));
                TextView textView3 = fVar.f11830c;
                if (textView3 != null) {
                    textView3.setText(quantityString);
                }
                TextView textView4 = fVar.f11830c;
                if (textView4 != null) {
                    textView4.setOnClickListener(fVar.q);
                }
                TextView textView5 = fVar.f11830c;
                if (textView5 != null) {
                    textView5.setVisibility(0);
                }
            } else {
                com.bytedance.android.live.liveinteract.api.a.c a2 = com.bytedance.android.live.liveinteract.api.a.c.a();
                l.b(a2, "");
                T t = a2.n;
                if (t != null) {
                    if (t.intValue() == 0) {
                        TextView textView6 = fVar.f11830c;
                        if (textView6 != null) {
                            textView6.setText(R.string.dwi);
                        }
                        TextView textView7 = fVar.f11830c;
                        if (textView7 != null) {
                            textView7.setOnClickListener(fVar.r);
                        }
                        Object a3 = com.bytedance.android.live.liveinteract.api.c.e.f10014a.a("MULTI_GUEST_DATA_HOLDER");
                        if (!(a3 instanceof com.bytedance.android.live.liveinteract.multiguest.opt.a.a)) {
                            a3 = null;
                        }
                        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = (com.bytedance.android.live.liveinteract.multiguest.opt.a.a) a3;
                        if (aVar2 == null || (aVar = aVar2.f11299i) == null) {
                            aVar = com.bytedance.android.livesdk.b.a.d.a().w;
                        }
                        if (!com.bytedance.android.live.liveinteract.multilive.a.a(aVar)) {
                            TextView textView8 = fVar.f11830c;
                            if (textView8 != null) {
                                textView8.setVisibility(0);
                            }
                        } else if (com.bytedance.android.live.liveinteract.multilive.a.b(aVar)) {
                            DataChannel dataChannel = fVar.f11840m;
                            if (dataChannel == null) {
                                l.a("mDataChannel");
                            }
                            if (com.bytedance.android.live.liveinteract.multilive.a.a(dataChannel)) {
                                TextView textView9 = fVar.f11830c;
                                if (textView9 != null) {
                                    textView9.setVisibility(8);
                                }
                            } else {
                                TextView textView10 = fVar.f11830c;
                                if (textView10 != null) {
                                    textView10.setVisibility(0);
                                }
                            }
                        } else {
                            TextView textView11 = fVar.f11830c;
                            if (textView11 != null) {
                                textView11.setVisibility(0);
                            }
                        }
                    } else if (t.intValue() == 2) {
                        TextView textView12 = fVar.f11830c;
                        if (textView12 != null) {
                            textView12.setText(R.string.dwi);
                        }
                        TextView textView13 = fVar.f11830c;
                        if (textView13 != null) {
                            textView13.setOnClickListener(fVar.r);
                        }
                        TextView textView14 = fVar.f11830c;
                        if (textView14 != null) {
                            textView14.setVisibility(8);
                        }
                    }
                }
                TextView textView15 = fVar.f11830c;
                String quantityString2 = (textView15 == null || (context = textView15.getContext()) == null || (resources = context.getResources()) == null) ? null : resources.getQuantityString(R.plurals.fm, f3, Integer.valueOf(f3));
                TextView textView16 = fVar.f11830c;
                if (textView16 != null) {
                    textView16.setText(quantityString2);
                }
                TextView textView17 = fVar.f11830c;
                if (textView17 != null) {
                    textView17.setOnClickListener(fVar.q);
                }
                TextView textView18 = fVar.f11830c;
                if (textView18 != null) {
                    textView18.setVisibility(0);
                }
            }
            TextView textView19 = fVar.f11830c;
            if (textView19 != null) {
                textView19.bringToFront();
            }
            TextView textView20 = this.f11846a.f11830c;
            if (textView20 != null) {
                layoutParams = textView20.getLayoutParams();
            }
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = i2;
            TextView textView21 = this.f11846a.f11830c;
            if (textView21 != null) {
                textView21.setLayoutParams(layoutParams2);
            }
            TextView textView22 = this.f11846a.f11830c;
            if (textView22 != null) {
                textView22.post(new Runnable(this) {
                    /* class com.bytedance.android.live.liveinteract.multilive.e.f.j.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ j f11847a;

                    static {
                        Covode.recordClassIndex(6464);
                    }

                    {
                        this.f11847a = r1;
                    }

                    public final void run() {
                        TextView textView = this.f11847a.f11846a.f11830c;
                        int i2 = 0;
                        if (textView != null && textView.getVisibility() == 0) {
                            TextView textView2 = this.f11847a.f11846a.f11830c;
                            if (textView2 != null) {
                                i2 = textView2.getHeight();
                            }
                            i2 += this.f11847a.f11846a.f11833f;
                        } else if (size > 0) {
                            i2 = this.f11847a.f11846a.f11833f;
                        }
                        f.a(this.f11847a.f11846a).b(com.bytedance.android.live.liveinteract.api.i.class, new com.bytedance.android.live.liveinteract.api.b.j(size, i2 + i2));
                    }
                });
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final void b(boolean z2) {
        if (this.f11838k) {
            this.B = z2;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final void d(boolean z2) {
        super.d(z2);
        this.C = z2;
    }

    public static final /* synthetic */ DataChannel a(f fVar) {
        DataChannel dataChannel = fVar.f11840m;
        if (dataChannel == null) {
            l.a("mDataChannel");
        }
        return dataChannel;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final void b(String str) {
        l.d(str, "");
        this.F.a(0, str);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final void d(String str) {
        l.d(str, "");
        this.F.a(0, str);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.d.a.AbstractC0250a
    public final boolean b(int i2) {
        this.D = i2;
        if (a(i2)) {
            return true;
        }
        if (!this.f11838k || i2 != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.e.f$f  reason: collision with other inner class name */
    static final class View$OnClickListenerC0246f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f11844a;

        static {
            Covode.recordClassIndex(6458);
        }

        View$OnClickListenerC0246f(f fVar) {
            this.f11844a = fVar;
        }

        public final void onClick(View view) {
            this.f11844a.g();
            if (this.f11844a.f()) {
                com.bytedance.android.live.liveinteract.platform.common.g.o.a("connection_request");
                f.a(this.f11844a).c(com.bytedance.android.live.liveinteract.api.l.class, new q(0));
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final void c(boolean z2) {
        MethodCollector.i(6806);
        this.f11838k = z2;
        com.bytedance.android.live.liveinteract.multilive.a.h.f i2 = i();
        i2.f11588e = z2;
        b bVar = i2.f11586c;
        if (bVar != null) {
            bVar.b(z2);
        }
        j();
        FrameLayout frameLayout = this.t;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            com.bytedance.android.livesdk.b.a.d.a().s = null;
        }
        MethodCollector.o(6806);
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f11841a;

        static {
            Covode.recordClassIndex(6454);
        }

        c(f fVar) {
            this.f11841a = fVar;
        }

        public final void onClick(View view) {
            long j2;
            User owner;
            FollowInfo followInfo;
            this.f11841a.g();
            Room room = this.f11841a.f11835h;
            if (room == null || (owner = room.getOwner()) == null || (followInfo = owner.getFollowInfo()) == null) {
                j2 = 0;
            } else {
                j2 = followInfo.getFollowStatus();
            }
            com.bytedance.android.live.liveinteract.platform.common.g.b.a("connection_request", j2);
            if (this.f11841a.f() && !this.f11841a.f11837j) {
                com.bytedance.android.live.liveinteract.api.a.c a2 = com.bytedance.android.live.liveinteract.api.a.c.a();
                l.b(a2, "");
                T t = a2.n;
                if (t == null || t.intValue() != 0) {
                    return;
                }
                if (!LiveAppBundleUtils.isPluginAvailable(com.bytedance.android.livesdk.utils.b.LINK_MIC)) {
                    LiveAppBundleUtils.ensurePluginAvailable(this.f11841a.f11828a, com.bytedance.android.livesdk.utils.b.LINK_MIC);
                } else {
                    com.bytedance.android.livesdk.ah.f.a(p.a(this.f11841a.f11828a)).a(new com.bytedance.android.livesdk.ah.b.d(this) {
                        /* class com.bytedance.android.live.liveinteract.multilive.e.f.c.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ c f11842a;

                        static {
                            Covode.recordClassIndex(6455);
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f11842a = r1;
                        }

                        @Override // com.bytedance.android.livesdk.ah.b.d
                        public final void a(String... strArr) {
                            l.d(strArr, "");
                            q qVar = new q(1);
                            qVar.f15141b = a.EnumC0216a.SEND_REQUEST;
                            f.a(this.f11842a.f11841a).c(com.bytedance.android.live.liveinteract.api.l.class, qVar);
                        }

                        @Override // com.bytedance.android.livesdk.ah.b.d
                        public final void b(String... strArr) {
                            l.d(strArr, "");
                            ao.a(this.f11842a.f11841a.f11828a, (int) R.string.grv);
                        }
                    }, "android.permission.CAMERA", "android.permission.RECORD_AUDIO");
                }
            }
        }
    }

    private final void a(com.bytedance.android.live.liveinteract.platform.common.e.a.c cVar) {
        e eVar = this.u;
        if (eVar == null || !eVar.a(cVar.p)) {
            i().a(!cVar.p);
            e eVar2 = this.u;
            if (eVar2 != null) {
                eVar2.f11827a = cVar.p;
            } else {
                this.u = new e(cVar.p);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final com.bytedance.android.live.liveinteract.multiguest.g.b.a c(String str) {
        l.d(str, "");
        if (this.f11838k || !this.f11836i || TextUtils.isEmpty(str)) {
            return null;
        }
        com.bytedance.android.live.liveinteract.multiguest.g.b.a a2 = a(0, str);
        boolean z2 = false;
        if (a2 != null) {
            a(a2);
            z2 = true;
        }
        com.bytedance.android.live.liveinteract.multiguest.g.b.b a3 = a(str, true);
        if (a3 == null) {
            return null;
        }
        if (!this.f11837j) {
            com.bytedance.android.livesdk.b.a.d a4 = com.bytedance.android.livesdk.b.a.d.a();
            l.b(a4, "");
            if (TextUtils.equals(str, a4.f14185f)) {
                if (!z2) {
                    a3.f11243i = true;
                }
                this.v = a3;
            }
        } else if (!z2) {
            a3.f11243i = true;
        }
        int c2 = (int) g.a.f14199a.c(g.a.f14199a.a(str));
        a3.setPosInMultiLive(c2);
        com.bytedance.android.live.core.c.a.a(3, "MultiLiveGuestVideoWindowManager", "add link in guest window ".concat(String.valueOf(str)));
        n b2 = i().b();
        l.d(b2, "");
        a(a3, c2, str, new g(new com.bytedance.android.live.liveinteract.platform.common.e.a.c(), new com.bytedance.android.live.liveinteract.platform.common.e.a.b(), -10086, -10086, b2));
        this.F.a();
        return a3;
    }

    /* access modifiers changed from: package-private */
    public static final class b extends h.f.b.m implements m<String, g, Boolean> {
        final /* synthetic */ com.bytedance.android.live.liveinteract.platform.common.e.a.c $region;

        static {
            Covode.recordClassIndex(6453);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(com.bytedance.android.live.liveinteract.platform.common.e.a.c cVar) {
            super(2);
            this.$region = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ Boolean invoke(String str, g gVar) {
            l.d(str, "");
            l.d(gVar, "");
            return Boolean.valueOf(l.a((Object) str, (Object) this.$region.a()));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends h.f.b.m implements m<String, g, Boolean> {
        final /* synthetic */ com.bytedance.android.live.liveinteract.multiguest.g.b.a $window;

        static {
            Covode.recordClassIndex(6462);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(com.bytedance.android.live.liveinteract.multiguest.g.b.a aVar) {
            super(2);
            this.$window = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ Boolean invoke(String str, g gVar) {
            l.d(str, "");
            l.d(gVar, "");
            return Boolean.valueOf(l.a((Object) str, (Object) this.$window.getPresenter().c()));
        }
    }

    private final String a(n nVar, List<com.bytedance.android.live.liveinteract.platform.common.e.a.c> list) {
        if (nVar == n.NORMAL) {
            return "others";
        }
        if (this.f11831d.size() != 0 || list == null || list.size() <= 1) {
            return "manual_setting_switch";
        }
        return "connection_start";
    }

    /* access modifiers changed from: package-private */
    public static final class g extends h.f.b.m implements m<String, g, Boolean> {
        final /* synthetic */ List $regionList;
        final /* synthetic */ n $toType;

        static {
            Covode.recordClassIndex(6459);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(n nVar, List list) {
            super(2);
            this.$toType = nVar;
            this.$regionList = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
            r0 = true;
         */
        @Override // h.f.a.m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Boolean invoke(java.lang.String r5, com.bytedance.android.live.liveinteract.multilive.e.g r6) {
            /*
                r4 = this;
                com.bytedance.android.live.liveinteract.multilive.e.g r6 = (com.bytedance.android.live.liveinteract.multilive.e.g) r6
                java.lang.String r3 = ""
                h.f.b.l.d(r5, r3)
                h.f.b.l.d(r6, r3)
                java.util.List r0 = r4.$regionList
                java.util.Iterator r2 = r0.iterator()
            L_0x0010:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L_0x0032
                java.lang.Object r1 = r2.next()
                r0 = r1
                com.bytedance.android.live.liveinteract.platform.common.e.a.c r0 = (com.bytedance.android.live.liveinteract.platform.common.e.a.c) r0
                h.f.b.l.b(r0, r3)
                java.lang.String r0 = r0.a()
                boolean r0 = h.f.b.l.a(r0, r5)
                if (r0 == 0) goto L_0x0010
                if (r1 == 0) goto L_0x0032
                com.bytedance.android.live.liveinteract.api.b.n r1 = r4.$toType
                com.bytedance.android.live.liveinteract.api.b.n r0 = r6.f11855e
                if (r1 == r0) goto L_0x0038
            L_0x0032:
                r0 = 1
            L_0x0033:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            L_0x0038:
                r0 = 0
                goto L_0x0033
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multilive.e.f.g.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    private final com.bytedance.android.live.liveinteract.multiguest.g.b.b a(String str, boolean z2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        b.a a2 = this.z.a(str);
        Context context = this.f11828a;
        l.b(a2, "");
        DataChannel dataChannel = this.f11840m;
        if (dataChannel == null) {
            l.a("mDataChannel");
        }
        com.bytedance.android.live.liveinteract.multiguest.g.b.b bVar = new com.bytedance.android.live.liveinteract.multiguest.g.b.b(context, str, a2, this, dataChannel, i().b());
        bVar.setCurrentUserIsLinkedGuest(!z2);
        return bVar;
    }

    public final com.bytedance.android.live.liveinteract.multiguest.g.b.a a(long j2, String str) {
        for (u<String, g, com.bytedance.android.live.liveinteract.multiguest.g.b.a> uVar : this.f11831d) {
            if (j2 > 0 && uVar.getThird().getPresenter().b() == j2) {
                return uVar.getThird();
            }
            if (TextUtils.equals(uVar.getThird().getPresenter().c(), str)) {
                return uVar.getThird();
            }
        }
        return null;
    }

    private final void a(boolean z2, n nVar, List<com.bytedance.android.live.liveinteract.platform.common.e.a.c> list) {
        if (z2) {
            String a2 = a(nVar, list);
            com.bytedance.android.live.liveinteract.multilive.b.a.b(a2, null);
            com.bytedance.android.live.liveinteract.multilive.b.a.a(a2, nVar);
        }
    }

    private final void a(com.bytedance.android.live.liveinteract.multiguest.g.b.a aVar, int i2, String str, g gVar) {
        i().a(aVar, i2);
        this.f11831d.add(new u<>(str, gVar, aVar));
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = this.o;
        if (aVar2 == null) {
            l.a("mDataHolder");
        }
        aVar2.f11297g = this.f11831d.size();
    }

    public f(Room room, FrameLayout frameLayout, FrameLayout frameLayout2, com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar) {
        l.d(room, "");
        l.d(frameLayout2, "");
        l.d(dVar, "");
        Context context = frameLayout2.getContext();
        l.b(context, "");
        this.f11828a = context;
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(this);
        this.F = new h(this);
        this.G = new e(this);
        this.q = new View$OnClickListenerC0246f(this);
        this.r = new c(this);
        this.f11835h = room;
        this.f11829b = frameLayout2;
        this.t = frameLayout;
        this.f11832e = dVar;
        this.A = new com.bytedance.android.live.liveinteract.platform.common.d.a(this);
        this.z = new com.bytedance.android.live.liveinteract.multiguest.a.c.f(room, dVar, this);
        Resources resources = this.f11828a.getResources();
        this.w = resources.getDimensionPixelSize(R.dimen.wg);
        this.x = resources.getDimensionPixelSize(R.dimen.wf);
        this.f11833f = (int) com.bytedance.common.utility.n.b(this.f11828a, 4.0f);
        this.f11834g = (int) com.bytedance.common.utility.n.b(this.f11828a, 52.0f);
        this.y = (int) com.bytedance.common.utility.n.b(this.f11828a, 12.0f);
    }

    static final class e implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f11843a;

        static {
            Covode.recordClassIndex(6457);
        }

        e(f fVar) {
            this.f11843a = fVar;
        }

        public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            if (i5 != i9 && this.f11843a.f11839l != null) {
                f fVar = this.f11843a;
                com.bytedance.android.live.liveinteract.platform.common.e.a.a aVar = fVar.f11839l;
                if (aVar == null) {
                    l.b();
                }
                fVar.a(aVar);
            }
        }
    }
}
