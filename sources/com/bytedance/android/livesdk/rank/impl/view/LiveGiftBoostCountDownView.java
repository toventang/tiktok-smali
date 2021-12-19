package com.bytedance.android.livesdk.rank.impl.view;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.rank.api.a.b;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import f.a.t;
import h.f.b.l;
import java.util.concurrent.TimeUnit;

public final class LiveGiftBoostCountDownView extends LiveTextView {

    /* renamed from: a  reason: collision with root package name */
    public long f21018a;

    /* renamed from: b  reason: collision with root package name */
    private f.a.b.a f21019b = new f.a.b.a();

    static {
        Covode.recordClassIndex(12408);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21019b.a();
    }

    public final void setTimer(long j2) {
        this.f21018a = j2;
        if (j2 > com.bytedance.android.livesdk.utils.a.a.a()) {
            this.f21019b.a(t.a(1, TimeUnit.SECONDS).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new a(this)));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveGiftBoostCountDownView f21020a;

        static {
            Covode.recordClassIndex(12409);
        }

        a(LiveGiftBoostCountDownView liveGiftBoostCountDownView) {
            this.f21020a = liveGiftBoostCountDownView;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            long a2 = this.f21020a.f21018a - com.bytedance.android.livesdk.utils.a.a.a();
            long j2 = 0;
            if (a2 < 0) {
                com.bytedance.android.livesdk.an.a.a().a(new b());
            }
            long j3 = a2 / 1000;
            if (j3 >= 0) {
                j2 = j3;
            }
            long j4 = j2 % 60;
            long j5 = j2 / 60;
            StringBuffer stringBuffer = new StringBuffer();
            if (j5 > 99) {
                j5 = 99;
            }
            if (String.valueOf(j5).length() < 2) {
                stringBuffer.append("0");
            }
            stringBuffer.append(j5);
            stringBuffer.append(":");
            if (String.valueOf(j4).length() < 2) {
                stringBuffer.append("0");
            }
            stringBuffer.append(j4);
            this.f21020a.setText(stringBuffer.toString());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveGiftBoostCountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
    }
}
