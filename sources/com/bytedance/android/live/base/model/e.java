package com.bytedance.android.live.base.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;

public final class e implements b<ImageModel.Content> {
    static {
        Covode.recordClassIndex(3591);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ ImageModel.Content a(f fVar) {
        return b(fVar);
    }

    public static ImageModel.Content b(f fVar) {
        ImageModel.Content content = new ImageModel.Content();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return content;
            } else if (b2 == 1) {
                content.f7366a = fVar.d();
            } else if (b2 == 2) {
                content.f7367b = fVar.d();
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                content.f7368c = fVar.f();
            }
        }
    }
}
