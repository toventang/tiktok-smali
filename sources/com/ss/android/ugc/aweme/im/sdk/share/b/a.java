package com.ss.android.ugc.aweme.im.sdk.share.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class a {
    static {
        Covode.recordClassIndex(66239);
    }

    public static final void a(SharePackage sharePackage, List<? extends IMContact> list) {
        l.d(sharePackage, "");
        l.d(list, "");
        List<IMUser> a2 = n.a((Iterable<?>) list, IMUser.class);
        ArrayList arrayList = new ArrayList(n.a((Iterable) a2, 10));
        for (IMUser iMUser : a2) {
            arrayList.add(iMUser.getUid());
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        sharePackage.f124595i.putStringArray("shared_users_id_list", (String[]) array);
    }
}
