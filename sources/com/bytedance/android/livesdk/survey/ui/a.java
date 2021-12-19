package com.bytedance.android.livesdk.survey.ui;

import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.e.r;
import com.bytedance.android.livesdk.chatroom.viewmodule.bq;
import com.bytedance.android.livesdk.survey.ui.a.c;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.m;
import h.z;
import java.util.List;

public final class a extends r<b> {

    /* renamed from: g  reason: collision with root package name */
    public static final C0471a f21524g = new C0471a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final f.a.b.a f21525a = new f.a.b.a();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f21526b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.livesdk.survey.a.a f21527c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.android.livesdk.survey.ui.a.a f21528d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f21529e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f21530f;

    /* renamed from: com.bytedance.android.livesdk.survey.ui.a$a  reason: collision with other inner class name */
    public static final class C0471a {
        static {
            Covode.recordClassIndex(12670);
        }

        /* renamed from: com.bytedance.android.livesdk.survey.ui.a$a$a  reason: collision with other inner class name */
        public enum EnumC0472a {
            NOT_LOG("nl"),
            SUBMIT("submit"),
            CANCEL("cancel");
            
            private final String method;

            public final String getMethod() {
                return this.method;
            }

            static {
                Covode.recordClassIndex(12671);
            }

            private EnumC0472a(String str) {
                this.method = str;
            }
        }

        private C0471a() {
        }

        public /* synthetic */ C0471a(byte b2) {
            this();
        }
    }

    public interface b extends bq, com.bytedance.android.livesdk.survey.ui.widget.a {
        static {
            Covode.recordClassIndex(12672);
        }
    }

    static {
        Covode.recordClassIndex(12669);
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(12676);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            b bVar = (b) this.this$0.y;
            if (bVar != null) {
                bVar.c();
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(12677);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            b bVar = (b) this.this$0.y;
            if (bVar != null) {
                bVar.d();
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(12680);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            b bVar = (b) this.this$0.y;
            if (bVar != null) {
                bVar.c();
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(12681);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            b bVar = (b) this.this$0.y;
            if (bVar != null) {
                bVar.d();
            }
            return z.f158842a;
        }
    }

    public final long a() {
        com.bytedance.android.livesdk.survey.ui.a.a aVar = this.f21528d;
        if (aVar != null) {
            return aVar.f21534d.d();
        }
        return 0;
    }

    public final void c() {
        String str;
        Integer num;
        com.bytedance.android.livesdk.survey.a.c a2;
        com.bytedance.android.livesdk.survey.a.c a3;
        List<com.bytedance.android.livesdk.survey.a.b> list;
        if (!this.f21529e) {
            this.f21529e = true;
            com.bytedance.android.livesdk.survey.a.a aVar = this.f21527c;
            com.bytedance.android.livesdk.ab.b a4 = b.a.a("livesdk_survey_notify").a(this.w);
            String str2 = null;
            if (aVar != null) {
                str = aVar.f21491a;
            } else {
                str = null;
            }
            com.bytedance.android.livesdk.ab.b a5 = a4.a("survey_id", str);
            com.bytedance.android.livesdk.at.f b2 = u.a().b();
            h.f.b.l.b(b2, "");
            com.bytedance.android.livesdk.ab.b a6 = a5.a("user_id", b2.c());
            if (aVar == null || (a3 = aVar.a()) == null || (list = a3.f21500d) == null) {
                num = null;
            } else {
                num = Integer.valueOf(list.size());
            }
            com.bytedance.android.livesdk.ab.b a7 = a6.a("no_of_choice", (Number) num).a("room_position", ((com.bytedance.android.livesdk.watch.d) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.watch.d.class)).getLiveRoomChangeCount());
            if (!(aVar == null || (a2 = aVar.a()) == null)) {
                str2 = a2.f21497a;
            }
            a7.a("question_id", str2).b();
        }
    }

    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f21556a;

        static {
            Covode.recordClassIndex(12674);
        }

        public d(a aVar) {
            this.f21556a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.livesdk.survey.ui.a.a aVar = this.f21556a.f21528d;
            if (aVar != null) {
                aVar.b();
            }
            this.f21556a.f21527c = null;
        }
    }

    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f21551a;

        static {
            Covode.recordClassIndex(12673);
        }

        public c(a aVar) {
            this.f21551a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            if (this.f21551a.y != null) {
                if (((com.bytedance.android.livesdk.survey.a.a) dVar.data).f21492b.size() == 0) {
                    this.f21551a.f21527c = null;
                    return;
                }
                this.f21551a.f21527c = (com.bytedance.android.livesdk.survey.a.a) dVar.data;
                a aVar = this.f21551a;
                aVar.a(aVar.f21527c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(12675);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            if (this.this$0.f21527c != null) {
                if (booleanValue) {
                    this.this$0.c();
                }
                b bVar = (b) this.this$0.y;
                if (bVar != null) {
                    com.bytedance.android.livesdk.survey.a.a aVar = this.this$0.f21527c;
                    if (aVar == null) {
                        h.f.b.l.b();
                    }
                    bVar.a(aVar);
                }
                b bVar2 = (b) this.this$0.y;
                if (bVar2 != null) {
                    bVar2.a();
                }
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends m implements h.f.a.b<C0471a.EnumC0472a, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(12678);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(C0471a.EnumC0472a aVar) {
            C0471a.EnumC0472a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            a aVar3 = this.this$0;
            aVar3.a(aVar3.a(), aVar2, 0);
            b bVar = (b) this.this$0.y;
            if (bVar != null) {
                bVar.b();
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(12679);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            if (this.this$0.f21527c != null) {
                if (booleanValue) {
                    this.this$0.c();
                }
                b bVar = (b) this.this$0.y;
                if (bVar != null) {
                    com.bytedance.android.livesdk.survey.a.a aVar = this.this$0.f21527c;
                    if (aVar == null) {
                        h.f.b.l.b();
                    }
                    bVar.a(aVar);
                }
                b bVar2 = (b) this.this$0.y;
                if (bVar2 != null) {
                    bVar2.a();
                }
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l extends m implements h.f.a.b<C0471a.EnumC0472a, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(12682);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(C0471a.EnumC0472a aVar) {
            C0471a.EnumC0472a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            a aVar3 = this.this$0;
            aVar3.a(aVar3.a(), aVar2, 0);
            b bVar = (b) this.this$0.y;
            if (bVar != null) {
                bVar.b();
            }
            return z.f158842a;
        }
    }

    public final void a(com.bytedance.android.livesdk.survey.a.a aVar) {
        com.bytedance.android.livesdk.survey.ui.a.a rVar;
        if (aVar != null) {
            com.bytedance.android.livesdk.survey.a.d dVar = aVar.f21494d;
            h.f.b.l.b(dVar, "");
            if (dVar.f21501a == 1) {
                DataChannel dataChannel = this.w;
                h.f.b.l.b(dataChannel, "");
                rVar = new c(dataChannel, new e(this), new f(this), new g(this), new h(this));
            } else {
                DataChannel dataChannel2 = this.w;
                h.f.b.l.b(dataChannel2, "");
                rVar = new com.bytedance.android.livesdk.survey.ui.a.r(dataChannel2, new i(this), new j(this), new k(this), new l(this));
            }
            this.f21528d = rVar;
            com.bytedance.android.livesdk.survey.a.d dVar2 = aVar.f21494d;
            h.f.b.l.b(dVar2, "");
            if (!dVar2.a()) {
                com.bytedance.android.livesdk.survey.ui.a.a aVar2 = this.f21528d;
                if (aVar2 != null) {
                    long j2 = aVar.f21494d.f21503c;
                    aVar2.f21532b = j2;
                    aVar2.f21533c.a(j2);
                }
                com.bytedance.android.livesdk.survey.ui.a.a aVar3 = this.f21528d;
                if (aVar3 != null) {
                    aVar3.a();
                }
            }
        }
    }

    public final void a(long j2, C0471a.EnumC0472a aVar, long j3) {
        String str;
        Integer num;
        com.bytedance.android.livesdk.survey.a.c a2;
        com.bytedance.android.livesdk.survey.a.c a3;
        List<com.bytedance.android.livesdk.survey.a.b> list;
        if (!h.f.b.l.a((Object) aVar.getMethod(), (Object) "nl") && !this.f21530f && this.f21529e) {
            this.f21530f = true;
            com.bytedance.android.livesdk.survey.a.a aVar2 = this.f21527c;
            com.bytedance.android.livesdk.ab.b a4 = b.a.a("livesdk_exit_survey").a(this.w);
            String str2 = null;
            if (aVar2 != null) {
                str = aVar2.f21491a;
            } else {
                str = null;
            }
            com.bytedance.android.livesdk.ab.b a5 = a4.a("survey_id", str);
            com.bytedance.android.livesdk.at.f b2 = u.a().b();
            h.f.b.l.b(b2, "");
            com.bytedance.android.livesdk.ab.b a6 = a5.a("user_id", b2.c());
            if (aVar2 == null || (a3 = aVar2.a()) == null || (list = a3.f21500d) == null) {
                num = null;
            } else {
                num = Integer.valueOf(list.size());
            }
            com.bytedance.android.livesdk.ab.b a7 = a6.a("no_of_choice", (Number) num).a("stay_time", j2).a("exit_method", aVar.getMethod()).a("option_id", j3).a("result", j3).a("room_position", ((com.bytedance.android.livesdk.watch.d) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.watch.d.class)).getLiveRoomChangeCount());
            if (!(aVar2 == null || (a2 = aVar2.a()) == null)) {
                str2 = a2.f21497a;
            }
            a7.a("question_id", str2).b();
        }
    }
}
