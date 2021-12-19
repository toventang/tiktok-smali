package com.ss.android.ugc.aweme.draft.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import h.f.b.l;
import h.m.p;
import java.util.Objects;

public final class i {
    @c(a = "uploadId")

    /* renamed from: a  reason: collision with root package name */
    public final String f83214a;
    @c(a = "trackType")

    /* renamed from: b  reason: collision with root package name */
    public int f83215b;
    @c(a = "trackIndex")

    /* renamed from: c  reason: collision with root package name */
    public int f83216c;
    @c(a = "effectPath")

    /* renamed from: d  reason: collision with root package name */
    public String f83217d;
    @c(a = "effectTag")

    /* renamed from: e  reason: collision with root package name */
    public String f83218e;
    @c(a = "seqIn")

    /* renamed from: f  reason: collision with root package name */
    public int f83219f;
    @c(a = "seqOut")

    /* renamed from: g  reason: collision with root package name */
    public int f83220g;
    @c(a = "challenge")

    /* renamed from: h  reason: collision with root package name */
    public AVChallenge f83221h;

    static {
        Covode.recordClassIndex(51881);
    }

    public final String toString() {
        return "DraftVEAudioEffectParam(uploadId=" + this.f83214a + ", trackType=" + this.f83215b + ", trackIndex=" + this.f83216c + ", effectPath=" + this.f83217d + ", effectTag=" + this.f83218e + ", seqIn=" + this.f83219f + ", seqOut=" + this.f83220g + ", challenge=" + this.f83221h + ")";
    }

    private /* synthetic */ i() {
        this("", 0, 0, "", "", 0, 0, null);
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4 = this.f83215b * 31;
        String str = this.f83214a;
        int i5 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (((i4 + i2) * 31) + this.f83216c) * 31;
        String str2 = this.f83217d;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        String str3 = this.f83218e;
        if (str3 != null) {
            i5 = str3.hashCode();
        }
        return ((((i7 + i5) * 31) + this.f83219f) * 31) + this.f83220g;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        AVChallenge aVChallenge;
        AVChallenge aVChallenge2;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!l.a(cls2, cls)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.draft.model.DraftVEAudioEffectParam");
        i iVar = (i) obj;
        if (this.f83215b != iVar.f83215b || !l.a((Object) this.f83214a, (Object) iVar.f83214a) || this.f83216c != iVar.f83216c || !p.a(this.f83217d, iVar.f83217d, false) || !p.a(this.f83218e, iVar.f83218e, false) || this.f83219f != iVar.f83219f || this.f83220g != iVar.f83220g || (((aVChallenge = this.f83221h) == null || (aVChallenge2 = iVar.f83221h) == null || !l.a(aVChallenge, aVChallenge2)) && (this.f83221h != null || iVar.f83221h != null))) {
            return false;
        }
        return true;
    }

    public i(String str, int i2, int i3, String str2, String str3, int i4, int i5, AVChallenge aVChallenge) {
        this.f83214a = str;
        this.f83215b = i2;
        this.f83216c = i3;
        this.f83217d = str2;
        this.f83218e = str3;
        this.f83219f = i4;
        this.f83220g = i5;
        this.f83221h = aVChallenge;
    }
}
