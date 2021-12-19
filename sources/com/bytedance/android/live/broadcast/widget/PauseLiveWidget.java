package com.bytedance.android.live.broadcast.widget;

import android.os.CountDownTimer;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.c.r;
import com.bytedance.android.livesdk.j.co;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.Locale;
import java.util.Objects;

public final class PauseLiveWidget extends LiveWidget implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final b f8708b = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final c f8709a = new c(this);

    /* renamed from: c  reason: collision with root package name */
    private long f8710c;

    /* renamed from: d  reason: collision with root package name */
    private final View f8711d;

    /* access modifiers changed from: package-private */
    public enum a {
        ENTER_PAGE,
        GO_ON_LIVE,
        END_LIVE;

        static {
            Covode.recordClassIndex(4456);
        }
    }

    static {
        Covode.recordClassIndex(4455);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bh9;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(4457);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        p.c(this.f8711d);
    }

    @Override // com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        p.b(this.f8711d);
    }

    public static final class c extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PauseLiveWidget f8716a;

        static {
            Covode.recordClassIndex(4458);
        }

        public final void onFinish() {
            this.f8716a.a(a.END_LIVE);
            com.bytedance.android.livesdk.an.a.a().a(new r(17));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(PauseLiveWidget pauseLiveWidget) {
            super(300000, 1000);
            this.f8716a = pauseLiveWidget;
        }

        public final void onTick(long j2) {
            String valueOf;
            LiveTextView liveTextView;
            PauseLiveWidget pauseLiveWidget = this.f8716a;
            int i2 = (int) (j2 / 1000);
            int i3 = i2 % 60;
            StringBuilder append = new StringBuilder("0").append(i2 / 60).append(':');
            if (i3 < 10) {
                valueOf = "0".concat(String.valueOf(i3));
            } else {
                valueOf = String.valueOf(i3);
            }
            String sb = append.append(valueOf).toString();
            View view = pauseLiveWidget.getView();
            if (view != null && (liveTextView = (LiveTextView) view.findViewById(R.id.exx)) != null) {
                liveTextView.setText(sb);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        LiveButton liveButton;
        super.onCreate();
        View view = getView();
        if (view != null) {
            view.setOnClickListener(d.f8717a);
        }
        View view2 = getView();
        if (!(view2 == null || (liveButton = (LiveButton) view2.findViewById(R.id.y8)) == null)) {
            liveButton.setOnClickListener(new e(this));
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.a((m) this, co.class, (h.f.a.b) new f(this));
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final d f8717a = new d();

        static {
            Covode.recordClassIndex(4459);
        }

        d() {
        }

        public final void onClick(View view) {
            ao.a(y.e(), (int) R.string.dw7);
        }
    }

    public PauseLiveWidget(View view) {
        l.d(view, "");
        this.f8711d = view;
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PauseLiveWidget f8718a;

        static {
            Covode.recordClassIndex(4460);
        }

        e(PauseLiveWidget pauseLiveWidget) {
            this.f8718a = pauseLiveWidget;
        }

        public final void onClick(View view) {
            this.f8718a.dataChannel.b(co.class, (Object) false);
            this.f8718a.hide();
            this.f8718a.f8709a.cancel();
            this.f8718a.a(a.GO_ON_LIVE);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ PauseLiveWidget this$0;

        static {
            Covode.recordClassIndex(4461);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(PauseLiveWidget pauseLiveWidget) {
            super(1);
            this.this$0 = pauseLiveWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            if (bool.booleanValue() && !this.this$0.isShowing()) {
                this.this$0.show();
                this.this$0.f8709a.start();
                this.this$0.a(a.ENTER_PAGE);
            }
            return z.f158842a;
        }
    }

    public final void a(a aVar) {
        boolean z;
        long elapsedRealtime;
        int i2 = 0;
        if (aVar == a.ENTER_PAGE) {
            z = true;
            elapsedRealtime = 0;
            if (1 != 0) {
                this.f8710c = SystemClock.elapsedRealtime();
            }
            elapsedRealtime = (SystemClock.elapsedRealtime() - this.f8710c) / 1000;
        } else {
            z = false;
            elapsedRealtime = (SystemClock.elapsedRealtime() - this.f8710c) / 1000;
        }
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_live_pause_page").a(this.dataChannel);
        String aVar2 = aVar.toString();
        Locale locale = Locale.ENGLISH;
        l.b(locale, "");
        Objects.requireNonNull(aVar2, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = aVar2.toLowerCase(locale);
        l.b(lowerCase, "");
        com.bytedance.android.livesdk.ab.b a3 = a2.a("action_type", lowerCase);
        Integer num = (Integer) this.dataChannel.b(com.bytedance.android.livesdk.rank.api.e.class);
        if (num != null) {
            i2 = num.intValue();
        }
        com.bytedance.android.livesdk.ab.b a4 = a3.a("viewers_cnt", i2);
        if (!z) {
            a4.a("pause_duration", elapsedRealtime);
        }
        a4.b();
    }
}
