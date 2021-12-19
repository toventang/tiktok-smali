package com.bytedance.disk.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.disk.a.b;
import com.bytedance.disk.e.d;
import com.bytedance.disk.parcel.MigrationItem;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

public class a extends b.a {

    /* renamed from: b  reason: collision with root package name */
    public static AtomicBoolean f28549b = new AtomicBoolean(true);

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f28550c;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<d> f28551a = new ArrayList<>(2);

    static {
        Covode.recordClassIndex(16779);
    }

    private a() {
    }

    public static a a() {
        MethodCollector.i(1971);
        if (f28550c == null) {
            synchronized (a.class) {
                try {
                    if (f28550c == null) {
                        f28550c = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1971);
                    throw th;
                }
            }
        }
        a aVar = f28550c;
        MethodCollector.o(1971);
        return aVar;
    }

    @Override // com.bytedance.disk.a.b
    public final void a(MigrationItem migrationItem) {
        MethodCollector.i(1972);
        synchronized (this.f28551a) {
            try {
                f28549b.set(false);
                Iterator<d> it = this.f28551a.iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    if (next != null) {
                        next.a(migrationItem.f28630c.f28639c, migrationItem.f28633f);
                    }
                }
                f28549b.set(true);
            } finally {
                MethodCollector.o(1972);
            }
        }
    }
}
