package com.ss.android.ugc.aweme.kids.choosemusic.h;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.a;
import com.ss.android.ugc.aweme.kids.choosemusic.b.b;
import com.ss.android.ugc.aweme.kids.choosemusic.g.c;
import com.ss.android.ugc.aweme.kids.choosemusic.i.o;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public abstract class g extends a {

    /* renamed from: b  reason: collision with root package name */
    protected Context f105706b;

    /* renamed from: c  reason: collision with root package name */
    public List<o> f105707c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f105708d;

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f105709e;

    /* renamed from: f  reason: collision with root package name */
    TextView f105710f;

    /* renamed from: g  reason: collision with root package name */
    View f105711g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f105712h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f105713i;

    /* renamed from: j  reason: collision with root package name */
    private int f105714j;

    /* renamed from: k  reason: collision with root package name */
    private com.ss.android.ugc.aweme.kids.choosemusic.a f105715k;

    static {
        Covode.recordClassIndex(67687);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void a(o oVar);

    public g(View view, int i2) {
        super(view);
        this.f105706b = view.getContext();
        this.f105708d = (LinearLayout) view.findViewById(R.id.cel);
        this.f105709e = (LinearLayout) view.findViewById(R.id.cem);
        this.f105710f = (TextView) view.findViewById(R.id.f_w);
        this.f105711g = view.findViewById(R.id.flj);
        this.f105714j = i2;
        this.f105710f.getPaint().setFakeBoldText(true);
        a();
        com.ss.android.ugc.aweme.kids.choosemusic.a aVar = new com.ss.android.ugc.aweme.kids.choosemusic.a("change_music_page", "attached_song", "", c.f105649a);
        this.f105715k = aVar;
        aVar.f105433b = "prop";
    }

    public final void a(List<MusicModel> list, int i2, int i3, boolean z, String str, k kVar, com.ss.android.ugc.aweme.kids.a.a.c<b> cVar) {
        boolean z2;
        String str2;
        if (this.f105713i) {
            this.f105710f.setText(R.string.f9i);
        } else if (this.f105712h) {
            this.f105710f.setText(R.string.f9d);
        } else if (z) {
            this.f105710f.setText(R.string.dnl);
        } else {
            this.f105710f.setText(R.string.f9e);
        }
        int size = list.size() - this.f105709e.getChildCount();
        this.f105715k.f105437f = str;
        LayoutInflater from = LayoutInflater.from(this.f105706b);
        for (int i4 = 0; i4 < size; i4++) {
            o oVar = new o(com.a.a(from, R.layout.adm, this.f105709e, false), this.f105714j);
            this.f105707c.add(oVar);
            a(oVar);
            this.f105709e.addView(oVar.itemView);
        }
        for (int i5 = 0; i5 < this.f105707c.size(); i5++) {
            o oVar2 = this.f105707c.get(i5);
            MusicModel musicModel = list.get(i5);
            if (-2 == i2 && i5 == i3) {
                z2 = true;
            } else {
                z2 = false;
            }
            oVar2.a(musicModel, false, z2, 0, i5, this.f105715k);
            oVar2.a(kVar, cVar);
            MusicModel musicModel2 = list.get(i5);
            com.ss.android.ugc.aweme.kids.choosemusic.a aVar = this.f105715k;
            if (musicModel2 != null) {
                str2 = musicModel2.getMusicId();
            } else {
                str2 = "";
            }
            c.a(aVar, str2, i5, true);
        }
    }
}
