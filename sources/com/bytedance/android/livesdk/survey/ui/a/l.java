package com.bytedance.android.livesdk.survey.ui.a;

import com.bytedance.android.livesdk.rank.api.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.m;
import h.z;

public final class l extends f {
    static {
        Covode.recordClassIndex(12710);
    }

    public l() {
        super((byte) 0);
    }

    @Override // com.bytedance.android.livesdk.survey.ui.a.f
    public final void a() {
        DataChannel dataChannel = this.f21562e;
        if (dataChannel != null) {
            dataChannel.b(this, b.class, new a(this));
        }
    }

    static final class a extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(12711);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(l lVar) {
            super(1);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            this.this$0.a(bool.booleanValue());
            return z.f158842a;
        }
    }
}
