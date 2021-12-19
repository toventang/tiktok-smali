package com.ss.android.ugc.aweme.tools.beauty.g;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautifyInfo;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautifyTag;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.dependence.beauty.data.ComposerBeautyBuriedInfoCopy;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra;
import com.ss.android.ugc.aweme.tools.beauty.data.BeautySyncData;
import com.ss.android.ugc.aweme.tools.beauty.data.NoneComposer;
import com.ss.android.ugc.aweme.tools.beauty.g.a;
import com.ss.android.ugc.aweme.tools.beauty.g.m;
import com.ss.android.ugc.aweme.tools.beauty.h;
import com.ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig;
import com.ss.android.ugc.aweme.tools.beauty.service.c;
import com.ss.android.ugc.aweme.utils.hx;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import h.f.b.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.am;
import kotlinx.coroutines.av;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;

public final class h implements m {

    /* renamed from: a  reason: collision with root package name */
    volatile List<BeautyCategory> f138964a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    final com.ss.android.ugc.aweme.dependence.beauty.b.d<Boolean> f138965b = new com.ss.android.ugc.aweme.dependence.beauty.b.d<>();

    /* renamed from: c  reason: collision with root package name */
    com.ss.android.ugc.aweme.dependence.beauty.b.d<List<BeautyComposerInfo>> f138966c = new com.ss.android.ugc.aweme.dependence.beauty.b.d<>();

    /* renamed from: d  reason: collision with root package name */
    final n<BeautyComposerInfo> f138967d = new n<>();

    /* renamed from: e  reason: collision with root package name */
    com.ss.android.ugc.aweme.dependence.beauty.b.d<ComposerBeauty> f138968e;

    /* renamed from: f  reason: collision with root package name */
    b f138969f;

    /* renamed from: g  reason: collision with root package name */
    com.ss.android.ugc.aweme.dependence.beauty.b.d<androidx.c.a<String, Integer>> f138970g;

    /* renamed from: h  reason: collision with root package name */
    public m.b f138971h;

    /* renamed from: i  reason: collision with root package name */
    final l f138972i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f138973j;

    /* renamed from: k  reason: collision with root package name */
    com.ss.android.ugc.aweme.tools.beauty.a f138974k;

    /* renamed from: l  reason: collision with root package name */
    List<BeautyCategory> f138975l;

    /* renamed from: m  reason: collision with root package name */
    com.ss.android.ugc.aweme.dependence.beauty.b.d<List<BeautyComposerInfo>> f138976m;
    public final d n;
    public final com.ss.android.ugc.aweme.tools.beauty.service.e o;
    final BeautyFilterConfig p;
    public com.google.gson.f q;
    private final i r = new i();
    private final com.ss.android.ugc.aweme.dependence.beauty.b.d<Boolean> s = new com.ss.android.ugc.aweme.dependence.beauty.b.d<>();
    private Map<String, n<BeautyComposerInfo>> t = new LinkedHashMap();
    private final h.h u;
    private com.ss.android.ugc.aweme.dependence.beauty.b.d<o<ComposerBeauty>> v;
    private final h.h w;
    private final p x;
    private final am y;
    private boolean z;

    static {
        Covode.recordClassIndex(90878);
    }

    private final com.ss.android.ugc.tools.b.a.d v() {
        return (com.ss.android.ugc.tools.b.a.d) this.u.getValue();
    }

    private final g w() {
        return (g) this.w.getValue();
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final void a(ComposerBeauty composerBeauty) {
        h.f.b.l.d(composerBeauty, "");
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final boolean a(BeautyCategory beautyCategory) {
        h.f.b.l.d(beautyCategory, "");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final void k(ComposerBeauty composerBeauty) {
        h.f.b.l.d(composerBeauty, "");
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final void l(ComposerBeauty composerBeauty) {
        h.f.b.l.d(composerBeauty, "");
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final List<BeautyCategory> a() {
        return this.f138964a;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final com.ss.android.ugc.aweme.dependence.beauty.b.d<Boolean> b() {
        return this.f138965b;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final com.ss.android.ugc.aweme.dependence.beauty.b.d<List<BeautyComposerInfo>> c() {
        return this.f138966c;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final n<BeautyComposerInfo> d() {
        return this.f138967d;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final Map<String, n<BeautyComposerInfo>> e() {
        return this.t;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final com.ss.android.ugc.aweme.dependence.beauty.b.d<ComposerBeauty> f() {
        return this.f138968e;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final b g() {
        return this.f138969f;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final com.ss.android.ugc.aweme.dependence.beauty.b.d<androidx.c.a<String, Integer>> h() {
        return this.f138970g;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final com.ss.android.ugc.aweme.dependence.beauty.b.d<o<ComposerBeauty>> i() {
        return this.v;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final com.ss.android.ugc.aweme.tools.beauty.a j() {
        return this.f138974k;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final com.ss.android.ugc.aweme.dependence.beauty.b.d<List<BeautyComposerInfo>> n() {
        return this.f138976m;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final BeautyFilterConfig u() {
        return this.p;
    }

    public final void a(List<BeautyCategory> list) {
        com.ss.android.ugc.aweme.tools.beauty.a defaultGender;
        h.f.b.l.d(list, "");
        this.f138975l = list;
        String flag = this.p.getDefaultGender().getFlag();
        h.f.b.l.d(flag, "");
        String string = a.f138936a.getString("key_last_gender", flag);
        h.f.b.l.b(string, "");
        if (h.f.b.l.a((Object) string, (Object) com.ss.android.ugc.aweme.tools.beauty.a.FEMALE.getFlag())) {
            defaultGender = com.ss.android.ugc.aweme.tools.beauty.a.FEMALE;
        } else if (h.f.b.l.a((Object) string, (Object) com.ss.android.ugc.aweme.tools.beauty.a.MALE.getFlag())) {
            defaultGender = com.ss.android.ugc.aweme.tools.beauty.a.MALE;
        } else {
            defaultGender = this.p.getDefaultGender();
        }
        m.a.a(this, false, defaultGender, 1);
    }

    public final void a(List<BeautyCategory> list, List<ComposerBeauty> list2) {
        T t2;
        i iVar = new i(this, list2);
        for (T t3 : list) {
            T t4 = null;
            if (t3.getBeautyCategoryExtra().getExclusive()) {
                Iterator<T> it = t3.getBeautyList().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (next.getSelected()) {
                        t4 = next;
                        break;
                    }
                }
                T t5 = t4;
                if (t5 != null) {
                    iVar.a(t5);
                }
            } else {
                for (T t6 : t3.getBeautyList()) {
                    if (com.ss.android.ugc.aweme.tools.beauty.d.c(t6)) {
                        List<ComposerBeauty> childList = t6.getChildList();
                        if (childList != null) {
                            Iterator<T> it2 = childList.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    t2 = null;
                                    break;
                                }
                                t2 = it2.next();
                                if (t2.getSelected()) {
                                    break;
                                }
                            }
                            T t7 = t2;
                            if (t7 != null) {
                                iVar.a(t7);
                            }
                        }
                    } else if (p(t6)) {
                        iVar.a(t6);
                    }
                }
            }
        }
    }

    public final void a(List<ComposerBeauty> list, n<BeautyComposerInfo> nVar) {
        w().a(list, new v(this));
        boolean z2 = false;
        for (T t2 : list) {
            if (h.f.b.l.a((Object) t2.getEffect().getEffectId(), (Object) "EFFECT_ID_TYPE_FILTER")) {
                nVar.add(new BeautyComposerInfo("EFFECT_ID_TYPE_FILTER", "", ""));
                if (!t2.needFaceDetect()) {
                }
            } else {
                List<BeautyComposerInfo> b2 = b((ComposerBeauty) t2);
                if ((!b2.isEmpty()) && b2 != null) {
                    t2.setAdd2Nodes(true);
                    nVar.addAll(b2);
                    if (!t2.needFaceDetect()) {
                    }
                }
            }
            z2 = true;
        }
        com.ss.android.ugc.aweme.dependence.beauty.b.d<o<ComposerBeauty>> dVar = this.v;
        o oVar = new o();
        if ((true ^ list.isEmpty()) && list != null) {
            for (T t3 : list) {
                if (t3 != null) {
                    oVar.add(t3);
                }
            }
        }
        com.ss.android.ugc.aweme.dependence.beauty.b.b.a(dVar, oVar);
        this.o.b(z2);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final void a(ComposerBeauty composerBeauty, boolean z2) {
        h.f.b.l.d(composerBeauty, "");
        if (com.ss.android.ugc.aweme.tools.beauty.d.b(composerBeauty) && !e(composerBeauty) && composerBeauty.getEnable()) {
            ComposerBeauty b2 = com.ss.android.ugc.aweme.tools.beauty.d.b(composerBeauty, this.f138964a);
            if (b2 != null) {
                b2.setShowDot(!z2);
            }
        } else if (com.ss.android.ugc.aweme.tools.beauty.d.d(composerBeauty) || e(composerBeauty) || !composerBeauty.getEnable()) {
            ComposerBeauty b3 = com.ss.android.ugc.aweme.tools.beauty.d.b(composerBeauty, this.f138964a);
            if (b3 != null) {
                b3.setShowDot(false);
            }
        } else {
            ComposerBeauty b4 = com.ss.android.ugc.aweme.tools.beauty.d.b(composerBeauty, this.f138964a);
            if (b4 != null) {
                b4.setShowDot(false);
            }
            composerBeauty.setShowDot(!z2);
            return;
        }
        composerBeauty.setShowDot(false);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final void a(String str) {
        this.o.a(this.f138974k, str);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final void a(String str, c.a aVar) {
        h.f.b.l.d(str, "");
        com.ss.android.ugc.tools.b.a.a.a.a(v(), str, new r(this, str, aVar));
    }

    public final List<BeautyComposerInfo> a(ComposerBeauty composerBeauty, com.ss.android.ugc.aweme.tools.beauty.c cVar) {
        boolean p2;
        ArrayList arrayList = new ArrayList();
        if (new x(this, cVar).a(composerBeauty) && com.ss.android.ugc.aweme.tools.beauty.d.f(composerBeauty)) {
            if (com.ss.android.ugc.aweme.tools.beauty.d.e(composerBeauty)) {
                p2 = composerBeauty.getSelected();
            } else {
                p2 = p(composerBeauty);
            }
            if (p2) {
                List<BeautyComposerInfo> b2 = b(composerBeauty);
                if (!b2.isEmpty()) {
                    composerBeauty.setAdd2Nodes(true);
                    this.f138967d.addAll(b2);
                    arrayList.addAll(b2);
                    o(composerBeauty);
                    this.o.b(composerBeauty.needFaceDetect());
                }
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final void a(boolean z2) {
        this.o.a(z2);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final void a(m.b bVar) {
        h.f.b.l.d(bVar, "");
        this.f138971h = bVar;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final void a(String str, boolean z2) {
        h.f.b.l.d(str, "");
        this.o.a(str, z2);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final synchronized void a(boolean z2, com.ss.android.ugc.aweme.tools.beauty.a aVar) {
        int c2;
        List<ComposerBeauty> childList;
        String[] strArr;
        MethodCollector.i(11505);
        h.f.b.l.d(aVar, "");
        int i2 = 0;
        if (this.p.isConvertKey()) {
            List<BeautyCategory> list = this.f138975l;
            h.f.b.l.d(list, "");
            List<BeautyCategory> g2 = h.a.n.g((Collection) list);
            if (g2.isEmpty()) {
                a.f138937b.clear();
            } else if (!a.f138937b.isEmpty()) {
                com.ss.android.ugc.aweme.dependence.beauty.a.c("data had parse");
            } else {
                for (BeautyCategory beautyCategory : g2) {
                    List<ComposerBeauty> beautyList = beautyCategory.getBeautyList();
                    if (beautyList != null) {
                        if (!beautyList.isEmpty()) {
                            if (beautyList != null) {
                                for (T t2 : beautyList) {
                                    if (t2.isCollectionType() && (childList = t2.getChildList()) != null && !childList.isEmpty()) {
                                        Iterator<T> it = childList.iterator();
                                        while (it.hasNext()) {
                                            a.C3666a.a(it.next());
                                        }
                                    }
                                    a.C3666a.a(t2);
                                }
                            }
                        }
                    }
                }
            }
            if (a.f138936a.getBoolean("key_had_converted_keys", false)) {
                com.ss.android.ugc.aweme.dependence.beauty.a.c("nothing to convert");
            } else {
                com.ss.android.ugc.aweme.dependence.beauty.a.c("prepare to convert data");
                Set<String> keySet = a.f138936a.getAll().keySet();
                ArrayList arrayList = new ArrayList();
                for (T t3 : keySet) {
                    if (h.m.p.e((CharSequence) t3, (CharSequence) "composer_beauty_manual")) {
                        arrayList.add(t3);
                    }
                }
                ArrayList<String> arrayList2 = arrayList;
                ArrayList<String[]> arrayList3 = new ArrayList(h.a.n.a((Iterable) arrayList2, 10));
                for (String str : arrayList2) {
                    com.ss.android.ugc.aweme.dependence.beauty.a.c("convert data key:".concat(String.valueOf(str)));
                    List c3 = h.m.p.c(str, new String[]{"_"});
                    if (c3.size() < 8) {
                        com.ss.android.ugc.aweme.dependence.beauty.a.b("bad key:".concat(String.valueOf(str)));
                    } else {
                        String str2 = (String) c3.get(i2);
                        if (h.f.b.l.a((Object) "live", (Object) str2)) {
                            com.ss.android.ugc.aweme.dependence.beauty.a.b("not record tag value key:".concat(String.valueOf(str)));
                        } else {
                            String str3 = (String) c3.get(6);
                            String str4 = (String) c3.get(7);
                            for (int i3 = 8; i3 < c3.size(); i3++) {
                                str4 = str4 + '_' + ((String) c3.get(i3));
                            }
                            strArr = new String[]{str, str2, "composer_beauty_manual", str3, str4};
                            arrayList3.add(strArr);
                            i2 = 0;
                        }
                    }
                    strArr = null;
                    arrayList3.add(strArr);
                    i2 = 0;
                }
                for (String[] strArr2 : arrayList3) {
                    if (strArr2 != null) {
                        if (strArr2.length != 0) {
                            if (strArr2.length == 5) {
                                String str5 = strArr2[0];
                                BeautySyncData a2 = a.a(strArr2[3]);
                                if (a2 != null) {
                                    String str6 = strArr2[1] + '_' + strArr2[2] + '_' + a2.getResourceId() + '_' + strArr2[4];
                                    int i4 = a.f138936a.getInt(str5, Integer.MIN_VALUE);
                                    if (i4 != Integer.MIN_VALUE && !a.f138936a.contains(str6)) {
                                        a.f138936a.storeFloat(str6, (float) i4);
                                        com.ss.android.ugc.aweme.dependence.beauty.a.c("convert key:" + str6 + " val:" + i4);
                                    }
                                }
                            }
                        }
                    }
                }
                a.a(keySet);
                a.f138936a.storeBoolean("key_had_converted_keys", true);
            }
        }
        if (!this.f138971h.a(this.p, this.f138975l)) {
            MethodCollector.o(11505);
            return;
        }
        if (z2 && aVar == com.ss.android.ugc.aweme.tools.beauty.a.FEMALE && (c2 = this.o.c()) < 3) {
            this.o.a(c2 + 1);
        }
        if (this.z || this.f138974k != aVar || !this.f138973j) {
            this.z = false;
            h.f.b.l.d(aVar, "");
            this.f138974k = aVar;
            w().a(aVar);
            w().a();
            String flag = this.f138974k.getFlag();
            h.f.b.l.d(flag, "");
            a.f138936a.storeString("key_last_gender", flag);
            com.ss.android.ugc.aweme.dependence.beauty.a.c("curGender:" + this.f138974k.getFlag());
            a(aVar);
            MethodCollector.o(11505);
            return;
        }
        MethodCollector.o(11505);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final void a(ComposerBeauty composerBeauty, m.c cVar) {
        Collection collection;
        MethodCollector.i(11846);
        h.f.b.l.d(composerBeauty, "");
        if (this.f138969f.a(composerBeauty) && com.ss.android.ugc.aweme.tools.beauty.d.f(composerBeauty) && (!com.ss.android.ugc.aweme.tools.beauty.d.e(composerBeauty) || composerBeauty.getSelected())) {
            List<BeautyComposerInfo> b2 = b(composerBeauty);
            if (com.ss.android.ugc.aweme.tools.beauty.d.e(composerBeauty)) {
                List<BeautyCategory> list = this.f138964a;
                h.f.b.l.d(composerBeauty, "");
                Object obj = null;
                if (!com.ss.android.ugc.aweme.tools.beauty.d.e(composerBeauty)) {
                    collection = new ArrayList();
                } else if (com.ss.android.ugc.aweme.tools.beauty.d.a(composerBeauty)) {
                    collection = com.ss.android.ugc.aweme.tools.beauty.d.a(composerBeauty, list);
                } else if (com.ss.android.ugc.aweme.tools.beauty.d.b(composerBeauty)) {
                    h.f.b.l.d(composerBeauty, "");
                    ArrayList arrayList = new ArrayList();
                    collection = arrayList;
                    if (com.ss.android.ugc.aweme.tools.beauty.d.b(composerBeauty)) {
                        ComposerBeauty b3 = com.ss.android.ugc.aweme.tools.beauty.d.b(composerBeauty, list);
                        collection = arrayList;
                        if (b3 != null) {
                            List<ComposerBeauty> childList = b3.getChildList();
                            collection = arrayList;
                            if (childList != null) {
                                collection = arrayList;
                                if (!childList.isEmpty()) {
                                    arrayList.addAll(childList);
                                    collection = arrayList;
                                }
                            }
                        }
                    }
                } else if (com.ss.android.ugc.aweme.tools.beauty.d.d(composerBeauty)) {
                    collection = com.ss.android.ugc.aweme.tools.beauty.d.c(composerBeauty, list);
                } else {
                    collection = new ArrayList();
                }
                if (!(!collection.isEmpty()) || collection == null) {
                    MethodCollector.o(11846);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    ComposerBeauty composerBeauty2 = (ComposerBeauty) next;
                    if (composerBeauty2.getAdd2Nodes() && (!h.f.b.l.a(composerBeauty2, composerBeauty))) {
                        obj = next;
                        break;
                    }
                }
                ComposerBeauty composerBeauty3 = (ComposerBeauty) obj;
                if (composerBeauty3 != null) {
                    composerBeauty3.setAdd2Nodes(false);
                    com.ss.android.ugc.aweme.tools.beauty.b bVar = new com.ss.android.ugc.aweme.tools.beauty.b(composerBeauty.getEffect().getEffectId(), 1);
                    h.f.b.l.d(bVar, "");
                    g w2 = w();
                    h.f.b.l.d(bVar, "");
                    synchronized (w2) {
                        try {
                            w2.f138959a.remove(bVar);
                        } catch (Throwable th) {
                            MethodCollector.o(11846);
                            throw th;
                        }
                    }
                    w2.b();
                    arrayList2.addAll(b(composerBeauty3));
                    o<ComposerBeauty> value = this.v.getValue();
                    if (value != null) {
                        value.remove(composerBeauty3);
                    }
                }
                composerBeauty.setAdd2Nodes(true);
                a(new com.ss.android.ugc.aweme.tools.beauty.b(composerBeauty.getEffect().getEffectId(), 1));
                cVar.a(arrayList2, b2);
                this.f138967d.removeAll(arrayList2);
                this.f138967d.addAll(b2);
                o(composerBeauty);
                this.o.b(composerBeauty.needFaceDetect());
                MethodCollector.o(11846);
                return;
            }
            composerBeauty.setAdd2Nodes(true);
            a(new com.ss.android.ugc.aweme.tools.beauty.b(composerBeauty.getEffect().getEffectId(), 1));
            cVar.a(b2);
            this.f138967d.addAll(b2);
            o(composerBeauty);
            this.o.b(composerBeauty.needFaceDetect());
        }
        MethodCollector.o(11846);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$h  reason: collision with other inner class name */
    static final class C3669h extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.tools.b.a.d> {
        final /* synthetic */ h.f.a.a $effectPlatformProvider;

        static {
            Covode.recordClassIndex(90888);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3669h(h.f.a.a aVar) {
            super(0);
            this.$effectPlatformProvider = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ com.ss.android.ugc.tools.b.a.d invoke() {
            return this.$effectPlatformProvider.invoke();
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final boolean q() {
        return this.o.a();
    }

    static final class a extends h.f.b.m implements h.f.a.a<g> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(90881);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ g invoke() {
            return new g(this.this$0.p, this.this$0.q);
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final void t() {
        this.f138969f.a().a().clear();
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final synchronized void l() {
        MethodCollector.i(11681);
        com.ss.android.ugc.aweme.dependence.beauty.b.b.a(this.f138966c, m());
        MethodCollector.o(11681);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final com.ss.android.ugc.aweme.dependence.beauty.data.a o() {
        int i2 = 0;
        if (!com.ss.android.ugc.aweme.tools.beauty.e.a.f138919i) {
            return new com.ss.android.ugc.aweme.dependence.beauty.data.a(0, 0);
        }
        if (com.ss.android.ugc.aweme.tools.beauty.e.a.f138920j == 2) {
            i2 = 1;
        }
        return new com.ss.android.ugc.aweme.dependence.beauty.data.a(i2 ^ 1, 1);
    }

    public final n<BeautyComposerInfo> m() {
        List<BeautyCategory> list = this.f138964a;
        ArrayList arrayList = new ArrayList();
        for (T t2 : list) {
            if (b(t2.getCategoryResponse().getId())) {
                arrayList.add(t2);
            }
        }
        c cVar = new c(this, arrayList);
        n<BeautyComposerInfo> nVar = new n<>();
        for (BeautyComposerInfo beautyComposerInfo : this.f138967d) {
            if (cVar.a(beautyComposerInfo)) {
                nVar.add(beautyComposerInfo);
            }
        }
        return nVar;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final ComposerBeautyBuriedInfoCopy p() {
        if (this.f138973j) {
            return new ComposerBeautyBuriedInfoCopy(0, 0, 0, null, 12, null);
        }
        z.c cVar = new z.c();
        int i2 = 0;
        cVar.element = 0;
        z.c cVar2 = new z.c();
        cVar2.element = 0;
        ArrayList arrayList = new ArrayList();
        a(new p(arrayList, new o(this, cVar, cVar2)));
        int i3 = cVar.element;
        if (com.ss.android.ugc.aweme.tools.beauty.e.a.p != null) {
            i2 = 1;
        }
        return new ComposerBeautyBuriedInfoCopy(i3, i2, cVar2.element, arrayList);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final List<ComposerBeauty> s() {
        List<BeautyCategory> list = this.f138964a;
        j jVar = new j(this);
        h.f.b.l.d(jVar, "");
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                for (T t2 : it.next().getBeautyList()) {
                    if (t2.isCollectionType()) {
                        List<ComposerBeauty> childList = t2.getChildList();
                        if (childList != null && !childList.isEmpty()) {
                            arrayList.addAll(childList);
                        }
                    } else {
                        arrayList.add(t2);
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Boolean) jVar.invoke(obj)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* access modifiers changed from: package-private */
    public static final class w extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ ComposerBeauty $beauty;
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(90906);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(h hVar, ComposerBeauty composerBeauty) {
            super(0);
            this.this$0 = hVar;
            this.$beauty = composerBeauty;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            String effectId = this.$beauty.getEffect().getEffectId();
            int b2 = this.this$0.f138969f.b(this.$beauty);
            androidx.c.a<String, Integer> value = this.this$0.f138970g.getValue();
            if (value != null) {
                value.put(effectId, Integer.valueOf(b2));
            }
            Iterator<T> it = this.this$0.f138964a.iterator();
            while (it.hasNext()) {
                for (T t : it.next().getBeautyList()) {
                    if (t.isCollectionType()) {
                        List<ComposerBeauty> childList = t.getChildList();
                        if (childList != null) {
                            for (T t2 : childList) {
                                int b3 = this.this$0.f138969f.b(t2);
                                if (t2.getDownloadState() != b3) {
                                    t2.setDownloadState(b3);
                                    if (value != null) {
                                        value.put(t2.getEffect().getEffectId(), Integer.valueOf(b3));
                                    }
                                }
                            }
                        }
                    } else {
                        int b4 = this.this$0.f138969f.b(t);
                        if (t.getDownloadState() != b4) {
                            t.setDownloadState(b4);
                            if (value != null) {
                                value.put(t.getEffect().getEffectId(), Integer.valueOf(b4));
                            }
                        }
                    }
                }
            }
            this.this$0.f138970g.setValue(value);
            return h.z.f158842a;
        }
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k() {
        /*
        // Method dump skipped, instructions count: 326
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.beauty.g.h.k():void");
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata r() {
        /*
        // Method dump skipped, instructions count: 321
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.beauty.g.h.r():com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata");
    }

    /* access modifiers changed from: package-private */
    public static final class b extends h.f.b.m implements h.f.a.b<ComposerBeauty, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f138977a = new b();

        static {
            Covode.recordClassIndex(90882);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(ComposerBeauty composerBeauty) {
            a(composerBeauty);
            return h.z.f158842a;
        }

        public static void a(ComposerBeauty composerBeauty) {
            h.f.b.l.d(composerBeauty, "");
            composerBeauty.setSelected(false);
            composerBeauty.setShowDot(false);
            composerBeauty.setAdd2Nodes(false);
            composerBeauty.setProgressValue(0);
            composerBeauty.setEnable(true);
        }
    }

    public static final class d implements com.ss.android.ugc.aweme.dependence.a.a.a.a<com.ss.android.ugc.aweme.tools.beauty.c, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f138978a;

        static {
            Covode.recordClassIndex(90884);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(h hVar) {
            this.f138978a = hVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.aweme.dependence.a.a.a.a
        public final /* synthetic */ void a(com.ss.android.ugc.aweme.tools.beauty.c cVar) {
            com.ss.android.ugc.aweme.tools.beauty.c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            this.f138978a.i(cVar2.f138896a);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.aweme.dependence.a.a.a.a
        public final /* synthetic */ void b(com.ss.android.ugc.aweme.tools.beauty.c cVar) {
            com.ss.android.ugc.aweme.tools.beauty.c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            this.f138978a.i(cVar2.f138896a);
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = this.f138978a.f138964a.iterator();
            while (it.hasNext()) {
                for (T t : it.next().getBeautyList()) {
                    if (t.isCollectionType()) {
                        List<ComposerBeauty> childList = t.getChildList();
                        if (childList != null) {
                            for (T t2 : childList) {
                                arrayList.addAll(this.f138978a.a(t2, cVar2));
                                if (h.f.b.l.a((Object) t2.getEffect().getUnzipPath(), (Object) cVar2.f138896a.getEffect().getUnzipPath())) {
                                    com.ss.android.ugc.aweme.dependence.beauty.b.b.a(this.f138978a.f138968e, t2);
                                }
                            }
                        }
                    } else {
                        arrayList.addAll(this.f138978a.a(t, cVar2));
                        if (h.f.b.l.a((Object) t.getEffect().getUnzipPath(), (Object) cVar2.f138896a.getEffect().getUnzipPath())) {
                            com.ss.android.ugc.aweme.dependence.beauty.b.b.a(this.f138978a.f138968e, t);
                        }
                    }
                }
            }
            com.ss.android.ugc.aweme.dependence.beauty.b.b.a(this.f138978a.f138976m, arrayList);
            com.ss.android.ugc.aweme.tools.beauty.e.a.a.a(cVar2.f138896a, 0, "success");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Integer, java.lang.Exception] */
        @Override // com.ss.android.ugc.aweme.dependence.a.a.a.a
        public final /* synthetic */ void a(com.ss.android.ugc.aweme.tools.beauty.c cVar, Integer num, Exception exc) {
            com.ss.android.ugc.aweme.tools.beauty.c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            this.f138978a.i(cVar2.f138896a);
            com.ss.android.ugc.aweme.tools.beauty.e.a.a.a(cVar2.f138896a, 1, new StringBuilder().append(num).append('_').append(exc).toString());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends h.f.b.m implements h.f.a.b<ComposerBeauty, h.z> {
        final /* synthetic */ List $result;
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(90889);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(h hVar, List list) {
            super(1);
            this.this$0 = hVar;
            this.$result = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(ComposerBeauty composerBeauty) {
            a(composerBeauty);
            return h.z.f158842a;
        }

        public final void a(ComposerBeauty composerBeauty) {
            h.f.b.l.d(composerBeauty, "");
            List<BeautyComposerInfo> b2 = this.this$0.b(composerBeauty);
            if ((!b2.isEmpty()) && b2 != null) {
                this.$result.add(composerBeauty);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class s extends h.f.b.m implements h.f.a.b<List<? extends ComposerBeauty>, h.z> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(90902);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(h hVar) {
            super(1);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(List<? extends ComposerBeauty> list) {
            a(list);
            return h.z.f158842a;
        }

        public final void a(List<ComposerBeauty> list) {
            T t;
            h.f.b.l.d(list, "");
            Iterator<T> it = list.iterator();
            do {
                t = null;
                if (!it.hasNext()) {
                    break;
                }
                t = it.next();
            } while (!t.getExtra().getDefault());
            T t2 = t;
            if (t2 != null) {
                t2.setSelected(true);
                this.this$0.c((ComposerBeauty) t2);
                this.this$0.g(t2);
            } else if ((!list.isEmpty()) && list != null) {
                list.get(0).setSelected(true);
                this.this$0.c(list.get(0));
                this.this$0.g(list.get(0));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class t extends h.f.b.m implements h.f.a.b<List<? extends ComposerBeauty>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f138988a = new t();

        static {
            Covode.recordClassIndex(90903);
        }

        t() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(List<? extends ComposerBeauty> list) {
            a(list);
            return h.z.f158842a;
        }

        public static void a(List<ComposerBeauty> list) {
            T t;
            h.f.b.l.d(list, "");
            Iterator<T> it = list.iterator();
            do {
                t = null;
                if (!it.hasNext()) {
                    break;
                }
                t = it.next();
            } while (!t.getExtra().getDefault());
            T t2 = t;
            if (t2 != null) {
                t2.setSelected(true);
            } else if ((!list.isEmpty()) && list != null) {
                list.get(0).setSelected(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class u extends h.f.b.m implements h.f.a.b<List<? extends BeautyCategory>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final u f138989a = new u();

        static {
            Covode.recordClassIndex(90904);
        }

        u() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(List<? extends BeautyCategory> list) {
            a(list);
            return h.z.f158842a;
        }

        public static void a(List<BeautyCategory> list) {
            T t;
            h.f.b.l.d(list, "");
            Iterator<T> it = list.iterator();
            do {
                t = null;
                if (!it.hasNext()) {
                    break;
                }
                t = it.next();
            } while (!t.getBeautyCategoryExtra().getDefault());
            T t2 = t;
            if (t2 != null) {
                t2.setSelected(true);
            } else if ((!list.isEmpty()) && list != null) {
                list.get(0).setSelected(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.f.b.m implements h.f.a.b<BeautyComposerInfo, Boolean> {
        final /* synthetic */ List $availableCategory;
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(90883);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h hVar, List list) {
            super(1);
            this.this$0 = hVar;
            this.$availableCategory = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(BeautyComposerInfo beautyComposerInfo) {
            return Boolean.valueOf(a(beautyComposerInfo));
        }

        public final boolean a(BeautyComposerInfo beautyComposerInfo) {
            T t;
            h.f.b.l.d(beautyComposerInfo, "");
            if (h.f.b.l.a((Object) beautyComposerInfo.f79584a, (Object) "EFFECT_ID_TYPE_FILTER")) {
                return true;
            }
            for (BeautyCategory beautyCategory : this.$availableCategory) {
                Iterator<T> it = beautyCategory.getBeautyList().iterator();
                while (true) {
                    if (it.hasNext()) {
                        T next = it.next();
                        if (next.isCollectionType()) {
                            List<ComposerBeauty> childList = next.getChildList();
                            if (childList != null) {
                                Iterator<T> it2 = childList.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        t = null;
                                        break;
                                    }
                                    t = it2.next();
                                    if (h.f.b.l.a((Object) t.getEffect().getEffectId(), (Object) beautyComposerInfo.f79586c)) {
                                        break;
                                    }
                                }
                                T t2 = t;
                                if (t2 != null) {
                                    return this.this$0.n(t2);
                                }
                            } else {
                                continue;
                            }
                        } else if (h.f.b.l.a((Object) next.getEffect().getEffectId(), (Object) beautyComposerInfo.f79586c)) {
                            return this.this$0.n(next);
                        }
                    }
                }
            }
            return false;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<ComposerBeauty, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f138982a = new k();

        static {
            Covode.recordClassIndex(90891);
        }

        k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CharSequence invoke(ComposerBeauty composerBeauty) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            h.f.b.l.d(composerBeauty2, "");
            return composerBeauty2.getEffect().getName();
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<ComposerBeauty, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f138983a = new m();

        static {
            Covode.recordClassIndex(90893);
        }

        m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CharSequence invoke(ComposerBeauty composerBeauty) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            h.f.b.l.d(composerBeauty2, "");
            return composerBeauty2.getEffect().getEffectId();
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<ComposerBeauty, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f138984a = new n();

        static {
            Covode.recordClassIndex(90894);
        }

        n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CharSequence invoke(ComposerBeauty composerBeauty) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            h.f.b.l.d(composerBeauty2, "");
            return composerBeauty2.getEffect().getId();
        }
    }

    public static final class r implements IFetchEffectChannelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f138985a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f138986b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c.a f138987c;

        static {
            Covode.recordClassIndex(90899);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            bz unused = kotlinx.coroutines.i.a(bs.f159054a, null, null, new a(this, effectChannelResponse, null), 3);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
            String str;
            Exception exc;
            String str2 = this.f138986b;
            if (exceptionResult == null || (str = exceptionResult.getMsg()) == null) {
                str = "request fail";
            }
            com.ss.android.ugc.aweme.tools.beauty.e.a.a.a(str2, 1, str);
            c.a aVar = this.f138987c;
            if (aVar != null) {
                if (exceptionResult != null) {
                    exc = exceptionResult.getException();
                } else {
                    exc = null;
                }
                aVar.a(new Exception(exc));
            }
            if (exceptionResult != null) {
                com.ss.android.ugc.aweme.dependence.beauty.a.a(exceptionResult.getException());
            }
        }

        /* access modifiers changed from: package-private */
        public static final class a extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
            final /* synthetic */ EffectChannelResponse $response;
            Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ r this$0;

            static {
                Covode.recordClassIndex(90900);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(r rVar, EffectChannelResponse effectChannelResponse, h.c.d dVar) {
                super(2, dVar);
                this.this$0 = rVar;
                this.$response = effectChannelResponse;
            }

            @Override // h.c.b.a.a
            public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                h.f.b.l.d(dVar, "");
                return new a(this.this$0, this.$response, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
                return ((a) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$r$a$a  reason: collision with other inner class name */
            public static final class C3670a extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
                final /* synthetic */ List $categories;
                int label;
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(90901);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C3670a(List list, h.c.d dVar, a aVar) {
                    super(2, dVar);
                    this.$categories = list;
                    this.this$0 = aVar;
                }

                @Override // h.c.b.a.a
                public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                    h.f.b.l.d(dVar, "");
                    return new C3670a(this.$categories, dVar, this.this$0);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
                    return ((C3670a) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
                }

                @Override // h.c.b.a.a
                public final Object invokeSuspend(Object obj) {
                    if (this.label == 0) {
                        h.r.a(obj);
                        this.this$0.this$0.f138985a.f138973j = false;
                        this.this$0.this$0.f138985a.a(this.$categories);
                        com.ss.android.ugc.aweme.dependence.beauty.a.c("LJT sendRequest: set categories to allData");
                        com.ss.android.ugc.aweme.dependence.beauty.a.c("LJT sendRequest: allData size is " + this.this$0.this$0.f138985a.f138975l.size());
                        com.ss.android.ugc.aweme.tools.beauty.e.a.a.a(this.this$0.this$0.f138986b, 0, "success");
                        c.a aVar = this.this$0.this$0.f138987c;
                        if (aVar == null) {
                            return null;
                        }
                        aVar.a(this.$categories);
                        return h.z.f158842a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                List<BeautyCategory> arrayList;
                List<Effect> allCategoryEffects;
                List<EffectCategoryResponse> categoryResponseList;
                List<EffectCategoryResponse> categoryResponseList2;
                h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    h.r.a(obj);
                    String str = "";
                    EffectChannelResponse effectChannelResponse = this.$response;
                    if (!(effectChannelResponse == null || (categoryResponseList2 = effectChannelResponse.getCategoryResponseList()) == null)) {
                        Iterator<T> it = categoryResponseList2.iterator();
                        while (it.hasNext()) {
                            str = str + it.next().getName() + ",";
                        }
                    }
                    StringBuilder sb = new StringBuilder("LJT sendRequest: get EffectChannelResponse: size is: ");
                    EffectChannelResponse effectChannelResponse2 = this.$response;
                    com.ss.android.ugc.aweme.dependence.beauty.a.c(sb.append((effectChannelResponse2 == null || (categoryResponseList = effectChannelResponse2.getCategoryResponseList()) == null) ? null : h.c.b.a.b.a(categoryResponseList.size())).append(", name:").append(str).toString());
                    EffectChannelResponse effectChannelResponse3 = this.$response;
                    if (effectChannelResponse3 != null) {
                        List<EffectCategoryResponse> categoryResponseList3 = effectChannelResponse3.getCategoryResponseList();
                        if ((categoryResponseList3 == null || categoryResponseList3.isEmpty()) && ((allCategoryEffects = effectChannelResponse3.getAllCategoryEffects()) == null || allCategoryEffects.isEmpty())) {
                            com.ss.android.ugc.aweme.tools.beauty.e.a.a.a(this.this$0.f138986b, 1, "data is empty");
                            c.a aVar2 = this.this$0.f138987c;
                            if (aVar2 != null) {
                                aVar2.a(new Exception("data is empty"));
                            }
                            return h.z.f158842a;
                        }
                        if (effectChannelResponse3.getCategoryResponseList().size() > 0) {
                            arrayList = this.this$0.f138985a.d(effectChannelResponse3.getCategoryResponseList());
                        } else {
                            arrayList = new ArrayList<>();
                        }
                        for (BeautyCategory beautyCategory : arrayList) {
                            if (arrayList.isEmpty()) {
                                com.ss.android.ugc.aweme.dependence.beauty.a.c("LJT sendRequest: response is empty or categories is emptry after conversion");
                            } else {
                                com.ss.android.ugc.aweme.dependence.beauty.a.c("LJT sendRequest: categories converted from rsp, " + beautyCategory.getCategoryResponse().getName());
                            }
                        }
                        if (this.this$0.f138985a.f138971h.a(this.this$0.f138985a.p, arrayList)) {
                            kotlinx.coroutines.android.b bVar = com.ss.android.ugc.aweme.dependence.beauty.b.a.f79582a;
                            C3670a aVar3 = new C3670a(arrayList, null, this);
                            this.L$0 = effectChannelResponse3;
                            this.L$1 = arrayList;
                            this.label = 1;
                            if (kotlinx.coroutines.i.a(bVar, aVar3, this) == aVar) {
                                return aVar;
                            }
                        } else {
                            this.this$0.f138985a.o.a((List<BeautyCategory>) null);
                            this.this$0.f138985a.k();
                            com.ss.android.ugc.aweme.tools.beauty.e.a.a.a(this.this$0.f138986b, 1, "data is not valid");
                            c.a aVar4 = this.this$0.f138987c;
                            if (aVar4 != null) {
                                aVar4.a(new Exception("data is not valid!!!"));
                            }
                        }
                    }
                    return h.z.f158842a;
                } else if (i2 == 1) {
                    arrayList = (List) this.L$1;
                    h.r.a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.this$0.f138985a.o.a(arrayList);
                this.this$0.f138985a.b(arrayList);
                return h.z.f158842a;
            }
        }

        r(h hVar, String str, c.a aVar) {
            this.f138985a = hVar;
            this.f138986b = str;
            this.f138987c = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class x extends h.f.b.m implements h.f.a.b<ComposerBeauty, Boolean> {
        final /* synthetic */ com.ss.android.ugc.aweme.tools.beauty.c $beautyDownload;
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(90907);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(h hVar, com.ss.android.ugc.aweme.tools.beauty.c cVar) {
            super(1);
            this.this$0 = hVar;
            this.$beautyDownload = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(ComposerBeauty composerBeauty) {
            return Boolean.valueOf(a(composerBeauty));
        }

        public final boolean a(ComposerBeauty composerBeauty) {
            h.f.b.l.d(composerBeauty, "");
            if (!h.f.b.l.a((Object) this.$beautyDownload.f138897b, (Object) composerBeauty.getEffect().getUnzipPath()) || this.this$0.e(composerBeauty) || !this.this$0.f138969f.a(composerBeauty)) {
                return false;
            }
            return true;
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final void c(ComposerBeauty composerBeauty) {
        h.f.b.l.d(composerBeauty, "");
        a(composerBeauty, false);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final void f(ComposerBeauty composerBeauty) {
        h.f.b.l.d(composerBeauty, "");
        this.o.a(composerBeauty, this.f138974k);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final void g(ComposerBeauty composerBeauty) {
        h.f.b.l.d(composerBeauty, "");
        this.o.b(composerBeauty, this.f138974k);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final String h(ComposerBeauty composerBeauty) {
        h.f.b.l.d(composerBeauty, "");
        return this.o.a(this.f138974k, composerBeauty);
    }

    public final void i(ComposerBeauty composerBeauty) {
        hx.a(0, new w(this, composerBeauty));
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> implements f.a.d.f<ArrayList<ComposerBeauty>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f138981a;

        static {
            Covode.recordClassIndex(90887);
        }

        g(h hVar) {
            this.f138981a = hVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(ArrayList<ComposerBeauty> arrayList) {
            ArrayList<ComposerBeauty> arrayList2 = arrayList;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                this.f138981a.f138969f.a().b();
            }
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<ComposerBeauty, Boolean> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(90890);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(h hVar) {
            super(1);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(ComposerBeauty composerBeauty) {
            boolean z;
            ComposerBeauty composerBeauty2 = composerBeauty;
            h.f.b.l.d(composerBeauty2, "");
            if (!this.this$0.f138969f.a(composerBeauty2) || !com.ss.android.ugc.aweme.tools.beauty.d.f(composerBeauty2)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<ComposerBeauty, CharSequence> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(90892);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(h hVar) {
            super(1);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CharSequence invoke(ComposerBeauty composerBeauty) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            h.f.b.l.d(composerBeauty2, "");
            return String.valueOf(this.this$0.d(composerBeauty2).f39387a.intValue());
        }
    }

    static final class p extends h.f.b.m implements h.f.a.b<ComposerBeauty, h.z> {
        final /* synthetic */ o $createBeautyInfo$1;
        final /* synthetic */ ArrayList $result;

        static {
            Covode.recordClassIndex(90896);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(ArrayList arrayList, o oVar) {
            super(1);
            this.$result = arrayList;
            this.$createBeautyInfo$1 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(ComposerBeauty composerBeauty) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            h.f.b.l.d(composerBeauty2, "");
            this.$result.add(this.$createBeautyInfo$1.invoke(composerBeauty2));
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class v extends h.f.b.m implements h.f.a.b<ComposerBeauty, Boolean> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(90905);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(h hVar) {
            super(1);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(ComposerBeauty composerBeauty) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            h.f.b.l.d(composerBeauty2, "");
            return Boolean.valueOf(this.this$0.e(composerBeauty2));
        }
    }

    private final void o(ComposerBeauty composerBeauty) {
        o<ComposerBeauty> value = this.v.getValue();
        if (value != null) {
            value.add(composerBeauty);
        }
        com.ss.android.ugc.aweme.dependence.beauty.b.d<o<ComposerBeauty>> dVar = this.v;
        com.ss.android.ugc.aweme.dependence.beauty.b.b.a(dVar, dVar.getValue());
    }

    private final boolean p(ComposerBeauty composerBeauty) {
        if (!composerBeauty.getExtra().getDisableCache() || this.p.getAutoApplyBeauty()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final void a(com.ss.android.ugc.aweme.tools.beauty.b bVar) {
        h.f.b.l.d(bVar, "");
        w().a(bVar);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final boolean b(String str) {
        h.f.b.l.d(str, "");
        return this.o.b(str, true);
    }

    public final boolean j(ComposerBeauty composerBeauty) {
        if (composerBeauty.getExtra().isNone()) {
            return false;
        }
        if (p(composerBeauty) || composerBeauty.getAdd2Nodes()) {
            return true;
        }
        return false;
    }

    private final ComposerBeautyExtra a(Effect effect) {
        boolean z2;
        String extra = effect.getExtra();
        if (extra == null || extra.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ComposerBeautyExtra composerBeautyExtra = null;
        if (z2) {
            return null;
        }
        try {
            composerBeautyExtra = (ComposerBeautyExtra) this.q.a(effect.getExtra(), ComposerBeautyExtra.class);
            return composerBeautyExtra;
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.dependence.beauty.a.a("parseComposerBeautyExtra ," + Log.getStackTraceString(e2));
            return composerBeautyExtra;
        }
    }

    public final List<BeautyCategory> d(List<EffectCategoryResponse> list) {
        ArrayList arrayList = new ArrayList();
        for (T t2 : list) {
            BeautyCategoryExtra a2 = a((EffectCategoryResponse) t2);
            if (a2 != null) {
                arrayList.add(new BeautyCategory(t2, a2, a(t2, a2), false, 8, null));
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final boolean e(ComposerBeauty composerBeauty) {
        h.f.b.l.d(composerBeauty, "");
        if (composerBeauty.getExtra().isNone() || d(composerBeauty).f39389c.booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final void m(ComposerBeauty composerBeauty) {
        h.f.b.l.d(composerBeauty, "");
        if (!this.f138969f.a(composerBeauty)) {
            this.f138969f.a(new com.ss.android.ugc.aweme.tools.beauty.c(composerBeauty), this.n);
            b bVar = this.f138969f;
            com.ss.android.ugc.aweme.tools.beauty.c cVar = new com.ss.android.ugc.aweme.tools.beauty.c(composerBeauty);
            h.f.b.l.d(cVar, "");
            bVar.a().b(cVar, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$1  reason: invalid class name */
    public static final class AnonymousClass1 extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
        int label;
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(90879);
        }

        {
            this.this$0 = r2;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new AnonymousClass1(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
            return ((AnonymousClass1) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.h$1$a */
        public static final class a extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super List<BeautyCategory>>, Object> {
            int label;
            final /* synthetic */ AnonymousClass1 this$0;

            static {
                Covode.recordClassIndex(90880);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(AnonymousClass1 r2, h.c.d dVar) {
                super(2, dVar);
                this.this$0 = r2;
            }

            @Override // h.c.b.a.a
            public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                h.f.b.l.d(dVar, "");
                return new a(this.this$0, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final Object invoke(am amVar, h.c.d<? super List<BeautyCategory>> dVar) {
                return ((a) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    h.r.a(obj);
                    List<BeautyCategory> b2 = this.this$0.this$0.o.b();
                    String str = "";
                    if (b2 != null) {
                        Iterator<T> it = b2.iterator();
                        while (it.hasNext()) {
                            str = str + it.next().getCategoryResponse().getName();
                        }
                    }
                    com.ss.android.ugc.aweme.dependence.beauty.a.c("LJT getPanelDataFromLocal: ".concat(String.valueOf(str)));
                    if (b2 == null || this.this$0.this$0.f138971h.a(this.this$0.this$0.p, b2)) {
                        return b2;
                    }
                    com.ss.android.ugc.aweme.dependence.beauty.a.c("LJT getPanelDataFromLocal: panel not valid, local is null");
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                h.r.a(obj);
                av avVar = kotlinx.coroutines.i.b(bs.f159054a, bf.f159041b, null, new a(this, null), 2);
                this.label = 1;
                obj = avVar.a(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                h.r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List<BeautyCategory> list = (List) obj;
            if (list != null) {
                this.this$0.a(list);
                this.this$0.f138973j = false;
            } else {
                this.this$0.k();
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T, R> implements f.a.d.g<ArrayList<ComposerBeauty>, ArrayList<ComposerBeauty>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f138979a;

        static {
            Covode.recordClassIndex(90885);
        }

        e(h hVar) {
            this.f138979a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ ArrayList<ComposerBeauty> apply(ArrayList<ComposerBeauty> arrayList) {
            ArrayList<ComposerBeauty> arrayList2 = arrayList;
            h.f.b.l.d(arrayList2, "");
            ArrayList arrayList3 = new ArrayList();
            for (T t : arrayList2) {
                this.f138979a.i(t);
                if (!this.f138979a.f138969f.a(t)) {
                    Iterator<T> it = arrayList3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (h.f.b.l.a((Object) next.getEffect().getUnzipPath(), (Object) t.getEffect().getUnzipPath())) {
                            if (next != null) {
                            }
                        }
                    }
                    arrayList3.add(t);
                    this.f138979a.f138969f.a(new com.ss.android.ugc.aweme.tools.beauty.c(t), this.f138979a.n);
                }
            }
            return arrayList3;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T, R> implements f.a.d.g<ArrayList<ComposerBeauty>, ArrayList<ComposerBeauty>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f138980a;

        static {
            Covode.recordClassIndex(90886);
        }

        f(h hVar) {
            this.f138980a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ ArrayList<ComposerBeauty> apply(ArrayList<ComposerBeauty> arrayList) {
            ArrayList<ComposerBeauty> arrayList2 = arrayList;
            h.f.b.l.d(arrayList2, "");
            b bVar = this.f138980a.f138969f;
            h.f.b.l.d(arrayList2, "");
            if ((!arrayList2.isEmpty()) && arrayList2 != null) {
                ArrayList arrayList3 = new ArrayList(h.a.n.a((Iterable) arrayList2, 10));
                Iterator<T> it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new com.ss.android.ugc.aweme.tools.beauty.c(it.next()));
                }
                bVar.a().a(arrayList3);
            }
            return arrayList2;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<ComposerBeauty, BeautifyInfo> {
        final /* synthetic */ z.c $beautifyState;
        final /* synthetic */ z.c $beautifyUsed;
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(90895);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(h hVar, z.c cVar, z.c cVar2) {
            super(1);
            this.this$0 = hVar;
            this.$beautifyUsed = cVar;
            this.$beautifyState = cVar2;
        }

        /* renamed from: a */
        public final BeautifyInfo invoke(ComposerBeauty composerBeauty) {
            h.f.b.l.d(composerBeauty, "");
            ArrayList arrayList = new ArrayList();
            if (this.this$0.j(composerBeauty)) {
                List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
                if (items != null) {
                    for (T t : items) {
                        arrayList.add(new BeautifyTag(t.getTag(), (float) this.this$0.d(composerBeauty).f39387a.intValue()));
                        if (this.this$0.a(composerBeauty, t.getTag(), (float) t.getValue()) != ((float) t.getValue())) {
                            this.$beautifyUsed.element = 1;
                        }
                    }
                }
                this.$beautifyState.element = 1;
            }
            return new BeautifyInfo(composerBeauty.getEffect().getEffectId(), arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
        final /* synthetic */ ArrayList $result;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(90897);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(h hVar, ArrayList arrayList, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = hVar;
            this.$result = arrayList;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            q qVar = new q(this.this$0, this.$result, dVar);
            qVar.L$0 = obj;
            return qVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
            return ((q) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                h.r.a(obj);
                av avVar = kotlinx.coroutines.i.b((am) this.L$0, bf.f159041b, null, new a(this, null), 2);
                this.label = 1;
                obj = avVar.a(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                h.r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.f138967d.clear();
            this.this$0.f138967d.addAll((n) obj);
            com.ss.android.ugc.aweme.dependence.beauty.b.b.a(this.this$0.f138966c, this.this$0.m());
            return h.z.f158842a;
        }

        /* access modifiers changed from: package-private */
        public static final class a extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super n<BeautyComposerInfo>>, Object> {
            int label;
            final /* synthetic */ q this$0;

            static {
                Covode.recordClassIndex(90898);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(q qVar, h.c.d dVar) {
                super(2, dVar);
                this.this$0 = qVar;
            }

            @Override // h.c.b.a.a
            public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                h.f.b.l.d(dVar, "");
                return new a(this.this$0, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final Object invoke(am amVar, h.c.d<? super n<BeautyComposerInfo>> dVar) {
                return ((a) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                boolean z;
                T t;
                T t2;
                Object obj2;
                if (this.label == 0) {
                    h.r.a(obj);
                    h hVar = this.this$0.this$0;
                    ArrayList<BeautyCategory> arrayList = this.this$0.$result;
                    for (BeautyCategory beautyCategory : arrayList) {
                        beautyCategory.setSelected(false);
                    }
                    for (BeautyCategory beautyCategory2 : arrayList) {
                        for (T t3 : beautyCategory2.getBeautyList()) {
                            if (t3.isCollectionType()) {
                                List<ComposerBeauty> childList = t3.getChildList();
                                if (childList != null) {
                                    Iterator<T> it = childList.iterator();
                                    while (it.hasNext()) {
                                        b.a(it.next());
                                    }
                                }
                                b.a(t3);
                            } else {
                                b.a(t3);
                            }
                        }
                    }
                    String a2 = hVar.o.a(hVar.f138974k);
                    if (a2 != null) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it2.next();
                            if (h.f.b.l.a((Object) ((BeautyCategory) obj2).getCategoryResponse().getId(), (Object) a2)) {
                                break;
                            }
                        }
                        BeautyCategory beautyCategory3 = (BeautyCategory) obj2;
                        if (beautyCategory3 != null) {
                            beautyCategory3.setSelected(true);
                        } else {
                            u.a(arrayList);
                        }
                    } else {
                        u.a(arrayList);
                    }
                    for (BeautyCategory beautyCategory4 : arrayList) {
                        if (beautyCategory4.getBeautyCategoryExtra().getExclusive()) {
                            String b2 = hVar.o.b(hVar.f138974k, beautyCategory4.getCategoryResponse().getId());
                            if (b2 == null || b2.length() == 0) {
                                t.a(beautyCategory4.getBeautyList());
                            } else {
                                Iterator<T> it3 = beautyCategory4.getBeautyList().iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        t2 = null;
                                        break;
                                    }
                                    t2 = it3.next();
                                    if (h.f.b.l.a((Object) t2.getEffect().getEffectId(), (Object) b2)) {
                                        break;
                                    }
                                }
                                T t4 = t2;
                                if (t4 != null) {
                                    t4.setSelected(true);
                                } else {
                                    t.a(beautyCategory4.getBeautyList());
                                }
                            }
                        } else {
                            Iterator<T> it4 = beautyCategory4.getBeautyList().iterator();
                            while (it4.hasNext()) {
                                hVar.c((ComposerBeauty) it4.next());
                            }
                        }
                    }
                    for (BeautyCategory beautyCategory5 : arrayList) {
                        for (T t5 : beautyCategory5.getBeautyList()) {
                            if (t5.isCollectionType()) {
                                s sVar = new s(hVar);
                                List<ComposerBeauty> childList2 = t5.getChildList();
                                if (!(childList2 == null || childList2.isEmpty() || childList2 == null)) {
                                    String h2 = hVar.h(t5);
                                    if (h2 == null || h2.length() == 0) {
                                        sVar.a(childList2);
                                    } else {
                                        Iterator<T> it5 = childList2.iterator();
                                        while (true) {
                                            if (!it5.hasNext()) {
                                                t = null;
                                                break;
                                            }
                                            t = it5.next();
                                            if (h.f.b.l.a((Object) t.getEffect().getResourceId(), (Object) h2)) {
                                                break;
                                            }
                                        }
                                        T t6 = t;
                                        if (t6 != null) {
                                            t6.setSelected(true);
                                            hVar.c((ComposerBeauty) t6);
                                        } else {
                                            sVar.a(childList2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    h hVar2 = this.this$0.this$0;
                    for (BeautyCategory beautyCategory6 : this.this$0.$result) {
                        for (T t7 : beautyCategory6.getBeautyList()) {
                            Effect effect = t7.getEffect();
                            l lVar = hVar2.f138972i;
                            String resourceId = effect.getResourceId();
                            List<String> tags = effect.getTags();
                            if (tags == null) {
                                tags = new ArrayList<>();
                            }
                            String tagsUpdatedAt = effect.getTagsUpdatedAt();
                            h.f.b.l.d(resourceId, "");
                            h.f.b.l.d(tags, "");
                            if (tags.contains("new") && tagsUpdatedAt != null) {
                                h.f.b.l.d(resourceId, "");
                                h.f.b.l.d("0", "");
                                String string = a.f138936a.getString(resourceId, "0");
                                h.f.b.l.b(string, "");
                                if (tagsUpdatedAt.compareTo(string) > 0) {
                                    z = true;
                                    lVar.f139002a.add(resourceId);
                                    t7.setShowRedDot(z);
                                }
                            }
                            z = false;
                            t7.setShowRedDot(z);
                        }
                    }
                    this.this$0.this$0.c(this.this$0.$result);
                    com.ss.android.ugc.aweme.dependence.beauty.b.b.a(this.this$0.this$0.f138965b, true);
                    ArrayList arrayList2 = new ArrayList();
                    this.this$0.this$0.a(this.this$0.$result, arrayList2);
                    n<BeautyComposerInfo> nVar = new n<>();
                    this.this$0.this$0.a((List<ComposerBeauty>) arrayList2, nVar);
                    return nVar;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify a(com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra r5) {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.beauty.g.h.a(com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra):com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify");
    }

    public final void c(List<BeautyCategory> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            for (T t2 : it.next().getBeautyList()) {
                if (t2.isCollectionType()) {
                    List<ComposerBeauty> childList = t2.getChildList();
                    if (!(childList == null || childList.isEmpty() || childList == null)) {
                        for (T t3 : childList) {
                            t3.setDownloadState(this.f138969f.b(t3));
                        }
                    }
                } else {
                    t2.setDownloadState(this.f138969f.b(t2));
                }
            }
        }
    }

    public final com.bytedance.jedi.arch.am<Integer, Integer, Boolean> d(ComposerBeauty composerBeauty) {
        int i2;
        boolean z2;
        List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
        int i3 = 0;
        if (items == null || items.isEmpty() || items == null) {
            i2 = 0;
            z2 = false;
        } else {
            h.a b2 = com.ss.android.ugc.aweme.tools.beauty.h.b(new h.a(items.get(0).getDoubleDirection(), 100, 0, items.get(0).getMax(), items.get(0).getMin(), a(composerBeauty, items.get(0).getTag(), (float) items.get(0).getValue()), 0, 396));
            composerBeauty.setDefaultProgress(b2.f139011h);
            i3 = b2.f139011h;
            i2 = b2.f139006c;
            z2 = b2.f139012i;
        }
        return new com.bytedance.jedi.arch.am<>(Integer.valueOf(i3), Integer.valueOf(i2), Boolean.valueOf(z2));
    }

    public final boolean n(ComposerBeauty composerBeauty) {
        b bVar = this.f138969f;
        h.f.b.l.d(composerBeauty, "");
        if (com.ss.android.ugc.aweme.tools.beauty.d.a(composerBeauty.getEffect().getEffectId()) < 0 || composerBeauty.isLocalItem()) {
            return true;
        }
        boolean c2 = bVar.f138942a.c(composerBeauty.getEffect());
        if (c2) {
            return c2;
        }
        com.ss.android.ugc.aweme.dependence.beauty.a.a("isDownloaded: " + c2 + ",effect= " + composerBeauty.getEffect());
        return c2;
    }

    private final BeautyCategoryExtra a(EffectCategoryResponse effectCategoryResponse) {
        boolean z2;
        String extra = effectCategoryResponse.getExtra();
        if (extra == null || extra.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            com.ss.android.ugc.aweme.dependence.beauty.a.c("LJT parseBeautyCategoryExtra: " + effectCategoryResponse.getExtra());
            return null;
        }
        try {
            BeautyCategoryExtra beautyCategoryExtra = (BeautyCategoryExtra) this.q.a(effectCategoryResponse.getExtra(), BeautyCategoryExtra.class);
            com.ss.android.ugc.aweme.dependence.beauty.a.c("LJT parseBeautyCategoryExtra: ".concat(String.valueOf(beautyCategoryExtra)));
            m.b bVar = this.f138971h;
            BeautyFilterConfig beautyFilterConfig = this.p;
            h.f.b.l.b(beautyCategoryExtra, "");
            if (bVar.a(beautyFilterConfig, beautyCategoryExtra) && this.f138971h.b(this.p, beautyCategoryExtra)) {
                return beautyCategoryExtra;
            }
            com.ss.android.ugc.aweme.dependence.beauty.a.c("LJT parseBeautyCategoryExtra: categoryExtra assign null");
            return null;
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.dependence.beauty.a.a("parseBeautyCategoryExtra , " + Log.getStackTraceString(e2));
            return null;
        }
    }

    public final void b(List<BeautyCategory> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            for (T t2 : it.next().getBeautyList()) {
                if (t2.isCollectionType()) {
                    List<ComposerBeauty> childList = t2.getChildList();
                    if (!(childList == null || childList.isEmpty() || childList == null)) {
                        arrayList.addAll(childList);
                    }
                } else {
                    arrayList.add(t2);
                }
            }
        }
        f.a.h.a(arrayList).b(f.a.h.a.b(f.a.k.a.f158006c)).b(new e(this)).a(f.a.a.b.a.a()).b(new f(this)).a(f.a.h.a.b(f.a.k.a.f158006c)).b(new g(this));
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo> b(com.ss.android.ugc.aweme.beauty.ComposerBeauty r11) {
        /*
        // Method dump skipped, instructions count: 305
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.beauty.g.h.b(com.ss.android.ugc.aweme.beauty.ComposerBeauty):java.util.List");
    }

    private final synchronized void a(com.ss.android.ugc.aweme.tools.beauty.a aVar) {
        MethodCollector.i(11512);
        ArrayList arrayList = new ArrayList();
        com.ss.android.ugc.aweme.dependence.beauty.a.c("LJT initComposerNodes: start");
        com.ss.android.ugc.aweme.dependence.beauty.a.c("LJT initComposerNodes: allData size is " + this.f138975l.size());
        for (T t2 : this.f138975l) {
            com.ss.android.ugc.aweme.dependence.beauty.a.c("LJT initComposerNodes: add " + t2.getCategoryResponse().getName() + " to result");
            com.ss.android.ugc.aweme.dependence.beauty.a.c("LJT initComposerNodes: panelType is " + t2.getBeautyCategoryExtra().getPanelType() + ", genderFlag is: " + aVar.getFlag());
            if (h.f.b.l.a((Object) t2.getBeautyCategoryExtra().getPanelType(), (Object) aVar.getFlag()) || h.f.b.l.a((Object) t2.getBeautyCategoryExtra().getPanelType(), (Object) com.ss.android.ugc.aweme.tools.beauty.a.ALL.getFlag())) {
                arrayList.add(t2);
            }
        }
        com.ss.android.ugc.aweme.dependence.beauty.a.c("LJT initComposerNodes: result size is " + arrayList.size());
        com.ss.android.ugc.aweme.dependence.beauty.a.c("LJT initComposerNodes: allData size is " + this.f138975l.size());
        if (h.f.b.l.a(this.f138964a, arrayList)) {
            MethodCollector.o(11512);
            return;
        }
        h.f.b.l.d(arrayList, "");
        this.f138964a = arrayList;
        com.ss.android.ugc.aweme.dependence.beauty.a.c("LJT initComposerNodes: assign result to panelData");
        com.ss.android.ugc.aweme.dependence.beauty.b.b.a(this.s, true);
        bz unused = kotlinx.coroutines.i.a(this.y, null, null, new q(this, arrayList, null), 3);
        MethodCollector.o(11512);
    }

    private final void a(h.f.a.b<? super ComposerBeauty, h.z> bVar) {
        for (T t2 : this.f138964a) {
            if (t2.getBeautyCategoryExtra().getExclusive()) {
                Iterator<T> it = t2.getBeautyList().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (next.getSelected()) {
                        if (next != null) {
                            bVar.invoke(next);
                        }
                    }
                }
            } else {
                for (T t3 : t2.getBeautyList()) {
                    if (t3.isCollectionType()) {
                        List<ComposerBeauty> childList = t3.getChildList();
                        if (childList != null) {
                            Iterator<T> it2 = childList.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                T next2 = it2.next();
                                if (next2.getSelected()) {
                                    if (next2 != null) {
                                        bVar.invoke(next2);
                                    }
                                }
                            }
                        }
                    } else {
                        bVar.invoke(t3);
                    }
                }
            }
        }
    }

    private final List<ComposerBeauty> a(EffectCategoryResponse effectCategoryResponse, BeautyCategoryExtra beautyCategoryExtra) {
        ArrayList arrayList = new ArrayList();
        for (Effect effect : effectCategoryResponse.getTotalEffects()) {
            ComposerBeauty a2 = a(effect, effectCategoryResponse.getId(), beautyCategoryExtra.getExclusive(), null, null, null, beautyCategoryExtra);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        NoneComposer noneItem = this.p.getNoneItem();
        if (noneItem != null) {
            ComposerBeautyExtra composerBeautyExtra = new ComposerBeautyExtra(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, null, null, false, false, 0, null, null, null, 16777215, null);
            composerBeautyExtra.setNone(true);
            Effect effect2 = new Effect(null, 1, null);
            effect2.setEffectId(noneItem.getEffectId());
            effect2.setResourceId(noneItem.getResourceId());
            effect2.setName(noneItem.getItemName());
            effect2.setUnzipPath("");
            arrayList.add(0, new ComposerBeauty(effect2, composerBeautyExtra, new ComposerBeautyExtraBeautify(null, null, 3, null), null, false, false, null, null, null, null, false, false, false, 0, 0, false, false, true, noneItem.getIconResId(), 0, 0, new BeautyCategoryExtra(null, false, false, false, null, false, false, false, null, null, null, null, null, false, 16383, null), false, 5898232, null));
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final float a(ComposerBeauty composerBeauty, String str, float f2) {
        h.f.b.l.d(composerBeauty, "");
        return this.o.a(composerBeauty, this.f138974k, str, f2);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m
    public final void b(ComposerBeauty composerBeauty, String str, float f2) {
        h.f.b.l.d(composerBeauty, "");
        this.o.b(composerBeauty, this.f138974k, str, f2);
    }

    public h(com.ss.android.ugc.aweme.tools.beauty.service.e eVar, BeautyFilterConfig beautyFilterConfig, com.google.gson.f fVar, h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> aVar) {
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(beautyFilterConfig, "");
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(aVar, "");
        this.o = eVar;
        this.p = beautyFilterConfig;
        this.q = fVar;
        this.u = h.i.a(h.m.SYNCHRONIZED, new C3669h(aVar));
        this.f138968e = new com.ss.android.ugc.aweme.dependence.beauty.b.d<>();
        this.f138969f = new b(v());
        com.ss.android.ugc.aweme.dependence.beauty.b.d<androidx.c.a<String, Integer>> dVar = new com.ss.android.ugc.aweme.dependence.beauty.b.d<>();
        dVar.setValue(new androidx.c.a<>());
        this.f138970g = dVar;
        this.v = new com.ss.android.ugc.aweme.dependence.beauty.b.d<>();
        this.f138971h = new com.ss.android.ugc.aweme.tools.beauty.data.a();
        this.w = h.i.a((h.f.a.a) new a(this));
        this.f138972i = new l();
        this.x = new p();
        this.f138973j = true;
        this.y = com.ss.android.ugc.aweme.tools.beauty.h.a.a();
        this.f138974k = com.ss.android.ugc.aweme.tools.beauty.a.FEMALE;
        this.f138975l = new ArrayList();
        w().a(this.f138974k);
        bz unused = kotlinx.coroutines.i.a(bs.f159054a, com.ss.android.ugc.aweme.dependence.beauty.b.a.f79582a, null, new AnonymousClass1(this, null), 2);
        this.z = true;
        this.f138976m = new com.ss.android.ugc.aweme.dependence.beauty.b.d<>();
        this.n = new d(this);
    }

    private final ComposerBeauty a(Effect effect, String str, boolean z2, String str2, String str3, String str4, BeautyCategoryExtra beautyCategoryExtra) {
        ComposerBeautyExtraBeautify a2;
        h.f.b.l.d(effect, "");
        boolean z3 = true;
        if (1 != effect.getEffectType()) {
            z3 = false;
        }
        if (z3) {
            ArrayList arrayList = new ArrayList();
            List<Effect> childEffects = effect.getChildEffects();
            if (childEffects != null) {
                Iterator<T> it = childEffects.iterator();
                while (it.hasNext()) {
                    ComposerBeauty a3 = a(it.next(), str, z2, effect.getEffectId(), effect.getName(), effect.getResourceId(), beautyCategoryExtra);
                    if (a3 != null) {
                        arrayList.add(a3);
                    }
                }
            }
            ComposerBeauty composerBeauty = new ComposerBeauty(effect, new ComposerBeautyExtra(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, null, null, false, false, 0, null, null, null, 16777215, null), new ComposerBeautyExtraBeautify(null, null, 3, null), str, z2, true, null, null, null, arrayList, false, false, false, 0, 0, false, false, false, 0, 0, 0, beautyCategoryExtra, false, 6290880, null);
            composerBeauty.setDownloadState(this.f138969f.b(composerBeauty));
            return composerBeauty;
        }
        ComposerBeautyExtra a4 = a(effect);
        if (a4 == null || (a2 = a(a4)) == null) {
            return null;
        }
        ComposerBeauty composerBeauty2 = new ComposerBeauty(effect, a4, a2, str, z2, false, str2, str3, str4, null, false, false, false, 0, 0, false, false, false, 0, 0, 0, beautyCategoryExtra, false, 6290944, null);
        composerBeauty2.setDownloadState(this.f138969f.b(composerBeauty2));
        return composerBeauty2;
    }
}
