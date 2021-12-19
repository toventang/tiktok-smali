package com.bytedance.android.live.effect.api.a;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class l {

    /* renamed from: f  reason: collision with root package name */
    private static final List<a> f9644f;

    /* renamed from: g  reason: collision with root package name */
    private static final List<String> f9645g;

    /* renamed from: a  reason: collision with root package name */
    public final List<a> f9646a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f9647b;

    /* renamed from: c  reason: collision with root package name */
    public final b f9648c;

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f9649d;

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f9650e;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        List<a> f9651a;

        /* renamed from: b  reason: collision with root package name */
        public List<String> f9652b;

        /* renamed from: c  reason: collision with root package name */
        public List<String> f9653c;

        /* renamed from: d  reason: collision with root package name */
        public b f9654d;

        static {
            Covode.recordClassIndex(4911);
        }

        public final l a() {
            return new l(this);
        }
    }

    static {
        Covode.recordClassIndex(4910);
        LinkedList linkedList = new LinkedList();
        f9644f = linkedList;
        LinkedList linkedList2 = new LinkedList();
        f9645g = linkedList2;
        linkedList.add(new a("beauty", Arrays.asList(1, 2, 3)));
        linkedList.add(new a(com.bytedance.android.live.effect.api.a.f9639d, Arrays.asList(1, 2, 3)));
        linkedList.add(new a("effect_gift", Arrays.asList(1, 3)));
        linkedList.add(new a("livegame", Collections.singletonList(3)));
        linkedList.add(new a("livemoneygame", Collections.singletonList(3)));
        linkedList.add(new a(com.bytedance.android.live.effect.api.a.f9636a, Collections.singletonList(2)));
        linkedList.add(new a(com.bytedance.android.live.effect.api.a.f9637b, Collections.singletonList(2)));
        linkedList.add(new a(com.bytedance.android.live.effect.api.a.f9638c, Collections.singletonList(2)));
        linkedList2.add(com.bytedance.android.live.effect.api.a.f9639d);
        linkedList2.add("makeupforever");
    }

    public l(a aVar) {
        List<String> list;
        List<String> list2;
        List<a> list3;
        this.f9648c = aVar.f9654d;
        if (aVar.f9652b == null) {
            list = Collections.emptyList();
        } else {
            list = aVar.f9652b;
        }
        this.f9647b = list;
        if (aVar.f9653c == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = aVar.f9653c;
        }
        this.f9649d = list2;
        if (aVar.f9651a == null || aVar.f9651a.isEmpty()) {
            list3 = f9644f;
        } else {
            list3 = aVar.f9651a;
        }
        this.f9646a = list3;
        this.f9650e = f9645g;
    }
}
