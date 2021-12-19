package com.ss.android.ugc.aweme.share.more.ui;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.zhiliaoapp.musically.R;
import h.a.z;
import h.f.b.j;
import h.f.b.l;
import h.f.b.m;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class ShareActionVerticalList extends FrameLayout implements com.ss.android.ugc.aweme.sharer.ui.bar.c {

    /* renamed from: b  reason: collision with root package name */
    public static final c f124124b = new c((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public List<? extends h> f124125a = z.INSTANCE;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.aweme.sharer.ui.bar.c f124126c;

    /* renamed from: d  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.share.more.ui.a.a f124127d;

    /* renamed from: e  reason: collision with root package name */
    private final RecyclerView f124128e;

    /* renamed from: f  reason: collision with root package name */
    private final LinearLayoutManager f124129f;

    /* renamed from: g  reason: collision with root package name */
    private final Set<String> f124130g = new LinkedHashSet();

    final /* synthetic */ class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.a f124132a;

        static {
            Covode.recordClassIndex(81527);
        }

        e(h.f.a.a aVar) {
            this.f124132a = aVar;
        }

        public final /* synthetic */ void run() {
            l.b(this.f124132a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(81522);
    }

    public static final class c {
        static {
            Covode.recordClassIndex(81525);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    static final /* synthetic */ class d extends j implements h.f.a.a<h.z> {
        static {
            Covode.recordClassIndex(81526);
        }

        d(ShareActionVerticalList shareActionVerticalList) {
            super(0, shareActionVerticalList, ShareActionVerticalList.class, "filterVisible", "filterVisible()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            ((ShareActionVerticalList) this.receiver).a();
            return h.z.f158842a;
        }
    }

    public final void a() {
        List<? extends h> list = this.f124125a;
        if (list != null && !list.isEmpty()) {
            int m2 = this.f124129f.m();
            int k2 = this.f124129f.k();
            if (m2 >= 0 && k2 >= 0 && k2 <= m2) {
                while (true) {
                    h hVar = (h) this.f124125a.get(k2);
                    if (!this.f124130g.contains(hVar.c())) {
                        this.f124130g.add(hVar.c());
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
        final /* synthetic */ ShareActionVerticalList f124131a;

        static {
            Covode.recordClassIndex(81523);
        }

        a(ShareActionVerticalList shareActionVerticalList) {
            this.f124131a = shareActionVerticalList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            l.d(recyclerView, "");
            super.a(recyclerView, i2);
            this.f124131a.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.bar.c
    public final void a(h hVar) {
        l.d(hVar, "");
        com.ss.android.ugc.aweme.sharer.ui.bar.c cVar = this.f124126c;
        if (cVar != null) {
            cVar.a(hVar);
        }
    }

    public final void a(List<? extends h> list) {
        l.d(list, "");
        this.f124125a = list;
        this.f124127d.a(list);
    }

    static final class b extends m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ ShareActionVerticalList this$0;

        static {
            Covode.recordClassIndex(81524);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ShareActionVerticalList shareActionVerticalList) {
            super(1);
            this.this$0 = shareActionVerticalList;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            int intValue = num.intValue();
            boolean z = false;
            if ((intValue >= this.this$0.f124125a.size() || !(this.this$0.f124125a.get(intValue) instanceof com.ss.android.ugc.aweme.share.more.b.a)) && ((intValue >= this.this$0.f124125a.size() - 1 || !(this.this$0.f124125a.get(intValue + 1) instanceof com.ss.android.ugc.aweme.share.more.b.a)) && intValue != this.this$0.f124125a.size() - 1)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public static final class f implements com.ss.android.ugc.aweme.sharer.ui.bar.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sharer.ui.e f124133a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f124134b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f124135c;

        static {
            Covode.recordClassIndex(81528);
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.bar.c
        public final void a(h hVar) {
            h.f.a.a aVar;
            l.d(hVar, "");
            if (!this.f124133a.f124657i.a(hVar, this.f124134b)) {
                hVar.a(this.f124134b, this.f124133a.f124657i);
            }
            com.ss.android.ugc.aweme.sharer.ui.f fVar = this.f124133a.f124660l;
            if (fVar != null) {
                fVar.a(hVar, this.f124133a.f124657i, this.f124134b);
            }
            if (hVar.f()) {
                h.f.a.a aVar2 = this.f124135c;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            } else if (hVar.e() && (aVar = this.f124135c) != null) {
                aVar.invoke();
            }
        }

        f(com.ss.android.ugc.aweme.sharer.ui.e eVar, Context context, h.f.a.a aVar) {
            this.f124133a = eVar;
            this.f124134b = context;
            this.f124135c = aVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareActionVerticalList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
        MethodCollector.i(10700);
        com.a.a(LayoutInflater.from(getContext()), R.layout.azs, this, true);
        View findViewById = findViewById(R.id.cn);
        l.b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f124128e = recyclerView;
        com.ss.android.ugc.aweme.share.more.ui.a.a aVar = new com.ss.android.ugc.aweme.share.more.ui.a.a(this);
        this.f124127d = aVar;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.f124129f = linearLayoutManager;
        aVar.a(this.f124125a);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(aVar);
        recyclerView.a(new a(this));
        int b2 = (int) n.b(recyclerView.getContext(), 0.5f);
        int b3 = (int) n.b(recyclerView.getContext(), 16.0f);
        int b4 = (int) n.b(recyclerView.getContext(), 16.0f);
        a aVar2 = new a(b2, Color.parseColor("#1F161823"), new b(this));
        aVar2.f124136a = b3;
        aVar2.f124137b = b4;
        recyclerView.b(aVar2);
        MethodCollector.o(10700);
    }

    public final void a(com.ss.android.ugc.aweme.sharer.ui.e eVar, Context context, h.f.a.a<h.z> aVar) {
        l.d(eVar, "");
        l.d(context, "");
        this.f124126c = new f(eVar, context, aVar);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        MethodCollector.i(10533);
        super.onLayout(z, i2, i3, i4, i5);
        postDelayed(new e(new d(this)), 300);
        MethodCollector.o(10533);
    }
}
