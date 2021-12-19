package com.ss.android.socialbase.downloader.c;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.socialbase.downloader.downloader.c;
import java.io.File;

public class a extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f60296a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f60297b = false;

    static {
        Covode.recordClassIndex(37230);
    }

    private a() {
        super(c.B(), "downloader.db", (SQLiteDatabase.CursorFactory) null, 15);
    }

    public static a a() {
        MethodCollector.i(14030);
        if (f60296a == null) {
            synchronized (a.class) {
                try {
                    if (f60296a == null) {
                        f60296a = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(14030);
                    throw th;
                }
            }
        }
        a aVar = f60296a;
        MethodCollector.o(14030);
        return aVar;
    }

    public SQLiteDatabase getReadableDatabase() {
        MethodCollector.i(14080);
        Context B = c.B();
        if (this.f60297b || B == null) {
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            MethodCollector.o(14080);
            return readableDatabase;
        }
        try {
            File file = new File("/data/data/" + B.getPackageName() + "/database/main/");
            if (!file.exists()) {
                file.mkdir();
            }
            super.getReadableDatabase().execSQL("PRAGMA temp_store_directory = tempDir");
            this.f60297b = true;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        SQLiteDatabase readableDatabase2 = super.getReadableDatabase();
        MethodCollector.o(14080);
        return readableDatabase2;
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        if (com.ss.android.socialbase.downloader.i.a.f60573a.a("disable_sqlite_wal", 0) > 0 && Build.VERSION.SDK_INT == 28) {
            sQLiteDatabase.disableWriteAheadLogging();
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.i(14081);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS downloader( _id INTEGER PRIMARY KEY, url TEXT, savePath TEXT, tempPath TEXT, name TEXT, chunkCount INTEGER, status INTEGER, curBytes INTEGER, totalBytes INTEGER, eTag TEXT, onlyWifi INTEGER, force INTEGER, retryCount INTEGER, extra TEXT, mimeType TEXT, title TEXT, notificationEnable INTEGER, notificationVisibility INTEGER, isFirstDownload INTEGER, isFirstSuccess INTEGER, needHttpsToHttpRetry INTEGER, downloadTime INTEGER, packageName TEXT, md5 TEXT, retryDelay INTEGER, curRetryTime INTEGER, retryDelayStatus INTEGER, defaultHttpServiceBackUp INTEGER, chunkRunnableReuse INTEGER, retryDelayTimeArray TEXT, chunkDowngradeRetry INTEGER, backUpUrlsStr TEXT, backUpUrlRetryCount INTEGER, realDownloadTime INTEGER, retryScheduleMinutes INTEGER, independentProcess INTEGER, auxiliaryJsonobjectString TEXT, iconUrl TEXT, appVersionCode INTEGER, taskId TEXT)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS downloadChunk( _id INTEGER, chunkIndex INTEGER, startOffset INTEGER, curOffset INTEGER, endOffset INTEGER, chunkContentLen INTEGER, hostChunkIndex INTEGER )");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS segments( _id INTEGER PRIMARY KEY,info TEXT )");
        MethodCollector.o(14081);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        if (com.ss.android.socialbase.downloader.e.a.a()) {
            com.ss.android.socialbase.downloader.e.a.b("DownloaderLogger", "onDowngrade");
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        MethodCollector.i(14116);
        switch (i2) {
            case 1:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD mimeType TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD title TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD notificationEnable INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD notificationVisibility INTEGER");
            case 2:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD isFirstDownload INTEGER");
            case 3:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD isFirstSuccess INTEGER");
            case 4:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD needHttpsToHttpRetry INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD downloadTime INTEGER");
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD packageName TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD md5 TEXT");
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD retryDelay INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD curRetryTime INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD retryDelayStatus INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD defaultHttpServiceBackUp INTEGER");
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                sQLiteDatabase.execSQL("ALTER TABLE downloadChunk ADD chunkContentLen INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloadChunk ADD hostChunkIndex INTEGER");
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD chunkRunnableReuse INTEGER");
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD retryDelayTimeArray TEXT");
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD chunkDowngradeRetry INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD backUpUrlsStr TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD backUpUrlRetryCount INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD realDownloadTime INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD retryScheduleMinutes INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD independentProcess INTEGER");
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD auxiliaryJsonobjectString TEXT");
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD iconUrl TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD appVersionCode INTEGER");
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS segments( _id INTEGER PRIMARY KEY,info TEXT )");
            case ABRConfig.ABR_SELECT_SCENE:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD taskId TEXT");
                break;
        }
        MethodCollector.o(14116);
    }
}
