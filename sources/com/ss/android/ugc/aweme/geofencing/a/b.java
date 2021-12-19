package com.ss.android.ugc.aweme.geofencing.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import f.a.d.g;
import h.a.z;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b extends RecyclerView.a<a> {

    /* renamed from: a  reason: collision with root package name */
    public final List<com.ss.android.ugc.aweme.geofencing.c.a> f99025a;

    /* renamed from: b  reason: collision with root package name */
    public final f.a.l.b<Boolean> f99026b;

    /* renamed from: c  reason: collision with root package name */
    private List<com.ss.android.ugc.aweme.geofencing.c.a> f99027c;

    /* renamed from: d  reason: collision with root package name */
    private final List<com.ss.android.ugc.aweme.geofencing.c.a> f99028d;

    static {
        Covode.recordClassIndex(62963);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    private /* synthetic */ b() {
        this(z.INSTANCE);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f99027c.size();
    }

    public final List<com.ss.android.ugc.aweme.geofencing.c.a> a() {
        List<com.ss.android.ugc.aweme.geofencing.c.a> list = this.f99025a;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t.getSelected()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f99029a;

        /* renamed from: b  reason: collision with root package name */
        public final ImageView f99030b;

        static {
            Covode.recordClassIndex(62964);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.d(view, "");
            View findViewById = view.findViewById(R.id.ba4);
            l.b(findViewById, "");
            this.f99029a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.ba5);
            l.b(findViewById2, "");
            this.f99030b = (ImageView) findViewById2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.a.b$b  reason: collision with other inner class name */
    public static final class C2414b<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f99031a;

        static {
            Covode.recordClassIndex(62965);
        }

        public C2414b(b bVar) {
            this.f99031a = bVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            l.d(obj, "");
            List<com.ss.android.ugc.aweme.geofencing.c.a> list = this.f99031a.f99025a;
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (t.getSelected()) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f99032a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.geofencing.c.a f99033b;

        static {
            Covode.recordClassIndex(62966);
        }

        c(b bVar, com.ss.android.ugc.aweme.geofencing.c.a aVar) {
            this.f99032a = bVar;
            this.f99033b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.geofencing.c.a aVar = this.f99033b;
            aVar.setSelected(!aVar.getSelected());
            this.f99032a.f99026b.onNext(Boolean.valueOf(this.f99033b.getSelected()));
            this.f99032a.notifyDataSetChanged();
        }
    }

    public final void a(String str) {
        l.d(str, "");
        List<com.ss.android.ugc.aweme.geofencing.c.a> list = this.f99025a;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (p.a((CharSequence) t.getTranslation(), str, 0, true, 2) != -1) {
                arrayList.add(t);
            }
        }
        this.f99027c = arrayList;
        notifyDataSetChanged();
    }

    public b(List<com.ss.android.ugc.aweme.geofencing.c.a> list) {
        T t;
        l.d(list, "");
        this.f99028d = list;
        if (com.ss.android.ugc.aweme.geofencing.b.a.f99038a.isEmpty()) {
            com.ss.android.ugc.aweme.geofencing.b.a.b();
        }
        List<com.ss.android.ugc.aweme.geofencing.c.a> list2 = com.ss.android.ugc.aweme.geofencing.b.a.f99038a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(com.ss.android.ugc.aweme.geofencing.c.a.copy$default(it.next(), null, null, false, 7, null));
        }
        this.f99025a = arrayList;
        f.a.l.b<Boolean> a2 = f.a.l.b.a((Object) false);
        l.b(a2, "");
        this.f99026b = a2;
        this.f99027c = arrayList;
        List<com.ss.android.ugc.aweme.geofencing.c.a> list3 = this.f99028d;
        ArrayList<com.ss.android.ugc.aweme.geofencing.c.a> arrayList2 = new ArrayList();
        for (T t2 : list3) {
            if (t2.getSelected()) {
                arrayList2.add(t2);
            }
        }
        for (com.ss.android.ugc.aweme.geofencing.c.a aVar : arrayList2) {
            Iterator<T> it2 = this.f99025a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    t = null;
                    break;
                }
                t = it2.next();
                if (l.a((Object) t.getCode(), (Object) aVar.getCode())) {
                    break;
                }
            }
            T t3 = t;
            if (t3 != null) {
                t3.setSelected(true);
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a aVar, int i2) {
        int i3;
        a aVar2 = aVar;
        l.d(aVar2, "");
        com.ss.android.ugc.aweme.geofencing.c.a aVar3 = this.f99027c.get(i2);
        aVar2.f99029a.setText(aVar3.getTranslation());
        ImageView imageView = aVar2.f99030b;
        if (aVar3.getSelected()) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        imageView.setVisibility(i3);
        aVar2.itemView.setOnClickListener(new c(this, aVar3));
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(11140);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_k, viewGroup, false);
        l.b(a3, "");
        a aVar = new a(a3);
        try {
            if (aVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = aVar.getClass().getName();
        MethodCollector.o(11140);
        return aVar;
    }
}
