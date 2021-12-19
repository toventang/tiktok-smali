package com.ss.android.ugc.aweme.notification.view.template;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final MusNotice f114024a;

    /* renamed from: b  reason: collision with root package name */
    public final int f114025b;

    /* renamed from: c  reason: collision with root package name */
    public final String f114026c;

    /* renamed from: d  reason: collision with root package name */
    public final String f114027d;

    /* renamed from: e  reason: collision with root package name */
    public final String f114028e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f114029f;

    static {
        Covode.recordClassIndex(73318);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f114024a, dVar.f114024a) && this.f114025b == dVar.f114025b && l.a(this.f114026c, dVar.f114026c) && l.a(this.f114027d, dVar.f114027d) && l.a(this.f114028e, dVar.f114028e) && this.f114029f == dVar.f114029f;
    }

    public final int hashCode() {
        MusNotice musNotice = this.f114024a;
        int i2 = 0;
        int hashCode = (((musNotice != null ? musNotice.hashCode() : 0) * 31) + this.f114025b) * 31;
        String str = this.f114026c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f114027d;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f114028e;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        int i3 = (hashCode3 + i2) * 31;
        boolean z = this.f114029f;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "NoticeTemplateBindData(notice=" + this.f114024a + ", clientOrder=" + this.f114025b + ", timelineType=" + this.f114026c + ", tabName=" + this.f114027d + ", enterFrom=" + this.f114028e + ", isSecondPage=" + this.f114029f + ")";
    }

    public d(MusNotice musNotice, int i2, String str, String str2, String str3, boolean z) {
        l.d(musNotice, "");
        l.d(str, "");
        l.d(str3, "");
        this.f114024a = musNotice;
        this.f114025b = i2;
        this.f114026c = str;
        this.f114027d = str2;
        this.f114028e = str3;
        this.f114029f = z;
    }
}
