package com.bytedance.android.live.effect.e;

import com.bytedance.android.live.effect.api.a.j;
import com.bytedance.android.live.effect.model.e;
import com.bytedance.android.livesdkapi.depend.model.a;
import com.bytedance.covode.number.Covode;
import com.google.gson.l;
import com.google.gson.q;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate;
import h.a.n;
import h.a.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class f implements j.a<com.bytedance.android.livesdkapi.depend.model.a> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f9824a = new a((byte) 0);

    static {
        Covode.recordClassIndex(5012);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(5013);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b extends com.google.gson.b.a<List<? extends a.b>> {
        static {
            Covode.recordClassIndex(5014);
        }

        b() {
        }
    }

    private static boolean a(String str) {
        l c2;
        try {
            l a2 = q.a(str);
            if (a2 == null || (c2 = a2.j().c("exclusive")) == null) {
                return false;
            }
            return c2.h();
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.bytedance.android.live.effect.api.a.j.a
    public final List<e<com.bytedance.android.livesdkapi.depend.model.a>> a(EffectChannelResponse effectChannelResponse) {
        List<EffectCategoryResponse> categoryResponseList;
        List list;
        List<Effect> totalEffects;
        ArrayList arrayList = new ArrayList();
        if (!(effectChannelResponse == null || (categoryResponseList = effectChannelResponse.getCategoryResponseList()) == null)) {
            ArrayList<EffectCategoryResponseTemplate> arrayList2 = new ArrayList();
            for (T t : categoryResponseList) {
                T t2 = t;
                h.f.b.l.b(t2, "");
                if (com.bytedance.android.live.effect.f.b.a(t2.getExtra())) {
                    arrayList2.add(t);
                }
            }
            int i2 = 0;
            for (EffectCategoryResponseTemplate effectCategoryResponseTemplate : arrayList2) {
                if (!(effectCategoryResponseTemplate == null || (totalEffects = effectCategoryResponseTemplate.getTotalEffects()) == null)) {
                    ArrayList arrayList3 = new ArrayList(n.a((Iterable) totalEffects, 10));
                    for (T t3 : totalEffects) {
                        h.f.b.l.b(t3, "");
                        arrayList3.add(a(t3, null, null, Integer.valueOf(i2)));
                        i2++;
                    }
                    ArrayList<com.bytedance.android.livesdkapi.depend.model.a> arrayList4 = arrayList3;
                    ArrayList arrayList5 = new ArrayList(n.a((Iterable) arrayList4, 10));
                    for (com.bytedance.android.livesdkapi.depend.model.a aVar : arrayList4) {
                        aVar.B = effectCategoryResponseTemplate.getName();
                        String extra = effectCategoryResponseTemplate.getExtra();
                        h.f.b.l.b(extra, "");
                        aVar.D = a(extra);
                        String name = effectCategoryResponseTemplate.getName();
                        h.f.b.l.b(name, "");
                        a(aVar, name);
                        arrayList5.add(aVar);
                    }
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj : arrayList5) {
                        com.bytedance.android.livesdkapi.depend.model.a aVar2 = (com.bytedance.android.livesdkapi.depend.model.a) obj;
                        if (aVar2.a() != null || !com.bytedance.common.utility.collection.b.a((Collection) aVar2.o) || aVar2.C) {
                            arrayList6.add(obj);
                        }
                    }
                    list = n.k(arrayList6);
                    if (list != null) {
                        h.f.b.l.b(effectCategoryResponseTemplate, "");
                        String name2 = effectCategoryResponseTemplate.getName();
                        h.f.b.l.b(name2, "");
                        arrayList.add(new e(name2, list));
                    }
                }
                list = z.INSTANCE;
                h.f.b.l.b(effectCategoryResponseTemplate, "");
                String name22 = effectCategoryResponseTemplate.getName();
                h.f.b.l.b(name22, "");
                arrayList.add(new e(name22, list));
            }
        }
        return arrayList;
    }

    private static void a(com.bytedance.android.livesdkapi.depend.model.a aVar, String str) {
        List<Effect> childEffects;
        Effect effect = aVar.q;
        if (effect != null && effect.getEffectType() == 1) {
            Effect effect2 = aVar.q;
            List<com.bytedance.android.livesdkapi.depend.model.a> list = null;
            if (!com.bytedance.common.utility.collection.b.a((Collection) (effect2 != null ? effect2.getChildEffects() : null))) {
                Effect effect3 = aVar.q;
                if (!(effect3 == null || (childEffects = effect3.getChildEffects()) == null)) {
                    ArrayList arrayList = new ArrayList();
                    for (T t : childEffects) {
                        T t2 = t;
                        h.f.b.l.b(t2, "");
                        h.f.b.l.d(t2, "");
                        if (com.bytedance.android.live.effect.f.b.a(t2.getExtra()) || com.bytedance.android.live.effect.f.b.a((Effect) t2)) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList<Effect> arrayList2 = arrayList;
                    ArrayList arrayList3 = new ArrayList(n.a((Iterable) arrayList2, 10));
                    for (Effect effect4 : arrayList2) {
                        h.f.b.l.b(effect4, "");
                        arrayList3.add(a(effect4, aVar.f22997c, aVar.f22999e, aVar.z));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj : arrayList3) {
                        com.bytedance.android.livesdkapi.depend.model.a aVar2 = (com.bytedance.android.livesdkapi.depend.model.a) obj;
                        aVar2.D = true;
                        aVar2.B = str;
                        if (aVar2.a() != null || aVar2.C) {
                            arrayList4.add(obj);
                        }
                    }
                    list = n.k(arrayList4);
                }
                aVar.o = list;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007c A[Catch:{ all -> 0x0091 }, LOOP:0: B:17:0x0076->B:19:0x007c, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.android.livesdkapi.depend.model.a a(com.ss.android.ugc.effectmanager.effect.model.Effect r7, java.lang.String r8, java.lang.String r9, java.lang.Integer r10) {
        /*
        // Method dump skipped, instructions count: 149
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.e.f.a(com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.String, java.lang.String, java.lang.Integer):com.bytedance.android.livesdkapi.depend.model.a");
    }
}
