package com.google.android.datatransport.runtime.scheduling.a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.datatransport.runtime.c.b;
import com.google.android.datatransport.runtime.h;
import com.google.android.datatransport.runtime.k;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public final class h implements com.google.android.datatransport.runtime.c.b, c {

    /* renamed from: a  reason: collision with root package name */
    static final com.google.android.datatransport.b f49501a = com.google.android.datatransport.b.a("proto");

    /* renamed from: b  reason: collision with root package name */
    final d f49502b;

    /* renamed from: c  reason: collision with root package name */
    private final aa f49503c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.android.datatransport.runtime.d.a f49504d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.android.datatransport.runtime.d.a f49505e;

    /* access modifiers changed from: package-private */
    public interface a<T, U> {
        static {
            Covode.recordClassIndex(30975);
        }

        U a(T t);
    }

    /* access modifiers changed from: package-private */
    public interface c<T> {
        static {
            Covode.recordClassIndex(30977);
        }

        T a();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.c
    public final g a(k kVar, com.google.android.datatransport.runtime.h hVar) {
        com.google.android.datatransport.runtime.a.a.a("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", kVar.c(), hVar.a(), kVar.a());
        long longValue = ((Long) a(new u(this, kVar, hVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return g.a(longValue, kVar, hVar);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.c
    public final void a(Iterable<g> iterable) {
        if (iterable.iterator().hasNext()) {
            a(new w("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + c(iterable)));
        }
    }

    @Override // com.google.android.datatransport.runtime.c.b
    public final <T> T a(b.a<T> aVar) {
        MethodCollector.i(3343);
        SQLiteDatabase c2 = c();
        a(new p(c2), q.f49519a);
        try {
            T a2 = aVar.a();
            c2.setTransactionSuccessful();
            return a2;
        } finally {
            c2.endTransaction();
            MethodCollector.o(3343);
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.c
    public final void a(k kVar, long j2) {
        a(new j(j2, kVar));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f49503c.close();
    }

    static {
        Covode.recordClassIndex(30974);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.c
    public final Iterable<k> a() {
        return (Iterable) a(l.f49513a);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.c
    public final int b() {
        return ((Integer) a(new m(this.f49504d.a() - this.f49502b.d()))).intValue();
    }

    /* access modifiers changed from: package-private */
    public final SQLiteDatabase c() {
        aa aaVar = this.f49503c;
        aaVar.getClass();
        return (SQLiteDatabase) a(new i(aaVar), t.f49522a);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.c
    public final boolean b(k kVar) {
        return ((Boolean) a(new y(this, kVar))).booleanValue();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.c
    public final Iterable<g> c(k kVar) {
        return (Iterable) a(new k(this, kVar));
    }

    private <T> T a(a<SQLiteDatabase, T> aVar) {
        MethodCollector.i(3714);
        SQLiteDatabase c2 = c();
        c2.beginTransaction();
        try {
            T a2 = aVar.a(c2);
            c2.setTransactionSuccessful();
            return a2;
        } finally {
            c2.endTransaction();
            MethodCollector.o(3714);
        }
    }

    private static String c(Iterable<g> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<g> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().a());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.c
    public final void b(Iterable<g> iterable) {
        MethodCollector.i(3331);
        if (!iterable.iterator().hasNext()) {
            MethodCollector.o(3331);
            return;
        }
        c().compileStatement("DELETE FROM events WHERE _id in " + c(iterable)).execute();
        MethodCollector.o(3331);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.c
    public final long a(k kVar) {
        MethodCollector.i(3336);
        long longValue = ((Long) a(c().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{kVar.a(), String.valueOf(com.google.android.datatransport.runtime.e.a.a(kVar.c()))}), x.f49528a)).longValue();
        MethodCollector.o(3336);
        return longValue;
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final String f49506a;

        /* renamed from: b  reason: collision with root package name */
        final String f49507b;

        static {
            Covode.recordClassIndex(30976);
        }

        private b(String str, String str2) {
            this.f49506a = str;
            this.f49507b = str2;
        }

        /* synthetic */ b(String str, String str2, byte b2) {
            this(str, str2);
        }
    }

    static <T> T a(Cursor cursor, a<Cursor, T> aVar) {
        try {
            return aVar.a(cursor);
        } finally {
            cursor.close();
        }
    }

    static Long a(SQLiteDatabase sQLiteDatabase, k kVar) {
        MethodCollector.i(3326);
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(kVar.a(), String.valueOf(com.google.android.datatransport.runtime.e.a.a(kVar.c()))));
        if (kVar.b() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(kVar.b(), 0));
        }
        Long l2 = (Long) a(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), v.f49526a);
        MethodCollector.o(3326);
        return l2;
    }

    private <T> T a(c<T> cVar, a<Throwable, T> aVar) {
        long a2 = this.f49505e.a();
        while (true) {
            try {
                return cVar.a();
            } catch (SQLiteDatabaseLockedException e2) {
                if (this.f49505e.a() >= ((long) this.f49502b.c()) + a2) {
                    return aVar.a(e2);
                }
                SystemClock.sleep(50);
            }
        }
    }

    static List<g> a(List<g> list, Map<Long, Set<b>> map) {
        ListIterator<g> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            g next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.a()))) {
                h.a h2 = next.c().h();
                for (b bVar : map.get(Long.valueOf(next.a()))) {
                    h2.a(bVar.f49506a, bVar.f49507b);
                }
                listIterator.set(g.a(next.a(), next.b(), h2.b()));
            }
        }
        return list;
    }

    static Map<Long, Set<b>> a(SQLiteDatabase sQLiteDatabase, List<g> list) {
        MethodCollector.i(3341);
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(list.get(i2).a());
            if (i2 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        a(sQLiteDatabase.query("event_metadata", new String[]{"event_id", StringSet.name, "value"}, sb.toString(), null, null, null, null), new o(hashMap));
        MethodCollector.o(3341);
        return hashMap;
    }

    h(com.google.android.datatransport.runtime.d.a aVar, com.google.android.datatransport.runtime.d.a aVar2, d dVar, aa aaVar) {
        this.f49503c = aaVar;
        this.f49504d = aVar;
        this.f49505e = aVar2;
        this.f49502b = dVar;
    }
}
