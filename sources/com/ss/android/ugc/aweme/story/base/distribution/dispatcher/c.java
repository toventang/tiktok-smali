package com.ss.android.ugc.aweme.story.base.distribution.dispatcher;

import com.bytedance.covode.number.Covode;
import f.a.t;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.k.k;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public abstract class c<SUBSCRIBE_DATA, OUTPUT_DATA> {

    /* renamed from: a  reason: collision with root package name */
    final ConcurrentHashMap<com.ss.android.ugc.aweme.story.base.d, Set<StoryReceiver>> f136887a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public f.a.d.d<a<SUBSCRIBE_DATA, OUTPUT_DATA>, a<SUBSCRIBE_DATA, OUTPUT_DATA>> f136888b;

    /* renamed from: c  reason: collision with root package name */
    private final f.a.l.b<a<SUBSCRIBE_DATA, OUTPUT_DATA>> f136889c;

    static {
        Covode.recordClassIndex(89463);
    }

    public abstract Object a(SUBSCRIBE_DATA subscribe_data, OUTPUT_DATA output_data);

    public abstract List<k<SUBSCRIBE_DATA, ?>> b(SUBSCRIBE_DATA subscribe_data, SUBSCRIBE_DATA subscribe_data2);

    public final t<a<SUBSCRIBE_DATA, OUTPUT_DATA>> a() {
        t<a<SUBSCRIBE_DATA, OUTPUT_DATA>> c2 = this.f136889c.c();
        l.b(c2, "");
        return c2;
    }

    public c() {
        f.a.l.b<a<SUBSCRIBE_DATA, OUTPUT_DATA>> bVar = new f.a.l.b<>();
        l.b(bVar, "");
        this.f136889c = bVar;
        this.f136888b = new b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.base.distribution.dispatcher.c$c  reason: collision with other inner class name */
    static final class C3577c extends m implements h.f.a.b<StoryReceiver, Boolean> {
        final /* synthetic */ StoryReceiver $storyReceiver$inlined;

        static {
            Covode.recordClassIndex(89466);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3577c(StoryReceiver storyReceiver) {
            super(1);
            this.$storyReceiver$inlined = storyReceiver;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(StoryReceiver storyReceiver) {
            boolean z;
            StoryReceiver storyReceiver2 = storyReceiver;
            l.d(storyReceiver2, "");
            if (l.a(storyReceiver2.f136884b, this.$storyReceiver$inlined.f136884b)) {
                f.a.b.b bVar = storyReceiver2.f136883a;
                if (bVar != null) {
                    bVar.dispose();
                }
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<StoryReceiver, Boolean> {
        final /* synthetic */ StoryReceiver $storyReceiver;

        static {
            Covode.recordClassIndex(89467);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(StoryReceiver storyReceiver) {
            super(1);
            this.$storyReceiver = storyReceiver;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(StoryReceiver storyReceiver) {
            boolean z;
            StoryReceiver storyReceiver2 = storyReceiver;
            l.d(storyReceiver2, "");
            if (l.a(storyReceiver2, this.$storyReceiver) || l.a(storyReceiver2.f136884b, this.$storyReceiver.f136884b)) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class b<T1, T2> implements f.a.d.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f136894a;

        static {
            Covode.recordClassIndex(89465);
        }

        b(c cVar) {
            this.f136894a = cVar;
        }

        @Override // f.a.d.d
        public final /* synthetic */ boolean a(Object obj, Object obj2) {
            a aVar = (a) obj;
            a aVar2 = (a) obj2;
            l.d(aVar, "");
            l.d(aVar2, "");
            k<SUBSCRIBE_DATA, ?>[] kVarArr = aVar2.f136893d;
            if (kVarArr == null) {
                return false;
            }
            for (k<SUBSCRIBE_DATA, ?> kVar : kVarArr) {
                if (kVar != null && l.a(kVar.get(aVar2.f136891b), kVar.get(aVar.f136891b))) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void a(com.ss.android.ugc.aweme.story.base.d dVar, StoryReceiver storyReceiver) {
        l.d(dVar, "");
        l.d(storyReceiver, "");
        ConcurrentHashMap<com.ss.android.ugc.aweme.story.base.d, Set<StoryReceiver>> concurrentHashMap = this.f136887a;
        Set<StoryReceiver> set = concurrentHashMap.get(dVar);
        if (set == null) {
            set = new LinkedHashSet<>();
        }
        n.a((Iterable) set, (h.f.a.b) new C3577c(storyReceiver));
        set.add(storyReceiver);
        concurrentHashMap.put(dVar, set);
    }

    public final void a(SUBSCRIBE_DATA subscribe_data, SUBSCRIBE_DATA subscribe_data2, OUTPUT_DATA output_data) {
        List<k<SUBSCRIBE_DATA, ?>> b2 = b(subscribe_data, subscribe_data2);
        if (!b2.isEmpty()) {
            this.f136889c.onNext(new a<>(b2, subscribe_data2, output_data, null));
        }
    }

    public static final class a<SUBSCRIBE_DATA, OUTPUT_DATA> {

        /* renamed from: a  reason: collision with root package name */
        public final List<k<SUBSCRIBE_DATA, ?>> f136890a;

        /* renamed from: b  reason: collision with root package name */
        public final SUBSCRIBE_DATA f136891b;

        /* renamed from: c  reason: collision with root package name */
        public final OUTPUT_DATA f136892c;

        /* renamed from: d  reason: collision with root package name */
        public final k<SUBSCRIBE_DATA, ?>[] f136893d;

        static {
            Covode.recordClassIndex(89464);
        }

        /* access modifiers changed from: private */
        public static a<SUBSCRIBE_DATA, OUTPUT_DATA> a(List<? extends k<SUBSCRIBE_DATA, ?>> list, SUBSCRIBE_DATA subscribe_data, OUTPUT_DATA output_data, k<SUBSCRIBE_DATA, ?>[] kVarArr) {
            l.d(list, "");
            return new a<>(list, subscribe_data, output_data, kVarArr);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f136890a, aVar.f136890a) && l.a(this.f136891b, aVar.f136891b) && l.a(this.f136892c, aVar.f136892c) && l.a(this.f136893d, aVar.f136893d);
        }

        public final int hashCode() {
            List<k<SUBSCRIBE_DATA, ?>> list = this.f136890a;
            int i2 = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            SUBSCRIBE_DATA subscribe_data = this.f136891b;
            int hashCode2 = (hashCode + (subscribe_data != null ? subscribe_data.hashCode() : 0)) * 31;
            OUTPUT_DATA output_data = this.f136892c;
            int hashCode3 = (hashCode2 + (output_data != null ? output_data.hashCode() : 0)) * 31;
            k<SUBSCRIBE_DATA, ?>[] kVarArr = this.f136893d;
            if (kVarArr != null) {
                i2 = Arrays.hashCode(kVarArr);
            }
            return hashCode3 + i2;
        }

        public final String toString() {
            return "StorySubscribeData(changedProperties=" + this.f136890a + ", updatedData=" + ((Object) this.f136891b) + ", outputData=" + ((Object) this.f136892c) + ", filterProperties=" + Arrays.toString(this.f136893d) + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends h.k.k<SUBSCRIBE_DATA, ?>> */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends k<SUBSCRIBE_DATA, ?>> list, SUBSCRIBE_DATA subscribe_data, OUTPUT_DATA output_data, k<SUBSCRIBE_DATA, ?>[] kVarArr) {
            l.d(list, "");
            this.f136890a = list;
            this.f136891b = subscribe_data;
            this.f136892c = output_data;
            this.f136893d = kVarArr;
        }
    }
}
