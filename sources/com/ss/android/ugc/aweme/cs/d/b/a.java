package com.ss.android.ugc.aweme.cs.d.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cs.d.b.a.b;
import com.ss.android.ugc.aweme.port.in.g;
import h.f.b.l;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f79009a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private final List<b> f79010b = new ArrayList();

    static {
        Covode.recordClassIndex(49045);
    }

    private final void a() {
        this.f79009a.set(true);
    }

    private final void b() {
        this.f79009a.set(false);
    }

    public final void a(b bVar) {
        l.d(bVar, "");
        if (!this.f79010b.contains(bVar)) {
            this.f79010b.add(bVar);
        }
    }

    public final void a(String str) {
        if (str != null) {
            a(g.a().g().c().g(str));
        }
    }

    public final void a(File file) {
        File[] listFiles;
        if (!this.f79009a.get() && file != null && file.exists()) {
            a();
            Iterator<T> it = this.f79010b.iterator();
            while (it.hasNext()) {
                it.next().a(file, true);
            }
            if (!file.isDirectory()) {
                b();
                return;
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(file);
            while (!linkedList.isEmpty() && this.f79009a.get()) {
                File file2 = (File) linkedList.remove();
                if (!(!file2.exists() || (listFiles = file2.listFiles()) == null || listFiles.length == 0)) {
                    for (File file3 : listFiles) {
                        if (file3 != null && file3.exists()) {
                            Iterator<T> it2 = this.f79010b.iterator();
                            while (it2.hasNext()) {
                                it2.next().a(file3, false);
                            }
                            if (file3.isDirectory()) {
                                linkedList.add(file3);
                            }
                        }
                    }
                }
            }
            b();
        }
    }
}
