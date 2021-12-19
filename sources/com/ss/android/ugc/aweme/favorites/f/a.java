package com.ss.android.ugc.aweme.favorites.f;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.bytedance.ies.powerpage.c;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Objects;

public abstract class a extends com.bytedance.ies.foundation.fragment.a implements com.bytedance.ies.powerpage.b {

    /* renamed from: e  reason: collision with root package name */
    private View f90631e;

    /* renamed from: f  reason: collision with root package name */
    private SparseArray f90632f;

    static {
        Covode.recordClassIndex(56935);
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public View a(int i2) {
        if (this.f90632f == null) {
            this.f90632f = new SparseArray();
        }
        View view = (View) this.f90632f.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f90632f.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public void br_() {
        SparseArray sparseArray = this.f90632f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public abstract int e();

    @Override // com.bytedance.ies.powerpage.b
    public void onBeforeActivityCreated(Activity activity) {
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    @Override // com.bytedance.ies.powerpage.b
    public void onNewIntent(Intent intent) {
    }

    public boolean g() {
        f();
        return true;
    }

    public final void f() {
        e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.bytedance.ies.powerpage.b
    public void onBackPressed_Activity() {
        if (!g()) {
            c.a(this);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.f.a$a  reason: collision with other inner class name */
    static final class C2192a extends m implements h.f.a.b<BaseFragmentViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2192a f90633a = new C2192a();

        static {
            Covode.recordClassIndex(56936);
        }

        C2192a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseFragmentViewModel baseFragmentViewModel) {
            BaseFragmentViewModel baseFragmentViewModel2 = baseFragmentViewModel;
            l.d(baseFragmentViewModel2, "");
            baseFragmentViewModel2.config(AnonymousClass1.f90634a);
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f90635a = new b();

        static {
            Covode.recordClassIndex(56938);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f90636a);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(C2192a.f90633a);
        b(b.f90635a);
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        l.d(context, "");
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
    }

    @Override // com.bytedance.ies.powerpage.b
    public void onActivityResult_Activity(int i2, int i3, Intent intent) {
        onActivityResult(i2, i3, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, e(), viewGroup, false);
        l.b(a2, "");
        this.f90631e = a2;
        if (a2 == null) {
            l.a("viewContainer");
        }
        return a2;
    }
}
