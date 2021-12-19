package com.bytedance.disk.f;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.b.a;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class b implements c {

    /* renamed from: b  reason: collision with root package name */
    private static final UriMatcher f28584b;

    /* renamed from: a  reason: collision with root package name */
    public Context f28585a;

    /* renamed from: c  reason: collision with root package name */
    private SQLiteOpenHelper f28586c;

    /* renamed from: d  reason: collision with root package name */
    private SQLiteDatabase f28587d;

    static {
        Covode.recordClassIndex(16797);
        UriMatcher uriMatcher = new UriMatcher(-1);
        f28584b = uriMatcher;
        uriMatcher.addURI("com.bytedance.disk:migration", "migration_items_table", 1);
        uriMatcher.addURI("com.bytedance.disk:migration", "migration_items_table/#", 2);
    }

    @Override // com.bytedance.disk.f.c
    public final void a(Context context) {
        MethodCollector.i(1805);
        this.f28585a = context;
        a a2 = a.a(context);
        this.f28586c = a2;
        this.f28587d = a2.getWritableDatabase();
        MethodCollector.o(1805);
    }

    private static String a(String str, long j2) {
        if (TextUtils.isEmpty(str)) {
            return "_id=".concat(String.valueOf(j2));
        }
        return str + " AND _id=" + j2;
    }

    @Override // com.bytedance.disk.f.c
    public final Uri a(Uri uri, ContentValues contentValues) {
        MethodCollector.i(1816);
        SQLiteDatabase writableDatabase = this.f28586c.getWritableDatabase();
        String[] strArr = a.f28580b;
        int length = strArr.length;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                if (contentValues.getAsLong("mig_event_time") == null) {
                    contentValues.put("mig_event_time", Long.valueOf(System.currentTimeMillis()));
                }
                z = true;
            } else if (contentValues.get(strArr[i2]) == null) {
                break;
            } else {
                i2++;
            }
        }
        if (!z) {
            MethodCollector.o(1816);
            return null;
        }
        long insert = writableDatabase.insert("migration_items_table", null, contentValues);
        if (insert < 0) {
            MethodCollector.o(1816);
            return null;
        }
        Uri withAppendedId = ContentUris.withAppendedId(uri, insert);
        MethodCollector.o(1816);
        return withAppendedId;
    }

    @Override // com.bytedance.disk.f.c
    public final int a(Uri uri, ContentValues contentValues, String str) {
        MethodCollector.i(1822);
        SQLiteDatabase writableDatabase = this.f28586c.getWritableDatabase();
        int match = f28584b.match(uri);
        if (match != 1) {
            if (match == 2) {
                str = a((String) null, ContentUris.parseId(uri));
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("unknown uri: ".concat(String.valueOf(uri)));
                MethodCollector.o(1822);
                throw illegalArgumentException;
            }
        }
        int update = writableDatabase.update("migration_items_table", contentValues, str, null);
        MethodCollector.o(1822);
        return update;
    }

    @Override // com.bytedance.disk.f.c
    public final int a(Uri uri, String str, String[] strArr) {
        MethodCollector.i(1819);
        if (!(!TextUtils.isEmpty(str))) {
            MethodCollector.o(1819);
            return 0;
        }
        SQLiteDatabase writableDatabase = this.f28586c.getWritableDatabase();
        int match = f28584b.match(uri);
        if (match != 1) {
            if (match == 2) {
                str = a(str, ContentUris.parseId(uri));
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("unknown uri: ".concat(String.valueOf(uri)));
                MethodCollector.o(1819);
                throw illegalArgumentException;
            }
        }
        int delete = writableDatabase.delete("migration_items_table", str, strArr);
        MethodCollector.o(1819);
        return delete;
    }

    @Override // com.bytedance.disk.f.c
    public final Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        MethodCollector.i(1808);
        SQLiteDatabase readableDatabase = this.f28586c.getReadableDatabase();
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables("migration_items_table");
        if (f28584b.match(uri) == 2) {
            sQLiteQueryBuilder.appendWhere("_id=" + ContentUris.parseId(uri));
        }
        Cursor query = sQLiteQueryBuilder.query(readableDatabase, strArr, str, strArr2, null, null, str2);
        MethodCollector.o(1808);
        return query;
    }
}
