package com.ss.android.ugc.aweme.sharer.ui.bar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.zhiliaoapp.musically.R;
import h.a.z;
import h.f.b.j;
import h.f.b.l;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class ShareActionBar extends FrameLayout implements c {

    /* renamed from: a  reason: collision with root package name */
    public List<? extends h> f124615a = z.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView f124616b;

    /* renamed from: c  reason: collision with root package name */
    private c f124617c;

    /* renamed from: d  reason: collision with root package name */
    private final a f124618d;

    /* renamed from: e  reason: collision with root package name */
    private final LinearLayoutManager f124619e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<String> f124620f = new LinkedHashSet();

    final /* synthetic */ class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.a f124622a;

        static {
            Covode.recordClassIndex(81890);
        }

        c(h.f.a.a aVar) {
            this.f124622a = aVar;
        }

        public final /* synthetic */ void run() {
            l.b(this.f124622a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(81887);
    }

    static final /* synthetic */ class b extends j implements h.f.a.a<h.z> {
        static {
            Covode.recordClassIndex(81889);
        }

        b(ShareActionBar shareActionBar) {
            super(0, shareActionBar, ShareActionBar.class, "filterVisible", "filterVisible()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            ((ShareActionBar) this.receiver).a();
            return h.z.f158842a;
        }
    }

    public final void a() {
        List<? extends h> list = this.f124615a;
        if (list != null && !list.isEmpty()) {
            int m2 = this.f124619e.m();
            int k2 = this.f124619e.k();
            if (m2 >= 0 && k2 >= 0 && k2 <= m2) {
                while (true) {
                    h hVar = (h) this.f124615a.get(k2);
                    if (!this.f124620f.contains(hVar.c())) {
                        this.f124620f.add(hVar.c());
                        Context context = getContext();
                        l.b(context, "");
                        hVar.a(context);
                    }
                    if (k2 != m2) {
                        k2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static final class a extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShareActionBar f124621a;

        static {
            Covode.recordClassIndex(81888);
        }

        a(ShareActionBar shareActionBar) {
            this.f124621a = shareActionBar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            l.d(recyclerView, "");
            super.a(recyclerView, i2);
            this.f124621a.a();
        }
    }

    public final void a(c cVar) {
        l.d(cVar, "");
        this.f124617c = cVar;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.bar.c
    public final void a(h hVar) {
        l.d(hVar, "");
        c cVar = this.f124617c;
        if (cVar != null) {
            cVar.a(hVar);
        }
    }

    public final void a(List<? extends h> list) {
        l.d(list, "");
        this.f124615a = list;
        this.f124618d.a(list);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareActionBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
        MethodCollector.i(10079);
        com.a.a(LayoutInflater.from(getContext()), R.layout.ahf, this, true);
        View findViewById = findViewById(R.id.ca);
        l.b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f124616b = recyclerView;
        a aVar = new a(this);
        this.f124618d = aVar;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.f124619e = linearLayoutManager;
        aVar.a(this.f124615a);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(aVar);
        recyclerView.a(new a(this));
        MethodCollector.o(10079);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        MethodCollector.i(10077);
        super.onLayout(z, i2, i3, i4, i5);
        postDelayed(new c(new b(this)), 300);
        MethodCollector.o(10077);
    }
}
