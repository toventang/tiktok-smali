package com.ss.android.ugc.aweme.photo;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import f.a.d.g;
import java.util.ArrayList;

final /* synthetic */ class q implements g {

    /* renamed from: a  reason: collision with root package name */
    private final PhotoModule f114895a;

    /* renamed from: b  reason: collision with root package name */
    private final String f114896b;

    static {
        Covode.recordClassIndex(73900);
    }

    q(PhotoModule photoModule, String str) {
        this.f114895a = photoModule;
        this.f114896b = str;
    }

    @Override // f.a.d.g
    public final Object apply(Object obj) {
        PhotoModule photoModule = this.f114895a;
        String str = this.f114896b;
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        if (photoModule.f114832f != null) {
            arrayList.addAll(photoModule.f114832f);
        }
        return new Pair(str, arrayList);
    }
}
