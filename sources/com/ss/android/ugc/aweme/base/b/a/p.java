package com.ss.android.ugc.aweme.base.b.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.i18n.language.a.j;

/* access modifiers changed from: package-private */
public final class p implements j {

    /* renamed from: a  reason: collision with root package name */
    private Context f68018a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f68019b;

    static {
        Covode.recordClassIndex(41897);
    }

    @Override // com.ss.android.ugc.aweme.i18n.language.a.j
    public final void a() {
        SharedPreferences.Editor edit = this.f68019b.edit();
        edit.putInt("languageDialogShowState", 3);
        edit.apply();
    }

    public p(Context context) {
        this.f68018a = context;
        this.f68019b = d.a(context, "InitialChooseLanguagePreferences", 0);
    }
}
