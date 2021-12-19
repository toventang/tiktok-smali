package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.router.SmartRouter;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class SystemCardContentKt {
    static {
        Covode.recordClassIndex(64081);
    }

    public static final int colorTypeToColor(Integer num) {
        int i2;
        if (!(num == null || num.intValue() == 0)) {
            if (num.intValue() == 1) {
                i2 = R.color.c4;
            } else if (num.intValue() == 2) {
                i2 = R.color.c5;
            } else if (num.intValue() == 3) {
                i2 = R.color.bz;
            } else if (num.intValue() == 4) {
                i2 = R.color.bh;
            } else if (num.intValue() == 5) {
                i2 = R.color.bd;
            }
            return d.a().getResources().getColor(i2);
        }
        i2 = R.color.bx;
        return d.a().getResources().getColor(i2);
    }

    public static final void open(LinkInfo linkInfo, Context context) {
        l.d(linkInfo, "");
        l.d(context, "");
        int actionType = linkInfo.getActionType();
        if (actionType == 1) {
            SmartRouter.buildRoute(context, "//webview/").withParam("url", linkInfo.getLinkUrl()).open();
        } else if (actionType == 2) {
            SmartRouter.buildRoute(context, linkInfo.getLinkUrl()).open();
        }
    }
}
