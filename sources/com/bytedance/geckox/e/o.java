package com.bytedance.geckox.e;

import android.net.Uri;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.c.d;
import com.bytedance.geckox.c.e;
import com.bytedance.geckox.i.a;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.q.k;
import java.util.List;

public class o extends k<UpdatePackage, Pair<Uri, UpdatePackage>> {

    /* renamed from: b  reason: collision with root package name */
    private int f29839b;

    static {
        Covode.recordClassIndex(17311);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.q.k
    public final /* synthetic */ Pair<Uri, UpdatePackage> a() {
        IN in = this.f42383a;
        List<String> urlList = in.getPackage().getUrlList();
        int i2 = this.f29839b;
        this.f29839b = i2 + 1;
        return new Pair(Uri.parse(urlList.get(i2)), in);
    }

    @Override // com.bytedance.q.k
    public final boolean a(Throwable th) {
        if (!(th instanceof d) && !(th instanceof e)) {
            return false;
        }
        a.a();
        if (this.f29839b >= this.f42383a.getPackage().getUrlList().size()) {
            return false;
        }
        return true;
    }
}
