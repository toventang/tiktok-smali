package com.ss.android.ugc.aweme.tools.mvtemplate.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ci.a;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final List f140824a;

    static {
        Covode.recordClassIndex(91955);
    }

    public c(List list) {
        this.f140824a = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List<String> list = this.f140824a;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            int[] a2 = a.a(str);
            if (a2 != null) {
                arrayList.add(PhotoContext.fromUpload(str, a2[0], a2[1]));
            }
        }
        return arrayList;
    }
}
