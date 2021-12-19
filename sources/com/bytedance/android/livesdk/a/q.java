package com.bytedance.android.livesdk.a;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.model.j;
import com.bytedance.android.live.s.e;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.List;

public final class q extends com.bytedance.android.livesdk.ui.a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f13346d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public j f13347a;

    /* renamed from: b  reason: collision with root package name */
    public View.OnClickListener f13348b;

    /* renamed from: c  reason: collision with root package name */
    public h.f.a.b<? super j, z> f13349c;

    /* renamed from: e  reason: collision with root package name */
    private HashMap f13350e;

    static {
        Covode.recordClassIndex(7432);
    }

    private View a(int i2) {
        if (this.f13350e == null) {
            this.f13350e = new HashMap();
        }
        View view = (View) this.f13350e.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f13350e.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(7433);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f13350e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        j jVar = this.f13347a;
        if (jVar != null) {
            h.f.a.b<? super j, z> bVar = this.f13349c;
            if (bVar != null) {
                bVar.invoke(jVar);
            }
            this.f13347a = null;
        }
        super.onDestroy();
    }

    static final class b extends m implements h.f.a.b<j, z> {
        final /* synthetic */ q this$0;

        static {
            Covode.recordClassIndex(7434);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(q qVar) {
            super(1);
            this.this$0 = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(j jVar) {
            final j jVar2 = jVar;
            l.d(jVar2, "");
            ((e) com.bytedance.android.live.t.a.a(e.class)).getMuteDuration().d(new f(this) {
                /* class com.bytedance.android.livesdk.a.q.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f13351a;

                static {
                    Covode.recordClassIndex(7435);
                }

                {
                    this.f13351a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    if (!l.a(obj, jVar2)) {
                        this.f13351a.this$0.f13347a = jVar2;
                        ((e) com.bytedance.android.live.t.a.a(e.class)).setMuteDuration(jVar2);
                    }
                }
            });
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(com.bytedance.android.live.design.a.a.a(getActivity()));
        l.b(cloneInContext, "");
        return cloneInContext;
    }

    static final class c extends m implements h.f.a.b<List<? extends j>, z> {
        final /* synthetic */ u $adapter;

        static {
            Covode.recordClassIndex(7436);
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
            ((e) com.bytedance.android.live.t.a.a(e.class)).getMuteDuration().d(new f(this) {
                /* class com.bytedance.android.livesdk.a.q.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f13353a;

                static {
                    Covode.recordClassIndex(7437);
                }

                {
                    this.f13353a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    j jVar = (j) obj;
                    u uVar = this.f13353a.$adapter;
                    l.b(jVar, "");
                    uVar.a(jVar);
                }
            });
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        ((FrameLayout) a(R.id.q9)).setOnClickListener(this.f13348b);
        RecyclerView recyclerView = (RecyclerView) a(R.id.ar8);
        l.b(recyclerView, "");
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        Context context = getContext();
        if (context == null) {
            l.b();
        }
        l.b(context, "");
        u uVar = new u(context);
        b bVar = new b(this);
        l.d(bVar, "");
        uVar.f13377d = bVar;
        RecyclerView recyclerView2 = (RecyclerView) a(R.id.ar8);
        l.b(recyclerView2, "");
        recyclerView2.setAdapter(uVar);
        ((e) com.bytedance.android.live.t.a.a(e.class)).fetchMuteDurationList(new c(uVar));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.b87, viewGroup, false);
    }
}
