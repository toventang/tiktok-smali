package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.o;
import f.a.z;
import h.f.b.l;
import h.f.b.m;
import h.q;
import h.r;
import java.util.HashMap;
import kotlinx.coroutines.av;
import kotlinx.coroutines.w;

public final class a extends com.bytedance.jedi.a.j.b {

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap<String, a> f84907e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public static final C2033a f84908f = new C2033a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public w<BillInfoResponse> f84909b;

    /* renamed from: c  reason: collision with root package name */
    public f.a.b.b f84910c;

    /* renamed from: d  reason: collision with root package name */
    public av<BillInfoResponse> f84911d;

    /* renamed from: g  reason: collision with root package name */
    private final h.h f84912g = h.i.a((h.f.a.a) e.f84916a);

    /* access modifiers changed from: package-private */
    public static final class j extends h.c.b.a.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(53097);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(a aVar, h.c.d dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(null, false, null, false, this);
        }
    }

    public final com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.api.a b() {
        return (com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.api.a) this.f84912g.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.a$a  reason: collision with other inner class name */
    public static final class C2033a {
        static {
            Covode.recordClassIndex(53088);
        }

        private C2033a() {
        }

        public /* synthetic */ C2033a(byte b2) {
            this();
        }

        public static a a(String str) {
            l.d(str, "");
            a aVar = a.f84907e.get(str);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            a.f84907e.put(str, aVar2);
            return aVar2;
        }
    }

    static final class e extends m implements h.f.a.a<com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.api.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f84916a = new e();

        static {
            Covode.recordClassIndex(53092);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.api.a invoke() {
            return new com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.api.a();
        }
    }

    static {
        Covode.recordClassIndex(53087);
    }

    public static final class b implements z<com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.c.d f84913a;

        static {
            Covode.recordClassIndex(53089);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        public b(h.c.d dVar) {
            this.f84913a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.d dVar) {
            l.d(dVar, "");
            this.f84913a.resumeWith(q.m223constructorimpl(dVar));
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
            this.f84913a.resumeWith(q.m223constructorimpl(r.a(th)));
        }
    }

    public static final class f implements z<com.ss.android.ugc.aweme.ecommerce.api.model.a<o>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.c.d f84917a;

        static {
            Covode.recordClassIndex(53093);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        public f(h.c.d dVar) {
            this.f84917a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(com.ss.android.ugc.aweme.ecommerce.api.model.a<o> aVar) {
            l.d(aVar, "");
            this.f84917a.resumeWith(q.m223constructorimpl(aVar));
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
            this.f84917a.resumeWith(q.m223constructorimpl(r.a(th)));
        }
    }

    public static final class i implements z<com.ss.android.ugc.aweme.ecommerce.api.model.a<Object>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.c.d f84922a;

        static {
            Covode.recordClassIndex(53096);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        public i(h.c.d dVar) {
            this.f84922a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(com.ss.android.ugc.aweme.ecommerce.api.model.a<Object> aVar) {
            l.d(aVar, "");
            this.f84922a.resumeWith(q.m223constructorimpl(aVar));
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
            this.f84922a.resumeWith(q.m223constructorimpl(r.a(th)));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.c.d f84914a;

        static {
            Covode.recordClassIndex(53090);
        }

        c(h.c.d dVar) {
            this.f84914a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            l.d(obj, "");
            this.f84914a.resumeWith(q.m223constructorimpl(obj));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.c.d f84915a;

        static {
            Covode.recordClassIndex(53091);
        }

        d(h.c.d dVar) {
            this.f84915a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            l.d(th, "");
            this.f84915a.resumeWith(q.m223constructorimpl(r.a(th)));
        }
    }

    public static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f84918a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w f84919b;

        static {
            Covode.recordClassIndex(53094);
        }

        public g(a aVar, w wVar) {
            this.f84918a = aVar;
            this.f84919b = wVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            l.d(obj, "");
            com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.b();
            this.f84919b.a(obj);
            f.a.b.b bVar = this.f84918a.f84910c;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f84918a.f84910c = null;
        }
    }

    public static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f84920a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w f84921b;

        static {
            Covode.recordClassIndex(53095);
        }

        public h(a aVar, w wVar) {
            this.f84920a = aVar;
            this.f84921b = wVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            l.d(th, "");
            this.f84921b.a(th);
            f.a.b.b bVar = this.f84920a.f84910c;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f84920a.f84910c = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.util.HashMap<java.lang.String, java.lang.Object> r6, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoResponse r7, boolean r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.a.a(java.util.HashMap, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoResponse, boolean, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoRequest r17, boolean r18, java.util.HashMap<java.lang.String, java.lang.Object> r19, boolean r20, h.c.d<? super com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoResponse> r21) {
        /*
        // Method dump skipped, instructions count: 305
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.a.a(com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoRequest, boolean, java.util.HashMap, boolean, h.c.d):java.lang.Object");
    }
}
