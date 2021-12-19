package com.ss.android.ugc.aweme.mix.editname;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mix.api.MixFeedApi;
import f.a.ab;
import f.a.t;
import h.f.b.l;

public final class b implements com.bytedance.assem.arch.a.a<c> {

    /* renamed from: a  reason: collision with root package name */
    public final MixFeedApi f109933a = MixFeedApi.a.a();

    /* renamed from: b  reason: collision with root package name */
    public final c f109934b = new a(this);

    static {
        Covode.recordClassIndex(70445);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.a.a
    public final /* bridge */ /* synthetic */ c a() {
        return this.f109934b;
    }

    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f109935a;

        static {
            Covode.recordClassIndex(70446);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(b bVar) {
            this.f109935a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.mix.editname.c
        public final t<com.ss.android.ugc.aweme.mix.api.response.a> a(int i2, String str) {
            l.d(str, "");
            return this.f109935a.f109933a.checkPlaylistName(i2, str);
        }

        @Override // com.ss.android.ugc.aweme.mix.editname.c
        public final ab<com.ss.android.ugc.aweme.mix.api.response.b> a(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            return this.f109935a.f109933a.manageMixFeed(MixFeedApi.b.RENAME.getOperation(), str, null, null, null, str2);
        }
    }
}
