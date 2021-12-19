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
import com.bytedance.android.live.liveinteract.api.b.k;
import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.live.liveinteract.api.i;
import com.bytedance.android.live.liveinteract.multiguest.a.b.b;
import com.bytedance.android.live.liveinteract.multiguest.a.c.d;
import com.bytedance.android.live.liveinteract.multiguest.a.c.f;
import com.bytedance.android.live.liveinteract.multiguest.g.b.a;
import com.bytedance.android.live.liveinteract.platform.common.c.j;
import com.bytedance.android.live.liveinteract.platform.common.d.a;
import com.bytedance.android.live.liveinteract.platform.common.g.o;
import com.bytedance.android.live.liveinteract.platform.common.g.v;
import com.bytedance.android.livesdk.b.a.g;
import com.bytedance.android.livesdk.chatroom.c.q;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class c extends com.bytedance.android.live.liveinteract.multiguest.g.c.a implements f.a, a.AbstractC0218a, a.AbstractC0250a {

    /* renamed from: l  reason: collision with root package name */
    public static final a f11800l = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Context f11801a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f11802b;

    /* renamed from: c  reason: collision with root package name */
    public List<com.bytedance.android.live.liveinteract.multiguest.g.b.a> f11803c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.a.c.d f11804d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11805e;

    /* renamed from: f  reason: collision with root package name */
    public final int f11806f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11807g;

    /* renamed from: h  reason: collision with root package name */
    public DataChannel f11808h;
    @com.bytedance.android.live.liveinteract.api.c.d(a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: i  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.opt.a.a f11809i;

    /* renamed from: j  reason: collision with root package name */
    final View.OnClickListener f11810j;

    /* renamed from: k  reason: collision with root package name */
    public final FrameLayout f11811k;

    /* renamed from: m  reason: collision with root package name */
    private final FrameLayout f11812m;
    private com.bytedance.android.live.liveinteract.multiguest.g.b.a n;
    private final int o;
    private final int p;
    private final int q;
    private final f r;
    private Room s;
    private boolean t;
    private List<com.bytedance.android.livesdk.chatroom.model.b.e> u = new ArrayList();
    private List<com.bytedance.android.livesdk.chatroom.model.b.e> v = new ArrayList();
    private final h w;
    private final d.a x;

    static {
        Covode.recordClassIndex(6438);
    }

    private final com.bytedance.android.live.liveinteract.multilive.anchor.f.e g() {
        return (com.bytedance.android.live.liveinteract.multilive.anchor.f.e) this.w.getValue();
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.d.a.AbstractC0250a
    public final void a(com.bytedance.android.live.liveinteract.platform.common.e.a.a aVar) {
        l.d(aVar, "");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final void a(String str) {
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.d.a.AbstractC0250a
    public final boolean b(int i2) {
        return i2 == 1;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(6439);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.c.f.a
    public final void a() {
        f();
    }

    static final class b extends m implements h.f.a.a<com.bytedance.android.live.liveinteract.multilive.anchor.f.e> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(6440);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.live.liveinteract.multilive.anchor.f.e invoke() {
            return new com.bytedance.android.live.liveinteract.multilive.anchor.f.e(c.a(this.this$0));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final void c() {
        super.c();
        g().a(n.NORMAL);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final void d() {
        this.v.clear();
        DataChannel dataChannel = this.f11808h;
        if (dataChannel == null) {
            l.a("mDataChannel");
        }
        dataChannel.b(j.class, Integer.valueOf(this.v.size()));
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final void b() {
        MethodCollector.i(9516);
        this.f11807g = false;
        this.r.b();
        this.f11811k.removeAllViews();
        com.bytedance.android.livesdk.an.a a2 = com.bytedance.android.livesdk.an.a.a();
        k kVar = new k(false);
        kVar.f9999b = false;
        a2.a(kVar);
        DataChannel dataChannel = this.f11808h;
        if (dataChannel == null) {
            l.a("mDataChannel");
        }
        k kVar2 = new k(false);
        kVar2.f9999b = false;
        l.b(kVar2, "");
        dataChannel.b(com.bytedance.android.live.liveinteract.api.h.class, kVar2);
        MethodCollector.o(9516);
    }

    public final void f() {
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11809i;
        if (aVar == null) {
            l.a("mDataHolder");
        }
        if (aVar.f11298h) {
            TextView textView = this.f11802b;
            if (textView != null) {
                textView.setVisibility(8);
            }
            h();
            return;
        }
        this.f11811k.post(new e(this));
    }

    public static final class d extends d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f11814a;

        static {
            Covode.recordClassIndex(6442);
        }

        @Override // com.bytedance.android.live.liveinteract.multiguest.a.c.d.a
        public final void a() {
            List<com.bytedance.android.livesdk.chatroom.model.b.e> list;
            com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = this.f11814a.f11804d;
            if (dVar == null || (list = dVar.f11074b) == null) {
                list = new ArrayList();
            }
            ArrayList<com.bytedance.android.livesdk.chatroom.model.b.e> arrayList = new ArrayList();
            for (com.bytedance.android.livesdk.chatroom.model.b.e eVar : list) {
                if (eVar.f15724e == 2) {
                    arrayList.add(eVar);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (com.bytedance.android.livesdk.chatroom.model.b.e eVar2 : arrayList) {
                Iterator<com.bytedance.android.live.liveinteract.multiguest.g.b.a> it = this.f11814a.f11803c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.bytedance.android.live.liveinteract.multiguest.g.b.a next = it.next();
                    if (TextUtils.equals(eVar2.a(), next.getPresenter().c())) {
                        arrayList2.add(next);
                        this.f11814a.f11803c.remove(next);
                        break;
                    }
                }
            }
            arrayList2.addAll(this.f11814a.f11803c);
            this.f11814a.f11803c = arrayList2;
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11814a.f11809i;
            if (aVar == null) {
                l.a("mDataHolder");
            }
            aVar.f11297g = this.f11814a.f11803c.size();
            this.f11814a.f();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(c cVar) {
            this.f11814a = cVar;
        }

        @Override // com.bytedance.android.live.liveinteract.multiguest.a.c.d.a
        public final void a(long j2, String str) {
            com.bytedance.android.live.liveinteract.multiguest.g.b.a a2;
            l.d(str, "");
            if (this.f11814a.f11807g && (a2 = this.f11814a.a(j2, str)) != null) {
                a2.c();
            }
        }
    }

    private final void h() {
        List<com.bytedance.android.livesdk.chatroom.model.b.e> list;
        com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = this.f11804d;
        if (dVar != null) {
            List<com.bytedance.android.livesdk.chatroom.model.b.e> i2 = dVar.i();
            ArrayList arrayList = new ArrayList();
            for (T t2 : i2) {
                if (!this.u.contains(t2)) {
                    arrayList.add(t2);
                }
            }
            this.v.addAll(arrayList);
        }
        List<com.bytedance.android.livesdk.chatroom.model.b.e> list2 = this.u;
        ArrayList arrayList2 = new ArrayList();
        for (T t3 : list2) {
            com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar2 = this.f11804d;
            if (dVar2 == null || (list = dVar2.i()) == null) {
                list = z.INSTANCE;
            }
            if (!list.contains(t3)) {
                arrayList2.add(t3);
            }
        }
        this.v.removeAll(arrayList2);
        this.u.clear();
        com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar3 = this.f11804d;
        if (dVar3 != null) {
            this.u.addAll(dVar3.i());
        }
        DataChannel dataChannel = this.f11808h;
        if (dataChannel == null) {
            l.a("mDataChannel");
        }
        dataChannel.b(j.class, Integer.valueOf(this.v.size()));
    }

    /* access modifiers changed from: package-private */
    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f11815a;

        static {
            Covode.recordClassIndex(6443);
        }

        e(c cVar) {
            this.f11815a = cVar;
        }

        public final void run() {
            final int i2;
            int i3;
            ViewGroup.LayoutParams layoutParams;
            final int size = this.f11815a.f11803c.size();
            int i4 = 0;
            float f2 = 2.14748365E9f;
            for (int i5 = 0; i5 < size; i5++) {
                com.bytedance.android.live.liveinteract.multiguest.g.b.a aVar = this.f11815a.f11803c.get(i5);
                if (aVar != null && aVar.getY() < f2) {
                    f2 = aVar.getY();
                }
            }
            if (2.14748365E9f == f2 || f2 < 10.0f) {
                i2 = this.f11815a.f11806f;
            } else {
                i2 = (int) (((this.f11815a.f11811k.getY() + ((float) this.f11815a.f11811k.getHeight())) - f2) + ((float) this.f11815a.f11805e));
            }
            if (!LiveAppBundleUtils.isPluginAvailable(com.bytedance.android.livesdk.utils.b.LINK_MIC)) {
                LiveAppBundleUtils.ensurePluginAvailable(this.f11815a.f11801a, com.bytedance.android.livesdk.utils.b.LINK_MIC);
                TextView textView = this.f11815a.f11802b;
                if (textView != null) {
                    textView.setVisibility(4);
                }
                v.b();
                if (size > 0) {
                    i4 = this.f11815a.f11805e;
                }
                c.a(this.f11815a).b(i.class, new com.bytedance.android.live.liveinteract.api.b.j(size, i2 + i4));
                return;
            }
            c cVar = this.f11815a;
            com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = cVar.f11804d;
            if (dVar != null) {
                i3 = dVar.f();
            } else {
                i3 = 0;
            }
            TextView textView2 = cVar.f11802b;
            if (textView2 == null) {
                l.b();
            }
            Context context = textView2.getContext();
            l.b(context, "");
            String quantityString = context.getResources().getQuantityString(R.plurals.fm, i3, Integer.valueOf(i3));
            l.b(quantityString, "");
            com.bytedance.android.live.core.f.f.a(R.string.e55, Integer.valueOf(i3));
            TextView textView3 = cVar.f11802b;
            if (textView3 == null) {
                l.b();
            }
            textView3.setText(quantityString);
            TextView textView4 = cVar.f11802b;
            if (textView4 == null) {
                l.b();
            }
            textView4.setOnClickListener(cVar.f11810j);
            TextView textView5 = cVar.f11802b;
            if (textView5 == null) {
                l.b();
            }
            textView5.setVisibility(0);
            TextView textView6 = this.f11815a.f11802b;
            if (textView6 != null) {
                layoutParams = textView6.getLayoutParams();
            } else {
                layoutParams = null;
            }
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = i2;
            TextView textView7 = this.f11815a.f11802b;
            if (textView7 != null) {
                textView7.setLayoutParams(layoutParams2);
            }
            TextView textView8 = this.f11815a.f11802b;
            if (textView8 != null) {
                textView8.post(new Runnable(this) {
                    /* class com.bytedance.android.live.liveinteract.multilive.e.c.e.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ e f11816a;

                    static {
                        Covode.recordClassIndex(6444);
                    }

                    {
                        this.f11816a = r1;
                    }

                    public final void run() {
                        int i2;
                        TextView textView = this.f11816a.f11815a.f11802b;
                        if (textView != null && textView.getVisibility() == 0) {
                            TextView textView2 = this.f11816a.f11815a.f11802b;
                            if (textView2 == null) {
                                l.b();
                            }
                            i2 = textView2.getHeight() + this.f11816a.f11815a.f11805e;
                        } else if (size > 0) {
                            i2 = this.f11816a.f11815a.f11805e;
                        } else {
                            i2 = 0;
                        }
                        c.a(this.f11816a.f11815a).b(i.class, new com.bytedance.android.live.liveinteract.api.b.j(size, i2 + i2));
                    }
                });
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final void b(boolean z) {
        this.t = z;
    }

    public static final /* synthetic */ DataChannel a(c cVar) {
        DataChannel dataChannel = cVar.f11808h;
        if (dataChannel == null) {
            l.a("mDataChannel");
        }
        return dataChannel;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final void b(String str) {
        l.d(str, "");
        this.x.a(0, str);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final void d(String str) {
        l.d(str, "");
        this.x.a(0, str);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.e.c$c  reason: collision with other inner class name */
    static final class View$OnClickListenerC0245c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f11813a;

        static {
            Covode.recordClassIndex(6441);
        }

        View$OnClickListenerC0245c(c cVar) {
            this.f11813a = cVar;
        }

        public final void onClick(View view) {
            if (c.a(this.f11813a) != null) {
                o.a("connection_request");
                c.a(this.f11813a).c(com.bytedance.android.live.liveinteract.api.l.class, new q(0));
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final void a(DataChannel dataChannel) {
        l.d(dataChannel, "");
        this.f11808h = dataChannel;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final int e(String str) {
        l.d(str, "");
        com.bytedance.android.live.liveinteract.multiguest.g.b.a a2 = a(0, str);
        if (a2 != null) {
            return a2.getPosInMultiLive();
        }
        return -1;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final int f(String str) {
        l.d(str, "");
        com.bytedance.android.live.liveinteract.multilive.anchor.f.e g2 = g();
        l.d(str, "");
        int i2 = 0;
        for (T t2 : g2.a()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                h.a.n.a();
            }
            T t3 = t2;
            if ((t3 instanceof com.bytedance.android.live.liveinteract.multiguest.g.b.a) && l.a((Object) t3.getInteractId(), (Object) str)) {
                return i3;
            }
            i2 = i3;
        }
        return -1;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.b.a.AbstractC0218a
    public final void a(com.bytedance.android.live.liveinteract.multiguest.g.b.a aVar) {
        l.d(aVar, "");
        if (l.a(aVar, this.n)) {
            this.n = null;
        }
        g().a(aVar);
        this.f11803c.remove(aVar);
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = this.f11809i;
        if (aVar2 == null) {
            l.a("mDataHolder");
        }
        aVar2.f11297g = this.f11803c.size();
        f();
        DataChannel dataChannel = this.f11808h;
        if (dataChannel == null) {
            l.a("mDataChannel");
        }
        dataChannel.c(com.bytedance.android.live.liveinteract.multilive.anchor.b.c.class);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final com.bytedance.android.live.liveinteract.multiguest.g.b.a c(String str) {
        boolean z;
        int i2;
        l.d(str, "");
        if (!this.f11807g || TextUtils.isEmpty(str)) {
            return null;
        }
        com.bytedance.android.live.liveinteract.multiguest.g.b.a a2 = a(0, str);
        if (a2 != null) {
            a(a2);
            z = true;
        } else {
            z = false;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        b.a a3 = this.r.a(str);
        Context context = this.f11801a;
        l.b(a3, "");
        DataChannel dataChannel = this.f11808h;
        if (dataChannel == null) {
            l.a("mDataChannel");
        }
        com.bytedance.android.live.liveinteract.multiguest.g.b.b bVar = new com.bytedance.android.live.liveinteract.multiguest.g.b.b(context, str, a3, this, dataChannel, g().b());
        bVar.setCurrentUserIsLinkedGuest(false);
        if (!z) {
            bVar.f11243i = true;
        }
        int b2 = g.a.f14199a.b(str);
        com.bytedance.android.live.liveinteract.multilive.anchor.f.e g2 = g();
        l.d(bVar, "");
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = g2.f11649c;
        if (aVar == null) {
            l.a("mDataHolder");
        }
        com.bytedance.android.livesdk.chatroom.model.c.a aVar2 = aVar.f11299i;
        int i3 = -1;
        if (aVar2 != null) {
            i2 = aVar2.f15740a;
        } else {
            i2 = -1;
        }
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar3 = g2.f11649c;
        if (aVar3 == null) {
            l.a("mDataHolder");
        }
        com.bytedance.android.livesdk.chatroom.model.c.a aVar4 = aVar3.f11299i;
        if (aVar4 != null) {
            i3 = aVar4.f15741b;
        }
        g2.a(com.bytedance.android.live.liveinteract.multilive.anchor.e.c.a(i2, i3));
        b bVar2 = g2.f11648b;
        if (bVar2 != null) {
            bVar.setPosInMultiLive(bVar2.a(bVar, b2));
            g2.a().add(bVar);
        }
        this.f11803c.add(bVar);
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar5 = this.f11809i;
        if (aVar5 == null) {
            l.a("mDataHolder");
        }
        aVar5.f11297g = this.f11803c.size();
        this.x.a();
        return bVar;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final void a(boolean z) {
        MethodCollector.i(9346);
        com.bytedance.android.livesdk.an.a a2 = com.bytedance.android.livesdk.an.a.a();
        k kVar = new k(true);
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11809i;
        if (aVar == null) {
            l.a("mDataHolder");
        }
        kVar.f9999b = aVar.f11298h;
        a2.a(kVar);
        DataChannel dataChannel = this.f11808h;
        if (dataChannel == null) {
            l.a("mDataChannel");
        }
        k kVar2 = new k(true);
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = this.f11809i;
        if (aVar2 == null) {
            l.a("mDataHolder");
        }
        kVar2.f9999b = aVar2.f11298h;
        l.b(kVar2, "");
        dataChannel.b(com.bytedance.android.live.liveinteract.api.h.class, kVar2);
        this.f11807g = true;
        View a3 = com.a.a(LayoutInflater.from(this.f11811k.getContext()), R.layout.bf2, this.f11811k, false);
        if (a3 != null) {
            TextView textView = (TextView) a3;
            this.f11802b = textView;
            if (textView == null) {
                l.b();
            }
            textView.setVisibility(4);
            this.f11811k.addView(this.f11802b);
            com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = this.f11804d;
            if (dVar != null) {
                dVar.a(this.x);
            }
            this.r.a();
            com.bytedance.android.live.liveinteract.platform.common.g.h.a("connection_request");
            f();
            com.bytedance.android.live.liveinteract.multilive.anchor.f.e g2 = g();
            FrameLayout frameLayout = this.f11811k;
            l.d(frameLayout, "");
            g2.f11647a = frameLayout;
            g();
            MethodCollector.o(9346);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        MethodCollector.o(9346);
        throw nullPointerException;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.android.live.liveinteract.multiguest.g.b.a a(long r6, java.lang.String r8) {
        /*
            r5 = this;
            java.util.List<com.bytedance.android.live.liveinteract.multiguest.g.b.a> r0 = r5.f11803c
            java.util.Iterator r4 = r0.iterator()
        L_0x0006:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r3 = r4.next()
            com.bytedance.android.live.liveinteract.multiguest.g.b.a r3 = (com.bytedance.android.live.liveinteract.multiguest.g.b.a) r3
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0025
            com.bytedance.android.live.liveinteract.multiguest.a.b.b$a r0 = r3.getPresenter()
            long r1 = r0.b()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0025
            return r3
        L_0x0025:
            com.bytedance.android.live.liveinteract.multiguest.a.b.b$a r0 = r3.getPresenter()
            java.lang.String r0 = r0.c()
            boolean r0 = android.text.TextUtils.equals(r0, r8)
            if (r0 == 0) goto L_0x0006
            return r3
        L_0x0034:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multilive.e.c.a(long, java.lang.String):com.bytedance.android.live.liveinteract.multiguest.g.b.a");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final void a(String str, SurfaceView surfaceView) {
        MethodCollector.i(9674);
        l.d(str, "");
        l.d(surfaceView, "");
        if (!this.f11807g) {
            MethodCollector.o(9674);
            return;
        }
        com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
        l.b(a2, "");
        if (TextUtils.equals(str, a2.f14184e)) {
            surfaceView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            FrameLayout frameLayout = this.f11812m;
            if (frameLayout == null) {
                l.b();
            }
            frameLayout.removeAllViews();
            this.f11812m.addView(surfaceView);
            this.f11812m.setVisibility(0);
            com.bytedance.android.livesdk.b.a.d.a().s = surfaceView;
            MethodCollector.o(9674);
            return;
        }
        com.bytedance.android.live.liveinteract.multiguest.g.b.a a3 = a(0, str);
        if (a3 == null && (a3 = c(str)) == null) {
            MethodCollector.o(9674);
            return;
        }
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.o, this.p));
        surfaceView.setZOrderMediaOverlay(true);
        a3.a(surfaceView);
        MethodCollector.o(9674);
    }

    public c(Room room, FrameLayout frameLayout, com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar) {
        l.d(room, "");
        l.d(frameLayout, "");
        l.d(dVar, "");
        this.f11811k = frameLayout;
        Context context = frameLayout.getContext();
        l.b(context, "");
        this.f11801a = context;
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(this);
        this.w = h.i.a((h.f.a.a) new b(this));
        this.x = new d(this);
        this.f11810j = new View$OnClickListenerC0245c(this);
        this.s = room;
        this.f11812m = null;
        this.f11804d = dVar;
        this.r = new f(room, dVar, this);
        Resources resources = context.getResources();
        this.o = resources.getDimensionPixelSize(R.dimen.wg);
        this.p = resources.getDimensionPixelSize(R.dimen.wf);
        this.f11805e = (int) com.bytedance.common.utility.n.b(context, 4.0f);
        this.f11806f = (int) com.bytedance.common.utility.n.b(context, 52.0f);
        this.q = (int) com.bytedance.common.utility.n.b(context, 12.0f);
    }
}
