package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a;

import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.b.a.a;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class b extends j.e<a> {
    static {
        Covode.recordClassIndex(65245);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.j.e
    public final /* synthetic */ boolean b(a aVar, a aVar2) {
        l.d(aVar, "");
        l.d(aVar2, "");
        return l.a(aVar, aVar2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.j.e
    public final /* synthetic */ boolean a(a aVar, a aVar2) {
        String str;
        a aVar3 = aVar;
        a aVar4 = aVar2;
        l.d(aVar3, "");
        l.d(aVar4, "");
        if (aVar3.f101968a != aVar4.f101968a) {
            return false;
        }
        User user = aVar3.f101969b;
        String str2 = null;
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        User user2 = aVar4.f101969b;
        if (user2 != null) {
            str2 = user2.getUid();
        }
        if (!l.a((Object) str, (Object) str2) || aVar3.f101970c != aVar4.f101970c) {
            return false;
        }
        return true;
    }
}
