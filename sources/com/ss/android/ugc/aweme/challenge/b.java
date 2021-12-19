package com.ss.android.ugc.aweme.challenge;

import android.app.Activity;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.router.SmartRouter;
import com.ss.android.newmedia.d;
import com.ss.android.ugc.aweme.account.views.c;
import com.ss.android.ugc.aweme.base.utils.h;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.fv;
import com.zhiliaoapp.musically.R;
import java.util.regex.Matcher;

public final class b extends a {

    /* renamed from: b  reason: collision with root package name */
    String f69901b;

    /* renamed from: c  reason: collision with root package name */
    String f69902c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f69903d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f69904e = true;

    static {
        Covode.recordClassIndex(43105);
    }

    @Override // com.ss.android.ugc.aweme.challenge.a
    public final SpannableString a(SpannableString spannableString) {
        String spannableString2 = spannableString.toString();
        Matcher matcher = fv.f142955a.matcher(spannableString2);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            final String charSequence = spannableString2.subSequence(start, end).toString();
            if (d.a(charSequence)) {
                this.f69903d = true;
                spannableString.setSpan(new StyleSpan(0), start, end, 17);
                spannableString.setSpan(new c(h.a((int) R.color.bx), h.a((int) R.color.an)) {
                    /* class com.ss.android.ugc.aweme.challenge.b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(43106);
                    }

                    public final void onClick(View view) {
                        b bVar = b.this;
                        String str = charSequence;
                        r.a("click_tag_link", new com.ss.android.ugc.aweme.app.f.d().a("tag_id", bVar.f69901b).f66730a);
                        Activity j2 = f.j();
                        if (j2 != null) {
                            SmartRouter.buildRoute(j2, "aweme://ame/webview/").withParam(Uri.parse(str)).withParam("show_load_dialog", false).withParam("hide_nav_bar", false).withParam("title", "#" + bVar.f69902c).open();
                        }
                    }
                }, start, end, 17);
            }
        }
        if (this.f69904e) {
            return this.f69870a.a(spannableString);
        }
        return spannableString;
    }

    public b(String str, String str2) {
        this.f69902c = str2;
        this.f69901b = str;
    }
}
