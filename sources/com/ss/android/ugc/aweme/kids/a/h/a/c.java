package com.ss.android.ugc.aweme.kids.a.h.a;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.Collection;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f105348a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(67527);
    }

    private static boolean a(List<ExternalMusicInfo> list) {
        ExternalMusicInfo externalMusicInfo;
        if (b.a((Collection) list)) {
            return false;
        }
        String str = null;
        if (!(list == null || (externalMusicInfo = list.get(0)) == null)) {
            str = externalMusicInfo.getPartnerName();
        }
        return TextUtils.equals(str, "awa");
    }

    public static void a(TextView textView, Music music) {
        List<ExternalMusicInfo> list;
        int i2;
        int i3;
        if (music != null) {
            list = music.getExternalMusicInfos();
        } else {
            list = null;
        }
        if (a(list)) {
            i2 = 2131233932;
        } else {
            i2 = 0;
        }
        if (textView != null) {
            if (i2 > 0) {
                i3 = n.a(5.0d);
            } else {
                i3 = 0;
            }
            textView.setCompoundDrawablePadding(i3);
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, i2, 0);
        }
    }
}
