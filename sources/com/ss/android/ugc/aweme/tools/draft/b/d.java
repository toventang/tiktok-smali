package com.ss.android.ugc.aweme.tools.draft.b;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.i;
import com.zhiliaoapp.musically.R;

public class d extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    private static d f139439a;

    static {
        Covode.recordClassIndex(91180);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private d() {
        /*
            r8 = this;
            android.app.Application r0 = com.ss.android.ugc.aweme.port.in.i.f115645a
            android.content.Context r3 = a(r0)
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.a()
            java.lang.String r1 = "use_draft_database_error_handler"
            r0 = 1
            boolean r0 = r2.a(r1, r0)
            if (r0 == 0) goto L_0x0022
            com.ss.android.ugc.aweme.tools.draft.b.a r7 = new com.ss.android.ugc.aweme.tools.draft.b.a
            r7.<init>()
        L_0x0018:
            java.lang.String r4 = "aweme.db"
            r5 = 0
            r6 = 23
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            return
        L_0x0022:
            r7 = 0
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.b.d.<init>():void");
    }

    public static d a() {
        MethodCollector.i(280);
        if (f139439a == null) {
            synchronized (d.class) {
                try {
                    if (f139439a == null) {
                        f139439a = new d();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(280);
                    throw th;
                }
            }
        }
        d dVar = f139439a;
        MethodCollector.o(280);
        return dVar;
    }

    private static Context a(Application application) {
        Context applicationContext = application.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.i(282);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `local_draft` (\n\t`video_path`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n\t`aweme`\tTEXT NOT NULL,\n\t`music_path`\tTEXT,\n\t`voice_path`\tTEXT ,\n\t`video_volume`\tINTEGER NOT NULL,\n\t`music_volume`\tINTEGER NOT NULL,\n\t`filter`\tINTEGER NOT NULL,\n\t`music`\tTEXT,\n\t`music_start`\tINTEGER NOT NULL,\n\t`time`\tLONG NOT NULL,\n\t`effect`\tINTEGER,\n\t`origin`\tINTEGER,\n\t`face_beauty`\tINTEGER,\n\t`user_id`\tTEXT,\n\t`segment_video`\tTEXT,\n\t`segment_sdk`\tTEXT,\n\t`hard_encode`\tINTEGER,\n\t`special_points`\tINTEGER,\n\t`sticker_id`\tTEXT,\n\t`music_id`\tTEXT,\n\t`sticker_path`\tTEXT,\n\t`effect_list`\tTEXT,\n\t`camera_poi`\tINTEGER,\n\t`filter_label`\tTEXT,\n\t`beauty_label`\tINTEGER,\n\t`reverse_path`\tTEXT,\n\t`music_effect`\tTEXT,\n\t`video_speed`\tTEXT,\n\t`music_effect_segments`\tTEXT,\n\t`is_private`\tINTEGER,\n\t`max_duration`\tINTEGER,\n\t`audio_track`\tTEXT,\n\t`new_version`\tINTEGER,\n\t`output_wav_path`\tTEXT,\n\t`custom_cover_start`\tFLOAT,\n\t`video_width`\tINTEGER\tDEFAULT 540,\n\t`video_height`\tINTEGER\tDEFAULT 960,\n\t`duet_from`\tTEXT,\n\t`sync_platforms`\tTEXT,\n\t`photo_movie`\tTEXT,\n\t`draft_extras`\tTEXT,\n\t`draft_view_info`\tTEXT,\n\t`save_time`\tLONG\n);");
        g.a().n().c().a(sQLiteDatabase);
        g.a().c().a().a(sQLiteDatabase);
        MethodCollector.o(282);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        try {
            super.onDowngrade(sQLiteDatabase, i2, i3);
            g.a().n().c().b(sQLiteDatabase);
            g.a().c().a().a(sQLiteDatabase, i2, i3);
        } catch (Exception e2) {
            g.a().I().a((Throwable) e2);
            n.a(a(i.f115645a), (int) R.string.h67);
            System.exit(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0208, code lost:
        if (r35 <= 2) goto L_0x0025;
     */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r34, int r35, int r36) {
        /*
        // Method dump skipped, instructions count: 524
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.b.d.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
