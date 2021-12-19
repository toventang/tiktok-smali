package com.ss.android.ugc.aweme.music.presenter;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class j extends b {
    static {
        Covode.recordClassIndex(71709);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.music.presenter.b
    public final void d() {
        int i2;
        if ((this.f111571b == 1 || this.f111571b == 2) && this.f111572c != null) {
            if (this.f111570a == 1) {
                i2 = R.string.aho;
            } else {
                i2 = R.string.a9j;
            }
            new a(this.f111572c).a(i2).a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(Context context) {
        super(context);
        l.d(context, "");
    }
}
