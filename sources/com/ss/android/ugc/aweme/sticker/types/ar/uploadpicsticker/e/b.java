package com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e;

import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public ObjectAnimator f136003a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f136004b;

    static {
        Covode.recordClassIndex(88853);
    }

    public final void a() {
        ObjectAnimator objectAnimator = this.f136003a;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = this.itemView;
        l.b(view, "");
        view.setVisibility(8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.byw);
        l.b(findViewById, "");
        this.f136004b = (ImageView) findViewById;
    }
}
