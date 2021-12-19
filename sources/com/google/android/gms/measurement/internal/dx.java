package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.util.e;

public final class dx extends fb {

    /* renamed from: a  reason: collision with root package name */
    private final dw f51445a = new dw(this, m(), "google_app_measurement_local.db");

    /* renamed from: b  reason: collision with root package name */
    private boolean f51446b;

    static {
        Covode.recordClassIndex(32191);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.fb
    public final boolean u() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.cb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.google.android.gms.measurement.internal.cb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.google.android.gms.measurement.internal.cb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.gms.measurement.internal.cb
    public final /* bridge */ /* synthetic */ a d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.cb
    public final /* bridge */ /* synthetic */ gk e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.cb
    public final /* bridge */ /* synthetic */ du f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.cb
    public final /* bridge */ /* synthetic */ hv g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.cb
    public final /* bridge */ /* synthetic */ hq h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.cb
    public final /* bridge */ /* synthetic */ dx i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.cb
    public final /* bridge */ /* synthetic */ iz j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ j k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ e l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ dz n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ jz o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ ex p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ eb q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ em r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ km s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ kl t() {
        return super.t();
    }

    private final boolean A() {
        return m().getDatabasePath("google_app_measurement_local.db").exists();
    }

    private final SQLiteDatabase z() {
        if (this.f51446b) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f51445a.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f51446b = true;
        return null;
    }

    public final void w() {
        MethodCollector.i(7797);
        c();
        try {
            int delete = z().delete("messages", null, null) + 0;
            if (delete > 0) {
                q().f51476k.a("Reset local analytics data. records", Integer.valueOf(delete));
            }
            MethodCollector.o(7797);
        } catch (SQLiteException e2) {
            q().f51468c.a("Error resetting local analytics data. error", e2);
            MethodCollector.o(7797);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0090 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean y() {
        /*
        // Method dump skipped, instructions count: 169
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.dx.y():boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:55|56|57) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:37|38|39|156) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0194, code lost:
        if (r17.inTransaction() != false) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0196, code lost:
        r17.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01a6, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01ab, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01d5, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01da, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01f3, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01f8, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01f9, code lost:
        r15 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01fa, code lost:
        r8 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0200, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0205, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        q().f51468c.a("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b2, code lost:
        r11.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        q().f51468c.a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00da, code lost:
        r11.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        q().f51468c.a("Failed to load conditional user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0108, code lost:
        r11.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0130, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0131, code lost:
        r11.recycle();
        com.bytedance.frameworks.apm.trace.MethodCollector.o(7949);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0137, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0138, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0139, code lost:
        r11.recycle();
        com.bytedance.frameworks.apm.trace.MethodCollector.o(7949);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x013f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0140, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0141, code lost:
        r11.recycle();
        com.bytedance.frameworks.apm.trace.MethodCollector.o(7949);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0147, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0179, code lost:
        r10 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x017c, code lost:
        r8 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0182, code lost:
        r10 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00a7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00cf */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00fd */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01f3 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:14:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01dd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01dd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01dd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), SYNTHETIC, Splitter:B:14:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0190 A[SYNTHETIC, Splitter:B:98:0x0190] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable> x() {
        /*
        // Method dump skipped, instructions count: 539
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.dx.x():java.util.List");
    }

    dx(ff ffVar) {
        super(ffVar);
    }

    private static long a(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.i(7967);
        Cursor cursor = null;
        try {
            Cursor query = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (query.moveToFirst()) {
                long j2 = query.getLong(0);
                query.close();
                MethodCollector.o(7967);
                return j2;
            }
            query.close();
            MethodCollector.o(7967);
            return -1;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.o(7967);
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ae A[SYNTHETIC, Splitter:B:35:0x00ae] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x011c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r19, byte[] r20) {
        /*
        // Method dump skipped, instructions count: 323
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.dx.a(int, byte[]):boolean");
    }
}
