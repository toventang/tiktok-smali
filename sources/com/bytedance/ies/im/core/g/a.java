package com.bytedance.ies.im.core.g;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.d.u;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class a implements com.bytedance.ies.im.core.api.b.a.a {

    /* renamed from: c  reason: collision with root package name */
    public static final C0755a f34151c = new C0755a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    volatile int f34152a;

    /* renamed from: b  reason: collision with root package name */
    public final b f34153b;

    /* renamed from: d  reason: collision with root package name */
    private final h f34154d = i.a((h.f.a.a) new d(this));

    /* renamed from: e  reason: collision with root package name */
    private final h f34155e = i.a((h.f.a.a) c.f34158a);

    static {
        Covode.recordClassIndex(20339);
    }

    /* access modifiers changed from: package-private */
    public final d.AnonymousClass1 a() {
        return (d.AnonymousClass1) this.f34154d.getValue();
    }

    @Override // com.bytedance.im.core.d.r
    public final void a(com.bytedance.im.core.d.h hVar, int i2) {
    }

    @Override // com.bytedance.im.core.d.r
    public final void a(String str, int i2) {
    }

    @Override // com.bytedance.im.core.d.r
    public final void a(String str, int i2, List list) {
    }

    @Override // com.bytedance.im.core.d.r
    public final void a(String str, List list) {
    }

    @Override // com.bytedance.im.core.d.r
    public final void a(List list) {
    }

    @Override // com.bytedance.im.core.d.p
    public final void a(Map map) {
    }

    /* access modifiers changed from: package-private */
    public final Map<String, Integer> b() {
        return (Map) this.f34155e.getValue();
    }

    @Override // com.bytedance.im.core.d.r
    public final void b(com.bytedance.im.core.d.h hVar) {
    }

    @Override // com.bytedance.im.core.d.r
    public final void b(List list) {
    }

    @Override // com.bytedance.im.core.d.r
    public final void c(com.bytedance.im.core.d.h hVar) {
    }

    @Override // com.bytedance.im.core.d.r
    public final void c(List list) {
    }

    @Override // com.bytedance.im.core.d.r
    public final int d() {
        return 0;
    }

    @Override // com.bytedance.im.core.d.r
    public final void d(com.bytedance.im.core.d.h hVar) {
    }

    /* renamed from: com.bytedance.ies.im.core.g.a$a  reason: collision with other inner class name */
    static final class C0755a {
        static {
            Covode.recordClassIndex(20340);
        }

        private C0755a() {
        }

        public /* synthetic */ C0755a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<Map<String, Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f34158a = new c();

        static {
            Covode.recordClassIndex(20342);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<String, Integer> invoke() {
            return new LinkedHashMap();
        }
    }

    static final class d extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(20343);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new Handler(this, Looper.getMainLooper()) {
                /* class com.bytedance.ies.im.core.g.a.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f34159a;

                static {
                    Covode.recordClassIndex(20344);
                }

                public final void handleMessage(Message message) {
                    l.d(message, "");
                    a aVar = this.f34159a.this$0;
                    Object obj = message.obj;
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) obj;
                    com.bytedance.ies.im.core.api.a.b().b("MsgSender_CQ", "handleMessage[" + str + ']');
                    aVar.b(str);
                    aVar.f34153b.a(str, true, u.a().a("CQ timeout").f38031a);
                }

                {
                    this.f34159a = r1;
                }
            };
        }
    }

    public final void c() {
        com.bytedance.ies.im.core.api.a.b().b("MsgSender_CQ", "clear");
        b().clear();
    }

    public static final class b implements com.bytedance.im.core.a.a.b<com.bytedance.im.core.d.h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f34156a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34157b;

        static {
            Covode.recordClassIndex(20341);
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(u uVar) {
            com.bytedance.ies.im.core.api.a.b().c("MsgSender_CQ", "create onFailure[" + this.f34157b + "]: " + uVar);
            this.f34156a.b(this.f34157b);
            this.f34156a.f34153b.a(this.f34157b, true, uVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.im.core.a.a.b
        public final /* synthetic */ void a(com.bytedance.im.core.d.h hVar) {
            com.bytedance.ies.im.core.api.a.b().b("MsgSender_CQ", "create onSuccess[" + this.f34157b + ']');
            j.a();
            j.b(this.f34157b);
        }

        b(a aVar, String str) {
            this.f34156a = aVar;
            this.f34157b = str;
        }
    }

    public static final class e implements com.bytedance.im.core.a.a.b<com.bytedance.im.core.d.h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f34160a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34161b;

        static {
            Covode.recordClassIndex(20345);
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(u uVar) {
            com.bytedance.ies.im.core.api.a.b().c("MsgSender_CQ", "pull conversation[" + this.f34161b + "]: " + uVar);
            this.f34160a.b(this.f34161b);
            this.f34160a.f34153b.a(this.f34161b, true, uVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.im.core.a.a.b
        public final /* synthetic */ void a(com.bytedance.im.core.d.h hVar) {
            com.bytedance.ies.im.core.api.a.b().b("MsgSender_CQ", "pull conversation onSuccess[" + this.f34161b + ']');
            this.f34160a.b(this.f34161b);
            this.f34160a.f34153b.a(this.f34161b, false, (u) null);
        }

        e(a aVar, String str) {
            this.f34160a = aVar;
            this.f34161b = str;
        }
    }

    public a(b bVar) {
        l.d(bVar, "");
        this.f34153b = bVar;
        com.bytedance.ies.im.core.a.a.f33921b.a(this);
    }

    @Override // com.bytedance.im.core.d.r
    public final void a(com.bytedance.im.core.d.h hVar) {
        l.d(hVar, "");
        com.bytedance.ies.im.core.api.a.b().b("MsgSender_CQ", "onCreateConversation[" + hVar.getConversationId() + "]: " + hVar.isTemp());
        if (!hVar.isTemp()) {
            String conversationId = hVar.getConversationId();
            l.b(conversationId, "");
            b(conversationId);
        }
        b bVar = this.f34153b;
        String conversationId2 = hVar.getConversationId();
        l.b(conversationId2, "");
        bVar.a(conversationId2, false, (u) null);
    }

    public final void b(String str) {
        MethodCollector.i(3673);
        com.bytedance.ies.im.core.api.a.b().b("MsgSender_CQ", "dequeue before[" + str + "]: " + b().size());
        synchronized (b()) {
            try {
                if (b().containsKey(str)) {
                    Integer remove = b().remove(str);
                    if (remove == null) {
                        l.b();
                    }
                    int intValue = remove.intValue();
                    com.bytedance.ies.im.core.api.a.b().a("MsgSender_CQ", "cancelTimeOut[" + str + "]: " + intValue);
                    a().removeMessages(intValue);
                }
            } catch (Throwable th) {
                MethodCollector.o(3673);
                throw th;
            }
        }
        com.bytedance.ies.im.core.api.a.b().b("MsgSender_CQ", "dequeue after[" + str + "]: " + b().size());
        MethodCollector.o(3673);
    }

    public final boolean a(String str) {
        boolean containsKey;
        MethodCollector.i(3561);
        l.d(str, "");
        synchronized (b()) {
            try {
                containsKey = b().containsKey(str);
            } finally {
                MethodCollector.o(3561);
            }
        }
        return containsKey;
    }
}
