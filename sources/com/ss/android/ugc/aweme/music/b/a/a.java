package com.ss.android.ugc.aweme.music.b.a;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.a.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.music.b.d;
import com.ss.android.ugc.aweme.music.b.f;
import com.ss.android.ugc.aweme.music.b.k;
import com.ss.android.ugc.aweme.music.f.d;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class a extends b<List<com.ss.android.ugc.aweme.music.b.b.a>> {

    /* renamed from: a  reason: collision with root package name */
    public String f111295a;

    /* renamed from: b  reason: collision with root package name */
    public k<d> f111296b;

    /* renamed from: c  reason: collision with root package name */
    public int f111297c;

    /* renamed from: d  reason: collision with root package name */
    private f f111298d;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.music.b.b f111299e;

    /* renamed from: f  reason: collision with root package name */
    private int f111300f;

    /* renamed from: g  reason: collision with root package name */
    private d.a f111301g;

    /* renamed from: h  reason: collision with root package name */
    private int f111302h;

    static {
        Covode.recordClassIndex(71529);
    }

    @Override // com.ss.android.ugc.aweme.common.a.b
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
        return new f(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_u, viewGroup, false), this.f111299e, this.f111302h, this.f111301g, this.f111296b);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.ss.android.ugc.aweme.common.a.b
    public final /* synthetic */ boolean a(List<com.ss.android.ugc.aweme.music.b.b.a> list, int i2) {
        com.ss.android.ugc.aweme.music.b.b.a aVar = list.get(i2);
        if (!(aVar instanceof MusicModel) || ((MusicModel) aVar).getDataType() != 0) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, androidx.recyclerview.widget.RecyclerView$ViewHolder, java.util.List] */
    @Override // com.ss.android.ugc.aweme.common.a.b
    public final /* synthetic */ void a(List<com.ss.android.ugc.aweme.music.b.b.a> list, int i2, RecyclerView.ViewHolder viewHolder, List list2) {
        boolean z;
        List<com.ss.android.ugc.aweme.music.b.b.a> list3 = list;
        f fVar = (f) viewHolder;
        this.f111298d = fVar;
        MusicModel musicModel = (MusicModel) list3.get(i2);
        String str = this.f111295a;
        if (this.f111297c == i2) {
            z = true;
        } else {
            z = false;
        }
        fVar.a(musicModel, str, z, this.f111300f);
        r.a("show_music", new com.ss.android.ugc.aweme.app.f.d().a("music_id", ((MusicModel) list3.get(i2)).getMusicId()).a("enter_from", "challenge_bonding").f66730a);
    }
}
