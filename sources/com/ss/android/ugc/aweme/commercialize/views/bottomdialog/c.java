package com.ss.android.ugc.aweme.commercialize.views.bottomdialog;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.commercialize.model.ak;
import com.ss.android.ugc.aweme.commercialize.model.al;
import com.ss.android.ugc.aweme.commercialize.views.bottomdialog.b;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class c extends a {

    /* renamed from: e  reason: collision with root package name */
    public static final b f75961e = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final List<RecyclerView> f75962a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f75963b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public a f75964c;

    /* renamed from: d  reason: collision with root package name */
    public final al f75965d;

    /* renamed from: f  reason: collision with root package name */
    private final h.h f75966f = h.i.a((h.f.a.a) new j(this));

    /* renamed from: g  reason: collision with root package name */
    private final h.h f75967g = h.i.a((h.f.a.a) new i(this));

    /* renamed from: h  reason: collision with root package name */
    private final h.h f75968h = h.i.a((h.f.a.a) new h(this));

    public interface a {
        static {
            Covode.recordClassIndex(46844);
        }

        void a();

        void a(List<Integer> list);
    }

    static {
        Covode.recordClassIndex(46843);
    }

    private final LinearLayout c() {
        return (LinearLayout) this.f75966f.getValue();
    }

    public final AdBottomDialogConfirmView b() {
        return (AdBottomDialogConfirmView) this.f75967g.getValue();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(46845);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static final class h extends m implements h.f.a.a<TextView> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(46851);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.findViewById(R.id.a1p);
        }
    }

    static final class i extends m implements h.f.a.a<AdBottomDialogConfirmView> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(46852);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AdBottomDialogConfirmView invoke() {
            return this.this$0.findViewById(R.id.acm);
        }
    }

    static final class j extends m implements h.f.a.a<LinearLayout> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(46853);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinearLayout invoke() {
            return this.this$0.findViewById(R.id.czt);
        }
    }

    static final class e implements DialogInterface.OnCancelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f75973a;

        static {
            Covode.recordClassIndex(46848);
        }

        e(c cVar) {
            this.f75973a = cVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            a aVar = this.f75973a.f75964c;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f75975a;

        static {
            Covode.recordClassIndex(46850);
        }

        g(c cVar) {
            this.f75975a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a aVar = this.f75975a.f75964c;
            if (aVar != null) {
                aVar.a();
            }
            this.f75975a.dismiss();
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f75974a;

        static {
            Covode.recordClassIndex(46849);
        }

        f(c cVar) {
            this.f75974a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            List<b> list = this.f75974a.f75963b;
            ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(it.next().f75957a));
            }
            List<Integer> k2 = n.k(arrayList);
            a aVar = this.f75974a.f75964c;
            if (aVar != null) {
                aVar.a(k2);
            }
            this.f75974a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.c$c  reason: collision with other inner class name */
    public static final class C1732c implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f75969a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f75970b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f75971c;

        static {
            Covode.recordClassIndex(46846);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.views.bottomdialog.b.a
        public final void a(int i2) {
            if (this.f75971c != this.f75970b.f75963b.size() - 1 || i2 == -1) {
                AdBottomDialogConfirmView b2 = this.f75970b.b();
                if (b2 != null) {
                    b2.setClickable(false);
                }
                int i3 = this.f75970b.f75965d.f74863b;
                for (int i4 = this.f75971c + 1; i4 < i3; i4++) {
                    b bVar = this.f75970b.f75963b.get(i4);
                    bVar.f75959c.clear();
                    bVar.f75957a = -1;
                    if (i4 != this.f75971c + 1 || i2 == -1) {
                        this.f75970b.f75962a.get(i4).setVisibility(4);
                    } else {
                        List<ak> list = bVar.f75959c;
                        Collection<? extends ak> collection = this.f75969a.f75959c.get(i2).f74861b;
                        if (collection == null) {
                            collection = z.INSTANCE;
                        }
                        list.addAll(collection);
                        this.f75970b.f75962a.get(i4).setVisibility(0);
                    }
                    bVar.notifyDataSetChanged();
                }
                return;
            }
            AdBottomDialogConfirmView b3 = this.f75970b.b();
            if (b3 != null) {
                b3.setClickable(true);
            }
        }

        C1732c(b bVar, c cVar, int i2) {
            this.f75969a = bVar;
            this.f75970b = cVar;
            this.f75971c = i2;
        }
    }

    static final class d implements DialogInterface.OnShowListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f75972a;

        static {
            Covode.recordClassIndex(46847);
        }

        d(c cVar) {
            this.f75972a = cVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            c cVar = this.f75972a;
            b bVar = cVar.f75963b.get(0);
            bVar.f75959c.addAll(cVar.f75965d.f74864c);
            bVar.notifyDataSetChanged();
            cVar.f75962a.get(0).setVisibility(0);
            c cVar2 = this.f75972a;
            List<Integer> list = cVar2.f75965d.f74865d;
            if (list != null && (!list.isEmpty())) {
                int min = Math.min(list.size(), cVar2.f75963b.size());
                for (int i2 = 0; i2 < min; i2++) {
                    if (list.get(i2).intValue() >= 0 && list.get(i2).intValue() < cVar2.f75963b.get(i2).f75959c.size()) {
                        cVar2.f75963b.get(i2).a(list.get(i2).intValue());
                        cVar2.f75962a.get(i2).b(list.get(i2).intValue());
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.bottomdialog.a, androidx.appcompat.app.h
    public final void onCreate(Bundle bundle) {
        MethodCollector.i(10628);
        super.onCreate(bundle);
        AdBottomDialogConfirmView b2 = b();
        if (b2 != null) {
            b2.setOnClickListener(new f(this));
            b2.setClickable(false);
        }
        TextView textView = (TextView) this.f75968h.getValue();
        if (textView != null) {
            textView.setOnClickListener(new g(this));
        }
        int i2 = this.f75965d.f74863b;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                View view = new View(getContext());
                view.setBackgroundColor(Color.parseColor("#1e000000"));
                view.setLayoutParams(new LinearLayout.LayoutParams(com.ss.android.ugc.aweme.base.utils.n.a(0.5d), -1));
                LinearLayout c2 = c();
                if (c2 != null) {
                    c2.addView(view);
                }
            }
            RecyclerView recyclerView = new RecyclerView(getContext());
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            recyclerView.setVisibility(4);
            recyclerView.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
            ArrayList arrayList = new ArrayList();
            boolean z = true;
            if (this.f75965d.f74863b != 1) {
                z = false;
            }
            b bVar = new b(arrayList, z);
            bVar.f75958b = new C1732c(bVar, this, i3);
            recyclerView.setAdapter(bVar);
            LinearLayout c3 = c();
            if (c3 != null) {
                c3.addView(recyclerView);
            }
            this.f75962a.add(recyclerView);
            this.f75963b.add(bVar);
        }
        setOnShowListener(new d(this));
        setOnCancelListener(new e(this));
        MethodCollector.o(10628);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context, al alVar) {
        super(context);
        l.d(alVar, "");
        this.f75965d = alVar;
    }
}
