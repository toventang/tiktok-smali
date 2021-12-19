package com.ss.android.ugc.aweme.notification.view;

import android.text.TextPaint;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.views.c;
import com.ss.android.ugc.aweme.notification.h.d;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class g extends c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f113977a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final User f113978b;

    /* renamed from: c  reason: collision with root package name */
    private final int f113979c;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f113980e;

    /* renamed from: f  reason: collision with root package name */
    private final d f113981f;

    static {
        Covode.recordClassIndex(73281);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(73282);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void onClick(View view) {
        l.d(view, "");
        this.f113981f.a(view, this.f113978b);
    }

    @Override // com.ss.android.ugc.aweme.account.views.c
    public final void updateDrawState(TextPaint textPaint) {
        l.d(textPaint, "");
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(this.f113980e);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(User user, int i2, boolean z, int i3, int i4, d dVar) {
        super(i3, i4);
        l.d(dVar, "");
        this.f113978b = user;
        this.f113979c = i2;
        this.f113980e = z;
        this.f113981f = dVar;
    }
}
