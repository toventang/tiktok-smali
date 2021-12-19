package com.lynx.tasm.ui.image;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.facebook.c.a.e;
import com.facebook.c.a.g;
import com.facebook.common.h.a;
import com.facebook.imagepipeline.c.f;
import com.facebook.imagepipeline.o.d;
import java.util.LinkedList;
import java.util.List;

public final class k implements d {

    /* renamed from: a  reason: collision with root package name */
    private final List<d> f57015a;

    static {
        Covode.recordClassIndex(35461);
    }

    @Override // com.facebook.imagepipeline.o.d
    public final String getName() {
        StringBuilder sb = new StringBuilder();
        for (d dVar : this.f57015a) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(dVar.getName());
        }
        sb.insert(0, "MultiPostProcessor (");
        sb.append(")");
        return sb.toString();
    }

    @Override // com.facebook.imagepipeline.o.d
    public final e getPostprocessorCacheKey() {
        LinkedList linkedList = new LinkedList();
        for (d dVar : this.f57015a) {
            linkedList.push(dVar.getPostprocessorCacheKey());
        }
        return new g(linkedList);
    }

    private k(List<d> list) {
        this.f57015a = new LinkedList(list);
    }

    public static d a(List<d> list) {
        int size = list.size();
        if (size == 0) {
            return null;
        }
        if (size != 1) {
            return new k(list);
        }
        return list.get(0);
    }

    /* JADX INFO: finally extract failed */
    @Override // com.facebook.imagepipeline.o.d
    public final a<Bitmap> process(Bitmap bitmap, f fVar) {
        Bitmap bitmap2;
        a<Bitmap> aVar = null;
        try {
            a aVar2 = null;
            for (d dVar : this.f57015a) {
                if (aVar2 != null) {
                    bitmap2 = (Bitmap) aVar2.a();
                } else {
                    bitmap2 = bitmap;
                }
                aVar = dVar.process(bitmap2, fVar);
                a.c(aVar2);
                aVar2 = a.b(aVar);
            }
            a<Bitmap> b2 = a.b(aVar);
            a.c(aVar);
            return b2;
        } catch (Throwable th) {
            a.c(null);
            throw th;
        }
    }
}
