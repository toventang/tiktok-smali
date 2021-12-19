package com.ss.android.ugc.aweme.tools.policysecurity;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.e.c;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public final class a extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    public static a f141003a;

    /* renamed from: b  reason: collision with root package name */
    public static final C3732a f141004b = new C3732a((byte) 0);

    static {
        Covode.recordClassIndex(92048);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.a$a  reason: collision with other inner class name */
    public static final class C3732a {
        static {
            Covode.recordClassIndex(92049);
        }

        private C3732a() {
        }

        public /* synthetic */ C3732a(byte b2) {
            this();
        }

        private static Context b(Context context) {
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            return applicationContext;
        }

        public static a a(Context context) {
            l.d(context, "");
            if (a.f141003a == null) {
                Context b2 = b(context);
                l.b(b2, "");
                a.f141003a = new a(b2);
            }
            a aVar = a.f141003a;
            Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundSQLiteHelper");
            return aVar;
        }
    }

    public final ArrayList<OriginalSoundUploadTask> a() {
        boolean z;
        boolean z2;
        MethodCollector.i(12877);
        ArrayList<OriginalSoundUploadTask> arrayList = new ArrayList<>();
        Cursor query = getReadableDatabase().query("OriginalSound", new String[]{"aweme_id", "vid", "audio_path", "union_id", "update_time", "match_factors", "is_draft", "origin", "is_backup", "query_times"}, null, null, null, null, "update_time desc");
        try {
            Cursor cursor = query;
            while (cursor.moveToNext()) {
                String string = cursor.getString(cursor.getColumnIndex("aweme_id"));
                l.b(string, "");
                String string2 = cursor.getString(cursor.getColumnIndex("vid"));
                l.b(string2, "");
                String string3 = cursor.getString(cursor.getColumnIndex("audio_path"));
                l.b(string3, "");
                long j2 = cursor.getLong(cursor.getColumnIndex("update_time"));
                String string4 = cursor.getString(cursor.getColumnIndex("union_id"));
                int i2 = cursor.getInt(cursor.getColumnIndex("match_factors"));
                if (cursor.getInt(cursor.getColumnIndex("is_draft")) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                int i3 = cursor.getInt(cursor.getColumnIndex("origin"));
                if (cursor.getInt(cursor.getColumnIndex("is_backup")) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList.add(new OriginalSoundUploadTask(string, string2, string3, j2, string4, i2, z, i3, z2, cursor.getInt(cursor.getColumnIndex("query_times"))));
            }
            c.a(query, null);
            MethodCollector.o(12877);
            return arrayList;
        } catch (Throwable th) {
            c.a(query, th);
            MethodCollector.o(12877);
            throw th;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context, "OriginalSound", (SQLiteDatabase.CursorFactory) null, 3);
        l.d(context, "");
    }

    public final void a(b bVar) {
        l.d(bVar, "");
        Iterator<T> it = bVar.f141005a.iterator();
        while (it.hasNext()) {
            a((OriginalSoundUploadTask) it.next());
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.i(12547);
        l.d(sQLiteDatabase, "");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `OriginalSound` (\n\t`aweme_id`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n\t`vid`\tTEXT NOT NULL,\n\t`audio_path`\tTEXT NOT NULL,\n\t`audio_vid`\tTEXT,\n\t`union_id`\tTEXT,\n\t`match_factors`\tINTEGER,\n\t`is_draft`\tINTEGER,\n\t`origin`\tINTEGER,\n\t`is_backup`\tINTEGER,\n\t`query_times`\tINTEGER,\n\t`update_time`\tLONG NOT NULL\n);");
        MethodCollector.o(12547);
    }

    public final void b(b bVar) {
        l.d(bVar, "");
        for (T t : bVar.f141005a) {
            t.f141002k++;
            a((OriginalSoundUploadTask) t);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(OriginalSoundUploadTask originalSoundUploadTask) {
        MethodCollector.i(12768);
        ContentValues contentValues = new ContentValues();
        contentValues.put("aweme_id", originalSoundUploadTask.f140992a);
        contentValues.put("vid", originalSoundUploadTask.f140993b);
        contentValues.put("audio_path", originalSoundUploadTask.f140994c);
        contentValues.put("audio_vid", originalSoundUploadTask.f140997f);
        contentValues.put("update_time", Long.valueOf(originalSoundUploadTask.f140995d));
        contentValues.put("union_id", originalSoundUploadTask.f140996e);
        contentValues.put("match_factors", Integer.valueOf(originalSoundUploadTask.f140998g));
        contentValues.put("is_draft", Integer.valueOf(originalSoundUploadTask.f140999h ? 1 : 0));
        contentValues.put("origin", Integer.valueOf(originalSoundUploadTask.f141000i));
        contentValues.put("is_backup", Integer.valueOf(originalSoundUploadTask.f141001j ? 1 : 0));
        contentValues.put("query_times", Integer.valueOf(originalSoundUploadTask.f141002k));
        getWritableDatabase().replace("OriginalSound", null, contentValues);
        MethodCollector.o(12768);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        MethodCollector.i(12644);
        l.d(sQLiteDatabase, "");
        if (i2 < 2 && i2 != i3) {
            sQLiteDatabase.execSQL("ALTER TABLE OriginalSound ADD COLUMN union_id TEXT");
        }
        if (i2 < 3 && i2 != i3) {
            sQLiteDatabase.execSQL("ALTER TABLE OriginalSound ADD COLUMN match_factors INTEGER");
            sQLiteDatabase.execSQL("ALTER TABLE OriginalSound ADD COLUMN is_draft INTEGER");
            sQLiteDatabase.execSQL("ALTER TABLE OriginalSound ADD COLUMN origin INTEGER");
            sQLiteDatabase.execSQL("ALTER TABLE OriginalSound ADD COLUMN is_backup INTEGER");
            sQLiteDatabase.execSQL("ALTER TABLE OriginalSound ADD COLUMN query_times INTEGER");
        }
        MethodCollector.o(12644);
    }
}
