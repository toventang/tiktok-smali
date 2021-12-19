package com.ss.android.ugc.aweme.share.improve.c;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.ss.android.ugc.aweme.utils.dw;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a {
    static {
        Covode.recordClassIndex(81283);
    }

    public static final void a(Bundle bundle, String str, List<? extends Aweme> list) {
        UrlModel cover;
        ImageInfo imageInfo;
        UrlModel labelThumb;
        l.d(bundle, "");
        l.d(str, "");
        if (!(list == null || list.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Aweme aweme : list) {
                if (aweme.getAwemeType() == 2) {
                    List<ImageInfo> imageInfos = aweme.getImageInfos();
                    if (!(imageInfos == null || (imageInfo = imageInfos.get(0)) == null || (labelThumb = imageInfo.getLabelThumb()) == null)) {
                        arrayList.add(labelThumb);
                    }
                } else {
                    Video video = aweme.getVideo();
                    if (!(video == null || (cover = video.getCover()) == null)) {
                        arrayList.add(cover);
                    }
                }
                i2++;
                if (i2 >= 3) {
                    break;
                }
            }
            if (arrayList.size() >= 3) {
                bundle.putString(str, dw.a(arrayList));
            }
        }
    }

    public static final boolean a(h hVar, Context context, Aweme aweme, String str) {
        l.d(hVar, "");
        l.d(context, "");
        l.d(aweme, "");
        l.d(str, "");
        if (!b.U(aweme)) {
            return true;
        }
        r.a("dou_promote_layer_show", new d().a("enter_from", str).a("group_id", aweme.getAid()).a("author_id", aweme.getAuthorUid()).f66730a);
        new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.og).a();
        return false;
    }
}
