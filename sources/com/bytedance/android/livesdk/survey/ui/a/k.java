package com.bytedance.android.livesdk.survey.ui.a;

import com.bytedance.android.live.liveinteract.api.z;
import com.bytedance.android.livesdk.chatroom.c.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.a.b;
import h.f.b.m;

public final class k extends f {
    static {
        Covode.recordClassIndex(12708);
    }

    public k() {
        super((byte) 0);
    }

    @Override // com.bytedance.android.livesdk.survey.ui.a.f
    public final void a() {
        DataChannel dataChannel = this.f21562e;
        if (dataChannel != null) {
            dataChannel.b(this, z.class, new a(this));
        }
    }

    static final class a extends m implements b<l, h.z> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(12709);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(k kVar) {
            super(1);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(l lVar) {
            l lVar2 = lVar;
            h.f.b.l.d(lVar2, "");
            this.this$0.a(lVar2.f15128a);
            return h.z.f158842a;
        }
    }
}
