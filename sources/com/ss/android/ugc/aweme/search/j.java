package com.ss.android.ugc.aweme.search;

import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.a.a;
import com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.ss.android.ugc.aweme.search.b.c;
import com.ss.android.ugc.aweme.search.b.d;
import com.ss.android.ugc.aweme.search.i;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final List<i> f121153a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f121154b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f121155c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f121156d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f121157e;

    /* renamed from: f  reason: collision with root package name */
    public static final int f121158f;

    /* renamed from: g  reason: collision with root package name */
    public static final int f121159g;

    /* renamed from: h  reason: collision with root package name */
    public static final int f121160h;

    /* renamed from: i  reason: collision with root package name */
    public static final j f121161i = new j();

    /* renamed from: j  reason: collision with root package name */
    private static final List<i> f121162j;

    private j() {
    }

    public static final int a() {
        return f121153a.size();
    }

    static {
        Covode.recordClassIndex(78921);
        List<i> b2 = n.b(i.TOP, i.USER, i.VIDEO, i.SOUND, i.SHOP, i.LIVE, i.HASHTAG);
        f121162j = b2;
        ArrayList arrayList = new ArrayList();
        for (T t : b2) {
            int i2 = k.f121163a[t.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4 && b.a().a(true, "show_vertical_search_shop_tab", 0) != 1) {
                        }
                    } else if (!a.a()) {
                    }
                } else if (((Number) d.f120987a.getValue()).intValue() == 1) {
                }
            } else if (((Number) c.f120984a.getValue()).intValue() == 1) {
            }
            arrayList.add(t);
        }
        ArrayList<i> arrayList2 = arrayList;
        for (i iVar : arrayList2) {
            iVar.getTabName();
        }
        f121153a = arrayList2;
        f121154b = arrayList2.indexOf(i.TOP);
        f121155c = arrayList2.indexOf(i.USER);
        f121156d = arrayList2.indexOf(i.VIDEO);
        f121157e = arrayList2.indexOf(i.SOUND);
        f121158f = arrayList2.indexOf(i.SHOP);
        f121159g = arrayList2.indexOf(i.HASHTAG);
        f121160h = arrayList2.indexOf(i.LIVE);
    }

    public static final int a(String str) {
        l.d(str, "");
        return n.a((List) f121153a, (Object) i.a.a(str));
    }

    public static final String a(int i2) {
        i iVar;
        String tabName;
        if (i2 < 0) {
            return "";
        }
        List<i> list = f121153a;
        if (i2 >= list.size() || (iVar = (i) n.b((List) list, i2)) == null || (tabName = iVar.getTabName()) == null) {
            return "";
        }
        return tabName;
    }

    public static final int b(String str) {
        l.d(str, "");
        if (l.a((Object) str, (Object) "challenge")) {
            str = i.HASHTAG.getTabName();
        }
        return n.a((List) f121153a, (Object) i.a.a(str));
    }

    public static final String a(e eVar) {
        if (eVar == null) {
            return "";
        }
        Integer value = ((SearchIntermediateViewModel) ae.a(eVar, (ad.b) null).a(SearchIntermediateViewModel.class)).getSearchTabIndex().getValue();
        int i2 = f121154b;
        if (value != null && value.intValue() == i2) {
            return "general_search";
        }
        return "search_result";
    }

    public static final String b(int i2) {
        if (i2 < 0) {
            return i.TOP.getTabName();
        }
        if (i2 != f121154b) {
            if (i2 == f121155c) {
                return i.USER.getTabName();
            }
            if (i2 == f121156d) {
                return i.VIDEO.getTabName();
            }
            if (i2 == f121157e) {
                return i.SOUND.getTabName();
            }
            if (i2 == f121160h) {
                return i.LIVE.getTabName();
            }
            if (i2 == f121158f) {
                return i.SHOP.getTabName();
            }
            if (i2 == f121159g) {
                return "challenge";
            }
        }
        return i.TOP.getTabName();
    }
}
