package com.ss.android.ugc.aweme.discover.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.LinkedList;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f80926a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private int f80927b = 100000;

    /* renamed from: c  reason: collision with root package name */
    private final LinkedList<Integer> f80928c = new LinkedList<>();

    static {
        Covode.recordClassIndex(50307);
    }

    public static boolean a(int i2) {
        return 100000 <= i2 && 110000 >= i2;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50308);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int a() {
        if (this.f80928c.size() > 0) {
            Integer removeFirst = this.f80928c.removeFirst();
            l.b(removeFirst, "");
            return removeFirst.intValue();
        }
        int i2 = this.f80927b;
        if (i2 <= 110000) {
            this.f80927b = i2 + 1;
            return i2;
        }
        throw new IllegalStateException("Your viewType is too much,it's impossible in common");
    }

    public final void b(int i2) {
        this.f80928c.addLast(Integer.valueOf(i2));
    }
}
