package com.ss.android.ugc.aweme.notification.view.template;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.repo.list.bean.e;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final e f114031a;

    /* renamed from: b  reason: collision with root package name */
    public final View f114032b;

    /* renamed from: c  reason: collision with root package name */
    public final String f114033c;

    /* renamed from: d  reason: collision with root package name */
    public final h f114034d;

    /* renamed from: e  reason: collision with root package name */
    public final int f114035e;

    /* renamed from: f  reason: collision with root package name */
    public final String f114036f;

    /* renamed from: g  reason: collision with root package name */
    public final String f114037g;

    /* renamed from: h  reason: collision with root package name */
    public final String f114038h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f114039i;

    static {
        Covode.recordClassIndex(73320);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f114031a, fVar.f114031a) && l.a(this.f114032b, fVar.f114032b) && l.a(this.f114033c, fVar.f114033c) && l.a(this.f114034d, fVar.f114034d) && this.f114035e == fVar.f114035e && l.a(this.f114036f, fVar.f114036f) && l.a(this.f114037g, fVar.f114037g) && l.a(this.f114038h, fVar.f114038h) && this.f114039i == fVar.f114039i;
    }

    public final int hashCode() {
        e eVar = this.f114031a;
        int i2 = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        View view = this.f114032b;
        int hashCode2 = (hashCode + (view != null ? view.hashCode() : 0)) * 31;
        String str = this.f114033c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        h hVar = this.f114034d;
        int hashCode4 = (((hashCode3 + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f114035e) * 31;
        String str2 = this.f114036f;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f114037g;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f114038h;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        int i3 = (hashCode6 + i2) * 31;
        boolean z = this.f114039i;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "NoticeTemplateClickData(notice=" + this.f114031a + ", view=" + this.f114032b + ", schema=" + this.f114033c + ", position=" + this.f114034d + ", clientOrder=" + this.f114035e + ", timelineType=" + this.f114036f + ", tabName=" + this.f114037g + ", enterFrom=" + this.f114038h + ", isSecondPage=" + this.f114039i + ")";
    }

    public f(e eVar, View view, String str, h hVar, int i2, String str2, String str3, String str4, boolean z) {
        l.d(eVar, "");
        l.d(hVar, "");
        l.d(str2, "");
        l.d(str4, "");
        this.f114031a = eVar;
        this.f114032b = view;
        this.f114033c = str;
        this.f114034d = hVar;
        this.f114035e = i2;
        this.f114036f = str2;
        this.f114037g = str3;
        this.f114038h = str4;
        this.f114039i = z;
    }
}
