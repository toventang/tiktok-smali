package com.bytedance.ies.bullet.c.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.c.a.p;
import com.bytedance.ies.bullet.service.base.a.j;
import com.bytedance.ies.bullet.service.base.a.q;
import h.f.b.l;
import h.f.b.m;
import h.z;
import org.json.JSONObject;

public final class b implements p, j {

    /* renamed from: a  reason: collision with root package name */
    public final String f31983a;

    /* renamed from: b  reason: collision with root package name */
    public final String f31984b;

    /* renamed from: c  reason: collision with root package name */
    final String f31985c;

    /* renamed from: d  reason: collision with root package name */
    public final JSONObject f31986d;

    /* renamed from: e  reason: collision with root package name */
    private final q f31987e;

    static {
        Covode.recordClassIndex(18717);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.p
    public final String a() {
        return this.f31985c;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.p
    public final /* bridge */ /* synthetic */ Object b() {
        return this.f31986d;
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public final q getLoggerWrapper() {
        return this.f31987e;
    }

    public static final class a implements k.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f31988a;

        static {
            Covode.recordClassIndex(18718);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(b bVar) {
            this.f31988a = bVar;
        }

        @Override // com.bytedance.ies.bullet.c.c.a.k.b
        public final void a(JSONObject jSONObject) {
            l.c(jSONObject, "");
            b bVar = this.f31988a;
            bVar.printLog(bVar.f31983a, com.bytedance.ies.bullet.service.base.a.p.D, "onComplete actionType:" + this.f31988a.f31984b + ", name:" + this.f31988a.f31985c);
        }

        @Override // com.bytedance.ies.bullet.c.c.a.k.b
        public final void a(int i2, String str) {
            l.c(str, "");
            b bVar = this.f31988a;
            bVar.printLog(bVar.f31983a, com.bytedance.ies.bullet.service.base.a.p.D, "onError actionType:" + this.f31988a.f31984b + ", code:" + i2 + ", message:" + str);
        }

        @Override // com.bytedance.ies.bullet.c.c.a.k.b
        public final void a(int i2, String str, JSONObject jSONObject) {
            l.c(str, "");
            l.c(jSONObject, "");
            b bVar = this.f31988a;
            bVar.printLog(bVar.f31983a, com.bytedance.ies.bullet.service.base.a.p.D, "onError actionType:" + this.f31988a.f31984b + ", code:" + i2 + ", message:" + str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.c.b.b$b  reason: collision with other inner class name */
    public static final class C0671b extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(18719);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0671b(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            l.c(th2, "");
            b bVar = this.this$0;
            bVar.printLog(bVar.f31983a, com.bytedance.ies.bullet.service.base.a.p.D, "onReject actionType:" + this.this$0.f31984b + ", throwable:" + th2.getMessage());
            return z.f158842a;
        }
    }

    public final void onEvent(com.bytedance.ies.bullet.c.c.a.m mVar) {
        String str = this.f31984b;
        for (a aVar : a.values()) {
            if (l.a((Object) aVar.getActionType(), (Object) str)) {
                if (mVar != null) {
                    String str2 = this.f31985c;
                    JSONObject jSONObject = this.f31986d;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    mVar.a(str2, jSONObject, new a(this), new C0671b(this));
                    return;
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public final void printReject(Throwable th, String str) {
        l.c(th, "");
        l.c(str, "");
        j.b.a(this, th, str);
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public final void printLog(String str, com.bytedance.ies.bullet.service.base.a.p pVar, String str2) {
        l.c(str, "");
        l.c(pVar, "");
        l.c(str2, "");
        j.b.a(this, str, pVar, str2);
    }

    public b(String str, String str2, JSONObject jSONObject, q qVar) {
        l.c(str, "");
        l.c(str2, "");
        l.c(qVar, "");
        this.f31984b = str;
        this.f31985c = str2;
        this.f31986d = jSONObject;
        this.f31987e = qVar;
        String simpleName = b.class.getSimpleName();
        l.a((Object) simpleName, "");
        this.f31983a = simpleName;
    }
}
