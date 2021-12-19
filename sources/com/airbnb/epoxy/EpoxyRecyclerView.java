package com.airbnb.epoxy;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.a.i;
import com.bytedance.analytics.a.f;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EpoxyRecyclerView extends RecyclerView {
    public static final a P = new a((byte) 0);
    private static final a ab = new a();
    public boolean O;
    private final r Q;
    private n R;
    private RecyclerView.a<?> S;
    private boolean T;
    private int U;
    private final Runnable V;
    private final List<com.airbnb.epoxy.a.c<?>> W;
    private final List<c<?, ?, ?>> aa;

    static final class ModelBuilderCallbackController extends n {
        private b callback = new a();

        static {
            Covode.recordClassIndex(2063);
        }

        public static final class a implements b {
            static {
                Covode.recordClassIndex(2064);
            }

            @Override // com.airbnb.epoxy.EpoxyRecyclerView.b
            public final void a(n nVar) {
                l.c(nVar, "");
            }

            a() {
            }
        }

        public final b getCallback() {
            return this.callback;
        }

        /* access modifiers changed from: protected */
        @Override // com.airbnb.epoxy.n
        public final void buildModels() {
            this.callback.a(this);
        }

        public final void setCallback(b bVar) {
            l.c(bVar, "");
            this.callback = bVar;
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(2068);
        }

        void a(n nVar);
    }

    /* access modifiers changed from: package-private */
    public static final class c<T extends s<?>, U extends i, P extends com.airbnb.epoxy.a.d> {

        /* renamed from: a  reason: collision with root package name */
        public final int f4958a;

        /* renamed from: b  reason: collision with root package name */
        public final m<Context, RuntimeException, z> f4959b;

        /* renamed from: c  reason: collision with root package name */
        public final com.airbnb.epoxy.a.a<T, U, P> f4960c;

        /* renamed from: d  reason: collision with root package name */
        public final h.f.a.a<P> f4961d;

        static {
            Covode.recordClassIndex(2069);
        }
    }

    public EpoxyRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    static final class WithModelsController extends n {
        private h.f.a.b<? super n, z> callback = a.f4957a;

        static {
            Covode.recordClassIndex(2065);
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super com.airbnb.epoxy.n, h.z>, h.f.a.b<com.airbnb.epoxy.n, h.z> */
        public final h.f.a.b<n, z> getCallback() {
            return this.callback;
        }

        /* access modifiers changed from: protected */
        @Override // com.airbnb.epoxy.n
        public final void buildModels() {
            this.callback.invoke(this);
        }

        static final class a extends h.f.b.m implements h.f.a.b<n, z> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f4957a = new a();

            static {
                Covode.recordClassIndex(2066);
            }

            a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(n nVar) {
                l.c(nVar, "");
                return z.f158842a;
            }
        }

        public final void setCallback(h.f.a.b<? super n, z> bVar) {
            l.c(bVar, "");
            this.callback = bVar;
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(2067);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final r getSpacingDecorator() {
        return this.Q;
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.a<RecyclerView.RecycledViewPool> {
        final /* synthetic */ EpoxyRecyclerView this$0;

        static {
            Covode.recordClassIndex(2070);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(EpoxyRecyclerView epoxyRecyclerView) {
            super(0);
            this.this$0 = epoxyRecyclerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RecyclerView.RecycledViewPool invoke() {
            return new al();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void requestLayout() {
        t();
        super.requestLayout();
    }

    private final void u() {
        this.S = null;
        if (this.O) {
            removeCallbacks(this.V);
            this.O = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        RecyclerView.a<?> aVar = this.S;
        if (aVar != null) {
            a((RecyclerView.a) aVar, false);
        }
        u();
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EpoxyRecyclerView f4962a;

        static {
            Covode.recordClassIndex(2071);
        }

        e(EpoxyRecyclerView epoxyRecyclerView) {
            this.f4962a = epoxyRecyclerView;
        }

        public final void run() {
            if (this.f4962a.O) {
                this.f4962a.O = false;
                this.f4962a.q();
            }
        }
    }

    static {
        Covode.recordClassIndex(2062);
    }

    private final void v() {
        if (b.a(getContext())) {
            getRecycledViewPool().clear();
        }
    }

    public final void q() {
        RecyclerView.a<?> adapter = getAdapter();
        if (adapter != null) {
            a((RecyclerView.a) null, true);
            this.S = adapter;
        }
        v();
    }

    private final void t() {
        RecyclerView.i layoutManager = getLayoutManager();
        n nVar = this.R;
        if ((layoutManager instanceof GridLayoutManager) && nVar != null) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            if (nVar.getSpanCount() != gridLayoutManager.f3760b || gridLayoutManager.f3765g != nVar.getSpanSizeLookup()) {
                nVar.setSpanCount(gridLayoutManager.f3760b);
                gridLayoutManager.a(nVar.getSpanSizeLookup());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Iterator<T> it = this.W.iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = it.next().f4971a.f4980a.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        if (this.T) {
            int i2 = this.U;
            if (i2 > 0) {
                this.O = true;
                postDelayed(this.V, (long) i2);
            } else {
                q();
            }
        }
        v();
    }

    private void s() {
        setClipToPadding(false);
        a aVar = ab;
        Context context = getContext();
        l.a((Object) context, "");
        d dVar = new d(this);
        l.c(context, "");
        l.c(dVar, "");
        Iterator<PoolReference> it = aVar.f4966a.iterator();
        l.a((Object) it, "");
        PoolReference poolReference = null;
        while (it.hasNext()) {
            PoolReference next = it.next();
            l.a((Object) next, "");
            PoolReference poolReference2 = next;
            if (poolReference2.a() == context) {
                if (poolReference == null) {
                    poolReference = poolReference2;
                } else {
                    throw new IllegalStateException("A pool was already found");
                }
            } else if (b.a(poolReference2.a())) {
                poolReference2.f4963a.clear();
                it.remove();
            }
        }
        if (poolReference == null) {
            poolReference = new PoolReference(context, (RecyclerView.RecycledViewPool) dVar.invoke(), aVar);
            androidx.lifecycle.i a2 = a.a(context);
            if (a2 != null) {
                a2.a(poolReference);
            }
            aVar.f4966a.add(poolReference);
        }
        setRecycledViewPool(poolReference.f4963a);
    }

    private final void r() {
        com.airbnb.epoxy.a.c<?> cVar;
        Iterator<T> it = this.W.iterator();
        while (it.hasNext()) {
            b((RecyclerView.n) it.next());
        }
        this.W.clear();
        RecyclerView.a adapter = getAdapter();
        if (adapter != null) {
            l.a((Object) adapter, "");
            for (T t : this.aa) {
                if (adapter instanceof l) {
                    l lVar = (l) adapter;
                    h.f.a.a<P> aVar = t.f4961d;
                    m<Context, RuntimeException, z> mVar = t.f4959b;
                    int i2 = t.f4958a;
                    List a2 = n.a(t.f4960c);
                    l.c(lVar, "");
                    l.c(aVar, "");
                    l.c(mVar, "");
                    l.c(a2, "");
                    cVar = new com.airbnb.epoxy.a.c<>(lVar, (h.f.a.a<? extends Object>) aVar, (m<? super Context, ? super RuntimeException, z>) mVar, i2, (List<? extends com.airbnb.epoxy.a.a<?, ?, ? extends Object>>) a2);
                } else {
                    n nVar = this.R;
                    if (nVar != null) {
                        h.f.a.a<P> aVar2 = t.f4961d;
                        m<Context, RuntimeException, z> mVar2 = t.f4959b;
                        int i3 = t.f4958a;
                        List a3 = n.a(t.f4960c);
                        l.c(nVar, "");
                        l.c(aVar2, "");
                        l.c(mVar2, "");
                        l.c(a3, "");
                        cVar = new com.airbnb.epoxy.a.c<>(nVar, aVar2, mVar2, i3, a3);
                    }
                }
                this.W.add(cVar);
                a(cVar);
            }
        }
    }

    public final void setDelayMsWhenRemovingAdapterOnDetach(int i2) {
        this.U = i2;
    }

    public final void setRemoveAdapterWhenDetachedFromWindow(boolean z) {
        this.T = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.i iVar) {
        super.setLayoutManager(iVar);
        t();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.a<?> aVar) {
        super.setAdapter(aVar);
        u();
        r();
    }

    public final void setControllerAndBuildModels(n nVar) {
        l.c(nVar, "");
        nVar.requestModelBuild();
        setController(nVar);
    }

    public final void setItemSpacingRes(int i2) {
        setItemSpacingPx(getResources().getDimensionPixelOffset(i2));
    }

    public final void setController(n nVar) {
        l.c(nVar, "");
        this.R = nVar;
        setAdapter(nVar.getAdapter());
        t();
    }

    public final void setItemSpacingDp(int i2) {
        Resources resources = getResources();
        l.a((Object) resources, "");
        setItemSpacingPx((int) TypedValue.applyDimension(1, (float) i2, resources.getDisplayMetrics()));
    }

    public void setItemSpacingPx(int i2) {
        c(this.Q);
        this.Q.f5066a = i2;
        if (i2 > 0) {
            b(this.Q);
        }
    }

    public void setModels(List<? extends s<?>> list) {
        l.c(list, "");
        n nVar = this.R;
        if (!(nVar instanceof SimpleEpoxyController)) {
            nVar = null;
        }
        SimpleEpoxyController simpleEpoxyController = (SimpleEpoxyController) nVar;
        if (simpleEpoxyController == null) {
            simpleEpoxyController = new SimpleEpoxyController();
            setController(simpleEpoxyController);
        }
        simpleEpoxyController.setModels(list);
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        boolean z;
        LinearLayoutManager linearLayoutManager;
        l.c(layoutParams, "");
        if (getLayoutParams() == null) {
            z = true;
        } else {
            z = false;
        }
        super.setLayoutParams(layoutParams);
        if (z && getLayoutManager() == null) {
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            if (layoutParams2.height == -1 || layoutParams2.height == 0) {
                if (layoutParams2.width == -1 || layoutParams2.width == 0) {
                    setHasFixedSize(true);
                }
                getContext();
                linearLayoutManager = new LinearLayoutManager();
            } else {
                getContext();
                linearLayoutManager = new LinearLayoutManager(0, false);
            }
            setLayoutManager(linearLayoutManager);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void a(RecyclerView.a<?> aVar, boolean z) {
        super.a(aVar, z);
        u();
        r();
    }

    private /* synthetic */ EpoxyRecyclerView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private EpoxyRecyclerView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.c(context, "");
        this.Q = new r();
        this.T = true;
        this.U = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        this.V = new e(this);
        this.W = new ArrayList();
        this.aa = new ArrayList();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.y5}, 0, 0);
            setItemSpacingPx(obtainStyledAttributes.getDimensionPixelSize(0, 0));
            obtainStyledAttributes.recycle();
        }
        s();
        addOnAttachStateChangeListener(new f());
    }
}
