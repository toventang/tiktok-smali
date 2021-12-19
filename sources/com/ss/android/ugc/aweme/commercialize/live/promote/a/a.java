package com.ss.android.ugc.aweme.commercialize.live.promote.a;

import android.os.Bundle;
import androidx.lifecycle.ac;
import com.bytedance.android.live.slot.b;
import com.bytedance.covode.number.Covode;
import java.lang.Enum;

public abstract class a<W, VM extends ac, T extends Enum<T>> extends b<W, VM, T> {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ e f74677c = new e();

    static {
        Covode.recordClassIndex(46041);
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final void d() {
        super.d();
        e eVar = this.f74677c;
        eVar.f74690a = 0;
        eVar.f74691b = true;
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.f74677c.f74690a = System.currentTimeMillis();
    }
}
