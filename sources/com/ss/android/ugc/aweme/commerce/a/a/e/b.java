package com.ss.android.ugc.aweme.commerce.a.a.e;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commerce.a.a.a.c;
import com.ss.android.ugc.aweme.commerce.a.a.b.b;
import f.a.b.a;
import f.a.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static b f73363a = new b();

    /* renamed from: b  reason: collision with root package name */
    a f73364b = new a();

    /* renamed from: c  reason: collision with root package name */
    c f73365c;

    /* renamed from: d  reason: collision with root package name */
    private a f73366d = new a();

    /* renamed from: e  reason: collision with root package name */
    private boolean f73367e;

    static {
        Covode.recordClassIndex(45161);
    }

    b() {
    }

    public final void a() {
        if (!this.f73367e) {
            this.f73367e = true;
            this.f73366d.a(c());
        }
    }

    public final void b() {
        this.f73367e = false;
        this.f73364b.a();
        com.ss.android.ugc.aweme.commerce.a.a.b.c.f73342a.f73343b.clear();
        this.f73366d.a();
    }

    private f.a.b.b c() {
        return t.a(200, TimeUnit.MILLISECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new c(this)).a(f.a.h.a.b(f.a.k.a.f158006c)).d(d.f73369a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(e.f73370a, f.f73371a);
    }

    /* access modifiers changed from: package-private */
    public final void a(View view, com.ss.android.ugc.aweme.commerce.a.a.b.b bVar) {
        g gVar;
        b.a aVar;
        if (com.ss.android.ugc.aweme.commerce.a.a.d.a.a(view)) {
            a aVar2 = this.f73364b;
            if (aVar2.f73359c.contains(view)) {
                gVar = g.PARENT_VIEW;
            } else if (aVar2.f73362f) {
                gVar = g.OBSTRUCTION_VIEW;
            } else {
                gVar = g.UNDERLYING_VIEW;
            }
            if (gVar != g.UNDERLYING_VIEW) {
                boolean z = true;
                int i2 = 0;
                if (this.f73364b.f73357a.containsKey(view)) {
                    this.f73364b.f73362f = true;
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    bVar.f73336d = new b.a(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
                    return;
                }
                if (gVar != g.PARENT_VIEW) {
                    if (!this.f73364b.f73358b.containsKey(view)) {
                        int[] iArr2 = new int[2];
                        view.getLocationOnScreen(iArr2);
                        aVar = new b.a(iArr2[0], iArr2[1], iArr2[0] + view.getWidth(), iArr2[1] + view.getHeight());
                        bVar.f73337e.add(aVar);
                    } else {
                        aVar = new b.a(0, 0, 0, 0);
                    }
                    if (bVar.f73336d != null && aVar.a(bVar.f73336d).a() == 0) {
                        int i3 = Build.VERSION.SDK_INT;
                        if ((view instanceof ViewGroup) && ((ViewGroup) view).getClipChildren()) {
                            return;
                        }
                    }
                }
                if (gVar != g.PARENT_VIEW) {
                    z = false;
                }
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (!z || Build.VERSION.SDK_INT < 21) {
                        while (i2 < viewGroup.getChildCount()) {
                            a(viewGroup.getChildAt(i2), bVar);
                            i2++;
                        }
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    while (i2 < viewGroup.getChildCount()) {
                        View childAt = viewGroup.getChildAt(i2);
                        ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                        }
                        arrayList.add(childAt);
                        i2++;
                    }
                    ArrayList arrayList2 = new ArrayList(hashMap.keySet());
                    Collections.sort(arrayList2);
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Iterator it2 = ((ArrayList) hashMap.get(it.next())).iterator();
                        while (it2.hasNext()) {
                            a((View) it2.next(), bVar);
                        }
                    }
                }
            }
        }
    }
}
