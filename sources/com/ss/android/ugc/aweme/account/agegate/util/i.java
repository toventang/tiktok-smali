package com.ss.android.ugc.aweme.account.agegate.util;

import android.text.InputFilter;
import android.text.Spanned;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.agegate.model.g;
import h.f.a.b;
import h.f.b.l;
import h.m.p;
import h.z;
import java.util.regex.Pattern;

public final class i implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    private final g[] f62847a;

    /* renamed from: b  reason: collision with root package name */
    private final b<Integer, z> f62848b;

    static {
        Covode.recordClassIndex(38711);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public i(g[] gVarArr, b<? super Integer, z> bVar) {
        l.d(gVarArr, "");
        l.d(bVar, "");
        this.f62847a = gVarArr;
        this.f62848b = bVar;
    }

    public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        String str;
        if (charSequence == null || (str = charSequence.subSequence(i2, i3).toString()) == null) {
            str = "";
        }
        CharSequence a2 = spanned != null ? p.a(spanned, i4, i5, str) : null;
        g[] gVarArr = this.f62847a;
        for (g gVar : gVarArr) {
            if (!Pattern.compile(gVar.f62793a).matcher(a2).matches()) {
                this.f62848b.invoke(Integer.valueOf(gVar.f62794b));
                if (spanned != null) {
                    return spanned.subSequence(i4, i5);
                }
                return null;
            }
        }
        return null;
    }
}
