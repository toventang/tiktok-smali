package com.ss.android.ugc.aweme.qrcode.presenter.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.qrcode.presenter.d;
import h.z;

public final class m {
    static {
        Covode.recordClassIndex(77842);
    }

    static final class a extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ com.bytedance.ies.foundation.activity.a $activity;

        static {
            Covode.recordClassIndex(77843);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(com.bytedance.ies.foundation.activity.a aVar) {
            super(0);
            this.$activity = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(!this.$activity.isDestroyed());
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<Integer, z> {
        final /* synthetic */ d $scanView;

        static {
            Covode.recordClassIndex(77844);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(1);
            this.$scanView = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            int intValue = num.intValue();
            this.$scanView.b();
            this.$scanView.a(intValue);
            return z.f158842a;
        }
    }
}
