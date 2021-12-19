package com.ss.android.ugc.aweme.qna.vm;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f119662a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f119663b;

    /* renamed from: c  reason: collision with root package name */
    public final String f119664c;

    /* renamed from: d  reason: collision with root package name */
    public final String f119665d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f119666e;

    static {
        Covode.recordClassIndex(77736);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f119662a, bVar.f119662a) && this.f119663b == bVar.f119663b && l.a(this.f119664c, bVar.f119664c) && l.a(this.f119665d, bVar.f119665d) && this.f119666e == bVar.f119666e;
    }

    public final int hashCode() {
        String str = this.f119662a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f119663b;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode + i4) * 31;
        String str2 = this.f119664c;
        int hashCode2 = (i7 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f119665d;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        int i8 = (hashCode2 + i2) * 31;
        if (!this.f119666e) {
            i3 = 0;
        }
        return i8 + i3;
    }

    public final String toString() {
        return "NavigateDialogUiModel(questionId=" + this.f119662a + ", isTranslated=" + this.f119663b + ", questionLanguage=" + this.f119664c + ", questionType=" + this.f119665d + ", showTranslationButton=" + this.f119666e + ")";
    }

    public /* synthetic */ b(String str, boolean z, String str2, boolean z2) {
        this(str, z, str2, null, z2);
    }

    public b(String str, boolean z, String str2, String str3, boolean z2) {
        l.d(str, "");
        l.d(str2, "");
        this.f119662a = str;
        this.f119663b = z;
        this.f119664c = str2;
        this.f119665d = str3;
        this.f119666e = z2;
    }
}
