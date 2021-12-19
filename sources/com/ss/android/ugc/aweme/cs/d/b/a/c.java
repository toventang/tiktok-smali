package com.ss.android.ugc.aweme.cs.d.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.port.in.g;
import h.a.ab;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class c implements b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f79015c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f79016a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f79017b;

    /* renamed from: d  reason: collision with root package name */
    private final List<File> f79018d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<String> f79019e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<String> f79020f;

    static {
        Covode.recordClassIndex(49049);
    }

    public c() {
        this(null, null, 3);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49050);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        for (T t : this.f79018d) {
            a(t);
            g.a().g().a().a(t);
        }
        this.f79018d.clear();
    }

    private static boolean a(File file) {
        MethodCollector.i(9187);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(9187);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(9187);
        return delete;
    }

    public c(Set<String> set, Set<String> set2) {
        l.d(set, "");
        l.d(set2, "");
        this.f79019e = set;
        this.f79020f = set2;
        this.f79017b = true;
        this.f79018d = new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.cs.d.b.a.b
    public final void a(File file, boolean z) {
        l.d(file, "");
        if (this.f79017b && z && file.isDirectory()) {
            return;
        }
        if (this.f79016a || !file.isDirectory()) {
            Iterator<T> it = this.f79019e.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (i2 < 0) {
                    n.a();
                }
                String path = file.getPath();
                l.b(path, "");
                if (!p.b(path, (String) next, false)) {
                    i2++;
                } else if (i2 != -1) {
                    return;
                }
            }
            Iterator<T> it2 = this.f79020f.iterator();
            int i3 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                T next2 = it2.next();
                if (i3 < 0) {
                    n.a();
                }
                String path2 = file.getPath();
                l.b(path2, "");
                if (!p.a((CharSequence) path2, (CharSequence) next2, false)) {
                    i3++;
                } else if (i3 != -1) {
                    return;
                }
            }
            this.f79018d.add(0, file);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Set set, Set set2, int i2) {
        this((i2 & 1) != 0 ? ab.INSTANCE : set, (i2 & 2) != 0 ? ab.INSTANCE : set2);
    }
}
