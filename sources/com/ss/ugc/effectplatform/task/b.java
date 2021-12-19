package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.h.f;
import d.a.f.d;
import h.f.b.l;
import h.f.b.m;
import h.z;

public abstract class b implements d {

    /* renamed from: a  reason: collision with root package name */
    private String f153788a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.ugc.effectplatform.h.a f153789b;

    /* renamed from: e  reason: collision with root package name */
    public boolean f153790e;

    static {
        Covode.recordClassIndex(102573);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void b();

    public void f() {
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(102574);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.b();
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.b$b  reason: collision with other inner class name */
    public static final class RunnableC4094b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f153791a;

        static {
            Covode.recordClassIndex(102575);
        }

        public final void run() {
            this.f153791a.invoke();
        }

        RunnableC4094b(h.f.a.a aVar) {
            this.f153791a = aVar;
        }
    }

    @Override // d.a.f.d
    public String getId() {
        String str = this.f153788a;
        if (str == null) {
            return "0";
        }
        return str;
    }

    @Override // d.a.f.d
    public void cancel() {
        this.f153790e = true;
        a(new a(this));
    }

    @Override // d.a.f.d
    public void run() {
        e eVar;
        String str = this.f153788a;
        e eVar2 = null;
        if (str != null) {
            com.ss.ugc.effectplatform.h.a aVar = this.f153789b;
            if (aVar != null) {
                eVar = aVar.a(str);
            } else {
                eVar = null;
            }
            if (eVar instanceof f) {
                ((f) eVar).a();
            }
        }
        if (!this.f153790e) {
            a();
            String str2 = this.f153788a;
            if (str2 != null) {
                com.ss.ugc.effectplatform.h.a aVar2 = this.f153789b;
                if (aVar2 != null) {
                    eVar2 = aVar2.a(str2);
                }
                if (eVar2 instanceof f) {
                    ((f) eVar2).b();
                }
            }
        }
    }

    public /* synthetic */ b(String str) {
        this(str, null);
    }

    protected static void a(h.f.a.a<z> aVar) {
        l.c(aVar, "");
        d.a.g.f.a(new RunnableC4094b(aVar));
    }

    public b(String str, com.ss.ugc.effectplatform.h.a aVar) {
        this.f153788a = str;
        this.f153789b = aVar;
    }
}
