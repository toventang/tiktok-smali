package com.ss.android.ugc.aweme.social.widget.card;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.e;
import com.ss.android.ugc.aweme.social.widget.a;
import h.f.b.l;

public final class i implements ISocialCardService {

    /* renamed from: a  reason: collision with root package name */
    public static final i f133800a = new i();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ISocialCardService f133801b;

    @Override // com.ss.android.ugc.aweme.social.widget.card.ISocialCardService
    public final LinearLayout a(a aVar, int i2, com.ss.android.ugc.aweme.social.widget.card.a.i iVar) {
        l.d(aVar, "");
        l.d(iVar, "");
        return this.f133801b.a(aVar, i2, iVar);
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.ISocialCardService
    public final e a(a aVar, com.ss.android.ugc.aweme.social.widget.card.a.i iVar) {
        l.d(aVar, "");
        l.d(iVar, "");
        return this.f133801b.a(aVar, iVar);
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.ISocialCardService
    public final d a(a aVar, int i2) {
        l.d(aVar, "");
        return this.f133801b.a(aVar, i2);
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.ISocialCardService
    public final g a() {
        return this.f133801b.a();
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.ISocialCardService
    public final RecyclerView.a<?> b(a aVar, com.ss.android.ugc.aweme.social.widget.card.a.i iVar) {
        l.d(aVar, "");
        l.d(iVar, "");
        return this.f133801b.b(aVar, iVar);
    }

    static {
        Covode.recordClassIndex(87518);
    }

    private i() {
        ISocialCardService b2 = SocialCardServiceImp.b();
        l.b(b2, "");
        this.f133801b = b2;
    }
}
