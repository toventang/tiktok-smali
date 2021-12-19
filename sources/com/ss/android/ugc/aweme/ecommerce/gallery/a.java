package com.ss.android.ugc.aweme.ecommerce.gallery;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.gallery.b.a.b;
import com.ss.android.ugc.aweme.ecommerce.gallery.transfer.d;
import com.ss.android.ugc.aweme.ecommerce.gallery.transfer.e;
import com.ss.android.ugc.aweme.ecommerce.gallery.transfer.g;
import com.zhiliaoapp.musically.R;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f85952a = new a();

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.a$a  reason: collision with other inner class name */
    public static final class C2064a {
        @c(a = "title")

        /* renamed from: a  reason: collision with root package name */
        public final String f85953a;
        @c(a = "url_list")

        /* renamed from: b  reason: collision with root package name */
        public final List<String> f85954b;

        static {
            Covode.recordClassIndex(53821);
        }

        private /* synthetic */ C2064a() {
            this(z.INSTANCE);
        }

        private C2064a(List<String> list) {
            l.d(list, "");
            this.f85953a = null;
            this.f85954b = list;
        }
    }

    static {
        Covode.recordClassIndex(53820);
    }

    public static /* synthetic */ void a(Context context, int i2, int i3, List list, String str, String str2, List list2, d.b bVar, d.c cVar, com.ss.android.ugc.aweme.ecommerce.gallery.b.a.a aVar, int i4) {
        long j2;
        b bVar2;
        com.ss.android.ugc.aweme.ecommerce.gallery.b.a.a aVar2 = aVar;
        if ((i4 & 16) != 0) {
            str = "";
        }
        if ((i4 & 32) != 0) {
            str2 = "";
        }
        if ((i4 & 128) != 0) {
            list2 = null;
        }
        if ((i4 & 512) != 0) {
            bVar = null;
        }
        if ((i4 & 1024) != 0) {
            cVar = null;
        }
        if ((i4 & 8192) != 0) {
            aVar2 = new com.ss.android.ugc.aweme.ecommerce.gallery.b.a.a();
        }
        l.d(context, "");
        l.d(list, "");
        l.d(str, "");
        l.d(str2, "");
        d.a aVar3 = new d.a();
        aVar3.f86016i = list;
        aVar3.f86015h = list;
        aVar3.f86017j = list2;
        aVar3.f86018k = aVar2;
        aVar3.f86019l = new b();
        aVar3.f86012e = true;
        aVar3.f86009b = R.drawable.ym;
        aVar3.f86010c = -16777216;
        aVar3.n = true;
        aVar3.o = bVar;
        aVar3.q = null;
        int i5 = 0;
        aVar3.p = false;
        aVar3.r = cVar;
        aVar3.f86013f = str;
        aVar3.f86014g = str2;
        d dVar = new d();
        dVar.f85995a = aVar3.f86008a;
        dVar.f85996b = aVar3.f86009b;
        dVar.f85997c = aVar3.f86010c;
        dVar.f85998d = aVar3.f86011d;
        dVar.f85999e = aVar3.f86012e;
        if (!com.bytedance.common.utility.collection.b.a((Collection) aVar3.f86015h)) {
            dVar.u = aVar3.f86015h.size();
            dVar.f86004j = aVar3.f86015h;
            dVar.f86005k = aVar3.f86016i;
            dVar.f86006l = aVar3.f86017j;
        }
        dVar.f86007m = aVar3.f86018k;
        dVar.n = aVar3.f86019l;
        dVar.p = aVar3.n;
        dVar.o = aVar3.f86020m;
        dVar.q = aVar3.p;
        dVar.r = aVar3.o;
        dVar.t = aVar3.q;
        dVar.s = aVar3.r;
        dVar.f86002h = aVar3.f86014g;
        dVar.f86001g = aVar3.f86013f;
        g gVar = new g(context);
        if (i2 >= i3) {
            l.b(dVar, "");
            dVar.f85995a = i3 - 1;
        } else if (i2 < 0) {
            l.b(dVar, "");
            dVar.f85995a = 0;
        } else {
            l.b(dVar, "");
            dVar.f85995a = i2;
        }
        dVar.f86000f = i3;
        if (!gVar.f86046d) {
            gVar.f86045c = dVar;
            ArrayList arrayList = new ArrayList();
            gVar.a(arrayList);
            gVar.f86045c.f86003i = arrayList;
            d dVar2 = gVar.f86045c;
            if (dVar2.f86004j == null || dVar2.f86004j.isEmpty()) {
                throw new IllegalArgumentException("the parameter sourceImageList can't be empty");
            }
            d dVar3 = gVar.f86045c;
            if (gVar.f86045c.f85995a >= 0) {
                i5 = gVar.f86045c.f85995a;
            }
            dVar3.f85995a = i5;
            d dVar4 = gVar.f86045c;
            if (gVar.f86045c.f85998d <= 0) {
                j2 = 300;
            } else {
                j2 = gVar.f86045c.f85998d;
            }
            dVar4.f85998d = j2;
            d dVar5 = gVar.f86045c;
            if (gVar.f86045c.n == null) {
                bVar2 = new b();
            } else {
                bVar2 = gVar.f86045c.n;
            }
            dVar5.n = bVar2;
            e eVar = gVar.f86044b;
            eVar.f86023c = dVar;
            eVar.f86024d = new com.ss.android.ugc.aweme.ecommerce.gallery.transfer.a(eVar);
        }
        if (!gVar.f86046d) {
            gVar.f86043a.show();
            gVar.f86046d = true;
        }
    }
}
