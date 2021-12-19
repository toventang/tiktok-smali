package com.ss.android.ugc.aweme.profile.editprofile.pronouns.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.profile.editprofile.pronouns.api.PronounsAPI;
import f.a.t;
import h.f.b.l;

public final class b implements com.bytedance.assem.arch.a.a<a> {

    /* renamed from: a  reason: collision with root package name */
    public final a f116170a = new a();

    static {
        Covode.recordClassIndex(74936);
    }

    public static final class a implements a {
        static {
            Covode.recordClassIndex(74937);
        }

        a() {
        }

        @Override // com.ss.android.ugc.aweme.profile.editprofile.pronouns.a.a
        public final t<c> a(String str) {
            l.d(str, "");
            Object a2 = RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d().a(PronounsAPI.class);
            l.b(a2, "");
            return ((PronounsAPI) a2).updatePronouns(str);
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.a.a
    public final /* bridge */ /* synthetic */ a a() {
        return this.f116170a;
    }
}
