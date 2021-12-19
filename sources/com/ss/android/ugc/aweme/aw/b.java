package com.ss.android.ugc.aweme.aw;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.contentlanguage.ContentLanguageServiceImpl;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.i18n.language.a.g;
import com.ss.android.ugc.aweme.utils.fh;

final /* synthetic */ class b implements fh.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f67616a;

    static {
        Covode.recordClassIndex(41625);
    }

    b(a aVar) {
        this.f67616a = aVar;
    }

    @Override // com.ss.android.ugc.aweme.utils.fh.a
    public final void a() {
        a aVar = this.f67616a;
        g gVar = g.a.f99786a;
        Activity activity = aVar.f67615b;
        gVar.f99781c = true;
        gVar.b(activity);
        if (!s.a().booleanValue() && !aVar.f67614a) {
            ContentLanguageServiceImpl.f().a(aVar.f67615b);
        }
    }
}
