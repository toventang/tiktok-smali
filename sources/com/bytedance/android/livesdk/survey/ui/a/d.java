package com.bytedance.android.livesdk.survey.ui.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.m;
import h.z;

public final class d extends f {

    /* renamed from: a  reason: collision with root package name */
    public boolean f21552a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f21553b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f21554c;

    /* renamed from: g  reason: collision with root package name */
    private final com.bytedance.android.livesdk.survey.b.a f21555g = new com.bytedance.android.livesdk.survey.b.a(30, new C0474d(this));

    static {
        Covode.recordClassIndex(12691);
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.a.d$d  reason: collision with other inner class name */
    static final class C0474d extends m implements h.f.a.a<z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(12695);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0474d(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a(false);
            return z.f158842a;
        }
    }

    public d() {
        super((byte) 0);
    }

    public final void b() {
        if (this.f21552a || this.f21553b || this.f21554c) {
            a(true);
            this.f21555g.c();
            this.f21555g.a();
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
            dataChannel3.b(this, com.bytedance.android.livesdk.aq.d.class, new c(this));
        }
    }

    static final class a extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(12692);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            this.this$0.f21552a = bool.booleanValue();
            this.this$0.b();
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(12693);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            this.this$0.f21553b = bool.booleanValue();
            this.this$0.b();
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(12694);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            this.this$0.f21554c = bool.booleanValue();
            this.this$0.b();
            return z.f158842a;
        }
    }
}
