package androidx.i.a.a;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.i.a.c;
import com.bytedance.covode.number.Covode;

final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final a f3200a;

    static {
        Covode.recordClassIndex(1144);
    }

    @Override // androidx.i.a.c
    public final androidx.i.a.b a() {
        return this.f3200a.a();
    }

    static class a extends SQLiteOpenHelper {

        /* renamed from: a  reason: collision with root package name */
        final a[] f3201a;

        /* renamed from: b  reason: collision with root package name */
        final c.a f3202b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f3203c;

        static {
            Covode.recordClassIndex(1145);
        }

        @Override // java.lang.AutoCloseable
        public final synchronized void close() {
            super.close();
            this.f3201a[0] = null;
        }

        /* access modifiers changed from: package-private */
        public final synchronized androidx.i.a.b a() {
            this.f3203c = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.f3203c) {
                close();
                return a();
            }
            return a(writableDatabase);
        }

        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            a(sQLiteDatabase);
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f3202b.a(a(sQLiteDatabase));
        }

        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f3203c) {
                this.f3202b.b(a(sQLiteDatabase));
            }
        }

        private a a(SQLiteDatabase sQLiteDatabase) {
            if (this.f3201a[0] == null) {
                this.f3201a[0] = new a(sQLiteDatabase);
            }
            return this.f3201a[0];
        }

        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            this.f3203c = true;
            this.f3202b.b(a(sQLiteDatabase), i2, i3);
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            this.f3203c = true;
            this.f3202b.a(a(sQLiteDatabase), i2, i3);
        }

        a(Context context, String str, final a[] aVarArr, final c.a aVar) {
            super(context, str, null, aVar.f3208a, new DatabaseErrorHandler() {
                /* class androidx.i.a.a.b.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(1146);
                }

                /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
                    r2 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
                    if (r0 != null) goto L_0x0024;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
                    r1 = r0.iterator();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
                    if (r1.hasNext() != false) goto L_0x002e;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
                    androidx.i.a.c.a.a((java.lang.String) r1.next().second);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
                    androidx.i.a.c.a.a(r1.f());
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
                    throw r2;
                 */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001d */
                /* JADX WARNING: Removed duplicated region for block: B:11:0x0021 A[ExcHandler: all (r2v0 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
                  PHI: (r0v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r0v2 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v10 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v10 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:7:0x0019, B:9:0x001d, B:10:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:7:0x0019] */
                /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
                /* JADX WARNING: Removed duplicated region for block: B:26:0x005f  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onCorruption(android.database.sqlite.SQLiteDatabase r4) {
                    /*
                    // Method dump skipped, instructions count: 103
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.i.a.a.b.a.AnonymousClass1.onCorruption(android.database.sqlite.SQLiteDatabase):void");
                }
            });
            this.f3202b = aVar;
            this.f3201a = aVarArr;
        }
    }

    @Override // androidx.i.a.c
    public final void a(boolean z) {
        this.f3200a.setWriteAheadLoggingEnabled(z);
    }

    b(Context context, String str, c.a aVar) {
        this.f3200a = new a(context, str, new a[1], aVar);
    }
}
