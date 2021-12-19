package com.ss.android.ugc.aweme.kids.choosemusic.i;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;

public final class m extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public SmartImageView f105800a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f105801b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f105802c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f105803d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f105804e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f105805f;

    /* renamed from: g  reason: collision with root package name */
    ImageView f105806g;

    /* renamed from: h  reason: collision with root package name */
    TextView f105807h;

    /* renamed from: i  reason: collision with root package name */
    public Context f105808i;

    /* renamed from: j  reason: collision with root package name */
    public MusicModel f105809j;

    /* renamed from: k  reason: collision with root package name */
    public int f105810k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f105811l;

    static {
        Covode.recordClassIndex(67723);
    }

    public m(View view) {
        super(view);
        this.f105808i = view.getContext();
        this.f105800a = (SmartImageView) view.findViewById(R.id.bvt);
        this.f105801b = (ImageView) view.findViewById(R.id.bzl);
        this.f105802c = (ImageView) view.findViewById(R.id.bz6);
        this.f105803d = (TextView) view.findViewById(R.id.f3c);
        this.f105804e = (TextView) view.findViewById(R.id.f7e);
        this.f105805f = (TextView) view.findViewById(R.id.f35);
        this.f105806g = (ImageView) view.findViewById(R.id.bz7);
        this.f105807h = (TextView) view.findViewById(R.id.f3n);
    }
}
