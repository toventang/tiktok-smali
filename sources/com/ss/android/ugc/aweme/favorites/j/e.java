package com.ss.android.ugc.aweme.favorites.j;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.favorites.i.a;
import com.ss.android.ugc.aweme.favorites.i.b;
import com.ss.android.ugc.aweme.music.k.d;
import com.ss.android.ugc.aweme.music.model.Music;
import com.zhiliaoapp.musically.R;

public final class e extends RecyclerView.ViewHolder implements View.OnClickListener, a.AbstractC2193a {

    /* renamed from: a  reason: collision with root package name */
    public TextView f90684a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f90685b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f90686c;

    /* renamed from: d  reason: collision with root package name */
    public RemoteImageView f90687d;

    /* renamed from: e  reason: collision with root package name */
    RelativeLayout f90688e;

    /* renamed from: f  reason: collision with root package name */
    public ImageView f90689f;

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f90690g;

    /* renamed from: h  reason: collision with root package name */
    public ProgressBar f90691h;

    /* renamed from: i  reason: collision with root package name */
    LinearLayout f90692i;

    /* renamed from: j  reason: collision with root package name */
    public TextView f90693j;

    /* renamed from: k  reason: collision with root package name */
    RelativeLayout f90694k;

    /* renamed from: l  reason: collision with root package name */
    public Music f90695l;

    /* renamed from: m  reason: collision with root package name */
    private com.ss.android.ugc.aweme.favorites.g.e f90696m;
    private Context n;

    static {
        Covode.recordClassIndex(56964);
    }

    @Override // com.ss.android.ugc.aweme.favorites.i.a.AbstractC2193a
    public final void c() {
        boolean z;
        Music music = this.f90695l;
        if (music != null) {
            String mid = music.getMid();
            if (this.f90695l.getMatchedPGCSoundInfo() != null) {
                z = true;
            } else {
                z = false;
            }
            a.a(mid, z);
        }
    }

    public final void a(boolean z) {
        if (z) {
            this.f90694k.setVisibility(0);
            this.f90689f.setImageResource(2131232030);
            this.f90689f.clearAnimation();
            this.f90691h.setVisibility(8);
            return;
        }
        this.f90694k.setVisibility(8);
        this.f90691h.setVisibility(8);
        this.f90689f.setVisibility(0);
        this.f90689f.setImageResource(2131232031);
        this.f90689f.clearAnimation();
    }

    public final void onClick(View view) {
        Music music;
        ClickAgent.onClick(view);
        if (view.getId() == R.id.cpw && this.f90695l != null) {
            Context context = view.getContext();
            Music music2 = this.f90695l;
            b.a(context, view, music2, "collection_music", "", d.a(music2.convertToMusicModel(), context, true));
        }
        com.ss.android.ugc.aweme.favorites.g.e eVar = this.f90696m;
        if (!(eVar == null || (music = this.f90695l) == null)) {
            eVar.a(this, view, music.convertToMusicModel());
        }
        Music music3 = this.f90695l;
        if (music3 != null) {
            a.a(music3.getMid(), "collection_music", "");
        }
    }

    public e(View view, com.ss.android.ugc.aweme.favorites.g.e eVar) {
        super(view);
        this.f90684a = (TextView) view.findViewById(R.id.f3c);
        this.f90685b = (ImageView) view.findViewById(R.id.bzl);
        this.f90686c = (TextView) view.findViewById(R.id.f7e);
        this.f90687d = (RemoteImageView) view.findViewById(R.id.dtl);
        this.f90688e = (RelativeLayout) view.findViewById(R.id.doy);
        this.f90689f = (ImageView) view.findViewById(R.id.c1h);
        this.f90690g = (LinearLayout) view.findViewById(R.id.cgx);
        this.f90691h = (ProgressBar) view.findViewById(R.id.d2s);
        this.f90692i = (LinearLayout) view.findViewById(R.id.cqk);
        this.f90693j = (TextView) view.findViewById(R.id.a8k);
        this.f90694k = (RelativeLayout) view.findViewById(R.id.don);
        View findViewById = view.findViewById(R.id.cgx);
        if (findViewById != null) {
            findViewById.setOnClickListener(new f(this));
        }
        View findViewById2 = view.findViewById(R.id.don);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new g(this));
        }
        View findViewById3 = view.findViewById(R.id.cpw);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new h(this));
        }
        this.n = view.getContext();
        this.f90696m = eVar;
    }
}
