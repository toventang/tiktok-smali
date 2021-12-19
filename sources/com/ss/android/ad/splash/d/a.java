package com.ss.android.ad.splash.d;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ad.splash.f.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f58935a;

    /* renamed from: b  reason: collision with root package name */
    private String f58936b;

    /* renamed from: c  reason: collision with root package name */
    private String f58937c;

    /* renamed from: d  reason: collision with root package name */
    private String f58938d;

    static {
        Covode.recordClassIndex(36459);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!l.a(this.f58936b)) {
            sb.append("&iid=").append(Uri.encode(this.f58936b));
        }
        if (!l.a(this.f58935a)) {
            sb.append("&device_id=").append(Uri.encode(this.f58935a));
        }
        if (!l.a(this.f58938d)) {
            sb.append("&openudid=").append(Uri.encode(this.f58938d));
        }
        if (!l.a(this.f58937c)) {
            sb.append("&uuid=").append(Uri.encode(this.f58937c));
        }
        return sb.toString();
    }
}
