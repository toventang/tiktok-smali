package com.ss.android.ugc.aweme.tools.extract;

import android.graphics.Bitmap;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.ss.android.ugc.aweme.tools.extract.l;
import com.ss.android.ugc.tools.utils.c;
import com.ss.android.ugc.tools.utils.k;
import h.f.b.l;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class s extends a {

    /* renamed from: f  reason: collision with root package name */
    private static final String f140108f = s.class.getSimpleName();

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f140109e;

    @Override // com.ss.android.ugc.aweme.tools.extract.l
    public final String e() {
        return "extract_movie";
    }

    static {
        Covode.recordClassIndex(91553);
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.ugc.aweme.tools.extract.a
    public final List<z> d() {
        List<String> list = this.f140109e;
        if (k.a(list)) {
            return null;
        }
        if (list == null) {
            l.b();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            z zVar = new z();
            zVar.f140187a = str;
            arrayList.add(zVar);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void f() {
        List<String> list = this.f140109e;
        if (list != null && !list.isEmpty()) {
            Iterator it = new HashSet(this.f140109e).iterator();
            while (it.hasNext()) {
                Bitmap a2 = c.a((String) it.next(), k.f140100a);
                if (a2 != null) {
                    String a3 = this.f139985c.a();
                    c.a(a2, new File(a3), 70, Bitmap.CompressFormat.JPEG);
                    this.f139983a.addFrameAtLastSegment(new FrameItem(a3));
                }
            }
        }
        return null;
    }

    public s(List<String> list) {
        this.f140109e = list;
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.a
    public final void a(l.a aVar) {
        super.a(aVar);
        if (b()) {
            i.b(new t(this), i.f4824a).a((g) new u(this, aVar));
        }
    }
}
