package com.bytedance.android.livesdk.survey.ui.a;

import com.bytedance.android.livesdk.aq.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.m;
import h.z;

public final class e extends f {

    /* renamed from: a  reason: collision with root package name */
    public boolean f21557a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f21558b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f21559c;

    static {
        Covode.recordClassIndex(12696);
    }

    public e() {
        super((byte) 0);
    }

    public final void b() {
        if (this.f21557a || this.f21558b || this.f21559c) {
            a(true);
        } else {
            a(false);
        }
    }

    @Override // com.bytedance.android.livesdk.survey.ui.a.f
    public final void a() {
        DataChannel dataChannel = this.f21562e;
        if (dataChannel != null) {
            dataChannel.b(this, com.bytedance.android.livesdk.aq.c.class, new a(this));
        }
        DataChannel dataChannel2 = this.f21562e;
        if (dataChannel2 != null) {
            dataChannel2.b(this, com.bytedance.android.livesdk.aq.a.class, new b(this));
        }
        DataChannel dataChannel3 = this.f21562e;
        if (dataChannel3 != null) {
            dataChannel3.b(this, d.class, new c(this));
        }
    }

    static final class a extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(12697);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            this.this$0.f21557a = bool.booleanValue();
            this.this$0.b();
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(12698);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            this.this$0.f21558b = bool.booleanValue();
            this.this$0.b();
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(12699);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            this.this$0.f21559c = bool.booleanValue();
            this.this$0.b();
            return z.f158842a;
        }
    }
}
