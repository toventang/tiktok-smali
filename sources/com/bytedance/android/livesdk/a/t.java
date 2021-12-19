package com.bytedance.android.livesdk.a;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.model.j;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.livesdk.j.br;
import com.bytedance.android.livesdk.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.HashMap;
import java.util.List;

public final class t extends v {

    /* renamed from: b  reason: collision with root package name */
    public static final a f13367b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public h.f.a.b<? super j, z> f13368a;

    /* renamed from: c  reason: collision with root package name */
    private final h f13369c = i.a((h.f.a.a) new b(this));

    /* renamed from: d  reason: collision with root package name */
    private HashMap f13370d;

    static {
        Covode.recordClassIndex(7448);
    }

    private final boolean d() {
        return ((Boolean) this.f13369c.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f13370d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f13370d == null) {
            this.f13370d = new HashMap();
        }
        View view = (View) this.f13370d.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f13370d.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(7449);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ t this$0;

        static {
            Covode.recordClassIndex(7450);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(t tVar) {
            super(0);
            this.this$0 = tVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            Resources resources;
            Configuration configuration;
            androidx.fragment.app.e activity = this.this$0.getActivity();
            boolean z = true;
            if (activity == null || (resources = activity.getResources()) == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        int i2;
        int i3;
        int i4;
        int a2;
        if (d()) {
            i2 = R.layout.b89;
        } else {
            i2 = R.layout.b8_;
        }
        v.b bVar = new v.b(i2);
        if (d()) {
            i3 = R.style.a2d;
        } else {
            i3 = R.style.a2e;
        }
        bVar.f22375b = i3;
        bVar.f22377d = d();
        bVar.a(new ColorDrawable(0));
        if (d()) {
            i4 = 80;
        } else {
            i4 = 8388613;
        }
        bVar.f22380g = i4;
        int i5 = -1;
        if (d()) {
            a2 = -1;
        } else {
            a2 = y.a(375.0f);
        }
        bVar.f22381h = a2;
        if (d()) {
            i5 = -2;
        }
        bVar.f22382i = i5;
        return bVar;
    }

    static final class e extends m implements h.f.a.b<z, z> {
        final /* synthetic */ t this$0;

        static {
            Covode.recordClassIndex(7454);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(t tVar) {
            super(1);
            this.this$0 = tVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            l.d(zVar, "");
            this.this$0.dismiss();
            return z.f158842a;
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f13372a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f13373b;

        static {
            Covode.recordClassIndex(7453);
        }

        d(t tVar, u uVar) {
            this.f13372a = tVar;
            this.f13373b = uVar;
        }

        public final void onClick(View view) {
            j jVar = this.f13373b.f13376c;
            if (jVar != null) {
                h.f.a.b<? super j, z> bVar = this.f13372a.f13368a;
                if (bVar != null) {
                    bVar.invoke(jVar);
                }
                this.f13372a.dismiss();
            }
        }
    }

    static final class c extends m implements h.f.a.b<List<? extends j>, z> {
        final /* synthetic */ u $adapter;

        static {
            Covode.recordClassIndex(7451);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(u uVar) {
            super(1);
            this.$adapter = uVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.bytedance.android.livesdk.a.u */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends j> list) {
            List<? extends j> list2 = list;
            l.d(list2, "");
            this.$adapter.a((List<j>) list2);
            ((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).getMuteDuration().d(new f(this) {
                /* class com.bytedance.android.livesdk.a.t.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f13371a;

                static {
                    Covode.recordClassIndex(7452);
                }

                {
                    this.f13371a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    j jVar = (j) obj;
                    u uVar = this.f13371a.$adapter;
                    l.b(jVar, "");
                    uVar.a(jVar);
                }
            });
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) a_(R.id.ar8);
        l.b(recyclerView, "");
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        Context context = getContext();
        if (context == null) {
            l.b();
        }
        l.b(context, "");
        u uVar = new u(context, d());
        RecyclerView recyclerView2 = (RecyclerView) a_(R.id.ar8);
        l.b(recyclerView2, "");
        recyclerView2.setAdapter(uVar);
        ((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).fetchMuteDurationList(new c(uVar));
        ((LiveButton) a_(R.id.acp)).setOnClickListener(new d(this, uVar));
        DataChannel dataChannel = this.p;
        if (dataChannel != null) {
            dataChannel.a((androidx.lifecycle.m) this, br.class, (h.f.a.b) new e(this));
        }
    }
}
