package com.ss.android.ugc.aweme.discover.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.discover.helper.z;
import com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.ss.android.ugc.aweme.search.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class SearchIntermediateView extends FrameLayout {

    /* renamed from: j  reason: collision with root package name */
    public static final a f82147j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public SearchIntermediateViewModel f82148a;

    /* renamed from: b  reason: collision with root package name */
    public c f82149b;

    /* renamed from: c  reason: collision with root package name */
    i f82150c;

    /* renamed from: d  reason: collision with root package name */
    final z f82151d;

    /* renamed from: e  reason: collision with root package name */
    public int f82152e;

    /* renamed from: f  reason: collision with root package name */
    boolean f82153f;

    /* renamed from: g  reason: collision with root package name */
    public int f82154g;

    /* renamed from: h  reason: collision with root package name */
    final u<Integer> f82155h;

    /* renamed from: i  reason: collision with root package name */
    final u<Integer> f82156i;

    /* renamed from: k  reason: collision with root package name */
    private Fragment f82157k;

    /* renamed from: l  reason: collision with root package name */
    private int f82158l;

    /* renamed from: m  reason: collision with root package name */
    private b f82159m;

    public interface b {
        static {
            Covode.recordClassIndex(51124);
        }

        void a(MotionEvent motionEvent);
    }

    public interface c {
        static {
            Covode.recordClassIndex(51125);
        }

        void a(int i2);

        void b(com.ss.android.ugc.aweme.search.model.d dVar);
    }

    static {
        Covode.recordClassIndex(51122);
    }

    public SearchIntermediateView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public SearchIntermediateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51123);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final Fragment getFragment() {
        return this.f82157k;
    }

    public final int getOpenSugFromState() {
        return this.f82158l;
    }

    public final boolean b() {
        SearchIntermediateViewModel searchIntermediateViewModel = this.f82148a;
        if (searchIntermediateViewModel == null) {
            l.a("intermediateViewModel");
        }
        Integer value = searchIntermediateViewModel.getIntermediateState().getValue();
        if (value != null && value.intValue() == 1) {
            return true;
        }
        return false;
    }

    private final void c() {
        if (this.f82157k == null) {
            i iVar = this.f82150c;
            if (iVar == null) {
                l.a("fragmentManager");
            }
            this.f82157k = iVar.a("tag_intermediate");
        }
        if (this.f82157k == null) {
            this.f82157k = h.f121133a.g();
            i iVar2 = this.f82150c;
            if (iVar2 == null) {
                l.a("fragmentManager");
            }
            n a2 = iVar2.a();
            l.b(a2, "");
            int i2 = this.f82154g;
            Fragment fragment = this.f82157k;
            if (fragment == null) {
                l.b();
            }
            a2.b(i2, fragment, "tag_intermediate").c();
        }
    }

    public final boolean a() {
        SearchIntermediateViewModel searchIntermediateViewModel = this.f82148a;
        if (searchIntermediateViewModel == null) {
            l.a("intermediateViewModel");
        }
        Integer value = searchIntermediateViewModel.getIntermediateState().getValue();
        if (value != null && value.intValue() == 2) {
            return true;
        }
        return false;
    }

    public final void setFragment(Fragment fragment) {
        this.f82157k = fragment;
    }

    public final void setOpenSugFromState(int i2) {
        this.f82158l = i2;
    }

    public final void setOnDispatchTouchEventListener(b bVar) {
        l.d(bVar, "");
        this.f82159m = bVar;
    }

    public static final /* synthetic */ SearchIntermediateViewModel a(SearchIntermediateView searchIntermediateView) {
        SearchIntermediateViewModel searchIntermediateViewModel = searchIntermediateView.f82148a;
        if (searchIntermediateViewModel == null) {
            l.a("intermediateViewModel");
        }
        return searchIntermediateViewModel;
    }

    public static final /* synthetic */ c b(SearchIntermediateView searchIntermediateView) {
        c cVar = searchIntermediateView.f82149b;
        if (cVar == null) {
            l.a("responder");
        }
        return cVar;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        b bVar = this.f82159m;
        if (bVar != null) {
            bVar.a(motionEvent);
        }
        return dispatchTouchEvent;
    }

    static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchIntermediateView f82161a;

        static {
            Covode.recordClassIndex(51127);
        }

        e(SearchIntermediateView searchIntermediateView) {
            this.f82161a = searchIntermediateView;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                SearchIntermediateView.b(this.f82161a).a(num.intValue());
            }
        }
    }

    public final void a(String str) {
        l.d(str, "");
        c();
        this.f82151d.b();
        SearchIntermediateViewModel searchIntermediateViewModel = this.f82148a;
        if (searchIntermediateViewModel == null) {
            l.a("intermediateViewModel");
        }
        searchIntermediateViewModel.openSearchSug(str);
    }

    public final void a(boolean z) {
        if (!b()) {
            c();
            this.f82151d.b();
            SearchIntermediateViewModel searchIntermediateViewModel = this.f82148a;
            if (searchIntermediateViewModel == null) {
                l.a("intermediateViewModel");
            }
            searchIntermediateViewModel.openSearchSquare(z);
        }
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchIntermediateView f82160a;

        static {
            Covode.recordClassIndex(51126);
        }

        d(SearchIntermediateView searchIntermediateView) {
            this.f82160a = searchIntermediateView;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.search.model.d value;
            Integer num = (Integer) obj;
            if (num != null) {
                if (!(this.f82160a.f82152e == num.intValue() || num.intValue() != 0 || (value = SearchIntermediateView.a(this.f82160a).getOpenSearchParam().getValue()) == null)) {
                    SearchIntermediateView.b(this.f82160a).b(value);
                    if (SearchIntermediateView.a(this.f82160a).enterSearchMiddlePageByBack) {
                        SearchIntermediateView.a(this.f82160a).enterSearchMiddlePageByBack = false;
                    }
                }
                this.f82160a.f82152e = num.intValue();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ SearchIntermediateView(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SearchIntermediateView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(7891);
        this.f82154g = R.id.dv4;
        setVisibility(8);
        this.f82152e = 0;
        this.f82151d = new z(context, this);
        this.f82155h = new d(this);
        this.f82156i = new e(this);
        this.f82158l = 1;
        MethodCollector.o(7891);
    }
}
