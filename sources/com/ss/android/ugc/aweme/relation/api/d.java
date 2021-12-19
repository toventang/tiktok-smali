package com.ss.android.ugc.aweme.relation.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.model.RecommendUserDialogList;
import f.a.t;
import h.f.b.l;

public final class d implements com.bytedance.assem.arch.a.a<c> {

    /* renamed from: a  reason: collision with root package name */
    public RelationApi f120333a;

    /* renamed from: b  reason: collision with root package name */
    public final c f120334b = new a(this);

    static {
        Covode.recordClassIndex(78287);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.a.a
    public final /* bridge */ /* synthetic */ c a() {
        return this.f120334b;
    }

    public final RelationApi b() {
        RelationApi relationApi = this.f120333a;
        if (relationApi == null) {
            l.a("relationApi");
        }
        return relationApi;
    }

    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f120335a;

        static {
            Covode.recordClassIndex(78288);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(d dVar) {
            this.f120335a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.relation.api.c
        public final t<RecommendUserDialogList> a(int i2, String str) {
            l.d(str, "");
            return this.f120335a.b().fetchUserRecommendationsList(30, i2, str);
        }

        @Override // com.ss.android.ugc.aweme.relation.api.c
        public final t<RecommendUserDialogList> b(int i2, String str) {
            l.d(str, "");
            return this.f120335a.b().fetchMatchedFriendsList(30, i2, str);
        }
    }
}
