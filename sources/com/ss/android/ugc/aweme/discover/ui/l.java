package com.ss.android.ugc.aweme.discover.ui;

import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.arch.b;
import com.ss.android.ugc.aweme.common.r;

public abstract class l extends b {

    /* renamed from: b  reason: collision with root package name */
    public final String f82600b;

    /* renamed from: c  reason: collision with root package name */
    private long f82601c = -1;

    /* renamed from: d  reason: collision with root package name */
    private SparseArray f82602d;

    static {
        Covode.recordClassIndex(51426);
    }

    @Override // com.ss.android.ugc.aweme.base.arch.b
    public View a(int i2) {
        if (this.f82602d == null) {
            this.f82602d = new SparseArray();
        }
        View view = (View) this.f82602d.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f82602d.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.arch.b
    public void a() {
        SparseArray sparseArray = this.f82602d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public abstract int b();

    public abstract String c();

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.arch.b
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public void a(boolean z, boolean z2) {
        if (!z) {
            if (this.f82601c <= 0) {
                this.f82601c = SystemClock.elapsedRealtime();
            }
        } else if (this.f82601c > 0) {
            String c2 = c();
            h.f.b.l.d(c2, "");
            r.a("stay_time", new d().a("enter_from", c2).a("duration", SystemClock.elapsedRealtime() - this.f82601c).f66730a);
            this.f82601c = -1;
        }
    }
}
