package com.ss.android.ugc.aweme.shortvideo.cut;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.at;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f125465a = new g();

    private g() {
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f125466a;

        static {
            Covode.recordClassIndex(82345);
        }

        a(List list) {
            this.f125466a = list;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return Integer.valueOf(g.a(this.f125466a));
        }
    }

    static {
        Covode.recordClassIndex(82344);
    }

    public static int a(List<? extends VideoSegment> list) {
        Object next;
        int i2;
        int a2 = at.a();
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (!t.f125485i) {
                    arrayList.add(t);
                }
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    int a3 = ((VideoSegment) next).a();
                    do {
                        Object next2 = it.next();
                        int a4 = ((VideoSegment) next2).a();
                        if (a3 < a4) {
                            next = next2;
                            a3 = a4;
                        }
                    } while (it.hasNext());
                }
            }
            VideoSegment videoSegment = (VideoSegment) next;
            if (videoSegment != null) {
                i2 = videoSegment.a();
            } else {
                i2 = 0;
            }
            int max = Math.max(30, i2);
            if (a2 > 0) {
                if (max > a2) {
                    return a2;
                }
                return max;
            } else if (51 <= max && 74 >= max) {
                return max / 2;
            } else {
                if (max >= 75) {
                    return max / 3;
                }
                return max;
            }
        } else if (a2 > 0) {
            return a2;
        } else {
            return 30;
        }
    }
}
