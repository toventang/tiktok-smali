package com.facebook.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.i;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final File f46951a;

    static {
        Covode.recordClassIndex(28565);
    }

    @Override // com.facebook.b.a
    public final long b() {
        return this.f46951a.length();
    }

    public final int hashCode() {
        return this.f46951a.hashCode();
    }

    @Override // com.facebook.b.a
    public final InputStream a() {
        MethodCollector.i(651);
        FileInputStream fileInputStream = new FileInputStream(this.f46951a);
        MethodCollector.o(651);
        return fileInputStream;
    }

    private b(File file) {
        this.f46951a = (File) i.a(file);
    }

    public static b a(File file) {
        if (file != null) {
            return new b(file);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        return this.f46951a.equals(((b) obj).f46951a);
    }
}
