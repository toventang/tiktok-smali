package com.ss.android.ugc.aweme.shortvideo.cut;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class VideoLayoutManager extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    public final a f125404a;

    static {
        Covode.recordClassIndex(82313);
    }

    public final class a extends r {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ VideoLayoutManager f125405f;

        static {
            Covode.recordClassIndex(82314);
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(VideoLayoutManager videoLayoutManager, Context context) {
            super(context);
            l.d(context, "");
            this.f125405f = videoLayoutManager;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoLayoutManager(Context context) {
        super(0, false);
        l.d(context, "");
        this.f125404a = new a(this, context);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView recyclerView, RecyclerView.s sVar, int i2) {
        l.d(recyclerView, "");
        a aVar = this.f125404a;
        aVar.f3862g = i2;
        a(aVar);
    }
}
