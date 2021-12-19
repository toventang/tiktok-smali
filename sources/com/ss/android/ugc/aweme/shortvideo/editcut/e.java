package com.ss.android.ugc.aweme.shortvideo.editcut;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.property.aj;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import h.c.b.a.k;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.List;
import kotlinx.coroutines.am;

public final class e {

    /* renamed from: d  reason: collision with root package name */
    public static final a f128279d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    com.ss.android.ugc.tools.view.e.b f128280a;

    /* renamed from: b  reason: collision with root package name */
    public final Runnable f128281b = new RunnableC3348e(this);

    /* renamed from: c  reason: collision with root package name */
    public final androidx.fragment.app.e f128282c;

    /* renamed from: e  reason: collision with root package name */
    private final h f128283e = i.a((h.f.a.a) new d(this));

    /* renamed from: f  reason: collision with root package name */
    private final h f128284f = i.a((h.f.a.a) c.f128285a);

    static {
        Covode.recordClassIndex(84095);
    }

    public final SafeHandler a() {
        return (SafeHandler) this.f128283e.getValue();
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return ((Boolean) this.f128284f.getValue()).booleanValue();
    }

    static final class a {
        static {
            Covode.recordClassIndex(84096);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f128285a = new c();

        static {
            Covode.recordClassIndex(84100);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(aj.a());
        }
    }

    static final class d extends m implements h.f.a.a<SafeHandler> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(84101);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SafeHandler invoke() {
            return new SafeHandler(this.this$0.f128282c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.e$e  reason: collision with other inner class name */
    static final class RunnableC3348e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f128286a;

        static {
            Covode.recordClassIndex(84102);
        }

        RunnableC3348e(e eVar) {
            this.f128286a = eVar;
        }

        public final void run() {
            if (!this.f128286a.f128282c.isFinishing()) {
                e eVar = this.f128286a;
                if (!eVar.f128282c.isFinishing()) {
                    eVar.f128280a = com.ss.android.ugc.tools.view.e.b.b(eVar.f128282c, "");
                    com.ss.android.ugc.tools.view.e.b bVar = eVar.f128280a;
                    if (bVar != null) {
                        bVar.setIndeterminate(true);
                    }
                }
            }
        }
    }

    public e(androidx.fragment.app.e eVar) {
        l.d(eVar, "");
        this.f128282c = eVar;
    }

    /* access modifiers changed from: package-private */
    public static final class b extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ h.f.a.b $onResult;
        final /* synthetic */ List $selectedMediaData;
        final /* synthetic */ boolean $showLoading;
        final /* synthetic */ long $start;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(84097);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar, boolean z, List list, h.f.a.b bVar, long j2, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = eVar;
            this.$showLoading = z;
            this.$selectedMediaData = list;
            this.$onResult = bVar;
            this.$start = j2;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new b(this.this$0, this.$showLoading, this.$selectedMediaData, this.$onResult, this.$start, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x00bc  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00f8 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00f9  */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
            // Method dump skipped, instructions count: 351
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.editcut.e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
