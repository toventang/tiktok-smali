package com.bytedance.android.livesdkapi.depend.model.live.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class d {
    @c(a = "user_id")

    /* renamed from: a  reason: collision with root package name */
    public long f23066a;
    @c(a = "combo_status")

    /* renamed from: b  reason: collision with root package name */
    public long f23067b;
    @c(a = "combo_count")

    /* renamed from: c  reason: collision with root package name */
    public long f23068c;
    @c(a = "combo_icon_url")

    /* renamed from: d  reason: collision with root package name */
    public String f23069d;
    @c(a = "combo_type")

    /* renamed from: e  reason: collision with root package name */
    public int f23070e;
    @c(a = "combo_rule_guide_schema")

    /* renamed from: f  reason: collision with root package name */
    public String f23071f;

    static {
        Covode.recordClassIndex(13671);
    }

    public d(char c2) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f23066a == dVar.f23066a && this.f23067b == dVar.f23067b && this.f23068c == dVar.f23068c && l.a(this.f23069d, dVar.f23069d) && this.f23070e == dVar.f23070e && l.a(this.f23071f, dVar.f23071f);
    }

    public final String toString() {
        return "BattleComboInfo(userId=" + this.f23066a + ", comboStatus=" + this.f23067b + ", comboCount=" + this.f23068c + ", comboIconUrl=" + this.f23069d + ", comboType=" + this.f23070e + ", comboRuleGuideSchema=" + this.f23071f + ")";
    }

    private d() {
        this.f23066a = 0;
        this.f23067b = 0;
        this.f23068c = 0;
        this.f23069d = null;
        this.f23070e = 0;
        this.f23071f = null;
    }

    public final int hashCode() {
        int i2;
        long j2 = this.f23066a;
        long j3 = this.f23067b;
        long j4 = this.f23068c;
        int i3 = ((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        String str = this.f23069d;
        int i4 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (((i3 + i2) * 31) + this.f23070e) * 31;
        String str2 = this.f23071f;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return i5 + i4;
    }

    public /* synthetic */ d(byte b2) {
        this();
    }
}
