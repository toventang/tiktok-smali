package com.bytedance.ies.xbridge.system.b.a.b;

import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.CalendarContract;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xbridge.system.b.a.a.b;
import com.bytedance.ies.xbridge.system.c.g;
import h.a.i;
import h.c.b.a.j;
import h.c.d;
import h.e.c;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f36452a = {"LOCAL", "com.android.huawei.phone", "com.xiaomi"};

    /* renamed from: b  reason: collision with root package name */
    public static final String f36453b = f36453b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f36454c = f36454c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f36455d = f36455d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f36456e = "My calendar";

    /* renamed from: f  reason: collision with root package name */
    public static final String f36457f = "My calendar";

    /* renamed from: g  reason: collision with root package name */
    public static final String f36458g = "My calendar";

    /* renamed from: h  reason: collision with root package name */
    public static final a f36459h = new a();

    /* renamed from: i  reason: collision with root package name */
    private static final String f36460i = f36460i;

    private a() {
    }

    static {
        Covode.recordClassIndex(21863);
    }

    /* renamed from: com.bytedance.ies.xbridge.system.b.a.b.a$a  reason: collision with other inner class name */
    static final class C0882a extends j implements m<h.l.j<? super b>, d<? super z>, Object> {
        final /* synthetic */ Cursor $it;
        Object L$0;
        Object L$1;
        int label;
        private h.l.j p$;

        static {
            Covode.recordClassIndex(21864);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0882a(Cursor cursor, d dVar) {
            super(2, dVar);
            this.$it = cursor;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.c(dVar, "");
            C0882a aVar = new C0882a(this.$it, dVar);
            aVar.p$ = (h.l.j) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(h.l.j<? super b> jVar, d<? super z> dVar) {
            return ((C0882a) create(jVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.l.j jVar;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                jVar = this.p$;
            } else if (i2 == 1) {
                jVar = (h.l.j) this.L$0;
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            while (this.$it.moveToNext()) {
                b bVar = new b(this.$it.getLong(0), this.$it.getString(1), this.$it.getString(2), this.$it.getString(4), this.$it.getString(3), this.$it.getInt(5), this.$it.getString(6));
                this.L$0 = jVar;
                this.L$1 = bVar;
                this.label = 1;
                if (jVar.a(bVar, this) == aVar) {
                    return aVar;
                }
            }
            return z.f158842a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        if (r0 == null) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.bytedance.ies.xbridge.system.b.a.a.b> a(android.content.ContentResolver r17) {
        /*
            r4 = 2959(0xb8f, float:4.146E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            android.net.Uri r12 = android.provider.CalendarContract.Calendars.CONTENT_URI
            java.lang.String r0 = ""
            h.f.b.l.a(r12, r0)
            java.lang.String r5 = "_id"
            java.lang.String r6 = "name"
            java.lang.String r7 = "calendar_displayName"
            java.lang.String r8 = "account_name"
            java.lang.String r9 = "account_type"
            java.lang.String r10 = "visible"
            java.lang.String r11 = "ownerAccount"
            java.lang.String[] r13 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11}
            r14 = 0
            r15 = 0
            r16 = 0
            r11 = r17
            android.database.Cursor r3 = r11.query(r12, r13, r14, r15, r16)
            if (r3 == 0) goto L_0x004e
            r2 = r3
            android.database.Cursor r2 = (android.database.Cursor) r2     // Catch:{ all -> 0x003c }
            com.bytedance.ies.xbridge.system.b.a.b.a$a r0 = new com.bytedance.ies.xbridge.system.b.a.b.a$a     // Catch:{ all -> 0x003c }
            r1 = 0
            r0.<init>(r2, r1)     // Catch:{ all -> 0x003c }
            h.l.h r0 = h.l.k.a(r0)     // Catch:{ all -> 0x003c }
            java.util.List r0 = h.l.k.g(r0)     // Catch:{ all -> 0x003c }
            goto L_0x0049
        L_0x003c:
            r1 = move-exception
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)     // Catch:{ all -> 0x0041 }
            throw r1     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            h.e.c.a(r3, r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r0
        L_0x0049:
            h.e.c.a(r3, r1)
            if (r0 != 0) goto L_0x0050
        L_0x004e:
            h.a.z r0 = h.a.z.INSTANCE
        L_0x0050:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xbridge.system.b.a.b.a.a(android.content.ContentResolver):java.util.List");
    }

    public static boolean a(g gVar, ContentResolver contentResolver) {
        MethodCollector.i(2963);
        String a2 = i.a(new String[]{"title=?", "description=?", "sync_data2=?", "sync_data3=?", "dtstart=?", "dtend=?", "sync_data4=?"}, " and ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62);
        boolean z = false;
        String[] strArr = {gVar.f36505d, gVar.f36506e, gVar.f36509h, gVar.f36510i, String.valueOf(gVar.f36503b), String.valueOf(gVar.f36502a), String.valueOf(gVar.f36508g)};
        Cursor query = contentResolver.query(CalendarContract.Events.CONTENT_URI, new String[]{"title", "description", "sync_data2", "sync_data3", "dtstart", "dtend", "sync_data4", "_id"}, a2, strArr, null);
        if (query != null) {
            try {
                if (query.getCount() > 0) {
                    z = true;
                }
                c.a(query, null);
                MethodCollector.o(2963);
                return z;
            } catch (Throwable th) {
                c.a(query, th);
                MethodCollector.o(2963);
                throw th;
            }
        } else {
            MethodCollector.o(2963);
            return false;
        }
    }
}
