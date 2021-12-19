package com.bytedance.android.live.liveinteract.cohost.ui.c;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ab;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.cohost.a.a.b;
import com.bytedance.android.live.liveinteract.cohost.a.a.d;
import com.bytedance.android.live.liveinteract.cohost.a.a.e;
import com.bytedance.android.live.liveinteract.cohost.a.c.a;
import com.bytedance.android.live.liveinteract.cohost.a.d.w;
import com.bytedance.android.live.liveinteract.cohost.ui.e.a;
import com.bytedance.android.live.liveinteract.cohost.ui.e.d;
import com.bytedance.android.live.liveinteract.cohost.ui.e.e;
import com.bytedance.android.live.liveinteract.cohost.ui.view.PkInviteUserListRefreshLayout;
import com.bytedance.android.live.liveinteract.cohost.ui.view.RandomLinkMicEntranceButton;
import com.bytedance.android.live.liveinteract.platform.common.g.y;
import com.bytedance.android.livesdk.chatroom.interact.model.i;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCoHostInviteePanelDismissSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class b extends b.AbstractC0158b implements a.b, com.bytedance.android.live.liveinteract.cohost.ui.e.a.a, d.a, e.b {

    /* renamed from: j  reason: collision with root package name */
    public static final a f10312j = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public View f10313d;

    /* renamed from: e  reason: collision with root package name */
    public final j.a.a.f f10314e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10315f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f10316g;

    /* renamed from: h  reason: collision with root package name */
    public DataChannel f10317h;

    /* renamed from: i  reason: collision with root package name */
    f.a.b.b f10318i;

    /* renamed from: k  reason: collision with root package name */
    private y f10319k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f10320l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f10321m;
    private final h.h n;
    private final h.h o;
    private final h.h p;
    private final h.h q;
    private HashMap r;

    static {
        Covode.recordClassIndex(5432);
    }

    private final View i() {
        return (View) this.f10321m.getValue();
    }

    private final RecyclerView j() {
        return (RecyclerView) this.n.getValue();
    }

    private final View k() {
        return (View) this.o.getValue();
    }

    private final PkInviteUserListRefreshLayout l() {
        return (PkInviteUserListRefreshLayout) this.p.getValue();
    }

    public final View c() {
        return (View) this.f10320l.getValue();
    }

    public final RandomLinkMicEntranceButton e() {
        return (RandomLinkMicEntranceButton) this.q.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(5433);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<View> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(5436);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return b.a(this.this$0).findViewById(R.id.c5m);
        }
    }

    static final class d extends m implements h.f.a.a<View> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(5437);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return b.a(this.this$0).findViewById(R.id.bra);
        }
    }

    static final class e extends m implements h.f.a.a<RandomLinkMicEntranceButton> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(5438);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RandomLinkMicEntranceButton invoke() {
            return b.a(this.this$0).findViewById(R.id.dgt);
        }
    }

    static final class f extends m implements h.f.a.a<View> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(5439);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return b.a(this.this$0).findViewById(R.id.brb);
        }
    }

    static final class g extends m implements h.f.a.a<PkInviteUserListRefreshLayout> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(5440);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PkInviteUserListRefreshLayout invoke() {
            return b.a(this.this$0).findViewById(R.id.brc);
        }
    }

    static final class h extends m implements h.f.a.a<RecyclerView> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(5441);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RecyclerView invoke() {
            return b.a(this.this$0).findViewById(R.id.brd);
        }
    }

    public static final class j implements PkInviteUserListRefreshLayout.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f10324a;

        static {
            Covode.recordClassIndex(5443);
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.ui.view.PkInviteUserListRefreshLayout.b
        public final void c() {
            this.f10324a.c().setVisibility(8);
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.ui.view.PkInviteUserListRefreshLayout.b
        public final void a() {
            if (this.f10324a.c().getVisibility() != 0) {
                this.f10324a.c().setVisibility(0);
            }
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.ui.view.PkInviteUserListRefreshLayout.b
        public final void b() {
            if (!this.f10324a.f10315f) {
                this.f10324a.f10315f = true;
                b.a aVar = (b.a) this.f10324a.f10034b;
                if (aVar != null) {
                    aVar.a();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(b bVar) {
            this.f10324a = bVar;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.ui.e.e.b
    public final void g() {
        b.a aVar = (b.a) this.f10034b;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.r;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        b.a aVar = (b.a) this.f10034b;
        if (aVar != null) {
            aVar.a();
        }
    }

    private final void m() {
        if (this.f10315f) {
            l().p.run();
            this.f10315f = false;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.b.AbstractC0158b
    public final void b() {
        d.e eVar;
        if (this.mStatusViewValid) {
            this.f10035c.D = 0;
            if (LiveCoHostInviteePanelDismissSetting.INSTANCE.getValue() == 1 && (eVar = this.f10033a) != null) {
                eVar.dismiss();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.b$b  reason: collision with other inner class name */
    static final class C0172b extends m implements h.f.a.a<View> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(5434);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0172b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* renamed from: a */
        public final View invoke() {
            LayoutInflater from = LayoutInflater.from(this.this$0.getContext());
            if (from != null) {
                View view = this.this$0.getView();
                if (!(view instanceof ViewGroup)) {
                    view = null;
                }
                View a2 = com.a.a(from, R.layout.bez, (ViewGroup) view, false);
                if (a2 != null) {
                    a2.setOnClickListener(new a(this));
                    return a2;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.b$b$a */
        public static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0172b f10322a;

            static {
                Covode.recordClassIndex(5435);
            }

            a(C0172b bVar) {
                this.f10322a = bVar;
            }

            public final void onClick(View view) {
                this.f10322a.this$0.f();
                d.e eVar = this.f10322a.this$0.f10033a;
                if (eVar != null) {
                    eVar.a(w.a.SETTING_FRAGMENT, null);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.d.b
    public final e.a d() {
        C0172b bVar = new C0172b(this);
        e.a aVar = new e.a();
        double e2 = (double) com.bytedance.android.live.core.f.y.e(com.bytedance.android.live.core.f.y.b());
        Double.isNaN(e2);
        aVar.f10038b = (int) (e2 * 0.7d);
        String a2 = com.bytedance.android.live.core.f.y.a((int) R.string.dxf);
        l.b(a2, "");
        aVar.a(a2);
        aVar.f10039c = this.f10316g;
        aVar.f10041e = bVar.invoke();
        return aVar;
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.ui.e.e.b
    public final void f() {
        if (isViewValid() && !this.f10314e.f158845b.isEmpty() && (this.f10314e.f158845b.get(0) instanceof com.bytedance.android.live.liveinteract.cohost.ui.d.e)) {
            this.f10314e.f158845b.remove(0);
            this.f10314e.notifyItemRemoved(0);
            j.a.a.f fVar = this.f10314e;
            fVar.notifyItemRangeChanged(0, fVar.getItemCount());
            b.a aVar = (b.a) this.f10034b;
            if (aVar != null) {
                aVar.d();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.b.AbstractC0158b
    public final void g_() {
        f.a.b.b bVar = this.f10318i;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f10318i = t.a(1, TimeUnit.SECONDS).a(new com.bytedance.android.livesdk.util.rxutils.f()).d(new k(this));
    }

    private b() {
        this.f10320l = h.i.a((h.f.a.a) new f(this));
        this.f10321m = h.i.a((h.f.a.a) new d(this));
        this.n = h.i.a((h.f.a.a) new h(this));
        this.o = h.i.a((h.f.a.a) new c(this));
        this.p = h.i.a((h.f.a.a) new g(this));
        this.q = h.i.a((h.f.a.a) new e(this));
        this.f10314e = new j.a.a.f();
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.ui.e.a.b
    public final void h() {
        if (this.mStatusViewValid && this.f10034b != null) {
            if (((b.a) this.f10034b).f10022a) {
                int i2 = ((b.a) this.f10034b).f10024c;
                int i3 = ((b.a) this.f10034b).f10023b;
                ((b.a) this.f10034b).b();
                this.f10314e.notifyItemRangeInserted(i2, i3);
                j.a.a.f fVar = this.f10314e;
                int i4 = i2 + i3;
                fVar.notifyItemRangeChanged(i4, fVar.getItemCount() - i4);
                return;
            }
            ((b.a) this.f10034b).c();
            this.f10314e.notifyDataSetChanged();
            j().d(0);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int i2;
        HashSet<String> hashSet;
        super.onDestroy();
        int i3 = ((b.a) this.f10034b).f10027f;
        y yVar = this.f10319k;
        if (yVar == null || (hashSet = yVar.f12037a) == null) {
            i2 = 0;
        } else {
            i2 = hashSet.size();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", b.a.a().V);
        hashMap.put("mutual_follow_cnts", String.valueOf(i3));
        hashMap.put("recommend_show_cnts", String.valueOf(i2));
        com.bytedance.android.live.liveinteract.platform.common.g.h.a("livesdk_connection_list_show", hashMap);
        f.a.b.b bVar = this.f10318i;
        if (bVar != null) {
            bVar.dispose();
        }
        if (this.f10034b != null) {
            this.f10034b.g();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.ui.e.d.a
    public final boolean a() {
        DataChannel dataChannel = this.f10317h;
        if (dataChannel == null) {
            return false;
        }
        com.bytedance.android.live.liveinteract.cohost.a.c.a.a(dataChannel, a.e.TYPE_INVITEE_LIST_DIALOG);
        this.f10033a.dismiss();
        return true;
    }

    public /* synthetic */ b(byte b2) {
        this();
    }

    public static final class i extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f10323a;

        static {
            Covode.recordClassIndex(5442);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(b bVar) {
            this.f10323a = bVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            LiveTextView liveTextView;
            l.d(recyclerView, "");
            super.a(recyclerView, i2, i3);
            RecyclerView.i layoutManager = recyclerView.getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            if (((LinearLayoutManager) layoutManager).k() == ((b.a) this.f10323a.f10034b).f10025d) {
                RecyclerView.i layoutManager2 = recyclerView.getLayoutManager();
                Objects.requireNonNull(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                View g2 = layoutManager2.g(0);
                Integer num = null;
                if (g2 != null) {
                    liveTextView = (LiveTextView) g2.findViewById(R.id.f5e);
                    if (liveTextView != null) {
                        num = Integer.valueOf(liveTextView.getBottom());
                    }
                } else {
                    liveTextView = null;
                }
                ViewGroup.LayoutParams layoutParams = this.f10323a.e().getLayoutParams();
                if ((layoutParams instanceof FrameLayout.LayoutParams) && num != null) {
                    ((FrameLayout.LayoutParams) layoutParams).topMargin = -num.intValue();
                }
                this.f10323a.e().setLayoutParams(layoutParams);
                boolean z = true;
                if (liveTextView == null || !liveTextView.getGlobalVisibleRect(new Rect())) {
                    z = false;
                }
                if (i3 > 0) {
                    if (!z) {
                        this.f10323a.e().setVisibility(0);
                    }
                } else if (z) {
                    this.f10323a.e().setVisibility(8);
                }
            }
        }
    }

    public static final /* synthetic */ View a(b bVar) {
        View view = bVar.f10313d;
        if (view == null) {
            l.a("mRootView");
        }
        return view;
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.b.AbstractC0158b
    public final void a(int i2) {
        if (this.mStatusViewValid) {
            this.f10314e.notifyItemChanged(i2, n.c(1));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.b.AbstractC0158b
    public final void b(Throwable th) {
        l.d(th, "");
        if (this.mStatusViewValid) {
            com.bytedance.android.livesdk.utils.f.a(getContext(), th);
        }
    }

    static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f10325a;

        static {
            Covode.recordClassIndex(5444);
        }

        k(b bVar) {
            this.f10325a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            int i2 = 0;
            if (com.bytedance.android.live.liveinteract.cohost.a.e.d.b()) {
                com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.ca;
                l.b(bVar, "");
                Boolean a2 = bVar.a();
                l.b(a2, "");
                if (a2.booleanValue()) {
                    j.a.a.f fVar = this.f10325a.f10314e;
                    b.a aVar = (b.a) this.f10325a.f10034b;
                    if (aVar != null) {
                        i2 = aVar.f10025d;
                    }
                    fVar.notifyItemChanged(i2);
                    this.f10325a.e().b();
                    return;
                }
            }
            if (!com.bytedance.android.live.liveinteract.cohost.a.e.d.b()) {
                b bVar2 = this.f10325a;
                f.a.b.b bVar3 = bVar2.f10318i;
                if (bVar3 != null) {
                    bVar3.dispose();
                }
                j.a.a.f fVar2 = bVar2.f10314e;
                b.a aVar2 = (b.a) bVar2.f10034b;
                if (aVar2 != null) {
                    i2 = aVar2.f10025d;
                }
                fVar2.notifyItemChanged(i2);
                bVar2.e().b();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.b.AbstractC0158b
    public final void a(i.a aVar) {
        String str;
        String str2;
        l.d(aVar, "");
        e().setBannerText(aVar);
        RandomLinkMicEntranceButton e2 = e();
        l.d(this, "");
        LiveTextView title = e2.getTitle();
        i.a aVar2 = e2.f10447g;
        if (aVar2 == null || (str = aVar2.f15626a) == null) {
            str = "";
        }
        title.setText(str);
        LiveTextView subTitle = e2.getSubTitle();
        i.a aVar3 = e2.f10447g;
        if (aVar3 == null || (str2 = aVar3.f15627b) == null) {
            str2 = "";
        }
        subTitle.setText(str2);
        e2.getButton().setMaxWidth(Integer.MAX_VALUE);
        e2.b();
        com.bytedance.android.live.liveinteract.cohost.a.e.c.a(e2.getButton(), (d.a) this);
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.b.AbstractC0158b
    public final void a(Throwable th) {
        m();
        i().setVisibility(8);
        if (this.mStatusViewValid) {
            k().setVisibility(0);
            j().setVisibility(8);
            com.bytedance.android.livesdk.utils.f.a(getContext(), th);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.b.AbstractC0158b
    public final void a(boolean z) {
        j.a.a.d dVar;
        m();
        if (this.mStatusViewValid) {
            i().setVisibility(8);
            l().setVisibility(0);
            if (z) {
                j().setVisibility(0);
                k().setVisibility(8);
                this.f10314e.a(com.bytedance.android.live.liveinteract.cohost.ui.d.e.class, new com.bytedance.android.live.liveinteract.cohost.ui.e.e(this));
                this.f10314e.a(com.bytedance.android.live.liveinteract.cohost.ui.d.d.class, new com.bytedance.android.live.liveinteract.cohost.ui.e.d(this));
                this.f10314e.a(com.bytedance.android.live.liveinteract.cohost.ui.d.f.class, new com.bytedance.android.live.liveinteract.cohost.ui.e.f());
                if (LiveCoHostInviteePanelDismissSetting.INSTANCE.getValue() == 0) {
                    this.f10314e.a(com.bytedance.android.live.liveinteract.cohost.ui.d.b.class, new com.bytedance.android.live.liveinteract.cohost.ui.e.g(this, this.f10317h));
                } else {
                    this.f10314e.a(com.bytedance.android.live.liveinteract.cohost.ui.d.b.class, new com.bytedance.android.live.liveinteract.cohost.ui.e.i(this, this.f10317h));
                }
                this.f10314e.a(com.bytedance.android.live.liveinteract.cohost.ui.d.c.class, new com.bytedance.android.live.liveinteract.cohost.ui.e.c());
                this.f10314e.a(com.bytedance.android.live.liveinteract.cohost.ui.d.a.class, new com.bytedance.android.live.liveinteract.cohost.ui.e.a(this));
                j.a.a.f fVar = this.f10314e;
                b.a aVar = (b.a) this.f10034b;
                if (aVar == null || (dVar = aVar.f10026e) == null) {
                    dVar = new j.a.a.d();
                }
                fVar.a(dVar);
                this.f10314e.notifyDataSetChanged();
                return;
            }
            j().setVisibility(8);
            k().setVisibility(0);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.ui.e.a.a
    public final void a(Room room, com.bytedance.android.live.liveinteract.api.m mVar) {
        l.d(room, "");
        l.d(mVar, "");
        if (this.mStatusViewValid) {
            this.f10035c.p = mVar;
            b.a aVar = (b.a) this.f10034b;
            if (aVar != null) {
                aVar.a(room, mVar);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        com.bytedance.android.livesdk.performance.b bVar;
        l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.b9_, viewGroup, false);
        l.b(a2, "");
        this.f10313d = a2;
        RecyclerView j2 = j();
        getContext();
        j2.setLayoutManager(new LinearLayoutManager());
        j().setAdapter(this.f10314e);
        RecyclerView.f itemAnimator = j().getItemAnimator();
        if (itemAnimator instanceof ab) {
            ((ab) itemAnimator).f3953m = false;
        }
        RecyclerView j3 = j();
        l.d(j3, "");
        h.h<com.bytedance.android.livesdk.performance.b> hVar = com.bytedance.android.livesdk.performance.g.f20231b.get("panel_broadcast_link_slide");
        if (hVar != null) {
            bVar = hVar.getValue();
        } else {
            bVar = null;
        }
        j3.a(new com.bytedance.android.livesdk.performance.c(bVar));
        this.f10319k = new y(j());
        i().setVisibility(0);
        this.f10315f = false;
        l().setOnRefreshListener(new j(this));
        j().a(new i(this));
        View view = this.f10313d;
        if (view == null) {
            l.a("mRootView");
        }
        return view;
    }
}
