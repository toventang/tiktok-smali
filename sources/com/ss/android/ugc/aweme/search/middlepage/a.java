package com.ss.android.ugc.aweme.search.middlepage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.ss.android.ugc.aweme.discover.model.TrendingData;
import com.ss.android.ugc.aweme.discover.ui.al;
import com.ss.android.ugc.aweme.search.l;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import f.a.t;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public final class a extends RecyclerView.ViewHolder {

    /* renamed from: g  reason: collision with root package name */
    public static final C3138a f121467g = new C3138a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<com.bytedance.ies.powerlist.b.a> f121468a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<Boolean> f121469b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public TrendingData f121470c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f121471d = true;

    /* renamed from: e  reason: collision with root package name */
    public final RecyclerView.n f121472e = new c(this);

    /* renamed from: f  reason: collision with root package name */
    public final al.e f121473f;

    /* renamed from: h  reason: collision with root package name */
    private PowerList f121474h;

    /* renamed from: i  reason: collision with root package name */
    private f.a.l.c<Integer> f121475i;

    static {
        Covode.recordClassIndex(79136);
    }

    /* renamed from: com.ss.android.ugc.aweme.search.middlepage.a$a  reason: collision with other inner class name */
    public static final class C3138a {
        static {
            Covode.recordClassIndex(79137);
        }

        private C3138a() {
        }

        public /* synthetic */ C3138a(byte b2) {
            this();
        }
    }

    public final void a() {
        LinearLayoutManager linearLayoutManager;
        int k2;
        int m2;
        ArrayList<l> arrayList;
        l lVar;
        al.e eVar;
        RecyclerView.i layoutManager = this.f121474h.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (k2 = (linearLayoutManager = (LinearLayoutManager) layoutManager).k()) <= (m2 = linearLayoutManager.m())) {
            while (true) {
                View c2 = layoutManager.c(k2);
                if (c2 != null) {
                    h.f.b.l.b(c2, "");
                    if (c2.getGlobalVisibleRect(new Rect()) && !this.f121469b.get(k2).booleanValue() && getLayoutPosition() != -1) {
                        this.f121469b.set(k2, true);
                        TrendingData trendingData = this.f121470c;
                        if (!(trendingData == null || (arrayList = trendingData.billboardInfo) == null || (lVar = arrayList.get(k2)) == null || (eVar = this.f121473f) == null)) {
                            h.f.b.l.b(lVar, "");
                            eVar.a(lVar, k2, this.f121468a.size());
                        }
                    }
                }
                if (k2 != m2) {
                    k2++;
                } else {
                    return;
                }
            }
        }
    }

    public static final class c extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f121477a;

        static {
            Covode.recordClassIndex(79139);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(a aVar) {
            this.f121477a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            h.f.b.l.d(recyclerView, "");
            super.a(recyclerView, i2);
            if (i2 == 0) {
                this.f121477a.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f121476a;

        static {
            Covode.recordClassIndex(79138);
        }

        b(a aVar) {
            this.f121476a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f121476a.f121469b.clear();
            int size = this.f121476a.f121468a.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f121476a.f121469b.add(false);
            }
            al.e eVar = this.f121476a.f121473f;
            if (eVar != null) {
                eVar.a(this.f121476a.f121472e);
            }
            this.f121476a.a();
            this.f121476a.f121471d = false;
        }
    }

    public final void a(TrendingData trendingData) {
        t<Integer> a2;
        int i2;
        h.f.b.l.d(trendingData, "");
        this.f121468a.clear();
        ArrayList<l> arrayList = trendingData.billboardInfo;
        if (arrayList != null) {
            for (T t : arrayList) {
                ArrayList<com.bytedance.ies.powerlist.b.a> arrayList2 = this.f121468a;
                al.e eVar = this.f121473f;
                ArrayList<l> arrayList3 = trendingData.billboardInfo;
                if (arrayList3 != null) {
                    i2 = arrayList3.size();
                } else {
                    i2 = 0;
                }
                arrayList2.add(new c(t, eVar, i2));
                this.f121469b.add(false);
            }
        }
        this.f121470c = trendingData;
        this.f121474h.getState().a();
        this.f121474h.getState().a(this.f121468a);
        if (this.f121471d) {
            if (this.f121475i == null) {
                f.a.l.c<Integer> cVar = new f.a.l.c<>();
                this.f121475i = cVar;
                t<Integer> f2 = cVar.f(1500, TimeUnit.MILLISECONDS);
                if (!(f2 == null || (a2 = f2.a(f.a.a.a.a.a(f.a.a.b.a.f157156a))) == null)) {
                    a2.d(new b(this));
                }
            }
            f.a.l.c<Integer> cVar2 = this.f121475i;
            if (cVar2 != null) {
                cVar2.onNext(0);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view, al.e eVar) {
        super(view);
        h.f.b.l.d(view, "");
        this.f121473f = eVar;
        View findViewById = view.findViewById(R.id.d7z);
        h.f.b.l.b(findViewById, "");
        this.f121474h = (PowerList) findViewById;
        this.f121474h.setItemAnimator(null);
        this.f121474h.a(TrendingItemCell.class);
    }
}
