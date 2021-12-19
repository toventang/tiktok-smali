package com.bytedance.im.core.internal.a.c.a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.internal.a.a.a;
import com.bytedance.im.core.internal.a.c.b.b.b;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.i;
import com.tencent.wcdb.h;
import com.tencent.wcdb.repair.RepairKit;
import java.io.File;

public final class d extends i implements a {

    /* renamed from: a  reason: collision with root package name */
    public static int f38202a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f38203b;

    /* renamed from: g  reason: collision with root package name */
    private static final b f38204g = new b() {
        /* class com.bytedance.im.core.internal.a.c.a.d.AnonymousClass1 */

        static {
            Covode.recordClassIndex(22881);
        }

        @Override // com.bytedance.im.core.internal.a.c.a.b, com.tencent.wcdb.g
        public final void a(SQLiteDatabase sQLiteDatabase) {
            if (!d.f38203b) {
                d.f38203b = true;
                boolean d2 = d.d(sQLiteDatabase);
                f.b("imsdk", "LocalWcdbOpenHelper onCorruption, tryRepair result:".concat(String.valueOf(d2)), (Throwable) null);
                com.bytedance.im.core.c.d dVar = new com.bytedance.im.core.c.d();
                dVar.f37623a = "core";
                dVar.f37624b = "db_repair";
                dVar.a("repair_result", String.valueOf(d2)).a("repair_count", Integer.valueOf(Math.min(d.f38202a, 1000))).a();
                if (!d2) {
                    super.a(sQLiteDatabase);
                    com.bytedance.im.core.a.d.a().a(false);
                }
                d.f38203b = false;
            }
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private b f38205d = new b();

    /* renamed from: e  reason: collision with root package name */
    private String f38206e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f38207f = false;

    static {
        Covode.recordClassIndex(22880);
    }

    @Override // com.bytedance.im.core.internal.a.c.a.a
    public final com.bytedance.im.core.internal.a.c.b a() {
        b bVar = this.f38205d;
        bVar.f38212a = b();
        return bVar;
    }

    @Override // com.tencent.wcdb.database.i, com.bytedance.im.core.internal.a.c.a.a
    public final void close() {
        f.b("imsdk", "LocalWcdbOpenHelper close", (Throwable) null);
        super.close();
    }

    private static void e(SQLiteDatabase sQLiteDatabase) {
        if (com.bytedance.im.core.a.d.a().b().ah) {
            sQLiteDatabase.b(false);
        } else {
            sQLiteDatabase.b(true);
        }
    }

    @Override // com.tencent.wcdb.database.i
    public final void b(SQLiteDatabase sQLiteDatabase) {
        f.b("imsdk", "LocalWcdbOpenHelper onConfigure", (Throwable) null);
        if (com.bytedance.im.core.a.d.a().b().ah) {
            sQLiteDatabase.o();
        }
    }

    @Override // com.tencent.wcdb.database.i
    public final void c(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.i(12582);
        f.b("imsdk", "LocalWcdbOpenHelper onOpen", (Throwable) null);
        RepairKit.nativeSaveMaster(sQLiteDatabase.a("backupMaster", true), sQLiteDatabase.n() + "-mbak", null);
        sQLiteDatabase.b().c();
        MethodCollector.o(12582);
    }

    private static boolean a(File file) {
        MethodCollector.i(12825);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(12825);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(12825);
        return delete;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b3, code lost:
        if (r4 == null) goto L_0x01b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f7 A[Catch:{ SQLiteException -> 0x019d, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011d A[Catch:{ SQLiteException -> 0x019d, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean d(com.tencent.wcdb.database.SQLiteDatabase r20) {
        /*
        // Method dump skipped, instructions count: 447
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.a.c.a.d.d(com.tencent.wcdb.database.SQLiteDatabase):boolean");
    }

    @Override // com.tencent.wcdb.database.i
    public final void a(SQLiteDatabase sQLiteDatabase) {
        f.b("imsdk", "LocalWcdbOpenHelper onCreate, mEncrypted:" + this.f38207f + ", mOldDatabaseName:" + this.f38206e, (Throwable) null);
        this.f38205d.f38212a = sQLiteDatabase;
        if (!this.f38207f || TextUtils.isEmpty(this.f38206e)) {
            a.a();
            a.a(this.f38205d);
            return;
        }
        File databasePath = com.bytedance.im.core.a.d.a().f37561a.getDatabasePath(this.f38206e);
        if (databasePath.exists()) {
            a(this.f38205d, databasePath);
            return;
        }
        a.a();
        a.a(this.f38205d);
    }

    public d(Context context, String str) {
        super(context, str, null, f38204g);
        f.b("imsdk", "LocalWcdbOpenHelper constructor, has not password", (Throwable) null);
        this.f38206e = str;
    }

    private static boolean a(b bVar, File file) {
        try {
            f.b("imsdk", "LocalWcdbOpenHelper migrate start", (Throwable) null);
            SQLiteDatabase sQLiteDatabase = bVar.f38212a;
            sQLiteDatabase.g();
            sQLiteDatabase.b(com.a.a("ATTACH DATABASE %s AS old KEY '';", new Object[]{h.a(file.getPath())}));
            e(sQLiteDatabase);
            h.b(sQLiteDatabase, "SELECT sqlcipher_export('main', 'old');");
            sQLiteDatabase.h();
            sQLiteDatabase.g();
            int a2 = (int) h.a(sQLiteDatabase, "PRAGMA old.user_version;");
            sQLiteDatabase.b("DETACH DATABASE old;");
            a(file);
            e(sQLiteDatabase);
            f.b("imsdk", "LocalWcdbOpenHelper migrate end, oldVersion:" + a2 + ", newVersion:38", (Throwable) null);
            if (a2 > 38) {
                a.a().a(a2, 38);
            } else if (a2 < 38) {
                a.a();
                a.a(bVar, a2, 38);
            }
            new com.bytedance.im.core.c.i().a("imsdk_db_migrate_encrypted_result").a("imsdk_result", 1).b();
            return true;
        } catch (Exception e2) {
            new com.bytedance.im.core.c.i().a("imsdk_db_migrate_encrypted_result").a("imsdk_result", 0).a("error_msg", Log.getStackTraceString(e2)).b();
            com.bytedance.im.core.a.d.a().a(true);
            e2.printStackTrace();
            return false;
        }
    }

    @Override // com.tencent.wcdb.database.i
    public final void a(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        f.b("imsdk", "LocalWcdbOpenHelper onUpgrade", (Throwable) null);
        a.a();
        b bVar = this.f38205d;
        bVar.f38212a = sQLiteDatabase;
        a.a(bVar, i2, i3);
    }

    public d(Context context, String str, byte[] bArr) {
        super(context, "encrypted_".concat(String.valueOf(str)), bArr, f38204g);
        f.b("imsdk", "LocalWcdbOpenHelper constructor, has password", (Throwable) null);
        this.f38206e = str;
        this.f38207f = true;
    }

    @Override // com.tencent.wcdb.database.i
    public final void b(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        f.b("imsdk", "LocalWcdbOpenHelper onDowngrade", (Throwable) null);
        a a2 = a.a();
        this.f38205d.f38212a = sQLiteDatabase;
        a2.a(i2, i3);
    }
}
