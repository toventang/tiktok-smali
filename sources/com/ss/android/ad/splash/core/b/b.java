package com.ss.android.ad.splash.core.b;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class b {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f58342b = new Object();

    /* renamed from: a  reason: collision with root package name */
    public Context f58343a;

    /* renamed from: c  reason: collision with root package name */
    private c f58344c;

    public c a() {
        return this.f58344c;
    }

    static {
        Covode.recordClassIndex(36234);
    }

    public class c {

        /* renamed from: b  reason: collision with root package name */
        private volatile SQLiteDatabase f58349b;

        static {
            Covode.recordClassIndex(36237);
        }

        private void a() {
            MethodCollector.i(4286);
            try {
                synchronized (b.f58342b) {
                    try {
                        if (this.f58349b == null || !this.f58349b.isOpen()) {
                            b bVar = b.this;
                            this.f58349b = new a(bVar.f58343a).getWritableDatabase();
                            this.f58349b.setLockingEnabled(false);
                        }
                    } finally {
                        MethodCollector.o(4286);
                    }
                }
            } catch (Throwable unused) {
                MethodCollector.o(4286);
            }
        }

        public c() {
        }

        public final Cursor a(String str) {
            Cursor cursor;
            MethodCollector.i(4292);
            try {
                a();
                cursor = this.f58349b.query(str, null, null, null, null, null, null);
            } catch (Throwable unused) {
                cursor = new C1284b();
            }
            MethodCollector.o(4292);
            return cursor;
        }

        public final long a(String str, ContentValues contentValues) {
            long j2;
            MethodCollector.i(4422);
            try {
                a();
                j2 = this.f58349b.insert(str, null, contentValues);
            } catch (Exception e2) {
                e2.printStackTrace();
                j2 = -1;
            }
            MethodCollector.o(4422);
            return j2;
        }

        public final int a(String str, String str2, String[] strArr) {
            int i2;
            MethodCollector.i(4477);
            try {
                a();
                i2 = this.f58349b.delete(str, str2, strArr);
            } catch (Exception e2) {
                e2.printStackTrace();
                i2 = 0;
            }
            MethodCollector.o(4477);
            return i2;
        }

        public final int a(String str, ContentValues contentValues, String str2, String[] strArr) {
            int i2;
            MethodCollector.i(4300);
            try {
                a();
                i2 = this.f58349b.update(str, contentValues, str2, strArr);
            } catch (Exception e2) {
                e2.printStackTrace();
                i2 = 0;
            }
            MethodCollector.o(4300);
            return i2;
        }
    }

    /* renamed from: com.ss.android.ad.splash.core.b.b$b  reason: collision with other inner class name */
    public class C1284b extends AbstractCursor {
        static {
            Covode.recordClassIndex(36236);
        }

        public final String[] getColumnNames() {
            return new String[0];
        }

        public final int getCount() {
            return 0;
        }

        public final double getDouble(int i2) {
            return 0.0d;
        }

        public final float getFloat(int i2) {
            return 0.0f;
        }

        public final int getInt(int i2) {
            return 0;
        }

        public final long getLong(int i2) {
            return 0;
        }

        public final short getShort(int i2) {
            return 0;
        }

        public final String getString(int i2) {
            return null;
        }

        public final boolean isNull(int i2) {
            return true;
        }

        public C1284b() {
        }
    }

    b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f58343a = applicationContext;
        if (this.f58344c == null) {
            this.f58344c = new c();
        }
    }

    /* access modifiers changed from: protected */
    public class a extends SQLiteOpenHelper {

        /* renamed from: a  reason: collision with root package name */
        Context f58345a;

        static {
            Covode.recordClassIndex(36235);
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            MethodCollector.i(2020);
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ," + "replaceholder INTEGER default 0, retry INTEGER default 0, type INTEGER default 0, cid BIGINT default 0, " + "log_extra TEXT)");
            MethodCollector.o(2020);
        }

        public a(Context context) {
            super(context, "splashsdk.db", (SQLiteDatabase.CursorFactory) null, 1);
            this.f58345a = context;
        }
    }
}
