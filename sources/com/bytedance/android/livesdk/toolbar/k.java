package com.bytedance.android.livesdk.toolbar;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.live.p.f;
import com.bytedance.android.live.p.g;
import com.bytedance.android.live.p.l;
import com.bytedance.android.live.p.o;
import com.bytedance.android.live.p.q;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.a.n;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class k implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final k f21737a = new k();

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap<DataChannel, ConcurrentHashMap<l, f>> f21738b = new HashMap<>(8);

    /* renamed from: c  reason: collision with root package name */
    private static final HashMap<DataChannel, Map<o, j>> f21739c = new HashMap<>(3);

    private k() {
    }

    @Override // com.bytedance.android.live.p.g
    public final void a(DataChannel dataChannel) {
        Collection<j> values;
        if (dataChannel != null) {
            Map<o, j> map = f21739c.get(dataChannel);
            if (!(map == null || (values = map.values()) == null)) {
                Iterator<T> it = values.iterator();
                while (it.hasNext()) {
                    it.next().b();
                }
            }
            f21739c.remove(dataChannel);
            f21738b.remove(dataChannel);
        }
    }

    @Override // com.bytedance.android.live.p.g
    public final void a(DataChannel dataChannel, LinearLayout linearLayout, List<? extends l> list, q qVar, o oVar) {
        h.f.b.l.d(linearLayout, "");
        h.f.b.l.d(list, "");
        h.f.b.l.d(qVar, "");
        h.f.b.l.d(oVar, "");
        j jVar = new j(dataChannel, linearLayout, list, qVar, f21738b.get(dataChannel));
        HashMap<DataChannel, Map<o, j>> hashMap = f21739c;
        if (hashMap.get(dataChannel) == null) {
            if (dataChannel == null) {
                h.f.b.l.b();
            }
            hashMap.put(dataChannel, new HashMap(3));
        }
        Map<o, j> map = hashMap.get(dataChannel);
        if (map != null) {
            map.put(oVar, jVar);
        }
        jVar.a();
    }

    @Override // com.bytedance.android.live.p.g
    public final void a(DataChannel dataChannel, List<l> list, q qVar, o oVar) {
        Map<o, j> map;
        j jVar;
        h.f.b.l.d(list, "");
        h.f.b.l.d(qVar, "");
        h.f.b.l.d(oVar, "");
        if (!(dataChannel == null || (map = f21739c.get(dataChannel)) == null || (jVar = map.get(oVar)) == null || jVar.f21732g == null)) {
            for (Map.Entry<l, f> entry : jVar.f21732g.entrySet()) {
                l key = entry.getKey();
                entry.getValue();
                jVar.f21727b.contains(key);
            }
        }
    }

    static {
        Covode.recordClassIndex(12811);
    }

    @Override // com.bytedance.android.live.p.g
    public final void a() {
        Collection<Map<o, j>> values = f21739c.values();
        h.f.b.l.b(values, "");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            for (j jVar : it.next().values()) {
                jVar.b();
            }
        }
        f21738b.clear();
        f21739c.clear();
    }

    @Override // com.bytedance.android.live.p.g
    public final View a(l lVar) {
        h.f.b.l.d(lVar, "");
        Collection<Map<o, j>> values = f21739c.values();
        h.f.b.l.b(values, "");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            Iterator it2 = it.next().values().iterator();
            while (true) {
                if (it2.hasNext()) {
                    h.f.b.l.d(lVar, "");
                    View view = ((j) it2.next()).f21726a.get(lVar);
                    if (view != null) {
                        return view;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.android.live.p.g
    public final void a(l lVar, int i2) {
        ImageView imageView;
        h.f.b.l.d(lVar, "");
        h.f.b.l.d(lVar, "");
        View a2 = a(lVar);
        if (a2 != null && (imageView = (ImageView) a2.findViewById(R.id.enf)) != null) {
            imageView.setBackgroundResource(i2);
        }
    }

    @Override // com.bytedance.android.live.p.g
    public final void b(l lVar, DataChannel dataChannel) {
        Map<o, j> map;
        Collection<j> values;
        h.f.b.l.d(lVar, "");
        if (dataChannel != null && (map = f21739c.get(dataChannel)) != null && (values = map.values()) != null) {
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                h.f.b.l.d(lVar, "");
                Iterator<Map.Entry<l, View>> it2 = it.next().f21726a.entrySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Map.Entry<l, View> next = it2.next();
                        l key = next.getKey();
                        View value = next.getValue();
                        if (lVar == key) {
                            value.setVisibility(0);
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.p.g
    public final void c(l lVar, DataChannel dataChannel) {
        Map<o, j> map;
        Collection<j> values;
        h.f.b.l.d(lVar, "");
        if (dataChannel != null && (map = f21739c.get(dataChannel)) != null && (values = map.values()) != null) {
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                h.f.b.l.d(lVar, "");
                Iterator<Map.Entry<l, View>> it2 = it.next().f21726a.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Map.Entry<l, View> next = it2.next();
                    l key = next.getKey();
                    View value = next.getValue();
                    if (lVar == key) {
                        value.setVisibility(8);
                        break;
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.p.g
    public final boolean d(l lVar, DataChannel dataChannel) {
        Map<o, j> map;
        Collection<j> values;
        View findViewById;
        h.f.b.l.d(lVar, "");
        if (dataChannel != null) {
            HashMap<DataChannel, Map<o, j>> hashMap = f21739c;
            if (!(hashMap.get(dataChannel) == null || (map = hashMap.get(dataChannel)) == null || (values = map.values()) == null)) {
                Iterator<T> it = values.iterator();
                while (it.hasNext()) {
                    h.f.b.l.d(lVar, "");
                    View view = it.next().f21726a.get(lVar);
                    if (view != null && (findViewById = view.findViewById(R.id.enq)) != null && findViewById.getVisibility() == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.android.live.p.g
    public final void e(l lVar, DataChannel dataChannel) {
        Map<o, j> map;
        Collection<j> values;
        f fVar;
        h.f.b.l.d(lVar, "");
        if (dataChannel != null) {
            HashMap<DataChannel, Map<o, j>> hashMap = f21739c;
            if (!(hashMap.get(dataChannel) == null || (map = hashMap.get(dataChannel)) == null || (values = map.values()) == null)) {
                for (T t : values) {
                    h.f.b.l.d(lVar, "");
                    ConcurrentHashMap<l, f> concurrentHashMap = t.f21732g;
                    if (!(concurrentHashMap == null || (fVar = concurrentHashMap.get(lVar)) == null)) {
                        fVar.a();
                    }
                    t.f21728c.put(lVar, true);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.p.g
    public final void f(l lVar, DataChannel dataChannel) {
        Map<o, j> map;
        Collection<j> values;
        f fVar;
        h.f.b.l.d(lVar, "");
        if (dataChannel != null) {
            HashMap<DataChannel, Map<o, j>> hashMap = f21739c;
            if (!(hashMap.get(dataChannel) == null || (map = hashMap.get(dataChannel)) == null || (values = map.values()) == null)) {
                for (T t : values) {
                    h.f.b.l.d(lVar, "");
                    ConcurrentHashMap<l, f> concurrentHashMap = t.f21732g;
                    if (!(concurrentHashMap == null || (fVar = concurrentHashMap.get(lVar)) == null)) {
                        fVar.b();
                    }
                    t.f21728c.put(lVar, false);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.p.g
    public final void a(l lVar, DataChannel dataChannel) {
        Map<o, j> map;
        Collection<j> values;
        ConcurrentHashMap<l, f> concurrentHashMap;
        h.f.b.l.d(lVar, "");
        if (dataChannel != null && (map = f21739c.get(dataChannel)) != null && (values = map.values()) != null) {
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                it.next().a(lVar);
                HashMap<DataChannel, ConcurrentHashMap<l, f>> hashMap = f21738b;
                if (!(hashMap == null || (concurrentHashMap = hashMap.get(dataChannel)) == null)) {
                    concurrentHashMap.remove(lVar);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.p.g
    public final void a(o oVar, DataChannel dataChannel) {
        j jVar;
        h.f.b.l.d(oVar, "");
        if (dataChannel != null) {
            HashMap<DataChannel, Map<o, j>> hashMap = f21739c;
            Map<o, j> map = hashMap.get(dataChannel);
            if (!(map == null || (jVar = map.get(oVar)) == null)) {
                jVar.b();
            }
            Map<o, j> map2 = hashMap.get(dataChannel);
            if (map2 != null) {
                map2.remove(oVar);
            }
        }
    }

    @Override // com.bytedance.android.live.p.g
    public final void b(l lVar, DataChannel dataChannel, boolean z) {
        Collection<j> values;
        h.f.b.l.d(lVar, "");
        if (dataChannel != null) {
            HashMap<DataChannel, Map<o, j>> hashMap = f21739c;
            if (hashMap.get(dataChannel) != null) {
                Map<o, j> map = hashMap.get(dataChannel);
                if (!(map == null || (values = map.values()) == null)) {
                    Iterator<T> it = values.iterator();
                    while (it.hasNext()) {
                        h.f.b.l.d(lVar, "");
                        for (Map.Entry<l, View> entry : it.next().f21726a.entrySet()) {
                            l key = entry.getKey();
                            View value = entry.getValue();
                            if (lVar == key) {
                                value.setClickable(z);
                            }
                        }
                    }
                    return;
                }
                return;
            }
        }
        lVar.isEnableClick = z;
    }

    @Override // com.bytedance.android.live.p.g
    public final void a(l lVar, DataChannel dataChannel, f fVar) {
        Collection<j> values;
        h.f.b.l.d(lVar, "");
        h.f.b.l.d(fVar, "");
        if (dataChannel != null) {
            Map<o, j> map = f21739c.get(dataChannel);
            if (!(map == null || (values = map.values()) == null)) {
                Iterator<T> it = values.iterator();
                while (it.hasNext()) {
                    it.next().a(lVar, fVar);
                }
            }
            HashMap<DataChannel, ConcurrentHashMap<l, f>> hashMap = f21738b;
            if (hashMap.get(dataChannel) == null) {
                hashMap.put(dataChannel, new ConcurrentHashMap<>(8));
            }
            ConcurrentHashMap<l, f> concurrentHashMap = hashMap.get(dataChannel);
            if (concurrentHashMap != null) {
                concurrentHashMap.put(lVar, fVar);
            }
        }
    }

    @Override // com.bytedance.android.live.p.g
    public final void a(l lVar, DataChannel dataChannel, boolean z) {
        Collection<j> values;
        h.f.b.l.d(lVar, "");
        if (dataChannel != null) {
            HashMap<DataChannel, Map<o, j>> hashMap = f21739c;
            if (hashMap.get(dataChannel) != null) {
                Map<o, j> map = hashMap.get(dataChannel);
                if (map != null && (values = map.values()) != null) {
                    Iterator<T> it = values.iterator();
                    while (it.hasNext()) {
                        it.next().a(lVar, z);
                    }
                    return;
                }
                return;
            }
        }
        lVar.isRedDotVisible = z;
    }

    @Override // com.bytedance.android.live.p.g
    public final void b(DataChannel dataChannel, LinearLayout linearLayout, List<l> list, q qVar, o oVar) {
        Map<o, j> map;
        Collection<j> values;
        h.f.b.l.d(linearLayout, "");
        h.f.b.l.d(list, "");
        h.f.b.l.d(qVar, "");
        h.f.b.l.d(oVar, "");
        if (!(dataChannel == null || (map = f21739c.get(dataChannel)) == null || (values = map.values()) == null)) {
            for (T t : values) {
                h.f.b.l.d(list, "");
                for (l lVar : n.e(t.f21730e, list)) {
                    t.a(lVar);
                }
                t.f21730e = list;
                if (t.f21732g != null) {
                    for (Map.Entry<l, f> entry : t.f21732g.entrySet()) {
                        t.a(entry.getKey(), entry.getValue(), false);
                    }
                }
            }
        }
    }
}
