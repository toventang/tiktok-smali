package com.bytedance.android.livesdk.survey.ui.a;

import com.bytedance.android.livesdk.j.de;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.a.b;
import h.f.b.m;
import h.z;

public final class u extends f {
    static {
        Covode.recordClassIndex(12727);
    }

    public u() {
        super((byte) 0);
    }

    @Override // com.bytedance.android.livesdk.survey.ui.a.f
    public final void a() {
        DataChannel dataChannel = this.f21562e;
        if (dataChannel != null) {
            dataChannel.b(this, de.class, new a(this));
        }
    }

    static final class a extends m implements b<Boolean, z> {
        final /* synthetic */ u this$0;

        static {
            Covode.recordClassIndex(12728);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(u uVar) {
            super(1);
            this.this$0 = uVar;
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
