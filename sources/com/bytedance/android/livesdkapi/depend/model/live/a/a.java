package com.bytedance.android.livesdkapi.depend.model.live.a;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class a {
    @c(a = "user_id")

    /* renamed from: a  reason: collision with root package name */
    public Long f23051a;
    @c(a = "nick_name")

    /* renamed from: b  reason: collision with root package name */
    public String f23052b;
    @c(a = "display_id")

    /* renamed from: c  reason: collision with root package name */
    public String f23053c;
    @c(a = "avatar_thumb")

    /* renamed from: d  reason: collision with root package name */
    public ImageModel f23054d;

    static {
        Covode.recordClassIndex(13667);
    }

    public a(byte b2) {
        this();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f23051a, aVar.f23051a) && l.a(this.f23052b, aVar.f23052b) && l.a(this.f23053c, aVar.f23053c) && l.a(this.f23054d, aVar.f23054d);
    }

    public final int hashCode() {
        Long l2 = this.f23051a;
        int i2 = 0;
        int hashCode = (l2 != null ? l2.hashCode() : 0) * 31;
        String str = this.f23052b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f23053c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        ImageModel imageModel = this.f23054d;
        if (imageModel != null) {
            i2 = imageModel.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "BattleBaseUserInfo(userId=" + this.f23051a + ", nickName=" + this.f23052b + ", displayId=" + this.f23053c + ", avatarThumb=" + this.f23054d + ")";
    }

    private /* synthetic */ a() {
        this(null, null, null, null);
    }

    public a(Long l2, String str, String str2, ImageModel imageModel) {
        this.f23051a = l2;
        this.f23052b = str;
        this.f23053c = str2;
        this.f23054d = imageModel;
    }
}
