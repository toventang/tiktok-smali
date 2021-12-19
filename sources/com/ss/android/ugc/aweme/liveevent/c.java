package com.ss.android.ugc.aweme.liveevent;

import android.app.Application;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CalendarContract;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.c.a;
import f.a.ab;
import f.a.ad;
import f.a.af;
import f.a.d.g;
import h.a.i;
import h.c.b.a.j;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.Callable;

public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final b f108644c = new b((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f108645d = {"LOCAL", "com.android.huawei.phone", "com.xiaomi"};

    /* renamed from: a  reason: collision with root package name */
    public boolean f108646a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f108647b;

    public static final class b {
        static {
            Covode.recordClassIndex(69629);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f108648a;

        /* renamed from: b  reason: collision with root package name */
        public final String f108649b;

        /* renamed from: c  reason: collision with root package name */
        public final String f108650c;

        /* renamed from: d  reason: collision with root package name */
        public final String f108651d;

        /* renamed from: e  reason: collision with root package name */
        public final String f108652e;

        /* renamed from: f  reason: collision with root package name */
        public final int f108653f;

        /* renamed from: g  reason: collision with root package name */
        public final String f108654g;

        static {
            Covode.recordClassIndex(69628);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f108648a == aVar.f108648a && l.a(this.f108649b, aVar.f108649b) && l.a(this.f108650c, aVar.f108650c) && l.a(this.f108651d, aVar.f108651d) && l.a(this.f108652e, aVar.f108652e) && this.f108653f == aVar.f108653f && l.a(this.f108654g, aVar.f108654g);
        }

        public final String toString() {
            return "Calendar(id=" + this.f108648a + ", name=" + this.f108649b + ", displayName=" + this.f108650c + ", accountType=" + this.f108651d + ", accountName=" + this.f108652e + ", visible=" + this.f108653f + ", ownerAccount=" + this.f108654g + ")";
        }

        private /* synthetic */ a() {
            this(0, null, null, null, null, 0, null);
        }

        public final int hashCode() {
            int i2;
            int i3;
            int i4;
            int i5;
            long j2 = this.f108648a;
            int i6 = ((int) (j2 ^ (j2 >>> 32))) * 31;
            String str = this.f108649b;
            int i7 = 0;
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            int i8 = (i6 + i2) * 31;
            String str2 = this.f108650c;
            if (str2 != null) {
                i3 = str2.hashCode();
            } else {
                i3 = 0;
            }
            int i9 = (i8 + i3) * 31;
            String str3 = this.f108651d;
            if (str3 != null) {
                i4 = str3.hashCode();
            } else {
                i4 = 0;
            }
            int i10 = (i9 + i4) * 31;
            String str4 = this.f108652e;
            if (str4 != null) {
                i5 = str4.hashCode();
            } else {
                i5 = 0;
            }
            int i11 = (((i10 + i5) * 31) + this.f108653f) * 31;
            String str5 = this.f108654g;
            if (str5 != null) {
                i7 = str5.hashCode();
            }
            return i11 + i7;
        }

        public a(long j2, String str, String str2, String str3, String str4, int i2, String str5) {
            this.f108648a = j2;
            this.f108649b = str;
            this.f108650c = str2;
            this.f108651d = str3;
            this.f108652e = str4;
            this.f108653f = i2;
            this.f108654g = str5;
        }
    }

    static {
        Covode.recordClassIndex(69627);
    }

    public final ab<Boolean> a() {
        ab<Boolean> a2 = ab.a((af) new C2785c(this)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        l.b(a2, "");
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        if (r0 == null) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<com.ss.android.ugc.aweme.liveevent.c.a> b() {
        /*
            r17 = this;
            r4 = 1306(0x51a, float:1.83E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            android.net.Uri r12 = android.provider.CalendarContract.Calendars.CONTENT_URI
            java.lang.String r0 = ""
            h.f.b.l.b(r12, r0)
            java.lang.String r5 = "_id"
            java.lang.String r6 = "name"
            java.lang.String r7 = "calendar_displayName"
            java.lang.String r8 = "account_name"
            java.lang.String r9 = "account_type"
            java.lang.String r10 = "visible"
            java.lang.String r11 = "ownerAccount"
            java.lang.String[] r13 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11}
            r0 = r17
            android.content.Context r0 = r0.f108647b
            android.content.ContentResolver r11 = r0.getContentResolver()
            r14 = 0
            r15 = 0
            r16 = 0
            android.database.Cursor r3 = r11.query(r12, r13, r14, r15, r16)
            if (r3 == 0) goto L_0x0054
            r2 = r3
            android.database.Cursor r2 = (android.database.Cursor) r2     // Catch:{ all -> 0x0042 }
            com.ss.android.ugc.aweme.liveevent.c$d r0 = new com.ss.android.ugc.aweme.liveevent.c$d     // Catch:{ all -> 0x0042 }
            r1 = 0
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0042 }
            h.l.h r0 = h.l.k.a(r0)     // Catch:{ all -> 0x0042 }
            java.util.List r0 = h.l.k.g(r0)     // Catch:{ all -> 0x0042 }
            goto L_0x004f
        L_0x0042:
            r1 = move-exception
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)     // Catch:{ all -> 0x0047 }
            throw r1     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r0 = move-exception
            h.e.c.a(r3, r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r0
        L_0x004f:
            h.e.c.a(r3, r1)
            if (r0 != 0) goto L_0x0056
        L_0x0054:
            h.a.z r0 = h.a.z.INSTANCE
        L_0x0056:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.liveevent.c.b():java.util.List");
    }

    public c(Context context) {
        l.d(context, "");
        this.f108647b = context;
    }

    private final androidx.fragment.app.e a(Context context) {
        while (!(context instanceof Application)) {
            if (context instanceof androidx.fragment.app.e) {
                return (androidx.fragment.app.e) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
            l.b(context, "");
        }
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.liveevent.c$c  reason: collision with other inner class name */
    static final class C2785c<T> implements af {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f108655a;

        static {
            Covode.recordClassIndex(69630);
        }

        C2785c(c cVar) {
            this.f108655a = cVar;
        }

        @Override // f.a.af
        public final void subscribe(ad<Boolean> adVar) {
            boolean z;
            boolean z2;
            l.d(adVar, "");
            if (androidx.core.content.b.a(this.f108655a.f108647b, "android.permission.READ_CALENDAR") == 0) {
                z = true;
            } else {
                z = false;
            }
            if (androidx.core.content.b.a(this.f108655a.f108647b, "android.permission.WRITE_CALENDAR") == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z || !z2) {
                adVar.a((Boolean) false);
            } else {
                adVar.a((Boolean) true);
            }
        }
    }

    static final class e<T> implements af {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f108656a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f108657b;

        static {
            Covode.recordClassIndex(69632);
        }

        e(c cVar, androidx.fragment.app.e eVar) {
            this.f108656a = cVar;
            this.f108657b = eVar;
        }

        @Override // f.a.af
        public final void subscribe(final ad<Integer> adVar) {
            l.d(adVar, "");
            com.bytedance.ies.powerpermissions.l.f34469d.a(this.f108657b, null).a("android.permission.WRITE_CALENDAR", "android.permission.READ_CALENDAR").a(new com.bytedance.ies.powerpermissions.f(this) {
                /* class com.ss.android.ugc.aweme.liveevent.c.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f108658a;

                static {
                    Covode.recordClassIndex(69633);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: f.a.ad */
                /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: f.a.ad */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.bytedance.ies.powerpermissions.f
                public final void a(com.bytedance.ies.powerpermissions.c.a... aVarArr) {
                    l.d(aVarArr, "");
                    for (com.bytedance.ies.powerpermissions.c.a aVar : aVarArr) {
                        if (aVar.f34455b != a.EnumC0768a.GRANTED) {
                            adVar.a((Object) -1);
                            return;
                        }
                    }
                    this.f108658a.f108656a.f108646a = true;
                    adVar.a((Object) 0);
                }

                {
                    this.f108658a = r1;
                }
            });
        }
    }

    static final class f<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f108660a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f108661b;

        static {
            Covode.recordClassIndex(69634);
        }

        f(c cVar, e eVar) {
            this.f108660a = cVar;
            this.f108661b = eVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            Integer num = (Integer) obj;
            l.d(num, "");
            if (num.intValue() == 0) {
                return ab.a((Callable) new Callable(this) {
                    /* class com.ss.android.ugc.aweme.liveevent.c.f.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ f f108662a;

                    static {
                        Covode.recordClassIndex(69635);
                    }

                    {
                        this.f108662a = r1;
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return this.f108662a.f108660a.a(this.f108662a.f108661b);
                    }
                }).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
            }
            com.ss.android.ugc.aweme.framework.a.a.b("CalendarManager", "no permission to add calendar event");
            return ab.a((Throwable) new Exception("user denied calendar permission"));
        }
    }

    public final ab<d> b(e eVar) {
        l.d(eVar, "");
        androidx.fragment.app.e a2 = a(this.f108647b);
        if (a2 == null) {
            ab<d> a3 = ab.a(d.Failed);
            l.b(a3, "");
            return a3;
        }
        ab<d> a4 = ab.a((af) new e(this, a2)).b((Object) -1).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a((g) new f(this, eVar));
        l.b(a4, "");
        return a4;
    }

    /* access modifiers changed from: package-private */
    public static final class d extends j implements m<h.l.j<? super a>, h.c.d<? super z>, Object> {
        final /* synthetic */ Cursor $it;
        private /* synthetic */ Object L$0;
        int label;

        static {
            Covode.recordClassIndex(69631);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Cursor cursor, h.c.d dVar) {
            super(2, dVar);
            this.$it = cursor;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            d dVar2 = new d(this.$it, dVar);
            dVar2.L$0 = obj;
            return dVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(h.l.j<? super a> jVar, h.c.d<? super z> dVar) {
            return ((d) create(jVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.l.j jVar;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                jVar = (h.l.j) this.L$0;
            } else if (i2 == 1) {
                jVar = (h.l.j) this.L$0;
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            while (this.$it.moveToNext()) {
                a aVar2 = new a(this.$it.getLong(0), this.$it.getString(1), this.$it.getString(2), this.$it.getString(4), this.$it.getString(3), this.$it.getInt(5), this.$it.getString(6));
                this.L$0 = jVar;
                this.label = 1;
                if (jVar.a(aVar2, this) == aVar) {
                    return aVar;
                }
            }
            return z.f158842a;
        }
    }

    public final d a(e eVar) {
        String str;
        Long l2;
        T t;
        T t2;
        l.d(eVar, "");
        try {
            b bVar = eVar.f108665b;
            if (bVar == null) {
                return d.ArgumentError;
            }
            String str2 = bVar.f108636a;
            if (str2 == null) {
                return d.ArgumentError;
            }
            b bVar2 = eVar.f108665b;
            if (!(bVar2 == null || (str = eVar.f108664a) == null)) {
                if (str.length() != 0) {
                    String str3 = bVar2.f108636a;
                    if (str3 != null) {
                        if (str3.length() != 0) {
                            String str4 = bVar2.f108637b;
                            if (str4 != null) {
                                if (str4.length() != 0) {
                                    if (bVar2.f108639d > 0 && bVar2.f108640e > 0 && bVar2.f108639d <= bVar2.f108640e) {
                                        if (!this.f108646a) {
                                            com.ss.android.ugc.aweme.framework.a.a.b("CalendarManager", "no calendar permission");
                                            return d.NoPermission;
                                        }
                                        List<a> b2 = b();
                                        Iterator<T> it = b2.iterator();
                                        while (true) {
                                            l2 = null;
                                            if (!it.hasNext()) {
                                                t = null;
                                                break;
                                            }
                                            t = it.next();
                                            if (i.a(f108645d, t.f108651d)) {
                                                break;
                                            }
                                        }
                                        T t3 = t;
                                        if (t3 == null) {
                                            Iterator<T> it2 = b2.iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    t2 = null;
                                                    break;
                                                }
                                                t2 = it2.next();
                                                T t4 = t2;
                                                String str5 = t4.f108651d;
                                                if (str5 != null) {
                                                    int hashCode = str5.hashCode();
                                                    if (hashCode == -1116924142) {
                                                        if (str5.equals("My calendar") && l.a((Object) t4.f108652e, (Object) "My calendar") && l.a((Object) t4.f108654g, (Object) "My calendar")) {
                                                            break;
                                                        }
                                                    } else if (hashCode == 879034182) {
                                                        if (str5.equals(com.bytedance.ies.xbridge.system.b.a.b.a.f36455d) && t4.f108652e != null && l.a((Object) t4.f108652e, (Object) t4.f108654g)) {
                                                            break;
                                                        }
                                                    } else if (hashCode == 1664859374) {
                                                        if (str5.equals(com.bytedance.ies.xbridge.system.b.a.b.a.f36453b) && l.a((Object) t4.f108654g, (Object) com.bytedance.ies.xbridge.system.b.a.b.a.f36454c)) {
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            t3 = t2;
                                            if (t3 == null) {
                                                return d.Failed;
                                            }
                                        }
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put("calendar_id", Long.valueOf(t3.f108648a));
                                        TimeZone timeZone = TimeZone.getDefault();
                                        l.b(timeZone, "");
                                        contentValues.put("eventTimezone", timeZone.getID());
                                        contentValues.put("dtstart", Long.valueOf(bVar.f108639d));
                                        contentValues.put("dtend", Long.valueOf(bVar.f108640e));
                                        contentValues.put("title", bVar.f108637b);
                                        contentValues.put("description", bVar.f108638c);
                                        contentValues.put(com.bytedance.ies.xbridge.system.b.a.b.b.f36462b, str2);
                                        ContentResolver contentResolver = this.f108647b.getContentResolver();
                                        Uri uri = CalendarContract.Events.CONTENT_URI;
                                        l.b(uri, "");
                                        Uri build = uri.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", "com.bytedance").appendQueryParameter("account_type", "LOCAL").build();
                                        l.b(build, "");
                                        Uri insert = contentResolver.insert(build, contentValues);
                                        if (insert == null) {
                                            return d.Failed;
                                        }
                                        l.b(insert, "");
                                        if (bVar.f108641f != null) {
                                            String lastPathSegment = insert.getLastPathSegment();
                                            if (lastPathSegment != null) {
                                                l2 = Long.valueOf(Long.parseLong(lastPathSegment));
                                            }
                                            ContentValues contentValues2 = new ContentValues();
                                            contentValues2.put("minutes", bVar.f108641f);
                                            contentValues2.put("event_id", l2);
                                            contentValues2.put("method", (Integer) 1);
                                            this.f108647b.getContentResolver().insert(CalendarContract.Reminders.CONTENT_URI, contentValues2);
                                        }
                                        return d.Success;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            com.ss.android.ugc.aweme.framework.a.a.b("CalendarManager", "invalid event params: ".concat(String.valueOf(bVar)));
            return d.ArgumentError;
        } catch (Exception unused) {
            com.ss.android.ugc.aweme.framework.a.a.b("CalendarManager", "failed to add calendar event");
            return d.Failed;
        }
    }
}
