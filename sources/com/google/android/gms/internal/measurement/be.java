package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import androidx.c.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class be implements bi {

    /* renamed from: d  reason: collision with root package name */
    private static final Map<Uri, be> f50697d = new a();

    /* renamed from: h  reason: collision with root package name */
    private static final String[] f50698h = {"key", "value"};

    /* renamed from: a  reason: collision with root package name */
    final Object f50699a = new Object();

    /* renamed from: b  reason: collision with root package name */
    volatile Map<String, String> f50700b;

    /* renamed from: c  reason: collision with root package name */
    final List<Object> f50701c = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final ContentResolver f50702e;

    /* renamed from: f  reason: collision with root package name */
    private final Uri f50703f;

    /* renamed from: g  reason: collision with root package name */
    private final ContentObserver f50704g;

    static {
        Covode.recordClassIndex(31671);
    }

    /* JADX INFO: finally extract failed */
    private final Map<String, String> d() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Map<String, String> map = (Map) bk.a(new bh(this));
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return map;
        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return null;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    public static synchronized void b() {
        synchronized (be.class) {
            MethodCollector.i(8114);
            for (be beVar : f50697d.values()) {
                beVar.f50702e.unregisterContentObserver(beVar.f50704g);
            }
            f50697d.clear();
            MethodCollector.o(8114);
        }
    }

    public final Map<String, String> a() {
        MethodCollector.i(7993);
        Map<String, String> map = this.f50700b;
        if (map == null) {
            synchronized (this.f50699a) {
                try {
                    map = this.f50700b;
                    if (map == null) {
                        map = d();
                        this.f50700b = map;
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7993);
                    throw th;
                }
            }
        }
        if (map != null) {
            MethodCollector.o(7993);
            return map;
        }
        Map<String, String> emptyMap = Collections.emptyMap();
        MethodCollector.o(7993);
        return emptyMap;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Map c() {
        Map map;
        MethodCollector.i(8123);
        Cursor query = this.f50702e.query(this.f50703f, f50698h, null, null, null);
        if (query == null) {
            Map emptyMap = Collections.emptyMap();
            MethodCollector.o(8123);
            return emptyMap;
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                map = new a(count);
            } else {
                map = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                map.put(query.getString(0), query.getString(1));
            }
            query.close();
            MethodCollector.o(8123);
            return map;
        } finally {
            query.close();
            MethodCollector.o(8123);
        }
    }

    @Override // com.google.android.gms.internal.measurement.bi
    public final /* synthetic */ Object a(String str) {
        return a().get(str);
    }

    private be(ContentResolver contentResolver, Uri uri) {
        bg bgVar = new bg(this);
        this.f50704g = bgVar;
        this.f50702e = contentResolver;
        this.f50703f = uri;
        contentResolver.registerContentObserver(uri, false, bgVar);
    }

    public static be a(ContentResolver contentResolver, Uri uri) {
        be beVar;
        MethodCollector.i(7919);
        synchronized (be.class) {
            try {
                Map<Uri, be> map = f50697d;
                beVar = map.get(uri);
                if (beVar == null) {
                    try {
                        be beVar2 = new be(contentResolver, uri);
                        try {
                            map.put(uri, beVar2);
                        } catch (SecurityException unused) {
                        }
                        beVar = beVar2;
                    } catch (SecurityException unused2) {
                    }
                }
            } finally {
                MethodCollector.o(7919);
            }
        }
        return beVar;
    }
}
