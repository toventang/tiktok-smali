package com.ss.android.ugc.aweme.music.search;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.music.api.MusicAwemeApi;
import com.ss.android.ugc.aweme.music.api.b;
import com.ss.android.ugc.aweme.music.model.OriginalMusicList;
import f.a.t;
import h.f.b.l;

public final class q implements com.bytedance.assem.arch.a.a<r> {

    /* renamed from: a  reason: collision with root package name */
    public final r f111724a = new a();

    static {
        Covode.recordClassIndex(71838);
    }

    public static final class a implements r {
        static {
            Covode.recordClassIndex(71839);
        }

        a() {
        }

        @Override // com.ss.android.ugc.aweme.music.api.b
        public final t<BaseResponse> a(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            l.d(str, "");
            l.d(str2, "");
            return b.a.a(str, str2);
        }

        @Override // com.ss.android.ugc.aweme.music.api.b
        public final t<BaseResponse> b(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            l.d(str, "");
            l.d(str2, "");
            return b.a.b(str, str2);
        }

        @Override // com.ss.android.ugc.aweme.music.search.r
        public final OriginalMusicList a(String str, String str2, int i2, int i3) {
            return MusicAwemeApi.f111096a.searchMusicList(str, str2, i2, i3).get();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.a.a
    public final /* bridge */ /* synthetic */ r a() {
        return this.f111724a;
    }
}
