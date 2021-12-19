package com.bytedance.ies.ugc.aweme.commercialize.search.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.ui.RichTagView;
import com.bytedance.ies.ugc.aweme.rich.ui.a;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.framework.d.b;
import com.zhiliaoapp.musically.R;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f34724a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(20815);
    }

    public static final void a(RichTagView richTagView, AwemeRawAd awemeRawAd) {
        String labelName;
        if (richTagView != null) {
            richTagView.setVisibility(8);
            if (awemeRawAd != null) {
                a.C0795a a2 = a.C0795a.C0796a.a();
                AwemeTextLabelModel label = awemeRawAd.getLabel();
                if (label != null && (labelName = label.getLabelName()) != null) {
                    richTagView.setVisibility(0);
                    com.bytedance.ies.ugc.aweme.rich.ui.a aVar = a2.a(labelName).b(92).c(richTagView.getResources().getColor(R.color.a4)).a(richTagView.getResources().getColor(R.color.a9)).a((float) b.a(richTagView.getContext(), 2.0f)).f35183a;
                    if (aVar != null) {
                        richTagView.a(aVar);
                    }
                }
            }
        }
    }
}
