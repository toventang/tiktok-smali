package com.ss.android.ugc.aweme.tools.draft.c;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.eq;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.p;
import h.q;
import h.v;
import h.z;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bz;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f139453b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final am f139454a;

    /* renamed from: c  reason: collision with root package name */
    private final h f139455c;

    /* renamed from: d  reason: collision with root package name */
    private final h f139456d = i.a((h.f.a.a) d.f139464a);

    static {
        Covode.recordClassIndex(91191);
    }

    private final com.ss.android.ugc.aweme.effectplatform.f a() {
        return (com.ss.android.ugc.aweme.effectplatform.f) this.f139455c.getValue();
    }

    private final com.ss.android.ugc.aweme.dependence.a.a.a<Effect, z> b() {
        return (com.ss.android.ugc.aweme.dependence.a.a.a) this.f139456d.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(91192);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static List<StickerItemModel> a(com.ss.android.ugc.aweme.draft.model.c cVar) {
            InfoStickerModel j2;
            List<StickerItemModel> list;
            l.d(cVar, "");
            if (!(!cVar.W.aE || cVar == null || (j2 = cVar.j()) == null || (list = j2.stickers) == null)) {
                ArrayList arrayList = new ArrayList();
                for (T t : list) {
                    T t2 = t;
                    if (t2.type == 0 && !TextUtils.isEmpty(t2.stickerId)) {
                        arrayList.add(t);
                    }
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 == null || arrayList2.isEmpty() || arrayList2 == null) {
                    return null;
                }
                return arrayList2;
            }
            return null;
        }
    }

    static final class d extends m implements h.f.a.a<com.ss.android.ugc.aweme.dependence.a.a.a<Effect, z>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f139464a = new d();

        static {
            Covode.recordClassIndex(91195);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.dependence.a.a.a<Effect, z> invoke() {
            com.ss.android.ugc.aweme.dependence.a.a.a aVar = new com.ss.android.ugc.aweme.dependence.a.a.a(new a());
            aVar.f79549a = 0;
            aVar.f79551c = true;
            aVar.f79550b = true;
            aVar.f79552d = new com.ss.android.ugc.aweme.dependence.a.a.b.d() {
                /* class com.ss.android.ugc.aweme.tools.draft.c.b.d.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(91196);
                }

                @Override // com.ss.android.ugc.aweme.dependence.a.a.b.d
                public final void a(Exception exc) {
                    l.d(exc, "");
                    com.ss.android.ugc.aweme.port.in.g.a();
                    bj.a(exc);
                }
            };
            return aVar;
        }
    }

    static final class e extends m implements h.f.a.a<com.ss.android.ugc.aweme.effectplatform.f> {
        final /* synthetic */ androidx.lifecycle.m $owner;

        static {
            Covode.recordClassIndex(91197);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(androidx.lifecycle.m mVar) {
            super(0);
            this.$owner = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.effectplatform.f invoke() {
            Application application = com.ss.android.ugc.aweme.port.in.i.f115645a;
            l.b(application, "");
            com.ss.android.ugc.aweme.effectplatform.f a2 = com.ss.android.ugc.aweme.effectplatform.c.a(application, null);
            a2.a(this.$owner);
            return a2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.c.b$b  reason: collision with other inner class name */
    public static final class C3680b implements com.ss.android.ugc.aweme.dependence.a.a.a.a<Effect, z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HashMap f139457a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.c.d f139458b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f139459c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f139460d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f139461e;

        static {
            Covode.recordClassIndex(91193);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.aweme.dependence.a.a.a.a
        public final /* synthetic */ void a(Effect effect) {
            l.d(effect, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.aweme.dependence.a.a.a.a
        public final /* synthetic */ void b(Effect effect) {
            l.d(effect, "");
            this.f139457a.put(effect, true);
            HashMap hashMap = this.f139457a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                if (!((Boolean) entry.getValue()).booleanValue()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (linkedHashMap.isEmpty()) {
                this.f139458b.resumeWith(q.m223constructorimpl(v.a(this.f139460d.getFirst(), true)));
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Integer, java.lang.Exception] */
        @Override // com.ss.android.ugc.aweme.dependence.a.a.a.a
        public final /* synthetic */ void a(Effect effect, Integer num, Exception exc) {
            l.d(effect, "");
            this.f139458b.resumeWith(q.m223constructorimpl(v.a(this.f139460d.getFirst(), false)));
        }

        C3680b(HashMap hashMap, h.c.d dVar, b bVar, p pVar, boolean z) {
            this.f139457a = hashMap;
            this.f139458b = dVar;
            this.f139459c = bVar;
            this.f139460d = pVar;
            this.f139461e = z;
        }
    }

    public static final class c implements com.ss.android.ugc.aweme.dependence.a.a.a.a<Effect, z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HashMap f139462a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.c.d f139463b;

        static {
            Covode.recordClassIndex(91194);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.aweme.dependence.a.a.a.a
        public final /* synthetic */ void a(Effect effect) {
            l.d(effect, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.aweme.dependence.a.a.a.a
        public final /* synthetic */ void b(Effect effect) {
            l.d(effect, "");
            this.f139462a.put(effect, true);
            HashMap hashMap = this.f139462a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                if (!((Boolean) entry.getValue()).booleanValue()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (linkedHashMap.isEmpty()) {
                this.f139463b.resumeWith(q.m223constructorimpl(true));
            }
        }

        c(HashMap hashMap, h.c.d dVar) {
            this.f139462a = hashMap;
            this.f139463b = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Integer, java.lang.Exception] */
        @Override // com.ss.android.ugc.aweme.dependence.a.a.a.a
        public final /* synthetic */ void a(Effect effect, Integer num, Exception exc) {
            l.d(effect, "");
            this.f139463b.resumeWith(q.m223constructorimpl(false));
        }
    }

    public static final class f implements IFetchEffectListListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f139465a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.c.d f139466b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f139467c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Map f139468d;

        static {
            Covode.recordClassIndex(91198);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(List<Effect> list) {
            final List<Effect> list2 = list;
            l.d(list2, "");
            bz unused = kotlinx.coroutines.i.a(this.f139467c.f139454a, null, null, new h.f.a.m<am, h.c.d<? super z>, Object>(this, null) {
                /* class com.ss.android.ugc.aweme.tools.draft.c.b.f.AnonymousClass1 */
                int label;
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(91199);
                }

                {
                    this.this$0 = r2;
                }

                @Override // h.c.b.a.a
                public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                    l.d(dVar, "");
                    return 

                    public static final class g implements IFetchEffectListListener {

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ List f139469a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ h.c.d f139470b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ b f139471c;

                        /* renamed from: d  reason: collision with root package name */
                        final /* synthetic */ List f139472d;

                        static {
                            Covode.recordClassIndex(91200);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                        public final /* synthetic */ void onSuccess(List<Effect> list) {
                            final List<Effect> list2 = list;
                            l.d(list2, "");
                            bz unused = kotlinx.coroutines.i.a(this.f139471c.f139454a, null, null, new h.f.a.m<am, h.c.d<? super z>, Object>(this, null) {
                                /* class com.ss.android.ugc.aweme.tools.draft.c.b.g.AnonymousClass1 */
                                int label;
                                final /* synthetic */ g this$0;

                                static {
                                    Covode.recordClassIndex(91201);
                                }

                                {
                                    this.this$0 = r2;
                                }

                                @Override // h.c.b.a.a
                                public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                                    l.d(dVar, "");
                                    return 

                                    public b(androidx.lifecycle.m mVar) {
                                        l.d(mVar, "");
                                        com.ss.android.ugc.aweme.port.in.c.a(eq.a());
                                        this.f139455c = i.a((h.f.a.a) new e(mVar));
                                        b().b();
                                        this.f139454a = c.a();
                                    }

                                    public static boolean a(Effect effect) {
                                        File file = new File(effect.getUnzipPath());
                                        if (file.exists() && file.isDirectory()) {
                                            File[] listFiles = file.listFiles();
                                            l.b(listFiles, "");
                                            for (File file2 : listFiles) {
                                                l.b(file2, "");
                                                if (TextUtils.equals("config.json", file2.getName())) {
                                                    return true;
                                                }
                                            }
                                        }
                                        return false;
                                    }

                                    public final Object a(List<? extends StickerItemModel> list, h.c.d<? super List<Effect>> dVar) {
                                        h.c.h hVar = new h.c.h(h.c.a.b.a(dVar));
                                        ArrayList arrayList = new ArrayList();
                                        for (StickerItemModel stickerItemModel : list) {
                                            String str = stickerItemModel.stickerId;
                                            l.b(str, "");
                                            arrayList.add(str);
                                        }
                                        a().a((List<String>) arrayList, (Map<String, String>) null, false, (IFetchEffectListListener) new g(arrayList, hVar, this, list));
                                        Object a2 = hVar.a();
                                        if (a2 == h.c.a.a.COROUTINE_SUSPENDED) {
                                            l.d(dVar, "");
                                        }
                                        return a2;
                                    }

                                    public final Object a(Map<com.ss.android.ugc.aweme.draft.model.c, ? extends List<? extends StickerItemModel>> map, h.c.d<? super Map<com.ss.android.ugc.aweme.draft.model.c, ? extends List<? extends Effect>>> dVar) {
                                        h.c.h hVar = new h.c.h(h.c.a.b.a(dVar));
                                        LinkedHashSet<StickerItemModel> linkedHashSet = new LinkedHashSet();
                                        Iterator<T> it = map.values().iterator();
                                        while (it.hasNext()) {
                                            linkedHashSet.addAll(it.next());
                                        }
                                        ArrayList arrayList = new ArrayList(n.a(linkedHashSet, 10));
                                        for (StickerItemModel stickerItemModel : linkedHashSet) {
                                            arrayList.add(stickerItemModel.stickerId);
                                        }
                                        ArrayList arrayList2 = arrayList;
                                        a().a((List<String>) arrayList2, (Map<String, String>) null, false, (IFetchEffectListListener) new f(arrayList2, hVar, this, map));
                                        Object a2 = hVar.a();
                                        if (a2 == h.c.a.a.COROUTINE_SUSPENDED) {
                                            l.d(dVar, "");
                                        }
                                        return a2;
                                    }

                                    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
                                    /* JADX WARNING: Unknown variable types count: 1 */
                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                    public static /* synthetic */ java.lang.Object a(com.ss.android.ugc.aweme.tools.draft.c.b r6, java.util.List r7, h.c.d r8) {
                                        /*
                                            h.c.h r5 = new h.c.h
                                            h.c.d r0 = h.c.a.b.a(r8)
                                            r5.<init>(r0)
                                            java.util.HashMap r4 = new java.util.HashMap
                                            r4.<init>()
                                            com.ss.android.ugc.aweme.tools.draft.c.b$c r3 = new com.ss.android.ugc.aweme.tools.draft.c.b$c
                                            r3.<init>(r4, r5)
                                            java.util.Iterator r2 = r7.iterator()
                                        L_0x0017:
                                            boolean r0 = r2.hasNext()
                                            if (r0 == 0) goto L_0x002a
                                            java.lang.Object r1 = r2.next()
                                            r0 = 0
                                            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                                            r4.put(r1, r0)
                                            goto L_0x0017
                                        L_0x002a:
                                            java.util.Iterator r2 = r7.iterator()
                                        L_0x002e:
                                            boolean r0 = r2.hasNext()
                                            if (r0 == 0) goto L_0x0040
                                            java.lang.Object r1 = r2.next()
                                            com.ss.android.ugc.aweme.dependence.a.a.a r0 = r6.b()
                                            r0.a(r1, r3)
                                            goto L_0x002e
                                        L_0x0040:
                                            java.lang.Object r1 = r5.a()
                                            h.c.a.a r0 = h.c.a.a.COROUTINE_SUSPENDED
                                            if (r1 != r0) goto L_0x004d
                                            java.lang.String r0 = ""
                                            h.f.b.l.d(r8, r0)
                                        L_0x004d:
                                            return r1
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.c.b.a(com.ss.android.ugc.aweme.tools.draft.c.b, java.util.List, h.c.d):java.lang.Object");
                                    }

                                    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
                                    /* JADX WARNING: Unknown variable types count: 1 */
                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                    public final java.lang.Object a(h.p<? extends com.ss.android.ugc.aweme.draft.model.c, ? extends java.util.List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect>> r11, boolean r12, h.c.d<? super h.p<? extends com.ss.android.ugc.aweme.draft.model.c, java.lang.Boolean>> r13) {
                                        /*
                                        // Method dump skipped, instructions count: 111
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.c.b.a(h.p, boolean, h.c.d):java.lang.Object");
                                    }
                                }
