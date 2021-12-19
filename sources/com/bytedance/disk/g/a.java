package com.bytedance.disk.g;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.a.a;
import com.bytedance.disk.e.b.b;
import com.bytedance.disk.e.c;
import com.bytedance.disk.f.a;
import com.bytedance.disk.h.d;
import com.bytedance.disk.h.e;
import com.bytedance.disk.h.f;
import com.bytedance.disk.parcel.ClientProxyConfig;
import com.bytedance.disk.parcel.MigrationItem;
import com.bytedance.disk.parcel.MigrationOpt;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class a extends a.AbstractBinderC0610a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile a f28588a;

    /* renamed from: b  reason: collision with root package name */
    InputStream f28589b = null;

    /* renamed from: c  reason: collision with root package name */
    OutputStream f28590c = null;

    /* renamed from: d  reason: collision with root package name */
    public SparseArray<ClientProxyConfig> f28591d = new SparseArray<>();

    /* renamed from: e  reason: collision with root package name */
    final Object f28592e = new Object();

    /* renamed from: f  reason: collision with root package name */
    final SparseArray<Map<String, MigrationItem>> f28593f = new SparseArray<>(3);

    /* renamed from: g  reason: collision with root package name */
    final SparseArray<Map<String, MigrationItem>> f28594g = new SparseArray<>(3);

    /* renamed from: h  reason: collision with root package name */
    final SparseArray<Map<String, MigrationItem>> f28595h = new SparseArray<>(3);

    /* renamed from: i  reason: collision with root package name */
    final SparseArray<Map<String, MigrationItem>> f28596i = new SparseArray<>(3);

    /* renamed from: j  reason: collision with root package name */
    final SparseArray<Map<String, MigrationItem>> f28597j = new SparseArray<>(3);

    /* renamed from: k  reason: collision with root package name */
    final SparseArray<Map<String, MigrationItem>> f28598k = new SparseArray<>(3);

    /* renamed from: l  reason: collision with root package name */
    final List<MigrationItem> f28599l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    final ConditionVariable f28600m = new ConditionVariable(false);
    final AtomicBoolean n = new AtomicBoolean(false);
    boolean o = false;
    public b p;
    public c q;
    private Context r;
    private HandlerThread s = new HandlerThread("MST");
    private HandlerC0613a t;
    private Executor u;
    private e.b v;
    private FileFilter w;
    private int x;
    private int y;

    static {
        Covode.recordClassIndex(16799);
    }

    public static boolean a(MigrationItem migrationItem) {
        if (!(migrationItem == null || migrationItem.f28630c == null)) {
            File file = new File(migrationItem.f28630c.f28639c);
            if (!file.exists()) {
                return true;
            }
            if (!migrationItem.c() && !migrationItem.d() && !migrationItem.e()) {
                try {
                    migrationItem.f28635h.close();
                    return e.a(file);
                } finally {
                    migrationItem.f28635h.open();
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.disk.a.a
    public final int a(MigrationOpt migrationOpt) {
        MethodCollector.i(3667);
        if (!this.o) {
            MethodCollector.o(3667);
            return -1;
        }
        MigrationOpt a2 = MigrationOpt.a(migrationOpt);
        if (!MigrationOpt.a(a2, false)) {
            MigrationItem a3 = MigrationItem.a.a();
            a3.f28630c = a2;
            HashMap hashMap = new HashMap();
            hashMap.put("reason", "105");
            f.a(this.q, 1, a3, hashMap);
            MigrationItem.a.a(a3);
            MethodCollector.o(3667);
            return 99;
        }
        MigrationItem a4 = MigrationItem.a.a();
        a4.f28630c = a2;
        synchronized (this.f28592e) {
            try {
                if (b(a4, false, true)) {
                    MigrationItem.a.a(a4);
                    return 98;
                } else if (b(a4, true)) {
                    MigrationItem.a.a(a4);
                    MethodCollector.o(3667);
                    return 97;
                } else if (c(a4, false, true)) {
                    MigrationItem.a.a(a4);
                    MethodCollector.o(3667);
                    return 98;
                } else if (d(a4, false, true)) {
                    MigrationItem.a.a(a4);
                    MethodCollector.o(3667);
                    return 98;
                } else if (e(a4, false, true)) {
                    MigrationItem.a.a(a4);
                    MethodCollector.o(3667);
                    return 98;
                } else if (a(a4, false, true)) {
                    MigrationItem.a.a(a4);
                    MethodCollector.o(3667);
                    return 98;
                } else if (!MigrationOpt.a(a2, true)) {
                    MigrationItem.a.a(a4);
                    MethodCollector.o(3667);
                    return 99;
                } else {
                    if (TextUtils.isEmpty(a4.f28630c.f28637a) && a4.f28630c.f28642f == 2) {
                        a4.f28630c.f28637a = a4.f28630c.f28639c;
                    }
                    a(a4, 0);
                    this.t.sendMessage(this.t.obtainMessage(1, a4));
                    this.f28593f.get(a2.f28642f).put(a2.f28639c, a4);
                    f.a(this.q, 1, a4, null);
                    MethodCollector.o(3667);
                    return 0;
                }
            } finally {
                MethodCollector.o(3667);
            }
        }
    }

    @Override // com.bytedance.disk.a.a
    public final int a(MigrationOpt migrationOpt, int i2) {
        int i3 = -1;
        if (!this.o) {
            return -1;
        }
        if (i2 != 2 && i2 != 4 && i2 != 7 && i2 != 8) {
            return -1;
        }
        MigrationOpt a2 = MigrationOpt.a(migrationOpt);
        if (!MigrationOpt.a(a2, false)) {
            MigrationOpt.a.a(a2);
            return 99;
        }
        MigrationItem a3 = MigrationItem.a.a();
        a3.f28630c = a2;
        if (i2 == 4) {
            i3 = h(a3);
        } else if (i2 == 2) {
            i3 = i(a3);
        } else if (i2 == 7) {
            i3 = a(a3, true);
        } else {
            if (i2 == 8) {
                i3 = a(a3, false);
            }
            MigrationItem.a.a(a3);
            return i3;
        }
        if (i3 == 0) {
            if (i2 == 4) {
                HashMap hashMap = new HashMap();
                hashMap.put("detail-reason", a3.f28630c.f28638b);
                f.a(this.q, 3, a3, hashMap);
            } else if (i2 == 2) {
                f.a(this.q, 4, a3, null);
            }
        }
        MigrationItem.a.a(a3);
        return i3;
    }

    @Override // com.bytedance.disk.a.a
    public final MigrationItem a(MigrationOpt migrationOpt, boolean z, boolean z2) {
        MigrationItem migrationItem;
        MigrationItem migrationItem2;
        MigrationItem migrationItem3;
        MigrationItem migrationItem4;
        MigrationItem migrationItem5;
        MigrationItem migrationItem6;
        SparseArray<Map<String, MigrationItem>> sparseArray;
        MethodCollector.i(3731);
        if (!this.o) {
            MethodCollector.o(3731);
            return null;
        }
        MigrationOpt a2 = MigrationOpt.a(migrationOpt);
        if (!MigrationOpt.a(a2, false)) {
            MethodCollector.o(3731);
            return null;
        }
        MigrationItem a3 = MigrationItem.a.a();
        a3.f28630c = a2;
        synchronized (this.f28592e) {
            if (z) {
                try {
                    migrationItem = a(a3, this.f28593f, false, z2);
                } catch (Throwable th) {
                    MethodCollector.o(3731);
                    throw th;
                }
            } else {
                migrationItem = a(a3, this.f28593f, false);
            }
            if (migrationItem != null) {
                MigrationItem.a.a(a3);
                MigrationItem a4 = MigrationItem.a(migrationItem, false);
                MethodCollector.o(3731);
                return a4;
            }
            if (z) {
                migrationItem2 = a(a3, this.f28594g, false, z2);
            } else {
                migrationItem2 = a(a3, this.f28594g, false);
            }
            if (migrationItem2 != null) {
                MigrationItem.a.a(a3);
                MigrationItem a5 = MigrationItem.a(migrationItem2, false);
                MethodCollector.o(3731);
                return a5;
            }
            if (z) {
                migrationItem3 = a(a3, this.f28595h, false, z2);
            } else {
                migrationItem3 = a(a3, this.f28595h, false);
            }
            if (migrationItem3 != null) {
                if (migrationItem3.f28629b != -1) {
                    a3.a(100);
                }
                MigrationItem.a.a(a3);
                MigrationItem a6 = MigrationItem.a(migrationItem3, false);
                MethodCollector.o(3731);
                return a6;
            }
            if (z) {
                migrationItem4 = a(a3, this.f28596i, false, z2);
            } else {
                migrationItem4 = a(a3, this.f28596i, false);
            }
            if (migrationItem4 != null) {
                MigrationItem.a.a(a3);
                MigrationItem a7 = MigrationItem.a(migrationItem4, false);
                MethodCollector.o(3731);
                return a7;
            }
            if (z) {
                if (z2) {
                    sparseArray = null;
                } else {
                    sparseArray = this.f28597j;
                }
                migrationItem5 = a(a3, sparseArray, false, z2);
            } else {
                migrationItem5 = a(a3, this.f28597j, false);
            }
            if (migrationItem5 != null) {
                a3.a(100);
                MigrationItem.a.a(a3);
                MigrationItem a8 = MigrationItem.a(migrationItem5, false);
                MethodCollector.o(3731);
                return a8;
            }
            if (z) {
                migrationItem6 = a(a3, this.f28598k, false, z2);
            } else {
                migrationItem6 = a(a3, this.f28598k, false);
            }
            if (migrationItem6 != null) {
                MigrationItem.a.a(a3);
                MigrationItem a9 = MigrationItem.a(migrationItem6, false);
                MethodCollector.o(3731);
                return a9;
            }
            MethodCollector.o(3731);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        MethodCollector.i(4024);
        if (this.f28594g.get(0).size() + this.f28594g.get(1).size() + this.f28594g.get(2).size() != 1 || this.f28590c == null) {
            MethodCollector.o(4024);
        }
        int i2 = 3;
        do {
            try {
                this.f28590c.write(1);
                MethodCollector.o(4024);
                return;
            } catch (IOException unused) {
                i2--;
                if (i2 <= 0) {
                }
            }
        } while (i2 <= 0);
        MethodCollector.o(4024);
    }

    private boolean a(MigrationItem migrationItem, boolean z, boolean z2) {
        MigrationItem migrationItem2;
        MethodCollector.i(4172);
        synchronized (this.f28592e) {
            if (z2) {
                try {
                    migrationItem2 = a(migrationItem, this.f28593f, z, false);
                } catch (Throwable th) {
                    MethodCollector.o(4172);
                    throw th;
                }
            } else {
                migrationItem2 = a(migrationItem, this.f28593f, z);
            }
            if (migrationItem2 == null) {
                MethodCollector.o(4172);
                return false;
            }
            if (z) {
                migrationItem2.a(true);
                com.bytedance.disk.h.a.a("MMS", "isWaitingRegister pop %s because of %s", migrationItem2, migrationItem);
            }
            MethodCollector.o(4172);
            return true;
        }
    }

    static void a(MigrationItem migrationItem, int i2) {
        switch (i2) {
            case 0:
                migrationItem.a(false);
                migrationItem.f28633f = 0;
                return;
            case 1:
                migrationItem.f28630c.f28643g = com.bytedance.disk.h.c.b(migrationItem.f28630c.f28639c);
                migrationItem.f28633f = 1;
                migrationItem.f28631d = System.currentTimeMillis();
                return;
            case 2:
                migrationItem.f28633f = 2;
                return;
            case 3:
                migrationItem.f28633f = 3;
                migrationItem.f28632e = System.currentTimeMillis() - migrationItem.f28631d;
                return;
            case 4:
                migrationItem.f28633f = 4;
                return;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                migrationItem.f28633f = 5;
                migrationItem.f28632e = System.currentTimeMillis() - migrationItem.f28631d;
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                migrationItem.f28633f = 6;
                migrationItem.f28632e = System.currentTimeMillis() - migrationItem.f28631d;
                return;
            default:
                return;
        }
    }

    private void a(MigrationItem migrationItem, IOException iOException) {
        boolean z;
        MethodCollector.i(4374);
        synchronized (this.f28592e) {
            try {
                Map<String, MigrationItem> map = this.f28595h.get(migrationItem.f28630c.f28642f);
                if (map == null) {
                    z = false;
                } else if (map.remove(migrationItem.f28630c.f28639c) != null) {
                    z = true;
                    a(migrationItem, 6);
                    Map<String, MigrationItem> map2 = this.f28598k.get(migrationItem.f28630c.f28642f);
                    if (map2 != null) {
                        map2.put(migrationItem.f28630c.f28639c, migrationItem);
                    }
                    com.bytedance.disk.h.a.a("MMS", "migrationFailed %s!", iOException, migrationItem);
                    g(migrationItem);
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                MethodCollector.o(4374);
                throw th;
            }
        }
        if (z) {
            f(migrationItem);
            MethodCollector.o(4374);
            return;
        }
        com.bytedance.disk.h.a.a("MMS", "migrationFailed %s", null, migrationItem.f28630c.f28639c);
        MethodCollector.o(4374);
    }

    /* access modifiers changed from: package-private */
    public final void a(MigrationItem migrationItem, boolean z, String str) {
        boolean z2;
        MethodCollector.i(4420);
        synchronized (this.f28592e) {
            try {
                a(migrationItem, 4);
                if (a(migrationItem, this.f28596i, false) != null) {
                    z2 = true;
                } else {
                    z2 = false;
                    MigrationItem a2 = a(migrationItem, this.f28595h, true);
                    if (a2 != null) {
                        this.f28596i.get(a2.f28630c.f28642f).put(a2.f28630c.f28639c, a2);
                        z2 = true;
                    } else {
                        MigrationItem a3 = a(migrationItem, this.f28593f, true);
                        if (a3 != null) {
                            this.f28596i.get(a3.f28630c.f28642f).put(a3.f28630c.f28639c, a3);
                            z2 = true;
                        }
                    }
                }
                if (z2) {
                    if (z) {
                        MigrationItem a4 = MigrationItem.a(migrationItem, false);
                        a4.f28630c.f28638b = str;
                        com.bytedance.disk.h.a.a("MMS", "migrationSuspend %s", a4);
                        g(a4);
                    } else {
                        com.bytedance.disk.h.a.a("MMS", "migrationSuspend %s", migrationItem);
                        g(migrationItem);
                    }
                } else if (migrationItem.f28629b != -1) {
                    com.bytedance.disk.h.a.a("MMS", "migrationSuspend get type->%s failed %s", null, MigrationOpt.a(migrationItem.f28630c.f28642f), migrationItem);
                }
            } catch (Throwable th) {
                MethodCollector.o(4420);
                throw th;
            }
        }
        if (migrationItem.f28629b == -1) {
            d(migrationItem);
            MethodCollector.o(4420);
            return;
        }
        f(migrationItem);
        MethodCollector.o(4420);
    }

    public final MigrationItem c() {
        MethodCollector.i(4660);
        synchronized (this.f28599l) {
            try {
                if (this.f28599l.size() == 0) {
                    return null;
                }
                MigrationItem remove = this.f28599l.remove(0);
                MethodCollector.o(4660);
                return remove;
            } finally {
                MethodCollector.o(4660);
            }
        }
    }

    public final MigrationItem b() {
        MigrationItem d2;
        Map<String, MigrationItem> map;
        MethodCollector.i(4658);
        synchronized (this.f28592e) {
            try {
                d2 = d();
                if (!(d2 == null || d2.f28630c == null || (map = this.f28595h.get(d2.f28630c.f28642f)) == null)) {
                    map.put(d2.f28630c.f28639c, d2);
                }
            } finally {
                MethodCollector.o(4658);
            }
        }
        if (d2 == null && this.f28589b != null) {
            int i2 = 3;
            do {
                try {
                    this.f28589b.read();
                    break;
                } catch (IOException unused) {
                    i2--;
                    if (i2 <= 0) {
                    }
                }
            } while (i2 <= 0);
        }
        return d2;
    }

    private MigrationItem d() {
        MethodCollector.i(4601);
        synchronized (this.f28592e) {
            try {
                Map<String, MigrationItem> map = this.f28594g.get(2);
                Map<String, MigrationItem> map2 = this.f28594g.get(1);
                Map<String, MigrationItem> map3 = this.f28594g.get(0);
                if (map.size() + map2.size() + map3.size() <= 0) {
                    return null;
                }
                System.currentTimeMillis();
                if (map.size() > 0) {
                    ArrayList arrayList = new ArrayList(map.entrySet());
                    Collections.sort(arrayList, new Comparator<Map.Entry<String, MigrationItem>>() {
                        /* class com.bytedance.disk.g.a.AnonymousClass10 */

                        static {
                            Covode.recordClassIndex(16801);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // java.util.Comparator
                        public final /* synthetic */ int compare(Map.Entry<String, MigrationItem> entry, Map.Entry<String, MigrationItem> entry2) {
                            return Long.valueOf(entry.getValue().f28631d).compareTo(Long.valueOf(entry2.getValue().f28631d));
                        }
                    });
                    MigrationItem migrationItem = (MigrationItem) ((Map.Entry) arrayList.get(0)).getValue();
                    map.remove(migrationItem.f28630c.f28639c);
                    MethodCollector.o(4601);
                    return migrationItem;
                } else if (map2.size() > 0) {
                    ArrayList arrayList2 = new ArrayList(map2.entrySet());
                    Collections.sort(arrayList2, new Comparator<Map.Entry<String, MigrationItem>>() {
                        /* class com.bytedance.disk.g.a.AnonymousClass11 */

                        static {
                            Covode.recordClassIndex(16802);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // java.util.Comparator
                        public final /* synthetic */ int compare(Map.Entry<String, MigrationItem> entry, Map.Entry<String, MigrationItem> entry2) {
                            return entry.getValue().compareTo(entry2.getValue());
                        }
                    });
                    MigrationItem migrationItem2 = (MigrationItem) ((Map.Entry) arrayList2.get(0)).getValue();
                    map2.remove(migrationItem2.f28630c.f28639c);
                    MethodCollector.o(4601);
                    return migrationItem2;
                } else if (map3.size() > 0) {
                    MigrationItem migrationItem3 = (MigrationItem) ((Map.Entry) new ArrayList(map3.entrySet()).get(0)).getValue();
                    map3.remove(migrationItem3.f28630c.f28639c);
                    MethodCollector.o(4601);
                    return migrationItem3;
                } else {
                    MethodCollector.o(4601);
                    return null;
                }
            } finally {
                MethodCollector.o(4601);
            }
        }
    }

    static void e(MigrationItem migrationItem) {
        System.currentTimeMillis();
        com.bytedance.disk.d.b.a(a.C0612a.f28581a, "_id=?", new String[]{String.valueOf(migrationItem.f28629b)});
    }

    @Override // com.bytedance.disk.a.a
    public final void a(long j2) {
        if (j2 <= 0) {
            this.f28600m.block();
        } else {
            this.f28600m.block(j2);
        }
    }

    static Cursor a(int i2) {
        if (!com.bytedance.disk.e.a.a.b(i2)) {
            return null;
        }
        System.currentTimeMillis();
        String[] strArr = a.b.f28582a;
        return com.bytedance.disk.d.b.a(a.C0612a.f28581a, strArr, "mig_event=? AND (mig_opt_dir ISNULL OR mig_opt_dir=mig_opt_from)", new String[]{String.valueOf(i2)}, "mig_opt_file_len ASC");
    }

    public static void f(MigrationItem migrationItem) {
        System.currentTimeMillis();
        Uri withAppendedId = ContentUris.withAppendedId(a.C0612a.f28581a, migrationItem.f28629b);
        ContentValues contentValues = new ContentValues();
        if (migrationItem.f28630c.f28642f == 0) {
            migrationItem.a();
            contentValues.put("mig_opt_type", Integer.valueOf(migrationItem.f28630c.f28642f));
        } else if (migrationItem.f28630c != null && migrationItem.f28630c.f28643g <= 0) {
            migrationItem.f28630c.f28643g = com.bytedance.disk.h.c.b(migrationItem.f28630c.f28639c);
        }
        contentValues.put("mig_opt_file_len", Long.valueOf(migrationItem.f28630c.f28643g));
        contentValues.put("mig_event", Integer.valueOf(migrationItem.f28633f));
        contentValues.put("mig_event_time", Long.valueOf(migrationItem.f28631d));
        contentValues.put("mig_event_elapsed", Long.valueOf(migrationItem.f28632e));
        contentValues.put("mig_deleted", Boolean.valueOf(migrationItem.f28634g));
        com.bytedance.disk.d.b.a(withAppendedId, contentValues);
    }

    private void j(MigrationItem migrationItem) {
        boolean z;
        MethodCollector.i(4394);
        synchronized (this.f28592e) {
            try {
                if (a(migrationItem, this.f28595h, true) == null && a(migrationItem, this.f28596i, true) == null) {
                    z = false;
                } else {
                    z = true;
                    a(migrationItem, 5);
                    Map<String, MigrationItem> map = this.f28597j.get(migrationItem.f28630c.f28642f);
                    if (map != null) {
                        map.put(migrationItem.f28630c.f28639c, migrationItem);
                        migrationItem.f28635h.close();
                    }
                    com.bytedance.disk.h.a.a("MMS", "migrationSuccess %s", migrationItem);
                    g(migrationItem);
                }
            } catch (Throwable th) {
                MethodCollector.o(4394);
                throw th;
            }
        }
        if (z) {
            f(migrationItem);
            if (a(migrationItem)) {
                migrationItem.f28634g = true;
                f(migrationItem);
            }
            migrationItem.f28635h.open();
            MethodCollector.o(4394);
            return;
        }
        com.bytedance.disk.h.a.a("MMS", "migrationSuccess? but can't find key: %s", null, migrationItem.f28630c.f28639c);
        MethodCollector.o(4394);
    }

    /* access modifiers changed from: package-private */
    public final void g(MigrationItem migrationItem) {
        MethodCollector.i(4707);
        synchronized (this.f28591d) {
            try {
                int size = this.f28591d.size();
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < size; i2++) {
                    try {
                        this.f28591d.valueAt(i2).f28627c.a(migrationItem);
                    } catch (RemoteException unused) {
                        arrayList.add(Integer.valueOf(this.f28591d.keyAt(i2)));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    if (!this.f28591d.get(intValue).f28627c.asBinder().pingBinder()) {
                        this.f28591d.remove(intValue);
                    }
                }
            } finally {
                MethodCollector.o(4707);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.disk.g.a$a  reason: collision with other inner class name */
    public class HandlerC0613a extends Handler {
        static {
            Covode.recordClassIndex(16811);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ba, code lost:
            if (r6 == false) goto L_0x00cd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c0, code lost:
            if (r4.f28629b != -1) goto L_0x00d1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c2, code lost:
            r4.f28629b = com.bytedance.disk.g.a.d(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c8, code lost:
            r4.f28635h.open();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cd, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(3311);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d0, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d1, code lost:
            com.bytedance.disk.g.a.f(r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r14) {
            /*
            // Method dump skipped, instructions count: 219
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.disk.g.a.HandlerC0613a.handleMessage(android.os.Message):void");
        }

        public HandlerC0613a(Looper looper) {
            super(looper);
        }
    }

    public static long d(MigrationItem migrationItem) {
        Uri uri;
        com.bytedance.disk.f.c a2;
        System.currentTimeMillis();
        Uri uri2 = a.C0612a.f28581a;
        ContentValues contentValues = new ContentValues();
        if (TextUtils.isEmpty(migrationItem.f28630c.f28638b)) {
            migrationItem.f28630c.f28638b = "INVALID";
        }
        contentValues.put("mig_opt_reason", migrationItem.f28630c.f28638b);
        contentValues.put("mig_opt_file_len", Long.valueOf(migrationItem.f28630c.f28643g));
        String str = migrationItem.f28630c.f28637a;
        String str2 = migrationItem.f28630c.f28639c;
        String str3 = migrationItem.f28630c.f28640d;
        try {
            if (!TextUtils.isEmpty(str)) {
                str = com.bytedance.disk.h.c.a(str, 1);
            }
            str2 = com.bytedance.disk.h.c.a(str2, 1);
            str3 = com.bytedance.disk.h.c.a(str3, 1);
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(str)) {
            contentValues.put("mig_opt_dir", str);
        }
        contentValues.put("mig_opt_from", str2);
        contentValues.put("mig_opt_to", str3);
        contentValues.put("mig_opt_policy", Integer.valueOf(migrationItem.f28630c.f28641e));
        contentValues.put("mig_opt_type", Integer.valueOf(migrationItem.f28630c.f28642f));
        contentValues.put("mig_event", Integer.valueOf(migrationItem.f28633f));
        contentValues.put("mig_event_time", Long.valueOf(migrationItem.f28631d));
        contentValues.put("mig_event_elapsed", Long.valueOf(migrationItem.f28632e));
        contentValues.put("mig_deleted", Boolean.valueOf(migrationItem.f28634g));
        if (com.bytedance.disk.d.b.f28564a == null || (a2 = com.bytedance.disk.d.b.f28564a.a(uri2)) == null) {
            uri = null;
        } else {
            uri = a2.a(uri2, contentValues);
        }
        long parseId = ContentUris.parseId(uri);
        migrationItem.f28629b = parseId;
        return parseId;
    }

    private int h(MigrationItem migrationItem) {
        MethodCollector.i(4021);
        synchronized (this.f28592e) {
            try {
                if (a(migrationItem, this.f28596i, false) != null) {
                    return 98;
                }
                MigrationItem a2 = a(migrationItem, this.f28593f, true);
                if (a2 != null) {
                    a2.b(true);
                    this.f28596i.get(a2.f28630c.f28642f).put(a2.f28630c.f28639c, a2);
                    MethodCollector.o(4021);
                    return 0;
                }
                MigrationItem a3 = a(migrationItem, this.f28594g, true);
                if (a3 != null) {
                    a3.b(true);
                    this.f28596i.get(a3.f28630c.f28642f).put(a3.f28630c.f28639c, a3);
                    MethodCollector.o(4021);
                    return 0;
                }
                MigrationItem a4 = a(migrationItem, this.f28595h, true);
                if (a4 != null) {
                    a4.b(true);
                    this.f28596i.get(a4.f28630c.f28642f).put(a4.f28630c.f28639c, a4);
                    MethodCollector.o(4021);
                    return 0;
                }
                MigrationItem a5 = a(migrationItem, this.f28598k, false);
                if (a5 != null) {
                    a5.b(true);
                    MethodCollector.o(4021);
                    return 98;
                } else if (a(migrationItem, this.f28597j, false) != null) {
                    MethodCollector.o(4021);
                    return 97;
                } else {
                    MethodCollector.o(4021);
                    return -1;
                }
            } finally {
                MethodCollector.o(4021);
            }
        }
    }

    private int i(MigrationItem migrationItem) {
        MethodCollector.i(4031);
        synchronized (this.f28592e) {
            try {
                MigrationItem a2 = a(migrationItem, this.f28596i, true);
                if (a2 != null) {
                    if (a2.f28633f == 0) {
                        a2.b(false);
                        this.f28593f.get(a2.f28630c.f28642f).put(a2.f28630c.f28639c, a2);
                        return 0;
                    } else if (a2.f28633f == 1) {
                        a2.b(false);
                        this.f28594g.get(a2.f28630c.f28642f).put(a2.f28630c.f28639c, a2);
                        a();
                        MethodCollector.o(4031);
                        return 0;
                    } else if (a2.f28633f == 4) {
                        a2.b(false);
                        this.f28594g.get(a2.f28630c.f28642f).put(a2.f28630c.f28639c, a2);
                        a();
                        MethodCollector.o(4031);
                        return 0;
                    } else if (a2.f28633f == 2) {
                        a2.b(false);
                        this.f28595h.get(a2.f28630c.f28642f).put(a2.f28630c.f28639c, a2);
                        MethodCollector.o(4031);
                        return 0;
                    }
                }
                MigrationItem a3 = a(migrationItem, this.f28598k, true);
                if (a3 != null) {
                    a3.b(false);
                    this.f28594g.get(a3.f28630c.f28642f).put(a3.f28630c.f28639c, a3);
                    a();
                    MethodCollector.o(4031);
                    return 0;
                } else if (a(migrationItem, this.f28597j, false) != null) {
                    MethodCollector.o(4031);
                    return 97;
                } else {
                    MethodCollector.o(4031);
                    return -1;
                }
            } finally {
                MethodCollector.o(4031);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        if (r2 == null) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        e(r2);
        com.bytedance.disk.parcel.MigrationItem.a.a(r2);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(3969);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(3969);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
        return -1;
     */
    @Override // com.bytedance.disk.a.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c(com.bytedance.disk.parcel.MigrationOpt r9) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.disk.g.a.c(com.bytedance.disk.parcel.MigrationOpt):int");
    }

    @Override // com.bytedance.disk.a.a
    public final int b(MigrationOpt migrationOpt) {
        MethodCollector.i(3670);
        if (!this.o) {
            MethodCollector.o(3670);
            return -1;
        }
        MigrationOpt a2 = MigrationOpt.a(migrationOpt);
        if (!MigrationOpt.a(a2, false)) {
            MigrationOpt.a.a(a2);
            MethodCollector.o(3670);
            return 99;
        }
        MigrationItem a3 = MigrationItem.a.a();
        a3.f28630c = a2;
        synchronized (this.f28592e) {
            try {
                if (a(a3, true, false)) {
                    MigrationItem.a.a(a3);
                    f.a(this.q, 6, a3, null);
                    return 0;
                } else if (b(a3, false)) {
                    MigrationItem.a.a(a3);
                    MethodCollector.o(3670);
                    return 97;
                } else if (c(a3, true, false)) {
                    MigrationItem.a.a(a3);
                    f.a(this.q, 6, a3, null);
                    MethodCollector.o(3670);
                    return 0;
                } else if (d(a3, true, false) || b(a3, true, false) || e(a3, true, false)) {
                    MigrationItem.a.a(a3);
                    f.a(this.q, 6, a3, null);
                    MethodCollector.o(3670);
                    return 0;
                } else {
                    MethodCollector.o(3670);
                    return -1;
                }
            } finally {
                MethodCollector.o(3670);
            }
        }
    }

    public final void c(MigrationItem migrationItem) {
        int i2;
        String a2;
        if (migrationItem.f28630c != null) {
            a(migrationItem, 2);
            g(migrationItem);
            com.bytedance.disk.h.a.a("MMS", "migrationStart %s", migrationItem);
            migrationItem.a(0);
            f(migrationItem);
            f.a(this.q, 2, migrationItem, null);
            HashMap hashMap = new HashMap();
            try {
                if (!com.bytedance.disk.h.c.a(migrationItem.f28630c.f28639c, true) && com.bytedance.disk.h.c.a(migrationItem.f28630c.f28640d, true)) {
                    j(migrationItem);
                    hashMap.put("status", "5");
                    f.a(this.q, 5, migrationItem, hashMap);
                } else if (migrationItem.f28630c.f28642f == 0) {
                    a(migrationItem, new IOException("unknow file type"));
                    hashMap.put("status", "4");
                    f.a(this.q, 5, migrationItem, hashMap);
                } else {
                    if (migrationItem.f28630c.f28642f == 1) {
                        String str = migrationItem.f28630c.f28639c;
                        String str2 = migrationItem.f28630c.f28640d;
                        e.a(str);
                        i2 = e.a(migrationItem, new File(str), new File(str2), null);
                    } else if (migrationItem.f28630c.f28642f == 2) {
                        ArrayList arrayList = new ArrayList();
                        Cursor a3 = a(migrationItem.f28630c.f28639c, new String[]{"mig_opt_from"});
                        if (a3 != null) {
                            while (a3.moveToNext()) {
                                try {
                                    a2 = com.bytedance.disk.h.c.a(a3.getString(0), 0);
                                } catch (Exception unused) {
                                }
                                arrayList.add(a2);
                            }
                            a3.close();
                        }
                        String str3 = migrationItem.f28630c.f28639c;
                        String str4 = migrationItem.f28630c.f28640d;
                        FileFilter fileFilter = this.w;
                        e.b bVar = this.v;
                        e.a(str3);
                        i2 = e.a(migrationItem, new File(str3), new File(str4), fileFilter, arrayList, bVar);
                    } else {
                        return;
                    }
                    if (i2 == 3) {
                        b(migrationItem);
                        hashMap.put("status", "2");
                        f.a(this.q, 5, migrationItem, hashMap);
                    } else if (i2 == 4) {
                        a(migrationItem, false, (String) null);
                        hashMap.put("status", "3");
                        f.a(this.q, 5, migrationItem, hashMap);
                    } else if (i2 == 5) {
                        j(migrationItem);
                        hashMap.put("status", "0");
                        f.a(this.q, 5, migrationItem, hashMap);
                    } else if (i2 == 6) {
                        a(migrationItem, new IOException("smaller disk space"));
                        String b2 = com.bytedance.v.a.b.b();
                        hashMap.put("status", "1");
                        hashMap.put("ava_size", new StringBuilder().append(com.bytedance.disk.h.c.d(b2)).toString());
                        f.a(this.q, 5, migrationItem, hashMap);
                    }
                }
            } catch (Exception e2) {
                if (e2 instanceof IOException) {
                    a(migrationItem, (IOException) e2);
                } else {
                    a(migrationItem, new IOException(e2));
                }
                String b3 = com.bytedance.v.a.b.b();
                hashMap.put("status", "1");
                hashMap.put("ava_size", new StringBuilder().append(com.bytedance.disk.h.c.d(b3)).toString());
                if (e2 instanceof e.a) {
                    hashMap.put("reason", "104");
                } else {
                    hashMap.put("detail-reason", Log.getStackTraceString(e2));
                }
                f.a(this.q, 5, migrationItem, hashMap);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(MigrationItem migrationItem) {
        MethodCollector.i(4504);
        synchronized (this.f28592e) {
            try {
                a(migrationItem, 3);
                if (migrationItem.f28629b != -1) {
                    Map<String, MigrationItem> map = this.f28595h.get(migrationItem.f28630c.f28642f);
                    if (map == null || !map.containsKey(migrationItem.f28630c.f28639c)) {
                        g(migrationItem);
                    }
                } else {
                    Map<String, MigrationItem> map2 = this.f28593f.get(migrationItem.f28630c.f28642f);
                    if (map2 != null && map2.get(migrationItem.f28630c.f28639c) == migrationItem) {
                        map2.remove(migrationItem.f28630c.f28639c);
                    }
                }
            } catch (Throwable th) {
                MethodCollector.o(4504);
                throw th;
            }
        }
        if (migrationItem.f28629b != -1) {
            e(migrationItem);
            com.bytedance.disk.h.a.a("MMS", "migrationCanceled %s", migrationItem);
        }
        MigrationItem.a.a(migrationItem);
        MethodCollector.o(4504);
    }

    private int a(MigrationItem migrationItem, boolean z) {
        MethodCollector.i(4034);
        synchronized (this.f28592e) {
            try {
                MigrationItem a2 = a(migrationItem, this.f28596i, false);
                if (a2 != null) {
                    a2.c(z);
                    return 0;
                }
                MigrationItem a3 = a(migrationItem, this.f28593f, false);
                if (a3 != null) {
                    a3.c(z);
                    MethodCollector.o(4034);
                    return 0;
                }
                MigrationItem a4 = a(migrationItem, this.f28594g, true);
                if (a4 != null) {
                    a4.c(z);
                    MethodCollector.o(4034);
                    return 0;
                }
                MigrationItem a5 = a(migrationItem, this.f28595h, true);
                if (a5 != null) {
                    a5.c(z);
                    MethodCollector.o(4034);
                    return 0;
                }
                MigrationItem a6 = a(migrationItem, this.f28598k, false);
                if (a6 != null) {
                    a6.c(z);
                    MethodCollector.o(4034);
                    return 0;
                } else if (a(migrationItem, this.f28597j, false) != null) {
                    MethodCollector.o(4034);
                    return 97;
                } else {
                    MethodCollector.o(4034);
                    return -1;
                }
            } finally {
                MethodCollector.o(4034);
            }
        }
    }

    private static Cursor a(String str, String[] strArr) {
        if (!com.bytedance.disk.e.a.a.b(5)) {
            return null;
        }
        System.currentTimeMillis();
        Uri uri = a.C0612a.f28581a;
        try {
            str = com.bytedance.disk.h.c.a(str, 1);
        } catch (Exception unused) {
        }
        return com.bytedance.disk.d.b.a(uri, strArr, "mig_opt_dir=? AND mig_event=?", new String[]{str, "5"}, "mig_opt_file_len ASC");
    }

    private boolean b(MigrationItem migrationItem, boolean z) {
        MethodCollector.i(4277);
        synchronized (this.f28592e) {
            try {
                SparseArray<Map<String, MigrationItem>> sparseArray = this.f28597j;
                if (sparseArray != null) {
                    if (a(migrationItem, sparseArray, false) == null) {
                        if (z) {
                            Iterator<Map.Entry<String, MigrationItem>> it = sparseArray.get(2).entrySet().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    MigrationItem value = it.next().getValue();
                                    if (!(value == null || value.f28630c == null || !TextUtils.equals(value.f28630c.f28640d, migrationItem.f28630c.f28640d))) {
                                        break;
                                    }
                                } else {
                                    Iterator<Map.Entry<String, MigrationItem>> it2 = sparseArray.get(0).entrySet().iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            MigrationItem value2 = it2.next().getValue();
                                            if (!(value2 == null || value2.f28630c == null || !TextUtils.equals(value2.f28630c.f28640d, migrationItem.f28630c.f28640d))) {
                                                break;
                                            }
                                        } else {
                                            for (Map.Entry<String, MigrationItem> entry : sparseArray.get(1).entrySet()) {
                                                MigrationItem value3 = entry.getValue();
                                                if (value3 == null || value3.f28630c == null || !TextUtils.equals(value3.f28630c.f28640d, migrationItem.f28630c.f28640d)) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return true;
                }
                MethodCollector.o(4277);
                return false;
            } finally {
                MethodCollector.o(4277);
            }
        }
    }

    private boolean b(MigrationItem migrationItem, boolean z, boolean z2) {
        MigrationItem migrationItem2;
        MethodCollector.i(4177);
        synchronized (this.f28592e) {
            if (z2) {
                try {
                    migrationItem2 = a(migrationItem, this.f28594g, z, false);
                } catch (Throwable th) {
                    MethodCollector.o(4177);
                    throw th;
                }
            } else {
                migrationItem2 = a(migrationItem, this.f28594g, z);
            }
            if (migrationItem2 == null) {
                MethodCollector.o(4177);
                return false;
            }
            if (z) {
                migrationItem2.a(true);
                this.t.sendMessage(this.t.obtainMessage(2, migrationItem2));
            }
            MethodCollector.o(4177);
            return true;
        }
    }

    private boolean d(MigrationItem migrationItem, boolean z, boolean z2) {
        MigrationItem migrationItem2;
        MethodCollector.i(4252);
        synchronized (this.f28592e) {
            if (z2) {
                try {
                    migrationItem2 = a(migrationItem, this.f28595h, z, false);
                } catch (Throwable th) {
                    MethodCollector.o(4252);
                    throw th;
                }
            } else {
                migrationItem2 = a(migrationItem, this.f28595h, z);
            }
            if (migrationItem2 == null) {
                MethodCollector.o(4252);
                return false;
            }
            if (z) {
                migrationItem2.a(true);
                com.bytedance.disk.h.a.a("MMS", "isMigrating pop %s because of %s", migrationItem2, migrationItem);
            }
            MethodCollector.o(4252);
            return true;
        }
    }

    private boolean e(MigrationItem migrationItem, boolean z, boolean z2) {
        MigrationItem migrationItem2;
        MethodCollector.i(4281);
        synchronized (this.f28592e) {
            if (z2) {
                try {
                    migrationItem2 = a(migrationItem, this.f28598k, z, false);
                } catch (Throwable th) {
                    MethodCollector.o(4281);
                    throw th;
                }
            } else {
                migrationItem2 = a(migrationItem, this.f28598k, z);
            }
            if (migrationItem2 == null) {
                MethodCollector.o(4281);
                return false;
            }
            MethodCollector.o(4281);
            return true;
        }
    }

    private boolean c(MigrationItem migrationItem, boolean z, boolean z2) {
        MigrationItem migrationItem2;
        MethodCollector.i(4244);
        synchronized (this.f28592e) {
            if (z2) {
                try {
                    migrationItem2 = a(migrationItem, this.f28596i, false, false);
                } catch (Throwable th) {
                    MethodCollector.o(4244);
                    throw th;
                }
            } else {
                migrationItem2 = a(migrationItem, this.f28596i, false);
            }
            if (migrationItem2 == null) {
                MethodCollector.o(4244);
                return false;
            }
            if (z) {
                migrationItem2.a(true);
                this.t.sendMessage(this.t.obtainMessage(2, migrationItem2));
                com.bytedance.disk.h.a.a("MMS", "isSuspend pop %s because of %s", migrationItem2, migrationItem);
            }
            MethodCollector.o(4244);
            return true;
        }
    }

    private MigrationItem a(MigrationItem migrationItem, SparseArray<Map<String, MigrationItem>> sparseArray, boolean z) {
        if (sparseArray == null) {
            return null;
        }
        AnonymousClass9 r2 = new d.a<String, MigrationItem>() {
            /* class com.bytedance.disk.g.a.AnonymousClass9 */

            static {
                Covode.recordClassIndex(16810);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map, java.lang.Object, boolean] */
            @Override // com.bytedance.disk.h.d.a
            public final /* synthetic */ MigrationItem a(Map<String, MigrationItem> map, String str, boolean z) {
                if (z) {
                    return map.remove(str);
                }
                return map.get(str);
            }
        };
        Map<String, MigrationItem> map = sparseArray.get(2);
        if (!TextUtils.isEmpty(migrationItem.f28630c.f28637a)) {
            return (MigrationItem) r2.a(map, migrationItem.f28630c.f28637a, z);
        }
        MigrationItem migrationItem2 = (MigrationItem) r2.a(map, migrationItem.f28630c.f28639c, z);
        if (migrationItem2 != null) {
            return migrationItem2;
        }
        MigrationItem migrationItem3 = (MigrationItem) r2.a(sparseArray.get(0), migrationItem.f28630c.f28639c, z);
        if (migrationItem3 != null) {
            return migrationItem3;
        }
        return (MigrationItem) r2.a(sparseArray.get(1), migrationItem.f28630c.f28639c, z);
    }

    public a(Context context, int i2, int i3, c cVar) {
        MethodCollector.i(3657);
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        this.u = g.a(a2.a());
        this.x = -1;
        this.y = -1;
        this.q = null;
        this.r = context;
        this.x = i2;
        this.y = i3;
        this.q = cVar;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            this.f28589b = new ParcelFileDescriptor.AutoCloseInputStream(createPipe[0]);
            this.f28590c = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
        } catch (IOException e2) {
            com.bytedance.disk.h.a.a("MMS", "initPipe failed!", e2, new Object[0]);
            this.f28589b = null;
            this.f28590c = null;
        }
        this.f28593f.put(0, new ConcurrentHashMap());
        this.f28593f.put(1, new ConcurrentHashMap());
        this.f28593f.put(2, new ConcurrentHashMap());
        this.f28594g.put(0, new ConcurrentHashMap());
        this.f28594g.put(1, new ConcurrentHashMap());
        this.f28594g.put(2, new ConcurrentHashMap());
        this.f28595h.put(0, new ConcurrentHashMap());
        this.f28595h.put(1, new ConcurrentHashMap());
        this.f28595h.put(2, new ConcurrentHashMap());
        this.f28596i.put(0, new ConcurrentHashMap());
        this.f28596i.put(1, new ConcurrentHashMap());
        this.f28596i.put(2, new ConcurrentHashMap());
        this.f28597j.put(0, new ConcurrentHashMap());
        this.f28597j.put(1, new ConcurrentHashMap());
        this.f28597j.put(2, new ConcurrentHashMap());
        this.f28598k.put(0, new ConcurrentHashMap());
        this.f28598k.put(1, new ConcurrentHashMap());
        this.f28598k.put(2, new ConcurrentHashMap());
        com.bytedance.disk.d.b.a(context).a();
        this.v = new e.b() {
            /* class com.bytedance.disk.g.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(16800);
            }

            @Override // com.bytedance.disk.h.e.b
            public final void a(MigrationItem migrationItem) {
                if (migrationItem.f28629b != -1) {
                    a.f(migrationItem);
                } else {
                    a.d(migrationItem);
                }
                if (a.a(migrationItem)) {
                    migrationItem.f28634g = true;
                    a.f(migrationItem);
                }
            }
        };
        this.w = new FileFilter() {
            /* class com.bytedance.disk.g.a.AnonymousClass4 */

            static {
                Covode.recordClassIndex(16805);
            }

            public final boolean accept(File file) {
                String name = file.getName();
                if (TextUtils.isEmpty(name) || !name.toLowerCase().startsWith(".trashed-")) {
                    return true;
                }
                return false;
            }
        };
        this.p = new b() {
            /* class com.bytedance.disk.g.a.AnonymousClass5 */

            static {
                Covode.recordClassIndex(16806);
            }

            @Override // com.bytedance.disk.e.b.b
            public final void a(Object obj) {
                if (obj != null && (obj instanceof MigrationItem)) {
                    a.this.c((MigrationItem) obj);
                }
            }
        };
        this.s.start();
        this.t = new HandlerC0613a(this.s.getLooper());
        com.bytedance.disk.e.b.a.a(context);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.t.post(new Runnable() {
            /* class com.bytedance.disk.g.a.AnonymousClass6 */

            static {
                Covode.recordClassIndex(16807);
            }

            public final void run() {
                Map<String, MigrationItem> map;
                a aVar = a.this;
                CountDownLatch countDownLatch = countDownLatch;
                System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                Cursor a2 = a.a(5);
                if (a2 != null) {
                    while (a2.moveToNext()) {
                        MigrationItem a3 = MigrationItem.a(a2);
                        if (MigrationOpt.a(a3.f28630c, false) && (map = aVar.f28597j.get(a3.f28630c.f28642f)) != null && !map.containsKey(a3.f28630c.f28639c)) {
                            map.put(a3.f28630c.f28639c, a3);
                        } else if (!a3.f28634g) {
                            aVar.f28599l.add(a3);
                        }
                    }
                    a2.close();
                }
                Cursor a4 = a.a(6);
                if (a4 != null) {
                    while (a4.moveToNext()) {
                        MigrationItem a5 = MigrationItem.a(a4);
                        if (MigrationOpt.a(a5.f28630c, false)) {
                            a5.a();
                            Map<String, MigrationItem> map2 = aVar.f28598k.get(a5.f28630c.f28642f);
                            if (map2 != null && !map2.containsKey(a5.f28630c.f28639c)) {
                                a.a(a5, 0);
                                map2.put(a5.f28630c.f28639c, a5);
                            }
                        }
                    }
                    a4.close();
                }
                Map<String, MigrationItem> map3 = aVar.f28598k.get(2);
                if (map3 != null) {
                    aVar.f28594g.get(2).putAll(map3);
                    map3.clear();
                }
                Map<String, MigrationItem> map4 = aVar.f28598k.get(1);
                if (map4 != null) {
                    aVar.f28594g.get(1).putAll(map4);
                    map4.clear();
                }
                Cursor a6 = a.a(2);
                if (a6 != null) {
                    while (a6.moveToNext()) {
                        MigrationItem a7 = MigrationItem.a(a6);
                        if (MigrationOpt.a(a7.f28630c, false)) {
                            a7.a();
                            Map<String, MigrationItem> map5 = aVar.f28595h.get(a7.f28630c.f28642f);
                            if (map5 != null && !map5.containsKey(a7.f28630c.f28639c)) {
                                a.a(a7, 0);
                                map5.put(a7.f28630c.f28639c, a7);
                            }
                        }
                    }
                    a6.close();
                }
                Map<String, MigrationItem> map6 = aVar.f28595h.get(2);
                if (map6 != null) {
                    aVar.f28594g.get(2).putAll(map6);
                    map6.clear();
                }
                Map<String, MigrationItem> map7 = aVar.f28595h.get(1);
                if (map7 != null) {
                    aVar.f28594g.get(1).putAll(map7);
                    map7.clear();
                }
                Cursor a8 = a.a(4);
                if (a8 != null) {
                    while (a8.moveToNext()) {
                        MigrationItem a9 = MigrationItem.a(a8);
                        if (MigrationOpt.a(a9.f28630c, false)) {
                            a9.a();
                            Map<String, MigrationItem> map8 = aVar.f28596i.get(a9.f28630c.f28642f);
                            if (map8 != null && !map8.containsKey(a9.f28630c.f28639c)) {
                                a.a(a9, 0);
                                map8.put(a9.f28630c.f28639c, a9);
                            }
                        }
                    }
                    a8.close();
                }
                Map<String, MigrationItem> map9 = aVar.f28596i.get(2);
                if (map9 != null) {
                    aVar.f28594g.get(2).putAll(map9);
                    map9.clear();
                }
                Map<String, MigrationItem> map10 = aVar.f28596i.get(1);
                if (map10 != null) {
                    aVar.f28594g.get(1).putAll(map10);
                    map10.clear();
                }
                Cursor a10 = a.a(1);
                if (a10 != null) {
                    while (a10.moveToNext()) {
                        MigrationItem a11 = MigrationItem.a(a10);
                        if (MigrationOpt.a(a11.f28630c, false)) {
                            a11.a();
                            Map<String, MigrationItem> map11 = aVar.f28594g.get(a11.f28630c.f28642f);
                            if (map11 != null && !map11.containsKey(a11.f28630c.f28639c)) {
                                a.a(a11, 1);
                                map11.put(a11.f28630c.f28639c, a11);
                            }
                        }
                    }
                    a10.close();
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    MigrationItem migrationItem = (MigrationItem) it.next();
                    a.e(migrationItem);
                    MigrationItem.a.a(migrationItem);
                }
                arrayList.clear();
                if (!aVar.n.get()) {
                    new Thread(new Runnable() {
                        /* class com.bytedance.disk.g.a.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(16804);
                        }

                        public final void run() {
                            while (true) {
                                MigrationItem c2 = a.this.c();
                                if (c2 == null) {
                                    return;
                                }
                                if (a.a(c2)) {
                                    c2.f28634g = true;
                                    a.f(c2);
                                }
                            }
                        }
                    }, "MS-DEL").start();
                    new Thread(new Runnable() {
                        /* class com.bytedance.disk.g.a.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(16803);
                        }

                        public final void run() {
                            while (true) {
                                MigrationItem b2 = a.this.b();
                                if (!(b2 == null || a.this.q == null)) {
                                    if (b2.f28630c.f28642f == 0) {
                                        a.this.c(b2);
                                    } else {
                                        a.this.q.a(b2, a.this.p, b2.f28630c.f28641e);
                                    }
                                }
                            }
                        }
                    }, "MS-CONS").start();
                    aVar.f28600m.open();
                    aVar.o = true;
                    countDownLatch.countDown();
                }
            }
        });
        new Thread(new Runnable() {
            /* class com.bytedance.disk.g.a.AnonymousClass7 */

            static {
                Covode.recordClassIndex(16808);
            }

            public final void run() {
                a aVar = a.this;
                try {
                    if (!countDownLatch.await(5, TimeUnit.SECONDS)) {
                        com.bytedance.disk.h.a.a("MMS", "Latch wait for " + "waitLateInit" + " elapsed", null, new Object[0]);
                        aVar.o = false;
                        aVar.n.set(true);
                        aVar.f28600m.open();
                    }
                } catch (InterruptedException unused) {
                    aVar.o = false;
                    aVar.n.set(true);
                    aVar.f28600m.open();
                    Thread.currentThread().interrupt();
                    com.bytedance.disk.h.a.a("MMS", "Latch wait for " + "waitLateInit" + " interrupted", null, new Object[0]);
                }
            }
        }).start();
        MethodCollector.o(3657);
    }

    private MigrationItem a(MigrationItem migrationItem, SparseArray<Map<String, MigrationItem>> sparseArray, boolean z, boolean z2) {
        if (sparseArray == null) {
            return null;
        }
        AnonymousClass8 r5 = new d.a<String, MigrationItem>() {
            /* class com.bytedance.disk.g.a.AnonymousClass8 */

            static {
                Covode.recordClassIndex(16809);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map, java.lang.Object, boolean] */
            @Override // com.bytedance.disk.h.d.a
            public final /* synthetic */ MigrationItem a(Map<String, MigrationItem> map, String str, boolean z) {
                if (z) {
                    return map.remove(str);
                }
                return map.get(str);
            }
        };
        Map<String, MigrationItem> map = sparseArray.get(1);
        MigrationItem migrationItem2 = (MigrationItem) r5.a(map, migrationItem.f28630c.f28639c, z);
        if (migrationItem2 == null) {
            migrationItem2 = (MigrationItem) r5.a(map, migrationItem.f28630c.f28640d, z);
            if (migrationItem2 == null) {
                Iterator<MigrationItem> it = map.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    migrationItem2 = it.next();
                    if (TextUtils.equals(migrationItem2.f28630c.f28640d, migrationItem.f28630c.f28639c)) {
                        com.bytedance.disk.h.a.b("MMS", "getItemFromSparsedMapStrictCheck filterSuccess(%s) file duplicate! (%s) vs (%s)", Boolean.valueOf(z2), migrationItem, migrationItem2);
                        break;
                    }
                }
            } else {
                com.bytedance.disk.h.a.b("MMS", "getItemFromSparsedMapStrictCheck filterSuccess(%s) file duplicate! (%s) vs (%s)", Boolean.valueOf(z2), migrationItem, migrationItem2);
            }
        }
        if ((!z2 || migrationItem2.f28633f != 5) && migrationItem2 != null) {
            return migrationItem2;
        }
        Map<String, MigrationItem> map2 = sparseArray.get(0);
        MigrationItem migrationItem3 = (MigrationItem) r5.a(map2, migrationItem.f28630c.f28639c, z);
        if (migrationItem3 == null) {
            migrationItem3 = (MigrationItem) r5.a(map2, migrationItem.f28630c.f28640d, z);
            if (migrationItem3 != null) {
                com.bytedance.disk.h.a.b("MMS", "getItemFromSparsedMapStrictCheck filterSuccess(%s) file duplicate! (%s) vs (%s)", Boolean.valueOf(z2), migrationItem, migrationItem3);
            } else {
                Iterator<MigrationItem> it2 = map2.values().iterator();
                while (it2.hasNext()) {
                    migrationItem3 = it2.next();
                    if (TextUtils.equals(migrationItem3.f28630c.f28640d, migrationItem.f28630c.f28639c)) {
                        com.bytedance.disk.h.a.b("MMS", "getItemFromSparsedMapStrictCheck filterSuccess(%s) file duplicate! (%s) vs (%s)", Boolean.valueOf(z2), migrationItem, migrationItem3);
                    }
                }
                MigrationItem a2 = a(map2, migrationItem, z, r5, z2);
                if (a2 != null) {
                    return a2;
                }
                return a(sparseArray.get(2), migrationItem, z, r5, z2);
            }
        }
        return migrationItem3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        if (r1 == null) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.disk.parcel.MigrationItem a(java.util.Map<java.lang.String, com.bytedance.disk.parcel.MigrationItem> r10, com.bytedance.disk.parcel.MigrationItem r11, boolean r12, com.bytedance.disk.h.d.a<java.lang.String, com.bytedance.disk.parcel.MigrationItem> r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 337
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.disk.g.a.a(java.util.Map, com.bytedance.disk.parcel.MigrationItem, boolean, com.bytedance.disk.h.d$a, boolean):com.bytedance.disk.parcel.MigrationItem");
    }
}
