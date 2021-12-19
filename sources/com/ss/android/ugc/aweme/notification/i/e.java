package com.ss.android.ugc.aweme.notification.i;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.UgAllServiceImpl;
import com.ss.android.ugc.aweme.base.utils.h;
import com.ss.android.ugc.aweme.discover.ui.NoticeView;
import com.ss.android.ugc.aweme.newfollow.ui.e;
import com.ss.android.ugc.aweme.notification.ab.b;
import com.ss.android.ugc.aweme.notification.i.i;
import com.ss.android.ugc.aweme.notification.utils.n;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class e extends i.a {

    /* renamed from: a  reason: collision with root package name */
    private com.ss.android.ugc.aweme.newfollow.ui.e f113765a;

    static {
        Covode.recordClassIndex(73138);
    }

    public static final class a implements e.b {
        static {
            Covode.recordClassIndex(73139);
        }

        a() {
        }

        @Override // com.ss.android.ugc.aweme.newfollow.ui.e.b
        public final void b(Context context) {
            UgAllServiceImpl.c().c(context);
        }

        @Override // com.ss.android.ugc.aweme.newfollow.ui.e.b
        public final boolean a(Context context) {
            return UgAllServiceImpl.c().d(context);
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.i.i.a
    public final void d() {
        com.ss.android.ugc.aweme.newfollow.ui.e eVar;
        if (b.f113114a.getEnablePushGuide() != 0 && (eVar = this.f113765a) != null) {
            eVar.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.i.i.a
    public final void f() {
        super.f();
        n.a((Bundle) null, 0);
    }

    @Override // com.ss.android.ugc.aweme.notification.i.i.a
    public final void a(View view, Bundle bundle) {
        l.d(view, "");
        NoticeView noticeView = (NoticeView) c(R.id.bcf);
        noticeView.setIconImage(2131231267);
        SpannableString spannableString = new SpannableString(h.b(R.string.cld));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(h.b(R.string.cle) + " ");
        if (j().getContext() != null) {
            Context context = j().getContext();
            if (context == null) {
                l.b();
            }
            spannableString.setSpan(new ForegroundColorSpan(androidx.core.content.b.c(context, R.color.bh)), 0, spannableString.length(), 34);
            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 18);
            spannableStringBuilder.append((CharSequence) spannableString);
        }
        noticeView.setTitleText(spannableStringBuilder);
        n.a(noticeView);
        com.ss.android.ugc.aweme.newfollow.ui.e eVar = new com.ss.android.ugc.aweme.newfollow.ui.e(noticeView, new a());
        this.f113765a = eVar;
        eVar.f112625f = e.a.Message;
        b.f113114a.getEnablePushGuide();
        if (b.f113114a.getEnablePushGuide() != 0) {
            com.ss.android.ugc.aweme.newfollow.ui.e eVar2 = this.f113765a;
            if (eVar2 == null) {
                l.b();
            }
            eVar2.a();
        }
    }
}
