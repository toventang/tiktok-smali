package com.ss.android.ugc.aweme.account.login;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.views.a;
import com.ss.android.ugc.aweme.account.views.c;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    static final Set<String> f65126a = new HashSet(Arrays.asList("AL", "AD", "AT", "BE", "BG", "HR", "CZ", "DK", "EE", "FO", "FI", "FR", "DE", "GI", "GR", "GG", "VA", "HU", "IS", "IE", "IM", "IT", "JE", "LV", "LI", "LT", "LU", "MT", "MC", "NL", "MK", "NO", "PL", "PT", "RO", "SM", "RS", "SK", "SI", "ES", "SJ", "SE", "CH", "GB", "AX"));

    static {
        Covode.recordClassIndex(40027);
    }

    public static void a(Context context, TextView textView, final View.OnClickListener onClickListener, final View.OnClickListener onClickListener2, boolean z) {
        int i2;
        try {
            String str = " " + context.getString(R.string.arc) + " ";
            String str2 = " " + context.getString(R.string.ar6);
            if (z) {
                i2 = R.string.aqq;
            } else {
                i2 = R.string.aq3;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(i2, str, str2));
            int c2 = b.c(context, R.color.a2);
            int c3 = b.c(context, R.color.a2);
            AnonymousClass1 r8 = new c(c2, c3) {
                /* class com.ss.android.ugc.aweme.account.login.z.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(40028);
                }

                public final void onClick(View view) {
                    View.OnClickListener onClickListener = onClickListener;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                }

                @Override // com.ss.android.ugc.aweme.account.views.c
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setFakeBoldText(true);
                    textPaint.setUnderlineText(false);
                }
            };
            AnonymousClass2 r7 = new c(c2, c3) {
                /* class com.ss.android.ugc.aweme.account.login.z.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(40029);
                }

                public final void onClick(View view) {
                    View.OnClickListener onClickListener = onClickListener2;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                }

                @Override // com.ss.android.ugc.aweme.account.views.c
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setFakeBoldText(true);
                    textPaint.setUnderlineText(false);
                }
            };
            String lowerCase = spannableStringBuilder.toString().toLowerCase(Locale.getDefault());
            int indexOf = lowerCase.indexOf(str.toLowerCase(Locale.getDefault()));
            int indexOf2 = lowerCase.indexOf(str2.toLowerCase(Locale.getDefault()));
            if (indexOf < 0 || indexOf2 < 0) {
                com.ss.android.ugc.aweme.account.m.b.a("text_highlight_not_match", "", new com.ss.android.ugc.aweme.app.f.c().a("enter_from", "login").a());
            }
            spannableStringBuilder.setSpan(r8, indexOf + 1, (indexOf + str.length()) - 1, 34);
            spannableStringBuilder.setSpan(r7, indexOf2 + 1, indexOf2 + str2.length(), 34);
            textView.setHighlightColor(b.c(context, R.color.c9));
            textView.setText(spannableStringBuilder);
            textView.setMovementMethod(a.a());
        } catch (Exception e2) {
            e2.getMessage();
        }
    }
}
