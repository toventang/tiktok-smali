package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import androidx.c.a;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.measurement.ap;
import com.google.android.gms.internal.measurement.ay;
import com.google.android.gms.internal.measurement.gm;
import com.google.android.gms.internal.measurement.km;
import com.google.android.gms.internal.measurement.mp;
import com.kakao.usermgmt.StringSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class e extends jp {

    /* renamed from: a  reason: collision with root package name */
    static final String[] f51450a = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: b  reason: collision with root package name */
    static final String[] f51451b = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: c  reason: collision with root package name */
    static final String[] f51452c = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"};

    /* renamed from: d  reason: collision with root package name */
    static final String[] f51453d = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: e  reason: collision with root package name */
    static final String[] f51454e = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: f  reason: collision with root package name */
    static final String[] f51455f = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: g  reason: collision with root package name */
    static final String[] f51456g = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: h  reason: collision with root package name */
    static final String[] f51457h = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: i  reason: collision with root package name */
    final jl f51458i = new jl(l());

    /* renamed from: k  reason: collision with root package name */
    private final f f51459k = new f(this, m(), "google_app_measurement.db");

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.jp
    public final boolean d() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0133  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.l a(java.lang.String r27, java.lang.String r28) {
        /*
        // Method dump skipped, instructions count: 314
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.a(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.l");
    }

    public final void a(l lVar) {
        MethodCollector.i(4000);
        r.a(lVar);
        c();
        B();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", lVar.f52017a);
        contentValues.put(StringSet.name, lVar.f52018b);
        contentValues.put("lifetime_count", Long.valueOf(lVar.f52019c));
        contentValues.put("current_bundle_count", Long.valueOf(lVar.f52020d));
        contentValues.put("last_fire_timestamp", Long.valueOf(lVar.f52022f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(lVar.f52023g));
        contentValues.put("last_bundled_day", lVar.f52024h);
        contentValues.put("last_sampled_complex_event_id", lVar.f52025i);
        contentValues.put("last_sampling_rate", lVar.f52026j);
        contentValues.put("current_session_count", Long.valueOf(lVar.f52021e));
        contentValues.put("last_exempt_from_sampling", (lVar.f52027k == null || !lVar.f52027k.booleanValue()) ? null : 1L);
        try {
            if (h().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                q().f51468c.a("Failed to insert/update event aggregates (got -1). appId", eb.a(lVar.f52017a));
            }
            MethodCollector.o(4000);
        } catch (SQLiteException e2) {
            q().f51468c.a("Error storing event aggregates. appId", eb.a(lVar.f52017a), e2);
            MethodCollector.o(4000);
        }
    }

    public final boolean a(jw jwVar) {
        MethodCollector.i(4166);
        r.a(jwVar);
        c();
        B();
        if (c(jwVar.f51965a, jwVar.f51967c) == null) {
            if (jz.a(jwVar.f51967c)) {
                long b2 = b("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{jwVar.f51965a});
                km s = s();
                String str = jwVar.f51965a;
                km.b();
                int i2 = 25;
                if (s.d(null, p.aK)) {
                    i2 = s.a(str, p.G, 25, 100);
                }
                if (b2 >= ((long) i2)) {
                    MethodCollector.o(4166);
                    return false;
                }
            } else if (!"_npa".equals(jwVar.f51967c)) {
                if (b("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{jwVar.f51965a, jwVar.f51966b}) >= 25) {
                    MethodCollector.o(4166);
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", jwVar.f51965a);
        contentValues.put("origin", jwVar.f51966b);
        contentValues.put(StringSet.name, jwVar.f51967c);
        contentValues.put("set_timestamp", Long.valueOf(jwVar.f51968d));
        a(contentValues, "value", jwVar.f51969e);
        try {
            if (h().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                q().f51468c.a("Failed to insert/update user property (got -1). appId", eb.a(jwVar.f51965a));
            }
        } catch (SQLiteException e2) {
            q().f51468c.a("Error storing user property. appId", eb.a(jwVar.f51965a), e2);
        }
        MethodCollector.o(4166);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00af A[Catch:{ all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.jw> a(java.lang.String r21) {
        /*
        // Method dump skipped, instructions count: 208
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.a(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f5, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011b, code lost:
        r0 = java.util.Collections.emptyList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011f, code lost:
        if (r5 != null) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0121, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0124, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(4494);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0127, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0128, code lost:
        if (r5 != null) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x012a, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012d, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(4494);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0130, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0134, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0139, code lost:
        r11.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011b A[Catch:{ all -> 0x0131 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0134 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0018] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0139  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.jw> a(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
        // Method dump skipped, instructions count: 320
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.a(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final boolean a(zzw zzw) {
        MethodCollector.i(4609);
        r.a(zzw);
        c();
        B();
        if (c(zzw.f52086a, zzw.f52088c.f52065a) == null) {
            if (b("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{zzw.f52086a}) >= 1000) {
                MethodCollector.o(4609);
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzw.f52086a);
        contentValues.put("origin", zzw.f52087b);
        contentValues.put(StringSet.name, zzw.f52088c.f52065a);
        a(contentValues, "value", zzw.f52088c.a());
        contentValues.put("active", Boolean.valueOf(zzw.f52090e));
        contentValues.put("trigger_event_name", zzw.f52091f);
        contentValues.put("trigger_timeout", Long.valueOf(zzw.f52093h));
        o();
        contentValues.put("timed_out_event", jz.a((Parcelable) zzw.f52092g));
        contentValues.put("creation_timestamp", Long.valueOf(zzw.f52089d));
        o();
        contentValues.put("triggered_event", jz.a((Parcelable) zzw.f52094i));
        contentValues.put("triggered_timestamp", Long.valueOf(zzw.f52088c.f52066b));
        contentValues.put("time_to_live", Long.valueOf(zzw.f52095j));
        o();
        contentValues.put("expired_event", jz.a((Parcelable) zzw.f52096k));
        try {
            if (h().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                q().f51468c.a("Failed to insert/update conditional user property (got -1)", eb.a(zzw.f52086a));
            }
        } catch (SQLiteException e2) {
            q().f51468c.a("Error storing conditional user property", eb.a(zzw.f52086a), e2);
        }
        MethodCollector.o(4609);
        return true;
    }

    public final List<zzw> a(String str, String[] strArr) {
        MethodCollector.i(4731);
        c();
        B();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor query = h().query("conditional_properties", new String[]{"app_id", "origin", StringSet.name, "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
            if (!query.moveToFirst()) {
                query.close();
                MethodCollector.o(4731);
                return arrayList;
            }
            while (true) {
                if (arrayList.size() < 1000) {
                    boolean z = false;
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    String string3 = query.getString(2);
                    Object a2 = a(query, 3);
                    if (query.getInt(4) != 0) {
                        z = true;
                    }
                    String string4 = query.getString(5);
                    long j2 = query.getLong(6);
                    long j3 = query.getLong(8);
                    arrayList.add(new zzw(string, string2, new zzkr(string3, query.getLong(10), a2, string2), j3, z, string4, (zzao) L_().a(query.getBlob(7), zzao.CREATOR), j2, (zzao) L_().a(query.getBlob(9), zzao.CREATOR), query.getLong(11), (zzao) L_().a(query.getBlob(12), zzao.CREATOR)));
                    if (!query.moveToNext()) {
                        break;
                    }
                } else {
                    q().f51468c.a("Read more than the max allowed conditional properties, ignoring extra", 1000);
                    break;
                }
            }
            query.close();
            MethodCollector.o(4731);
            return arrayList;
        } catch (SQLiteException e2) {
            q().f51468c.a("Error querying conditional user property value", e2);
            List<zzw> emptyList = Collections.emptyList();
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.o(4731);
            return emptyList;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.o(4731);
            throw th;
        }
    }

    public final void a(ec ecVar) {
        MethodCollector.i(4862);
        r.a(ecVar);
        c();
        B();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", ecVar.b());
        contentValues.put("app_instance_id", ecVar.c());
        contentValues.put("gmp_app_id", ecVar.d());
        contentValues.put("resettable_device_id_hash", ecVar.g());
        contentValues.put("last_bundle_index", Long.valueOf(ecVar.r()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(ecVar.i()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(ecVar.j()));
        contentValues.put("app_version", ecVar.k());
        contentValues.put("app_store", ecVar.m());
        contentValues.put("gmp_version", Long.valueOf(ecVar.n()));
        contentValues.put("dev_cert_hash", Long.valueOf(ecVar.o()));
        contentValues.put("measurement_enabled", Boolean.valueOf(ecVar.q()));
        ecVar.f51478a.p().c();
        contentValues.put("day", Long.valueOf(ecVar.f51480c));
        ecVar.f51478a.p().c();
        contentValues.put("daily_public_events_count", Long.valueOf(ecVar.f51481d));
        ecVar.f51478a.p().c();
        contentValues.put("daily_events_count", Long.valueOf(ecVar.f51482e));
        ecVar.f51478a.p().c();
        contentValues.put("daily_conversions_count", Long.valueOf(ecVar.f51483f));
        contentValues.put("config_fetched_time", Long.valueOf(ecVar.s()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(ecVar.t()));
        contentValues.put("app_version_int", Long.valueOf(ecVar.l()));
        contentValues.put("firebase_instance_id", ecVar.h());
        ecVar.f51478a.p().c();
        contentValues.put("daily_error_events_count", Long.valueOf(ecVar.f51484g));
        ecVar.f51478a.p().c();
        contentValues.put("daily_realtime_events_count", Long.valueOf(ecVar.f51485h));
        contentValues.put("health_monitor_sample", ecVar.v());
        contentValues.put("android_id", Long.valueOf(ecVar.w()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(ecVar.x()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(ecVar.y()));
        contentValues.put("admob_app_id", ecVar.e());
        contentValues.put("dynamite_version", Long.valueOf(ecVar.p()));
        if (ecVar.A() != null) {
            if (ecVar.A().size() == 0) {
                q().f51471f.a("Safelisted events should not be an empty list. appId", ecVar.b());
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", ecVar.A()));
            }
        }
        mp.b();
        if (s().d(ecVar.b(), p.ao)) {
            contentValues.put("ga_app_id", ecVar.f());
        }
        try {
            SQLiteDatabase h2 = h();
            if (((long) h2.update("apps", contentValues, "app_id = ?", new String[]{ecVar.b()})) == 0 && h2.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                q().f51468c.a("Failed to insert/update app (got -1). appId", eb.a(ecVar.b()));
            }
            MethodCollector.o(4862);
        } catch (SQLiteException e2) {
            q().f51468c.a("Error storing app. appId", eb.a(ecVar.b()), e2);
            MethodCollector.o(4862);
        }
    }

    public final d a(long j2, String str, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        MethodCollector.i(4986);
        r.a(str);
        c();
        B();
        String[] strArr = {str};
        d dVar = new d();
        Cursor cursor = null;
        try {
            SQLiteDatabase h2 = h();
            Cursor query = h2.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
            if (!query.moveToFirst()) {
                q().f51471f.a("Not updating daily counts, app is not known. appId", eb.a(str));
                query.close();
                MethodCollector.o(4986);
                return dVar;
            }
            if (query.getLong(0) == j2) {
                dVar.f51403b = query.getLong(1);
                dVar.f51402a = query.getLong(2);
                dVar.f51404c = query.getLong(3);
                dVar.f51405d = query.getLong(4);
                dVar.f51406e = query.getLong(5);
            }
            if (z) {
                dVar.f51403b += j3;
            }
            if (z2) {
                dVar.f51402a += j3;
            }
            if (z3) {
                dVar.f51404c += j3;
            }
            if (z4) {
                dVar.f51405d += j3;
            }
            if (z5) {
                dVar.f51406e += j3;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j2));
            contentValues.put("daily_public_events_count", Long.valueOf(dVar.f51402a));
            contentValues.put("daily_events_count", Long.valueOf(dVar.f51403b));
            contentValues.put("daily_conversions_count", Long.valueOf(dVar.f51404c));
            contentValues.put("daily_error_events_count", Long.valueOf(dVar.f51405d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(dVar.f51406e));
            h2.update("apps", contentValues, "app_id=?", strArr);
            query.close();
            MethodCollector.o(4986);
            return dVar;
        } catch (SQLiteException e2) {
            q().f51468c.a("Error updating daily counts. appId", eb.a(str), e2);
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.o(4986);
            return dVar;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.o(4986);
            throw th;
        }
    }

    public final boolean a(ay.g gVar, boolean z) {
        MethodCollector.i(5251);
        c();
        B();
        r.a(gVar);
        r.a(gVar.zzs);
        r.a(gVar.a());
        u();
        long a2 = l().a();
        if (gVar.zzj < a2 - km.i() || gVar.zzj > km.i() + a2) {
            q().f51471f.a("Storing bundle outside of the max uploading time span. appId, now, timestamp", eb.a(gVar.zzs), Long.valueOf(a2), Long.valueOf(gVar.zzj));
        }
        try {
            byte[] c2 = L_().c(gVar.h());
            q().f51476k.a("Saving bundle, size", Integer.valueOf(c2.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", gVar.zzs);
            contentValues.put("bundle_end_timestamp", Long.valueOf(gVar.zzj));
            contentValues.put("data", c2);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (gVar.b()) {
                contentValues.put("retry_count", Integer.valueOf(gVar.zzao));
            }
            try {
                if (h().insert("queue", null, contentValues) == -1) {
                    q().f51468c.a("Failed to insert bundle (got -1). appId", eb.a(gVar.zzs));
                    MethodCollector.o(5251);
                    return false;
                }
                MethodCollector.o(5251);
                return true;
            } catch (SQLiteException e2) {
                q().f51468c.a("Error storing bundle. appId", eb.a(gVar.zzs), e2);
                MethodCollector.o(5251);
                return false;
            }
        } catch (IOException e3) {
            q().f51468c.a("Data loss. Failed to serialize bundle. appId", eb.a(gVar.zzs), e3);
            MethodCollector.o(5251);
            return false;
        }
    }

    public final List<Pair<ay.g, Long>> a(String str, int i2, int i3) {
        MethodCollector.i(5438);
        c();
        B();
        r.b(i2 > 0);
        r.b(i3 > 0);
        r.a(str);
        Cursor cursor = null;
        try {
            Cursor query = h().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i2));
            if (!query.moveToFirst()) {
                List<Pair<ay.g, Long>> emptyList = Collections.emptyList();
                query.close();
                MethodCollector.o(5438);
                return emptyList;
            }
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            do {
                long j2 = query.getLong(0);
                try {
                    byte[] b2 = L_().b(query.getBlob(1));
                    if (!arrayList.isEmpty() && b2.length + i4 > i3) {
                        break;
                    }
                    try {
                        ay.g.a aVar = (ay.g.a) jv.a(ay.g.c(), b2);
                        if (!query.isNull(2)) {
                            aVar.h(query.getInt(2));
                        }
                        i4 += b2.length;
                        arrayList.add(Pair.create((ay.g) ((gm) aVar.w()), Long.valueOf(j2)));
                    } catch (IOException e2) {
                        q().f51468c.a("Failed to merge queued bundle. appId", eb.a(str), e2);
                    }
                    if (!query.moveToNext()) {
                        break;
                    }
                } catch (IOException e3) {
                    q().f51468c.a("Failed to unzip queued bundle. appId", eb.a(str), e3);
                }
            } while (i4 <= i3);
            query.close();
            MethodCollector.o(5438);
            return arrayList;
        } catch (SQLiteException e4) {
            q().f51468c.a("Error querying bundles. appId", eb.a(str), e4);
            List<Pair<ay.g, Long>> emptyList2 = Collections.emptyList();
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.o(5438);
            return emptyList2;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.o(5438);
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(List<Long> list) {
        MethodCollector.i(5639);
        c();
        B();
        r.a(list);
        if (list.size() == 0) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Given Integer is zero");
            MethodCollector.o(5639);
            throw illegalArgumentException;
        } else if (!D()) {
            MethodCollector.o(5639);
        } else {
            String join = TextUtils.join(",", list);
            String sb = new StringBuilder(String.valueOf(join).length() + 2).append("(").append(join).append(")").toString();
            if (b(new StringBuilder(String.valueOf(sb).length() + 80).append("SELECT COUNT(1) FROM queue WHERE rowid IN ").append(sb).append(" AND retry_count =  2147483647 LIMIT 1").toString(), (String[]) null) > 0) {
                q().f51471f.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                h().execSQL(new StringBuilder(String.valueOf(sb).length() + 127).append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ").append(sb).append(" AND (retry_count IS NULL OR retry_count < 2147483647)").toString());
                MethodCollector.o(5639);
            } catch (SQLiteException e2) {
                q().f51468c.a("Error incrementing retry count. error", e2);
                MethodCollector.o(5639);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(long r8) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.a(long):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<com.google.android.gms.internal.measurement.ay.c, java.lang.Long> a(java.lang.String r9, java.lang.Long r10) {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.a(java.lang.String, java.lang.Long):android.util.Pair");
    }

    public final boolean a(String str, Long l2, long j2, ay.c cVar) {
        MethodCollector.i(6327);
        c();
        B();
        r.a(cVar);
        r.a(str);
        r.a(l2);
        byte[] h2 = cVar.h();
        q().f51476k.a("Saving complex main event, appId, data size", n().a(str), Integer.valueOf(h2.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", h2);
        try {
            if (h().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                q().f51468c.a("Failed to insert complex main event (got -1). appId", eb.a(str));
                MethodCollector.o(6327);
                return false;
            }
            MethodCollector.o(6327);
            return true;
        } catch (SQLiteException e2) {
            q().f51468c.a("Error storing complex main event. appId", eb.a(str), e2);
            MethodCollector.o(6327);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str, Bundle bundle) {
        MethodCollector.i(6332);
        c();
        B();
        byte[] h2 = L_().a(new m(this.z, "", str, "dep", 0, 0, bundle)).h();
        q().f51476k.a("Saving default event parameters, appId, data size", n().a(str), Integer.valueOf(h2.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", h2);
        try {
            if (h().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                q().f51468c.a("Failed to insert default event parameters (got -1). appId", eb.a(str));
                MethodCollector.o(6332);
                return false;
            }
            MethodCollector.o(6332);
            return true;
        } catch (SQLiteException e2) {
            q().f51468c.a("Error storing default event parameters. appId", eb.a(str), e2);
            MethodCollector.o(6332);
            return false;
        }
    }

    public final boolean a(m mVar, long j2, boolean z) {
        MethodCollector.i(6370);
        c();
        B();
        r.a(mVar);
        r.a(mVar.f52028a);
        byte[] h2 = L_().a(mVar).h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", mVar.f52028a);
        contentValues.put(StringSet.name, mVar.f52029b);
        contentValues.put("timestamp", Long.valueOf(mVar.f52030c));
        contentValues.put("metadata_fingerprint", Long.valueOf(j2));
        contentValues.put("data", h2);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (h().insert("raw_events", null, contentValues) == -1) {
                q().f51468c.a("Failed to insert raw event (got -1). appId", eb.a(mVar.f52028a));
                MethodCollector.o(6370);
                return false;
            }
            MethodCollector.o(6370);
            return true;
        } catch (SQLiteException e2) {
            q().f51468c.a("Error storing raw event. appId", eb.a(mVar.f52028a), e2);
            MethodCollector.o(6370);
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r19v0, resolved type: java.util.List<com.google.android.gms.internal.measurement.ap$a> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    public final void a(String str, List<ap.a> list) {
        boolean z;
        MethodCollector.i(6448);
        r.a(list);
        for (int i2 = 0; i2 < list.size(); i2++) {
            ap.a.C1215a aVar = (ap.a.C1215a) ((gm) list.get(i2)).l();
            if (aVar.b() != 0) {
                for (int i3 = 0; i3 < aVar.b(); i3++) {
                    ap.b.a aVar2 = (ap.b.a) aVar.b(i3).l();
                    ap.b.a aVar3 = (ap.b.a) ((gm.a) aVar2.clone());
                    String a2 = ge.a(aVar2.a());
                    if (a2 != null) {
                        aVar3.a(a2);
                        z = true;
                    } else {
                        z = false;
                    }
                    for (int i4 = 0; i4 < aVar2.b(); i4++) {
                        ap.c a3 = aVar2.a(i4);
                        String a4 = ho.a(a3.zzg, gd.f51665a, gd.f51666b);
                        if (a4 != null) {
                            aVar3.a(i4, (ap.c) ((gm) ((ap.c.a) a3.l()).a(a4).w()));
                            z = true;
                        }
                    }
                    if (z) {
                        aVar = aVar.a(i3, aVar3);
                        list.set(i2, (gm) aVar.w());
                    }
                }
            }
            if (aVar.a() != 0) {
                for (int i5 = 0; i5 < aVar.a(); i5++) {
                    ap.e a5 = aVar.a(i5);
                    String a6 = ho.a(a5.zze, gg.f51672a, gg.f51673b);
                    if (a6 != null) {
                        aVar = aVar.a(i5, ((ap.e.a) a5.l()).a(a6));
                        list.set(i2, (gm) aVar.w());
                    }
                }
            }
        }
        B();
        c();
        r.a(str);
        r.a(list);
        SQLiteDatabase h2 = h();
        h2.beginTransaction();
        try {
            B();
            c();
            r.a(str);
            SQLiteDatabase h3 = h();
            h3.delete("property_filters", "app_id=?", new String[]{str});
            h3.delete("event_filters", "app_id=?", new String[]{str});
            for (ap.a aVar4 : list) {
                B();
                c();
                r.a(str);
                r.a(aVar4);
                if (aVar4.a()) {
                    int i6 = aVar4.zzd;
                    Iterator<ap.b> it = aVar4.zzf.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().a()) {
                                q().f51471f.a("Event filter with no ID. Audience definition ignored. appId, audienceId", eb.a(str), Integer.valueOf(i6));
                                break;
                            }
                        } else {
                            Iterator<ap.e> it2 = aVar4.zze.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!it2.next().a()) {
                                        q().f51471f.a("Property filter with no ID. Audience definition ignored. appId, audienceId", eb.a(str), Integer.valueOf(i6));
                                        break;
                                    }
                                } else {
                                    Iterator<ap.b> it3 = aVar4.zzf.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!a(str, i6, it3.next())) {
                                                break;
                                            }
                                        } else {
                                            for (ap.e eVar : aVar4.zze) {
                                                if (!a(str, i6, eVar)) {
                                                }
                                            }
                                        }
                                    }
                                    B();
                                    c();
                                    r.a(str);
                                    SQLiteDatabase h4 = h();
                                    h4.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(i6)});
                                    h4.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(i6)});
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    q().f51471f.a("Audience with no ID. appId", eb.a(str));
                }
            }
            ArrayList arrayList = new ArrayList();
            for (ap.a aVar5 : list) {
                arrayList.add(aVar5.a() ? Integer.valueOf(aVar5.zzd) : null);
            }
            b(str, arrayList);
            h2.setTransactionSuccessful();
        } finally {
            h2.endTransaction();
            MethodCollector.o(6448);
        }
    }

    private final boolean D() {
        return m().getDatabasePath("google_app_measurement.db").exists();
    }

    public final void f() {
        B();
        h().setTransactionSuccessful();
    }

    public final long v() {
        return a("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    public final long w() {
        return a("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    public final void e() {
        MethodCollector.i(3313);
        B();
        h().beginTransaction();
        MethodCollector.o(3313);
    }

    public final void g() {
        MethodCollector.i(3703);
        B();
        h().endTransaction();
        MethodCollector.o(3703);
    }

    public final boolean j() {
        if (b("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0) {
            return true;
        }
        return false;
    }

    public final boolean x() {
        if (b("select count(1) > 0 from raw_events", (String[]) null) != 0) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        if (b("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final SQLiteDatabase h() {
        c();
        try {
            return this.f51459k.getWritableDatabase();
        } catch (SQLiteException e2) {
            q().f51471f.a("Error opening database", e2);
            throw e2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String i() {
        /*
            r6 = this;
            r5 = 5261(0x148d, float:7.372E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r5)
            android.database.sqlite.SQLiteDatabase r1 = r6.h()
            r4 = 0
            java.lang.String r0 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r3 = r1.rawQuery(r0, r4)     // Catch:{ SQLiteException -> 0x002e, all -> 0x002b }
            boolean r0 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0029 }
            if (r0 == 0) goto L_0x0022
            r0 = 0
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x0029 }
            r3.close()
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r0
        L_0x0022:
            r3.close()
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r4
        L_0x0029:
            r2 = move-exception
            goto L_0x0030
        L_0x002b:
            r0 = move-exception
            r3 = r4
            goto L_0x0045
        L_0x002e:
            r2 = move-exception
            r3 = r4
        L_0x0030:
            com.google.android.gms.measurement.internal.eb r0 = r6.q()     // Catch:{ all -> 0x0044 }
            com.google.android.gms.measurement.internal.ee r1 = r0.f51468c     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = "Database error getting next bundle app id"
            r1.a(r0, r2)     // Catch:{ all -> 0x0044 }
            if (r3 == 0) goto L_0x0040
            r3.close()
        L_0x0040:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r4
        L_0x0044:
            r0 = move-exception
        L_0x0045:
            if (r3 == 0) goto L_0x004a
            r3.close()
        L_0x004a:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.i():java.lang.String");
    }

    public final long z() {
        MethodCollector.i(6239);
        Cursor cursor = null;
        try {
            Cursor rawQuery = h().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
            if (!rawQuery.moveToFirst()) {
                rawQuery.close();
                MethodCollector.o(6239);
                return -1;
            }
            long j2 = rawQuery.getLong(0);
            rawQuery.close();
            MethodCollector.o(6239);
            return j2;
        } catch (SQLiteException e2) {
            q().f51468c.a("Error querying raw events", e2);
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.o(6239);
            return -1;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.o(6239);
            throw th;
        }
    }

    static {
        Covode.recordClassIndex(32194);
    }

    /* access modifiers changed from: package-private */
    public final void u() {
        int delete;
        MethodCollector.i(5542);
        c();
        B();
        if (!D()) {
            MethodCollector.o(5542);
            return;
        }
        long a2 = r().f51525g.a();
        long b2 = l().b();
        if (Math.abs(b2 - a2) > p.y.a(null).longValue()) {
            r().f51525g.a(b2);
            c();
            B();
            if (D() && (delete = h().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(l().a()), String.valueOf(km.i())})) > 0) {
                q().f51476k.a("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
            }
        }
        MethodCollector.o(5542);
    }

    e(jo joVar) {
        super(joVar);
    }

    public final long h(String str) {
        r.a(str);
        return a("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    public final long c(String str) {
        MethodCollector.i(4872);
        r.a(str);
        c();
        B();
        try {
            long delete = (long) h().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, s().b(str, p.p))))});
            MethodCollector.o(4872);
            return delete;
        } catch (SQLiteException e2) {
            q().f51468c.a("Error deleting over the limit events. appId", eb.a(str), e2);
            MethodCollector.o(4872);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] d(java.lang.String r16) {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.d(java.lang.String):byte[]");
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, List<ap.b>> e(String str) {
        MethodCollector.i(5912);
        r.a(str);
        a aVar = new a();
        Cursor cursor = null;
        try {
            Cursor query = h().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
            if (!query.moveToFirst()) {
                Map<Integer, List<ap.b>> emptyMap = Collections.emptyMap();
                query.close();
                MethodCollector.o(5912);
                return emptyMap;
            }
            do {
                try {
                    ap.b bVar = (ap.b) ((gm) ((ap.b.a) jv.a(ap.b.e(), query.getBlob(1))).w());
                    if (bVar.c()) {
                        int i2 = query.getInt(0);
                        List list = (List) aVar.get(Integer.valueOf(i2));
                        if (list == null) {
                            list = new ArrayList();
                            aVar.put(Integer.valueOf(i2), list);
                        }
                        list.add(bVar);
                    }
                } catch (IOException e2) {
                    q().f51468c.a("Failed to merge filter. appId", eb.a(str), e2);
                }
            } while (query.moveToNext());
            query.close();
            MethodCollector.o(5912);
            return aVar;
        } catch (SQLiteException e3) {
            q().f51468c.a("Database error querying filters. appId", eb.a(str), e3);
            Map<Integer, List<ap.b>> emptyMap2 = Collections.emptyMap();
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.o(5912);
            return emptyMap2;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.o(5912);
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0090 A[Catch:{ all -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> f(java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 177
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.f(java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c6 A[Catch:{ all -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, com.google.android.gms.internal.measurement.ay.i> g(java.lang.String r22) {
        /*
        // Method dump skipped, instructions count: 231
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.g(java.lang.String):java.util.Map");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle i(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 222
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.i(java.lang.String):android.os.Bundle");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0267, code lost:
        if (r0.equals(r1) == false) goto L_0x0269;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00fd A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ff A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x011c A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x011e A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x013b A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x013d A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x015a A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x015c A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x017c A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0180 A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01a8 A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01aa A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01c7 A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01c9 A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01e6 A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0200 A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0215 A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x023e A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x025b A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0286 A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02a0 A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.ec b(java.lang.String r51) {
        /*
        // Method dump skipped, instructions count: 746
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.b(java.lang.String):com.google.android.gms.measurement.internal.ec");
    }

    public final long a(ay.g gVar) {
        MethodCollector.i(6173);
        c();
        B();
        r.a(gVar);
        r.a(gVar.zzs);
        byte[] h2 = gVar.h();
        long a2 = L_().a(h2);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", gVar.zzs);
        contentValues.put("metadata_fingerprint", Long.valueOf(a2));
        contentValues.put("metadata", h2);
        try {
            h().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            MethodCollector.o(6173);
            return a2;
        } catch (SQLiteException e2) {
            q().f51468c.a("Error storing raw event metadata. appId", eb.a(gVar.zzs), e2);
            MethodCollector.o(6173);
            throw e2;
        }
    }

    private final long b(String str, String[] strArr) {
        MethodCollector.i(3710);
        Cursor cursor = null;
        try {
            Cursor rawQuery = h().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                MethodCollector.o(3710);
                return j2;
            }
            SQLiteException sQLiteException = new SQLiteException("Database returned empty set");
            MethodCollector.o(3710);
            throw sQLiteException;
        } catch (SQLiteException e2) {
            q().f51468c.a("Database error", str, e2);
            MethodCollector.o(3710);
            throw e2;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.o(3710);
            throw th;
        }
    }

    public final int e(String str, String str2) {
        MethodCollector.i(4693);
        r.a(str);
        r.a(str2);
        c();
        B();
        try {
            int delete = h().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
            MethodCollector.o(4693);
            return delete;
        } catch (SQLiteException e2) {
            q().f51468c.a("Error deleting conditional property", eb.a(str), n().c(str2), e2);
            MethodCollector.o(4693);
            return 0;
        }
    }

    private final Object a(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            q().f51468c.a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i2));
            }
            if (type == 3) {
                return cursor.getString(i2);
            }
            if (type != 4) {
                q().f51468c.a("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            q().f51468c.a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    private final boolean b(String str, List<Integer> list) {
        MethodCollector.i(5985);
        r.a(str);
        B();
        c();
        SQLiteDatabase h2 = h();
        try {
            long b2 = b("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min((int) LiveNetAdaptiveHurryTimeSetting.DEFAULT, s().b(str, p.F)));
            if (b2 <= ((long) max)) {
                MethodCollector.o(5985);
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Integer num = list.get(i2);
                if (num == null || !(num instanceof Integer)) {
                    MethodCollector.o(5985);
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(",", arrayList);
            String sb = new StringBuilder(String.valueOf(join).length() + 2).append("(").append(join).append(")").toString();
            int delete = h2.delete("audience_filter_values", new StringBuilder(String.valueOf(sb).length() + 140).append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ").append(sb).append(" order by rowid desc limit -1 offset ?)").toString(), new String[]{str, Integer.toString(max)});
            MethodCollector.o(5985);
            if (delete > 0) {
                return true;
            }
            return false;
        } catch (SQLiteException e2) {
            q().f51468c.a("Database error querying filters. appId", eb.a(str), e2);
            MethodCollector.o(5985);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.jw c(java.lang.String r24, java.lang.String r25) {
        /*
        // Method dump skipped, instructions count: 179
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.c(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.jw");
    }

    /* access modifiers changed from: protected */
    public final long h(String str, String str2) {
        Throwable th;
        long j2;
        SQLiteException e2;
        MethodCollector.i(6107);
        r.a(str);
        r.a(str2);
        c();
        B();
        SQLiteDatabase h2 = h();
        h2.beginTransaction();
        long j3 = 0;
        try {
            try {
                j2 = a(new StringBuilder(String.valueOf(str2).length() + 32).append("select ").append(str2).append(" from app2 where app_id=?").toString(), new String[]{str}, -1);
                if (j2 == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (h2.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        q().f51468c.a("Failed to insert column (got -1). appId", eb.a(str), str2);
                        h2.endTransaction();
                        MethodCollector.o(6107);
                        return -1;
                    }
                    j2 = 0;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put(str2, Long.valueOf(j2 + 1));
                    if (((long) h2.update("app2", contentValues2, "app_id = ?", new String[]{str})) == 0) {
                        q().f51468c.a("Failed to update column (got 0). appId", eb.a(str), str2);
                        h2.endTransaction();
                        MethodCollector.o(6107);
                        return -1;
                    }
                    h2.setTransactionSuccessful();
                    h2.endTransaction();
                    MethodCollector.o(6107);
                    return j2;
                } catch (SQLiteException e3) {
                    e2 = e3;
                    j3 = j2;
                    try {
                        q().f51468c.a("Error inserting column. appId", eb.a(str), str2, e2);
                        h2.endTransaction();
                        j2 = j3;
                        MethodCollector.o(6107);
                        return j2;
                    } catch (Throwable th2) {
                        th = th2;
                        h2.endTransaction();
                        MethodCollector.o(6107);
                        throw th;
                    }
                }
            } catch (SQLiteException e4) {
                e2 = e4;
                q().f51468c.a("Error inserting column. appId", eb.a(str), str2, e2);
                h2.endTransaction();
                j2 = j3;
                MethodCollector.o(6107);
                return j2;
            }
        } catch (SQLiteException e5) {
            e2 = e5;
            q().f51468c.a("Error inserting column. appId", eb.a(str), str2, e2);
            h2.endTransaction();
            j2 = j3;
            MethodCollector.o(6107);
            return j2;
        } catch (Throwable th3) {
            th = th3;
            h2.endTransaction();
            MethodCollector.o(6107);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzw d(java.lang.String r31, java.lang.String r32) {
        /*
        // Method dump skipped, instructions count: 306
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.d(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzw");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c4 A[Catch:{ all -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.ap.b>> f(java.lang.String r20, java.lang.String r21) {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.f(java.lang.String, java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c4 A[Catch:{ all -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.ap.e>> g(java.lang.String r20, java.lang.String r21) {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.g(java.lang.String, java.lang.String):java.util.Map");
    }

    public final void b(String str, String str2) {
        MethodCollector.i(4002);
        r.a(str);
        r.a(str2);
        c();
        B();
        try {
            h().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
            MethodCollector.o(4002);
        } catch (SQLiteException e2) {
            q().f51468c.a("Error deleting user property. appId", eb.a(str), n().c(str2), e2);
            MethodCollector.o(4002);
        }
    }

    private static void a(ContentValues contentValues, String str, Object obj) {
        r.a(str);
        r.a(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    private final long a(String str, String[] strArr, long j2) {
        MethodCollector.i(3719);
        Cursor cursor = null;
        try {
            Cursor rawQuery = h().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j3 = rawQuery.getLong(0);
                rawQuery.close();
                MethodCollector.o(3719);
                return j3;
            }
            rawQuery.close();
            MethodCollector.o(3719);
            return j2;
        } catch (SQLiteException e2) {
            q().f51468c.a("Database error", str, e2);
            MethodCollector.o(3719);
            throw e2;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.o(3719);
            throw th;
        }
    }

    private final boolean a(String str, int i2, ap.b bVar) {
        Integer num;
        Boolean bool;
        MethodCollector.i(5653);
        B();
        c();
        r.a(str);
        r.a(bVar);
        Integer num2 = null;
        if (TextUtils.isEmpty(bVar.zze)) {
            ee eeVar = q().f51471f;
            Object a2 = eb.a(str);
            Integer valueOf = Integer.valueOf(i2);
            if (bVar.a()) {
                num2 = Integer.valueOf(bVar.zzd);
            }
            eeVar.a("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", a2, valueOf, String.valueOf(num2));
            MethodCollector.o(5653);
            return false;
        }
        byte[] h2 = bVar.h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        if (bVar.a()) {
            num = Integer.valueOf(bVar.zzd);
        } else {
            num = null;
        }
        contentValues.put("filter_id", num);
        contentValues.put("event_name", bVar.zze);
        if ((bVar.zzc & 64) != 0) {
            bool = Boolean.valueOf(bVar.zzk);
        } else {
            bool = null;
        }
        contentValues.put("session_scoped", bool);
        contentValues.put("data", h2);
        try {
            if (h().insertWithOnConflict("event_filters", null, contentValues, 5) == -1) {
                q().f51468c.a("Failed to insert event filter (got -1). appId", eb.a(str));
            }
            MethodCollector.o(5653);
            return true;
        } catch (SQLiteException e2) {
            q().f51468c.a("Error storing event filter. appId", eb.a(str), e2);
            MethodCollector.o(5653);
            return false;
        }
    }

    public final List<zzw> b(String str, String str2, String str3) {
        r.a(str);
        c();
        B();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return a(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    private final boolean a(String str, int i2, ap.e eVar) {
        Integer num;
        Boolean bool;
        MethodCollector.i(5778);
        B();
        c();
        r.a(str);
        r.a(eVar);
        Integer num2 = null;
        if (TextUtils.isEmpty(eVar.zze)) {
            ee eeVar = q().f51471f;
            Object a2 = eb.a(str);
            Integer valueOf = Integer.valueOf(i2);
            if (eVar.a()) {
                num2 = Integer.valueOf(eVar.zzd);
            }
            eeVar.a("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", a2, valueOf, String.valueOf(num2));
            MethodCollector.o(5778);
            return false;
        }
        byte[] h2 = eVar.h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        if (eVar.a()) {
            num = Integer.valueOf(eVar.zzd);
        } else {
            num = null;
        }
        contentValues.put("filter_id", num);
        contentValues.put("property_name", eVar.zze);
        if ((eVar.zzc & 32) != 0) {
            bool = Boolean.valueOf(eVar.zzi);
        } else {
            bool = null;
        }
        contentValues.put("session_scoped", bool);
        contentValues.put("data", h2);
        try {
            if (h().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                q().f51468c.a("Failed to insert property filter (got -1). appId", eb.a(str));
                MethodCollector.o(5778);
                return false;
            }
            MethodCollector.o(5778);
            return true;
        } catch (SQLiteException e2) {
            q().f51468c.a("Error storing property filter. appId", eb.a(str), e2);
            MethodCollector.o(5778);
            return false;
        }
    }

    public final d a(long j2, String str, boolean z, boolean z2) {
        return a(j2, str, 1, false, false, z, false, z2);
    }
}
