package com.bytedance.disk.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.disk.c.a.c;
import java.io.File;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f28530a;

    static {
        Covode.recordClassIndex(16772);
    }

    public final String a() {
        if (this.f28530a != null) {
            try {
                return new File(this.f28530a).getCanonicalPath();
            } catch (Exception unused) {
            }
        }
        return this.f28530a;
    }

    public a(String str) {
        String a2 = c.a(str);
        this.f28530a = a2 != null ? a2 : str;
    }

    public a(String str, String str2) {
        String a2 = c.a(str);
        if (a2 != null) {
            this.f28530a = new File(a2, str2).getPath();
        } else {
            this.f28530a = new File(str, str2).getPath();
        }
    }
}
