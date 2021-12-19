package com.ss.android.ugc.aweme.sticker.types.game;

import android.util.Pair;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.di;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements u {

    /* renamed from: a  reason: collision with root package name */
    private final b f136099a;

    /* renamed from: b  reason: collision with root package name */
    private final l f136100b;

    static {
        Covode.recordClassIndex(88901);
    }

    d(b bVar, l lVar) {
        this.f136099a = bVar;
        this.f136100b = lVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        b bVar = this.f136099a;
        l lVar = this.f136100b;
        Pair pair = (Pair) obj;
        if (pair != null && ((Boolean) pair.first).booleanValue()) {
            ShortVideoContext e2 = bVar.e();
            long a2 = di.a();
            if (e2.f124757b.b() && e2.f124757b.u != 1) {
                a2 = e2.f124757b.f124707b;
            } else if (e2.c()) {
                a2 = 3000;
            }
            if (TimeSpeedModelExtension.calculateRealTime(bVar.f136084a.getEndFrameTimeUS() / 1000, 1.0d) + bVar.e().f124757b.f124712g >= a2 && bVar.f136086c) {
                bVar.f136086c = false;
                bVar.f136087d = true;
                bVar.e().ae = ((Integer) pair.second).intValue();
                lVar.a();
            }
        }
    }
}
