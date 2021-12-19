package com.bytedance.ies.foundation.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.foundation.base.e;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.lang.ref.WeakReference;

public class a extends Fragment implements e {

    /* renamed from: b  reason: collision with root package name */
    public static Class<? extends BaseFragmentViewModel> f33895b = BaseFragmentViewModel.class;

    /* renamed from: c  reason: collision with root package name */
    public static final b f33896c = new b();

    /* renamed from: d  reason: collision with root package name */
    public static final C0741a f33897d = new C0741a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f33898a;

    /* renamed from: e  reason: collision with root package name */
    private final h f33899e = i.a((h.f.a.a) new b(this));

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<a> f33900f;

    /* renamed from: g  reason: collision with root package name */
    private SparseArray f33901g;

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final BaseFragmentViewModel provideBaseViewModel() {
        return (BaseFragmentViewModel) this.f33899e.getValue();
    }

    public View a(int i2) {
        if (this.f33901g == null) {
            this.f33901g = new SparseArray();
        }
        View view = (View) this.f33901g.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f33901g.put(i2, findViewById);
        return findViewById;
    }

    public void br_() {
        SparseArray sparseArray = this.f33901g;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.bytedance.ies.foundation.fragment.a$a  reason: collision with other inner class name */
    public static final class C0741a {
        static {
            Covode.recordClassIndex(20137);
        }

        private C0741a() {
        }

        public /* synthetic */ C0741a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<BaseFragmentViewModel> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(20138);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BaseFragmentViewModel invoke() {
            return this.this$0.ba_();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f33898a = false;
    }

    public final BaseFragmentViewModel ba_() {
        return (BaseFragmentViewModel) ae.a(this, (ad.b) null).a(f33895b);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f33898a = false;
        br_();
    }

    static {
        Covode.recordClassIndex(20136);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f33898a = false;
    }

    /* access modifiers changed from: protected */
    public final void a(h.f.a.b<? super BaseFragmentViewModel, z> bVar) {
        l.d(bVar, "");
        bVar.invoke(ba_());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        l.d(bundle, "");
        bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public final void b(h.f.a.b<? super BaseActivityViewModel, z> bVar) {
        BaseActivityViewModel viewModel;
        l.d(bVar, "");
        androidx.fragment.app.e activity = getActivity();
        if (!(activity instanceof com.bytedance.ies.foundation.activity.a)) {
            activity = null;
        }
        com.bytedance.ies.foundation.activity.a aVar = (com.bytedance.ies.foundation.activity.a) activity;
        if (aVar != null && (viewModel = aVar.getViewModel()) != null) {
            bVar.invoke(viewModel);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        androidx.fragment.app.i supportFragmentManager;
        l.d(context, "");
        super.onAttach(context);
        this.f33900f = new WeakReference<>(this);
        BaseFragmentViewModel c2 = provideBaseViewModel();
        if (!c2.initialized) {
            c2.init();
        }
        androidx.fragment.app.e activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && getParentFragment() == null) {
            supportFragmentManager.a((i.b) f33896c, true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        this.f33898a = true;
    }
}
