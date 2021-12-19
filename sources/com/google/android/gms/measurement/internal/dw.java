package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;

/* access modifiers changed from: package-private */
public final class dw extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ dx f51444a;

    static {
        Covode.recordClassIndex(32190);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }

    public final SQLiteDatabase getWritableDatabase() {
        MethodCollector.i(6672);
        try {
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            MethodCollector.o(6672);
            return writableDatabase;
        } catch (SQLiteDatabaseLockedException e2) {
            MethodCollector.o(6672);
            throw e2;
        } catch (SQLiteException unused) {
            this.f51444a.q().f51468c.a("Opening the local database failed, dropping and recreating it");
            if (!a(this.f51444a.m().getDatabasePath("google_app_measurement_local.db"))) {
                this.f51444a.q().f51468c.a("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                SQLiteDatabase writableDatabase2 = super.getWritableDatabase();
                MethodCollector.o(6672);
                return writableDatabase2;
            } catch (SQLiteException e3) {
                this.f51444a.q().f51468c.a("Failed to open local database. Events will bypass local storage", e3);
                MethodCollector.o(6672);
                return null;
            }
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        i.a(this.f51444a.q(), sQLiteDatabase);
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        i.a(this.f51444a.q(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    private static boolean a(File file) {
        MethodCollector.i(6850);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(6850);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(6850);
        return delete;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    dw(dx dxVar, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.f51444a = dxVar;
    }
}
