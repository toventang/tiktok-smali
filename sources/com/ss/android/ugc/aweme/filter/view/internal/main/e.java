package com.ss.android.ugc.aweme.filter.view.internal.main;

import android.widget.SeekBar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public b<? super com.ss.android.ugc.tools.view.style.b, z> f95854a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f95855b;

    /* renamed from: c  reason: collision with root package name */
    public RecyclerView.f f95856c;

    /* renamed from: d  reason: collision with root package name */
    public b<? super SeekBar, z> f95857d;

    /* renamed from: e  reason: collision with root package name */
    public b<? super TabLayout, z> f95858e;

    /* renamed from: f  reason: collision with root package name */
    public g f95859f;

    static {
        Covode.recordClassIndex(60735);
    }

    public e() {
        this(false, null, null, 63);
    }

    private e(boolean z, RecyclerView.f fVar, g gVar) {
        l.d(gVar, "");
        this.f95854a = null;
        this.f95855b = z;
        this.f95856c = fVar;
        this.f95857d = null;
        this.f95858e = null;
        this.f95859f = gVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(boolean z, RecyclerView.f fVar, g gVar, int i2) {
        this((i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? new i() : fVar, (i2 & 32) != 0 ? new g(0, false, null, 7) : gVar);
    }
}
