package com.ss.android.ugc.aweme.filter.repository.a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.ToolsUrlModel;
import h.f.b.l;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final int f95550a;

    /* renamed from: b  reason: collision with root package name */
    public final String f95551b;

    /* renamed from: c  reason: collision with root package name */
    public final String f95552c;

    /* renamed from: d  reason: collision with root package name */
    public final String f95553d;

    /* renamed from: e  reason: collision with root package name */
    public final ToolsUrlModel f95554e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f95555f;

    /* renamed from: g  reason: collision with root package name */
    public final String f95556g;

    /* renamed from: h  reason: collision with root package name */
    public final Uri f95557h;

    /* renamed from: i  reason: collision with root package name */
    public final String f95558i;

    static {
        Covode.recordClassIndex(60550);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f95550a == fVar.f95550a && l.a(this.f95551b, fVar.f95551b) && l.a(this.f95552c, fVar.f95552c) && l.a(this.f95553d, fVar.f95553d) && l.a(this.f95554e, fVar.f95554e) && l.a(this.f95555f, fVar.f95555f) && l.a(this.f95556g, fVar.f95556g) && l.a(this.f95557h, fVar.f95557h) && l.a(this.f95558i, fVar.f95558i);
    }

    public final int hashCode() {
        int i2 = this.f95550a * 31;
        String str = this.f95551b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f95552c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f95553d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        ToolsUrlModel toolsUrlModel = this.f95554e;
        int hashCode4 = (hashCode3 + (toolsUrlModel != null ? toolsUrlModel.hashCode() : 0)) * 31;
        List<String> list = this.f95555f;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        String str4 = this.f95556g;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Uri uri = this.f95557h;
        int hashCode7 = (hashCode6 + (uri != null ? uri.hashCode() : 0)) * 31;
        String str5 = this.f95558i;
        if (str5 != null) {
            i3 = str5.hashCode();
        }
        return hashCode7 + i3;
    }

    public final String toString() {
        return "FilterMeta(id=" + this.f95550a + ", resId=" + this.f95551b + ", name=" + this.f95552c + ", enName=" + this.f95553d + ", resource=" + this.f95554e + ", tags=" + this.f95555f + ", tagsUpdatedAt=" + this.f95556g + ", thumbnail=" + this.f95557h + ", extra=" + this.f95558i + ")";
    }

    public f(int i2, String str, String str2, String str3, ToolsUrlModel toolsUrlModel, List<String> list, String str4, Uri uri, String str5) {
        l.d(str, "");
        l.d(str2, "");
        l.d(list, "");
        this.f95550a = i2;
        this.f95551b = str;
        this.f95552c = str2;
        this.f95553d = str3;
        this.f95554e = toolsUrlModel;
        this.f95555f = list;
        this.f95556g = str4;
        this.f95557h = uri;
        this.f95558i = str5;
    }
}
