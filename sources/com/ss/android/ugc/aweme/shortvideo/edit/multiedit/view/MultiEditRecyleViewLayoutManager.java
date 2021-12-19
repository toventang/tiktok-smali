package com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class MultiEditRecyleViewLayoutManager extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    private final a f127983a;

    static {
        Covode.recordClassIndex(83886);
    }

    public final class a extends r {
        static {
            Covode.recordClassIndex(83887);
        }

        @Override // androidx.recyclerview.widget.r
        public final float a(DisplayMetrics displayMetrics) {
            l.d(displayMetrics, "");
            return 200.0f / ((float) displayMetrics.densityDpi);
        }

        @Override // androidx.recyclerview.widget.r
        public final int b(int i2) {
            if (i2 > 2000) {
                i2 = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
            }
            return super.b(i2);
        }

        public a(Context context) {
            super(context);
        }
    }

    public MultiEditRecyleViewLayoutManager(Context context) {
        super(0, false);
        this.f127983a = new a(context);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView recyclerView, RecyclerView.s sVar, int i2) {
        l.d(recyclerView, "");
        a aVar = this.f127983a;
        aVar.f3862g = i2;
        a(aVar);
    }
}
