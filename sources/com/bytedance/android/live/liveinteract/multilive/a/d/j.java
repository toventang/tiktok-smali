package com.bytedance.android.live.liveinteract.multilive.a.d;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.d;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.aa;
import com.bytedance.android.live.liveinteract.api.ab;
import com.bytedance.android.live.liveinteract.api.ad;
import com.bytedance.android.live.liveinteract.api.x;
import com.bytedance.android.live.liveinteract.multiguest.a.b.a;
import com.bytedance.android.live.liveinteract.multiguest.a.d.a;
import com.bytedance.android.live.liveinteract.multiguest.a.f.g;
import com.bytedance.android.live.liveinteract.multiguest.g.a.a;
import com.bytedance.android.livesdk.b.a.g;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiLiveServerAutoJoinChannel;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class j extends m implements a.b, g.a, com.bytedance.android.live.liveinteract.multilive.a.b.b {

    /* renamed from: j  reason: collision with root package name */
    public static final a f11526j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public v f11527a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f11528b;

    /* renamed from: c  reason: collision with root package name */
    public final j.a.a.f f11529c;

    /* renamed from: d  reason: collision with root package name */
    public DataChannel f11530d;

    /* renamed from: e  reason: collision with root package name */
    public a.EnumC0216a f11531e;

    /* renamed from: f  reason: collision with root package name */
    public a.AbstractC0206a f11532f;

    /* renamed from: g  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c f11533g;

    /* renamed from: h  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multilive.a.a.i f11534h;
    @com.bytedance.android.live.liveinteract.api.c.d(a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: i  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.opt.a.a f11535i;

    /* renamed from: k  reason: collision with root package name */
    private LiveButton f11536k;

    /* renamed from: l  reason: collision with root package name */
    private LiveTextView f11537l;

    /* renamed from: m  reason: collision with root package name */
    private com.bytedance.android.live.liveinteract.multiguest.a.d.a f11538m;
    private a.C0211a n;
    private com.bytedance.android.live.liveinteract.multilive.a.f.a o;
    private ImageView p;
    private View q;
    private View r;
    private com.bytedance.android.livesdk.l.b s;
    private HashMap t;

    static {
        Covode.recordClassIndex(6231);
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.a.d.m
    public final void j() {
        HashMap hashMap = this.t;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, com.bytedance.android.live.liveinteract.multilive.a.d.m, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        j();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(6232);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(6244);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.h();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.g.a
    public final void a() {
        v vVar = this.f11527a;
        if (vVar != null) {
            vVar.dismiss();
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(6245);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            v vVar = this.this$0.f11527a;
            if (vVar != null) {
                vVar.dismiss();
            }
            return z.f158842a;
        }
    }

    private j() {
        this.f11529c = new j.a.a.f();
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(this);
    }

    public final com.bytedance.android.live.liveinteract.multiguest.opt.a.a b() {
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11535i;
        if (aVar == null) {
            h.f.b.l.a("mDataHolder");
        }
        return aVar;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.g.a
    public final void c() {
        i();
        v vVar = this.f11527a;
        if (vVar != null) {
            vVar.dismiss();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar = this.f11533g;
        if (cVar != null) {
            cVar.f11364l = null;
        }
    }

    private final void k() {
        if (l()) {
            View view = this.r;
            if (view != null) {
                view.setVisibility(0);
                return;
            }
            return;
        }
        View view2 = this.r;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    private static com.bytedance.android.livesdk.chatroom.model.b.e m() {
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room == null) {
            return null;
        }
        com.bytedance.android.livesdk.chatroom.model.b.e eVar = new com.bytedance.android.livesdk.chatroom.model.b.e();
        eVar.f15724e = 2;
        User owner = room.getOwner();
        if (owner == null) {
            return null;
        }
        eVar.f15722c = owner;
        return eVar;
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onResume() {
        com.bytedance.android.livesdk.util.rxutils.autodispose.ac<com.bytedance.android.live.network.response.d<com.bytedance.android.live.liveinteract.multilive.c.g>> s2;
        super.onResume();
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar = this.f11533g;
        if (cVar != null && (s2 = cVar.s()) != null) {
            s2.a(new n(this), new o(this));
        }
    }

    private static boolean l() {
        com.bytedance.android.live.liveinteract.api.a.c a2 = com.bytedance.android.live.liveinteract.api.a.c.a();
        h.f.b.l.b(a2, "");
        T t2 = a2.n;
        if (t2 == null || t2.intValue() != 0) {
            return false;
        }
        com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.cU;
        h.f.b.l.b(bVar, "");
        if (!bVar.a().booleanValue()) {
            return true;
        }
        return false;
    }

    private static com.bytedance.android.livesdk.chatroom.model.b.e n() {
        com.bytedance.android.live.liveinteract.api.a.c a2 = com.bytedance.android.live.liveinteract.api.a.c.a();
        h.f.b.l.b(a2, "");
        T t2 = a2.n;
        if (t2 == null || t2.intValue() != 2) {
            return null;
        }
        com.bytedance.android.livesdk.chatroom.model.b.e eVar = new com.bytedance.android.livesdk.chatroom.model.b.e();
        eVar.f15724e = 2;
        eVar.f15722c = d.a.a();
        return eVar;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        j.a.a.d dVar = new j.a.a.d();
        com.bytedance.android.livesdk.chatroom.model.b.e m2 = m();
        if (m2 != null) {
            dVar.add(m2);
        }
        if (n() != null) {
            dVar.add(n());
        }
        this.f11529c.a(dVar);
        this.f11529c.notifyDataSetChanged();
    }

    public final void h() {
        com.bytedance.android.live.liveinteract.multiguest.a.d.a aVar = this.f11538m;
        boolean z = true;
        if (aVar != null) {
            a.C0211a aVar2 = this.n;
            if (aVar2 == null) {
                h.f.b.l.a("checkParam");
            }
            if (aVar.a(aVar2)) {
                return;
            }
        }
        com.bytedance.android.live.liveinteract.platform.common.g.i.f();
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar3 = this.f11535i;
        if (aVar3 == null) {
            h.f.b.l.a("mDataHolder");
        }
        a.AbstractC0206a aVar4 = this.f11532f;
        if (aVar4 != null && aVar4.a() == 2) {
            z = false;
        }
        aVar3.f11294d = z;
        a.AbstractC0206a aVar5 = this.f11532f;
        if (aVar5 != null) {
            aVar5.a(this.f11534h);
        }
    }

    public final void d() {
        com.bytedance.android.live.liveinteract.api.a.c a2 = com.bytedance.android.live.liveinteract.api.a.c.a();
        h.f.b.l.b(a2, "");
        T t2 = a2.n;
        if (t2 != null && t2.intValue() == 0) {
            DataChannel a3 = com.bytedance.ies.sdk.datachannel.f.a(this);
            if (a3 != null) {
                com.bytedance.android.live.liveinteract.multilive.a.c.a aVar = com.bytedance.android.live.liveinteract.multilive.a.c.a.GUEST_PREVIEW;
                h.f.b.l.d(aVar, "");
                aVar.setGoNextPage(true);
                a3.b(com.bytedance.android.live.liveinteract.multilive.a.a.d.class, aVar);
            }
            View view = this.r;
            if (view != null) {
                view.setVisibility(8);
            }
            com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.cU;
            h.f.b.l.b(bVar, "");
            com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar, (Object) true);
        }
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        Room room;
        User owner;
        String str;
        com.bytedance.android.livesdk.l.b bVar;
        com.bytedance.android.livesdk.l.b bVar2 = this.s;
        if (!(bVar2 == null || !bVar2.isShowing() || (bVar = this.s) == null)) {
            bVar.dismiss();
        }
        String str2 = LinkApi.d.PANEL.value;
        String str3 = "";
        h.f.b.l.b(str2, str3);
        com.bytedance.android.live.liveinteract.platform.common.g.i.a(str2);
        DataChannel dataChannel = this.f11530d;
        if (!(dataChannel == null || (room = (Room) dataChannel.b(df.class)) == null || (owner = room.getOwner()) == null || (str = owner.displayId) == null)) {
            str3 = str;
        }
        String a2 = y.a((int) R.string.e0e, str3);
        b.a aVar = new b.a(getContext());
        aVar.f18284a = a2;
        this.s = aVar.b(R.string.e6n).a(R.string.ei8, (DialogInterface.OnClickListener) new e(this), false).b(R.string.eid, (DialogInterface.OnClickListener) f.f11543a, false).a();
        com.bytedance.android.live.liveinteract.platform.common.g.i.h();
        com.bytedance.android.livesdk.l.b bVar3 = this.s;
        if (bVar3 != null) {
            bVar3.show();
        }
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        com.bytedance.android.livesdk.l.b bVar;
        com.bytedance.android.livesdk.l.b bVar2 = this.s;
        if (!(bVar2 == null || !bVar2.isShowing() || (bVar = this.s) == null)) {
            bVar.dismiss();
        }
        com.bytedance.android.livesdk.l.b a2 = new b.a(getContext()).a(R.string.eqn).b(R.string.eqo).a(R.string.eqm, (DialogInterface.OnClickListener) new b(this), false).b(R.string.ei3, (DialogInterface.OnClickListener) c.f11540a, false).a();
        this.s = a2;
        if (a2 != null) {
            a2.show();
        }
    }

    public final void i() {
        k();
        com.bytedance.android.live.liveinteract.api.a.c a2 = com.bytedance.android.live.liveinteract.api.a.c.a();
        h.f.b.l.b(a2, "");
        T t2 = a2.n;
        if (t2 != null) {
            if (t2.intValue() == 0) {
                ImageView imageView = this.p;
                if (imageView != null) {
                    imageView.setBackgroundResource(2131234629);
                }
                ImageView imageView2 = this.p;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                if (this.f11531e == a.EnumC0216a.GO_LIVE) {
                    LiveButton liveButton = this.f11536k;
                    if (liveButton == null) {
                        h.f.b.l.a("connectSwitchBtn");
                    }
                    liveButton.setText(y.a((int) R.string.glq));
                    LiveButton liveButton2 = this.f11536k;
                    if (liveButton2 == null) {
                        h.f.b.l.a("connectSwitchBtn");
                    }
                    liveButton2.b(R.style.sv);
                    return;
                }
                LiveButton liveButton3 = this.f11536k;
                if (liveButton3 == null) {
                    h.f.b.l.a("connectSwitchBtn");
                }
                liveButton3.b(R.style.sv);
                LiveButton liveButton4 = this.f11536k;
                if (liveButton4 == null) {
                    h.f.b.l.a("connectSwitchBtn");
                }
                liveButton4.setText(y.a((int) R.string.els));
                LiveTextView liveTextView = this.f11537l;
                if (liveTextView == null) {
                    h.f.b.l.a("descTV");
                }
                liveTextView.setVisibility(0);
            } else if (t2 != null) {
                if (t2.intValue() == 2) {
                    ImageView imageView3 = this.p;
                    if (imageView3 != null) {
                        imageView3.setVisibility(8);
                    }
                    LiveButton liveButton5 = this.f11536k;
                    if (liveButton5 == null) {
                        h.f.b.l.a("connectSwitchBtn");
                    }
                    liveButton5.b(R.style.t1);
                    LiveButton liveButton6 = this.f11536k;
                    if (liveButton6 == null) {
                        h.f.b.l.a("connectSwitchBtn");
                    }
                    liveButton6.setText(y.a((int) R.string.e05));
                    LiveTextView liveTextView2 = this.f11537l;
                    if (liveTextView2 == null) {
                        h.f.b.l.a("descTV");
                    }
                    liveTextView2.setVisibility(8);
                } else if (t2.intValue() == 1) {
                    ImageView imageView4 = this.p;
                    if (imageView4 != null) {
                        imageView4.setBackgroundResource(2131234628);
                    }
                    ImageView imageView5 = this.p;
                    if (imageView5 != null) {
                        imageView5.setVisibility(0);
                    }
                    LiveButton liveButton7 = this.f11536k;
                    if (liveButton7 == null) {
                        h.f.b.l.a("connectSwitchBtn");
                    }
                    liveButton7.b(R.style.t1);
                    LiveButton liveButton8 = this.f11536k;
                    if (liveButton8 == null) {
                        h.f.b.l.a("connectSwitchBtn");
                    }
                    liveButton8.setText(y.a((int) R.string.ds2));
                    LiveTextView liveTextView3 = this.f11537l;
                    if (liveTextView3 == null) {
                        h.f.b.l.a("descTV");
                    }
                    liveTextView3.setVisibility(0);
                }
            }
        }
    }

    public /* synthetic */ j(byte b2) {
        this();
    }

    public static final class d implements com.bytedance.android.livesdk.ah.b.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f11541a;

        static {
            Covode.recordClassIndex(6235);
        }

        @Override // com.bytedance.android.livesdk.ah.b.d
        public final void b(String... strArr) {
            h.f.b.l.d(strArr, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(j jVar) {
            this.f11541a = jVar;
        }

        @Override // com.bytedance.android.livesdk.ah.b.d
        public final void a(String... strArr) {
            h.f.b.l.d(strArr, "");
            this.f11541a.h();
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f11544a;

        static {
            Covode.recordClassIndex(6238);
        }

        g(j jVar) {
            this.f11544a = jVar;
        }

        public final void onClick(View view) {
            this.f11544a.d();
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f11545a;

        static {
            Covode.recordClassIndex(6239);
        }

        h(j jVar) {
            this.f11545a = jVar;
        }

        public final void onClick(View view) {
            this.f11545a.d();
        }
    }

    static final class o<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f11549a;

        static {
            Covode.recordClassIndex(6247);
        }

        o(j jVar) {
            this.f11549a = jVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f11549a.e();
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<String, z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(6242);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(j jVar) {
            super(1);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            h.f.b.l.d(str, "");
            RecyclerView recyclerView = this.this$0.f11528b;
            if (recyclerView == null) {
                h.f.b.l.a("listView");
            }
            recyclerView.postDelayed(new Runnable(this) {
                /* class com.bytedance.android.live.liveinteract.multilive.a.d.j.k.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ k f11547a;

                static {
                    Covode.recordClassIndex(6243);
                }

                {
                    this.f11547a = r1;
                }

                public final void run() {
                    this.f11547a.this$0.f11529c.notifyDataSetChanged();
                }
            }, 500);
            return z.f158842a;
        }
    }

    static final class n<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f11548a;

        static {
            Covode.recordClassIndex(6246);
        }

        n(j jVar) {
            this.f11548a = jVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.liveinteract.multilive.c.g gVar;
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            if (dVar != null && (gVar = (com.bytedance.android.live.liveinteract.multilive.c.g) dVar.data) != null) {
                this.f11548a.a(com.bytedance.android.live.liveinteract.multiguest.a.c.e.a(gVar.f11760a, 2), com.bytedance.android.live.liveinteract.multiguest.a.c.e.a(gVar.f11761b, 1));
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.a.b
    public final void a(String str) {
        v vVar = this.f11527a;
        if (vVar != null) {
            vVar.dismiss();
        }
        ao.a(y.e(), (int) R.string.e5a);
        DataChannel dataChannel = this.f11530d;
        if (dataChannel != null) {
            if (str == null) {
                str = "";
            }
            dataChannel.c(x.class, str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.a.b
    public final void b(Throwable th) {
        DataChannel dataChannel = this.f11530d;
        if (dataChannel != null) {
            dataChannel.c(aa.class, "");
        }
        com.bytedance.android.livesdk.utils.f.a(y.e(), th);
        v vVar = this.f11527a;
        if (vVar != null) {
            vVar.dismiss();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.g.a
    public final void c(Throwable th) {
        com.bytedance.android.livesdk.utils.f.a(getContext(), th, (int) R.string.grp);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.d.j$j  reason: collision with other inner class name */
    static final class C0227j extends h.f.b.m implements h.f.a.b<List<? extends com.bytedance.android.livesdk.chatroom.model.b.e>, z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(6241);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0227j(j jVar) {
            super(1);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends com.bytedance.android.livesdk.chatroom.model.b.e> list) {
            List<? extends com.bytedance.android.livesdk.chatroom.model.b.e> list2 = list;
            h.f.b.l.d(list2, "");
            j jVar = this.this$0;
            ArrayList arrayList = new ArrayList();
            for (T t : list2) {
                if (t.f15724e == 2) {
                    arrayList.add(t);
                }
            }
            jVar.a(arrayList, j.a(list2));
            this.this$0.i();
            return z.f158842a;
        }
    }

    public static List<com.bytedance.android.livesdk.chatroom.model.b.e> a(List<? extends com.bytedance.android.livesdk.chatroom.model.b.e> list) {
        ArrayList arrayList = new ArrayList();
        for (T t2 : list) {
            if (t2.f15724e == 1) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f11546a;

        static {
            Covode.recordClassIndex(6240);
        }

        i(j jVar) {
            this.f11546a = jVar;
        }

        public final void onClick(View view) {
            j jVar = this.f11546a;
            com.bytedance.android.live.liveinteract.api.a.c a2 = com.bytedance.android.live.liveinteract.api.a.c.a();
            h.f.b.l.b(a2, "");
            T t = a2.n;
            a.EnumC0216a aVar = jVar.f11531e;
            if (aVar != null) {
                int i2 = k.f11550a[aVar.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2 || t == null) {
                        return;
                    }
                    if (t.intValue() == 0) {
                        if (com.bytedance.android.livesdk.b.a.d.a().u >= com.bytedance.android.livesdk.b.a.d.a().x) {
                            ao.a(y.e(), (int) R.string.e_g);
                            v vVar = jVar.f11527a;
                            if (vVar != null) {
                                vVar.dismiss();
                                return;
                            }
                            return;
                        }
                        com.bytedance.android.livesdk.b.a.d a3 = com.bytedance.android.livesdk.b.a.d.a();
                        h.f.b.l.b(a3, "");
                        a3.a(true);
                        a.AbstractC0206a aVar2 = jVar.f11532f;
                        if (aVar2 != null) {
                            aVar2.a(true);
                        }
                        DataChannel dataChannel = jVar.f11530d;
                        if (dataChannel != null) {
                            dataChannel.c(ad.class, "");
                        }
                        com.bytedance.android.live.liveinteract.api.a.c.a().a((Integer) 1);
                    } else if (t.intValue() == 2) {
                        jVar.f();
                    } else if (t.intValue() == 1) {
                        jVar.g();
                    }
                } else if (t != null) {
                    if (t.intValue() == 0) {
                        a.AbstractC0206a aVar3 = jVar.f11532f;
                        if (aVar3 != null && !aVar3.e()) {
                            com.bytedance.android.livesdk.ah.f.a(jVar.getActivity()).a(new d(jVar), "android.permission.RECORD_AUDIO", "android.permission.CAMERA");
                        }
                    } else if (t.intValue() == 2) {
                        jVar.f();
                    } else if (t.intValue() == 1) {
                        jVar.g();
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.a.b
    public final void a(Throwable th) {
        com.bytedance.android.livesdk.utils.f.a(getContext(), th, (int) R.string.gra);
    }

    /* access modifiers changed from: package-private */
    public static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final c f11540a = new c();

        static {
            Covode.recordClassIndex(6234);
        }

        c() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            h.f.b.l.d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final f f11543a = new f();

        static {
            Covode.recordClassIndex(6237);
        }

        f() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            h.f.b.l.d(dialogInterface, "");
            com.bytedance.android.live.liveinteract.platform.common.g.i.b(0);
            dialogInterface.dismiss();
        }
    }

    public final void a(a.EnumC0216a aVar, com.bytedance.android.live.liveinteract.multilive.a.a.i iVar) {
        this.f11531e = aVar;
        this.f11534h = iVar;
    }

    /* access modifiers changed from: package-private */
    public static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f11539a;

        static {
            Covode.recordClassIndex(6233);
        }

        b(j jVar) {
            this.f11539a = jVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            h.f.b.l.d(dialogInterface, "");
            dialogInterface.dismiss();
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar = this.f11539a.f11533g;
            if (cVar != null) {
                cVar.f("leave_source_user_click_cancel");
            }
            com.bytedance.android.live.liveinteract.platform.common.g.b.a(this.f11539a.b().q);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f11542a;

        static {
            Covode.recordClassIndex(6236);
        }

        e(j jVar) {
            this.f11542a = jVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            h.f.b.l.d(dialogInterface, "");
            com.bytedance.android.live.liveinteract.platform.common.g.i.b(1);
            dialogInterface.dismiss();
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar = this.f11542a.f11533g;
            if (cVar != null) {
                cVar.c("leave_normally", false);
            }
            com.bytedance.android.live.liveinteract.platform.common.g.g.a("guest_over", this.f11542a.b().q);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.a.b
    public final void a(com.bytedance.android.livesdk.chatroom.interact.model.e eVar, boolean z) {
        long j2;
        h.f.b.l.d(eVar, "");
        com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
        h.f.b.l.b(a2, "");
        a2.f14184e = eVar.f15601m;
        com.bytedance.android.livesdk.b.a.g gVar = g.a.f14199a;
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            j2 = room.getOwnerUserId();
        } else {
            j2 = 0;
        }
        gVar.a(j2, eVar.f15601m);
        if (z) {
            DataChannel dataChannel = this.f11530d;
            if (dataChannel != null) {
                dataChannel.c(ab.class, Boolean.valueOf(z));
            }
            if (MultiLiveServerAutoJoinChannel.INSTANCE.getValue() && eVar.o) {
                com.bytedance.android.livesdk.chatroom.model.c.b bVar = new com.bytedance.android.livesdk.chatroom.model.c.b();
                bVar.f15744a = eVar.o;
                bVar.f15745b = eVar.p;
                bVar.f15746c = eVar.q;
                DataChannel dataChannel2 = this.f11530d;
                if (dataChannel2 != null) {
                    dataChannel2.b(com.bytedance.android.live.liveinteract.api.ac.class, bVar);
                }
            }
        }
        v vVar = this.f11527a;
        if (vVar != null) {
            vVar.dismiss();
        }
    }

    public final void a(List<? extends com.bytedance.android.livesdk.chatroom.model.b.e> list, List<? extends com.bytedance.android.livesdk.chatroom.model.b.e> list2) {
        long j2;
        if ((list == null || list.isEmpty()) && (list2 == null || list2.isEmpty())) {
            e();
            return;
        }
        j.a.a.d dVar = new j.a.a.d();
        dVar.add(m());
        if (list != null && !list.isEmpty()) {
            for (T t2 : list) {
                User user = t2.f15722c;
                h.f.b.l.b(user, "");
                long id = user.getId();
                Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
                if (room != null) {
                    j2 = room.getOwnerUserId();
                } else {
                    j2 = 0;
                }
                if (id != j2) {
                    t2.f15724e = 2;
                    dVar.add(t2);
                }
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            dVar.add(new com.bytedance.android.live.liveinteract.multilive.a.e.a(list2.size()));
            for (T t3 : list2) {
                t3.f15724e = 1;
                dVar.add(t3);
            }
        }
        this.f11529c.a(dVar);
        this.f11529c.notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        this.f11538m = new com.bytedance.android.live.liveinteract.multiguest.a.d.b();
        View a2 = com.a.a(layoutInflater, R.layout.b9p, viewGroup, false);
        h.f.b.l.b(a2, "");
        this.q = a2;
        if (a2 == null) {
            h.f.b.l.a("mRootView");
        }
        this.r = a2.findViewById(R.id.c4y);
        k();
        View view = this.r;
        if (view != null) {
            view.setOnClickListener(new g(this));
        }
        View view2 = this.q;
        if (view2 == null) {
            h.f.b.l.a("mRootView");
        }
        ImageView imageView = (ImageView) view2.findViewById(R.id.buc);
        this.p = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new h(this));
        }
        View view3 = this.q;
        if (view3 == null) {
            h.f.b.l.a("mRootView");
        }
        View findViewById = view3.findViewById(R.id.akl);
        h.f.b.l.b(findViewById, "");
        this.f11537l = (LiveTextView) findViewById;
        View view4 = this.q;
        if (view4 == null) {
            h.f.b.l.a("mRootView");
        }
        View findViewById2 = view4.findViewById(R.id.alq);
        h.f.b.l.b(findViewById2, "");
        RecyclerView recyclerView = (RecyclerView) findViewById2;
        this.f11528b = recyclerView;
        if (recyclerView == null) {
            h.f.b.l.a("listView");
        }
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        this.f11529c.a(com.bytedance.android.livesdk.chatroom.model.b.e.class, new com.bytedance.android.live.liveinteract.multilive.a.g.c());
        this.f11529c.a(com.bytedance.android.live.liveinteract.multilive.a.e.a.class, new com.bytedance.android.live.liveinteract.multilive.a.g.d());
        RecyclerView recyclerView2 = this.f11528b;
        if (recyclerView2 == null) {
            h.f.b.l.a("listView");
        }
        recyclerView2.setAdapter(this.f11529c);
        View view5 = this.q;
        if (view5 == null) {
            h.f.b.l.a("mRootView");
        }
        View findViewById3 = view5.findViewById(R.id.acu);
        h.f.b.l.b(findViewById3, "");
        LiveButton liveButton = (LiveButton) findViewById3;
        this.f11536k = liveButton;
        if (liveButton == null) {
            h.f.b.l.a("connectSwitchBtn");
        }
        liveButton.setOnClickListener(new i(this));
        com.bytedance.android.live.liveinteract.multilive.a.f.a aVar = new com.bytedance.android.live.liveinteract.multilive.a.f.a();
        this.o = aVar;
        aVar.a(this);
        a.AbstractC0206a aVar2 = this.f11532f;
        if (aVar2 != null) {
            aVar2.a(this);
        }
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar = this.f11533g;
        if (cVar != null) {
            cVar.f11364l = this;
        }
        i();
        DataChannel dataChannel = this.f11530d;
        if (dataChannel != null) {
            dataChannel.a((androidx.lifecycle.m) this, com.bytedance.android.live.liveinteract.multilive.a.a.k.class, (h.f.a.b) new C0227j(this)).a((androidx.lifecycle.m) this, com.bytedance.android.live.liveinteract.platform.common.c.e.class, (h.f.a.b) new k(this));
        }
        this.n = new a.C0211a(getContext(), this.f11530d, new l(this), new m(this));
        View view6 = this.q;
        if (view6 == null) {
            h.f.b.l.a("mRootView");
        }
        return view6;
    }
}
