package com.ss.android.ugc.aweme.compliance.business.policynotice.a;

import b.g;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.business.policynotice.api.PolicyNoticeApi;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.concurrent.Callable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final h f77075a = i.a((h.f.a.a) b.f77080a);

    static {
        Covode.recordClassIndex(47634);
    }

    public final PolicyNoticeApi.API a() {
        return (PolicyNoticeApi.API) this.f77075a.getValue();
    }

    static final class b extends m implements h.f.a.a<PolicyNoticeApi.API> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f77080a = new b();

        static {
            Covode.recordClassIndex(47637);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ PolicyNoticeApi.API invoke() {
            return PolicyNoticeApi.f77096a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.a.a$a  reason: collision with other inner class name */
    public static final class CallableC1769a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f77077a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f77078b;

        static {
            Covode.recordClassIndex(47635);
        }

        CallableC1769a(a aVar, int i2) {
            this.f77077a = aVar;
            this.f77078b = i2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.ss.android.ugc.aweme.compliance.business.policynotice.a.f77072f = this.f77078b;
            return this.f77077a.a().getPolicyNotice(this.f77078b).a(AnonymousClass1.f77079a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f77081a;

        static {
            Covode.recordClassIndex(47638);
        }

        c(h.f.a.a aVar) {
            this.f77081a = aVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            this.f77081a.invoke();
            return z.f158842a;
        }
    }

    public final void a(int i2) {
        b.i.b(new CallableC1769a(this, i2), b.i.f4824a);
    }

    public final void a(String str, String str2, String str3, String str4, Integer num, Integer num2, h.f.a.a<z> aVar) {
        l.d(aVar, "");
        a().policyNoticeApprove(str, str2, str3, str4, num, num2).a(new c(aVar), b.i.f4826c, null);
    }
}
