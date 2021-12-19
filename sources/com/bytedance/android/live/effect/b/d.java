package com.bytedance.android.live.effect.b;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;

public final class d extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    public static final a f9699a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private long f9700b;

    static {
        Covode.recordClassIndex(4932);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(4933);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.bytedance.android.live.effect.model.a.a> a() {
        /*
        // Method dump skipped, instructions count: 328
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.b.d.a():java.util.List");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context, "live_composer.db", (SQLiteDatabase.CursorFactory) null, 2);
        l.d(context, "");
    }

    private final void a(boolean z) {
        if (z) {
            this.f9700b = System.currentTimeMillis();
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.i(503);
        a(true);
        if (sQLiteDatabase != null) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS live_composer_node (id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,panel TEXT,effect_id TEXT,resource_id TEXT,path TEXT,update_time INTEGER,use INTEGER)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS live_composer_tag_node(id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,tag TEXT,value REAL,node_id INTEGER)");
        }
        a(false);
        MethodCollector.o(503);
    }

    public final void a(List<com.bytedance.android.live.effect.model.a.a> list) {
        MethodCollector.i(519);
        l.d(list, "");
        a(true);
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            writableDatabase.delete("live_composer_node", null, null);
            writableDatabase.delete("sqlite_sequence", "name=?", new String[]{"live_composer_node"});
            writableDatabase.delete("live_composer_tag_node", null, null);
            writableDatabase.delete("sqlite_sequence", "name=?", new String[]{"live_composer_tag_node"});
            writableDatabase.setTransactionSuccessful();
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            MethodCollector.o(519);
            throw th;
        }
        writableDatabase.endTransaction();
        writableDatabase.close();
        SQLiteDatabase writableDatabase2 = getWritableDatabase();
        Iterator<T> it = list.iterator();
        while (true) {
            int i2 = 0;
            if (it.hasNext()) {
                T next = it.next();
                writableDatabase2.beginTransaction();
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("panel", next.f9875a);
                    contentValues.put("effect_id", next.f9876b);
                    contentValues.put("path", next.f9877c);
                    contentValues.put("update_time", Long.valueOf(next.f9879e));
                    if (next.f9882h) {
                        i2 = 1;
                    }
                    contentValues.put("use", Integer.valueOf(i2));
                    long insert = writableDatabase2.insert("live_composer_node", null, contentValues);
                    for (T t : next.f9881g) {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("tag", t.f9884b);
                        contentValues2.put("value", t.f9883a);
                        contentValues2.put("node_id", Long.valueOf(insert));
                        writableDatabase2.insert("live_composer_tag_node", null, contentValues2);
                    }
                    writableDatabase2.setTransactionSuccessful();
                } catch (Throwable th2) {
                    writableDatabase2.endTransaction();
                    MethodCollector.o(519);
                    throw th2;
                }
                writableDatabase2.endTransaction();
            } else {
                writableDatabase2.close();
                a(false);
                MethodCollector.o(519);
                return;
            }
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        MethodCollector.i(525);
        if (sQLiteDatabase == null) {
            MethodCollector.o(525);
            return;
        }
        sQLiteDatabase.execSQL("Drop Table if exists live_composer_node");
        sQLiteDatabase.execSQL("Drop Table if exists live_composer_tag_node");
        onCreate(sQLiteDatabase);
        MethodCollector.o(525);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        MethodCollector.i(524);
        if (i2 >= 2 || sQLiteDatabase == null) {
            MethodCollector.o(524);
            return;
        }
        sQLiteDatabase.execSQL("ALTER TABLE live_composer_node ADD COLUMN resource_id TEXT DEFAULT \"\" NOT NULL;");
        MethodCollector.o(524);
    }
}
