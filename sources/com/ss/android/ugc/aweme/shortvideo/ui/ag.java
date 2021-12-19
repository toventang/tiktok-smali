package com.ss.android.ugc.aweme.shortvideo.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import b.i;
import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.widget.CircularProgressView;
import com.ss.android.ugc.aweme.shortvideo.cq;
import com.zhiliaoapp.musically.R;

public final class ag extends cq {

    /* renamed from: f  reason: collision with root package name */
    ImageView f131381f;

    /* renamed from: g  reason: collision with root package name */
    Bitmap f131382g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f131383h;

    static {
        Covode.recordClassIndex(86079);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bitmap bitmap = this.f131382g;
        if (bitmap != null && !bitmap.isRecycled()) {
            bundle.putParcelable("cover_data", this.f131382g);
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.shortvideo.cq
    public final void onViewCreated(View view, Bundle bundle) {
        this.f131381f = (ImageView) view.findViewById(R.id.sr);
        this.f125286a = (CircularProgressView) view.findViewById(R.id.byw);
        this.f125286a.setIndeterminate(false);
        this.f125287b = (TextView) view.findViewById(R.id.dby);
        i.b(new ah(this, bundle), i.f4824a).a(new ai(this), i.f4826c, null);
        this.f131383h = (TextView) view.findViewById(R.id.ev3);
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.shortvideo.cq
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return a.a(layoutInflater, R.layout.a1f, viewGroup, false);
    }
}
