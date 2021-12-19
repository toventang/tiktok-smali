package com.ss.android.ugc.aweme.setting.page.datasave.zerorating;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.b.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public abstract class FreeDataCommonCell<T extends a> extends PowerCell<T> implements View.OnClickListener {
    static {
        Covode.recordClassIndex(80311);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void a(T t) {
        l.d(t, "");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a1x, viewGroup, false);
        a2.setOnClickListener(this);
        l.b(a2, "");
        return a2;
    }
}
