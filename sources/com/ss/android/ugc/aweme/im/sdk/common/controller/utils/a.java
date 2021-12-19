package com.ss.android.ugc.aweme.im.sdk.common.controller.utils;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.h.a.d;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f102349a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(65511);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.a$a  reason: collision with other inner class name */
    public static final class C2564a extends androidx.core.h.a {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f102350b;

        static {
            Covode.recordClassIndex(65512);
        }

        C2564a(String str) {
            this.f102350b = str;
        }

        @Override // androidx.core.h.a
        public final void a(View view, d dVar) {
            l.d(view, "");
            l.d(dVar, "");
            super.a(view, dVar);
            if (!TextUtils.isEmpty(this.f102350b)) {
                view.setContentDescription(this.f102350b);
            }
            dVar.a((CharSequence) TextView.class.getName());
        }
    }

    public static final class b extends androidx.core.h.a {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IMContact f102355b;

        static {
            Covode.recordClassIndex(65513);
        }

        b(IMContact iMContact) {
            this.f102355b = iMContact;
        }

        @Override // androidx.core.h.a
        public final void a(View view, d dVar) {
            l.d(view, "");
            l.d(dVar, "");
            super.a(view, dVar);
            view.setContentDescription(this.f102355b.getDisplayName());
            dVar.a((CharSequence) TextView.class.getName());
        }
    }

    public static final void a(View view, String str) {
        if (view != null && str != null) {
            v.a(view, new C2564a(str));
        }
    }

    public static final void a(ImageView imageView, IMContact iMContact) {
        if (imageView != null && iMContact != null) {
            v.a(imageView, new b(iMContact));
        }
    }
}
