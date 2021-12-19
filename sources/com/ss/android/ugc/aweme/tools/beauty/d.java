package com.ss.android.ugc.aweme.tools.beauty;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.aweme.tools.beauty.g.c;
import h.f.a.b;
import h.f.a.m;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d {
    static {
        Covode.recordClassIndex(90827);
    }

    public static final int a(String str) {
        Integer e2;
        if (str == null || (e2 = p.e(str)) == null) {
            return -1;
        }
        return e2.intValue();
    }

    public static final boolean a(ComposerBeauty composerBeauty) {
        l.d(composerBeauty, "");
        return composerBeauty.isBeautyMode();
    }

    public static final boolean b(ComposerBeauty composerBeauty) {
        l.d(composerBeauty, "");
        String parentId = composerBeauty.getParentId();
        if (parentId == null || parentId.length() == 0) {
            return false;
        }
        return true;
    }

    public static final boolean c(ComposerBeauty composerBeauty) {
        l.d(composerBeauty, "");
        if (1 == composerBeauty.getEffect().getEffectType()) {
            return true;
        }
        return false;
    }

    public static final boolean d(ComposerBeauty composerBeauty) {
        l.d(composerBeauty, "");
        if (b(composerBeauty) || !composerBeauty.getCategoryExclusive()) {
            return false;
        }
        return true;
    }

    public static final boolean e(ComposerBeauty composerBeauty) {
        l.d(composerBeauty, "");
        if (b(composerBeauty) || d(composerBeauty) || a(composerBeauty)) {
            return true;
        }
        return false;
    }

    public static final boolean g(ComposerBeauty composerBeauty) {
        l.d(composerBeauty, "");
        if (b(composerBeauty) || composerBeauty.getCategoryExclusive() || !composerBeauty.getExtra().isNone()) {
            return false;
        }
        return true;
    }

    public static final boolean f(ComposerBeauty composerBeauty) {
        String unzipPath;
        l.d(composerBeauty, "");
        List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
        if (((items == null || items.isEmpty()) && !composerBeauty.getExtra().isNone()) || (unzipPath = composerBeauty.getEffect().getUnzipPath()) == null || unzipPath.length() == 0 || !composerBeauty.getEnable()) {
            return false;
        }
        return true;
    }

    public static final List<ComposerBeauty> a(ComposerBeauty composerBeauty, List<BeautyCategory> list) {
        l.d(composerBeauty, "");
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (T t : list) {
            Iterator<T> it = t.getBeautyList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (l.a((Object) next, (Object) composerBeauty)) {
                    if (next != null) {
                        arrayList.addAll(t.getBeautyList());
                    }
                }
            }
        }
        return arrayList;
    }

    public static final List<ComposerBeauty> c(ComposerBeauty composerBeauty, List<BeautyCategory> list) {
        T t;
        l.d(composerBeauty, "");
        ArrayList arrayList = new ArrayList();
        if (!d(composerBeauty) || list == null) {
            return arrayList;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (l.a((Object) t.getCategoryResponse().getId(), (Object) composerBeauty.getCategoryId())) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            arrayList.addAll(t2.getBeautyList());
        }
        return arrayList;
    }

    public static final ComposerBeauty b(ComposerBeauty composerBeauty, List<BeautyCategory> list) {
        String parentId;
        List<ComposerBeauty> childList;
        l.d(composerBeauty, "");
        if (!(list == null || (parentId = composerBeauty.getParentId()) == null || parentId.length() == 0)) {
            for (T t : list) {
                List<ComposerBeauty> beautyList = t.getBeautyList();
                ArrayList<ComposerBeauty> arrayList = new ArrayList();
                for (T t2 : beautyList) {
                    if (t2.isCollectionType()) {
                        arrayList.add(t2);
                    }
                }
                for (ComposerBeauty composerBeauty2 : arrayList) {
                    List<ComposerBeauty> childList2 = composerBeauty2.getChildList();
                    if (childList2 != null) {
                        Iterator<T> it = childList2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                continue;
                                break;
                            }
                            T next = it.next();
                            if (l.a((Object) next, (Object) composerBeauty)) {
                                if (next != null) {
                                    return composerBeauty2;
                                }
                            }
                        }
                    }
                }
                List<ComposerBeauty> beautyList2 = t.getBeautyList();
                ArrayList arrayList2 = new ArrayList();
                for (T t3 : beautyList2) {
                    if (t3.isBeautyMode()) {
                        arrayList2.add(t3);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        List<ComposerBeauty> childList3 = ((ComposerBeauty) it2.next()).getChildList();
                        if (childList3 != null) {
                            for (T t4 : childList3) {
                                if (t4.isCollectionType() && (childList = t4.getChildList()) != null) {
                                    Iterator<T> it3 = childList.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            continue;
                                            break;
                                        }
                                        T next2 = it3.next();
                                        if (l.a((Object) next2, (Object) composerBeauty)) {
                                            if (next2 != null) {
                                                return t4;
                                            }
                                        }
                                    }
                                }
                            }
                            continue;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final void a(ComposerBeauty composerBeauty, b<? super ComposerBeauty, Boolean> bVar, m<? super String, ? super String, int[]> mVar) {
        l.d(composerBeauty, "");
        l.d(bVar, "");
        l.d(mVar, "");
        if (bVar.invoke(composerBeauty).booleanValue() && f(composerBeauty)) {
            if (composerBeauty.getExtra().isNone()) {
                int[] invoke = mVar.invoke(composerBeauty.getEffect().getUnzipPath(), "");
                if (invoke != null && invoke.length == 2 && invoke[0] == 0 && invoke[1] == c.EXCLUDE.getFlag()) {
                    composerBeauty.setEnable(false);
                    return;
                }
                return;
            }
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (items != null) {
                Iterator<T> it = items.iterator();
                while (it.hasNext()) {
                    int[] invoke2 = mVar.invoke(composerBeauty.getEffect().getUnzipPath(), it.next().getTag());
                    if (invoke2 != null && invoke2.length == 2 && invoke2[0] == 0 && invoke2[1] == c.EXCLUDE.getFlag()) {
                        composerBeauty.setEnable(false);
                    }
                }
            }
        }
    }
}
