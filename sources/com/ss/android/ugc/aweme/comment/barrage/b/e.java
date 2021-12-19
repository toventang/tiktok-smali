package com.ss.android.ugc.aweme.comment.barrage.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import com.ss.android.ugc.aweme.comment.barrage.b;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.util.Set;

public final class e extends i {

    /* renamed from: a  reason: collision with root package name */
    public final User f71557a;

    /* renamed from: b  reason: collision with root package name */
    public final b f71558b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<String> f71559c;

    static {
        Covode.recordClassIndex(44029);
    }

    @Override // com.bytedance.ies.powerlist.b.a, com.ss.android.ugc.aweme.comment.barrage.b.i
    public final boolean b(a aVar) {
        l.d(aVar, "");
        return aVar instanceof e;
    }

    @Override // com.bytedance.ies.powerlist.b.a, com.ss.android.ugc.aweme.comment.barrage.b.i
    public final boolean a(a aVar) {
        l.d(aVar, "");
        if (aVar instanceof e) {
            return l.a((Object) ((e) aVar).f71557a.getUid(), (Object) this.f71557a.getUid());
        }
        return super.a(aVar);
    }

    public e(User user, b bVar, Set<String> set) {
        l.d(user, "");
        l.d(bVar, "");
        l.d(set, "");
        this.f71557a = user;
        this.f71558b = bVar;
        this.f71559c = set;
    }
}
