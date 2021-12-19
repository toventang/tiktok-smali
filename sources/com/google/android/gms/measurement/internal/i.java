package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class i {
    static {
        Covode.recordClassIndex(32302);
    }

    private static Set<String> a(SQLiteDatabase sQLiteDatabase, String str) {
        MethodCollector.i(8548);
        HashSet hashSet = new HashSet();
        Cursor rawQuery = sQLiteDatabase.rawQuery(new StringBuilder(String.valueOf(str).length() + 22).append("SELECT * FROM ").append(str).append(" LIMIT 0").toString(), null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
            MethodCollector.o(8548);
        }
    }

    static void a(eb ebVar, SQLiteDatabase sQLiteDatabase) {
        if (ebVar != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                ebVar.f51471f.a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                ebVar.f51471f.a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                ebVar.f51471f.a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                ebVar.f51471f.a("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    private static boolean a(eb ebVar, SQLiteDatabase sQLiteDatabase, String str) {
        MethodCollector.i(8884);
        if (ebVar != null) {
            Cursor cursor = null;
            try {
                cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{StringSet.name}, "name=?", new String[]{str}, null, null, null);
                boolean moveToFirst = cursor.moveToFirst();
                cursor.close();
                MethodCollector.o(8884);
                return moveToFirst;
            } catch (SQLiteException e2) {
                ebVar.f51471f.a("Error querying for table", str, e2);
                if (cursor != null) {
                    cursor.close();
                }
                MethodCollector.o(8884);
                return false;
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                MethodCollector.o(8884);
                throw th;
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Monitor must not be null");
            MethodCollector.o(8884);
            throw illegalArgumentException;
        }
    }

    static void a(eb ebVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        MethodCollector.i(8881);
        if (ebVar != null) {
            if (!a(ebVar, sQLiteDatabase, str)) {
                sQLiteDatabase.execSQL(str2);
            }
            try {
                Set<String> a2 = a(sQLiteDatabase, str);
                String[] split = str3.split(",");
                for (String str4 : split) {
                    if (!a2.remove(str4)) {
                        SQLiteException sQLiteException = new SQLiteException(new StringBuilder(String.valueOf(str).length() + 35 + String.valueOf(str4).length()).append("Table ").append(str).append(" is missing required column: ").append(str4).toString());
                        MethodCollector.o(8881);
                        throw sQLiteException;
                    }
                }
                if (strArr != null) {
                    for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                        if (!a2.remove(strArr[i2])) {
                            sQLiteDatabase.execSQL(strArr[i2 + 1]);
                        }
                    }
                }
                if (!a2.isEmpty()) {
                    ebVar.f51471f.a("Table has extra columns. table, columns", str, TextUtils.join(", ", a2));
                }
                MethodCollector.o(8881);
            } catch (SQLiteException e2) {
                ebVar.f51468c.a("Failed to verify columns on table that was just created", str);
                MethodCollector.o(8881);
                throw e2;
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Monitor must not be null");
            MethodCollector.o(8881);
            throw illegalArgumentException;
        }
    }
}
