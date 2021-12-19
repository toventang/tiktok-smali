package com.ss.android.ugc.aweme.cs.d.b.a;

import com.bytedance.covode.number.Covode;
import h.a.ab;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.io.File;
import java.util.Iterator;
import java.util.Set;

public final class a implements b {

    /* renamed from: b  reason: collision with root package name */
    public static final C1838a f79011b = new C1838a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public long f79012a;

    /* renamed from: c  reason: collision with root package name */
    private final Set<String> f79013c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<String> f79014d;

    static {
        Covode.recordClassIndex(49046);
    }

    public a() {
        this(null, null, 3);
    }

    /* renamed from: com.ss.android.ugc.aweme.cs.d.b.a.a$a  reason: collision with other inner class name */
    public static final class C1838a {
        static {
            Covode.recordClassIndex(49047);
        }

        private C1838a() {
        }

        public /* synthetic */ C1838a(byte b2) {
            this();
        }
    }

    private a(Set<String> set, Set<String> set2) {
        l.d(set, "");
        l.d(set2, "");
        this.f79013c = set;
        this.f79014d = set2;
    }

    @Override // com.ss.android.ugc.aweme.cs.d.b.a.b
    public final void a(File file, boolean z) {
        l.d(file, "");
        if (file.isFile()) {
            Iterator<T> it = this.f79013c.iterator();
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
            Iterator<T> it2 = this.f79014d.iterator();
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
            this.f79012a += file.length();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Set set, Set set2, int i2) {
        this((i2 & 1) != 0 ? ab.INSTANCE : set, (i2 & 2) != 0 ? ab.INSTANCE : set2);
    }
}
