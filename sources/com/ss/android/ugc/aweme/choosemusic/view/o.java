package com.ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.a;
import com.ss.android.ugc.aweme.choosemusic.b;
import com.ss.android.ugc.aweme.choosemusic.b.c;
import com.ss.android.ugc.aweme.choosemusic.viewholder.s;
import com.ss.android.ugc.aweme.music.b.k;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public abstract class o extends a {

    /* renamed from: b  reason: collision with root package name */
    protected Context f70855b;

    /* renamed from: c  reason: collision with root package name */
    public List<s> f70856c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f70857d;

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f70858e;

    /* renamed from: f  reason: collision with root package name */
    TextView f70859f;

    /* renamed from: g  reason: collision with root package name */
    View f70860g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f70861h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f70862i;

    /* renamed from: j  reason: collision with root package name */
    private int f70863j;

    /* renamed from: k  reason: collision with root package name */
    private b f70864k;

    static {
        Covode.recordClassIndex(43652);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void a(s sVar);

    public o(View view, int i2) {
        super(view);
        this.f70855b = view.getContext();
        this.f70857d = (LinearLayout) view.findViewById(R.id.cel);
        this.f70858e = (LinearLayout) view.findViewById(R.id.cem);
        this.f70859f = (TextView) view.findViewById(R.id.f_w);
        this.f70860g = view.findViewById(R.id.flj);
        this.f70863j = i2;
        this.f70859f.getPaint().setFakeBoldText(true);
        a();
        b bVar = new b("change_music_page", "attached_song", "", com.ss.android.ugc.aweme.choosemusic.utils.b.f70718a);
        this.f70864k = bVar;
        bVar.f70380b = "prop";
    }

    public final void a(List<MusicModel> list, int i2, int i3, boolean z, String str, s sVar, k<c> kVar) {
        boolean z2;
        String str2;
        if (this.f70862i) {
            this.f70859f.setText(R.string.f9i);
        } else if (this.f70861h) {
            this.f70859f.setText(R.string.f9d);
        } else if (z) {
            this.f70859f.setText(R.string.dnl);
        } else {
            this.f70859f.setText(R.string.f9e);
        }
        int size = list.size() - this.f70858e.getChildCount();
        this.f70864k.f70384f = str;
        LayoutInflater from = LayoutInflater.from(this.f70855b);
        for (int i4 = 0; i4 < size; i4++) {
            s sVar2 = new s(com.a.a(from, R.layout.aa2, this.f70858e, false), this.f70863j);
            this.f70856c.add(sVar2);
            a(sVar2);
            this.f70858e.addView(sVar2.itemView);
        }
        for (int i5 = 0; i5 < this.f70856c.size(); i5++) {
            s sVar3 = this.f70856c.get(i5);
            MusicModel musicModel = list.get(i5);
            if (-2 == i2 && i5 == i3) {
                z2 = true;
            } else {
                z2 = false;
            }
            sVar3.a(musicModel, false, false, z2, 0, i5, this.f70864k);
            sVar3.a(sVar, kVar);
            MusicModel musicModel2 = list.get(i5);
            b bVar = this.f70864k;
            if (musicModel2 != null) {
                str2 = musicModel2.getMusicId();
            } else {
                str2 = "";
            }
            com.ss.android.ugc.aweme.choosemusic.utils.b.a(bVar, str2, i5);
        }
    }
}
