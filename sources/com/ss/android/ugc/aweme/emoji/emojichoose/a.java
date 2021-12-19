package com.ss.android.ugc.aweme.emoji.emojichoose;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class a extends o {
    static {
        Covode.recordClassIndex(56075);
    }

    @Override // com.ss.android.ugc.aweme.emoji.emojichoose.o
    public final View a(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.yy, viewGroup, false);
        a2.findViewById(R.id.ha).setOnClickListener(new b(context));
        return a2;
    }
}
