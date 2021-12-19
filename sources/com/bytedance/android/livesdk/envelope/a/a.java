package com.bytedance.android.livesdk.envelope.a;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class a {
    @c(a = "envelope_id")

    /* renamed from: a  reason: collision with root package name */
    public String f17131a;
    @c(a = "business_type")

    /* renamed from: b  reason: collision with root package name */
    public Integer f17132b;
    @c(a = "envelope_idc")

    /* renamed from: c  reason: collision with root package name */
    public String f17133c;
    @c(a = "send_user_name")

    /* renamed from: d  reason: collision with root package name */
    public String f17134d;
    @c(a = "diamond_count")

    /* renamed from: e  reason: collision with root package name */
    public Integer f17135e;
    @c(a = "people_count")

    /* renamed from: f  reason: collision with root package name */
    public Integer f17136f;
    @c(a = "unpack_at")

    /* renamed from: g  reason: collision with root package name */
    public Integer f17137g;
    @c(a = "send_user_id")

    /* renamed from: h  reason: collision with root package name */
    public String f17138h;
    @c(a = "send_user_avatar")

    /* renamed from: i  reason: collision with root package name */
    public ImageModel f17139i;

    static {
        Covode.recordClassIndex(9509);
    }

    public a(char c2) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f17131a, aVar.f17131a) && l.a(this.f17132b, aVar.f17132b) && l.a(this.f17133c, aVar.f17133c) && l.a(this.f17134d, aVar.f17134d) && l.a(this.f17135e, aVar.f17135e) && l.a(this.f17136f, aVar.f17136f) && l.a(this.f17137g, aVar.f17137g) && l.a(this.f17138h, aVar.f17138h) && l.a(this.f17139i, aVar.f17139i);
    }

    public final int hashCode() {
        String str = this.f17131a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.f17132b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f17133c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f17134d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num2 = this.f17135e;
        int hashCode5 = (hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f17136f;
        int hashCode6 = (hashCode5 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.f17137g;
        int hashCode7 = (hashCode6 + (num4 != null ? num4.hashCode() : 0)) * 31;
        String str4 = this.f17138h;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        ImageModel imageModel = this.f17139i;
        if (imageModel != null) {
            i2 = imageModel.hashCode();
        }
        return hashCode8 + i2;
    }

    public final String toString() {
        return "RedEnvelopInfo(envelopeId=" + this.f17131a + ", businessType=" + this.f17132b + ", envelopeIdc=" + this.f17133c + ", sendUserName=" + this.f17134d + ", diamondCount=" + this.f17135e + ", peopleCount=" + this.f17136f + ", unpackAt=" + this.f17137g + ", sendUserId=" + this.f17138h + ", sendUserAvatar=" + this.f17139i + ")";
    }

    private a() {
        this.f17131a = null;
        this.f17132b = null;
        this.f17133c = null;
        this.f17134d = null;
        this.f17135e = null;
        this.f17136f = null;
        this.f17137g = null;
        this.f17138h = null;
        this.f17139i = null;
    }

    private /* synthetic */ a(byte b2) {
        this();
    }
}
