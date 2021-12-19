package com.ss.android.ugc.aweme.social.service;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.social.ext.RelationComService;
import h.f.b.l;
import java.util.List;

public final class a implements IRelationComService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f133708a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IRelationComService f133709b;

    @Override // com.ss.android.ugc.aweme.social.service.IRelationComService
    public final List<r> a() {
        return this.f133709b.a();
    }

    static {
        Covode.recordClassIndex(87470);
    }

    private a() {
        IRelationComService b2 = RelationComService.b();
        l.b(b2, "");
        this.f133709b = b2;
    }
}
