package com.ss.android.ugc.asve.recorder.effect.composer;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.ax;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    final HashMap<Integer, List<ComposerInfo>> f62296a = new HashMap<>(8);

    /* renamed from: b  reason: collision with root package name */
    final ax f62297b;

    static {
        Covode.recordClassIndex(38280);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.composer.b
    public final c g() {
        return new a(this);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.composer.b
    public final void h() {
        this.f62296a.clear();
        a();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Collection<List<ComposerInfo>> values = this.f62296a.values();
        l.b(values, "");
        for (T<ComposerInfo> t : values) {
            l.b(t, "");
            for (ComposerInfo composerInfo : t) {
                arrayList.add(composerInfo.f62280a);
                arrayList2.add(composerInfo.f62281b);
            }
        }
        ax axVar = this.f62297b;
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        int size = arrayList.size();
        Object[] array2 = arrayList2.toArray(new String[0]);
        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
        axVar.a((String[]) array, size, (String[]) array2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.composer.b
    public final void i(boolean z) {
        this.f62297b.d(z ? 1 : 0);
    }

    public d(ax axVar) {
        l.d(axVar, "");
        this.f62297b = axVar;
    }

    private static String b(String str) {
        List<String> b2 = p.b(str, new String[]{":"});
        if (b2.size() >= 2) {
            return b2.get(0) + ':' + b2.get(1);
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        Iterator<ComposerInfo> it;
        Set<Integer> keySet = this.f62296a.keySet();
        l.b(keySet, "");
        Iterator<T> it2 = keySet.iterator();
        while (it2.hasNext()) {
            List<ComposerInfo> list = this.f62296a.get(it2.next());
            if (!(list == null || (it = list.iterator()) == null)) {
                while (it.hasNext()) {
                    if (l.a((Object) b(str), (Object) b(it.next().f62280a))) {
                        it.remove();
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.composer.b
    public final void a(List<ComposerInfo> list) {
        l.d(list, "");
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                arrayList.add(t.f62280a);
                a(t.f62280a);
            }
            ax axVar = this.f62297b;
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            axVar.b((String[]) array, arrayList.size());
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.composer.b
    public final void d(List<ComposerInfo> list, int i2) {
        l.d(list, "");
        this.f62296a.clear();
        this.f62296a.put(Integer.valueOf(i2), new ArrayList());
        for (T t : list) {
            List<ComposerInfo> list2 = this.f62296a.get(Integer.valueOf(i2));
            if (list2 != null) {
                list2.add(t);
            }
        }
        a();
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.composer.b
    public final void b(List<ComposerInfo> list, int i2) {
        l.d(list, "");
        List<ComposerInfo> list2 = this.f62296a.get(Integer.valueOf(i2));
        if (list2 != null) {
            list2.clear();
        } else {
            list2 = new ArrayList<>();
            this.f62296a.put(Integer.valueOf(i2), list2);
        }
        list2.addAll(list);
        a();
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.composer.b
    public final void c(List<ComposerInfo> list, int i2) {
        l.d(list, "");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap<Integer, List<ComposerInfo>> hashMap = this.f62296a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, List<ComposerInfo>> entry : hashMap.entrySet()) {
            if (entry.getKey().intValue() == i2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (List<ComposerInfo> list2 : linkedHashMap.values()) {
            for (ComposerInfo composerInfo : list2) {
                arrayList.add(composerInfo.f62280a);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (T t : list) {
            arrayList3.add(t.f62280a);
            arrayList2.add(t.f62281b);
        }
        if (arrayList3.size() != arrayList.size() || !arrayList3.containsAll(arrayList)) {
            List<ComposerInfo> list3 = this.f62296a.get(Integer.valueOf(i2));
            if (list3 != null) {
                list3.clear();
            } else {
                list3 = new ArrayList<>();
                this.f62296a.put(Integer.valueOf(i2), list3);
            }
            list3.addAll(list);
            ax axVar = this.f62297b;
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            int size = arrayList.size();
            Object[] array2 = arrayList3.toArray(new String[0]);
            Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
            int size2 = arrayList3.size();
            Object[] array3 = arrayList2.toArray(new String[0]);
            Objects.requireNonNull(array3, "null cannot be cast to non-null type kotlin.Array<T>");
            axVar.a((String[]) array, size, (String[]) array2, size2, (String[]) array3);
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.composer.b
    public final void a(List<ComposerInfo> list, int i2) {
        l.d(list, "");
        List<ComposerInfo> list2 = this.f62296a.get(Integer.valueOf(i2));
        if (list2 == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            this.f62296a.put(Integer.valueOf(i2), arrayList);
        } else {
            list2.removeAll(list);
            list2.addAll(list);
        }
        ArrayList arrayList2 = new ArrayList(n.a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().f62280a);
        }
        ArrayList arrayList3 = arrayList2;
        ArrayList arrayList4 = new ArrayList(n.a((Iterable) list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next().f62281b);
        }
        ax axVar = this.f62297b;
        Object[] array = arrayList3.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        int size = arrayList3.size();
        Object[] array2 = arrayList4.toArray(new String[0]);
        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
        axVar.b((String[]) array, size, (String[]) array2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.composer.b
    public final void a(List<ComposerInfo> list, List<ComposerInfo> list2, int i2) {
        l.d(list, "");
        l.d(list2, "");
        List<ComposerInfo> list3 = this.f62296a.get(Integer.valueOf(i2));
        if (list3 == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.removeAll(list);
            arrayList.addAll(list2);
            this.f62296a.put(Integer.valueOf(i2), arrayList);
        } else {
            list3.removeAll(list);
            list3.addAll(list2);
        }
        ArrayList arrayList2 = new ArrayList(n.a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(b(it.next().f62280a));
        }
        ArrayList arrayList3 = arrayList2;
        ArrayList arrayList4 = new ArrayList(n.a((Iterable) list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next().f62280a);
        }
        ArrayList arrayList5 = arrayList4;
        ArrayList arrayList6 = new ArrayList(n.a((Iterable) list2, 10));
        Iterator<T> it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList6.add(it3.next().f62281b);
        }
        ax axVar = this.f62297b;
        Object[] array = arrayList3.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        int size = arrayList3.size();
        Object[] array2 = arrayList5.toArray(new String[0]);
        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
        int size2 = arrayList5.size();
        Object[] array3 = arrayList6.toArray(new String[0]);
        Objects.requireNonNull(array3, "null cannot be cast to non-null type kotlin.Array<T>");
        axVar.a((String[]) array, size, (String[]) array2, size2, (String[]) array3);
    }
}
