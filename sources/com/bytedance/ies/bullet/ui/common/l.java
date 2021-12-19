package com.bytedance.ies.bullet.ui.common;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.text.SimpleDateFormat;
import java.util.Locale;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f33112a;

    /* renamed from: b  reason: collision with root package name */
    public final long f33113b;

    static {
        Covode.recordClassIndex(19780);
    }

    public final String toString() {
        return this.f33112a + " [" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(Long.valueOf(this.f33113b)) + ']';
    }

    public l(Uri uri, long j2) {
        h.f.b.l.c(uri, "");
        this.f33112a = uri;
        this.f33113b = j2;
    }
}
