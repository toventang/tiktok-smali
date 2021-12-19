package com.ss.android.ugc.aweme.emoji.emojichoose;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class e extends o {

    /* renamed from: a  reason: collision with root package name */
    private String f89231a;

    static {
        Covode.recordClassIndex(56092);
    }

    public e(String str) {
        this.f89231a = str;
    }

    @Override // com.ss.android.ugc.aweme.emoji.emojichoose.o
    public final View a(ViewGroup viewGroup) {
        View a2 = a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.yg, viewGroup, false);
        ((TextView) a2.findViewById(R.id.ez4)).setText(this.f89231a);
        return a2;
    }
}
