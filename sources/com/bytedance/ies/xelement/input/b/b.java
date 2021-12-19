package com.bytedance.ies.xelement.input.b;

import android.text.Spannable;
import android.text.SpannableString;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f37132a;

    /* renamed from: b  reason: collision with root package name */
    public String f37133b;

    static {
        Covode.recordClassIndex(22336);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f37132a, bVar.f37132a) && l.a(this.f37133b, bVar.f37133b);
    }

    public final int hashCode() {
        String str = this.f37132a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f37133b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "LynxMentionSpan(name=" + this.f37132a + ", symbol=" + this.f37133b + ")";
    }

    public /* synthetic */ b(String str) {
        this(str, "@");
    }

    public b(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        this.f37132a = str;
        this.f37133b = str2;
    }

    public static Spannable a(CharSequence charSequence, Object... objArr) {
        l.c(charSequence, "");
        l.c(objArr, "");
        SpannableString valueOf = SpannableString.valueOf(charSequence);
        int i2 = 0;
        do {
            valueOf.setSpan(objArr[0], 0, valueOf.length(), 33);
            i2++;
        } while (i2 <= 0);
        l.a((Object) valueOf, "");
        return valueOf;
    }
}
