package com.ss.android.ugc.aweme.kids.choosemusic.h;

import android.text.TextWatcher;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.choosemusic.c.a;
import com.zhiliaoapp.musically.R;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public a f105681a;

    /* renamed from: b  reason: collision with root package name */
    public FrameLayout f105682b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f105683c;

    /* renamed from: d  reason: collision with root package name */
    ImageView f105684d;

    /* renamed from: e  reason: collision with root package name */
    FrameLayout f105685e;

    /* renamed from: f  reason: collision with root package name */
    private int f105686f;

    /* renamed from: g  reason: collision with root package name */
    private TextWatcher f105687g;

    /* renamed from: h  reason: collision with root package name */
    private int f105688h;

    static {
        Covode.recordClassIndex(67680);
    }

    public c(View view, a aVar, int i2, TextWatcher textWatcher) {
        this.f105681a = aVar;
        this.f105686f = i2;
        this.f105687g = textWatcher;
        this.f105682b = (FrameLayout) view.findViewById(R.id.ae8);
        this.f105683c = (TextView) view.findViewById(R.id.a79);
        this.f105684d = (ImageView) view.findViewById(R.id.bvb);
        this.f105685e = (FrameLayout) view.findViewById(R.id.awn);
        this.f105688h = n.a(view.getContext());
    }
}
