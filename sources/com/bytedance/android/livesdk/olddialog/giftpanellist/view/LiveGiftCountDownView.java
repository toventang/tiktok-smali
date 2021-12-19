package com.bytedance.android.livesdk.olddialog.giftpanellist.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.firstrecharge.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.util.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class LiveGiftCountDownView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private LiveTextView f20088a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f20089b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private final int f20090c = 60;

    /* renamed from: d  reason: collision with root package name */
    private final int f20091d = 3600;

    static {
        Covode.recordClassIndex(11863);
    }

    public final void b() {
        this.f20089b.postDelayed(new a(this), 1000);
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveGiftCountDownView f20092a;

        static {
            Covode.recordClassIndex(11864);
        }

        a(LiveGiftCountDownView liveGiftCountDownView) {
            this.f20092a = liveGiftCountDownView;
        }

        public final void run() {
            long a2 = d.u.f17737e - (com.bytedance.android.livesdk.utils.a.a.a() / 1000);
            if (a2 >= 0) {
                this.f20092a.b();
                this.f20092a.setTimeText(a2);
            }
        }
    }

    public final void a() {
        long a2 = d.u.f17737e - (com.bytedance.android.livesdk.utils.a.a.a() / 1000);
        com.a.a(LayoutInflater.from(getContext()), R.layout.bej, this, true);
        LiveTextView liveTextView = (LiveTextView) findViewById(R.id.eld);
        this.f20088a = liveTextView;
        if (liveTextView != null) {
            liveTextView.setTypeface(b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g));
        }
        LiveTextView liveTextView2 = this.f20088a;
        if (liveTextView2 != null) {
            liveTextView2.setText(a(a2));
        }
        b();
    }

    public final void setTimeText(long j2) {
        LiveTextView liveTextView = this.f20088a;
        if (liveTextView != null) {
            liveTextView.setText(a(j2));
        }
    }

    private final String a(long j2) {
        StringBuilder sb = new StringBuilder();
        long j3 = j2 / ((long) this.f20091d);
        String valueOf = String.valueOf(j3);
        if (valueOf.length() <= 1) {
            sb.append("0");
        }
        sb.append(valueOf);
        sb.append(":");
        long j4 = (j2 - (((long) this.f20091d) * j3)) / ((long) this.f20090c);
        String valueOf2 = String.valueOf(j4);
        if (valueOf2.length() <= 1) {
            sb.append("0");
        }
        sb.append(valueOf2);
        sb.append(":");
        String valueOf3 = String.valueOf((j2 - (j3 * ((long) this.f20091d))) - (j4 * ((long) this.f20090c)));
        if (valueOf3.length() <= 1) {
            sb.append("0");
        }
        sb.append(valueOf3);
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveGiftCountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
        MethodCollector.i(10426);
        MethodCollector.o(10426);
    }
}
