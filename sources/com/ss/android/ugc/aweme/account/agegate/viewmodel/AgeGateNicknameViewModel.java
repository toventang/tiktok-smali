package com.ss.android.ugc.aweme.account.agegate.viewmodel;

import android.text.InputFilter;
import android.text.Spanned;
import androidx.lifecycle.ac;
import androidx.lifecycle.r;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.agegate.util.d;
import h.f.b.l;
import h.m.p;
import java.util.regex.Pattern;

public final class AgeGateNicknameViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public String f62849a = "^\\s+.*";

    /* renamed from: b  reason: collision with root package name */
    public String f62850b = "^.*[\r\n]+.*$";

    /* renamed from: c  reason: collision with root package name */
    public InputFilter f62851c = new a(this);

    /* renamed from: d  reason: collision with root package name */
    public r<Boolean> f62852d = new r<>();

    static {
        Covode.recordClassIndex(38712);
    }

    public static final class a implements InputFilter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AgeGateNicknameViewModel f62853a;

        static {
            Covode.recordClassIndex(38713);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(AgeGateNicknameViewModel ageGateNicknameViewModel) {
            this.f62853a = ageGateNicknameViewModel;
        }

        public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
            String str;
            CharSequence charSequence2;
            if (charSequence == null || (str = charSequence.subSequence(i2, i3).toString()) == null) {
                str = "";
            }
            if (spanned != null) {
                charSequence2 = p.a(spanned, i4, i5, str);
            } else {
                charSequence2 = null;
            }
            boolean matches = Pattern.compile(this.f62853a.f62849a).matcher(charSequence2).matches();
            boolean matches2 = Pattern.compile(this.f62853a.f62850b).matcher(charSequence2).matches();
            if ((matches || matches2) && spanned != null) {
                return spanned.subSequence(i4, i5);
            }
            return null;
        }
    }

    public final void a(String str) {
        l.d(str, "");
        if (p.a((CharSequence) str)) {
            this.f62852d.postValue(null);
        } else {
            this.f62852d.postValue(Boolean.valueOf(d.a.a(str)));
        }
    }
}
