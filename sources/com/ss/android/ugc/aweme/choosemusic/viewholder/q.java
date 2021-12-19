package com.ss.android.ugc.aweme.choosemusic.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;

public final class q extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public SmartImageView f70948a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f70949b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f70950c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f70951d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f70952e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f70953f;

    /* renamed from: g  reason: collision with root package name */
    ImageView f70954g;

    /* renamed from: h  reason: collision with root package name */
    TextView f70955h;

    /* renamed from: i  reason: collision with root package name */
    public Context f70956i;

    /* renamed from: j  reason: collision with root package name */
    public MusicModel f70957j;

    /* renamed from: k  reason: collision with root package name */
    public int f70958k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f70959l;

    static {
        Covode.recordClassIndex(43693);
    }

    public q(View view) {
        super(view);
        this.f70956i = view.getContext();
        this.f70948a = (SmartImageView) view.findViewById(R.id.bvt);
        this.f70949b = (ImageView) view.findViewById(R.id.bzl);
        this.f70950c = (ImageView) view.findViewById(R.id.bz6);
        this.f70951d = (TextView) view.findViewById(R.id.f3c);
        this.f70952e = (TextView) view.findViewById(R.id.f7e);
        this.f70953f = (TextView) view.findViewById(R.id.f35);
        this.f70954g = (ImageView) view.findViewById(R.id.bz7);
        this.f70955h = (TextView) view.findViewById(R.id.f3n);
    }
}
