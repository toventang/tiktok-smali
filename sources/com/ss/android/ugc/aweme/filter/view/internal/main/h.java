package com.ss.android.ugc.aweme.filter.view.internal.main;

import android.widget.SeekBar;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.view.internal.c;
import h.f.b.l;

public final class h implements c {

    /* renamed from: a  reason: collision with root package name */
    private final SeekBar f95885a;

    static {
        Covode.recordClassIndex(60751);
    }

    @Override // com.ss.android.ugc.aweme.filter.view.internal.c
    public final SeekBar a() {
        return this.f95885a;
    }

    @Override // com.ss.android.ugc.aweme.filter.view.internal.c
    public final boolean b() {
        if (this.f95885a.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public h(SeekBar seekBar) {
        l.d(seekBar, "");
        this.f95885a = seekBar;
        seekBar.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.filter.view.internal.c
    public final void a(boolean z) {
        int i2;
        SeekBar seekBar = this.f95885a;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        seekBar.setVisibility(i2);
    }
}
