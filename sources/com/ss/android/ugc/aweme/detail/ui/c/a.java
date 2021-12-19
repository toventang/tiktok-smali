package com.ss.android.ugc.aweme.detail.ui.c;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.h.g;
import com.bytedance.tux.widget.spring.SpringLayout;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.detail.ui.CanVerticalScroolFrameLayout;
import com.ss.android.ugc.aweme.detail.ui.z;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public class a extends z {
    public final int q;
    public int r;
    public int s;
    private final h t = i.a((h.f.a.a) new d(this));
    private SparseArray u;

    static {
        Covode.recordClassIndex(49736);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.e
    public View a(int i2) {
        if (this.u == null) {
            this.u = new SparseArray();
        }
        View view = (View) this.u.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.u.put(i2, findViewById);
        return findViewById;
    }

    public final g d() {
        return (g) this.t.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.e
    public void e() {
        SparseArray sparseArray = this.u;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.ui.e, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.detail.ui.z
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        e();
    }

    static final class d extends m implements h.f.a.a<g> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(49740);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ g invoke() {
            Context context = this.this$0.getContext();
            if (context == null) {
                return null;
            }
            l.b(context, "");
            return new g(context);
        }
    }

    public a() {
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        this.q = h.g.a.a(TypedValue.applyDimension(1, 40.0f, system.getDisplayMetrics()));
    }

    static final class c extends m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(49739);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            int intValue = num.intValue();
            com.ss.android.ugc.aweme.detail.h.b bVar = this.this$0.f79992k;
            l.b(bVar, "");
            return Boolean.valueOf(bVar.N.canScrollVertically(intValue));
        }
    }

    static final class b implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f79945a;

        static {
            Covode.recordClassIndex(49738);
        }

        b(a aVar) {
            this.f79945a = aVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            l.b(motionEvent, "");
            int action = motionEvent.getAction();
            if (action != 1 && action != 3) {
                return false;
            }
            if (this.f79945a.r < this.f79945a.q || this.f79945a.bi_()) {
                if (this.f79945a.r <= (-this.f79945a.q)) {
                    com.ss.android.ugc.aweme.detail.h.b bVar = this.f79945a.f79992k;
                    l.b(bVar, "");
                    VerticalViewPager verticalViewPager = bVar.N;
                    l.b(verticalViewPager, "");
                    if (verticalViewPager.getCurrentItem() == 0) {
                        com.ss.android.ugc.aweme.story.b.h.a("slide");
                        e activity = this.f79945a.getActivity();
                        if (activity != null) {
                            activity.finish();
                        }
                        return true;
                    }
                }
                com.ss.android.ugc.aweme.detail.h.b bVar2 = this.f79945a.f79992k;
                l.b(bVar2, "");
                aj aC = bVar2.aC();
                if (aC == null) {
                    return false;
                }
                aC.V();
                return false;
            }
            com.ss.android.ugc.aweme.story.b.h.a("slide");
            e activity2 = this.f79945a.getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
            return true;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.detail.ui.z
    public void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        CanVerticalScroolFrameLayout canVerticalScroolFrameLayout = (CanVerticalScroolFrameLayout) view.findViewById(R.id.dqk);
        if (canVerticalScroolFrameLayout != null) {
            canVerticalScroolFrameLayout.setChildListCanVerticalScrollCallback(new c(this));
        }
        SpringLayout springLayout = (SpringLayout) view.findViewById(R.id.e8p);
        if (springLayout != null) {
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            springLayout.setMaxOverScrollDistance(TypedValue.applyDimension(1, 200.0f, system.getDisplayMetrics()));
            springLayout.setRubberBandCoefficient(0.4f);
            springLayout.setOnScrollChangeListener(new C1868a(this));
            springLayout.setOnTouchListener(new b(this));
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.detail.ui.z
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.ss.android.ugc.aweme.d.b.a(getActivity(), R.layout.wv, layoutInflater, viewGroup);
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.c.a$a  reason: collision with other inner class name */
    static final class C1868a extends m implements q<Integer, Integer, Boolean, h.z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(49737);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1868a(a aVar) {
            super(3);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(Integer num, Integer num2, Boolean bool) {
            int intValue = num.intValue();
            num2.intValue();
            boolean booleanValue = bool.booleanValue();
            this.this$0.r = intValue;
            int min = Math.min(Math.abs(this.this$0.r), Math.abs(this.this$0.s));
            int max = Math.max(Math.abs(this.this$0.r), Math.abs(this.this$0.s));
            int i2 = this.this$0.q;
            if (min <= i2 && max >= i2 && !booleanValue) {
                if (Build.VERSION.SDK_INT >= 29) {
                    g d2 = this.this$0.d();
                    if (d2 != null) {
                        d2.b();
                    }
                } else {
                    g d3 = this.this$0.d();
                    if (d3 != null) {
                        d3.a();
                    }
                }
            }
            this.this$0.s = intValue;
            return h.z.f158842a;
        }
    }
}
