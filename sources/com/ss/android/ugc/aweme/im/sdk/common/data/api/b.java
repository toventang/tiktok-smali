package com.ss.android.ugc.aweme.im.sdk.common.data.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.AwemeDetailList;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.AcceptInviteCardResponse;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.InviteCardDetailInnerResponse;
import f.a.t;
import h.c.d;
import h.f.b.m;
import h.h;
import h.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final h f102474a = i.a((h.f.a.a) a.f102477a);

    /* renamed from: b  reason: collision with root package name */
    public static final b f102475b = new b();

    /* renamed from: c  reason: collision with root package name */
    private static final h f102476c = i.a((h.f.a.a) C2575b.f102478a);

    public static TikTokImApi a() {
        return (TikTokImApi) f102476c.getValue();
    }

    private b() {
    }

    static final class a extends m implements h.f.a.a<TikTokImApi> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f102477a = new a();

        static {
            Covode.recordClassIndex(65617);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TikTokImApi invoke() {
            return RetrofitFactory.a().b(com.ss.android.ugc.aweme.im.sdk.common.controller.d.a.f102223e).d().a(TikTokImApi.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.api.b$b  reason: collision with other inner class name */
    static final class C2575b extends m implements h.f.a.a<TikTokImApi> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2575b f102478a = new C2575b();

        static {
            Covode.recordClassIndex(65618);
        }

        C2575b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TikTokImApi invoke() {
            return RetrofitFactory.a().b(com.ss.android.ugc.aweme.im.sdk.common.controller.d.a.f102222d).d().a(TikTokImApi.class);
        }
    }

    static {
        Covode.recordClassIndex(65616);
    }

    public static t<InviteCardDetailInnerResponse> a(String str) {
        t<InviteCardDetailInnerResponse> inviteCardDetailInner;
        if (str == null || (inviteCardDetailInner = a().getInviteCardDetailInner(str)) == null) {
            return null;
        }
        return inviteCardDetailInner.b(f.a.h.a.b(f.a.k.a.f158006c));
    }

    public static t<AcceptInviteCardResponse> b(String str) {
        t<AcceptInviteCardResponse> acceptInviteCard;
        if (str == null || (acceptInviteCard = a().acceptInviteCard(str)) == null) {
            return null;
        }
        return acceptInviteCard.b(f.a.h.a.b(f.a.k.a.f158006c));
    }

    public static Object a(String str, String str2, d<? super AwemeDetailList> dVar) {
        return a().queryAwemeList(str, str2, 0).a(dVar);
    }
}
