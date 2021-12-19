package com.ss.android.ugc.aweme.shortvideo.i;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.a.o;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.port.in.g;
import h.a.n;
import h.f.b.l;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class f extends c implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f128556a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final Keva f128557b = Keva.getRepo("CameraFilterStrategy_Repo");

    static {
        Covode.recordClassIndex(84290);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(84291);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.i.c
    public final int c() {
        return g.a().e().getFrontCameraFilter(0);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.i.a
    public final boolean b() {
        return !l.a((Object) this.f128557b.getString("CameraFilter_Selected_Filter", ""), (Object) "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0091  */
    @Override // com.ss.android.ugc.aweme.shortvideo.i.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a() {
        /*
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.i.f.a():java.lang.String");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.i.a
    public final void a(String str) {
        l.d(str, "");
        this.f128557b.storeString("CameraFilter_Selected_Filter", str);
    }

    private static FilterBean a(o oVar) {
        Collection collection;
        List list;
        FilterBean filterBean;
        Map.Entry entry = (Map.Entry) n.d((Iterable) com.ss.android.ugc.aweme.filter.repository.a.a.a.b(c.c().c().getValue()).entrySet());
        if (entry == null || (collection = (Collection) entry.getValue()) == null || collection.isEmpty() || (list = (List) entry.getValue()) == null || (filterBean = (FilterBean) n.h(list)) == null || !com.ss.android.ugc.aweme.filter.repository.a.a.c.a(oVar, filterBean)) {
            return null;
        }
        return filterBean;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.i.c
    public final int a(int i2, o oVar) {
        l.d(oVar, "");
        FilterBean a2 = a(oVar);
        if (a2 != null) {
            return a2.getId();
        }
        return com.ss.android.ugc.aweme.filter.repository.a.a.c.a(oVar.f(), 0).getId();
    }
}
