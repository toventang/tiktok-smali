package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;

public final class ag {

    /* renamed from: a  reason: collision with root package name */
    static final Set<String> f124942a = new LinkedHashSet();

    /* renamed from: b  reason: collision with root package name */
    public static final ag f124943b = new ag();

    private ag() {
    }

    static {
        Covode.recordClassIndex(82078);
    }

    public static final void a(String str) {
        l.d(str, "");
        f124942a.remove(str);
    }

    static final class a<I, O> implements androidx.a.a.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Set f124944a;

        static {
            Covode.recordClassIndex(82079);
        }

        a(Set set) {
            this.f124944a = set;
        }

        @Override // androidx.a.a.c.a
        public final /* synthetic */ Object a(Object obj) {
            File file = (File) obj;
            Set set = this.f124944a;
            l.b(file, "");
            return Boolean.valueOf(!set.contains(file.getPath()));
        }
    }
}
