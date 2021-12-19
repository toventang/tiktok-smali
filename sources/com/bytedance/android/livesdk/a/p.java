package com.bytedance.android.livesdk.a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.live.uikit.recyclerview.a;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.event.o;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.q;
import com.bytedance.android.livesdk.j.r;
import com.bytedance.android.livesdk.j.s;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;

public final class p extends com.bytedance.android.livesdk.ui.a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f13328e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f13329a;

    /* renamed from: b  reason: collision with root package name */
    public int f13330b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f13331c;

    /* renamed from: d  reason: collision with root package name */
    public d f13332d;

    /* renamed from: f  reason: collision with root package name */
    private int f13333f;

    /* renamed from: g  reason: collision with root package name */
    private int f13334g;

    /* renamed from: h  reason: collision with root package name */
    private String f13335h;

    /* renamed from: i  reason: collision with root package name */
    private String f13336i;

    /* renamed from: j  reason: collision with root package name */
    private long f13337j;

    /* renamed from: k  reason: collision with root package name */
    private final e f13338k = new e(this);

    /* renamed from: l  reason: collision with root package name */
    private final a.AbstractC0269a f13339l = new f(this);

    /* renamed from: m  reason: collision with root package name */
    private HashMap f13340m;

    static {
        Covode.recordClassIndex(7425);
    }

    public final View a(int i2) {
        if (this.f13340m == null) {
            this.f13340m = new HashMap();
        }
        View view = (View) this.f13340m.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f13340m.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(7426);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class e implements com.bytedance.android.live.s.b, com.bytedance.android.live.s.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f13344a;

        static {
            Covode.recordClassIndex(7430);
        }

        @Override // com.bytedance.android.live.s.b
        public final void a(boolean z, Exception exc) {
        }

        @Override // com.bytedance.android.live.s.b
        public final void b(boolean z) {
        }

        @Override // com.bytedance.android.live.s.b
        public final void a() {
            e();
        }

        @Override // com.bytedance.android.live.s.c
        public final void c() {
            e();
        }

        @Override // com.bytedance.android.live.s.b
        public final void d() {
            f();
        }

        @Override // com.bytedance.android.live.s.c
        public final void k_() {
            f();
        }

        private final void e() {
            d dVar;
            if (!this.f13344a.isViewValid() || (dVar = this.f13344a.f13332d) == null) {
                return;
            }
            if (dVar.c() == 0) {
                ((LoadingStatusView) this.f13344a.a(R.id.dq8)).setStatus(0);
            } else {
                dVar.a();
            }
        }

        private final void f() {
            d dVar;
            if (!this.f13344a.isViewValid() || (dVar = this.f13344a.f13332d) == null) {
                return;
            }
            if (dVar.c() == 0) {
                ((LoadingStatusView) this.f13344a.a(R.id.dq8)).a();
            } else {
                dVar.b();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(p pVar) {
            this.f13344a = pVar;
        }

        @Override // com.bytedance.android.live.s.b
        public final void b(com.bytedance.android.live.s.a.c cVar, Exception exc) {
            c(cVar, exc);
        }

        @Override // com.bytedance.android.live.s.c
        public final void a(com.bytedance.android.live.s.a.c cVar, Exception exc) {
            c(cVar, exc);
        }

        private final void c(com.bytedance.android.live.s.a.c cVar, Exception exc) {
            if (!this.f13344a.isViewValid() || this.f13344a.f13332d == null) {
                return;
            }
            if (exc != null || cVar == null || cVar.f12145b == null) {
                d dVar = this.f13344a.f13332d;
                if (dVar == null) {
                    l.b();
                }
                if (dVar.getItemCount() == 0) {
                    ((LoadingStatusView) this.f13344a.a(R.id.dq8)).setStatus(2);
                    this.f13344a.f13330b = 0;
                }
                com.bytedance.android.livesdk.utils.f.a(this.f13344a.getContext(), exc);
                return;
            }
            this.f13344a.f13331c = cVar.f12146c.hasMore;
            if (!this.f13344a.f13331c) {
                d dVar2 = this.f13344a.f13332d;
                if (dVar2 == null) {
                    l.b();
                }
                dVar2.f13254d = false;
                d dVar3 = this.f13344a.f13332d;
                if (dVar3 == null) {
                    l.b();
                }
                dVar3.f12923b = false;
            }
            List list = cVar.f12145b;
            if (list == null || list.size() <= 0) {
                ((LoadingStatusView) this.f13344a.a(R.id.dq8)).setStatus(1);
                return;
            }
            d dVar4 = this.f13344a.f13332d;
            if (dVar4 == null) {
                l.b();
            }
            dVar4.a(list);
            d dVar5 = this.f13344a.f13332d;
            if (dVar5 == null) {
                l.b();
            }
            dVar5.notifyDataSetChanged();
            if (2 == this.f13344a.f13329a) {
                LiveTextView liveTextView = (LiveTextView) this.f13344a.a(R.id.dq7);
                if (liveTextView != null) {
                    com.bytedance.android.livesdk.utils.p.b(liveTextView);
                    return;
                }
                return;
            }
            LiveTextView liveTextView2 = (LiveTextView) this.f13344a.a(R.id.dq7);
            if (liveTextView2 != null) {
                com.bytedance.android.livesdk.utils.p.a(liveTextView2);
            }
        }
    }

    private static boolean c() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f13340m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static final class f implements a.AbstractC0269a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f13345a;

        static {
            Covode.recordClassIndex(7431);
        }

        f(p pVar) {
            this.f13345a = pVar;
        }

        @Override // com.bytedance.android.live.uikit.recyclerview.a.AbstractC0269a
        public final void a() {
            if (this.f13345a.f13331c) {
                this.f13345a.f13330b++;
                this.f13345a.b();
            }
        }
    }

    private static boolean d() {
        if (j.f107226e && j.b() && !j.c()) {
            return j.f107226e;
        }
        boolean c2 = c();
        j.f107226e = c2;
        return c2;
    }

    public final void b() {
        if (TextUtils.equals("activity_kick_out", this.f13336i)) {
            ((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).fetchKickOutList(this.f13338k, this.f13337j, this.f13330b, 20);
        } else {
            ((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).fetchMuteList(this.f13338k, this.f13337j, this.f13330b, 20);
        }
    }

    public final void a() {
        getContext();
        if (!d()) {
            ao.a(getContext(), (int) R.string.efp);
            ((LoadingStatusView) a(R.id.dq8)).setStatus(2);
            return;
        }
        b();
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f13341a;

        static {
            Covode.recordClassIndex(7427);
        }

        b(p pVar) {
            this.f13341a = pVar;
        }

        public final void onClick(View view) {
            this.f13341a.a();
        }
    }

    public static final class d implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f13343a;

        static {
            Covode.recordClassIndex(7429);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(p pVar) {
            this.f13343a = pVar;
        }

        @Override // com.bytedance.android.livesdk.a.b
        public final void a(c cVar) {
            this.f13343a.onEvent(cVar);
        }

        @Override // com.bytedance.android.livesdk.a.b
        public final void a(o oVar) {
            this.f13343a.onEvent(oVar);
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f13342a;

        static {
            Covode.recordClassIndex(7428);
        }

        c(p pVar) {
            this.f13342a = pVar;
        }

        public final void onClick(View view) {
            DataChannel a2 = com.bytedance.ies.sdk.datachannel.f.a(this.f13342a);
            if (a2 != null) {
                a2.b(r.class, s.a(q.GUIDE));
            }
        }
    }

    public final void onEvent(c cVar) {
        if (isViewValid() && cVar != null && !cVar.f13251a) {
            d dVar = this.f13332d;
            if (dVar != null) {
                dVar.a(cVar.f13252b);
            }
            d dVar2 = this.f13332d;
            if (dVar2 != null && dVar2.getItemCount() == 0) {
                ((LoadingStatusView) a(R.id.dq8)).setStatus(1);
                LiveTextView liveTextView = (LiveTextView) a(R.id.dq7);
                if (liveTextView != null) {
                    com.bytedance.android.livesdk.utils.p.a(liveTextView);
                }
            }
        }
    }

    public final void onEvent(o oVar) {
        if (isViewValid() && oVar != null && !oVar.f17208a) {
            d dVar = this.f13332d;
            if (dVar != null) {
                dVar.a(oVar.f17209b);
            }
            d dVar2 = this.f13332d;
            if (dVar2 != null && dVar2.getItemCount() == 0) {
                ((LoadingStatusView) a(R.id.dq8)).setStatus(1);
                LiveTextView liveTextView = (LiveTextView) a(R.id.dq7);
                if (liveTextView != null) {
                    com.bytedance.android.livesdk.utils.p.a(liveTextView);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Room room;
        MethodCollector.i(2877);
        l.d(view, "");
        super.onViewCreated(view, bundle);
        if (getContext() == null) {
            MethodCollector.o(2877);
            return;
        }
        DataChannel a2 = com.bytedance.ies.sdk.datachannel.f.a(this);
        if (a2 == null || (room = (Room) a2.b(df.class)) == null) {
            MethodCollector.o(2877);
            return;
        }
        User owner = room.getOwner();
        if (owner != null) {
            long id = owner.getId();
            long id2 = room.getId();
            ((LinearLayout) a(R.id.dqa)).setOnClickListener(new c(this));
            RecyclerView recyclerView = (RecyclerView) a(R.id.dq6);
            l.b(recyclerView, "");
            recyclerView.setVisibility(0);
            RecyclerView recyclerView2 = (RecyclerView) a(R.id.dq6);
            l.b(recyclerView2, "");
            getContext();
            recyclerView2.setLayoutManager(new SSLinearLayoutManager(1));
            this.f13334g = R.string.ebf;
            int i2 = this.f13329a;
            if (2 == i2) {
                this.f13336i = "activity_banned_talk";
                this.f13333f = R.string.ebe;
                this.f13335h = getString(R.string.eba);
                b.a.a("livesdk_anchor_mute_list_show").a().b();
            } else if (3 == i2) {
                this.f13336i = "activity_kick_out";
                this.f13333f = R.string.ebc;
                this.f13335h = getString(R.string.eb4);
                b.a.a("livesdk_anchor_blocked_list_show").a().b();
            }
            this.f13332d = new d(getContext(), this.f13336i, id2, id);
            RecyclerView recyclerView3 = (RecyclerView) a(R.id.dq6);
            l.b(recyclerView3, "");
            recyclerView3.setAdapter(this.f13332d);
            d dVar = this.f13332d;
            if (dVar != null) {
                dVar.f13253c = new d(this);
            }
            d dVar2 = this.f13332d;
            if (dVar2 != null) {
                dVar2.f12919a = this.f13339l;
            }
            this.f13330b = 0;
            this.f13337j = id2;
            a();
            LoadingStatusView loadingStatusView = (LoadingStatusView) a(R.id.dq8);
            l.b(loadingStatusView, "");
            loadingStatusView.setVisibility(0);
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.b5_, (ViewGroup) null);
            inflate.setOnClickListener(new b(this));
            Context context = getContext();
            if (context == null) {
                l.b();
            }
            l.b(context, "");
            com.bytedance.android.livesdk.ui.c b2 = new com.bytedance.android.livesdk.ui.c(context, (byte) 0).a().a(getString(this.f13334g)).b(getString(this.f13333f));
            b2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            LoadingStatusView loadingStatusView2 = (LoadingStatusView) a(R.id.dq8);
            LoadingStatusView.a a3 = LoadingStatusView.a.a(getContext());
            a3.f12917c = b2;
            a3.f12918d = inflate;
            Context context2 = getContext();
            if (context2 == null) {
                l.b();
            }
            a3.f12916b = new LiveLoadingView(context2);
            loadingStatusView2.setBuilder(a3);
            LiveTextView liveTextView = (LiveTextView) a(R.id.dq9);
            l.b(liveTextView, "");
            liveTextView.setText(this.f13335h);
            MethodCollector.o(2877);
            return;
        }
        MethodCollector.o(2877);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.b86, viewGroup, false);
    }
}
