package com.ss.android.ugc.aweme.music.b.a;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.b.b.a;
import com.ss.android.ugc.aweme.music.b.d;
import com.ss.android.ugc.aweme.music.b.f;
import com.ss.android.ugc.aweme.music.b.k;
import com.ss.android.ugc.aweme.music.f.d;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class b extends com.ss.android.ugc.aweme.common.a.b<List<a>> {

    /* renamed from: a  reason: collision with root package name */
    public String f111303a;

    /* renamed from: b  reason: collision with root package name */
    public k<d> f111304b;

    /* renamed from: c  reason: collision with root package name */
    public int f111305c;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.music.b.b f111306d;

    /* renamed from: e  reason: collision with root package name */
    private int f111307e;

    /* renamed from: f  reason: collision with root package name */
    private d.a f111308f;

    /* renamed from: g  reason: collision with root package name */
    private int f111309g;

    static {
        Covode.recordClassIndex(71530);
    }

    @Override // com.ss.android.ugc.aweme.common.a.b
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
        return new f(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_u, viewGroup, false), this.f111306d, this.f111309g, this.f111308f, this.f111304b);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.ss.android.ugc.aweme.common.a.b
    public final /* synthetic */ boolean a(List<a> list, int i2) {
        a aVar = list.get(i2);
        if (!(aVar instanceof MusicModel) || ((MusicModel) aVar).getDataType() != 1) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, androidx.recyclerview.widget.RecyclerView$ViewHolder, java.util.List] */
    @Override // com.ss.android.ugc.aweme.common.a.b
    public final /* synthetic */ void a(List<a> list, int i2, RecyclerView.ViewHolder viewHolder, List list2) {
        boolean z;
        f fVar = (f) viewHolder;
        MusicModel musicModel = (MusicModel) list.get(i2);
        String str = this.f111303a;
        if (i2 == this.f111305c) {
            z = true;
        } else {
            z = false;
        }
        fVar.a(musicModel, str, z, this.f111307e);
    }
}
