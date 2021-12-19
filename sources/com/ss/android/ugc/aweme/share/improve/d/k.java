package com.ss.android.ugc.aweme.share.improve.d;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.share.improve.d.h;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class k implements o {
    static {
        Covode.recordClassIndex(81332);
    }

    @Override // com.ss.android.ugc.aweme.share.improve.d.o
    public final boolean a(Context context, AwemeSharePackage awemeSharePackage, b<? super Boolean, z> bVar) {
        l.d(context, "");
        l.d(awemeSharePackage, "");
        l.d(bVar, "");
        if (!h.a.a(awemeSharePackage.a(), context)) {
            return true;
        }
        awemeSharePackage.f124595i.putString("share_form", "url_form");
        return false;
    }
}
