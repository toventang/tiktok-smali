package com.bytedance.sdk.bdlynx.d;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public List<String> f43698a;

    /* renamed from: b  reason: collision with root package name */
    public String f43699b;

    /* renamed from: c  reason: collision with root package name */
    public Uri f43700c;

    static {
        Covode.recordClassIndex(26744);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f43698a, cVar.f43698a) && l.a(this.f43699b, cVar.f43699b) && l.a(this.f43700c, cVar.f43700c);
    }

    public final int hashCode() {
        List<String> list = this.f43698a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f43699b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Uri uri = this.f43700c;
        if (uri != null) {
            i2 = uri.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "ReWriterInfo(resPrefix=" + this.f43698a + ", resPath=" + this.f43699b + ", templateUri=" + this.f43700c + ")";
    }

    private c() {
        this.f43698a = null;
        this.f43699b = null;
        this.f43700c = null;
    }

    public /* synthetic */ c(byte b2) {
        this();
    }
}
