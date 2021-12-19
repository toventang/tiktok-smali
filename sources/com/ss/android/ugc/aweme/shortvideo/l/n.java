package com.ss.android.ugc.aweme.shortvideo.l;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.File;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public String f128690a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f128691b;

    /* renamed from: c  reason: collision with root package name */
    public String f128692c;

    /* renamed from: d  reason: collision with root package name */
    public long f128693d;

    static {
        Covode.recordClassIndex(84358);
    }

    public final String toString() {
        return this.f128690a + ": " + this.f128692c + "  exists?" + this.f128691b + " size: " + this.f128693d;
    }

    public n(String str, String str2) {
        this.f128690a = str;
        this.f128692c = str2;
        if (!TextUtils.isEmpty(str2)) {
            File file = new File(str2);
            if (file.exists() && file.isFile()) {
                this.f128691b = true;
                this.f128693d = file.length();
                return;
            }
        }
        this.f128691b = false;
        this.f128693d = 0;
    }
}
