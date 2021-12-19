package com.ss.android.ugc.aweme.feed.ui;

import android.graphics.Color;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Boost;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

final /* synthetic */ class ce implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final cc f94486a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoItemParams f94487b;

    static {
        Covode.recordClassIndex(59993);
    }

    ce(cc ccVar, VideoItemParams videoItemParams) {
        this.f94486a = ccVar;
        this.f94487b = videoItemParams;
    }

    public final void run() {
        int i2;
        cc ccVar = this.f94486a;
        Aweme aweme = this.f94487b.mAweme;
        if (ccVar.r != null && ccVar.s != null) {
            ccVar.s.setVisibility(8);
            ccVar.r.setVisibility(8);
            if (aweme != null && aweme.getBoost() != null) {
                Boost boost = aweme.getBoost();
                if (!TextUtils.isEmpty(boost.getText())) {
                    String text = boost.getText();
                    try {
                        i2 = Color.parseColor(boost.getBgColor());
                    } catch (Exception unused) {
                        i2 = Color.parseColor("#C0FFFFFF");
                    }
                    try {
                        int parseColor = Color.parseColor(boost.getTextColor());
                        ccVar.s.setVisibility(0);
                        ccVar.s.setText(text);
                        ccVar.s.setBackgroundColor(i2);
                        ccVar.s.setTextColor(parseColor);
                    } catch (Exception unused2) {
                        ccVar.r.setVisibility(0);
                        ccVar.r.setTagBackgroundColor(i2);
                        ccVar.r.setText(text);
                    }
                }
            }
        }
    }
}
