package com.ss.android.ugc.aweme;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.account.base.a.a;
import com.ss.android.ugc.aweme.account.login.z;
import com.ss.android.ugc.aweme.account.util.o;
import com.ss.android.ugc.aweme.account.views.c;
import com.ss.android.ugc.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Locale;

public final class PrivacyDisclaimerUtilService implements IPrivacyDisclaimerUtil {
    static {
        Covode.recordClassIndex(38398);
    }

    public static IPrivacyDisclaimerUtil a() {
        MethodCollector.i(9256);
        Object a2 = b.a(IPrivacyDisclaimerUtil.class, false);
        if (a2 != null) {
            IPrivacyDisclaimerUtil iPrivacyDisclaimerUtil = (IPrivacyDisclaimerUtil) a2;
            MethodCollector.o(9256);
            return iPrivacyDisclaimerUtil;
        }
        if (b.s == null) {
            synchronized (IPrivacyDisclaimerUtil.class) {
                try {
                    if (b.s == null) {
                        b.s = new PrivacyDisclaimerUtilService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9256);
                    throw th;
                }
            }
        }
        PrivacyDisclaimerUtilService privacyDisclaimerUtilService = (PrivacyDisclaimerUtilService) b.s;
        MethodCollector.o(9256);
        return privacyDisclaimerUtilService;
    }

    @Override // com.ss.android.ugc.aweme.IPrivacyDisclaimerUtil
    public final void a(Context context) {
        l.d(context, "");
        a.C1386a aVar = new a.C1386a();
        aVar.f62886a = o.a("privacy-policy");
        aVar.a(context).show();
    }

    @Override // com.ss.android.ugc.aweme.IPrivacyDisclaimerUtil
    public final void b(Context context) {
        l.d(context, "");
        a.C1386a aVar = new a.C1386a();
        aVar.f62886a = o.a("terms-of-use");
        aVar.a(context).show();
    }

    @Override // com.ss.android.ugc.aweme.IPrivacyDisclaimerUtil
    public final void c(Context context) {
        l.d(context, "");
        a.C1386a aVar = new a.C1386a();
        aVar.f62886a = o.a("virtual-items");
        aVar.a(context).show();
    }

    @Override // com.ss.android.ugc.aweme.IPrivacyDisclaimerUtil
    public final void a(Context context, TextView textView, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3) {
        l.d(context, "");
        l.d(textView, "");
        l.d(onClickListener, "");
        l.d(onClickListener2, "");
        l.d(onClickListener3, "");
        try {
            String string = context.getString(R.string.atf);
            String string2 = context.getString(R.string.ate);
            String string3 = context.getString(R.string.hc2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(R.string.hbe, string, string2, string3));
            int c2 = androidx.core.content.b.c(context, R.color.a2);
            int c3 = androidx.core.content.b.c(context, R.color.a2);
            z.AnonymousClass3 r10 = new c(c2, c3, onClickListener) {
                /* class com.ss.android.ugc.aweme.account.login.z.AnonymousClass3 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ View.OnClickListener f65129a;

                static {
                    Covode.recordClassIndex(40030);
                }

                public final void onClick(View view) {
                    View.OnClickListener onClickListener = this.f65129a;
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

                {
                    this.f65129a = r3;
                }
            };
            z.AnonymousClass4 r6 = new c(c2, c3, onClickListener2) {
                /* class com.ss.android.ugc.aweme.account.login.z.AnonymousClass4 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ View.OnClickListener f65130a;

                static {
                    Covode.recordClassIndex(40031);
                }

                public final void onClick(View view) {
                    View.OnClickListener onClickListener = this.f65130a;
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

                {
                    this.f65130a = r3;
                }
            };
            z.AnonymousClass5 r5 = new c(c2, c3, onClickListener3) {
                /* class com.ss.android.ugc.aweme.account.login.z.AnonymousClass5 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ View.OnClickListener f65131a;

                static {
                    Covode.recordClassIndex(40032);
                }

                public final void onClick(View view) {
                    View.OnClickListener onClickListener = this.f65131a;
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

                {
                    this.f65131a = r3;
                }
            };
            String lowerCase = spannableStringBuilder.toString().toLowerCase(Locale.getDefault());
            int indexOf = lowerCase.indexOf(string.toLowerCase(Locale.getDefault()));
            int indexOf2 = lowerCase.indexOf(string2.toLowerCase(Locale.getDefault()));
            int indexOf3 = lowerCase.indexOf(string3.toLowerCase(Locale.getDefault()));
            if (indexOf < 0 || indexOf2 < 0 || indexOf3 < 0) {
                com.ss.android.ugc.aweme.account.m.b.a("text_highlight_not_match", "", new com.ss.android.ugc.aweme.app.f.c().a("enter_from", "login").a());
            }
            spannableStringBuilder.setSpan(r10, indexOf, string.length() + indexOf, 34);
            spannableStringBuilder.setSpan(r6, indexOf2, string2.length() + indexOf2, 34);
            if (indexOf3 >= 0) {
                spannableStringBuilder.setSpan(r5, indexOf3, string3.length() + indexOf3, 34);
            }
            textView.setHighlightColor(androidx.core.content.b.c(context, R.color.c9));
            textView.setText(spannableStringBuilder);
            textView.setMovementMethod(com.ss.android.ugc.aweme.account.views.a.a());
        } catch (Exception e2) {
            e2.getMessage();
        }
    }
}
