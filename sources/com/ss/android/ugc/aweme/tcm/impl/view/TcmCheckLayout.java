package com.ss.android.ugc.aweme.tcm.impl.view;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.b;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;

public final class TcmCheckLayout extends FrameLayout {
    static {
        Covode.recordClassIndex(90704);
    }

    public TcmCheckLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TcmCheckLayout f138642a;

        static {
            Covode.recordClassIndex(90705);
        }

        a(TcmCheckLayout tcmCheckLayout) {
            this.f138642a = tcmCheckLayout;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Context context = this.f138642a.getContext();
            l.b(context, "");
            String string = context.getResources().getString(R.string.h_t);
            l.b(string, "");
            Context context2 = this.f138642a.getContext();
            l.b(context2, "");
            String string2 = context2.getResources().getString(R.string.gfi);
            l.b(string2, "");
            Context context3 = this.f138642a.getContext();
            l.b(context3, "");
            String string3 = context3.getResources().getString(R.string.gdv);
            l.b(string3, "");
            SpannableString spannableString = new SpannableString(string);
            int a2 = p.a((CharSequence) string, string2, 0, false, 6);
            int length = string2.length() + a2;
            int a3 = p.a((CharSequence) string, string3, 0, false, 6);
            int length2 = string3.length() + a3;
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && a2 >= 0 && a2 < string.length()) {
                spannableString.setSpan(new StyleSpan(1), a2, length, 17);
                spannableString.setSpan(new ClickableSpan(this, "https://ads.tiktok.com/help/article?aid=6684149081637388293") {
                    /* class com.ss.android.ugc.aweme.tcm.impl.view.TcmCheckLayout.a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f138643a;

                    static {
                        Covode.recordClassIndex(90706);
                    }

                    public final void onClick(View view) {
                        l.d(view, "");
                        SmartRouter.buildRoute(this.f138643a.f138642a.getContext(), "aweme://webview/").withParam("url", "https://ads.tiktok.com/help/article?aid=6684149081637388293").open();
                    }

                    public final void updateDrawState(TextPaint textPaint) {
                        l.d(textPaint, "");
                        textPaint.setColor(b.c(this.f138643a.f138642a.getContext(), R.color.a2));
                        textPaint.setUnderlineText(false);
                    }

                    {
                        this.f138643a = r1;
                    }
                }, a2, length, 17);
            }
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string3) && a3 >= 0 && a3 < string.length()) {
                spannableString.setSpan(new StyleSpan(1), a3, length2, 17);
                spannableString.setSpan(new ClickableSpan(this, "https://www.tiktok.com/community-guidelines?lang=en") {
                    /* class com.ss.android.ugc.aweme.tcm.impl.view.TcmCheckLayout.a.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f138645a;

                    static {
                        Covode.recordClassIndex(90707);
                    }

                    public final void onClick(View view) {
                        l.d(view, "");
                        SmartRouter.buildRoute(this.f138645a.f138642a.getContext(), "aweme://webview/").withParam("url", "https://www.tiktok.com/community-guidelines?lang=en").open();
                    }

                    public final void updateDrawState(TextPaint textPaint) {
                        l.d(textPaint, "");
                        textPaint.setColor(b.c(this.f138645a.f138642a.getContext(), R.color.a2));
                        textPaint.setUnderlineText(false);
                    }

                    {
                        this.f138645a = r1;
                    }
                }, a3, length2, 17);
            }
            DmtTextView dmtTextView = new DmtTextView(this.f138642a.getContext());
            dmtTextView.setText(spannableString);
            dmtTextView.setMovementMethod(new LinkMovementMethod());
            dmtTextView.setGravity(17);
            a.C0731a aVar = new a.C0731a(this.f138642a.getContext());
            aVar.E = true;
            aVar.f33401a = null;
            aVar.J = dmtTextView;
            Context context4 = this.f138642a.getContext();
            l.b(context4, "");
            aVar.a(context4.getResources().getString(R.string.c7), (DialogInterface.OnClickListener) AnonymousClass3.f138647a, false).a().c();
            r.a("show_video_review_detail", new d().f66730a);
        }
    }

    private /* synthetic */ TcmCheckLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TcmCheckLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(7755);
        MethodCollector.o(7755);
    }
}
