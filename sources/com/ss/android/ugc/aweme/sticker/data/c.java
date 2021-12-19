package com.ss.android.ugc.aweme.sticker.data;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final List<h> f134790a;

    /* renamed from: b  reason: collision with root package name */
    private int f134791b;

    /* renamed from: c  reason: collision with root package name */
    private int f134792c = -1;

    static {
        Covode.recordClassIndex(88111);
    }

    public c(List<h> list) {
        l.d(list, "");
        this.f134790a = list;
    }

    public final String a(int i2) {
        if (i2 < 0) {
            return null;
        }
        int i3 = this.f134792c;
        if (i2 > i3) {
            int i4 = this.f134791b;
            int size = this.f134790a.size() - 1;
            if (i4 > size) {
                return null;
            }
            while (true) {
                long j2 = (long) i2;
                if (j2 < this.f134790a.get(i4).getStartTime()) {
                    return null;
                }
                if (this.f134790a.get(i4).getStartTime() <= j2 && j2 < this.f134790a.get(i4).getEndTime()) {
                    String text = this.f134790a.get(i4).getText();
                    this.f134791b = i4;
                    this.f134792c = i2;
                    return text;
                } else if (i4 == size) {
                    return null;
                } else {
                    i4++;
                }
            }
        } else if (i2 == i3) {
            h hVar = (h) n.b((List) this.f134790a, this.f134791b);
            if (hVar != null) {
                return hVar.getText();
            }
            return null;
        } else {
            for (int i5 = this.f134791b; i5 >= 0; i5--) {
                long j3 = (long) i2;
                if (j3 > this.f134790a.get(i5).getEndTime()) {
                    return null;
                }
                if (this.f134790a.get(i5).getStartTime() <= j3 && j3 < this.f134790a.get(i5).getEndTime()) {
                    String text2 = this.f134790a.get(i5).getText();
                    this.f134791b = i5;
                    this.f134792c = i2;
                    return text2;
                }
            }
            return null;
        }
    }
}
