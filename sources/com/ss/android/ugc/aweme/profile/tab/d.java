package com.ss.android.ugc.aweme.profile.tab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.a;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class d {
    static {
        Covode.recordClassIndex(75385);
    }

    public static e a(Context context, ViewGroup viewGroup, int i2) {
        e eVar = (e) a.a(LayoutInflater.from(context), R.layout.aqs, viewGroup, false);
        ((MusProfileTabImageView) eVar).setImageResource(i2);
        eVar.setAnimationEnabled(true);
        return eVar;
    }
}
