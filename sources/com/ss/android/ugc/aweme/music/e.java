package com.ss.android.ugc.aweme.music;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f111396a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(71572);
    }

    public static final String a(MusicModel musicModel, Context context) {
        l.d(musicModel, "");
        l.d(context, "");
        String string = context.getString(R.string.dcb);
        l.b(string, "");
        return string;
    }
}
