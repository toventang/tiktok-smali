package com.bytedance.push.settings.storage;

import android.net.Uri;
import com.bytedance.covode.number.Covode;

final class b {

    /* renamed from: a  reason: collision with root package name */
    String f42324a;

    /* renamed from: b  reason: collision with root package name */
    String f42325b;

    /* renamed from: c  reason: collision with root package name */
    String f42326c;

    /* renamed from: d  reason: collision with root package name */
    String f42327d;

    static {
        Covode.recordClassIndex(25857);
    }

    /* access modifiers changed from: package-private */
    public final Uri a(Uri uri) {
        return uri.buildUpon().appendPath(this.f42324a).appendPath(this.f42325b).appendPath(this.f42326c).appendPath(this.f42327d).build();
    }

    b(String str, String str2, String str3, String str4) {
        this.f42324a = str;
        this.f42325b = str2;
        this.f42326c = str3;
        this.f42327d = str4;
    }
}
