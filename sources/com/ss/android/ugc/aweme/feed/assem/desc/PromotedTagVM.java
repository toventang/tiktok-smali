package com.ss.android.ugc.aweme.feed.assem.desc;

import android.graphics.Color;
import android.text.TextUtils;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Boost;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import h.f.b.l;

public final class PromotedTagVM extends FeedBaseViewModel<b> {
    static {
        Covode.recordClassIndex(58131);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ j f() {
        return new b();
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams] */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final /* bridge */ /* synthetic */ b a(b bVar, VideoItemParams videoItemParams) {
        return a(bVar, videoItemParams);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, java.lang.Object] */
    @Override // com.bytedance.ext_power_list.j
    public final /* synthetic */ VideoItemParams b(j jVar, VideoItemParams videoItemParams) {
        l.d(jVar, "");
        l.d(videoItemParams, "");
        return videoItemParams;
    }

    private static b a(b bVar, VideoItemParams videoItemParams) {
        String str;
        int i2;
        boolean z;
        l.d(bVar, "");
        l.d(videoItemParams, "");
        Aweme aweme = videoItemParams.mAweme;
        if (aweme == null) {
            return bVar;
        }
        Boost boost = aweme.getBoost();
        if (boost != null) {
            str = boost.getText();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                i2 = Color.parseColor(boost.getBgColor());
            } catch (Exception unused) {
                i2 = Color.parseColor("#C0FFFFFF");
            }
            int i3 = 16777215;
            try {
                i3 = Color.parseColor(boost.getTextColor());
                z = false;
            } catch (Exception unused2) {
                z = true;
            }
            return b.a(0, 0, Integer.valueOf(i2), Integer.valueOf(i3), boost.getText(), z);
        } else if (bVar.f92155a == 8 && bVar.f92156b == 8) {
            return bVar;
        } else {
            return b.a(8, 8, bVar.f92157c, bVar.f92158d, bVar.f92159e, bVar.f92160f);
        }
    }
}
