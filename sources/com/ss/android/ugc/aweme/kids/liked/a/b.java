package com.ss.android.ugc.aweme.kids.liked.a;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridViewModel;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.j;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class b extends com.ss.android.ugc.aweme.kids.common.ui.awemegrid.c {

    /* renamed from: j  reason: collision with root package name */
    public static final a f106703j = new a((byte) 0);

    /* renamed from: k  reason: collision with root package name */
    private HashMap f106704k;

    static {
        Covode.recordClassIndex(68201);
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.c
    public final void a() {
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.c
    public final boolean b() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.c
    public final String c() {
        return "like";
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.c
    public final void m() {
        HashMap hashMap = this.f106704k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.c, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68202);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private b() {
    }

    static final /* synthetic */ class c extends j implements h.f.a.a<z> {
        static {
            Covode.recordClassIndex(68204);
        }

        c(b bVar) {
            super(0, bVar, b.class, "tryRefreshList", "tryRefreshList()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ((b) this.receiver).n();
            return z.f158842a;
        }
    }

    private static boolean o() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean p() {
        if (com.ss.android.ugc.aweme.lancet.j.f107229h && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107229h;
        }
        boolean o = o();
        com.ss.android.ugc.aweme.lancet.j.f107229h = o;
        return o;
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.c
    public final View d() {
        MethodCollector.i(187);
        Context context = getContext();
        if (context != null) {
            View view = new View(context);
            MethodCollector.o(187);
            return view;
        }
        MethodCollector.o(187);
        return null;
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.c
    public final void j() {
        TuxStatusView tuxStatusView = this.f105949e;
        if (tuxStatusView != null) {
            tuxStatusView.setStatus(com.ss.android.ugc.aweme.tux.a.g.a.b(new TuxStatusView.c(), new c(this)));
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.c
    public final void g() {
        TuxStatusView tuxStatusView = this.f105949e;
        if (tuxStatusView != null) {
            TuxStatusView.c a2 = new TuxStatusView.c().a(com.bytedance.tux.c.c.a(C2729b.f106705a));
            String string = getString(R.string.cst);
            l.b(string, "");
            TuxStatusView.c a3 = a2.a(string);
            String string2 = getString(R.string.css);
            l.b(string2, "");
            tuxStatusView.setStatus(a3.a((CharSequence) string2));
        }
        TuxStatusView tuxStatusView2 = this.f105949e;
        if (tuxStatusView2 != null) {
            tuxStatusView2.setVisibility(0);
        }
    }

    public final void n() {
        if (ab_()) {
            getContext();
            if (!p()) {
                new com.bytedance.tux.g.b(this).e(R.string.de8).b();
                j();
                return;
            }
            e();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        t<List<Aweme>> tVar;
        List<Aweme> value;
        KidsAwemeGridViewModel kidsAwemeGridViewModel;
        t<List<Aweme>> tVar2;
        super.onResume();
        KidsAwemeGridViewModel kidsAwemeGridViewModel2 = this.f105947c;
        if (!(kidsAwemeGridViewModel2 == null || (tVar = kidsAwemeGridViewModel2.f105926a) == null || (value = tVar.getValue()) == null)) {
            List<Aweme> g2 = n.g((Collection) value);
            if (!g2.isEmpty()) {
                boolean z = false;
                Iterator<Aweme> it = g2.iterator();
                while (it.hasNext()) {
                    if (!it.next().isLike()) {
                        it.remove();
                        z = true;
                    }
                }
                if (!(!z || (kidsAwemeGridViewModel = this.f105947c) == null || (tVar2 = kidsAwemeGridViewModel.f105926a) == null)) {
                    tVar2.postValue(g2);
                }
            }
        }
        getContext();
        if (!p()) {
            new com.bytedance.tux.g.b(this).e(R.string.de8).b();
        }
    }

    public /* synthetic */ b(byte b2) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.liked.a.b$b  reason: collision with other inner class name */
    static final class C2729b extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2729b f106705a = new C2729b();

        static {
            Covode.recordClassIndex(68203);
        }

        C2729b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_large_heart;
            aVar2.f44753e = Integer.valueOf((int) R.attr.bd);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.c
    public final void a(View view, Aweme aweme) {
        List<Aweme> list;
        t<List<Aweme>> tVar;
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            if (!(aweme == null || getActivity() == null)) {
                getContext();
                if (!p()) {
                    new com.bytedance.tux.g.b(this).e(R.string.de8).b();
                    return;
                }
            }
            KidsAwemeGridViewModel kidsAwemeGridViewModel = this.f105947c;
            String str = null;
            if (kidsAwemeGridViewModel == null || (tVar = kidsAwemeGridViewModel.f105926a) == null || (list = tVar.getValue()) == null) {
                list = h.a.z.INSTANCE;
            }
            l.d(list, "");
            com.ss.android.ugc.aweme.kids.liked.b.a.f106717a = new WeakReference<>(list);
            SmartRoute buildRoute = SmartRouter.buildRoute(getActivity(), "//kids/like/feed");
            if (aweme != null) {
                str = aweme.getAid();
            }
            SmartRoute withParam = buildRoute.withParam("current_id", str);
            if (view != null) {
                androidx.core.app.b b2 = androidx.core.app.b.b(view, view.getWidth(), view.getHeight());
                l.b(b2, "");
                withParam.withBundleAnimation(b2.a());
            }
            withParam.open();
        }
    }
}
