package com.ss.android.ugc.aweme.challenge.ui.a;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.fv;
import com.zhiliaoapp.musically.R;
import java.util.regex.Matcher;

public final class f extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    private String f70061a;

    /* renamed from: b  reason: collision with root package name */
    private String f70062b;

    /* renamed from: c  reason: collision with root package name */
    private String f70063c;

    /* renamed from: d  reason: collision with root package name */
    private Context f70064d;

    static {
        Covode.recordClassIndex(43220);
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(b.c(this.f70064d, R.color.jr));
    }

    public final void onClick(View view) {
        r.a("click_tag_link", new d().a("tag_id", this.f70062b).f66730a);
        Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
        if (j2 != null) {
            SmartRouter.buildRoute(j2, "aweme://ame/webview/").withParam(Uri.parse(this.f70061a)).withParam("show_load_dialog", false).withParam("hide_nav_bar", false).withParam("title", "#" + this.f70063c).open();
        }
    }

    private f(Context context, String str, String str2, String str3) {
        this.f70064d = context;
        this.f70061a = str;
        this.f70062b = str2;
        this.f70063c = str3;
    }

    public static SpannableString a(Context context, String str, String str2, String str3) {
        SpannableString spannableString = new SpannableString(str);
        Matcher matcher = fv.f142955a.matcher(str);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String charSequence = str.subSequence(start, end).toString();
            if (com.ss.android.newmedia.d.a(charSequence)) {
                spannableString.setSpan(new f(context, charSequence, str2, str3), start, end, 17);
            }
        }
        return spannableString;
    }
}
