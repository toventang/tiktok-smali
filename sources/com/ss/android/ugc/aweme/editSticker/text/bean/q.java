package com.ss.android.ugc.aweme.editSticker.text.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class q {

    /* renamed from: e  reason: collision with root package name */
    public static final a f88443e = new a((byte) 0);
    @c(a = "anchor_business_type")

    /* renamed from: a  reason: collision with root package name */
    public int f88444a = -1;
    @c(a = "source")

    /* renamed from: b  reason: collision with root package name */
    public int f88445b = 0;
    @c(a = "anchor_id")

    /* renamed from: c  reason: collision with root package name */
    public String f88446c = null;
    @c(a = "anchor_content")

    /* renamed from: d  reason: collision with root package name */
    public String f88447d = null;

    static {
        Covode.recordClassIndex(55668);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f88444a == qVar.f88444a && this.f88445b == qVar.f88445b && l.a(this.f88446c, qVar.f88446c) && l.a(this.f88447d, qVar.f88447d);
    }

    public final int hashCode() {
        int i2 = ((this.f88444a * 31) + this.f88445b) * 31;
        String str = this.f88446c;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f88447d;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "TempPublishAnchorModel(anchorBusinessType=" + this.f88444a + ", source=" + this.f88445b + ", anchorId=" + this.f88446c + ", anchorContent=" + this.f88447d + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(55669);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private q() {
    }

    public final boolean a() {
        if (this.f88444a != 0 || this.f88446c == null || this.f88447d == null) {
            return false;
        }
        return true;
    }
}
