package com.ss.android.ugc.aweme.dsp.common.arch;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ac;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DoubleColorBallAnimationView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public abstract class a extends com.bytedance.ies.foundation.fragment.a {

    /* renamed from: e  reason: collision with root package name */
    public ac f83284e;

    /* renamed from: f  reason: collision with root package name */
    public View f83285f;

    /* renamed from: g  reason: collision with root package name */
    private DoubleColorBallAnimationView f83286g;

    /* renamed from: h  reason: collision with root package name */
    private SparseArray f83287h;

    static {
        Covode.recordClassIndex(51927);
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public View a(int i2) {
        if (this.f83287h == null) {
            this.f83287h = new SparseArray();
        }
        View view = (View) this.f83287h.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f83287h.put(i2, findViewById);
        return findViewById;
    }

    public abstract void a(View view);

    @Override // com.bytedance.ies.foundation.fragment.a
    public void br_() {
        SparseArray sparseArray = this.f83287h;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public abstract ac c();

    public abstract void d();

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        DoubleColorBallAnimationView doubleColorBallAnimationView = this.f83286g;
        if (doubleColorBallAnimationView != null) {
            doubleColorBallAnimationView.b();
        }
        super.onDestroyView();
        br_();
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        l.d(context, "");
        super.onAttach(context);
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f83284e = c();
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        a(view);
        d();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.alw, viewGroup, false);
        this.f83285f = a2;
        return a2;
    }
}
