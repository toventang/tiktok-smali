package com.bytedance.android.livesdk.survey.ui.a;

import com.bytedance.android.live.n.ac;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.a.b;
import h.f.b.m;
import h.z;

public final class w extends f {
    static {
        Covode.recordClassIndex(12731);
    }

    public w() {
        super((byte) 0);
    }

    @Override // com.bytedance.android.livesdk.survey.ui.a.f
    public final void a() {
        DataChannel dataChannel = this.f21562e;
        if (dataChannel != null) {
            dataChannel.b(this, ac.class, new a(this));
        }
    }

    static final class a extends m implements b<Boolean, z> {
        final /* synthetic */ w this$0;

        static {
            Covode.recordClassIndex(12732);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(w wVar) {
            super(1);
            this.this$0 = wVar;
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
