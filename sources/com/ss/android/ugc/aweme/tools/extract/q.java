package com.ss.android.ugc.aweme.tools.extract;

import android.graphics.Bitmap;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.ah;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.ss.android.ugc.aweme.tools.extract.l;
import com.ss.android.ugc.tools.utils.c;
import com.ss.android.ugc.tools.utils.h;
import com.ss.android.ugc.tools.utils.k;
import com.ss.android.vesdk.VEUtils;
import h.a.n;
import h.f.b.l;
import h.m.p;
import h.z;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public class q extends a {

    /* renamed from: e  reason: collision with root package name */
    public List<ah> f140103e;

    static {
        Covode.recordClassIndex(91549);
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.l
    public String e() {
        return "extract_movie";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.tools.extract.a
    public final List<z> d() {
        List<ah> list = this.f140103e;
        if (k.a(list)) {
            return null;
        }
        if (list == null) {
            l.b();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (T t : list) {
            z zVar = new z();
            zVar.f140187a = t.f76393a;
            zVar.f140188b = t.f76394b;
            zVar.f140189c = t.f76395c;
            arrayList.add(zVar);
        }
        return arrayList;
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f140104a;

        static {
            Covode.recordClassIndex(91550);
        }

        a(q qVar) {
            this.f140104a = qVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            if (!k.a(this.f140104a.f140103e)) {
                ArrayList<ah> arrayList = new ArrayList();
                ArrayList<ah> arrayList2 = new ArrayList();
                List<ah> list = this.f140104a.f140103e;
                if (list == null) {
                    l.b();
                }
                for (ah ahVar : list) {
                    if (h.a(ahVar.f76393a, true)) {
                        arrayList.add(ahVar);
                    } else {
                        arrayList2.add(ahVar);
                    }
                }
                HashSet hashSet = new HashSet();
                for (ah ahVar2 : arrayList) {
                    Bitmap a2 = c.a(ahVar2.f76393a, k.f140100a);
                    if (a2 != null) {
                        String a3 = this.f140104a.f139985c.a();
                        l.b(a3, "");
                        c.a(a2, new File(a3), 70, Bitmap.CompressFormat.JPEG);
                        hashSet.add(a3);
                    }
                }
                n nVar = this.f140104a.f139985c;
                l.b(nVar, "");
                String str = nVar.f140102b;
                l.b(str, "");
                String str2 = File.separator;
                l.b(str2, "");
                if (!p.c(str, str2, false)) {
                    str = str + File.separator;
                }
                int i2 = 0;
                for (ah ahVar3 : arrayList2) {
                    VEUtils.saveVideoFrames(ahVar3.f76393a, q.a(ahVar3), k.f140100a[0], -1, false, str, String.valueOf(i2) + "extract_frame", 1);
                    i2++;
                }
                File[] listFiles = new File(str).listFiles();
                if (!(listFiles == null || listFiles.length == 0)) {
                    for (File file : listFiles) {
                        l.b(file, "");
                        hashSet.add(file.getAbsolutePath());
                    }
                }
                ArrayList<String> arrayList3 = new ArrayList();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    arrayList3.add(it.next());
                }
                this.f140104a.f139983a.clearAllFrames();
                ExtractFramesModel extractFramesModel = this.f140104a.f139983a;
                ArrayList arrayList4 = new ArrayList(n.a((Iterable) arrayList3, 10));
                for (String str3 : arrayList3) {
                    arrayList4.add(new FrameItem(str3, 0, 0, 6, null));
                }
                ExtractFramesModel.addFrameSegment$default(extractFramesModel, arrayList4, null, 2, null);
            }
            return z.f158842a;
        }
    }

    public q(List<ah> list) {
        this.f140103e = list;
    }

    static final class b<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f140105a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l.a f140106b;

        static {
            Covode.recordClassIndex(91551);
        }

        b(q qVar, l.a aVar) {
            this.f140105a = qVar;
            this.f140106b = aVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            l.a aVar = this.f140106b;
            h.f.b.l.b(iVar, "");
            aVar.a(iVar.a());
            this.f140105a.a(true);
            this.f140105a.a();
            return z.f158842a;
        }
    }

    public static int[] a(ah ahVar) {
        if (ahVar.f76395c == 0) {
            return h.a.i.a(new Integer[0]);
        }
        int i2 = ((int) ahVar.f76395c) / 500;
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = (int) (ahVar.f76394b + ((long) (i3 * 500)));
        }
        return iArr;
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.a
    public final void a(l.a aVar) {
        h.f.b.l.d(aVar, "");
        super.a(aVar);
        if (b()) {
            i.b(new a(this), i.f4824a).a((g) new b(this, aVar));
        }
    }
}
