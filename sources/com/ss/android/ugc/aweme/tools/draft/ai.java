package com.ss.android.ugc.aweme.tools.draft;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.p;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.df.e;
import com.ss.android.ugc.aweme.df.f;
import com.ss.android.ugc.aweme.draft.k;
import com.ss.android.ugc.aweme.draft.model.DraftDBSaveException;
import com.ss.android.ugc.aweme.draft.model.DraftDBSaveResult;
import com.ss.android.ugc.aweme.draft.model.a;
import com.ss.android.ugc.aweme.draft.model.b;
import com.ss.android.ugc.aweme.effect.EffectListModel;
import com.ss.android.ugc.aweme.experiment.cf;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.DraftUpdateServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.tools.draft.b.d;
import com.ss.android.ugc.tools.utils.q;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ai {

    /* renamed from: b  reason: collision with root package name */
    private static volatile ai f139365b;

    /* renamed from: a  reason: collision with root package name */
    public SQLiteDatabase f139366a = d.a().getReadableDatabase();

    /* renamed from: c  reason: collision with root package name */
    private SQLiteDatabase f139367c = d.a().getWritableDatabase();

    /* renamed from: d  reason: collision with root package name */
    private ReentrantReadWriteLock f139368d = new ReentrantReadWriteLock();

    static {
        Covode.recordClassIndex(91109);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0117, code lost:
        if (0 == 0) goto L_0x011c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.ugc.aweme.tools.draft.i.a> a(java.util.List<java.lang.String> r9) {
        /*
        // Method dump skipped, instructions count: 298
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.ai.a(java.util.List):java.util.List");
    }

    public final List<Integer> a(boolean z) {
        MethodCollector.i(174);
        ArrayList arrayList = new ArrayList();
        String str = "select count(*) as user_draft_count from local_draft";
        if (!z) {
            str = str + " where user_id != " + f();
        }
        try {
            Cursor rawQuery = this.f139366a.rawQuery(str + " group by user_id", null);
            if (rawQuery != null) {
                try {
                    if (rawQuery.getCount() > 0) {
                        while (rawQuery.moveToNext()) {
                            arrayList.add(Integer.valueOf(rawQuery.getInt(rawQuery.getColumnIndex("user_draft_count"))));
                        }
                    }
                } catch (Throwable th) {
                    try {
                        rawQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    MethodCollector.o(174);
                    throw th;
                }
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
        } catch (Exception e2) {
            q.a("aweme-draft-monitor", e2);
        }
        MethodCollector.o(174);
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0088, code lost:
        if (0 == 0) goto L_0x008d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0063 A[Catch:{ Exception -> 0x0082, all -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0048 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.ugc.aweme.draft.model.c> a(boolean r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 166
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.ai.a(boolean, java.lang.String):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        if (0 == 0) goto L_0x008f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0063 A[Catch:{ Exception -> 0x0084, all -> 0x009b }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0048 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.ugc.aweme.draft.model.c> a(boolean r9, java.util.List<java.lang.String> r10) {
        /*
        // Method dump skipped, instructions count: 168
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.ai.a(boolean, java.util.List):java.util.List");
    }

    private static String f() {
        return g.a().A().c();
    }

    private boolean g() {
        this.f139368d.readLock().lock();
        return true;
    }

    private ai() {
    }

    public static ai a() {
        MethodCollector.i(2804);
        if (f139365b == null) {
            synchronized (ai.class) {
                try {
                    if (f139365b == null) {
                        f139365b = new ai();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2804);
                    throw th;
                }
            }
        }
        ai aiVar = f139365b;
        MethodCollector.o(2804);
        return aiVar;
    }

    private static String e() {
        String str;
        if (!bg.a() || !cf.a()) {
            str = "time";
        } else {
            str = "save_time";
        }
        return "local_draft' where user_id = '" + f() + "' or user_id is null order by " + str + " asc";
    }

    public final int d() {
        MethodCollector.i(3609);
        int i2 = 0;
        try {
            Cursor rawQuery = this.f139366a.rawQuery("select * from 'local_draft' order by 'time' desc", null);
            if (rawQuery != null) {
                try {
                    i2 = rawQuery.getCount();
                    rawQuery.close();
                } catch (Throwable th) {
                    try {
                        rawQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    MethodCollector.o(3609);
                    throw th;
                }
            }
        } catch (Exception e2) {
            q.a("aweme-draft-monitor", e2);
        }
        MethodCollector.o(3609);
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (0 == 0) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b() {
        /*
            r6 = this;
            r5 = 3530(0xdca, float:4.947E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r5)
            r4 = 0
            r3 = 0
            android.database.sqlite.SQLiteDatabase r2 = r6.f139366a     // Catch:{ Exception -> 0x0028 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = "select * from '"
            r1.<init>(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = e()     // Catch:{ Exception -> 0x0028 }
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0028 }
            android.database.Cursor r3 = r2.rawQuery(r0, r3)     // Catch:{ Exception -> 0x0028 }
            if (r3 != 0) goto L_0x0023
            goto L_0x0033
        L_0x0023:
            int r4 = r3.getCount()     // Catch:{ Exception -> 0x0028 }
            goto L_0x0030
        L_0x0028:
            r1 = move-exception
            java.lang.String r0 = "aweme-draft-monitor"
            com.ss.android.ugc.tools.utils.q.a(r0, r1)     // Catch:{ all -> 0x0037 }
            if (r3 == 0) goto L_0x0033
        L_0x0030:
            r3.close()
        L_0x0033:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r4
        L_0x0037:
            r0 = move-exception
            if (r3 == 0) goto L_0x003d
            r3.close()
        L_0x003d:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.ai.b():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (0 == 0) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.ugc.aweme.draft.model.c> c() {
        /*
            r5 = this;
            r4 = 3606(0xe16, float:5.053E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.f139366a     // Catch:{ Exception -> 0x002c }
            java.lang.String r0 = "select * from 'local_draft' order by 'time' desc"
            android.database.Cursor r2 = r1.rawQuery(r0, r2)     // Catch:{ Exception -> 0x002c }
            if (r2 == 0) goto L_0x0029
            int r0 = r2.getCount()     // Catch:{ Exception -> 0x002c }
            if (r0 <= 0) goto L_0x0029
        L_0x001b:
            boolean r0 = r2.moveToNext()     // Catch:{ Exception -> 0x002c }
            if (r0 == 0) goto L_0x0029
            com.ss.android.ugc.aweme.draft.model.c r0 = a(r2)     // Catch:{ Exception -> 0x002c }
            r3.add(r0)     // Catch:{ Exception -> 0x002c }
            goto L_0x001b
        L_0x0029:
            if (r2 == 0) goto L_0x0037
            goto L_0x0034
        L_0x002c:
            r1 = move-exception
            java.lang.String r0 = "aweme-draft-monitor"
            com.ss.android.ugc.tools.utils.q.a(r0, r1)     // Catch:{ all -> 0x003b }
            if (r2 == 0) goto L_0x0037
        L_0x0034:
            r2.close()
        L_0x0037:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r3
        L_0x003b:
            r0 = move-exception
            if (r2 == 0) goto L_0x0041
            r2.close()
        L_0x0041:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.ai.c():java.util.List");
    }

    private void b(boolean z) {
        try {
            this.f139368d.readLock().unlock();
        } catch (Throwable th) {
            f.a(th, "crash happened in DraftDBHelper.unlock()");
        }
    }

    public static EffectListModel d(String str) {
        try {
            return (EffectListModel) g.a().G().a(str, EffectListModel.class);
        } catch (Exception e2) {
            q.a("aweme-draft-monitor", e2);
            return null;
        }
    }

    public static a b(String str) {
        try {
            return (a) g.a().G().a(str, a.class);
        } catch (p e2) {
            e.a(str);
            q.a("aweme-draft-monitor", e2);
            return new a();
        } catch (Exception e3) {
            e.a(str);
            q.a("aweme-draft-monitor", e3);
            return new a();
        }
    }

    public static c c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return DraftUpdateServiceImpl.createDraftUpdateServicebyMonsterPlugin(false).transformNewAVMusic(str);
        } catch (p e2) {
            e.a(str);
            q.a("aweme-draft-monitor", e2);
            return new c();
        } catch (Exception e3) {
            e.a(str);
            q.a("aweme-draft-monitor", e3);
            return new c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (0 == 0) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.ugc.aweme.draft.model.c> a(com.ss.android.ugc.aweme.draft.m r7) {
        /*
            r6 = this;
            r5 = 3528(0xdc8, float:4.944E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r5)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r2 = r6.f139366a     // Catch:{ Exception -> 0x0049 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0049 }
            java.lang.String r0 = "select * from '"
            r1.<init>(r0)     // Catch:{ Exception -> 0x0049 }
            java.lang.String r0 = e()     // Catch:{ Exception -> 0x0049 }
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ Exception -> 0x0049 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0049 }
            android.database.Cursor r3 = r2.rawQuery(r0, r3)     // Catch:{ Exception -> 0x0049 }
            if (r3 == 0) goto L_0x0046
            int r0 = r3.getCount()     // Catch:{ Exception -> 0x0049 }
            if (r0 <= 0) goto L_0x0046
        L_0x002c:
            boolean r0 = r3.moveToNext()     // Catch:{ Exception -> 0x0049 }
            if (r0 == 0) goto L_0x0046
            com.ss.android.ugc.aweme.draft.model.c r1 = a(r3)     // Catch:{ Exception -> 0x0049 }
            if (r7 == 0) goto L_0x0042
            boolean r0 = r7.a(r1)     // Catch:{ Exception -> 0x0049 }
            if (r0 == 0) goto L_0x002c
            r4.add(r1)     // Catch:{ Exception -> 0x0049 }
            goto L_0x002c
        L_0x0042:
            r4.add(r1)     // Catch:{ Exception -> 0x0049 }
            goto L_0x002c
        L_0x0046:
            if (r3 == 0) goto L_0x0054
            goto L_0x0051
        L_0x0049:
            r1 = move-exception
            java.lang.String r0 = "aweme-draft-monitor"
            com.ss.android.ugc.tools.utils.q.a(r0, r1)     // Catch:{ all -> 0x0058 }
            if (r3 == 0) goto L_0x0054
        L_0x0051:
            r3.close()
        L_0x0054:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r4
        L_0x0058:
            r0 = move-exception
            if (r3 == 0) goto L_0x005e
            r3.close()
        L_0x005e:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.ai.a(com.ss.android.ugc.aweme.draft.m):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r2 != null) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.draft.model.c e(java.lang.String r6) {
        /*
            r5 = this;
            r4 = 3614(0xe1e, float:5.064E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            r3 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            java.lang.String r0 = "select * from local_draft where video_path = '"
            r1.<init>(r0)     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            java.lang.StringBuilder r1 = r1.append(r6)     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            java.lang.String r0 = "'"
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            android.database.sqlite.SQLiteDatabase r0 = r5.f139366a     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            android.database.Cursor r2 = r0.rawQuery(r1, r3)     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            if (r2 == 0) goto L_0x0047
            int r0 = r2.getCount()     // Catch:{ Exception -> 0x0037 }
            if (r0 <= 0) goto L_0x0044
            r2.moveToNext()     // Catch:{ Exception -> 0x0037 }
            com.ss.android.ugc.aweme.draft.model.c r0 = a(r2)     // Catch:{ Exception -> 0x0037 }
            r2.close()
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r0
        L_0x0037:
            r1 = move-exception
            goto L_0x003d
        L_0x0039:
            r0 = move-exception
            goto L_0x0051
        L_0x003b:
            r1 = move-exception
            r2 = r3
        L_0x003d:
            java.lang.String r0 = "aweme-draft-monitor"
            com.ss.android.ugc.tools.utils.q.a(r0, r1)     // Catch:{ all -> 0x004b }
            if (r2 == 0) goto L_0x0047
        L_0x0044:
            r2.close()
        L_0x0047:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r3
        L_0x004b:
            r0 = move-exception
            if (r2 == 0) goto L_0x0051
            r2.close()
        L_0x0051:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.ai.e(java.lang.String):com.ss.android.ugc.aweme.draft.model.c");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        if (r2 != null) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.draft.model.c f(java.lang.String r6) {
        /*
            r5 = this;
            r4 = 3619(0xe23, float:5.071E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            r3 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            java.lang.String r0 = "select * from local_draft where user_id = '"
            r1.<init>(r0)     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            java.lang.String r0 = f()     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            java.lang.StringBuilder r1 = r1.append(r0)     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            java.lang.String r0 = "' and video_path = '"
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            java.lang.StringBuilder r1 = r0.append(r6)     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            java.lang.String r0 = "'"
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            android.database.sqlite.SQLiteDatabase r0 = r5.f139366a     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            android.database.Cursor r2 = r0.rawQuery(r1, r3)     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            if (r2 == 0) goto L_0x0055
            int r0 = r2.getCount()     // Catch:{ Exception -> 0x0045 }
            if (r0 <= 0) goto L_0x0052
            r2.moveToNext()     // Catch:{ Exception -> 0x0045 }
            com.ss.android.ugc.aweme.draft.model.c r0 = a(r2)     // Catch:{ Exception -> 0x0045 }
            r2.close()
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r0
        L_0x0045:
            r1 = move-exception
            goto L_0x004b
        L_0x0047:
            r0 = move-exception
            goto L_0x005f
        L_0x0049:
            r1 = move-exception
            r2 = r3
        L_0x004b:
            java.lang.String r0 = "aweme-draft-monitor"
            com.ss.android.ugc.tools.utils.q.a(r0, r1)     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0055
        L_0x0052:
            r2.close()
        L_0x0055:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r3
        L_0x0059:
            r0 = move-exception
            if (r2 == 0) goto L_0x005f
            r2.close()
        L_0x005f:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.ai.f(java.lang.String):com.ss.android.ugc.aweme.draft.model.c");
    }

    public final synchronized void b(com.ss.android.ugc.aweme.draft.model.c cVar) {
        MethodCollector.i(3159);
        b(cVar, "publish_auto_trigger");
        MethodCollector.o(3159);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010b, code lost:
        if (0 == 0) goto L_0x0110;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.ugc.aweme.tools.draft.i.a> a(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 286
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.ai.a(java.lang.String):java.util.List");
    }

    public static com.ss.android.ugc.aweme.draft.model.c a(Cursor cursor) {
        com.ss.android.ugc.aweme.draft.model.c cVar = new com.ss.android.ugc.aweme.draft.model.c();
        String string = cursor.getString(cursor.getColumnIndex("user_id"));
        if (TextUtils.isEmpty(string)) {
            string = f();
        }
        cVar.f83184e = cursor.getString(cursor.getColumnIndex("video_path"));
        cVar.H = string;
        cVar.f83181b = b(cursor.getString(cursor.getColumnIndex("aweme")));
        cVar.f83185f = c(cursor.getString(cursor.getColumnIndex("music")));
        cVar.f83187h = cursor.getString(cursor.getColumnIndex("music_path"));
        q.d("getDraft() called, musicModel:" + cVar.f83185f + " ,musicPath:" + cVar.f83187h);
        cVar.f83189j = cursor.getInt(cursor.getColumnIndex("video_volume"));
        cVar.f83190k = cursor.getInt(cursor.getColumnIndex("music_volume"));
        com.ss.android.ugc.aweme.draft.model.d.a(cVar, cursor.getInt(cursor.getColumnIndex("filter")));
        cVar.n = cursor.getInt(cursor.getColumnIndex("music_start"));
        cVar.f83188i = cursor.getString(cursor.getColumnIndex("voice_path"));
        cVar.I = cursor.getLong(cursor.getColumnIndex("time"));
        cVar.o = cursor.getInt(cursor.getColumnIndex("effect"));
        cVar.p = cursor.getInt(cursor.getColumnIndex("origin"));
        cVar.G = cursor.getInt(cursor.getColumnIndex("face_beauty"));
        cVar.K = cursor.getString(cursor.getColumnIndex("segment_video"));
        cVar.L = cursor.getInt(cursor.getColumnIndex("hard_encode"));
        cVar.M = cursor.getInt(cursor.getColumnIndex("special_points"));
        cVar.N = cursor.getString(cursor.getColumnIndex("sticker_path"));
        cVar.O = cursor.getString(cursor.getColumnIndex("sticker_id"));
        cVar.v = cursor.getInt(cursor.getColumnIndex("camera_poi"));
        cVar.u = cursor.getString(cursor.getColumnIndex("filter_label"));
        cVar.E = d(cursor.getString(cursor.getColumnIndex("effect_list")));
        cVar.w = cursor.getInt(cursor.getColumnIndex("beauty_label"));
        cVar.q = cursor.getString(cursor.getColumnIndex("reverse_path"));
        cVar.r = cursor.getString(cursor.getColumnIndex("video_speed"));
        cVar.D = cursor.getInt(cursor.getColumnIndex("is_private"));
        cVar.F = (long) cursor.getInt(cursor.getColumnIndex("max_duration"));
        cVar.s = (UrlModel) g.a().G().a(cursor.getString(cursor.getColumnIndex("audio_track")), UrlModel.class);
        PhotoMovieContext photoMovieContext = (PhotoMovieContext) g.a().G().a(cursor.getString(cursor.getColumnIndex("photo_movie")), PhotoMovieContext.class);
        if (photoMovieContext != null) {
            cVar.f83182c = photoMovieContext;
        }
        cVar.Q = cursor.getString(cursor.getColumnIndex("music_effect_segments"));
        cVar.R = cursor.getInt(cursor.getColumnIndex("new_version"));
        cVar.S = cursor.getFloat(cursor.getColumnIndex("custom_cover_start"));
        cVar.T = cursor.getString(cursor.getColumnIndex("duet_from"));
        cVar.U = cursor.getString(cursor.getColumnIndex("sync_platforms"));
        try {
            cVar.a((b) g.a().G().a(cursor.getString(cursor.getColumnIndex("draft_extras")), b.class));
        } catch (Exception e2) {
            q.a("aweme-draft-monitor", e2);
        }
        if (cVar.W == null || TextUtils.isEmpty(cVar.W.S)) {
            String string2 = cursor.getString(cursor.getColumnIndex("video_path"));
            cVar.f83186g = string2;
            if (cVar.W != null) {
                cVar.W.S = string2;
            }
        }
        cVar.J = cursor.getLong(cursor.getColumnIndex("save_time"));
        return cVar;
    }

    public final DraftDBSaveResult a(com.ss.android.ugc.aweme.draft.model.c cVar) {
        String b2;
        String b3;
        if (cVar.W != null && TextUtils.isEmpty(cVar.W.ac)) {
            cVar.W.ac = com.ss.android.ugc.aweme.filter.c.b(g.a().r().c().a(cVar.f83192m));
        }
        ContentValues contentValues = new ContentValues();
        String str = "";
        if (cVar.f83181b == null) {
            b2 = str;
        } else {
            b2 = g.a().G().b(cVar.f83181b);
        }
        contentValues.put("aweme", b2);
        contentValues.put("video_path", cVar.r());
        contentValues.put("music_path", cVar.f83187h);
        contentValues.put("video_volume", Integer.valueOf(cVar.f83189j));
        contentValues.put("music_volume", Integer.valueOf(cVar.f83190k));
        if (cVar.f83185f == null) {
            b3 = str;
        } else {
            b3 = g.a().G().b(cVar.f83185f);
        }
        contentValues.put("music", b3);
        contentValues.put("filter", Integer.valueOf(cVar.f83192m));
        contentValues.put("music_start", Integer.valueOf(cVar.n));
        contentValues.put("time", Long.valueOf(cVar.I));
        contentValues.put("effect", Integer.valueOf(cVar.o));
        contentValues.put("origin", Integer.valueOf(cVar.p));
        contentValues.put("face_beauty", Integer.valueOf(cVar.G));
        contentValues.put("user_id", cVar.H);
        contentValues.put("segment_video", cVar.K);
        contentValues.put("hard_encode", Integer.valueOf(cVar.L));
        contentValues.put("special_points", Integer.valueOf(cVar.M));
        contentValues.put("sticker_path", cVar.N);
        contentValues.put("sticker_id", cVar.O);
        contentValues.put("camera_poi", Integer.valueOf(cVar.v));
        contentValues.put("filter_label", cVar.u);
        contentValues.put("beauty_label", Integer.valueOf(cVar.w));
        contentValues.put("video_speed", cVar.r);
        contentValues.put("music_effect_segments", cVar.Q);
        contentValues.put("is_private", Integer.valueOf(cVar.D));
        contentValues.put("max_duration", Long.valueOf(cVar.F));
        contentValues.put("audio_track", g.a().G().b(cVar.s));
        if (cVar.f83182c != null) {
            str = g.a().G().b(cVar.f83182c);
        }
        contentValues.put("photo_movie", str);
        contentValues.put("effect_list", com.ss.android.ugc.aweme.draft.model.d.c(cVar));
        contentValues.put("music_id", com.ss.android.ugc.aweme.draft.model.d.b(cVar));
        contentValues.put("new_version", Integer.valueOf(cVar.R));
        contentValues.put("custom_cover_start", Float.valueOf(cVar.S));
        contentValues.put("duet_from", cVar.T);
        contentValues.put("sync_platforms", cVar.U);
        contentValues.put("draft_extras", g.a().G().b(cVar.W));
        com.ss.android.ugc.aweme.draft.model.c e2 = e(cVar.r());
        long j2 = cVar.I;
        if (!(e2 == null || e2.J == 0)) {
            j2 = e2.J;
        }
        cVar.J = j2;
        contentValues.put("save_time", Long.valueOf(j2));
        contentValues.put("draft_view_info", g.a().G().b(com.ss.android.ugc.aweme.tools.draft.d.g.a(cVar)));
        DraftDBSaveResult draftDBSaveResult = new DraftDBSaveResult();
        try {
            q.d("start draft save, musicModel: " + cVar.f83185f + ", musicPath:" + cVar.f83187h);
            long replaceOrThrow = this.f139367c.replaceOrThrow("local_draft", null, contentValues);
            q.d("draft save done, rowId: ".concat(String.valueOf(replaceOrThrow)));
            if (replaceOrThrow < 0) {
                return new DraftDBSaveResult(new DraftDBSaveException(-1000, new RuntimeException("rowId : ".concat(String.valueOf(replaceOrThrow)))));
            }
            return draftDBSaveResult;
        } catch (Exception e3) {
            return new DraftDBSaveResult(new DraftDBSaveException(-1001, e3));
        }
    }

    public final synchronized int a(com.ss.android.ugc.aweme.draft.model.c cVar, String str) {
        String message;
        MethodCollector.i(3134);
        String r = cVar.r();
        k.a("update draft db creation id = " + cVar.f() + "  primaryKey = " + r);
        if (TextUtils.isEmpty(r)) {
            g.a().c().a().a(1, "primary key is null", cVar);
            MethodCollector.o(3134);
            return 0;
        }
        ContentValues contentValues = new ContentValues();
        try {
            contentValues.put("draft_extras", g.a().G().b(cVar.W));
            this.f139367c.update("local_draft", contentValues, "video_path = ?", new String[]{r});
            g.a().c().a().a(0, str, cVar);
        } catch (Exception e2) {
            k.a("update draft db failed creation id = " + cVar.f());
            if (e2.getMessage() == null) {
                message = e2.toString();
            } else {
                message = e2.getMessage();
            }
            g.a().c().a().a(1, message, cVar);
        }
        MethodCollector.o(3134);
        return 0;
    }

    public final synchronized void b(com.ss.android.ugc.aweme.draft.model.c cVar, String str) {
        MethodCollector.i(3519);
        if (cVar == null || TextUtils.isEmpty(cVar.r()) || TextUtils.isEmpty(str)) {
            MethodCollector.o(3519);
            return;
        }
        int i2 = -1;
        try {
            this.f139367c.beginTransaction();
            i2 = this.f139367c.delete("local_draft", "video_path = ?", new String[]{cVar.r()});
            this.f139367c.setTransactionSuccessful();
            this.f139367c.endTransaction();
        } catch (Exception e2) {
            g.a();
            e2.printStackTrace();
        }
        g.a().c().a().a(str, i2, cVar);
        MethodCollector.o(3519);
    }
}
