package com.bytedance.android.live.effect.e;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.effect.b.c;
import com.bytedance.android.live.effect.e.d;
import com.bytedance.android.live.effect.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.j.h;
import h.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class e extends com.bytedance.android.livesdk.ui.a {

    /* renamed from: g  reason: collision with root package name */
    public static final a f9814g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.android.livesdkapi.depend.model.a f9815a;

    /* renamed from: b  reason: collision with root package name */
    public final d f9816b = new d();

    /* renamed from: c  reason: collision with root package name */
    public String f9817c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f9818d = "";

    /* renamed from: e  reason: collision with root package name */
    public String f9819e = "";

    /* renamed from: f  reason: collision with root package name */
    public h.f.a.a<z> f9820f;

    /* renamed from: h  reason: collision with root package name */
    private HashMap f9821h;

    static {
        Covode.recordClassIndex(5007);
    }

    public final View a(int i2) {
        if (this.f9821h == null) {
            this.f9821h = new HashMap();
        }
        View view = (View) this.f9821h.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f9821h.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(5008);
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
        HashMap hashMap = this.f9821h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public static final class b implements d.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f9822a;

        static {
            Covode.recordClassIndex(5009);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(e eVar) {
            this.f9822a = eVar;
        }

        @Override // com.bytedance.android.live.effect.e.d.b
        public final void a(com.bytedance.android.livesdkapi.depend.model.a aVar) {
            l.d(aVar, "");
            this.f9822a.f9815a = aVar;
            DataChannel a2 = f.a(this.f9822a);
            if (a2 != null) {
                a2.c(m.class, aVar);
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f9823a;

        static {
            Covode.recordClassIndex(5010);
        }

        c(e eVar) {
            this.f9823a = eVar;
        }

        public final void onClick(View view) {
            i fragmentManager = this.f9823a.getFragmentManager();
            if (fragmentManager != null) {
                fragmentManager.a().a(this.f9823a).b();
            }
            h.f.a.a<z> aVar = this.f9823a.f9820f;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str2 = "";
        if (arguments == null || (str = arguments.getString("live_effect_panel_info")) == null) {
            str = str2;
        }
        this.f9817c = str;
        Bundle arguments2 = getArguments();
        if (!(arguments2 == null || (string = arguments2.getString("live_effect_panel_name")) == null)) {
            str2 = string;
        }
        this.f9819e = str2;
    }

    static final class d extends h.f.b.m implements h.f.a.b<List<? extends com.bytedance.android.live.effect.model.e<com.bytedance.android.livesdkapi.depend.model.a>>, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(5011);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends com.bytedance.android.live.effect.model.e<com.bytedance.android.livesdkapi.depend.model.a>> list) {
            T t;
            List<T> list2;
            T t2;
            T t3;
            String str;
            List<com.bytedance.android.livesdkapi.depend.model.a> b2;
            T t4;
            List<? extends com.bytedance.android.live.effect.model.e<com.bytedance.android.livesdkapi.depend.model.a>> list3 = list;
            l.d(list3, "");
            Iterator<T> it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (l.a((Object) t.f9889a, (Object) this.this$0.f9819e)) {
                    break;
                }
            }
            T t5 = t;
            if (!(t5 == null || (list2 = t5.f9890b) == null)) {
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        t2 = null;
                        break;
                    }
                    t2 = it2.next();
                    if (l.a((Object) this.this$0.f9817c, (Object) t2.f22997c)) {
                        break;
                    }
                }
                T t6 = t2;
                if (t6 != null) {
                    e eVar = this.this$0;
                    String str2 = t6.f22999e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    eVar.f9818d = str2;
                    LiveTextView liveTextView = (LiveTextView) this.this$0.a(R.id.d1v);
                    l.b(liveTextView, "");
                    liveTextView.setText(this.this$0.f9818d);
                    List<com.bytedance.android.livesdkapi.depend.model.a> list4 = t6.o;
                    if (list4 != null) {
                        e eVar2 = this.this$0;
                        com.bytedance.android.live.effect.b.c a2 = c.a.a();
                        if (a2 == null || (b2 = a2.b(com.bytedance.android.live.effect.api.a.f9639d)) == null) {
                            t3 = null;
                        } else {
                            Iterator<T> it3 = b2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    t4 = null;
                                    break;
                                }
                                t4 = it3.next();
                                if (l.a((Object) t4.x, (Object) eVar2.f9817c)) {
                                    break;
                                }
                            }
                            t3 = t4;
                        }
                        Iterator<com.bytedance.android.livesdkapi.depend.model.a> it4 = list4.iterator();
                        int i2 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                i2 = -1;
                                break;
                            }
                            String str3 = it4.next().f22997c;
                            if (t3 != null) {
                                str = t3.f22997c;
                            } else {
                                str = null;
                            }
                            if (l.a((Object) str3, (Object) str)) {
                                break;
                            }
                            i2++;
                        }
                        int b3 = h.b(i2, 0);
                        this.this$0.f9815a = list4.get(b3);
                        d dVar = this.this$0.f9816b;
                        l.d(list4, "");
                        j.d a3 = j.a(new a(dVar.f9806a, list4), true);
                        l.b(a3, "");
                        a3.a(dVar);
                        dVar.f9806a.clear();
                        dVar.f9806a.addAll(list4);
                        dVar.f9807b = b3;
                    }
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        d dVar = this.f9816b;
        b bVar = new b(this);
        l.d(bVar, "");
        dVar.f9808c = bVar;
        RecyclerView recyclerView = (RecyclerView) a(R.id.e6a);
        l.b(recyclerView, "");
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        RecyclerView recyclerView2 = (RecyclerView) a(R.id.e6a);
        l.b(recyclerView2, "");
        recyclerView2.setAdapter(this.f9816b);
        ((RecyclerView) a(R.id.e6a)).a(new com.bytedance.android.live.effect.c.i());
        RecyclerView recyclerView3 = (RecyclerView) a(R.id.e6a);
        l.b(recyclerView3, "");
        recyclerView3.setItemAnimator(null);
        LiveTextView liveTextView = (LiveTextView) a(R.id.d1v);
        l.b(liveTextView, "");
        liveTextView.setText(this.f9818d);
        ((ImageView) a(R.id.qb)).setOnClickListener(new c(this));
        DataChannel a2 = f.a(this);
        if (a2 != null) {
            a2.b((androidx.lifecycle.m) this, com.bytedance.android.live.effect.a.class, (h.f.a.b) new d(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.b8q, viewGroup, false);
    }
}
