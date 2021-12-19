package com.ss.android.ugc.gamora.editor.sticker.donation.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.gamora.editor.sticker.donation.api.OrganizationListApi;
import com.ss.android.ugc.gamora.editor.sticker.donation.c.d;
import f.a.t;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f146522a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(96414);
    }

    public static t<d> a(b bVar) {
        l.d(bVar, "");
        return ((OrganizationListApi) g.a().C().retrofitCreate(OrganizationListApi.a.f146517a, OrganizationListApi.class)).getOrganizationList(bVar.f146523a, bVar.f146524b);
    }
}
