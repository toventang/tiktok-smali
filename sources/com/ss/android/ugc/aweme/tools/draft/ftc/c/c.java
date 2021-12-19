package com.ss.android.ugc.aweme.tools.draft.ftc.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.services.IExternalService;
import h.c.b.a.d;
import h.f.b.m;
import h.h;
import h.i;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final h f139547a = i.a((h.f.a.a) b.f139550a);

    /* renamed from: b  reason: collision with root package name */
    private final h f139548b = i.a((h.f.a.a) a.f139549a);

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.c.c$c  reason: collision with other inner class name */
    public static final class C3684c extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(91238);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3684c(c cVar, h.c.d dVar) {
            super(dVar);
            this.this$0 = cVar;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(this);
        }
    }

    static {
        Covode.recordClassIndex(91235);
    }

    static final class a extends m implements h.f.a.a<IExternalService> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f139549a = new a();

        static {
            Covode.recordClassIndex(91236);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IExternalService invoke() {
            return AVExternalServiceImpl.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.ftc.c.b
    public final Object a() {
        return this.f139547a.getValue();
    }

    static final class b extends m implements h.f.a.a<com.ss.android.ugc.aweme.account.model.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f139550a = new b();

        static {
            Covode.recordClassIndex(91237);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.account.model.a invoke() {
            return g.a().A().e();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038 A[LOOP:0: B:10:0x0032->B:12:0x0038, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    @Override // com.ss.android.ugc.aweme.tools.draft.ftc.c.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(h.c.d<? super java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel>> r6) {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.ftc.c.c.a(h.c.d):java.lang.Object");
    }
}
