package com.ss.android.ugc.aweme.tools.extract.video;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModelExtKt;
import com.ss.android.ugc.aweme.tools.extract.video.n;
import java.util.ArrayList;
import java.util.List;

public class m extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    private static m f140144a;

    static {
        Covode.recordClassIndex(91573);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x005a, code lost:
        if (0 == 0) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<com.ss.android.ugc.aweme.tools.extract.video.n> b() {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.extract.video.m.b():java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0074, code lost:
        if (0 != 0) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.ugc.aweme.tools.extract.video.n> a() {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.extract.video.m.a():java.util.List");
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.i(13065);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `frames_table` (\n\t`aweme_id`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n\t`video_id`\tTEXT NOT NULL,\n\t`zip_uri`\tTEXT NOT NULL,\n\t`zip_path`\tTEXT NOT NULL,\n\t`extract_model`\tTEXT NOT NULL,\n\t`union_id`\tTEXT,\n\t`match_factors`\tINTEGER,\n\t`is_draft`\tINTEGER,\n\t`origin`\tINTEGER,\n\t`is_backup`\tINTEGER,\n\t`query_times`\tINTEGER,\n\t`update_time`\tLONG NOT NULL\n);");
        MethodCollector.o(13065);
    }

    public static m a(Context context) {
        MethodCollector.i(12979);
        if (f140144a == null) {
            synchronized (m.class) {
                try {
                    if (f140144a == null) {
                        Context applicationContext = context.getApplicationContext();
                        if (a.f107168c) {
                            if (applicationContext == null) {
                                applicationContext = a.f107166a;
                            }
                        }
                        f140144a = new m(applicationContext, "frames_table");
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12979);
                    throw th;
                }
            }
        }
        m mVar = f140144a;
        MethodCollector.o(12979);
        return mVar;
    }

    public final void a(String str) {
        MethodCollector.i(13483);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(13483);
            return;
        }
        getWritableDatabase().delete("frames_table", "aweme_id = ?", new String[]{str});
        MethodCollector.o(13483);
    }

    private static List<n> a(Cursor cursor) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            n.a aVar = new n.a();
            aVar.f140157a = cursor.getString(cursor.getColumnIndex("aweme_id"));
            aVar.f140158b = cursor.getString(cursor.getColumnIndex("video_id"));
            aVar.f140159c = cursor.getString(cursor.getColumnIndex("zip_uri"));
            aVar.f140160d = cursor.getString(cursor.getColumnIndex("zip_path"));
            aVar.f140161e = ExtractFramesModelExtKt.string2Model(cursor.getString(cursor.getColumnIndex("extract_model")));
            aVar.f140163g = cursor.getString(cursor.getColumnIndex("union_id"));
            aVar.f140162f = cursor.getLong(cursor.getColumnIndex("update_time"));
            aVar.f140164h = cursor.getInt(cursor.getColumnIndex("match_factors"));
            boolean z2 = false;
            if (cursor.getInt(cursor.getColumnIndex("is_draft")) == 1) {
                z = true;
            } else {
                z = false;
            }
            aVar.f140165i = z;
            aVar.f140166j = cursor.getInt(cursor.getColumnIndex("origin"));
            if (cursor.getInt(cursor.getColumnIndex("is_backup")) == 1) {
                z2 = true;
            }
            aVar.f140167k = z2;
            aVar.f140168l = cursor.getInt(cursor.getColumnIndex("query_times"));
            arrayList.add(aVar.a());
        }
        return arrayList;
    }

    public final void a(o oVar) {
        MethodCollector.i(13388);
        for (n nVar : oVar.f140169a) {
            if (nVar.f140149e == null) {
                a(nVar.f140145a);
                MethodCollector.o(13388);
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("aweme_id", nVar.f140145a);
            contentValues.put("video_id", nVar.f140146b);
            contentValues.put("zip_uri", nVar.f140147c);
            contentValues.put("zip_path", nVar.f140148d);
            contentValues.put("extract_model", nVar.f140149e.toString());
            contentValues.put("union_id", nVar.f140151g);
            contentValues.put("update_time", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("match_factors", Integer.valueOf(nVar.f140152h));
            if (nVar.f140153i) {
                contentValues.put("is_draft", (Integer) 1);
            } else {
                contentValues.put("is_draft", (Integer) 0);
            }
            contentValues.put("origin", Integer.valueOf(nVar.f140154j));
            if (nVar.f140155k) {
                contentValues.put("is_backup", (Integer) 1);
            } else {
                contentValues.put("is_backup", (Integer) 0);
            }
            contentValues.put("query_times", Integer.valueOf(nVar.f140156l));
            getWritableDatabase().replace("frames_table", null, contentValues);
        }
        MethodCollector.o(13388);
    }

    public final void a(List<o> list) {
        for (o oVar : list) {
            for (n nVar : oVar.f140169a) {
                nVar.f140156l++;
            }
            a(oVar);
        }
    }

    private m(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 3);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        MethodCollector.i(13161);
        if (i2 < 2 && i2 != i3) {
            sQLiteDatabase.execSQL("ALTER TABLE frames_table ADD COLUMN union_id TEXT");
        }
        if (i2 < 3 && i2 != i3) {
            sQLiteDatabase.execSQL("ALTER TABLE frames_table ADD COLUMN match_factors INTEGER");
            sQLiteDatabase.execSQL("ALTER TABLE frames_table ADD COLUMN is_draft INTEGER");
            sQLiteDatabase.execSQL("ALTER TABLE frames_table ADD COLUMN origin INTEGER");
            sQLiteDatabase.execSQL("ALTER TABLE frames_table ADD COLUMN is_backup INTEGER");
            sQLiteDatabase.execSQL("ALTER TABLE frames_table ADD COLUMN query_times INTEGER");
        }
        g.a().o().k().a("extract_frame_db", "upgrade from " + i2 + " to " + i3);
        MethodCollector.o(13161);
    }
}
