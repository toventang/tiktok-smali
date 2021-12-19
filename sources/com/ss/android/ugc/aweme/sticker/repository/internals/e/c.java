package com.ss.android.ugc.aweme.sticker.repository.internals.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.repository.a.o;
import com.ss.android.ugc.aweme.sticker.repository.a.v;
import com.ss.android.ugc.aweme.sticker.repository.a.y;
import com.ss.android.ugc.aweme.sticker.repository.internals.b;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import f.a.t;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class c implements v {

    /* renamed from: a  reason: collision with root package name */
    public b f135584a;

    /* renamed from: b  reason: collision with root package name */
    private final f.a.l.c<com.ss.android.ugc.aweme.sticker.repository.c.b> f135585b;

    static {
        Covode.recordClassIndex(88615);
    }

    public c() {
        f.a.l.c<com.ss.android.ugc.aweme.sticker.repository.c.b> cVar = new f.a.l.c<>();
        l.b(cVar, "");
        this.f135585b = cVar;
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.v
    public final t<com.ss.android.ugc.aweme.sticker.repository.c.b> a() {
        t<com.ss.android.ugc.aweme.sticker.repository.c.b> c2 = this.f135585b.c();
        l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.v
    public final void a(b bVar) {
        l.d(bVar, "");
        this.f135584a = bVar;
    }

    public static final class a implements IFetchEffectListByIdsListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f135586a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f135587b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f135588c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f135589d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.repository.c.b f135590e;

        static {
            Covode.recordClassIndex(88616);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
        public final void onFail(ExceptionResult exceptionResult) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectListResponse effectListResponse) {
            b bVar;
            y j2;
            b bVar2;
            y j3;
            EffectListResponse effectListResponse2 = effectListResponse;
            if (effectListResponse2 != null) {
                List<Effect> collection = effectListResponse2.getCollection();
                if (!(collection == null || collection.isEmpty() || (bVar2 = this.f135589d.f135584a) == null || (j3 = bVar2.j()) == null)) {
                    j3.a(collection);
                }
                List<Effect> bindEffects = effectListResponse2.getBindEffects();
                if (!(bindEffects == null || bindEffects.isEmpty() || (bVar = this.f135589d.f135584a) == null || (j2 = bVar.j()) == null)) {
                    j2.b(bindEffects);
                }
                List<Effect> data = effectListResponse2.getData();
                if (data != null && !data.isEmpty()) {
                    this.f135588c.set(this.f135586a, data.get(0));
                }
            }
        }

        a(int i2, b bVar, List list, c cVar, com.ss.android.ugc.aweme.sticker.repository.c.b bVar2) {
            this.f135586a = i2;
            this.f135587b = bVar;
            this.f135588c = list;
            this.f135589d = cVar;
            this.f135590e = bVar2;
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.u
    public final void a(com.ss.android.ugc.aweme.sticker.repository.c.b bVar) {
        String str;
        l.d(bVar, "");
        b bVar2 = this.f135584a;
        if (bVar2 != null) {
            List<Effect> list = bVar.f135481a;
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                T t2 = t;
                String parentId = t2.getParentId();
                if (parentId == null || parentId.length() == 0) {
                    str = t2.getId();
                } else {
                    str = t2.getParentId();
                }
                if (hashSet.add(str)) {
                    arrayList.add(t);
                }
            }
            List g2 = n.g((Collection) arrayList);
            int i2 = bVar.f135482b;
            int i3 = bVar.f135483c;
            Map<String, String> map = bVar.f135484d;
            l.d(g2, "");
            com.ss.android.ugc.aweme.sticker.repository.c.b bVar3 = new com.ss.android.ugc.aweme.sticker.repository.c.b(g2, i2, i3, map);
            int i4 = 0;
            for (Object obj : g2) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    n.a();
                }
                EffectTemplate effectTemplate = (EffectTemplate) obj;
                String parentId2 = effectTemplate.getParentId();
                if (!(parentId2 == null || parentId2.length() == 0)) {
                    o d2 = bVar2.d();
                    String parentId3 = effectTemplate.getParentId();
                    if (parentId3 == null) {
                        l.b();
                    }
                    d2.a(n.a(parentId3), bVar.f135484d, new a(i4, bVar2, g2, this, bVar));
                }
                i4 = i5;
            }
            this.f135585b.onNext(bVar3);
            return;
        }
        this.f135585b.onNext(bVar);
    }
}
