package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.compliance.protection.timelock.a;
import com.zhiliaoapp.musically.R;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final f f78032a;

    /* renamed from: b  reason: collision with root package name */
    private final int f78033b;

    static {
        Covode.recordClassIndex(48381);
    }

    h(f fVar, int i2) {
        this.f78032a = fVar;
        this.f78033b = i2;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        int i2;
        f fVar = this.f78032a;
        int i3 = this.f78033b;
        if (i3 == 1) {
            i2 = R.string.fef;
        } else {
            i2 = R.string.ggw;
        }
        String string = d.a().getString(i2);
        if (fVar.getActivity() != null) {
            string = fVar.getActivity().getString(i2);
        }
        new b(fVar).a(string).b();
        a.b(fVar.getActivity(), i3);
    }
}
