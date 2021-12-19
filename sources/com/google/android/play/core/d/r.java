package com.google.android.play.core.d;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.Objects;

/* access modifiers changed from: package-private */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final File f53218a;

    /* renamed from: b  reason: collision with root package name */
    public final String f53219b;

    static {
        Covode.recordClassIndex(32892);
    }

    r() {
    }

    r(File file, String str) {
        this();
        Objects.requireNonNull(file, "Null splitFile");
        this.f53218a = file;
        Objects.requireNonNull(str, "Null splitId");
        this.f53219b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            return this.f53218a.equals(rVar.f53218a) && this.f53219b.equals(rVar.f53219b);
        }
    }

    public final int hashCode() {
        return ((this.f53218a.hashCode() ^ 1000003) * 1000003) ^ this.f53219b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f53218a);
        String str = this.f53219b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35 + str.length());
        sb.append("SplitFileInfo{splitFile=");
        sb.append(valueOf);
        sb.append(", splitId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
