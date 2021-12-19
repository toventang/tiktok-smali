package com.ss.android.ttve.common;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public int f61094a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f61095b = -1;

    /* renamed from: c  reason: collision with root package name */
    public List<Integer> f61096c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public List<Integer> f61097d = new ArrayList();

    static {
        Covode.recordClassIndex(37616);
    }

    public final void a() {
        this.f61094a = -1;
        this.f61095b = -1;
        this.f61096c.clear();
        this.f61097d.clear();
    }

    public final int a(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (this.f61094a == -1) {
            this.f61094a = i2;
        }
        if (this.f61096c.size() > 0) {
            List<Integer> list = this.f61096c;
            i2 = list.get(list.size() - 1).intValue() + 1;
        }
        this.f61096c.add(Integer.valueOf(i2));
        return i2;
    }

    public final int a(int i2, int i3) {
        int i4;
        int i5;
        int i6 = 0;
        if (i2 == 1) {
            int i7 = this.f61094a;
            if (i3 >= i7 && i7 != -1) {
                while (i6 < this.f61096c.size()) {
                    if (i3 == this.f61096c.get(i6).intValue()) {
                        i4 = this.f61094a;
                        return i6 + i4;
                    }
                    i6++;
                }
            }
        } else if (i2 != 2 || i3 < (i5 = this.f61095b) || i5 == -1) {
            return i3;
        } else {
            while (i6 < this.f61097d.size()) {
                if (i3 == this.f61097d.get(i6).intValue()) {
                    i4 = this.f61095b;
                    return i6 + i4;
                }
                i6++;
            }
        }
        return i3;
    }
}
