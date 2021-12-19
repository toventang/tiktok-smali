package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.a.a;

public class WrapGridLayoutManager extends GridLayoutManager implements m {
    RecyclerView.a M;

    static {
        Covode.recordClassIndex(94616);
    }

    public WrapGridLayoutManager(Context context, int i2) {
        super(i2);
    }

    public WrapGridLayoutManager(int i2, int i3) {
        super(i2, i3, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView.a aVar, RecyclerView.a aVar2) {
        super.a(aVar, aVar2);
        this.M = aVar2;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final void c(RecyclerView.o oVar, RecyclerView.s sVar) {
        try {
            super.c(oVar, sVar);
        } catch (IndexOutOfBoundsException unused) {
        } catch (NullPointerException e2) {
            if (this.M != null) {
                a.a(this.M.getClass().getName(), e2);
                WrapLinearLayoutManager.a(this.M);
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView recyclerView, RecyclerView.s sVar, int i2) {
        AnonymousClass1 r1 = new r(recyclerView.getContext()) {
            /* class com.ss.android.ugc.aweme.views.WrapGridLayoutManager.AnonymousClass1 */

            static {
                Covode.recordClassIndex(94617);
            }

            @Override // androidx.recyclerview.widget.r
            public final int b(int i2) {
                return super.b(i2) * 3;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.r
            public final PointF c(int i2) {
                return WrapGridLayoutManager.this.d(i2);
            }
        };
        r1.f3862g = i2;
        a(r1);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final int b(int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
        try {
            return super.b(i2, oVar, sVar);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        } catch (NullPointerException e2) {
            if (this.M != null) {
                a.a(this.M.getClass().getName(), e2);
                WrapLinearLayoutManager.a(this.M);
            }
            return 0;
        }
    }

    public WrapGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }
}
