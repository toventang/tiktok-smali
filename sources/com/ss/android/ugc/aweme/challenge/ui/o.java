package com.ss.android.ugc.aweme.challenge.ui;

import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.challenge.ui.a.e;
import com.ss.android.ugc.aweme.challenge.ui.a.f;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f70179a;

    /* renamed from: b  reason: collision with root package name */
    private final ViewGroup f70180b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f70181c;

    /* renamed from: d  reason: collision with root package name */
    private final SpannableString f70182d;

    /* renamed from: e  reason: collision with root package name */
    private final Challenge f70183e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f70184f;

    /* renamed from: g  reason: collision with root package name */
    private final SpannableString f70185g;

    /* renamed from: h  reason: collision with root package name */
    private final TextView f70186h;

    static {
        Covode.recordClassIndex(43295);
    }

    o(ImageView imageView, ViewGroup viewGroup, TextView textView, SpannableString spannableString, Challenge challenge, boolean z, SpannableString spannableString2, TextView textView2) {
        this.f70179a = imageView;
        this.f70180b = viewGroup;
        this.f70181c = textView;
        this.f70182d = spannableString;
        this.f70183e = challenge;
        this.f70184f = z;
        this.f70185g = spannableString2;
        this.f70186h = textView2;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:29:0x0083 */
    public final void onClick(View view) {
        ClickAgent.onClick(view);
        ImageView imageView = this.f70179a;
        ViewGroup viewGroup = this.f70180b;
        TextView textView = this.f70181c;
        SpannableString spannableString = this.f70182d;
        Challenge challenge = this.f70183e;
        boolean z = this.f70184f;
        SpannableString spannableString2 = this.f70185g;
        TextView textView2 = this.f70186h;
        boolean isSelected = imageView.isSelected();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
        if (!isSelected) {
            textView.setText(f.a(textView.getContext(), spannableString.toString(), challenge.getCid(), challenge.getChallengeName()));
            textView.setOnTouchListener(e.a());
            imageView.setImageResource(l.a(isSelected));
            if (z) {
                marginLayoutParams.bottomMargin = (int) n.b(imageView.getContext(), 20.0f);
            } else {
                marginLayoutParams.topMargin = (int) imageView.getResources().getDimension(R.dimen.ee);
            }
            viewGroup.setLayoutParams(marginLayoutParams);
        } else {
            textView.setText(spannableString2);
            imageView.setImageResource(l.a(isSelected));
            if (z) {
                marginLayoutParams.bottomMargin = (int) n.b(imageView.getContext(), 12.0f);
            } else {
                marginLayoutParams.topMargin = (int) n.b(imageView.getContext(), 0.0f);
            }
            viewGroup.setLayoutParams(marginLayoutParams);
        }
        textView2.setText(textView.getContext().getString(isSelected ? R.string.byo : R.string.bqv));
        imageView.setSelected(!isSelected);
        View view2 = viewGroup;
        if (!isSelected) {
            while ((view2 instanceof View) && (view2.getParent() instanceof View)) {
                view2 = (View) view2.getParent();
                boolean z2 = view2 instanceof ScrollableLayout;
                view2 = view2;
                if (z2) {
                    break;
                }
            }
            if (view2 instanceof ScrollableLayout) {
                ((ScrollableLayout) view2).scrollTo(0, 0);
            }
        }
    }
}
