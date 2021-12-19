package com.bytedance.android.livesdk.gifttray.b;

import com.bytedance.android.livesdk.gifttray.d.b;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f18020a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(10001);
    }

    public static void a(com.bytedance.android.livesdk.gifttray.a.a aVar, LinkedList<com.bytedance.android.livesdk.gifttray.a.a> linkedList) {
        int i2;
        int size = linkedList.size() - 1;
        while (true) {
            if (size < 0) {
                i2 = 0;
                break;
            } else if (linkedList.get(size).f17995b >= aVar.f17995b) {
                i2 = size + 1;
                break;
            } else {
                size--;
            }
        }
        linkedList.add(i2, aVar);
    }

    /* renamed from: com.bytedance.android.livesdk.gifttray.b.a$a  reason: collision with other inner class name */
    public static final class C0375a<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public static final C0375a f18021a = new C0375a();

        static {
            Covode.recordClassIndex(10002);
        }

        C0375a() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            com.bytedance.android.livesdk.gifttray.a.a aVar = (com.bytedance.android.livesdk.gifttray.a.a) obj;
            com.bytedance.android.livesdk.gifttray.a.a aVar2 = (com.bytedance.android.livesdk.gifttray.a.a) obj2;
            int b2 = b.b(aVar);
            int b3 = b.b(aVar2);
            if (b2 < b3) {
                return 1;
            }
            if (b2 > b3 || b.c(aVar2) >= b.c(aVar)) {
                return -1;
            }
            return 1;
        }
    }

    public static com.bytedance.android.livesdk.gifttray.a.a a(String str, LinkedList<com.bytedance.android.livesdk.gifttray.a.a> linkedList) {
        Iterator<com.bytedance.android.livesdk.gifttray.a.a> it = linkedList.iterator();
        l.b(it, "");
        while (it.hasNext()) {
            com.bytedance.android.livesdk.gifttray.a.a next = it.next();
            l.b(next, "");
            com.bytedance.android.livesdk.gifttray.a.a aVar = next;
            if (l.a((Object) aVar.f17994a, (Object) str)) {
                it.remove();
                return aVar;
            }
        }
        return null;
    }
}
