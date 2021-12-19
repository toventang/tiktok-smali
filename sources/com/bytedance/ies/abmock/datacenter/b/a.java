package com.bytedance.ies.abmock.datacenter.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.datacenter.e;
import com.bytedance.ies.abmock.datacenter.f;
import com.bytedance.keva.Keva;
import com.google.gson.o;
import com.google.gson.r;
import h.a.i;
import h.a.n;
import h.f.a.b;
import h.f.b.l;
import h.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Keva f31802a = Keva.getRepoSync("precise_exposure_repo", 1);

    /* renamed from: b  reason: collision with root package name */
    public static final List<String> f31803b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public static final Map<String, String> f31804c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final a f31805d = new a();

    private a() {
    }

    public static void b() {
        String c2 = c();
        e a2 = e.a();
        l.a((Object) a2, "");
        if (a2.f31826b != null) {
            e a3 = e.a();
            l.a((Object) a3, "");
            a3.f31826b.a(c2);
        }
    }

    private static String[] d() {
        String[] stringArray = f31802a.getStringArray("__client_exp_vids", new String[0]);
        l.a((Object) stringArray, "");
        return stringArray;
    }

    static {
        Covode.recordClassIndex(18596);
    }

    public static String a() {
        String str;
        e a2 = e.a();
        l.a((Object) a2, "");
        f fVar = a2.f31826b;
        if (fVar == null || (str = fVar.d()) == null) {
            str = "";
        }
        if (TextUtils.isEmpty(str) || l.a((Object) "0", (Object) str)) {
            return "";
        }
        return str;
    }

    public static String c() {
        String[] d2 = d();
        Keva keva = f31802a;
        String[] stringArray = keva.getStringArray("__exposed_vids", new String[0]);
        ArrayList arrayList = new ArrayList();
        n.a((Collection) arrayList, (Object[]) d2);
        l.a((Object) stringArray, "");
        n.a((Collection) arrayList, (Object[]) stringArray);
        e a2 = e.a();
        l.a((Object) a2, "");
        if (a2.f31826b != null) {
            String[] stringArray2 = keva.getStringArray("{__exposed_vids_for_current_user}_{" + a() + '}', new String[0]);
            l.a((Object) stringArray2, "");
            n.a((Collection) arrayList, (Object[]) stringArray2);
        }
        return n.a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (b) null, 62);
    }

    public final void a(String str) {
        l.c(str, "");
        Keva keva = f31802a;
        if (keva.contains(str)) {
            String a2 = a();
            if (f31803b.contains(str)) {
                String[] stringArray = keva.getStringArray("{__exposed_vids_for_current_user}_{" + a2 + '}', new String[0]);
                String string = keva.getString(str, "");
                l.a((Object) string, "");
                if (string.length() > 0) {
                    l.a((Object) stringArray, "");
                    if (!i.a(stringArray, string)) {
                        List k2 = i.k(stringArray);
                        k2.add(string);
                        String str2 = "{__exposed_vids_for_current_user}_{" + a2 + '}';
                        Object[] array = k2.toArray(new String[0]);
                        if (array != null) {
                            keva.storeStringArray(str2, (String[]) array);
                            b();
                            return;
                        }
                        throw new w("null cannot be cast to non-null type");
                    }
                    return;
                }
                return;
            }
            String[] stringArray2 = keva.getStringArray("__exposed_vids", new String[0]);
            String string2 = keva.getString(str, "");
            l.a((Object) string2, "");
            if (string2.length() > 0) {
                l.a((Object) stringArray2, "");
                if (!i.a(stringArray2, string2)) {
                    List k3 = i.k(stringArray2);
                    k3.add(string2);
                    Object[] array2 = k3.toArray(new String[0]);
                    if (array2 != null) {
                        keva.storeStringArray("__exposed_vids", (String[]) array2);
                        b();
                        return;
                    }
                    throw new w("null cannot be cast to non-null type");
                }
            }
        }
    }

    public static void a(o oVar, String str) {
        r d2;
        String c2;
        try {
            o f2 = oVar.f(str);
            if (f2 != null && (d2 = f2.d("vid")) != null && (c2 = d2.c()) != null) {
                f31802a.storeString(str, c2);
                f31804c.put(c2, str);
            }
        } catch (Throwable th) {
            com.bytedance.c.a.a.a.b.a("PreciseExposureManager saveKeyVid failed, " + th + " , key: " + str);
        }
    }

    public static void b(o oVar, String str) {
        com.google.gson.l c2;
        try {
            a(oVar, str);
            o f2 = oVar.f(str);
            if (f2 != null && (c2 = f2.c("val")) != null) {
                com.bytedance.ies.abmock.datacenter.c.a.f31807a.b(str, c2.toString());
            } else if (oVar.b(str)) {
                com.bytedance.ies.abmock.datacenter.c.a.f31807a.b(str, (String) null);
            } else {
                com.bytedance.ies.abmock.datacenter.c.a.f31807a.c(str);
            }
        } catch (Throwable th) {
            com.bytedance.c.a.a.a.b.a("PreciseExposureManager " + th + "  , key: " + str);
        }
    }
}
