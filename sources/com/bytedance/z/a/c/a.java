package com.bytedance.z.a.c;

import com.bytedance.covode.number.Covode;
import java.io.File;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public b f46299a;

    /* renamed from: b  reason: collision with root package name */
    private String f46300b;

    /* renamed from: c  reason: collision with root package name */
    private File f46301c;

    static {
        Covode.recordClassIndex(28262);
    }

    /* access modifiers changed from: protected */
    public b a(File file) {
        return null;
    }

    public b a() {
        if (this.f46300b == null) {
            return null;
        }
        if (this.f46301c == null) {
            this.f46301c = new File(this.f46300b);
        }
        b a2 = a(this.f46301c);
        this.f46299a = a2;
        return a2;
    }

    public String toString() {
        return "BaseStatFile{mPath='" + this.f46300b + '\'' + ", mFile=" + this.f46301c + ", mLastInfo=" + this.f46299a + '}';
    }

    public a(String str) {
        this.f46300b = str;
    }
}
