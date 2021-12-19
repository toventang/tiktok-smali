package com.ss.android.ugc.aweme.shoutouts.review.view;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shoutouts.review.view.ShoutOutRatingBar;
import java.math.BigDecimal;

final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ShoutOutRatingBar f133470a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageView f133471b;

    static {
        Covode.recordClassIndex(87284);
    }

    a(ShoutOutRatingBar shoutOutRatingBar, ImageView imageView) {
        this.f133470a = shoutOutRatingBar;
        this.f133471b = imageView;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        ShoutOutRatingBar shoutOutRatingBar = this.f133470a;
        ImageView imageView = this.f133471b;
        if (shoutOutRatingBar.f133434b) {
            int i2 = (int) shoutOutRatingBar.f133435c;
            if (new BigDecimal(Float.toString(shoutOutRatingBar.f133435c)).subtract(new BigDecimal(Integer.toString(i2))).floatValue() == 0.0f) {
                i2--;
            }
            if (shoutOutRatingBar.f133433a.indexOfChild(view) > i2) {
                shoutOutRatingBar.setStar((float) (shoutOutRatingBar.f133433a.indexOfChild(view) + 1));
            } else if (shoutOutRatingBar.f133433a.indexOfChild(view) != i2) {
                shoutOutRatingBar.setStar(((float) shoutOutRatingBar.f133433a.indexOfChild(view)) + 1.0f);
            } else if (shoutOutRatingBar.f133437e == ShoutOutRatingBar.c.Full) {
            } else {
                if (imageView.getDrawable().getCurrent().getConstantState().equals(shoutOutRatingBar.f133436d.getConstantState())) {
                    shoutOutRatingBar.setStar((float) (shoutOutRatingBar.f133433a.indexOfChild(view) + 1));
                } else {
                    shoutOutRatingBar.setStar(((float) shoutOutRatingBar.f133433a.indexOfChild(view)) + 0.5f);
                }
            }
        }
    }
}
