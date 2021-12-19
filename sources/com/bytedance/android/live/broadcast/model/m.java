package com.bytedance.android.live.broadcast.model;

import android.net.Uri;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.g.e;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final String f7931a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7932b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7933c;

    /* renamed from: d  reason: collision with root package name */
    public final long f7934d;

    static {
        Covode.recordClassIndex(3927);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f7933c == mVar.f7933c && this.f7934d == mVar.f7934d;
    }

    public final String toString() {
        return "PreviewBlockInfo(endTime=" + this.f7933c + ", logId=" + this.f7934d + ")";
    }

    public final int hashCode() {
        long j2 = this.f7933c;
        long j3 = this.f7934d;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public m(long j2, long j3) {
        String a2;
        this.f7933c = j2;
        this.f7934d = j3;
        if (j2 == -1) {
            a2 = y.a((int) R.string.ecn);
        } else {
            Date date = new Date(j2 * 1000);
            String a3 = y.a((int) R.string.ecp);
            l.b(a3, "");
            String format = new SimpleDateFormat("HH:mm", Locale.ENGLISH).format(date);
            l.b(format, "");
            String a4 = p.a(a3, "{0}", format);
            String format2 = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).format(date);
            l.b(format2, "");
            a2 = p.a(a4, "{1}", format2);
        }
        this.f7931a = a2 == null ? "" : a2;
        String uri = Uri.parse(e.a()).buildUpon().appendQueryParameter("id", String.valueOf(j3)).build().toString();
        l.b(uri, "");
        this.f7932b = uri;
    }
}
