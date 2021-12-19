package com.ss.android.ugc.aweme.ax.a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.h;
import h.i;
import h.m;
import org.json.JSONObject;

public final class b implements p {

    /* renamed from: a  reason: collision with root package name */
    public final String f67702a;

    /* renamed from: b  reason: collision with root package name */
    public final String f67703b;

    /* renamed from: c  reason: collision with root package name */
    public final String f67704c;

    /* renamed from: d  reason: collision with root package name */
    private final h f67705d = i.a(m.NONE, new a(this));

    static {
        Covode.recordClassIndex(41672);
    }

    private Uri a() {
        return (Uri) this.f67705d.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f67702a, bVar.f67702a) && l.a(this.f67703b, bVar.f67703b) && l.a(this.f67704c, bVar.f67704c);
    }

    public final int hashCode() {
        String str = this.f67702a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f67703b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f67704c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "ApiRequest(url=" + this.f67702a + ", method=" + this.f67703b + ", body=" + this.f67704c + ")";
    }

    static final class a extends h.f.b.m implements h.f.a.a<Uri> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(41673);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Uri invoke() {
            return Uri.parse(this.this$0.f67702a);
        }
    }

    @Override // com.ss.android.ugc.aweme.ax.a.p
    public final JSONObject getFormatData() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("host", new Uri.Builder().scheme(a().getScheme()).authority(a().getAuthority()).build());
        jSONObject.put("path", a().getPath());
        jSONObject.put("url", new Uri.Builder().scheme(a().getScheme()).authority(a().getAuthority()).path(a().getPath()).build());
        jSONObject.put("method", this.f67703b);
        return jSONObject;
    }

    public b(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f67702a = str;
        this.f67703b = str2;
        this.f67704c = str3;
    }
}
