package com.ss.android.ugc.aweme.feed.ui;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.ui.bi;
import java.math.BigDecimal;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bj implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final bi f94381a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageView f94382b;

    static {
        Covode.recordClassIndex(59946);
    }

    bj(bi biVar, ImageView imageView) {
        this.f94381a = biVar;
        this.f94382b = imageView;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        bi biVar = this.f94381a;
        ImageView imageView = this.f94382b;
        if (biVar.f94368b) {
            int i2 = (int) biVar.f94369c;
            if (new BigDecimal(Float.toString(biVar.f94369c)).subtract(new BigDecimal(Integer.toString(i2))).floatValue() == 0.0f) {
                i2--;
            }
            if (biVar.f94367a.indexOfChild(view) > i2) {
                biVar.setStar((float) (biVar.f94367a.indexOfChild(view) + 1));
            } else if (biVar.f94367a.indexOfChild(view) != i2) {
                biVar.setStar(((float) biVar.f94367a.indexOfChild(view)) + 1.0f);
            } else if (biVar.f94371e == bi.c.Full) {
            } else {
                if (imageView.getDrawable().getCurrent().getConstantState().equals(biVar.f94370d.getConstantState())) {
                    biVar.setStar((float) (biVar.f94367a.indexOfChild(view) + 1));
                } else {
                    biVar.setStar(((float) biVar.f94367a.indexOfChild(view)) + 0.5f);
                }
            }
        }
    }
}
