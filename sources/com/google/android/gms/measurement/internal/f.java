package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;

/* access modifiers changed from: package-private */
public final class f extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ e f51584a;

    static {
        Covode.recordClassIndex(32221);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }

    public final SQLiteDatabase getWritableDatabase() {
        MethodCollector.i(3801);
        jl jlVar = this.f51584a.f51458i;
        boolean z = true;
        if (jlVar.f51934b != 0 && jlVar.f51933a.b() - jlVar.f51934b < 3600000) {
            z = false;
        }
        if (z) {
            try {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                MethodCollector.o(3801);
                return writableDatabase;
            } catch (SQLiteException unused) {
                this.f51584a.f51458i.a();
                this.f51584a.q().f51468c.a("Opening the database failed, dropping and recreating it");
                if (!a(this.f51584a.m().getDatabasePath("google_app_measurement.db"))) {
                    this.f51584a.q().f51468c.a("Failed to delete corrupted db file", "google_app_measurement.db");
                }
                try {
                    SQLiteDatabase writableDatabase2 = super.getWritableDatabase();
                    this.f51584a.f51458i.f51934b = 0;
                    MethodCollector.o(3801);
                    return writableDatabase2;
                } catch (SQLiteException e2) {
                    this.f51584a.q().f51468c.a("Failed to open freshly created database", e2);
                    MethodCollector.o(3801);
                    throw e2;
                }
            }
        } else {
            SQLiteException sQLiteException = new SQLiteException("Database open failed");
            MethodCollector.o(3801);
            throw sQLiteException;
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        i.a(this.f51584a.q(), sQLiteDatabase);
    }

    private static boolean a(File file) {
        MethodCollector.i(4064);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(4064);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(4064);
        return delete;
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        i.a(this.f51584a.q(), sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", e.f51450a);
        i.a(this.f51584a.q(), sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
        i.a(this.f51584a.q(), sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", e.f51451b);
        i.a(this.f51584a.q(), sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", e.f51452c);
        i.a(this.f51584a.q(), sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", e.f51454e);
        i.a(this.f51584a.q(), sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
        i.a(this.f51584a.q(), sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", e.f51453d);
        i.a(this.f51584a.q(), sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", e.f51455f);
        i.a(this.f51584a.q(), sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", e.f51456g);
        i.a(this.f51584a.q(), sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
        i.a(this.f51584a.q(), sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", e.f51457h);
        i.a(this.f51584a.q(), sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
        i.a(this.f51584a.q(), sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    f(e eVar, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.f51584a = eVar;
    }
}
