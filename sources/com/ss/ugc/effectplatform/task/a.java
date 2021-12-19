package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a.c.d;
import com.ss.ugc.effectplatform.a.c.e;
import com.ss.ugc.effectplatform.a.c.f;
import com.ss.ugc.effectplatform.model.h;
import h.f.b.l;
import h.f.b.m;
import h.z;

public abstract class a<T, R extends h<T>> extends b {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.ugc.effectplatform.h.a f153693a;

    /* renamed from: b  reason: collision with root package name */
    public final String f153694b;

    /* renamed from: c  reason: collision with root package name */
    private final d f153695c;

    /* renamed from: d  reason: collision with root package name */
    private final com.ss.ugc.effectplatform.a.b.b f153696d;

    static {
        Covode.recordClassIndex(102533);
    }

    /* access modifiers changed from: protected */
    public abstract R a(com.ss.ugc.effectplatform.a.b.b bVar, String str);

    /* access modifiers changed from: protected */
    public abstract e c();

    /* access modifiers changed from: protected */
    public int d() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public int e() {
        return 10002;
    }

    /* renamed from: com.ss.ugc.effectplatform.task.a$a  reason: collision with other inner class name */
    static final class C4092a extends m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(102534);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4092a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            String str = this.this$0.f153694b;
            if (str != null) {
                this.this$0.f153693a.b(str);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.b
    public final void b() {
        a(new C4092a(this));
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ com.ss.ugc.effectplatform.model.e $exceptionResult$inlined;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(102535);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, com.ss.ugc.effectplatform.model.e eVar) {
            super(0);
            this.this$0 = aVar;
            this.$exceptionResult$inlined = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.ugc.effectplatform.h.e<T> a2 = this.this$0.f153693a.a(this.this$0.f153694b);
            if (a2 != null) {
                a2.onFail(null, this.$exceptionResult$inlined);
            }
            this.this$0.f153693a.b(this.this$0.f153694b);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ Object $data$inlined;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(102536);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, Object obj) {
            super(0);
            this.this$0 = aVar;
            this.$data$inlined = obj;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.ugc.effectplatform.h.e<T> a2 = this.this$0.f153693a.a(this.this$0.f153694b);
            if (a2 != null) {
                a2.onSuccess((T) this.$data$inlined);
            }
            this.this$0.f153693a.b(this.this$0.f153694b);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.b
    public void a() {
        f fetchFromNetwork;
        long currentTimeMillis = System.currentTimeMillis();
        int d2 = d();
        e c2 = c();
        String str = null;
        String str2 = null;
        while (true) {
            int i2 = d2 - 1;
            if (d2 != 0) {
                try {
                    if (!this.f153790e) {
                        d dVar = this.f153695c;
                        if (dVar != null && (fetchFromNetwork = dVar.fetchFromNetwork(c2)) != null) {
                            long currentTimeMillis2 = System.currentTimeMillis();
                            String a2 = com.ss.ugc.effectplatform.g.c.a(fetchFromNetwork.f153441b);
                            if (a2.length() == 0) {
                                throw new com.ss.ugc.effectplatform.f.d(-2, "net response returned empty response! errorMsg: " + fetchFromNetwork.f153443d);
                            }
                            com.ss.ugc.effectplatform.a.b.b bVar = this.f153696d;
                            if (bVar != null) {
                                R a3 = a(bVar, a2);
                                if (a3 != null) {
                                    long currentTimeMillis3 = System.currentTimeMillis();
                                    if (a3.getStatusCode() != 0) {
                                        throw new com.ss.ugc.effectplatform.f.e(a3.getStatusCode(), a3.getResponseMessage());
                                    } else if (a3.checkValue()) {
                                        a(currentTimeMillis, currentTimeMillis2, currentTimeMillis3, a3);
                                        return;
                                    } else {
                                        str2 = a3.getResponseMessage();
                                        d2 = i2;
                                    }
                                } else {
                                    throw new com.ss.ugc.effectplatform.f.b("json parser returned null!");
                                }
                            } else {
                                throw new RuntimeException("json converter is null");
                            }
                        }
                    } else {
                        return;
                    }
                } catch (Exception e2) {
                    if (i2 == 0 || (e2 instanceof com.ss.ugc.effectplatform.f.e)) {
                        String str3 = c2.f153434a;
                        try {
                            str = d.a.g.c.a(str3);
                        } catch (Exception unused) {
                        }
                        a(str3, str, new com.ss.ugc.effectplatform.model.e(e2));
                        d.a.e.b.a("BaseNetworkTask", "fetch from network failed", e2);
                        return;
                    }
                }
            } else {
                com.ss.ugc.effectplatform.model.e eVar = new com.ss.ugc.effectplatform.model.e(e());
                if (str2 != null) {
                    eVar.f153652b = str2;
                }
                a(null, null, eVar);
                return;
            }
        }
        throw new com.ss.ugc.effectplatform.f.d(-2, "net response returned null!");
    }

    /* access modifiers changed from: protected */
    public void a(String str, String str2, com.ss.ugc.effectplatform.model.e eVar) {
        l.c(eVar, "");
        if (this.f153694b != null) {
            a(new b(this, eVar));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(d dVar, com.ss.ugc.effectplatform.a.b.b bVar, com.ss.ugc.effectplatform.h.a aVar, String str) {
        super(str, aVar);
        l.c(aVar, "");
        this.f153695c = dVar;
        this.f153696d = bVar;
        this.f153693a = aVar;
        this.f153694b = str;
    }

    /* access modifiers changed from: protected */
    public void a(long j2, long j3, long j4, R r) {
        l.c(r, "");
        Object responseData = r.getResponseData();
        if (responseData != null && this.f153694b != null) {
            a(new c(this, responseData));
        }
    }
}
