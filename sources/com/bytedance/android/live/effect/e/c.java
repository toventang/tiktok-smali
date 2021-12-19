package com.bytedance.android.live.effect.e;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import com.bytedance.android.live.effect.e.b;
import com.bytedance.android.live.effect.m;
import com.bytedance.android.live.effect.model.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class c extends com.bytedance.android.livesdk.ui.a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f9801c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f9802a;

    /* renamed from: b  reason: collision with root package name */
    public final b f9803b = new b();

    /* renamed from: d  reason: collision with root package name */
    private HashMap f9804d;

    static {
        Covode.recordClassIndex(4998);
    }

    private View a() {
        if (this.f9804d == null) {
            this.f9804d = new HashMap();
        }
        View view = (View) this.f9804d.get(Integer.valueOf((int) R.id.e6a));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(R.id.e6a);
        this.f9804d.put(Integer.valueOf((int) R.id.e6a), findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(4999);
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
        HashMap hashMap = this.f9804d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public static final class b implements b.AbstractC0146b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f9805a;

        static {
            Covode.recordClassIndex(5000);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(c cVar) {
            this.f9805a = cVar;
        }

        @Override // com.bytedance.android.live.effect.e.b.AbstractC0146b
        public final void a(com.bytedance.android.livesdkapi.depend.model.a aVar) {
            l.d(aVar, "");
            DataChannel a2 = f.a(this.f9805a);
            if (a2 != null) {
                a2.c(m.class, aVar);
            }
        }
    }

    public static final /* synthetic */ String a(c cVar) {
        String str = cVar.f9802a;
        if (str == null) {
            l.a("effectPanelName");
        }
        return str;
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("live_effect_panel_name")) == null) {
            str = "";
        }
        this.f9802a = str;
    }

    /* renamed from: com.bytedance.android.live.effect.e.c$c  reason: collision with other inner class name */
    static final class C0147c extends h.f.b.m implements h.f.a.b<List<? extends e<com.bytedance.android.livesdkapi.depend.model.a>>, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(5001);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0147c(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends e<com.bytedance.android.livesdkapi.depend.model.a>> list) {
            T t;
            List<T> list2;
            List<? extends e<com.bytedance.android.livesdkapi.depend.model.a>> list3 = list;
            l.d(list3, "");
            Iterator<T> it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (l.a((Object) t.f9889a, (Object) c.a(this.this$0))) {
                    break;
                }
            }
            T t2 = t;
            if (!(t2 == null || (list2 = t2.f9890b) == null)) {
                b bVar = this.this$0.f9803b;
                int a2 = com.bytedance.android.live.effect.f.b.a(c.a(this.this$0), list2);
                l.d(list2, "");
                bVar.f9791b = a2;
                j.d a3 = j.a(new a(bVar.f9790a, list2), true);
                l.b(a3, "");
                a3.a(bVar);
                bVar.f9790a.clear();
                bVar.f9790a.addAll(list2);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        b bVar = this.f9803b;
        b bVar2 = new b(this);
        l.d(bVar2, "");
        bVar.f9792c = bVar2;
        RecyclerView recyclerView = (RecyclerView) a();
        l.b(recyclerView, "");
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        RecyclerView recyclerView2 = (RecyclerView) a();
        l.b(recyclerView2, "");
        recyclerView2.setAdapter(this.f9803b);
        RecyclerView recyclerView3 = (RecyclerView) a();
        l.b(recyclerView3, "");
        recyclerView3.setItemAnimator(null);
        DataChannel a2 = f.a(this);
        if (a2 != null) {
            a2.b((androidx.lifecycle.m) this, com.bytedance.android.live.effect.a.class, (h.f.a.b) new C0147c(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.b8p, viewGroup, false);
    }
}
