package com.ss.android.ugc.aweme.specact.popup.b;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.specact.popup.a.i;
import com.ss.android.ugc.aweme.specact.popup.a.j;
import com.ss.android.ugc.aweme.specact.popup.b.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Objects;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f134518a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(87913);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.m<j, e, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f134519a = new a();

        static {
            Covode.recordClassIndex(87914);
        }

        a() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(j jVar, e eVar) {
            j jVar2 = jVar;
            l.d(jVar2, "");
            l.d(eVar, "");
            jVar2.dismiss();
            return z.f158842a;
        }
    }

    public static void a(Activity activity, i iVar) {
        l.d(activity, "");
        l.d(iVar, "");
        e eVar = new e(iVar);
        eVar.f134520a = iVar.f134438h;
        eVar.f134521b = iVar.f134436f;
        eVar.f134523d = new e.c(iVar.f134441k.get(0).f134405a);
        eVar.f134529j = iVar.f134441k.get(0).f134406b;
        eVar.f134530k = new e.a(iVar.f134442l.get(0).f134408a, e.b.YELLOW, null, null, 12);
        eVar.a(iVar.r);
        new j(activity, eVar).show();
    }

    public static void c(Activity activity, i iVar) {
        l.d(activity, "");
        l.d(iVar, "");
        e eVar = new e(iVar);
        eVar.f134520a = iVar.f134438h;
        eVar.f134521b = iVar.f134436f;
        eVar.f134523d = new e.c(iVar.f134441k.get(0).f134405a, e.d.COIN);
        eVar.f134529j = iVar.f134441k.get(0).f134406b;
        eVar.f134530k = new e.a(iVar.f134442l.get(0).f134408a, e.b.YELLOW, null, null, 12);
        eVar.a(iVar.r);
        new j(activity, eVar).show();
    }

    public static void d(Activity activity, i iVar) {
        l.d(activity, "");
        l.d(iVar, "");
        e eVar = new e(iVar);
        eVar.f134520a = iVar.f134438h;
        eVar.f134521b = iVar.f134436f;
        eVar.f134529j = iVar.f134437g;
        eVar.a(iVar.r);
        if (com.ss.android.ugc.aweme.specact.popup.calendar.a.a(activity, com.ss.android.ugc.aweme.specact.popup.calendar.a.a(iVar.f134434d, "register"))) {
            String string = activity.getString(R.string.dm0);
            l.b(string, "");
            eVar.f134530k = new e.a(string, e.b.SIMPLE, null, null, 12);
            eVar.f134531l = a.f134519a;
            eVar.f134532m = true;
        } else {
            eVar.f134532m = false;
            eVar.f134530k = new e.a(iVar.f134442l.get(0).f134408a, e.b.SIMPLE, e.d.CALENDAR, null, 8);
        }
        new j(activity, eVar).show();
    }

    public static void e(Activity activity, i iVar) {
        l.d(activity, "");
        l.d(iVar, "");
        e eVar = new e(iVar);
        eVar.f134520a = iVar.f134438h;
        eVar.f134521b = iVar.f134436f;
        eVar.f134527h = e.d.COIN2;
        eVar.f134529j = iVar.f134441k.get(0).f134406b;
        eVar.f134530k = new e.a(iVar.f134442l.get(0).f134408a, e.b.YELLOW, null, null, 12);
        eVar.a(iVar.r);
        new j(activity, eVar).show();
    }

    public static void f(Activity activity, i iVar) {
        l.d(activity, "");
        l.d(iVar, "");
        e eVar = new e(iVar);
        eVar.f134520a = iVar.f134438h;
        eVar.f134521b = iVar.f134436f;
        eVar.f134523d = new e.c(iVar.f134441k.get(0).f134405a);
        eVar.f134529j = iVar.f134441k.get(0).f134406b;
        eVar.f134530k = new e.a(iVar.f134442l.get(0).f134408a, e.b.YELLOW, null, iVar.f134442l.get(0).f134410c);
        eVar.a(iVar.r);
        eVar.f134524e = iVar.f134439i;
        eVar.f134525f = iVar.f134440j;
        new j(activity, eVar).show();
    }

    public static void b(Activity activity, i iVar) {
        l.d(activity, "");
        l.d(iVar, "");
        e eVar = new e(iVar);
        eVar.f134520a = iVar.f134438h;
        eVar.f134521b = iVar.f134436f;
        eVar.f134522c = iVar.f134437g;
        ArrayList arrayList = new ArrayList();
        if (!iVar.f134441k.isEmpty()) {
            for (com.ss.android.ugc.aweme.specact.popup.a.a aVar : iVar.f134441k) {
                for (j jVar : aVar.f134407c) {
                    arrayList.add(new e.C3497e(jVar.f134445b, jVar.f134444a, jVar.f134447d));
                }
            }
        }
        Object[] array = arrayList.toArray(new e.C3497e[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        eVar.f134528i = (e.C3497e[]) array;
        eVar.f134530k = new e.a(iVar.f134442l.get(0).f134408a, e.b.YELLOW, null, null, 12);
        eVar.a(iVar.r);
        new j(activity, eVar).show();
    }
}
