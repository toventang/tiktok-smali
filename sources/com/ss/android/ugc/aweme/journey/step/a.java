package com.ss.android.ugc.aweme.journey.step;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.f.c;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.Objects;

public abstract class a extends com.ss.android.ugc.aweme.base.f.a {

    /* renamed from: a  reason: collision with root package name */
    protected TextView f104925a;

    /* renamed from: b  reason: collision with root package name */
    protected RecyclerView f104926b;

    /* renamed from: c  reason: collision with root package name */
    protected View f104927c;

    /* renamed from: d  reason: collision with root package name */
    public long f104928d = System.currentTimeMillis();

    /* renamed from: e  reason: collision with root package name */
    public b<? super Boolean, z> f104929e;

    /* renamed from: j  reason: collision with root package name */
    public boolean f104930j;

    /* renamed from: k  reason: collision with root package name */
    private long f104931k = System.currentTimeMillis();

    /* renamed from: l  reason: collision with root package name */
    private long f104932l;

    /* renamed from: m  reason: collision with root package name */
    private SparseArray f104933m;

    static {
        Covode.recordClassIndex(67267);
    }

    public View a(int i2) {
        if (this.f104933m == null) {
            this.f104933m = new SparseArray();
        }
        View view = (View) this.f104933m.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f104933m.put(i2, findViewById);
        return findViewById;
    }

    public void c() {
        SparseArray sparseArray = this.f104933m;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* access modifiers changed from: protected */
    public final TextView a() {
        TextView textView = this.f104925a;
        if (textView == null) {
            l.a("doneView");
        }
        return textView;
    }

    public final RecyclerView b() {
        RecyclerView recyclerView = this.f104926b;
        if (recyclerView == null) {
            l.a("infoListView");
        }
        return recyclerView;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        long currentTimeMillis = System.currentTimeMillis();
        this.f104931k = currentTimeMillis;
        this.f104928d = currentTimeMillis;
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public void onDestroyView() {
        View view = this.f104927c;
        if (view == null) {
            l.a("loadingView");
        }
        view.clearAnimation();
        super.onDestroyView();
        c();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onStop() {
        b<? super Boolean, z> bVar;
        this.f104932l += System.currentTimeMillis() - this.f104931k;
        if (!this.f104930j && (bVar = this.f104929e) != null) {
            bVar.invoke(true);
        }
        super.onStop();
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.a$a  reason: collision with other inner class name */
    public static final class C2671a extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        public int f104934a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f104935b;

        static {
            Covode.recordClassIndex(67268);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C2671a(a aVar) {
            this.f104935b = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            l.d(recyclerView, "");
            super.a(recyclerView, i2, i3);
            this.f104934a += i3;
            if (this.f104935b.ab_()) {
                TextTitleBar textTitleBar = (TextTitleBar) this.f104935b.a(R.id.em8);
                l.b(textTitleBar, "");
                if (textTitleBar.getHeight() > 0) {
                    TextTitleBar textTitleBar2 = (TextTitleBar) this.f104935b.a(R.id.em8);
                    l.b(textTitleBar2, "");
                    TextTitleBar textTitleBar3 = (TextTitleBar) this.f104935b.a(R.id.em8);
                    l.b(textTitleBar3, "");
                    textTitleBar2.setAlpha((((float) this.f104934a) * 1.0f) / ((float) textTitleBar3.getHeight()));
                }
            }
        }
    }

    public final void a(boolean z) {
        TextView textView = this.f104925a;
        if (textView == null) {
            l.a("doneView");
        }
        textView.setEnabled(z);
        if (z) {
            TextView textView2 = this.f104925a;
            if (textView2 == null) {
                l.a("doneView");
            }
            TextView textView3 = this.f104925a;
            if (textView3 == null) {
                l.a("doneView");
            }
            textView2.setTextColor(androidx.core.content.b.c(textView3.getContext(), R.color.a9));
            return;
        }
        TextView textView4 = this.f104925a;
        if (textView4 == null) {
            l.a("doneView");
        }
        TextView textView5 = this.f104925a;
        if (textView5 == null) {
            l.a("doneView");
        }
        textView4.setTextColor(androidx.core.content.b.c(textView5.getContext(), R.color.bz));
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        TuxTextView tuxTextView = (TuxTextView) a(R.id.aoh);
        l.b(tuxTextView, "");
        this.f104925a = tuxTextView;
        RecyclerView recyclerView = (RecyclerView) a(R.id.dr2);
        l.b(recyclerView, "");
        this.f104926b = recyclerView;
        ImageView imageView = (ImageView) a(R.id.ci1);
        l.b(imageView, "");
        this.f104927c = imageView;
        RecyclerView recyclerView2 = this.f104926b;
        if (recyclerView2 == null) {
            l.a("infoListView");
        }
        recyclerView2.setItemAnimator(null);
        TextView textView = this.f104925a;
        if (textView == null) {
            l.a("doneView");
        }
        c.a(textView, 0.75f);
        c.a(a(R.id.e4z), 0.75f);
        RecyclerView recyclerView3 = this.f104926b;
        if (recyclerView3 == null) {
            l.a("infoListView");
        }
        ViewGroup.LayoutParams layoutParams = recyclerView3.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i2 = marginLayoutParams.leftMargin;
        RecyclerView recyclerView4 = this.f104926b;
        if (recyclerView4 == null) {
            l.a("infoListView");
        }
        marginLayoutParams.leftMargin = i2 - ((int) n.b(recyclerView4.getContext(), 4.0f));
        marginLayoutParams.rightMargin = marginLayoutParams.leftMargin;
        a(false);
        RecyclerView recyclerView5 = this.f104926b;
        if (recyclerView5 == null) {
            l.a("infoListView");
        }
        recyclerView5.a(new C2671a(this));
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.abh, viewGroup, false);
    }
}
