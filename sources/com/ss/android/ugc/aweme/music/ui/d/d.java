package com.ss.android.ugc.aweme.music.ui.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.ui.api.MusicAwemeApi;
import f.a.t;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class d extends com.bytedance.jedi.a.f.a<f, List<? extends Music>, f, g> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f111954a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final MusicAwemeApi f111955b = MusicAwemeApi.a.a();

    static {
        Covode.recordClassIndex(71957);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71958);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object b(Object obj) {
        l.d(obj, "");
        return obj;
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t<g> a(f fVar) {
        f fVar2 = fVar;
        l.d(fVar2, "");
        return this.f111955b.queryMusicList(fVar2.f111957a, fVar2.f111958b, fVar2.f111959c);
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        g gVar = (g) obj2;
        l.d(obj, "");
        l.d(gVar, "");
        List<Music> list = gVar.f111962c;
        if (list == null) {
            return z.INSTANCE;
        }
        return list;
    }
}
