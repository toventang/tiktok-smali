package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.ecommerce.common.a.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class f extends d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f85385a = true;

    /* renamed from: b  reason: collision with root package name */
    private final h f85386b = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(53407);
    }

    public final BottomSheetBehavior<View> b() {
        return (BottomSheetBehavior) this.f85386b.getValue();
    }

    public final void cancel() {
        if (this.f85385a) {
            super.cancel();
        }
    }

    static final class a extends m implements h.f.a.a<BottomSheetBehavior<View>> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(53408);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BottomSheetBehavior<View> invoke() {
            return BottomSheetBehavior.a(this.this$0.findViewById(R.id.akq));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Context context, int i2) {
        super(context, i2);
        l.d(context, "");
    }
}
