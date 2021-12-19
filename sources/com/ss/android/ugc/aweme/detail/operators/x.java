package com.ss.android.ugc.aweme.detail.operators;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.detail.operators.aa;
import com.ss.android.ugc.aweme.feed.param.b;
import com.ss.android.ugc.aweme.feed.u.d;
import com.ss.android.ugc.aweme.feed.u.l;

public final class x extends a<d, l> implements aa.b {
    static {
        Covode.recordClassIndex(49673);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final int getPageType(int i2) {
        return 2;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa.b
    public final void bindPreLoadView(com.ss.android.ugc.aweme.feed.u.x xVar) {
        ((l) this.mPresenter).f94046b = xVar;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa.b
    public final void setPreLoad(boolean z) {
        ((l) this.mPresenter).f94047c = z;
    }

    public x(a aVar) {
        this.mModel = !(aVar instanceof d) ? new d() : aVar;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final boolean init(Fragment fragment) {
        this.mPresenter = new l(fragment);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final void request(int i2, b bVar, int i3, boolean z) {
        com.ss.android.ugc.aweme.common.e.b bVar2 = this.mPresenter;
        int i4 = 3;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i2);
        objArr[1] = 2;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 4) {
                    i4 = 2;
                }
            }
            objArr[2] = Integer.valueOf(i4);
            bVar2.a(objArr);
        }
        i4 = 1;
        objArr[2] = Integer.valueOf(i4);
        bVar2.a(objArr);
    }
}
