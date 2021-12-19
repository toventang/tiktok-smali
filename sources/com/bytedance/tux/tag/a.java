package com.bytedance.tux.tag;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.f.a.e;
import h.f.b.l;

public final class a extends e<TuxTag> {
    static {
        Covode.recordClassIndex(27689);
    }

    public final void a() {
        ((TuxTag) this.f45047c).setTagSize(2);
    }

    public final void a(int i2) {
        ((TuxTag) this.f45047c).setTagTextColor(i2);
    }

    public final void b(int i2) {
        ((TuxTag) this.f45047c).setIconTintColor(i2);
    }

    public final void c(int i2) {
        ((TuxTag) this.f45047c).setIconWidth(i2);
    }

    public final void d(int i2) {
        ((TuxTag) this.f45047c).setIconHeight(i2);
    }

    public final void e(int i2) {
        ((TuxTag) this.f45047c).setTagBackgroundColor(i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(new TuxTag(context, null, 0, 6));
        l.c(context, "");
    }

    public final void a(Integer num) {
        ((TuxTag) this.f45047c).setTagIcon(num);
    }

    public final void a(String str) {
        l.c(str, "");
        ((TuxTag) this.f45047c).setText(str);
    }
}
