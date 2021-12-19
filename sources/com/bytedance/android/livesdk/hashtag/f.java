package com.bytedance.android.livesdk.hashtag;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.HashtagResponse;
import com.bytedance.android.live.core.widget.StateLayout;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.utils.ak;
import com.bytedance.android.livesdk.v;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.List;

public final class f extends v {

    /* renamed from: e  reason: collision with root package name */
    public static final a f18134e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Hashtag f18135a;

    /* renamed from: b  reason: collision with root package name */
    public List<GameTag> f18136b;

    /* renamed from: c  reason: collision with root package name */
    i f18137c;

    /* renamed from: d  reason: collision with root package name */
    h.f.a.b<? super Hashtag, z> f18138d = new d(this);

    /* renamed from: f  reason: collision with root package name */
    private final ak.a f18139f = ak.a.PANEL_HASHTAG_ANCHOR;

    /* renamed from: g  reason: collision with root package name */
    private HashMap f18140g;

    static {
        Covode.recordClassIndex(10069);
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f18140g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f18140g == null) {
            this.f18140g = new HashMap();
        }
        View view = (View) this.f18140g.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f18140g.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(10070);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
            if (r0 != 2) goto L_0x0016;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void a(androidx.fragment.app.i r6, java.lang.String r7, com.bytedance.android.livesdkapi.depend.model.live.i r8) {
            /*
                java.lang.String r0 = ""
                h.f.b.l.d(r6, r0)
                h.f.b.l.d(r7, r0)
                com.bytedance.android.livesdk.hashtag.f r5 = new com.bytedance.android.livesdk.hashtag.f
                r5.<init>()
                android.os.Bundle r4 = new android.os.Bundle
                r4.<init>()
                r3 = 2
                r2 = 1
                if (r8 != 0) goto L_0x0023
            L_0x0016:
                r3 = 3
            L_0x0017:
                java.lang.String r0 = "key_live_mode"
                r4.putInt(r0, r3)
                r5.setArguments(r4)
                r5.show(r6, r7)
                return
            L_0x0023:
                int[] r1 = com.bytedance.android.livesdk.hashtag.g.f18146a
                int r0 = r8.ordinal()
                r0 = r1[r0]
                if (r0 == r2) goto L_0x0030
                if (r0 == r3) goto L_0x0017
                goto L_0x0016
            L_0x0030:
                r3 = 1
                goto L_0x0017
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.hashtag.f.a.a(androidx.fragment.app.i, java.lang.String, com.bytedance.android.livesdkapi.depend.model.live.i):void");
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final ak.a c_() {
        return this.f18139f;
    }

    /* renamed from: com.bytedance.android.livesdk.hashtag.f$f  reason: collision with other inner class name */
    static final class C0380f implements StateLayout.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f18144a;

        static {
            Covode.recordClassIndex(10075);
        }

        C0380f(f fVar) {
            this.f18144a = fVar;
        }

        @Override // com.bytedance.android.live.core.widget.StateLayout.a
        public final void a() {
            this.f18144a.d();
        }
    }

    static final class g implements StateLayout.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f18145a;

        static {
            Covode.recordClassIndex(10076);
        }

        g(f fVar) {
            this.f18145a = fVar;
        }

        @Override // com.bytedance.android.live.core.widget.StateLayout.a
        public final void a() {
            this.f18145a.d();
        }
    }

    private static boolean e() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean f() {
        if (j.f107226e && j.b() && !j.c()) {
            return j.f107226e;
        }
        boolean e2 = e();
        j.f107226e = e2;
        return e2;
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.b8j);
        bVar.f22380g = 80;
        bVar.f22383j = 73;
        return bVar;
    }

    public final void d() {
        ((StateLayout) a_(R.id.bew)).a("LOADING");
        getContext();
        if (!f()) {
            ((StateLayout) a_(R.id.bew)).a("OFFLINE");
        } else {
            ((HashtagApi) com.bytedance.android.live.network.e.a().a(HashtagApi.class)).fetchHashtagList().a(new com.bytedance.android.livesdk.util.rxutils.f()).a(com.bytedance.android.livesdk.util.rxutils.i.a(this, com.bytedance.android.livesdk.util.rxutils.b.b.DESTROY)).a(new b(this), new c(this));
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f18143a;

        static {
            Covode.recordClassIndex(10074);
        }

        e(f fVar) {
            this.f18143a = fVar;
        }

        public final void onClick(View view) {
            this.f18143a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f18142a;

        static {
            Covode.recordClassIndex(10072);
        }

        c(f fVar) {
            this.f18142a = fVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ((StateLayout) this.f18142a.a_(R.id.bew)).a("ERROR");
            com.bytedance.android.live.core.c.a.a(6, "HashtagAnchorDialog", "failed to fetch topics!");
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(com.bytedance.android.live.design.a.a.a(getActivity()));
        l.b(cloneInContext, "");
        return cloneInContext;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Integer valueOf;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        i iVar = null;
        if (!(arguments == null || (valueOf = Integer.valueOf(arguments.getInt("key_live_mode"))) == null)) {
            if (valueOf.intValue() == 2) {
                iVar = i.SCREEN_RECORD;
            } else if (valueOf.intValue() == 1) {
                iVar = i.THIRD_PARTY;
            }
        }
        this.f18137c = iVar;
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f18141a;

        static {
            Covode.recordClassIndex(10071);
        }

        b(f fVar) {
            this.f18141a = fVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Hashtag hashtag;
            List<GameTag> list;
            List list2;
            List<Hashtag> list3;
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            f fVar = this.f18141a;
            HashtagResponse hashtagResponse = (HashtagResponse) dVar.data;
            e eVar = null;
            if (hashtagResponse != null) {
                hashtag = hashtagResponse.gameHashTag;
            } else {
                hashtag = null;
            }
            fVar.f18135a = hashtag;
            f fVar2 = this.f18141a;
            HashtagResponse hashtagResponse2 = (HashtagResponse) dVar.data;
            if (hashtagResponse2 != null) {
                list = hashtagResponse2.gameTagList;
            } else {
                list = null;
            }
            fVar2.f18136b = list;
            f fVar3 = this.f18141a;
            HashtagResponse hashtagResponse3 = (HashtagResponse) dVar.data;
            if (hashtagResponse3 == null || (list3 = hashtagResponse3.hashtags) == null) {
                list2 = null;
            } else {
                list2 = n.g((Iterable) list3);
            }
            ((StateLayout) fVar3.a_(R.id.bew)).a("CONTENT");
            boolean a2 = l.a((Object) fVar3.getTag(), (Object) "Preview");
            RecyclerView recyclerView = (RecyclerView) fVar3.a_(R.id.epn);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            if (list2 != null) {
                Context context = recyclerView.getContext();
                l.b(context, "");
                eVar = new e(context, list2, fVar3.p, a2, fVar3.f18138d);
            }
            recyclerView.setAdapter(eVar);
        }
    }

    static final class d extends m implements h.f.a.b<Hashtag, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(10073);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0066  */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.bytedance.android.livesdk.model.Hashtag r7) {
            /*
            // Method dump skipped, instructions count: 123
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.hashtag.f.d.invoke(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        ((ImageView) a_(R.id.a7t)).setOnClickListener(new e(this));
        d();
        ((StateLayout) a_(R.id.bew)).setErrorClickListener(new C0380f(this));
        ((StateLayout) a_(R.id.bew)).setOfflineClickListener(new g(this));
    }
}
