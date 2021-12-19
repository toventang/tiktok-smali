package com.ss.android.ugc.aweme.recommend;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.following.a.f;
import com.ss.android.ugc.aweme.music.ui.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;

public final class RecommendSuggestTitleViewHolder extends JediSimpleViewHolder<f> implements au {

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f120041f;

    /* renamed from: g  reason: collision with root package name */
    private final TextView f120042g;

    /* renamed from: j  reason: collision with root package name */
    private final Context f120043j;

    static {
        Covode.recordClassIndex(78021);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(f fVar) {
        f fVar2 = fVar;
        l.d(fVar2, "");
        this.f120042g.setText(fVar2.f96341b);
        this.f120041f.setOnClickListener(new a(this));
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecommendSuggestTitleViewHolder f120044a;

        static {
            Covode.recordClassIndex(78022);
        }

        a(RecommendSuggestTitleViewHolder recommendSuggestTitleViewHolder) {
            this.f120044a = recommendSuggestTitleViewHolder;
        }

        /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendSuggestTitleViewHolder$a$a  reason: collision with other inner class name */
        public static final class C3098a extends ClickableSpan {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Dialog f120045a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f120046b;

            static {
                Covode.recordClassIndex(78023);
            }

            public final void onClick(View view) {
                l.d(view, "");
                Dialog dialog = this.f120045a;
                if (dialog != null && dialog.isShowing()) {
                    this.f120045a.dismiss();
                }
                SmartRouter.buildRoute(this.f120046b.f120044a.f120041f.getContext(), "//privacy/suggest_account").withParam("enter_from", "following_list").withParam("previous_page", "personal_homepage").withParam("is_rec", 1).open();
            }

            public final void updateDrawState(TextPaint textPaint) {
                l.d(textPaint, "");
                Context context = this.f120046b.f120044a.f120041f.getContext();
                l.b(context, "");
                textPaint.setColor(context.getResources().getColor(R.color.bx));
                textPaint.setUnderlineText(false);
            }

            C3098a(Dialog dialog, a aVar) {
                this.f120045a = dialog;
                this.f120046b = aVar;
            }
        }

        public final void onClick(View view) {
            MethodCollector.i(9709);
            ClickAgent.onClick(view);
            if (this.f120044a.f120041f.getContext() != null) {
                View inflate = LayoutInflater.from(this.f120044a.f120041f.getContext()).inflate(R.layout.aqc, (ViewGroup) null);
                View findViewById = inflate.findViewById(R.id.ezf);
                l.b(findViewById, "");
                TextView textView = (TextView) findViewById;
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                Context context = this.f120044a.f120041f.getContext();
                l.b(context, "");
                textView.setHighlightColor(context.getResources().getColor(R.color.c9));
                Context context2 = this.f120044a.f120041f.getContext();
                if (context2 == null) {
                    l.b();
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                    MethodCollector.o(9709);
                    throw nullPointerException;
                }
                l.b(inflate, "");
                Dialog a2 = d.a((Activity) context2, inflate, R.style.v_);
                Context context3 = this.f120044a.f120041f.getContext();
                l.b(context3, "");
                String string = context3.getResources().getString(R.string.cwj);
                l.b(string, "");
                Context context4 = this.f120044a.f120041f.getContext();
                l.b(context4, "");
                String string2 = context4.getResources().getString(R.string.cab, string);
                l.b(string2, "");
                int a3 = p.a((CharSequence) string2, string, 0, false, 6);
                int length = string.length() + a3;
                SpannableString spannableString = new SpannableString(string2);
                if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string) && a3 >= 0) {
                    spannableString.setSpan(new C3098a(a2, this), a3, length, 34);
                    spannableString.setSpan(new StyleSpan(1), a3, length, 34);
                }
                textView.setText(spannableString);
                a2.show();
            }
            r.a("click_suggested_account_information", new com.ss.android.ugc.aweme.app.f.d().a("previous_page", "personal_homepage").a("enter_from", "following_list").f66730a);
            MethodCollector.o(9709);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecommendSuggestTitleViewHolder(View view, Context context) {
        super(view);
        l.d(view, "");
        l.d(context, "");
        this.f120043j = context;
        View findViewById = view.findViewById(R.id.f9o);
        l.b(findViewById, "");
        this.f120042g = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.bls);
        l.b(findViewById2, "");
        this.f120041f = (ImageView) findViewById2;
    }
}
