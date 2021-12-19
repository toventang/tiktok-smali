package com.bytedance.android.livesdk.ad;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.j.q;
import com.bytedance.android.livesdk.j.r;
import com.bytedance.android.livesdk.j.s;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public final class i extends com.bytedance.android.livesdk.ui.a {

    /* renamed from: a  reason: collision with root package name */
    public int f13678a = 10;

    /* renamed from: b  reason: collision with root package name */
    public b f13679b;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f13680c = com.bytedance.android.livesdkapi.m.d.a(new d(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.h f13681d = com.bytedance.android.livesdkapi.m.d.a(new c(this));

    /* renamed from: e  reason: collision with root package name */
    private final b f13682e = new b(this);

    /* renamed from: f  reason: collision with root package name */
    private HashMap f13683f;

    final /* synthetic */ class h implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.b f13688a;

        static {
            Covode.recordClassIndex(7592);
        }

        h(h.f.a.b bVar) {
            this.f13688a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            l.b(this.f13688a.invoke(obj), "");
        }
    }

    static {
        Covode.recordClassIndex(7584);
    }

    private final long b() {
        return ((Number) this.f13680c.getValue()).longValue();
    }

    private final boolean c() {
        return ((Boolean) this.f13681d.getValue()).booleanValue();
    }

    public final View a(int i2) {
        if (this.f13683f == null) {
            this.f13683f = new HashMap();
        }
        View view = (View) this.f13683f.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f13683f.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    private static boolean d() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f13683f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    private static boolean e() {
        if (j.f107226e && j.b() && !j.c()) {
            return j.f107226e;
        }
        boolean d2 = d();
        j.f107226e = d2;
        return d2;
    }

    static final class c extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(7587);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            Boolean bool;
            if (!p.c()) {
                DataChannel a2 = com.bytedance.ies.sdk.datachannel.f.a(this.this$0);
                if (a2 != null) {
                    bool = (Boolean) a2.b(ee.class);
                } else {
                    bool = null;
                }
                if (!p.a(bool)) {
                    z = false;
                    return Boolean.valueOf(z);
                }
            }
            z = true;
            return Boolean.valueOf(z);
        }
    }

    static final class d extends m implements h.f.a.a<Long> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(7588);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Long invoke() {
            long j2;
            Room room;
            if (p.c()) {
                com.bytedance.android.livesdk.at.f b2 = u.a().b();
                l.b(b2, "");
                j2 = b2.c();
            } else {
                DataChannel a2 = com.bytedance.ies.sdk.datachannel.f.a(this.this$0);
                if (a2 == null || (room = (Room) a2.b(df.class)) == null) {
                    j2 = 0;
                } else {
                    j2 = room.getOwnerUserId();
                }
            }
            return Long.valueOf(j2);
        }
    }

    public final void a() {
        getContext();
        if (!e()) {
            ao.a(getContext(), (int) R.string.efp);
            return;
        }
        ((LoadingStatusView) a(R.id.dq8)).setStatus(0);
        ((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).fetchAdminList(this.f13682e, b());
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f13684a;

        static {
            Covode.recordClassIndex(7585);
        }

        a(i iVar) {
            this.f13684a = iVar;
        }

        public final void onClick(View view) {
            this.f13684a.a();
        }
    }

    public static final class b implements com.bytedance.android.live.s.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f13685a;

        static {
            Covode.recordClassIndex(7586);
        }

        @Override // com.bytedance.android.live.s.a
        public final void a(boolean z, long j2) {
        }

        @Override // com.bytedance.android.live.s.a
        public final void b(Exception exc) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(i iVar) {
            this.f13685a = iVar;
        }

        @Override // com.bytedance.android.live.s.a
        public final void a(com.bytedance.android.live.s.a.b bVar, Exception exc) {
            if (!this.f13685a.isViewValid()) {
                return;
            }
            if (exc != null || bVar == null) {
                if (i.a(this.f13685a).getItemCount() == 0) {
                    ((LoadingStatusView) this.f13685a.a(R.id.dq8)).setStatus(2);
                }
                com.bytedance.android.livesdk.utils.f.a(this.f13685a.getContext(), exc);
            } else if (!com.bytedance.common.utility.collection.b.a((Collection) bVar.f12600a)) {
                ((LoadingStatusView) this.f13685a.a(R.id.dq8)).a();
                this.f13685a.f13678a = bVar.f12601b;
                i.a(this.f13685a).a(bVar.f12600a);
                i iVar = this.f13685a;
                List<com.bytedance.android.live.s.a.a> list = bVar.f12600a;
                l.b(list, "");
                iVar.a(list);
            } else {
                ((LoadingStatusView) this.f13685a.a(R.id.dq8)).setStatus(1);
                this.f13685a.a(z.INSTANCE);
            }
        }
    }

    static final /* synthetic */ class g extends h.f.b.j implements h.f.a.b<f, h.z> {
        static {
            Covode.recordClassIndex(7591);
        }

        g(i iVar) {
            super(1, iVar, i.class, "onEvent", "onEvent(Lcom/bytedance/android/livesdk/moderator/AdminSetEvent;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(f fVar) {
            ((i) this.receiver).onEvent(fVar);
            return h.z.f158842a;
        }
    }

    public static final /* synthetic */ b a(i iVar) {
        b bVar = iVar.f13679b;
        if (bVar == null) {
            l.a("mAdminAdapter");
        }
        return bVar;
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f13686a;

        static {
            Covode.recordClassIndex(7589);
        }

        e(i iVar) {
            this.f13686a = iVar;
        }

        public final void onClick(View view) {
            DataChannel a2 = com.bytedance.ies.sdk.datachannel.f.a(this.f13686a);
            if (a2 != null) {
                a2.b(r.class, s.b(q.MANAGE_MODERATOR));
            }
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f13687a;

        static {
            Covode.recordClassIndex(7590);
        }

        f(i iVar) {
            this.f13687a = iVar;
        }

        public final void onClick(View view) {
            DataChannel a2 = com.bytedance.ies.sdk.datachannel.f.a(this.f13687a);
            if (a2 != null) {
                a2.b(r.class, s.a(q.GUIDE));
            }
        }
    }

    public final void a(List<com.bytedance.android.live.s.a.a> list) {
        DataChannel a2 = com.bytedance.ies.sdk.datachannel.f.a(this);
        if (a2 != null) {
            a2.b(h.class, list);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(com.bytedance.android.live.design.a.a.a(getActivity()));
        l.b(cloneInContext, "");
        return cloneInContext;
    }

    public final void onEvent(f fVar) {
        Iterable iterable;
        if (fVar != null) {
            DataChannel a2 = com.bytedance.ies.sdk.datachannel.f.a(this);
            if (a2 == null || (iterable = (List) a2.b(h.class)) == null) {
                iterable = z.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (((com.bytedance.android.live.s.a.a) obj).f12593a != fVar.f13671b) {
                    arrayList.add(obj);
                }
            }
            a(arrayList);
            if (isViewValid() && !fVar.f13670a) {
                b bVar = this.f13679b;
                if (bVar == null) {
                    l.a("mAdminAdapter");
                }
                bVar.a(fVar.f13671b);
                b bVar2 = this.f13679b;
                if (bVar2 == null) {
                    l.a("mAdminAdapter");
                }
                if (bVar2.getItemCount() == 0) {
                    ((LoadingStatusView) a(R.id.dq8)).setStatus(1);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0053, code lost:
        if (r0 == null) goto L_0x0055;
     */
    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
        // Method dump skipped, instructions count: 320
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.ad.i.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.b7i, viewGroup, false);
    }
}
