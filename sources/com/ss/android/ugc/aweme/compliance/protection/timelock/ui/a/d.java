package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f78024a;

    static {
        Covode.recordClassIndex(48375);
    }

    d(a aVar) {
        this.f78024a = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        a aVar = this.f78024a;
        e activity = aVar.getActivity();
        int e2 = aVar.e();
        if (e2 == 0) {
            new a(activity).a(R.string.gh7).a();
        } else {
            new a(activity).a(R.string.ge7).a();
        }
        com.ss.android.ugc.aweme.compliance.protection.timelock.a.a(activity, e2);
    }
}
