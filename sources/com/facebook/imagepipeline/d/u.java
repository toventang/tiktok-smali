package com.facebook.imagepipeline.d;

import android.net.Uri;
import com.a;
import com.bytedance.covode.number.Covode;
import com.facebook.c.a.e;
import com.facebook.common.d.i;
import com.facebook.imagepipeline.common.d;
import java.io.File;

public final class u implements e {

    /* renamed from: a  reason: collision with root package name */
    private final String f47824a;

    /* renamed from: b  reason: collision with root package name */
    private final d f47825b;

    /* renamed from: c  reason: collision with root package name */
    private final String f47826c;

    /* renamed from: d  reason: collision with root package name */
    private final int f47827d;

    static {
        Covode.recordClassIndex(28966);
    }

    @Override // com.facebook.c.a.e
    public final int hashCode() {
        return this.f47827d;
    }

    @Override // com.facebook.c.a.e
    public final String a() {
        return toString();
    }

    @Override // com.facebook.c.a.e
    public final String toString() {
        return a.a(null, "%s_%s_%s_%d", new Object[]{this.f47824a, this.f47825b, this.f47826c, Integer.valueOf(this.f47827d)});
    }

    @Override // com.facebook.c.a.e
    public final boolean a(Uri uri) {
        return this.f47824a.contains(uri.toString());
    }

    @Override // com.facebook.c.a.e
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f47827d != uVar.f47827d || !this.f47824a.equals(uVar.f47824a) || !this.f47825b.equals(uVar.f47825b) || !this.f47826c.equals(uVar.f47826c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public u(String str, d dVar, File file) {
        String str2 = (String) i.a(str);
        this.f47824a = str2;
        this.f47825b = (d) i.a(dVar);
        this.f47826c = Long.toString(((File) i.a(file)).lastModified()) + Long.toString(file.length());
        int hashCode = str2.hashCode();
        this.f47827d = ((((hashCode + 31) * 31) + dVar.hashCode()) * 31) + str2.hashCode();
    }
}
