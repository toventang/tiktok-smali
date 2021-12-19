package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.bytedance.covode.number.Covode;

public final class cb {

    /* renamed from: a  reason: collision with root package name */
    final Uri f50732a;

    /* renamed from: b  reason: collision with root package name */
    final String f50733b;

    /* renamed from: c  reason: collision with root package name */
    final String f50734c;

    static {
        Covode.recordClassIndex(31695);
    }

    public cb(Uri uri) {
        this(uri, "", "");
    }

    public final br<String> a(String str, String str2) {
        return new by(this, str, str2);
    }

    public final br<Long> a(String str, long j2) {
        return new bx(this, str, Long.valueOf(j2));
    }

    public final br<Boolean> a(String str, boolean z) {
        return new bw(this, str, Boolean.valueOf(z));
    }

    private cb(Uri uri, String str, String str2) {
        this.f50732a = uri;
        this.f50733b = str;
        this.f50734c = str2;
    }
}
