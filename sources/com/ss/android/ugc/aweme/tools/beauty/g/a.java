package com.ss.android.ugc.aweme.tools.beauty.g;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.tools.beauty.data.BeautySyncData;
import com.ss.android.ugc.aweme.tools.beauty.service.c;
import h.a.n;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final Keva f138936a;

    /* renamed from: b  reason: collision with root package name */
    static final List<BeautySyncData> f138937b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public static c f138938c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f138939d = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(90852);
        Keva repo = Keva.getRepo("ulike_repo");
        l.b(repo, "");
        f138936a = repo;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.a$a  reason: collision with other inner class name */
    static final class C3666a extends m implements b<ComposerBeauty, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3666a f138940a = new C3666a();

        static {
            Covode.recordClassIndex(90853);
        }

        C3666a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(ComposerBeauty composerBeauty) {
            a(composerBeauty);
            return z.f158842a;
        }

        public static void a(ComposerBeauty composerBeauty) {
            l.d(composerBeauty, "");
            a.f138937b.add(new BeautySyncData(composerBeauty.getEffect().getEffectId(), composerBeauty.getEffect().getResourceId(), composerBeauty.getCategoryId(), composerBeauty.getParentId()));
        }
    }

    static BeautySyncData a(String str) {
        List<BeautySyncData> list;
        T t;
        if (!TextUtils.isEmpty(str) && (list = f138937b) != null && !list.isEmpty() && list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (l.a((Object) t.getEffectId(), (Object) str)) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                return t2;
            }
        }
        return null;
    }

    static void a(Set<String> set) {
        ArrayList arrayList = new ArrayList();
        for (T t : set) {
            if (p.e((CharSequence) t, (CharSequence) "key_selected_album")) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList<String[]> arrayList3 = new ArrayList(n.a((Iterable) arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (true) {
            Object[] objArr = null;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            com.ss.android.ugc.aweme.dependence.beauty.a.c("convert selected key:".concat(String.valueOf(str)));
            List c2 = p.c(str, new String[]{"_"});
            if (c2.size() < 6) {
                com.ss.android.ugc.aweme.dependence.beauty.a.b("bad selected key:".concat(String.valueOf(str)));
            } else {
                Object obj = c2.get(0);
                if (l.a((Object) "live", obj)) {
                    com.ss.android.ugc.aweme.dependence.beauty.a.b("not record selected key:".concat(String.valueOf(str)));
                } else {
                    objArr = new String[]{str, obj, "key_selected_album", c2.get(5)};
                }
            }
            arrayList3.add(objArr);
        }
        for (String[] strArr : arrayList3) {
            if (!(strArr == null || strArr.length == 0 || strArr.length != 4)) {
                String str2 = strArr[0];
                BeautySyncData a2 = a(strArr[3]);
                if (a2 != null) {
                    String str3 = strArr[1] + '_' + strArr[2] + '_' + a2.getResourceId();
                    Keva keva = f138936a;
                    if (!keva.contains(str3)) {
                        String string = keva.getString(str2, "");
                        l.b(string, "");
                        BeautySyncData a3 = a(string);
                        if (a3 != null) {
                            keva.storeString(str3, a3.getResourceId());
                            com.ss.android.ugc.aweme.dependence.beauty.a.c("convert selected key:" + str3 + " val:" + a3.getResourceId());
                        }
                    }
                }
            }
        }
    }
}
