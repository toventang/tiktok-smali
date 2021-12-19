package com.ss.android.ugc.aweme.video.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Video;
import h.f.b.ad;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Object, Object> f143243a = new LinkedHashMap();

    static {
        Covode.recordClassIndex(93753);
    }

    private <T> h.f.a.b<T, Video> a(Class<T> cls) {
        l.d(cls, "");
        Object obj = this.f143243a.get(cls);
        if (obj == null) {
            return null;
        }
        if (!ad.a(obj, 1)) {
            obj = null;
        }
        return (h.f.a.b) obj;
    }

    public final <T> void a(Class<T> cls, h.f.a.b<? super T, ? extends Video> bVar) {
        l.d(cls, "");
        l.d(bVar, "");
        this.f143243a.put(cls, bVar);
    }

    public final <T> Video a(Class<T> cls, T t) {
        l.d(cls, "");
        h.f.a.b<T, Video> a2 = a(cls);
        if (a2 != null) {
            return a2.invoke(t);
        }
        return null;
    }
}
