package com.ss.android.ugc.aweme.sticker.repository.c;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.f.b.l;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f135485a;

    /* renamed from: b  reason: collision with root package name */
    public final String f135486b;

    /* renamed from: c  reason: collision with root package name */
    public final int f135487c;

    /* renamed from: d  reason: collision with root package name */
    public final int f135488d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, String> f135489e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f135490f;

    /* renamed from: g  reason: collision with root package name */
    public final String f135491g;

    static {
        Covode.recordClassIndex(88545);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f135485a, cVar.f135485a) && l.a(this.f135486b, cVar.f135486b) && this.f135487c == cVar.f135487c && this.f135488d == cVar.f135488d && l.a(this.f135489e, cVar.f135489e) && this.f135490f == cVar.f135490f && l.a(this.f135491g, cVar.f135491g);
    }

    public final int hashCode() {
        String str = this.f135485a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f135486b;
        int hashCode2 = (((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f135487c) * 31) + this.f135488d) * 31;
        Map<String, String> map = this.f135489e;
        int hashCode3 = (hashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        boolean z = this.f135490f;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode3 + i3) * 31;
        String str3 = this.f135491g;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return i6 + i2;
    }

    public final String toString() {
        return "SearchStickerRequest(searchId=" + this.f135485a + ", keyword=" + this.f135486b + ", count=" + this.f135487c + ", cursor=" + this.f135488d + ", extraParams=" + this.f135489e + ", fromGuessTag=" + this.f135490f + ", host=" + this.f135491g + ")";
    }

    private c(String str, String str2, int i2, Map<String, String> map, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(map, "");
        l.d(str3, "");
        this.f135485a = str;
        this.f135486b = str2;
        this.f135487c = i2;
        this.f135488d = 0;
        this.f135489e = map;
        this.f135490f = false;
        this.f135491g = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, String str2, int i2, Map map, String str3, int i3) {
        this((i3 & 1) != 0 ? "0" : str, str2, (i3 & 4) != 0 ? 60 : i2, (i3 & 16) != 0 ? ag.a() : map, (i3 & 64) != 0 ? "" : str3);
    }
}
