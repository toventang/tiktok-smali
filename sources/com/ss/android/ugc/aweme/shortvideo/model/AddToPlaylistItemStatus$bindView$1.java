package com.ss.android.ugc.aweme.shortvideo.model;

import android.view.View;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

final class AddToPlaylistItemStatus$bindView$1<T> implements u {
    final /* synthetic */ View $view;

    static {
        Covode.recordClassIndex(84407);
    }

    AddToPlaylistItemStatus$bindView$1(View view) {
        this.$view = view;
    }

    public final void onChanged(String str) {
        View findViewById = this.$view.findViewById(R.id.f2x);
        l.b(findViewById, "");
        ((TuxTextView) findViewById).setText(str);
    }
}
