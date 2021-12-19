package com.bytedance.android.livesdk.envelope.a;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.e.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class c {
    static {
        Covode.recordClassIndex(9511);
    }

    public static final b a(a aVar) {
        List<String> urls;
        String str;
        String str2 = "";
        l.d(aVar, str2);
        b bVar = new b();
        bVar.f17141b = aVar.f19606b;
        bVar.f17144e = aVar.f19609e;
        bVar.f17140a = aVar.f19605a;
        bVar.f17142c = aVar.f19607c;
        bVar.f17145f = aVar.f19610f;
        bVar.f17147h = aVar.f19612h;
        bVar.f17146g = aVar.f19611g;
        bVar.f17143d = aVar.f19608d;
        ImageModel imageModel = aVar.f19613i;
        if (!(imageModel == null || (urls = imageModel.getUrls()) == null || (str = urls.get(0)) == null)) {
            str2 = str;
        }
        bVar.f17148i = str2;
        return bVar;
    }
}
