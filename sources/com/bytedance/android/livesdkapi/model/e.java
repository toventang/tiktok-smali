package com.bytedance.android.livesdkapi.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Long f23287a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23288b;

    /* renamed from: c  reason: collision with root package name */
    public final String f23289c;

    /* renamed from: d  reason: collision with root package name */
    public final String f23290d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageModel f23291e;

    static {
        Covode.recordClassIndex(13844);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f23287a, eVar.f23287a) && l.a(this.f23288b, eVar.f23288b) && l.a(this.f23289c, eVar.f23289c) && l.a(this.f23290d, eVar.f23290d) && l.a(this.f23291e, eVar.f23291e);
    }

    public final int hashCode() {
        Long l2 = this.f23287a;
        int i2 = 0;
        int hashCode = (l2 != null ? l2.hashCode() : 0) * 31;
        String str = this.f23288b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f23289c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f23290d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        ImageModel imageModel = this.f23291e;
        if (imageModel != null) {
            i2 = imageModel.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "LiveIMUser(uid=" + this.f23287a + ", secUid=" + this.f23288b + ", nickName=" + this.f23289c + ", displayId=" + this.f23290d + ", avatar=" + this.f23291e + ")";
    }

    private /* synthetic */ e() {
        this(null, null, null, null, null);
    }

    public e(Long l2, String str, String str2, String str3, ImageModel imageModel) {
        this.f23287a = l2;
        this.f23288b = str;
        this.f23289c = str2;
        this.f23290d = str3;
        this.f23291e = imageModel;
    }
}
