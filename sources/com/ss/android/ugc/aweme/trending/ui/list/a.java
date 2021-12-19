package com.ss.android.ugc.aweme.trending.ui.list;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.ss.android.ugc.aweme.search.l;
import com.ss.android.ugc.aweme.trending.ui.list.b;
import com.ss.android.ugc.aweme.trending.ui.list.c;
import com.ss.android.ugc.aweme.utils.iv;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.i;
import h.z;
import java.util.List;

public final class a extends Fragment {

    /* renamed from: f  reason: collision with root package name */
    public static final b f141136f = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public AbstractC3739a f141137a;

    /* renamed from: b  reason: collision with root package name */
    public List<l> f141138b;

    /* renamed from: c  reason: collision with root package name */
    public PowerList f141139c;

    /* renamed from: d  reason: collision with root package name */
    public int f141140d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f141141e;

    /* renamed from: g  reason: collision with root package name */
    private String f141142g = "";

    /* renamed from: h  reason: collision with root package name */
    private final h.h f141143h = i.a((h.f.a.a) e.f141152a);

    /* renamed from: i  reason: collision with root package name */
    private String f141144i;

    /* renamed from: j  reason: collision with root package name */
    private View f141145j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f141146k = true;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f141147l = i.a((h.f.a.a) new d(this));

    /* renamed from: m  reason: collision with root package name */
    private final h.h f141148m = i.a((h.f.a.a) new h(this));
    private SparseArray n;

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.list.a$a  reason: collision with other inner class name */
    public interface AbstractC3739a {
        static {
            Covode.recordClassIndex(92158);
        }

        void a();

        void a(l lVar);

        void a(boolean z, l lVar);
    }

    static {
        Covode.recordClassIndex(92157);
    }

    private final boolean a() {
        return ((Boolean) this.f141143h.getValue()).booleanValue();
    }

    private final d.AnonymousClass1 c() {
        return (d.AnonymousClass1) this.f141147l.getValue();
    }

    private final h.AnonymousClass1 d() {
        return (h.AnonymousClass1) this.f141148m.getValue();
    }

    static final class b {
        static {
            Covode.recordClassIndex(92159);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static final class d extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(92161);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new b.a(this) {
                /* class com.ss.android.ugc.aweme.trending.ui.list.a.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f141151a;

                static {
                    Covode.recordClassIndex(92162);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f141151a = r1;
                }

                @Override // com.ss.android.ugc.aweme.trending.ui.list.b.a
                public final void a(View view, b bVar) {
                    h.f.b.l.d(view, "");
                    h.f.b.l.d(bVar, "");
                    AbstractC3739a aVar = this.f141151a.this$0.f141137a;
                    if (aVar != null) {
                        aVar.a(bVar.f141155a);
                    }
                }

                @Override // com.ss.android.ugc.aweme.trending.ui.list.b.a
                public final void a(boolean z, l lVar) {
                    h.f.b.l.d(lVar, "");
                    AbstractC3739a aVar = this.f141151a.this$0.f141137a;
                    if (aVar != null) {
                        aVar.a(z, lVar);
                    }
                }
            };
        }
    }

    static final class h extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(92166);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new c.a(this) {
                /* class com.ss.android.ugc.aweme.trending.ui.list.a.h.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ h f141154a;

                static {
                    Covode.recordClassIndex(92167);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f141154a = r1;
                }

                @Override // com.ss.android.ugc.aweme.trending.ui.list.c.a
                public final void a(View view, c cVar) {
                    h.f.b.l.d(view, "");
                    h.f.b.l.d(cVar, "");
                    AbstractC3739a aVar = this.f141154a.this$0.f141137a;
                    if (aVar != null) {
                        aVar.a(cVar.f141158a);
                    }
                }

                @Override // com.ss.android.ugc.aweme.trending.ui.list.c.a
                public final void a(boolean z, l lVar) {
                    h.f.b.l.d(lVar, "");
                    AbstractC3739a aVar = this.f141154a.this$0.f141137a;
                    if (aVar != null) {
                        aVar.a(z, lVar);
                    }
                }
            };
        }
    }

    static final class g extends m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(92165);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a aVar = this.this$0;
            aVar.f141140d = a.a(aVar).getHeight();
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.n;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class e extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f141152a = new e();

        static {
            Covode.recordClassIndex(92163);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (com.bytedance.ies.abmock.b.a().a(true, "billboard_style", 0) != com.ss.android.ugc.aweme.trending.a.a.f141038a) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141149a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Integer f141150b;

        static {
            Covode.recordClassIndex(92160);
        }

        c(a aVar, Integer num) {
            this.f141149a = aVar;
            this.f141150b = num;
        }

        public final void run() {
            int i2 = (int) (((float) this.f141149a.f141140d) * 0.3f);
            RecyclerView.i layoutManager = a.a(this.f141149a).getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager)) {
                layoutManager = null;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager != null) {
                linearLayoutManager.a(this.f141150b.intValue(), i2);
            }
            this.f141149a.f141141e = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b() {
        /*
        // Method dump skipped, instructions count: 267
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.trending.ui.list.a.b():void");
    }

    public final void a(AbstractC3739a aVar) {
        h.f.b.l.d(aVar, "");
        this.f141137a = aVar;
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141153a;

        static {
            Covode.recordClassIndex(92164);
        }

        f(a aVar) {
            this.f141153a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC3739a aVar = this.f141153a.f141137a;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public static final /* synthetic */ PowerList a(a aVar) {
        PowerList powerList = aVar.f141139c;
        if (powerList == null) {
            h.f.b.l.a("powerList");
        }
        return powerList;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        b();
        this.f141146k = false;
        PowerList powerList = this.f141139c;
        if (powerList == null) {
            h.f.b.l.a("powerList");
        }
        int height = powerList.getHeight();
        this.f141140d = height;
        if (height <= 0) {
            PowerList powerList2 = this.f141139c;
            if (powerList2 == null) {
                h.f.b.l.a("powerList");
            }
            iv.a(powerList2, new g(this));
        }
    }

    public final void a(List<l> list, String str, String str2) {
        h.f.b.l.d(list, "");
        h.f.b.l.d(str2, "");
        this.f141138b = list;
        if (str == null) {
            str = "";
        }
        this.f141144i = str;
        this.f141142g = str2;
        list.size();
        isAdded();
        if (isAdded()) {
            b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.b54, viewGroup, false);
        h.f.b.l.b(a2, "");
        View findViewById = a2.findViewById(R.id.erd);
        h.f.b.l.b(findViewById, "");
        PowerList powerList = (PowerList) findViewById;
        this.f141139c = powerList;
        if (powerList == null) {
            h.f.b.l.a("powerList");
        }
        powerList.a(TrendingSheetCell.class, TrendingSheetRichCell.class);
        View findViewById2 = a2.findViewById(R.id.erc);
        h.f.b.l.b(findViewById2, "");
        this.f141145j = findViewById2;
        if (findViewById2 == null) {
            h.f.b.l.a("closeButton");
        }
        findViewById2.setOnClickListener(new f(this));
        return a2;
    }
}
