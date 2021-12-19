package com.ss.android.ugc.aweme.music.ui.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.music.ui.api.MusicAwemeApi;
import f.a.t;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class a extends com.bytedance.jedi.a.f.a<c, List<? extends Aweme>, c, MusicAwemeList> {

    /* renamed from: a  reason: collision with root package name */
    private final MusicAwemeApi f111949a = MusicAwemeApi.a.a();

    static {
        Covode.recordClassIndex(71954);
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object b(Object obj) {
        l.d(obj, "");
        return obj;
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t<MusicAwemeList> a(c cVar) {
        c cVar2 = cVar;
        l.d(cVar2, "");
        return this.f111949a.queryMusicAwemeList(cVar2.f111951a, cVar2.f111952b, cVar2.f111953c, 0);
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        MusicAwemeList musicAwemeList = (MusicAwemeList) obj2;
        l.d(obj, "");
        l.d(musicAwemeList, "");
        List<Aweme> list = musicAwemeList.items;
        if (list == null) {
            return z.INSTANCE;
        }
        return list;
    }
}
