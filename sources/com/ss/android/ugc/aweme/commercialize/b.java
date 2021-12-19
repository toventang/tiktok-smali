package com.ss.android.ugc.aweme.commercialize;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.a.e;
import com.ss.android.ugc.aweme.feed.e.d;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.param.FeedParamProvider;
import org.json.JSONObject;

public final class b extends d {
    static {
        Covode.recordClassIndex(45344);
    }

    public final void a(ag agVar) {
        Context d2;
        Aweme aweme = (Aweme) agVar.f93451b;
        if (aweme != null && !TextUtils.isEmpty(aweme.getAid())) {
            if (aweme.getAuthor() == null) {
                com.bytedance.c.a.a.a.b.a("ECCommerce , author is null and awemeid is " + aweme.getAid());
            } else if (aweme.hasPromotion() && (d2 = d()) != null) {
                com.ss.android.ugc.aweme.feed.param.b a2 = FeedParamProvider.a.a(d2);
                if (!TextUtils.isEmpty(a2.getEntranceInfo())) {
                    a2.getEntranceInfo();
                    return;
                }
                try {
                    new JSONObject(a2.getTracker()).optString("entrance_info");
                } catch (Exception unused) {
                }
            }
        }
    }

    public b(String str, int i2) {
        super(str, i2);
    }

    @Override // com.ss.android.ugc.aweme.feed.e.d
    public final void a(Activity activity, Fragment fragment) {
        if (activity == null) {
            e.b("ATTACH ACTIVITY == NULL");
        }
        this.f92897b = activity;
        this.f92898c = fragment;
    }
}
