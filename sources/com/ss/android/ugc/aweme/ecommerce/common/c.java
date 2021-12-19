package com.ss.android.ugc.aweme.ecommerce.common;

import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.f.a;
import com.zhiliaoapp.musically.R;

public class c extends a {

    /* renamed from: a  reason: collision with root package name */
    private long f85737a = SystemClock.elapsedRealtime();

    /* renamed from: b  reason: collision with root package name */
    private SparseArray f85738b;

    static {
        Covode.recordClassIndex(53619);
    }

    public View c() {
        if (this.f85738b == null) {
            this.f85738b = new SparseArray();
        }
        View view = (View) this.f85738b.get(R.id.dtb);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(R.id.dtb);
        this.f85738b.put(R.id.dtb, findViewById);
        return findViewById;
    }

    public void d() {
        SparseArray sparseArray = this.f85738b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        d();
    }

    public final long b() {
        return SystemClock.elapsedRealtime() - this.f85737a;
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public void onStart() {
        this.f85737a = SystemClock.elapsedRealtime();
        super.onStart();
    }
}
