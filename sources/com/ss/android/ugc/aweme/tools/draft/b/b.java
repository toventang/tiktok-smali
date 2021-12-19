package com.ss.android.ugc.aweme.tools.draft.b;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.z;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.am;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final String f139434a = "DraftDatabaseHelper";

    /* renamed from: b  reason: collision with root package name */
    static SQLiteDatabase f139435b;

    /* renamed from: c  reason: collision with root package name */
    static List<com.ss.android.ugc.aweme.tools.draft.d.h> f139436c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public static final b f139437d = new b();

    /* renamed from: e  reason: collision with root package name */
    private static SQLiteDatabase f139438e;

    /* access modifiers changed from: package-private */
    public static final class a extends h.c.b.a.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(91165);
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
            return this.this$0.a((String) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.c.b.a.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(91167);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, h.c.d dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a((List<String>) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.c.b.a.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(91169);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, h.c.d dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.b(0, 0, (String) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends h.c.b.a.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(91172);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar, h.c.d dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.b(0, 0, (List<String>) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends h.c.b.a.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(91174);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar, h.c.d dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(0, 0, (String) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.c.b.a.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(91176);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(b bVar, h.c.d dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(0, 0, (List<String>) null, this);
        }
    }

    private static String a(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "" : "time < strftime('%s','now','start of day','-30 day')*1000 " : "time >= strftime('%s','now','start of day','-30 day')*1000 and time < strftime('%s','now','start of day','-7 day')*1000 " : "time >= strftime('%s','now','start of day','-7 day')*1000 and time < strftime('%s','now','start of day','+0 day')*1000 " : "time >= strftime('%s','now','start of day','+0 day')*1000 and time < strftime('%s','now','start of day','+1 day')*1000 ";
    }

    private b() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r12, int r13, java.lang.String r14, h.c.d<? super java.util.List<com.ss.android.ugc.aweme.tools.draft.d.h>> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.ss.android.ugc.aweme.tools.draft.b.b.i
            if (r0 == 0) goto L_0x004d
            r4 = r15
            com.ss.android.ugc.aweme.tools.draft.b.b$i r4 = (com.ss.android.ugc.aweme.tools.draft.b.b.i) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x004d
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L_0x0013:
            java.lang.Object r3 = r4.result
            h.c.a.a r2 = h.c.a.a.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0028
            if (r0 != r1) goto L_0x0053
            java.lang.Object r9 = r4.L$0
            h.f.b.z$e r9 = (h.f.b.z.e) r9
            h.r.a(r3)
        L_0x0025:
            T r0 = r9.element
            return r0
        L_0x0028:
            h.r.a(r3)
            h.f.b.z$e r9 = new h.f.b.z$e
            r9.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.element = r0
            kotlinx.coroutines.ah r0 = kotlinx.coroutines.bf.f159041b
            com.ss.android.ugc.aweme.tools.draft.b.b$j r5 = new com.ss.android.ugc.aweme.tools.draft.b.b$j
            r10 = 0
            r6 = r12
            r7 = r13
            r8 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r4.L$0 = r9
            r4.label = r1
            java.lang.Object r0 = kotlinx.coroutines.i.a(r0, r5, r4)
            if (r0 != r2) goto L_0x0025
            return r2
        L_0x004d:
            com.ss.android.ugc.aweme.tools.draft.b.b$i r4 = new com.ss.android.ugc.aweme.tools.draft.b.b$i
            r4.<init>(r11, r15)
            goto L_0x0013
        L_0x0053:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.b.b.a(int, int, java.lang.String, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r12, int r13, java.util.List<java.lang.String> r14, h.c.d<? super java.util.List<com.ss.android.ugc.aweme.tools.draft.d.h>> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.ss.android.ugc.aweme.tools.draft.b.b.k
            if (r0 == 0) goto L_0x004d
            r4 = r15
            com.ss.android.ugc.aweme.tools.draft.b.b$k r4 = (com.ss.android.ugc.aweme.tools.draft.b.b.k) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x004d
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L_0x0013:
            java.lang.Object r3 = r4.result
            h.c.a.a r2 = h.c.a.a.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0028
            if (r0 != r1) goto L_0x0053
            java.lang.Object r9 = r4.L$0
            h.f.b.z$e r9 = (h.f.b.z.e) r9
            h.r.a(r3)
        L_0x0025:
            T r0 = r9.element
            return r0
        L_0x0028:
            h.r.a(r3)
            h.f.b.z$e r9 = new h.f.b.z$e
            r9.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.element = r0
            kotlinx.coroutines.ah r0 = kotlinx.coroutines.bf.f159041b
            com.ss.android.ugc.aweme.tools.draft.b.b$l r5 = new com.ss.android.ugc.aweme.tools.draft.b.b$l
            r10 = 0
            r6 = r12
            r7 = r13
            r8 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r4.L$0 = r9
            r4.label = r1
            java.lang.Object r0 = kotlinx.coroutines.i.a(r0, r5, r4)
            if (r0 != r2) goto L_0x0025
            return r2
        L_0x004d:
            com.ss.android.ugc.aweme.tools.draft.b.b$k r4 = new com.ss.android.ugc.aweme.tools.draft.b.b$k
            r4.<init>(r11, r15)
            goto L_0x0013
        L_0x0053:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.b.b.a(int, int, java.util.List, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r8, h.c.d<? super java.lang.Integer> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.ss.android.ugc.aweme.tools.draft.b.b.a
            if (r0 == 0) goto L_0x004a
            r6 = r9
            com.ss.android.ugc.aweme.tools.draft.b.b$a r6 = (com.ss.android.ugc.aweme.tools.draft.b.b.a) r6
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x004a
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L_0x0013:
            java.lang.Object r1 = r6.result
            h.c.a.a r5 = h.c.a.a.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L_0x002c
            if (r0 != r4) goto L_0x0050
            java.lang.Object r3 = r6.L$0
            h.f.b.z$c r3 = (h.f.b.z.c) r3
            h.r.a(r1)
        L_0x0025:
            int r0 = r3.element
            java.lang.Integer r0 = h.c.b.a.b.a(r0)
            return r0
        L_0x002c:
            h.r.a(r1)
            h.f.b.z$c r3 = new h.f.b.z$c
            r3.<init>()
            r0 = -1
            r3.element = r0
            kotlinx.coroutines.ah r2 = kotlinx.coroutines.bf.f159041b
            com.ss.android.ugc.aweme.tools.draft.b.b$b r1 = new com.ss.android.ugc.aweme.tools.draft.b.b$b
            r0 = 0
            r1.<init>(r8, r3, r0)
            r6.L$0 = r3
            r6.label = r4
            java.lang.Object r0 = kotlinx.coroutines.i.a(r2, r1, r6)
            if (r0 != r5) goto L_0x0025
            return r5
        L_0x004a:
            com.ss.android.ugc.aweme.tools.draft.b.b$a r6 = new com.ss.android.ugc.aweme.tools.draft.b.b$a
            r6.<init>(r7, r9)
            goto L_0x0013
        L_0x0050:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.b.b.a(java.lang.String, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.util.List<java.lang.String> r8, h.c.d<? super java.lang.Integer> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.ss.android.ugc.aweme.tools.draft.b.b.c
            if (r0 == 0) goto L_0x004a
            r6 = r9
            com.ss.android.ugc.aweme.tools.draft.b.b$c r6 = (com.ss.android.ugc.aweme.tools.draft.b.b.c) r6
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x004a
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L_0x0013:
            java.lang.Object r1 = r6.result
            h.c.a.a r5 = h.c.a.a.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L_0x002c
            if (r0 != r4) goto L_0x0050
            java.lang.Object r3 = r6.L$0
            h.f.b.z$c r3 = (h.f.b.z.c) r3
            h.r.a(r1)
        L_0x0025:
            int r0 = r3.element
            java.lang.Integer r0 = h.c.b.a.b.a(r0)
            return r0
        L_0x002c:
            h.r.a(r1)
            h.f.b.z$c r3 = new h.f.b.z$c
            r3.<init>()
            r0 = -1
            r3.element = r0
            kotlinx.coroutines.ah r2 = kotlinx.coroutines.bf.f159041b
            com.ss.android.ugc.aweme.tools.draft.b.b$d r1 = new com.ss.android.ugc.aweme.tools.draft.b.b$d
            r0 = 0
            r1.<init>(r8, r3, r0)
            r6.L$0 = r3
            r6.label = r4
            java.lang.Object r0 = kotlinx.coroutines.i.a(r2, r1, r6)
            if (r0 != r5) goto L_0x0025
            return r5
        L_0x004a:
            com.ss.android.ugc.aweme.tools.draft.b.b$c r6 = new com.ss.android.ugc.aweme.tools.draft.b.b$c
            r6.<init>(r7, r9)
            goto L_0x0013
        L_0x0050:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.b.b.a(java.util.List, h.c.d):java.lang.Object");
    }

    static String b() {
        return com.ss.android.ugc.aweme.port.in.g.a().A().c();
    }

    static {
        Covode.recordClassIndex(91164);
        d a2 = d.a();
        h.f.b.l.b(a2, "");
        SQLiteDatabase writableDatabase = a2.getWritableDatabase();
        h.f.b.l.b(writableDatabase, "");
        f139438e = writableDatabase;
        d a3 = d.a();
        h.f.b.l.b(a3, "");
        SQLiteDatabase readableDatabase = a3.getReadableDatabase();
        h.f.b.l.b(readableDatabase, "");
        f139435b = readableDatabase;
    }

    public static void a() {
        MethodCollector.i(461);
        for (com.ss.android.ugc.aweme.tools.draft.d.h hVar : f139436c) {
            f139438e.execSQL("update local_draft set draft_view_info = '" + com.ss.android.ugc.aweme.port.in.g.a().G().b(hVar).toString() + "' where video_path = '" + hVar.f139502a + "'");
        }
        f139436c.clear();
        MethodCollector.o(461);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.draft.b.b$b  reason: collision with other inner class name */
    public static final class C3679b extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super Object>, Object> {
        final /* synthetic */ z.c $count;
        final /* synthetic */ String $isPublishingDraftKey;
        int label;

        static {
            Covode.recordClassIndex(91166);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3679b(String str, z.c cVar, h.c.d dVar) {
            super(2, dVar);
            this.$isPublishingDraftKey = str;
            this.$count = cVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new C3679b(this.$isPublishingDraftKey, this.$count, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super Object> dVar) {
            return ((C3679b) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [h.z] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x006b  */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
            // Method dump skipped, instructions count: 125
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.b.b.C3679b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super Object>, Object> {
        final /* synthetic */ z.c $count;
        final /* synthetic */ List $isPublishingDraftKey;
        int label;

        static {
            Covode.recordClassIndex(91168);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(List list, z.c cVar, h.c.d dVar) {
            super(2, dVar);
            this.$isPublishingDraftKey = list;
            this.$count = cVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new d(this.$isPublishingDraftKey, this.$count, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super Object> dVar) {
            return ((d) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [h.z] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0060  */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
            // Method dump skipped, instructions count: 114
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.b.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.ugc.aweme.tools.draft.d.h a(android.database.Cursor r6) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.b.b.a(android.database.Cursor):com.ss.android.ugc.aweme.tools.draft.d.h");
    }

    /* access modifiers changed from: package-private */
    public static final class j extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
        final /* synthetic */ z.e $draftViewInfoList;
        final /* synthetic */ int $page;
        final /* synthetic */ String $publishDraftKey;
        final /* synthetic */ int $size;
        int label;

        static {
            Covode.recordClassIndex(91175);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(int i2, int i3, String str, z.e eVar, h.c.d dVar) {
            super(2, dVar);
            this.$size = i2;
            this.$page = i3;
            this.$publishDraftKey = str;
            this.$draftViewInfoList = eVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new j(this.$size, this.$page, this.$publishDraftKey, this.$draftViewInfoList, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
            return ((j) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e0, code lost:
            if (r4 != null) goto L_0x00e2;
         */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00ee  */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
            // Method dump skipped, instructions count: 256
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.b.b.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
        final /* synthetic */ z.e $draftViewInfoList;
        final /* synthetic */ int $page;
        final /* synthetic */ List $publishDraftKey;
        final /* synthetic */ int $size;
        int label;

        static {
            Covode.recordClassIndex(91177);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(int i2, int i3, List list, z.e eVar, h.c.d dVar) {
            super(2, dVar);
            this.$size = i2;
            this.$page = i3;
            this.$publishDraftKey = list;
            this.$draftViewInfoList = eVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new l(this.$size, this.$page, this.$publishDraftKey, this.$draftViewInfoList, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
            return ((l) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e0, code lost:
            if (r4 != null) goto L_0x00e2;
         */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00ee  */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
            // Method dump skipped, instructions count: 256
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.b.b.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class m extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super com.ss.android.ugc.aweme.tools.draft.d.h>, Object> {
        final /* synthetic */ String $primaryKey;
        int label;

        static {
            Covode.recordClassIndex(91178);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(String str, h.c.d dVar) {
            super(2, dVar);
            this.$primaryKey = str;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new m(this.$primaryKey, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super com.ss.android.ugc.aweme.tools.draft.d.h> dVar) {
            return ((m) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
            if (r3 != null) goto L_0x0065;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
            if (r3 != null) goto L_0x0065;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
            r3.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0068, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(1099);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
            return null;
         */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x006f  */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
            // Method dump skipped, instructions count: 129
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.b.b.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a8, code lost:
        if (r3 != null) goto L_0x00aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.ugc.aweme.draft.model.c a(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 188
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.b.b.a(java.lang.String):com.ss.android.ugc.aweme.draft.model.c");
    }

    /* access modifiers changed from: package-private */
    public static final class f extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
        final /* synthetic */ z.e $draftViewInfoList;
        final /* synthetic */ int $page;
        final /* synthetic */ String $publishDraftKey;
        final /* synthetic */ int $size;
        Object L$0;
        int label;

        static {
            Covode.recordClassIndex(91170);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(int i2, int i3, String str, z.e eVar, h.c.d dVar) {
            super(2, dVar);
            this.$size = i2;
            this.$page = i3;
            this.$publishDraftKey = str;
            this.$draftViewInfoList = eVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new f(this.$size, this.$page, this.$publishDraftKey, this.$draftViewInfoList, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
            return ((f) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0121, code lost:
            if (r0 != null) goto L_0x0146;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0144, code lost:
            if (r0 != null) goto L_0x0146;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0146, code lost:
            r0.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x014b, code lost:
            return h.z.f158842a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x0155  */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
            // Method dump skipped, instructions count: 345
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.b.b.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
        final /* synthetic */ z.e $draftViewInfoList;
        final /* synthetic */ int $page;
        final /* synthetic */ List $publishDraftKey;
        final /* synthetic */ int $size;
        int label;

        static {
            Covode.recordClassIndex(91173);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(int i2, int i3, List list, z.e eVar, h.c.d dVar) {
            super(2, dVar);
            this.$size = i2;
            this.$page = i3;
            this.$publishDraftKey = list;
            this.$draftViewInfoList = eVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new h(this.$size, this.$page, this.$publishDraftKey, this.$draftViewInfoList, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
            return ((h) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:39:0x0103  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0112  */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
            // Method dump skipped, instructions count: 292
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.b.b.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static String a(String str, int i2) {
        return "select * ,case when D.music_id = '' then D.time else A end AS C from (select * from local_draft where user_id = '" + b() + "' and " + a(i2) + ") AS D left join " + str + " AS B on D.music_id = B.music_id order by C desc , time desc";
    }

    static String a(int i2, String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "(select music_id , max(time) as A from local_draft where user_id = '" + b() + "' and " + a(i2) + "group by music_id order by A desc)";
        }
        return "(select music_id , max(time) as A from local_draft where user_id = '" + b() + "' and " + a(i2) + "and video_path != '" + str + "' group by music_id order by A desc)";
    }

    static String a(int i2, List<String> list) {
        if (list.isEmpty()) {
            return "(select music_id , max(time) as A from local_draft where user_id = '" + b() + "' and " + a(i2) + "group by music_id order by A desc)";
        }
        return "(select music_id , max(time) as A from local_draft where user_id = '" + b() + "' and " + a(i2) + "and video_path not in " + c.a(list) + " group by music_id order by A desc)";
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(int r12, int r13, java.lang.String r14, h.c.d<? super java.util.List<com.ss.android.ugc.aweme.tools.draft.d.h>> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.ss.android.ugc.aweme.tools.draft.b.b.e
            if (r0 == 0) goto L_0x004d
            r4 = r15
            com.ss.android.ugc.aweme.tools.draft.b.b$e r4 = (com.ss.android.ugc.aweme.tools.draft.b.b.e) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x004d
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L_0x0013:
            java.lang.Object r3 = r4.result
            h.c.a.a r2 = h.c.a.a.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0028
            if (r0 != r1) goto L_0x0053
            java.lang.Object r9 = r4.L$0
            h.f.b.z$e r9 = (h.f.b.z.e) r9
            h.r.a(r3)
        L_0x0025:
            T r0 = r9.element
            return r0
        L_0x0028:
            h.r.a(r3)
            h.f.b.z$e r9 = new h.f.b.z$e
            r9.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.element = r0
            kotlinx.coroutines.ah r0 = kotlinx.coroutines.bf.f159041b
            com.ss.android.ugc.aweme.tools.draft.b.b$f r5 = new com.ss.android.ugc.aweme.tools.draft.b.b$f
            r10 = 0
            r6 = r12
            r7 = r13
            r8 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r4.L$0 = r9
            r4.label = r1
            java.lang.Object r0 = kotlinx.coroutines.i.a(r0, r5, r4)
            if (r0 != r2) goto L_0x0025
            return r2
        L_0x004d:
            com.ss.android.ugc.aweme.tools.draft.b.b$e r4 = new com.ss.android.ugc.aweme.tools.draft.b.b$e
            r4.<init>(r11, r15)
            goto L_0x0013
        L_0x0053:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.b.b.b(int, int, java.lang.String, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(int r12, int r13, java.util.List<java.lang.String> r14, h.c.d<? super java.util.List<com.ss.android.ugc.aweme.tools.draft.d.h>> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.ss.android.ugc.aweme.tools.draft.b.b.g
            if (r0 == 0) goto L_0x004d
            r4 = r15
            com.ss.android.ugc.aweme.tools.draft.b.b$g r4 = (com.ss.android.ugc.aweme.tools.draft.b.b.g) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x004d
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L_0x0013:
            java.lang.Object r3 = r4.result
            h.c.a.a r2 = h.c.a.a.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0028
            if (r0 != r1) goto L_0x0053
            java.lang.Object r9 = r4.L$0
            h.f.b.z$e r9 = (h.f.b.z.e) r9
            h.r.a(r3)
        L_0x0025:
            T r0 = r9.element
            return r0
        L_0x0028:
            h.r.a(r3)
            h.f.b.z$e r9 = new h.f.b.z$e
            r9.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.element = r0
            kotlinx.coroutines.ah r0 = kotlinx.coroutines.bf.f159041b
            com.ss.android.ugc.aweme.tools.draft.b.b$h r5 = new com.ss.android.ugc.aweme.tools.draft.b.b$h
            r10 = 0
            r6 = r12
            r7 = r13
            r8 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r4.L$0 = r9
            r4.label = r1
            java.lang.Object r0 = kotlinx.coroutines.i.a(r0, r5, r4)
            if (r0 != r2) goto L_0x0025
            return r2
        L_0x004d:
            com.ss.android.ugc.aweme.tools.draft.b.b$g r4 = new com.ss.android.ugc.aweme.tools.draft.b.b$g
            r4.<init>(r11, r15)
            goto L_0x0013
        L_0x0053:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.b.b.b(int, int, java.util.List, h.c.d):java.lang.Object");
    }
}
