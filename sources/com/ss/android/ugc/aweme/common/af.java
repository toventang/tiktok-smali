package com.ss.android.ugc.aweme.common;

import android.text.TextPaint;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.s;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class af extends s {

    /* renamed from: d  reason: collision with root package name */
    public final User f76389d;

    /* renamed from: e  reason: collision with root package name */
    public final int f76390e = 1;

    /* renamed from: f  reason: collision with root package name */
    public final a f76391f;

    public interface a {
        static {
            Covode.recordClassIndex(47144);
        }

        void a(View view, User user, int i2);
    }

    static {
        Covode.recordClassIndex(47143);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.s
    public final void updateDrawState(TextPaint textPaint) {
        l.d(textPaint, "");
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(true);
    }

    public final void onClick(View view) {
        l.d(view, "");
        a aVar = this.f76391f;
        if (aVar != null) {
            aVar.a(view, this.f76389d, this.f76390e);
        }
    }

    public af(User user, a aVar, int i2, int i3) {
        super(i2, i3);
        this.f76389d = user;
        this.f76391f = aVar;
    }
}
