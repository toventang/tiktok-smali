package com.ss.android.ugc.aweme.social.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.ext.RelationExtService;
import h.f.b.l;

public final class b implements IRelationExtService {

    /* renamed from: a  reason: collision with root package name */
    public static final b f133710a = new b();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IRelationExtService f133711b;

    @Override // com.ss.android.ugc.aweme.social.service.IRelationExtService
    public final void a(TuxTextView tuxTextView, User user, Aweme aweme, Integer num) {
        l.d(tuxTextView, "");
        this.f133711b.a(tuxTextView, user, aweme, num);
    }

    static {
        Covode.recordClassIndex(87471);
    }

    private b() {
        IRelationExtService a2 = RelationExtService.a();
        l.b(a2, "");
        this.f133711b = a2;
    }
}
