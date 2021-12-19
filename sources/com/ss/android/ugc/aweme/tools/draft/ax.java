package com.ss.android.ugc.aweme.tools.draft;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.vesdk.VEUtils;
import h.f.b.l;

public final class ax {
    static {
        Covode.recordClassIndex(91153);
    }

    public static final boolean a(c cVar) {
        l.d(cVar, "");
        String b2 = b(cVar);
        if (b2 == null || b2.length() == 0) {
            return false;
        }
        return true;
    }

    public static final String b(c cVar) {
        String str;
        l.d(cVar, "");
        int i2 = cVar.musicType;
        if (i2 == MusicModel.MusicType.LOCAL.ordinal()) {
            str = cVar.path;
        } else if (i2 == MusicModel.MusicType.ONLINE.ordinal()) {
            str = com.ss.android.ugc.aweme.port.in.l.f115658a.b().b(cVar);
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str) || VEUtils.checkAudioFile(str) != 0) {
            return null;
        }
        return str;
    }
}
