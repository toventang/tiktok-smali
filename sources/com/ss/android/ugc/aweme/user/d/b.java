package com.ss.android.ugc.aweme.user.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.friends.api.UploadContactsApi;
import com.ss.android.ugc.aweme.friends.model.ContactModelV2;
import com.ss.android.ugc.aweme.utils.be;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    static final Callable f142360a = new b();

    static {
        Covode.recordClassIndex(93111);
    }

    private b() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List<ContactModelV2> a2 = be.a(d.a(), null, false);
        if (com.bytedance.common.utility.collection.b.a((Collection) a2)) {
            return null;
        }
        return UploadContactsApi.a(a2, null, 1, 1);
    }
}
