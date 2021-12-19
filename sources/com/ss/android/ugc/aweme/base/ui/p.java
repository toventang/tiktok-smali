package com.ss.android.ugc.aweme.base.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class p extends f<e> {

    /* renamed from: d  reason: collision with root package name */
    public List<j> f68395d;

    /* renamed from: e  reason: collision with root package name */
    HashMap<String, j> f68396e;

    /* renamed from: f  reason: collision with root package name */
    List<j> f68397f;

    /* renamed from: g  reason: collision with root package name */
    public i f68398g;

    /* renamed from: h  reason: collision with root package name */
    public b f68399h;

    /* renamed from: i  reason: collision with root package name */
    public c f68400i;

    /* renamed from: j  reason: collision with root package name */
    private int f68401j;

    public interface b {
        static {
            Covode.recordClassIndex(42110);
        }

        void a(HashMap<Integer, e> hashMap);

        void a(List<j> list);
    }

    public interface c {
        static {
            Covode.recordClassIndex(42111);
        }

        void a(e eVar);
    }

    static {
        Covode.recordClassIndex(42107);
    }

    @Override // com.bytedance.ies.uikit.f.b, androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // com.bytedance.ies.uikit.f.b, androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        super.finishUpdate(viewGroup);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.base.ui.f
    public final void a(HashMap<Integer, e> hashMap) {
        b bVar = this.f68399h;
        if (bVar != null) {
            bVar.a(hashMap);
        }
    }

    private long a(j jVar) {
        if (jVar == null) {
            return -1;
        }
        return (long) this.f68395d.indexOf(jVar);
    }

    private String b(j jVar) {
        return a(this.f68401j, a(jVar));
    }

    @Override // com.bytedance.ies.uikit.f.b
    public final long b(int i2) {
        List<j> list;
        List<j> list2 = this.f68397f;
        if (list2 == null || (list = this.f68395d) == null) {
            return (long) i2;
        }
        return (long) list.indexOf(list2.get(i2));
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        List<j> f68402a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public b f68403b;

        static {
            Covode.recordClassIndex(42108);
        }

        private static int a(List<j> list) {
            if (com.bytedance.common.utility.collection.b.a((Collection) list)) {
                return 0;
            }
            HashSet hashSet = new HashSet();
            for (j jVar : list) {
                if (jVar != null) {
                    hashSet.add(Integer.valueOf(jVar.f68373e));
                }
            }
            return hashSet.size();
        }

        public final p a(i iVar) {
            p pVar = new p(iVar, a(this.f68402a));
            pVar.f68399h = this.f68403b;
            pVar.f68395d = this.f68402a;
            if (!com.bytedance.common.utility.collection.b.a((Collection) pVar.f68395d)) {
                pVar.f68396e = new HashMap<>(pVar.f68395d.size());
                pVar.f68397f = new ArrayList();
                for (j jVar : pVar.f68395d) {
                    if (jVar != null) {
                        pVar.f68396e.put(jVar.f68370b, jVar);
                        int i2 = jVar.f68373e;
                        if (i2 >= pVar.f68397f.size()) {
                            pVar.f68397f.add(i2, jVar);
                        }
                    }
                }
                if (pVar.f68399h != null) {
                    pVar.f68399h.a(pVar.f68397f);
                }
                pVar.f68397f.size();
            }
            return pVar;
        }

        public final a a(Class<? extends e> cls, String str, Bundle bundle) {
            int i2;
            if (com.bytedance.common.utility.collection.b.a((Collection) this.f68402a)) {
                i2 = 0;
            } else {
                Collections.sort(this.f68402a, new Comparator<j>() {
                    /* class com.ss.android.ugc.aweme.base.ui.p.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(42109);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    @Override // java.util.Comparator
                    public final /* bridge */ /* synthetic */ int compare(j jVar, j jVar2) {
                        return jVar.f68373e - jVar2.f68373e;
                    }
                });
                i2 = 1;
                for (int i3 = 1; i3 < this.f68402a.size(); i3++) {
                    if (this.f68402a.get(i3 - 1).f68373e != this.f68402a.get(i3).f68373e) {
                        i2++;
                    }
                }
            }
            return a(cls, str, i2, bundle);
        }

        public final a a(Class<? extends e> cls, String str, int i2, Bundle bundle) {
            this.f68402a.add(new j(cls, str, i2, 1.0f, bundle));
            return this;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public e c(int i2) {
        j jVar = this.f68397f.get(i2);
        if (jVar == null) {
            return null;
        }
        try {
            e eVar = (e) jVar.f68369a.newInstance();
            if (!(jVar.f68371c == null || eVar == null)) {
                eVar.setArguments(jVar.f68371c);
            }
            return eVar;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.fragment.app.Fragment] */
    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.base.ui.f
    public final /* bridge */ /* synthetic */ void a(e eVar) {
        e eVar2 = eVar;
        c cVar = this.f68400i;
        if (cVar != null) {
            cVar.a(eVar2);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public float getPageWidth(int i2) {
        j jVar;
        if (i2 < 0 || i2 >= this.f68397f.size()) {
            jVar = null;
        } else {
            jVar = this.f68397f.get(i2);
        }
        if (jVar == null || jVar.f68372d <= 0.0f) {
            return 1.0f;
        }
        return jVar.f68372d;
    }

    public final void a(String str) {
        j jVar;
        if (!com.bytedance.common.utility.collection.b.a((Collection) this.f68395d) && !com.bytedance.common.utility.collection.b.a((Collection) this.f68397f) && !TextUtils.isEmpty(str) && (jVar = this.f68396e.get(str)) != null && this.f68397f.size() > jVar.f68373e && !str.equals(this.f68397f.get(jVar.f68373e).f68370b)) {
            n a2 = this.f68398g.a();
            Fragment a3 = this.f68398g.a(b(this.f68397f.get(jVar.f68373e)));
            if (a3 != null) {
                a2.b(a3);
            }
            Fragment a4 = this.f68398g.a(b(jVar));
            if (a4 == null || !a4.isAdded()) {
                b(jVar);
            } else {
                a2.c(a4);
            }
            a2.c();
            this.f68397f.remove(jVar.f68373e);
            this.f68397f.add(jVar.f68373e, jVar);
            b bVar = this.f68399h;
            if (bVar != null) {
                bVar.a(this.f68397f);
            }
            notifyDataSetChanged();
        }
    }

    public p(i iVar, int i2) {
        super(iVar, i2);
        this.f68398g = iVar;
    }

    @Override // com.bytedance.ies.uikit.f.b, androidx.viewpager.widget.PagerAdapter, com.ss.android.ugc.aweme.base.ui.f
    public Object instantiateItem(ViewGroup viewGroup, int i2) {
        this.f68401j = viewGroup.getId();
        return super.instantiateItem(viewGroup, i2);
    }

    private static String a(int i2, long j2) {
        return "android:switcher:" + i2 + ":" + j2;
    }
}
