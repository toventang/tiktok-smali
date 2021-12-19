package com.bytedance.android.livesdk.survey.ui.a;

import com.bytedance.android.live.m.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.a.b;
import h.f.b.m;
import h.z;

public final class t extends f {
    static {
        Covode.recordClassIndex(12725);
    }

    public t() {
        super((byte) 0);
    }

    @Override // com.bytedance.android.livesdk.survey.ui.a.f
    public final void a() {
        DataChannel dataChannel = this.f21562e;
        if (dataChannel != null) {
            dataChannel.b(this, d.class, new a(this));
        }
    }

    static final class a extends m implements b<Boolean, z> {
        final /* synthetic */ t this$0;

        static {
            Covode.recordClassIndex(12726);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(t tVar) {
            super(1);
            this.this$0 = tVar;
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
