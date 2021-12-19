package com.ss.android.socialbase.downloader.c;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import android.util.SparseArray;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import com.ss.android.socialbase.downloader.c.c;
import com.ss.android.socialbase.downloader.downloader.v;
import com.ss.android.socialbase.downloader.k.g;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.segment.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONObject;

public class e extends c.a implements v {

    /* renamed from: a  reason: collision with root package name */
    public static volatile SQLiteDatabase f60302a;

    /* renamed from: b  reason: collision with root package name */
    public g f60303b;

    /* renamed from: c  reason: collision with root package name */
    public g f60304c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f60305d;

    /* renamed from: e  reason: collision with root package name */
    b f60306e;

    /* renamed from: f  reason: collision with root package name */
    private g f60307f;

    static {
        Covode.recordClassIndex(37238);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l, com.ss.android.socialbase.downloader.c.c
    public final void a(int i2, List<DownloadChunk> list) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l, com.ss.android.socialbase.downloader.c.c
    public final List<DownloadInfo> b() {
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l, com.ss.android.socialbase.downloader.c.c
    public final List<DownloadInfo> b(String str) {
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l, com.ss.android.socialbase.downloader.c.c
    public final void b(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l, com.ss.android.socialbase.downloader.c.c
    public final List<DownloadInfo> c(String str) {
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l, com.ss.android.socialbase.downloader.c.c
    public final List<DownloadInfo> d(String str) {
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l, com.ss.android.socialbase.downloader.c.c
    public final boolean e() {
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l, com.ss.android.socialbase.downloader.c.c
    public final DownloadInfo g(int i2) {
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.v
    public final void a(final SparseArray<DownloadInfo> sparseArray, final SparseArray<List<DownloadChunk>> sparseArray2, final d dVar) {
        try {
            AnonymousClass1 r1 = new Runnable() {
                /* class com.ss.android.socialbase.downloader.c.e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(37239);
                }

                /* JADX WARNING: Code restructure failed: missing block: B:107:0x024a, code lost:
                    if (r0 == null) goto L_0x025d;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:110:0x024f, code lost:
                    if (r0 == null) goto L_0x025d;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:113:0x0254, code lost:
                    if (r0 == null) goto L_0x025d;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:114:0x0256, code lost:
                    r0.a();
                    r19.f60311d.f60305d = true;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:115:0x025d, code lost:
                    r19.f60311d.a(r3, r4);
                    com.bytedance.frameworks.apm.trace.MethodCollector.o(14534);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:116:0x0269, code lost:
                    return;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a8, code lost:
                    if (r0 != null) goto L_0x0256;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                    // Method dump skipped, instructions count: 618
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.c.e.AnonymousClass1.run():void");
                }
            };
            ExecutorService l2 = com.ss.android.socialbase.downloader.downloader.c.l();
            if (l2 != null) {
                l2.execute(r1);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(List<DownloadInfo> list) {
        try {
            for (DownloadInfo downloadInfo : list) {
                if (downloadInfo != null && downloadInfo.isSavePathRedirected()) {
                    g.a(downloadInfo);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x01a4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List<com.ss.android.socialbase.downloader.model.DownloadInfo> r15, java.util.List<java.lang.Integer> r16, android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadInfo> r17, android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadInfo> r18, android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.model.DownloadChunk>> r19) {
        /*
        // Method dump skipped, instructions count: 438
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.c.e.a(java.util.List, java.util.List, android.util.SparseArray, android.util.SparseArray, android.util.SparseArray):void");
    }

    @Override // com.ss.android.socialbase.downloader.c.c
    public final boolean a(int i2) {
        try {
            return b(i2) != null;
        } catch (Throwable unused) {
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l, com.ss.android.socialbase.downloader.c.c
    public final List<DownloadInfo> a(String str) {
        MethodCollector.i(14134);
        f();
        ArrayList arrayList = new ArrayList();
        if (f60302a != null) {
            try {
                Cursor rawQuery = f60302a.rawQuery(a.a("SELECT * FROM %s WHERE %s = ?", new Object[]{"downloader", "url"}), new String[]{str});
                if (rawQuery.moveToNext()) {
                    arrayList.add(new DownloadInfo(rawQuery));
                }
                g.a(rawQuery);
            } catch (Throwable unused) {
                g.a(null);
            }
        }
        MethodCollector.o(14134);
        return arrayList;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l, com.ss.android.socialbase.downloader.c.c
    public final void a(final DownloadChunk downloadChunk) {
        f();
        if (f60302a != null && this.f60304c != null) {
            com.ss.android.socialbase.downloader.downloader.c.b(new Runnable() {
                /* class com.ss.android.socialbase.downloader.c.e.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(37245);
                }

                public final void run() {
                    try {
                        e.a(downloadChunk, e.this.f60304c.a());
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l, com.ss.android.socialbase.downloader.c.c
    public final void a(final int i2, final int i3, final long j2) {
        f();
        if (i2 != 0 && i3 >= 0 && j2 >= 0 && f60302a != null && this.f60304c != null) {
            com.ss.android.socialbase.downloader.downloader.c.b(new Runnable() {
                /* class com.ss.android.socialbase.downloader.c.e.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(37246);
                }

                public final void run() {
                    try {
                        e.a(i2, i3, j2, e.this.f60304c.c());
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l, com.ss.android.socialbase.downloader.c.c
    public final void a(final int i2, final int i3, final int i4, final long j2) {
        f();
        if (i2 != 0 && i3 >= 0 && i4 >= 0 && j2 >= 0 && f60302a != null && this.f60304c != null) {
            com.ss.android.socialbase.downloader.downloader.c.b(new Runnable() {
                /* class com.ss.android.socialbase.downloader.c.e.AnonymousClass7 */

                static {
                    Covode.recordClassIndex(37247);
                }

                public final void run() {
                    try {
                        e.a(i2, i3, i4, j2, e.this.f60304c.c());
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l, com.ss.android.socialbase.downloader.c.c
    public final void a(final int i2, final int i3, final int i4, final int i5) {
        f();
        if (i2 != 0 && i4 >= 0 && i5 != i3 && i5 >= 0 && f60302a != null && this.f60304c != null) {
            com.ss.android.socialbase.downloader.downloader.c.b(new Runnable() {
                /* class com.ss.android.socialbase.downloader.c.e.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(37248);
                }

                public final void run() {
                    try {
                        e.a(i2, i3, i4, i5, e.this.f60304c.c());
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0013 */
    @Override // com.ss.android.socialbase.downloader.downloader.l, com.ss.android.socialbase.downloader.c.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.socialbase.downloader.model.DownloadInfo a(int r10, int r11) {
        /*
            r9 = this;
            r8 = 14578(0x38f2, float:2.0428E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r8)
            r9.f()
            android.database.sqlite.SQLiteDatabase r0 = com.ss.android.socialbase.downloader.c.e.f60302a
            r7 = 0
            if (r0 != 0) goto L_0x0011
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r8)
            return r7
        L_0x0011:
            r2 = 10
        L_0x0013:
            android.database.sqlite.SQLiteDatabase r0 = com.ss.android.socialbase.downloader.c.e.f60302a     // Catch:{ all -> 0x0046 }
            boolean r0 = r0.isDbLockedByCurrentThread()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0025
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0025
            r0 = 5
            java.lang.Thread.sleep(r0)     // Catch:{ all -> 0x0013 }
            goto L_0x0013
        L_0x0025:
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.String r1 = "chunkCount"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r6.put(r1, r0)
            android.database.sqlite.SQLiteDatabase r5 = com.ss.android.socialbase.downloader.c.e.f60302a
            java.lang.String r4 = "downloader"
            java.lang.String r3 = "_id = ? "
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r0 = java.lang.Integer.toString(r10)
            r2[r1] = r0
            r5.update(r4, r6, r3, r2)
        L_0x0046:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.c.e.a(int, int):com.ss.android.socialbase.downloader.model.DownloadInfo");
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l, com.ss.android.socialbase.downloader.c.c
    public final boolean a(final DownloadInfo downloadInfo) {
        f();
        if (downloadInfo == null || f60302a == null) {
            return false;
        }
        com.ss.android.socialbase.downloader.downloader.c.b(new Runnable() {
            /* class com.ss.android.socialbase.downloader.c.e.AnonymousClass10 */

            static {
                Covode.recordClassIndex(37240);
            }

            public final void run() {
                e.this.c(downloadInfo);
            }
        });
        return true;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l, com.ss.android.socialbase.downloader.c.c
    public final DownloadInfo a(int i2, long j2, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 3);
        contentValues.put("totalBytes", Long.valueOf(j2));
        contentValues.put("eTag", str);
        if (!TextUtils.isEmpty(str2)) {
            contentValues.put(StringSet.name, str2);
        }
        a(i2, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l, com.ss.android.socialbase.downloader.c.c
    public final DownloadInfo a(int i2, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 4);
        contentValues.put("curBytes", Long.valueOf(j2));
        a(i2, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final boolean a(int i2, Map<Long, i> map) {
        MethodCollector.i(12018);
        long currentTimeMillis = System.currentTimeMillis();
        f();
        if (f60302a == null) {
            MethodCollector.o(12018);
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (Long l2 : map.keySet()) {
                i iVar = map.get(Long.valueOf(l2.longValue()));
                JSONObject jSONObject = iVar.f60933g;
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                    iVar.f60933g = jSONObject;
                }
                jSONObject.put("st", iVar.f60927a);
                jSONObject.put("cu", iVar.c());
                jSONObject.put("en", iVar.f60929c);
                jSONArray.put(jSONObject);
            }
        } catch (Throwable unused) {
        }
        SQLiteStatement d2 = this.f60307f.d();
        synchronized (d2) {
            try {
                d2.clearBindings();
                d2.bindLong(1, (long) i2);
                d2.bindString(2, jSONArray.toString());
                d2.execute();
            } catch (Throwable th) {
                MethodCollector.o(12018);
                throw th;
            }
        }
        com.ss.android.socialbase.downloader.e.a.b("SqlDownloadCache", "updateSegments cost=" + (System.currentTimeMillis() - currentTimeMillis));
        MethodCollector.o(12018);
        return false;
    }

    public final void a(SparseArray<DownloadInfo> sparseArray, SparseArray<List<DownloadChunk>> sparseArray2) {
        try {
            HashMap a2 = g.a(sparseArray);
            HashMap a3 = g.a(sparseArray2);
            b bVar = this.f60306e;
            if (bVar != null) {
                bVar.a(a2, a3);
            }
        } catch (Throwable unused) {
        }
    }

    public e() {
        this((byte) 0);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l, com.ss.android.socialbase.downloader.c.c
    public final boolean d() {
        return this.f60305d;
    }

    @Override // com.ss.android.socialbase.downloader.c.c
    public final void a() {
        a(new SparseArray<>(), new SparseArray<>(), (d) null);
    }

    private static void h() {
        MethodCollector.i(14586);
        try {
            if (f60302a != null && f60302a.inTransaction()) {
                f60302a.endTransaction();
            }
            MethodCollector.o(14586);
        } catch (Throwable unused) {
            MethodCollector.o(14586);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l, com.ss.android.socialbase.downloader.c.c
    public final void c() {
        f();
        if (f60302a != null) {
            com.ss.android.socialbase.downloader.downloader.c.b(new Runnable() {
                /* class com.ss.android.socialbase.downloader.c.e.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(37242);
                }

                public final void run() {
                    e.this.g();
                }
            });
        }
    }

    public final synchronized void g() {
        MethodCollector.i(14588);
        try {
            f60302a.beginTransaction();
            f60302a.delete("downloader", null, null);
            f60302a.delete("downloadChunk", null, null);
            f60302a.setTransactionSuccessful();
            h();
            MethodCollector.o(14588);
        } catch (Throwable unused) {
            h();
            MethodCollector.o(14588);
        }
    }

    public final void f() {
        MethodCollector.i(13945);
        if (f60302a == null) {
            synchronized (e.class) {
                try {
                    if (f60302a == null) {
                        try {
                            f60302a = a.a().getWritableDatabase();
                            this.f60303b = new g(f60302a, "downloader", com.ss.android.socialbase.downloader.b.c.f60276a, com.ss.android.socialbase.downloader.b.c.f60277b);
                            this.f60304c = new g(f60302a, "downloadChunk", com.ss.android.socialbase.downloader.b.c.f60278c, com.ss.android.socialbase.downloader.b.c.f60279d);
                            this.f60307f = new g(f60302a, "segments", com.ss.android.socialbase.downloader.b.c.f60280e, com.ss.android.socialbase.downloader.b.c.f60281f);
                        } catch (Throwable unused) {
                        }
                    }
                } finally {
                    MethodCollector.o(13945);
                }
            }
            return;
        }
        MethodCollector.o(13945);
    }

    private e(byte b2) {
    }

    @Override // com.ss.android.socialbase.downloader.c.c
    public final void a(b bVar) {
        this.f60306e = bVar;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l, com.ss.android.socialbase.downloader.c.c
    public final void b(DownloadChunk downloadChunk) {
        a(downloadChunk);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l, com.ss.android.socialbase.downloader.c.c
    public final boolean f(final int i2) {
        com.ss.android.socialbase.downloader.downloader.c.b(new Runnable() {
            /* class com.ss.android.socialbase.downloader.c.e.AnonymousClass11 */

            static {
                Covode.recordClassIndex(37241);
            }

            public final void run() {
                e.this.e(i2);
                e.this.d(i2);
                e.this.l(i2);
            }
        });
        return true;
    }

    private void d(final DownloadInfo downloadInfo) {
        f();
        if (f60302a != null && this.f60303b != null) {
            com.ss.android.socialbase.downloader.downloader.c.b(new Runnable() {
                /* class com.ss.android.socialbase.downloader.c.e.AnonymousClass9 */

                static {
                    Covode.recordClassIndex(37249);
                }

                public final void run() {
                    try {
                        e.a(downloadInfo, e.this.f60303b.a());
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l, com.ss.android.socialbase.downloader.c.c
    public final DownloadInfo i(int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 1);
        a(i2, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l, com.ss.android.socialbase.downloader.c.c
    public final DownloadInfo j(int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) -7);
        a(i2, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final void l(int i2) {
        f();
        if (f60302a != null) {
            try {
                a(i2, this.f60307f.b());
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final /* synthetic */ List m(int i2) {
        Map<Long, i> k2 = k(i2);
        if (k2 == null || k2.isEmpty()) {
            return null;
        }
        return new ArrayList(k2.values());
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l, com.ss.android.socialbase.downloader.c.c
    public final boolean e(int i2) {
        g gVar;
        f();
        if (!(f60302a == null || (gVar = this.f60303b) == null)) {
            try {
                a(i2, gVar.b());
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l, com.ss.android.socialbase.downloader.c.c
    public final DownloadInfo h(int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 5);
        contentValues.put("isFirstDownload", (Integer) 0);
        a(i2, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l, com.ss.android.socialbase.downloader.c.c
    public final DownloadInfo b(int i2) {
        Cursor cursor;
        MethodCollector.i(14100);
        f();
        if (f60302a != null) {
            try {
                cursor = f60302a.rawQuery(a.a("SELECT * FROM %s WHERE %s = ?", new Object[]{"downloader", "_id"}), new String[]{Integer.toString(i2)});
                try {
                    if (cursor.moveToNext()) {
                        DownloadInfo downloadInfo = new DownloadInfo(cursor);
                        g.a(cursor);
                        MethodCollector.o(14100);
                        return downloadInfo;
                    }
                    g.a(cursor);
                } catch (Throwable unused) {
                    g.a(cursor);
                    MethodCollector.o(14100);
                    return null;
                }
            } catch (Throwable unused2) {
                cursor = null;
                g.a(cursor);
                MethodCollector.o(14100);
                return null;
            }
        }
        MethodCollector.o(14100);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l, com.ss.android.socialbase.downloader.c.c
    public final List<DownloadChunk> c(int i2) {
        MethodCollector.i(14434);
        ArrayList arrayList = new ArrayList();
        f();
        if (f60302a != null) {
            try {
                Cursor rawQuery = f60302a.rawQuery(a.a("SELECT * FROM %s WHERE %s = ?", new Object[]{"downloadChunk", "_id"}), new String[]{Integer.toString(i2)});
                while (rawQuery.moveToNext()) {
                    arrayList.add(new DownloadChunk(rawQuery));
                }
                g.a(rawQuery);
            } catch (Throwable unused) {
                g.a(null);
            }
        }
        MethodCollector.o(14434);
        return arrayList;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l, com.ss.android.socialbase.downloader.c.c
    public final void d(final int i2) {
        f();
        if (f60302a != null && this.f60304c != null) {
            com.ss.android.socialbase.downloader.downloader.c.b(new Runnable() {
                /* class com.ss.android.socialbase.downloader.c.e.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(37244);
                }

                public final void run() {
                    try {
                        e.a(i2, e.this.f60304c.b());
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    public final synchronized void c(DownloadInfo downloadInfo) {
        MethodCollector.i(14582);
        if (downloadInfo == null) {
            MethodCollector.o(14582);
            return;
        }
        try {
            if (!a(downloadInfo.getId())) {
                d(downloadInfo);
                MethodCollector.o(14582);
                return;
            }
            g gVar = this.f60303b;
            if (gVar == null) {
                MethodCollector.o(14582);
                return;
            }
            try {
                b(downloadInfo, gVar.c());
                MethodCollector.o(14582);
            } catch (Throwable unused) {
                MethodCollector.o(14582);
            }
        } catch (Throwable unused2) {
            MethodCollector.o(14582);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final Map<Long, i> k(int i2) {
        Cursor cursor;
        MethodCollector.i(11863);
        f();
        if (f60302a != null) {
            try {
                cursor = f60302a.rawQuery(a.a("SELECT * FROM %s WHERE %s = ?", new Object[]{"segments", "_id"}), new String[]{Integer.toString(i2)});
                try {
                    if (cursor.moveToNext()) {
                        int columnIndex = cursor.getColumnIndex("info");
                        String string = columnIndex >= 0 ? cursor.getString(columnIndex) : null;
                        HashMap hashMap = new HashMap();
                        JSONArray jSONArray = new JSONArray(string);
                        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                            i iVar = new i(jSONArray.getJSONObject(i3));
                            hashMap.put(Long.valueOf(iVar.f60927a), iVar);
                        }
                        g.a(cursor);
                        MethodCollector.o(11863);
                        return hashMap;
                    }
                    g.a(cursor);
                } catch (Throwable unused) {
                    g.a(cursor);
                    MethodCollector.o(11863);
                    return null;
                }
            } catch (Throwable unused2) {
                cursor = null;
                g.a(cursor);
                MethodCollector.o(11863);
                return null;
            }
        }
        MethodCollector.o(11863);
        return null;
    }

    private void a(final int i2, final ContentValues contentValues) {
        f();
        if (f60302a != null) {
            com.ss.android.socialbase.downloader.downloader.c.b(new Runnable() {
                /* class com.ss.android.socialbase.downloader.c.e.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(37243);
                }

                /* JADX WARNING: Can't wrap try/catch for region: R(7:6|7|8|20|19|2|1) */
                /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
                    com.bytedance.frameworks.apm.trace.MethodCollector.o(13909);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
                    return;
                 */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x000b */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r9 = this;
                        r8 = 13909(0x3655, float:1.949E-41)
                        com.bytedance.frameworks.apm.trace.MethodCollector.i(r8)
                        int r7 = r2
                        android.content.ContentValues r6 = r3
                        r2 = 10
                    L_0x000b:
                        android.database.sqlite.SQLiteDatabase r0 = com.ss.android.socialbase.downloader.c.e.f60302a     // Catch:{ all -> 0x0038 }
                        boolean r0 = r0.isDbLockedByCurrentThread()     // Catch:{ all -> 0x0038 }
                        if (r0 == 0) goto L_0x001d
                        int r2 = r2 + -1
                        if (r2 < 0) goto L_0x001d
                        r0 = 5
                        java.lang.Thread.sleep(r0)     // Catch:{ all -> 0x000b }
                        goto L_0x000b
                    L_0x001d:
                        android.database.sqlite.SQLiteDatabase r5 = com.ss.android.socialbase.downloader.c.e.f60302a     // Catch:{ all -> 0x0034 }
                        java.lang.String r4 = "downloader"
                        java.lang.String r3 = "_id = ? "
                        r0 = 1
                        java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0034 }
                        r1 = 0
                        java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0034 }
                        r2[r1] = r0     // Catch:{ all -> 0x0034 }
                        r5.update(r4, r6, r3, r2)     // Catch:{ all -> 0x0034 }
                        com.bytedance.frameworks.apm.trace.MethodCollector.o(r8)
                        return
                    L_0x0034:
                        com.bytedance.frameworks.apm.trace.MethodCollector.o(r8)
                        return
                    L_0x0038:
                        com.bytedance.frameworks.apm.trace.MethodCollector.o(r8)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.c.e.AnonymousClass3.run():void");
                }
            });
        }
    }

    @Override // com.ss.android.socialbase.downloader.c.c
    public final DownloadInfo e(int i2, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) -4);
        contentValues.put("curBytes", Long.valueOf(j2));
        a(i2, contentValues);
        return null;
    }

    private static void b(DownloadInfo downloadInfo, SQLiteStatement sQLiteStatement) {
        MethodCollector.i(14573);
        if (downloadInfo == null || sQLiteStatement == null) {
            MethodCollector.o(14573);
            return;
        }
        try {
            synchronized (sQLiteStatement) {
                try {
                    downloadInfo.bindValue(sQLiteStatement);
                    sQLiteStatement.bindLong(downloadInfo.getBindValueCount() + 1, (long) downloadInfo.getId());
                    sQLiteStatement.execute();
                } finally {
                    MethodCollector.o(14573);
                }
            }
        } catch (Throwable unused) {
            MethodCollector.o(14573);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l, com.ss.android.socialbase.downloader.c.c
    public final DownloadInfo c(int i2, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) -3);
        contentValues.put("curBytes", Long.valueOf(j2));
        contentValues.put("isFirstDownload", (Integer) 0);
        contentValues.put("isFirstSuccess", (Integer) 0);
        a(i2, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l, com.ss.android.socialbase.downloader.c.c
    public final DownloadInfo d(int i2, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) -2);
        contentValues.put("curBytes", Long.valueOf(j2));
        a(i2, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l, com.ss.android.socialbase.downloader.c.c
    public final DownloadInfo b(int i2, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) -1);
        contentValues.put("curBytes", Long.valueOf(j2));
        if (j2 > 0) {
            contentValues.put("isFirstDownload", (Integer) 0);
        }
        a(i2, contentValues);
        return null;
    }

    public static void a(int i2, SQLiteStatement sQLiteStatement) {
        MethodCollector.i(14450);
        if (sQLiteStatement == null) {
            MethodCollector.o(14450);
            return;
        }
        try {
            synchronized (sQLiteStatement) {
                try {
                    sQLiteStatement.bindLong(1, (long) i2);
                    sQLiteStatement.execute();
                } finally {
                    MethodCollector.o(14450);
                }
            }
        } catch (Throwable unused) {
            MethodCollector.o(14450);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l, com.ss.android.socialbase.downloader.c.c
    public final void b(int i2, List<DownloadChunk> list) {
        try {
            d(i2);
            if (list != null) {
                for (DownloadChunk downloadChunk : list) {
                    if (downloadChunk != null) {
                        a(downloadChunk);
                        if (downloadChunk.d()) {
                            for (DownloadChunk downloadChunk2 : downloadChunk.f60826g) {
                                a(downloadChunk2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(DownloadChunk downloadChunk, SQLiteStatement sQLiteStatement) {
        MethodCollector.i(14504);
        if (downloadChunk == null || sQLiteStatement == null) {
            MethodCollector.o(14504);
            return;
        }
        try {
            synchronized (sQLiteStatement) {
                try {
                    downloadChunk.f60828i = 0;
                    sQLiteStatement.clearBindings();
                    int i2 = downloadChunk.f60828i + 1;
                    downloadChunk.f60828i = i2;
                    sQLiteStatement.bindLong(i2, (long) downloadChunk.f60820a);
                    int i3 = downloadChunk.f60828i + 1;
                    downloadChunk.f60828i = i3;
                    sQLiteStatement.bindLong(i3, (long) downloadChunk.f60824e);
                    int i4 = downloadChunk.f60828i + 1;
                    downloadChunk.f60828i = i4;
                    sQLiteStatement.bindLong(i4, downloadChunk.f60821b);
                    int i5 = downloadChunk.f60828i + 1;
                    downloadChunk.f60828i = i5;
                    sQLiteStatement.bindLong(i5, downloadChunk.i());
                    int i6 = downloadChunk.f60828i + 1;
                    downloadChunk.f60828i = i6;
                    sQLiteStatement.bindLong(i6, downloadChunk.f60822c);
                    int i7 = downloadChunk.f60828i + 1;
                    downloadChunk.f60828i = i7;
                    sQLiteStatement.bindLong(i7, downloadChunk.f60823d);
                    int i8 = downloadChunk.f60828i + 1;
                    downloadChunk.f60828i = i8;
                    sQLiteStatement.bindLong(i8, (long) downloadChunk.a());
                    sQLiteStatement.executeInsert();
                } finally {
                    MethodCollector.o(14504);
                }
            }
        } catch (Throwable unused) {
            MethodCollector.o(14504);
        }
    }

    public static void a(DownloadInfo downloadInfo, SQLiteStatement sQLiteStatement) {
        MethodCollector.i(14479);
        if (downloadInfo == null || sQLiteStatement == null) {
            MethodCollector.o(14479);
            return;
        }
        try {
            synchronized (sQLiteStatement) {
                try {
                    downloadInfo.bindValue(sQLiteStatement);
                    sQLiteStatement.executeInsert();
                } finally {
                    MethodCollector.o(14479);
                }
            }
        } catch (Throwable unused) {
            MethodCollector.o(14479);
        }
    }

    public static void a(int i2, int i3, long j2, SQLiteStatement sQLiteStatement) {
        MethodCollector.i(14559);
        try {
            synchronized (sQLiteStatement) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("curOffset", Long.valueOf(j2));
                    f60302a.update("downloadChunk", contentValues, "_id = ? AND chunkIndex = ?", new String[]{Integer.toString(i2), Integer.toString(i3)});
                } finally {
                    MethodCollector.o(14559);
                }
            }
        } catch (Throwable unused) {
            MethodCollector.o(14559);
        }
    }

    public static void a(int i2, int i3, int i4, int i5, SQLiteStatement sQLiteStatement) {
        MethodCollector.i(14549);
        try {
            synchronized (sQLiteStatement) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("chunkIndex", Integer.valueOf(i5));
                    f60302a.update("downloadChunk", contentValues, "_id = ? AND chunkIndex = ? AND hostChunkIndex = ?", new String[]{Integer.toString(i2), Integer.toString(i3), Integer.toString(i4)});
                } finally {
                    MethodCollector.o(14549);
                }
            }
        } catch (Throwable unused) {
            MethodCollector.o(14549);
        }
    }

    public static void a(int i2, int i3, int i4, long j2, SQLiteStatement sQLiteStatement) {
        MethodCollector.i(14568);
        try {
            synchronized (sQLiteStatement) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("curOffset", Long.valueOf(j2));
                    f60302a.update("downloadChunk", contentValues, "_id = ? AND chunkIndex = ? AND hostChunkIndex = ?", new String[]{Integer.toString(i2), Integer.toString(i3), Integer.toString(i4)});
                } finally {
                    MethodCollector.o(14568);
                }
            }
        } catch (Throwable unused) {
            MethodCollector.o(14568);
        }
    }
}
