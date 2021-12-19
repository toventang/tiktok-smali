package com.ss.android.ugc.aweme.ecommerce.util;

import androidx.core.content.b;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.a.a;
import com.bytedance.lighten.a.e;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final e f87565a;

    /* renamed from: b  reason: collision with root package name */
    public static final g f87566b = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(55045);
        e.a aVar = new e.a();
        aVar.f39828b = n.b(com.bytedance.ies.ugc.appcontext.g.a(), 0.5f);
        aVar.f39831e = n.b(com.bytedance.ies.ugc.appcontext.g.a(), 2.0f);
        aVar.f39829c = b.c(com.bytedance.ies.ugc.appcontext.g.a(), R.color.b6);
        e a2 = aVar.a();
        l.b(a2, "");
        f87565a = a2;
    }

    public static v a(Image image) {
        List<String> thumbUrls;
        List<String> urls;
        if (image == null || (((thumbUrls = image.getThumbUrls()) == null || thumbUrls.isEmpty()) && ((urls = image.getUrls()) == null || urls.isEmpty()))) {
            v a2 = r.a(" ");
            l.b(a2, "");
            return a2;
        }
        v a3 = r.a(image.toThumbFirstImageUrlModel());
        l.b(a3, "");
        return a3;
    }

    public static v a(Object obj) {
        if (obj instanceof Image) {
            v a2 = r.a(((Image) obj).toImageUrlModel());
            l.b(a2, "");
            return a2;
        } else if (obj instanceof String) {
            v a3 = r.a((String) obj);
            l.b(a3, "");
            return a3;
        } else if (obj instanceof Integer) {
            v a4 = r.a(((Number) obj).intValue());
            l.b(a4, "");
            return a4;
        } else if (obj instanceof a) {
            v a5 = r.a((a) obj);
            l.b(a5, "");
            return a5;
        } else {
            v a6 = r.a(" ");
            l.b(a6, "");
            return a6;
        }
    }
}
