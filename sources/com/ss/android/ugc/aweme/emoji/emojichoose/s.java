package com.ss.android.ugc.aweme.emoji.emojichoose;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.core.h.a.d;
import androidx.fragment.app.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.emoji.b.f;

final /* synthetic */ class s implements a {

    /* renamed from: a  reason: collision with root package name */
    private final f f89300a;

    static {
        Covode.recordClassIndex(56117);
    }

    s(f fVar) {
        this.f89300a = fVar;
    }

    @Override // androidx.fragment.app.a
    public final void a(View view, d dVar) {
        f fVar = this.f89300a;
        if (!TextUtils.isEmpty(fVar.e())) {
            view.setContentDescription(fVar.e());
        }
        dVar.a((CharSequence) TextView.class.getName());
    }
}
