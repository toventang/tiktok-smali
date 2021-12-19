package com.bytedance.ies.im.core.g;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.u;
import com.bytedance.im.core.proto.ReferenceInfo;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class d {

    /* renamed from: l  reason: collision with root package name */
    public static volatile int f34172l;

    /* renamed from: m  reason: collision with root package name */
    public static final a f34173m = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f34174a;

    /* renamed from: b  reason: collision with root package name */
    public List<? extends com.bytedance.ies.im.core.api.f.c> f34175b;

    /* renamed from: c  reason: collision with root package name */
    public List<? extends com.bytedance.im.core.d.c> f34176c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, String> f34177d;

    /* renamed from: e  reason: collision with root package name */
    public Map<String, String> f34178e;

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.ies.im.core.api.f.b f34179f;

    /* renamed from: g  reason: collision with root package name */
    public int f34180g;

    /* renamed from: h  reason: collision with root package name */
    public com.bytedance.ies.im.core.api.b.a.c f34181h;

    /* renamed from: i  reason: collision with root package name */
    public ReferenceInfo f34182i;

    /* renamed from: j  reason: collision with root package name */
    long f34183j;

    /* renamed from: k  reason: collision with root package name */
    public final int f34184k;
    private boolean n;
    private int o;
    private List<ai> p;

    static {
        Covode.recordClassIndex(20353);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(20354);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final com.bytedance.ies.im.core.api.b.a.e a() {
        com.bytedance.ies.im.core.api.b.a.c cVar = this.f34181h;
        if (!(cVar instanceof com.bytedance.ies.im.core.api.b.a.e)) {
            cVar = null;
        }
        return (com.bytedance.ies.im.core.api.b.a.e) cVar;
    }

    private final List<ai> c() {
        List<ai> list = this.p;
        if (list == null || list.isEmpty()) {
            this.p = com.bytedance.ies.im.core.a.e.a(this);
        }
        List<ai> list2 = this.p;
        if (list2 == null) {
            l.b();
        }
        return list2;
    }

    private final void b() {
        if (this.o < 2) {
            this.o = 2;
            for (T t : c()) {
                int i2 = this.f34180g;
                if (i2 < 0 || i2 > 5) {
                    i2 = 2;
                }
                t.setMsgStatus(i2);
                com.bytedance.ies.im.core.a.e.b(t, com.bytedance.ies.im.core.api.e.a.a((h.f.a.b) null, b.f34185a));
            }
        }
    }

    public final String toString() {
        Integer num;
        StringBuilder append = new StringBuilder("MessageTask{").append(this.f34174a).append(", ").append(this.f34184k).append(", ");
        List<? extends com.bytedance.ies.im.core.api.f.c> list = this.f34175b;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        return append.append(num).append(", ").append(this.n).append(", ").append(this.o).append('}').toString();
    }

    private d(int i2) {
        this.f34184k = i2;
        this.f34180g = -1;
        this.o = -1;
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<u, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f34185a = new b();

        static {
            Covode.recordClassIndex(20355);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(u uVar) {
            com.bytedance.ies.im.core.api.a.b().c("MsgSender_Task", "addMessageForLocalOnly onError: ".concat(String.valueOf(uVar)));
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<u, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f34186a = new e();

        static {
            Covode.recordClassIndex(20358);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(u uVar) {
            com.bytedance.ies.im.core.api.a.b().c("MsgSender_Task", "onConversationTemp onError: ".concat(String.valueOf(uVar)));
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<ai, z> {
        final /* synthetic */ h $conversation$inlined;
        final /* synthetic */ Map $failedErrorMap$inlined;
        final /* synthetic */ ai $msg;
        final /* synthetic */ List $msgList$inlined;
        final /* synthetic */ List $succeedList$inlined;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(20356);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ai aiVar, d dVar, h hVar, List list, List list2, Map map) {
            super(1);
            this.$msg = aiVar;
            this.this$0 = dVar;
            this.$conversation$inlined = hVar;
            this.$succeedList$inlined = list;
            this.$msgList$inlined = list2;
            this.$failedErrorMap$inlined = map;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(ai aiVar) {
            com.bytedance.ies.im.core.api.b.a.e a2 = this.this$0.a();
            if (a2 != null) {
                a2.a(this.$msg);
            }
            List list = this.$succeedList$inlined;
            if (aiVar == null) {
                aiVar = this.$msg;
            }
            list.add(aiVar);
            this.this$0.a(this.$msgList$inlined, this.$succeedList$inlined, this.$failedErrorMap$inlined);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.im.core.g.d$d  reason: collision with other inner class name */
    public static final class C0758d extends m implements h.f.a.b<u, z> {
        final /* synthetic */ h $conversation$inlined;
        final /* synthetic */ Map $failedErrorMap$inlined;
        final /* synthetic */ ai $msg;
        final /* synthetic */ List $msgList$inlined;
        final /* synthetic */ List $succeedList$inlined;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(20357);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0758d(ai aiVar, d dVar, h hVar, List list, List list2, Map map) {
            super(1);
            this.$msg = aiVar;
            this.this$0 = dVar;
            this.$conversation$inlined = hVar;
            this.$succeedList$inlined = list;
            this.$msgList$inlined = list2;
            this.$failedErrorMap$inlined = map;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(u uVar) {
            u uVar2 = uVar;
            com.bytedance.ies.im.core.api.b.a.e a2 = this.this$0.a();
            if (a2 != null) {
                a2.a(this.$msg, uVar2);
            }
            Map map = this.$failedErrorMap$inlined;
            ai aiVar = this.$msg;
            if (uVar2 == null) {
                uVar2 = u.a().a("Unknown error").f38031a;
            }
            l.b(uVar2, "");
            map.put(aiVar, uVar2);
            this.this$0.a(this.$msgList$inlined, this.$succeedList$inlined, this.$failedErrorMap$inlined);
            return z.f158842a;
        }
    }

    private static String b(h hVar) {
        return "Conversation{" + hVar.getConversationId() + ", " + hVar.isTemp() + '}';
    }

    public final void a(h hVar) {
        l.d(hVar, "");
        com.bytedance.ies.im.core.api.a.b().b("MsgSender_Task", "onConversationTemp: " + b(hVar) + ", " + this);
        if (this.n) {
            b();
        } else if (this.o < 0) {
            this.o = 0;
            for (T t : c()) {
                t.setMsgStatus(0);
                com.bytedance.ies.im.core.a.e.b(t, com.bytedance.ies.im.core.api.e.a.a((h.f.a.b) null, e.f34186a));
            }
        }
    }

    public final void a(u uVar) {
        l.d(uVar, "");
        com.bytedance.ies.im.core.a.a aVar = com.bytedance.ies.im.core.a.a.f33921b;
        String str = this.f34174a;
        if (str == null) {
            l.b();
        }
        h a2 = aVar.a(str);
        com.bytedance.ies.im.core.api.a.b().c("MsgSender_Task", new StringBuilder("onConversationError: ").append(a2 != null ? b(a2) : null).append(", ").append(uVar).toString());
        if (this.n) {
            this.o = 3;
            return;
        }
        List<ai> list = this.p;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (this.o == 0 && list != null && !list.isEmpty()) {
            for (T t : list) {
                t.setMsgStatus(3);
                t.addLocalExt("s:err_code", "-100001");
                t.addLocalExt("s:log_id", uVar.toString());
                linkedHashMap.put(t, uVar);
                com.bytedance.ies.im.core.api.b.a.e a3 = a();
                if (a3 != null) {
                    a3.a(t, uVar);
                }
                com.bytedance.ies.im.core.a.e.f33936b.a(t, null, -100001, uVar);
            }
        }
        this.o = 3;
        a();
    }

    public /* synthetic */ d(int i2, byte b2) {
        this(i2);
    }

    public final void a(h hVar, boolean z) {
        l.d(hVar, "");
        com.bytedance.ies.im.core.api.a.b().b("MsgSender_Task", "onConversationReady: " + b(hVar) + ", " + this);
        long uptimeMillis = SystemClock.uptimeMillis();
        if (z) {
            com.bytedance.ies.im.core.api.f.b bVar = this.f34179f;
            if (bVar == null) {
                l.b();
            }
            bVar.f33976f = true;
            com.bytedance.ies.im.core.api.f.b bVar2 = this.f34179f;
            if (bVar2 == null) {
                l.b();
            }
            bVar2.f33977g = uptimeMillis - this.f34183j;
        } else {
            com.bytedance.ies.im.core.api.f.b bVar3 = this.f34179f;
            if (bVar3 == null) {
                l.b();
            }
            bVar3.f33976f = false;
            com.bytedance.ies.im.core.api.f.b bVar4 = this.f34179f;
            if (bVar4 == null) {
                l.b();
            }
            bVar4.f33977g = 0;
        }
        if (this.n) {
            b();
        } else if (this.o <= 0) {
            this.o = 1;
            List<ai> c2 = c();
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (T t : c2) {
                com.bytedance.ies.im.core.a.e.f33936b.a(t, com.bytedance.ies.im.core.api.e.a.a(new c(t, this, hVar, arrayList, c2, linkedHashMap), new C0758d(t, this, hVar, arrayList, c2, linkedHashMap)));
            }
        }
    }

    public final void a(List<ai> list, List<ai> list2, Map<ai, ? extends u> map) {
        int i2;
        if (list2.size() + map.size() == list.size()) {
            if (!list2.isEmpty()) {
                i2 = 2;
            } else {
                i2 = 3;
            }
            this.o = i2;
            a();
        }
    }
}
