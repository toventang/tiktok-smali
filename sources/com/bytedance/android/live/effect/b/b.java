package com.bytedance.android.live.effect.b;

import android.text.TextUtils;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.api.a.c;
import com.bytedance.android.live.effect.api.a.d;
import com.bytedance.android.live.effect.api.a.h;
import com.bytedance.android.live.effect.api.a.l;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorBeautyAbGroupSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveEnableEffectNewEngineSetting;
import com.bytedance.android.livesdkapi.depend.model.a;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.o;
import com.google.gson.q;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class b implements h {
    private static volatile b o;

    /* renamed from: a  reason: collision with root package name */
    private l f9668a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f9669b;

    /* renamed from: c  reason: collision with root package name */
    private String f9670c;

    /* renamed from: d  reason: collision with root package name */
    private String f9671d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, Map<String, a>> f9672e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private final Map<a, Map<String, Float>> f9673f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private final List<a> f9674g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final List<d> f9675h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private final List<c> f9676i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    private final Map<String, List<String>> f9677j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    private final Map<String, List<String>> f9678k = com.bytedance.android.livesdk.ap.a.ar.a();

    /* renamed from: l  reason: collision with root package name */
    private final Map<String, Map<String, Float>> f9679l = new HashMap();

    /* renamed from: m  reason: collision with root package name */
    private final Map<String, Map<String, Float>> f9680m = com.bytedance.android.livesdk.ap.a.as.a();
    private final Map<String, Integer> n = new HashMap();

    static {
        Covode.recordClassIndex(4926);
    }

    @Override // com.bytedance.android.live.effect.api.a.e
    public final Map<String, Map<String, a>> a() {
        return this.f9672e;
    }

    @Override // com.bytedance.android.live.effect.api.a.e
    public final String d() {
        return this.f9670c;
    }

    @Override // com.bytedance.android.live.effect.api.a.e
    public final String e() {
        return this.f9671d;
    }

    @Override // com.bytedance.android.live.effect.api.a.e
    public final void a(d dVar) {
        if (dVar != null && !this.f9675h.contains(dVar)) {
            this.f9675h.add(dVar);
        }
    }

    @Override // com.bytedance.android.live.effect.api.a.e, com.bytedance.android.live.effect.api.a.h
    public final void a(String str, a aVar) {
        if (!(aVar == null || this.f9668a == null)) {
            if (!this.f9672e.containsKey(str)) {
                this.f9672e.put(str, new HashMap());
            }
            Map<String, a> map = this.f9672e.get(str);
            if (map.containsKey(aVar.f23001g)) {
                map.get(aVar.f23001g).p.addAll(aVar.p);
                return;
            }
            map.put(aVar.f23001g, aVar);
            if (this.f9668a.f9647b.contains(str) && this.f9668a != null) {
                if (!this.f9677j.containsKey(str)) {
                    this.f9677j.put(str, new ArrayList());
                }
                if (!this.f9677j.get(str).contains(aVar.f23001g) && !m.a(aVar.f23001g) && this.f9668a.f9647b.contains(str)) {
                    this.f9677j.get(str).add(aVar.f23001g);
                }
            }
            a(false);
            for (d dVar : this.f9675h) {
                dVar.a(true, str, aVar);
            }
        }
    }

    @Override // com.bytedance.android.live.effect.api.a.e, com.bytedance.android.live.effect.api.a.h
    public final void a(String str) {
        if (this.f9672e.containsKey(str) && this.f9672e.get(str).size() > 0) {
            for (a aVar : this.f9672e.get(str).values()) {
                if (this.f9677j.containsKey(str) && aVar != null && !m.a(aVar.f23001g)) {
                    this.f9677j.get(str).remove(aVar.f23001g);
                }
            }
            this.f9672e.remove(str);
            a(false);
            for (d dVar : this.f9675h) {
                dVar.a(false, str, null);
            }
        }
    }

    @Override // com.bytedance.android.live.effect.api.a.h
    public final void a(EffectChannelResponse effectChannelResponse) {
        Map<String, List<String>> map;
        if (this.f9668a != null) {
            String panel = effectChannelResponse.getPanel();
            if (this.f9668a.f9647b.contains(panel) && (map = this.f9678k) != null && !map.isEmpty() && this.f9678k.containsKey(panel)) {
                List<String> list = this.f9678k.get(panel);
                for (Effect effect : effectChannelResponse.getAllCategoryEffects()) {
                    if (effect != null) {
                        if (effect.getEffectType() != 1 || com.bytedance.common.utility.collection.b.a((Collection) effect.getChildEffects())) {
                            a(effect, panel, list);
                        } else {
                            for (int i2 = 0; i2 < effect.getChildEffects().size(); i2++) {
                                Effect effect2 = effect.getChildEffects().get(i2);
                                if (!(list == null || effect2 == null || !list.contains(effect2.getUnzipPath()))) {
                                    this.n.put(effect.getEffectId(), Integer.valueOf(i2));
                                }
                                a(effect2, panel, list);
                            }
                        }
                    }
                }
                this.f9678k.remove(panel);
            }
        }
    }

    @Override // com.bytedance.android.live.effect.api.a.h
    public final void a(String str, float f2) {
        String str2;
        if (this.f9668a != null) {
            for (a aVar : this.f9674g) {
                if (!com.bytedance.common.utility.h.a(aVar.p) && aVar.p.contains(str)) {
                    if (!this.f9673f.containsKey(aVar) || !this.f9673f.get(aVar).containsKey(str) || !this.f9673f.get(aVar).get(str).equals(Float.valueOf(f2))) {
                        com.bytedance.android.live.core.c.a.a(3, "LiveComposerManager", "updateTagValue path:" + aVar.f23001g + " tag:" + str + " value:" + f2 + " return:" + this.f9668a.f9648c.a(aVar.f23001g, str, f2));
                        a aVar2 = null;
                        Iterator<a> it = this.f9673f.keySet().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                a next = it.next();
                                if (next.f23001g.equals(aVar.f23001g) && next.p.contains(str)) {
                                    aVar2 = next;
                                    Map<String, Float> map = this.f9673f.get(aVar2);
                                    if (map != null) {
                                        map.put(str, Float.valueOf(f2));
                                    }
                                }
                            } else {
                                this.f9673f.put(aVar, new HashMap());
                                Map<String, Float> map2 = this.f9673f.get(aVar);
                                if (map2 != null) {
                                    map2.put(str, Float.valueOf(f2));
                                }
                            }
                        }
                        Iterator<String> it2 = this.f9672e.keySet().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                str2 = "";
                                break;
                            }
                            str2 = it2.next();
                            if (this.f9672e.get(str2).containsValue(aVar2 != null ? aVar2 : aVar)) {
                                break;
                            }
                        }
                        a(str2, aVar, str, f2);
                        if (!this.f9676i.isEmpty()) {
                            Iterator<c> it3 = this.f9676i.iterator();
                            while (it3.hasNext()) {
                                it3.next();
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    public static b f() {
        MethodCollector.i(821);
        if (o == null) {
            synchronized (b.class) {
                try {
                    if (o == null) {
                        o = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(821);
                    throw th;
                }
            }
        }
        b bVar = o;
        MethodCollector.o(821);
        return bVar;
    }

    private b() {
    }

    @Override // com.bytedance.android.live.effect.api.a.e
    public final void b() {
        if (!this.f9678k.isEmpty()) {
            this.f9677j.putAll(this.f9678k);
        }
        this.f9669b = true;
        com.bytedance.android.livesdk.ap.c.a(com.bytedance.android.livesdk.ap.a.ar, this.f9677j);
        com.bytedance.android.livesdk.ap.c.a(com.bytedance.android.livesdk.ap.a.as, this.f9679l);
        l lVar = this.f9668a;
        if (!(lVar == null || lVar.f9648c == null)) {
            try {
                this.f9668a.f9648c.a(new String[0]);
                this.f9668a.f9648c.a();
            } catch (Throwable th) {
                com.bytedance.android.live.core.c.a.a("LiveComposerManager", th);
            }
        }
        this.f9678k.clear();
        this.f9678k.putAll(this.f9677j);
        this.f9680m.clear();
        this.f9680m.putAll(this.f9679l);
        this.f9672e.clear();
        this.f9675h.clear();
        this.f9676i.clear();
        this.f9677j.clear();
        this.f9674g.clear();
        this.f9673f.clear();
        this.f9679l.clear();
        this.f9668a = null;
    }

    @Override // com.bytedance.android.live.effect.api.a.e
    public final void c() {
        a(true);
        for (Map map : new HashMap(this.f9673f).values()) {
            if (!(map == null || map.size() == 0)) {
                for (String str : map.keySet()) {
                    if (map.get(str) != null) {
                        float floatValue = ((Float) map.get(str)).floatValue();
                        for (a aVar : this.f9674g) {
                            if (!com.bytedance.common.utility.h.a(aVar.p) && aVar.p.contains(str)) {
                                a(aVar, str, floatValue);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.effect.api.a.e
    public final void c(String str) {
        this.f9670c = str;
    }

    @Override // com.bytedance.android.live.effect.api.a.e, com.bytedance.android.live.effect.api.a.h
    public final void a(l lVar) {
        this.f9668a = lVar;
        this.f9669b = true;
    }

    @Override // com.bytedance.android.live.effect.api.a.e
    public final void d(String str) {
        this.f9671d = str;
    }

    @Override // com.bytedance.android.live.effect.api.a.e
    public final void b(c cVar) {
        if (cVar != null) {
            this.f9676i.remove(cVar);
        }
    }

    @Override // com.bytedance.android.live.effect.api.a.e, com.bytedance.android.live.effect.api.a.h
    public final List<a> b(String str) {
        if (this.f9672e.containsKey(str)) {
            return new ArrayList(this.f9672e.get(str).values());
        }
        return new ArrayList();
    }

    @Override // com.bytedance.android.live.effect.api.a.e
    public final void a(c cVar) {
        if (cVar != null && !this.f9676i.contains(cVar)) {
            this.f9676i.add(cVar);
        }
    }

    @Override // com.bytedance.android.live.effect.api.a.e
    public final void b(d dVar) {
        if (dVar != null) {
            this.f9675h.remove(dVar);
        }
    }

    @Override // com.bytedance.android.live.effect.api.a.h
    public final Float e(String str) {
        for (Map<String, Float> map : this.f9673f.values()) {
            if (map != null && map.containsKey(str)) {
                return map.get(str);
            }
        }
        return null;
    }

    private void a(boolean z) {
        if (this.f9668a != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            boolean z2 = false;
            for (com.bytedance.android.live.effect.api.a.a aVar : this.f9668a.f9646a) {
                if (a(arrayList2, aVar) || (this.f9672e.containsKey(aVar.f9643b) && a(arrayList2, aVar.f9642a))) {
                    if (arrayList2.isEmpty()) {
                        arrayList2.addAll(aVar.f9642a);
                    } else {
                        arrayList2.retainAll(aVar.f9642a);
                    }
                    if (this.f9668a.f9649d.contains(aVar.f9643b)) {
                        z2 = true;
                    }
                    arrayList.addAll(this.f9672e.get(aVar.f9643b).values());
                }
            }
            if (z || !this.f9674g.containsAll(arrayList) || !arrayList.containsAll(this.f9674g)) {
                this.f9674g.clear();
                this.f9674g.addAll(arrayList);
                if (this.f9669b) {
                    com.bytedance.android.live.core.c.a.a(3, "LiveComposerManager", "show sticker: " + ((IBroadcastService) com.bytedance.android.live.t.a.a(IBroadcastService.class)).getLiveComposerFilePath() + " return: " + this.f9668a.f9648c.a(((IBroadcastService) com.bytedance.android.live.t.a.a(IBroadcastService.class)).getLiveComposerFilePath(), z2));
                    this.f9669b = false;
                }
                this.f9668a.f9648c.a(z2);
                String[] a2 = com.bytedance.android.live.effect.f.a.a(arrayList, this.f9673f);
                if (LiveEnableEffectNewEngineSetting.INSTANCE.getValue()) {
                    String[] a3 = com.bytedance.android.live.effect.f.a.a(arrayList, a2);
                    com.bytedance.android.live.core.c.a.a(3, "LiveComposerManager", "show sticker composer: " + Arrays.toString(a2) + " extra:" + Arrays.toString(a3) + " return: " + this.f9668a.f9648c.a(a2, a3));
                    return;
                }
                com.bytedance.android.live.core.c.a.a(3, "LiveComposerManager", "show sticker composer: " + Arrays.toString(a2) + " return: " + this.f9668a.f9648c.a(a2));
            }
        }
    }

    private static boolean a(List<Integer> list, List<Integer> list2) {
        if (list.isEmpty()) {
            return true;
        }
        for (Integer num : list) {
            if (list2.contains(num)) {
                return true;
            }
        }
        return false;
    }

    private boolean a(List<Integer> list, com.bytedance.android.live.effect.api.a.a aVar) {
        if (!TextUtils.equals(aVar.f9643b, com.bytedance.android.live.effect.api.a.f9637b) || !this.f9672e.containsKey(aVar.f9643b) || this.f9672e.get(aVar.f9643b).entrySet().size() <= 0) {
            return false;
        }
        a value = this.f9672e.get(aVar.f9643b).entrySet().iterator().next().getValue();
        ArrayList arrayList = new ArrayList();
        if (value.r.isEmpty()) {
            arrayList.addAll(aVar.f9642a);
        } else {
            arrayList.addAll(value.r);
        }
        return a(list, arrayList);
    }

    private void a(a aVar, String str, float f2) {
        String str2;
        a aVar2;
        if (this.f9668a != null && !com.bytedance.common.utility.h.a(aVar.p) && aVar.p.contains(str)) {
            com.bytedance.android.live.core.c.a.a(3, "LiveComposerManager", "updateTagValue path:" + aVar.f23001g + " tag:" + str + " value:" + f2 + " return:" + this.f9668a.f9648c.a(aVar.f23001g, str, f2));
            a aVar3 = null;
            Iterator<a> it = this.f9673f.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    a next = it.next();
                    if (next.f23001g.equals(aVar.f23001g) && next.p.contains(str)) {
                        aVar3 = next;
                        Map<String, Float> map = this.f9673f.get(aVar3);
                        if (map != null) {
                            map.put(str, Float.valueOf(f2));
                        }
                    }
                } else {
                    this.f9673f.put(aVar, new HashMap());
                    Map<String, Float> map2 = this.f9673f.get(aVar);
                    if (map2 != null) {
                        map2.put(str, Float.valueOf(f2));
                    }
                }
            }
            Iterator<String> it2 = this.f9672e.keySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    str2 = "";
                    break;
                }
                str2 = it2.next();
                Map<String, a> map3 = this.f9672e.get(str2);
                if (aVar3 != null) {
                    aVar2 = aVar3;
                } else {
                    aVar2 = aVar;
                }
                if (map3.containsValue(aVar2)) {
                    break;
                }
            }
            a(str2, aVar, str, f2);
            if (!this.f9676i.isEmpty()) {
                Iterator<c> it3 = this.f9676i.iterator();
                while (it3.hasNext()) {
                    it3.next();
                }
            }
        }
    }

    private void a(Effect effect, String str, List<String> list) {
        Float f2;
        if (effect != null && list.contains(effect.getUnzipPath())) {
            try {
                o j2 = q.a(effect.getExtra()).j();
                if (j2.b("ab_group") && LiveAnchorBeautyAbGroupSetting.INSTANCE.getValue() != j2.c("ab_group").g()) {
                    return;
                }
            } catch (Exception e2) {
                com.bytedance.android.live.core.c.a.a("LiveComposerManager", e2);
            }
            if (this.f9680m.containsKey(effect.getUnzipPath())) {
                a a2 = com.bytedance.android.live.effect.f.d.a(effect);
                Map<String, Float> map = this.f9680m.get(effect.getUnzipPath());
                a2.p.addAll(map.keySet());
                a(str, a2);
                for (String str2 : map.keySet()) {
                    if (!this.f9679l.containsKey(effect.getUnzipPath()) || !this.f9679l.get(effect.getUnzipPath()).containsKey(str2)) {
                        String str3 = str2;
                        if (effect.getExtra().contains(str3)) {
                            a2.p.add(str3);
                            Float f3 = map.get(str2);
                            if (f3 instanceof Double) {
                                f2 = Float.valueOf(((Double) f3).floatValue());
                            } else {
                                f2 = f3;
                            }
                            a(str3, f2.floatValue());
                        }
                    }
                }
                return;
            }
            a(str, com.bytedance.android.live.effect.f.d.a(effect));
        }
    }

    private void a(String str, a aVar, String str2, float f2) {
        if (this.f9677j.containsKey(str) && this.f9677j.get(str).contains(aVar.f23001g)) {
            if (!this.f9679l.containsKey(aVar.f23001g)) {
                this.f9679l.put(aVar.f23001g, new HashMap());
            }
            this.f9679l.get(aVar.f23001g).put(str2, Float.valueOf(f2));
        }
    }
}
