package com.ss.android.ugc.aweme.feed.widget;

import android.text.style.ClickableSpan;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.ui.bf;
import h.a.i;
import h.f.b.l;
import java.util.Comparator;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f95269a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(60347);
    }

    public static final ClickableSpan a(ClickableSpan[] clickableSpanArr) {
        l.d(clickableSpanArr, "");
        if (clickableSpanArr.length > 1) {
            i.a((Object[]) clickableSpanArr, (Comparator) new a());
        }
        return clickableSpanArr[0];
    }

    public static final class a<T> implements Comparator {
        static {
            Covode.recordClassIndex(60348);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i2;
            T t3 = t2;
            int i3 = 100;
            if (t3 instanceof bf) {
                i2 = t3.f94343a;
            } else {
                i2 = 100;
            }
            Integer valueOf = Integer.valueOf(i2);
            T t4 = t;
            if (t4 instanceof bf) {
                i3 = t4.f94343a;
            }
            return h.b.a.a(valueOf, Integer.valueOf(i3));
        }
    }
}
