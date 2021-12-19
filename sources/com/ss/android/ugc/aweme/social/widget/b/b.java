package com.ss.android.ugc.aweme.social.widget.b;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.widget.b.a;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public List<User> f133717a;

    /* renamed from: b  reason: collision with root package name */
    private final String f133718b;

    /* renamed from: c  reason: collision with root package name */
    private final String f133719c;

    /* renamed from: d  reason: collision with root package name */
    private long f133720d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<String> f133721e;

    /* access modifiers changed from: package-private */
    public static final class a extends h.c.b.a.d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(87477);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, h.c.d dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(0, 0, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.social.widget.b.b$b  reason: collision with other inner class name */
    public static final class C3467b extends h.c.b.a.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(87478);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3467b(b bVar, h.c.d dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(this);
        }
    }

    static {
        Covode.recordClassIndex(87476);
    }

    @Override // com.ss.android.ugc.aweme.social.widget.b.a
    public final List<User> a() {
        return this.f133717a;
    }

    @Override // com.bytedance.provider.h
    public final String getSourceId() {
        return this.f133718b;
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ List $newUserList;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(87479);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, List list) {
            super(0);
            this.this$0 = bVar;
            this.$newUserList = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.c(this.$newUserList);
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ List $list$inlined;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(87480);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, List list) {
            super(0);
            this.this$0 = bVar;
            this.$list$inlined = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            b bVar = this.this$0;
            bVar.c(bVar.b(bVar.f133717a));
            return z.f158842a;
        }
    }

    public /* synthetic */ b() {
        this(new CopyOnWriteArrayList());
    }

    @Override // com.ss.android.ugc.aweme.social.widget.b.a
    public final long b() {
        if (this.f133720d == -1) {
            return -1;
        }
        return SystemClock.elapsedRealtime() - this.f133720d;
    }

    public final void c(List<User> list) {
        l.d(list, "");
        this.f133717a = list;
    }

    private void a(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        a.C3466a.a(this, aVar);
    }

    private b(List<User> list) {
        l.d(list, "");
        this.f133717a = list;
        this.f133718b = "MAFSource";
        this.f133719c = getSourceId();
        this.f133720d = -1;
        this.f133721e = new LinkedHashSet();
    }

    public final List<User> b(List<? extends User> list) {
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            T t2 = t;
            Set<String> set = this.f133721e;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (l.a((Object) it.next(), (Object) t2.getUid())) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            arrayList.add(t);
        }
        return n.g((Collection) arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    @Override // com.ss.android.ugc.aweme.social.widget.b.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(h.c.d<? super h.z> r6) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.social.widget.b.b.a(h.c.d):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.social.widget.b.a
    public final void a(List<? extends User> list) {
        MethodCollector.i(12929);
        l.d(list, "");
        synchronized (this) {
            try {
                Set<String> set = this.f133721e;
                ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getUid());
                }
                set.addAll(arrayList);
                a(new d(this, list));
            } finally {
                MethodCollector.o(12929);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r6, int r7, h.c.d<? super java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.ss.android.ugc.aweme.social.widget.b.b.a
            if (r0 == 0) goto L_0x0046
            r4 = r8
            com.ss.android.ugc.aweme.social.widget.b.b$a r4 = (com.ss.android.ugc.aweme.social.widget.b.b.a) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0046
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L_0x0013:
            java.lang.Object r3 = r4.result
            h.c.a.a r2 = h.c.a.a.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0034
            if (r0 != r1) goto L_0x004c
            h.r.a(r3)
        L_0x0021:
            com.ss.android.ugc.aweme.base.api.a r3 = (com.ss.android.ugc.aweme.base.api.a) r3
            java.lang.Object r0 = r3.checkValid()
            com.ss.android.ugc.aweme.social.c.c r0 = (com.ss.android.ugc.aweme.social.c.c) r0
            if (r0 == 0) goto L_0x0031
            java.util.List r0 = r0.getUserListWithRid()
            if (r0 != 0) goto L_0x0033
        L_0x0031:
            h.a.z r0 = h.a.z.INSTANCE
        L_0x0033:
            return r0
        L_0x0034:
            h.r.a(r3)
            com.ss.android.ugc.aweme.social.api.RecommendUserApiService r0 = com.ss.android.ugc.aweme.social.api.RecommendUserApiService.f133669a
            f.a.t r0 = r0.getMAFList(r6, r7)
            r4.label = r1
            java.lang.Object r3 = kotlinx.coroutines.c.b.a(r0, r4)
            if (r3 != r2) goto L_0x0021
            return r2
        L_0x0046:
            com.ss.android.ugc.aweme.social.widget.b.b$a r4 = new com.ss.android.ugc.aweme.social.widget.b.b$a
            r4.<init>(r5, r8)
            goto L_0x0013
        L_0x004c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.social.widget.b.b.a(int, int, h.c.d):java.lang.Object");
    }
}
