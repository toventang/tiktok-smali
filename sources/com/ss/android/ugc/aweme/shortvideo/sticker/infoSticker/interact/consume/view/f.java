package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.a.e;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k;
import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class f extends FrameLayout {

    /* renamed from: d  reason: collision with root package name */
    public static final a f130479d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    CountDownStickerStruct f130480a;

    /* renamed from: b  reason: collision with root package name */
    k f130481b;

    /* renamed from: c  reason: collision with root package name */
    ScheduledFuture<?> f130482c;

    /* renamed from: e  reason: collision with root package name */
    private TextView f130483e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f130484f;

    /* renamed from: g  reason: collision with root package name */
    private LinearLayout f130485g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f130486h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f130487i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f130488j;

    /* renamed from: k  reason: collision with root package name */
    private CountDownStickerItemView f130489k;

    /* renamed from: l  reason: collision with root package name */
    private CountDownStickerItemView f130490l;

    /* renamed from: m  reason: collision with root package name */
    private CountDownStickerItemView f130491m;
    private Aweme n;
    private ScheduledExecutorService o;

    static {
        Covode.recordClassIndex(85565);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85566);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static long a(CountDownStickerStruct countDownStickerStruct) {
            long j2 = 0;
            if (countDownStickerStruct == null || countDownStickerStruct.getMillSecond() - System.currentTimeMillis() <= 0) {
                return -1;
            }
            if (countDownStickerStruct != null) {
                j2 = countDownStickerStruct.getMillSecond() - System.currentTimeMillis();
            }
            return j2 / 1000;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.f$a$a  reason: collision with other inner class name */
        public static final class C3405a {

            /* renamed from: a  reason: collision with root package name */
            public final int f130492a;

            /* renamed from: b  reason: collision with root package name */
            public final int f130493b;

            /* renamed from: c  reason: collision with root package name */
            public final int f130494c;

            /* renamed from: d  reason: collision with root package name */
            public final int f130495d;

            static {
                Covode.recordClassIndex(85567);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3405a)) {
                    return false;
                }
                C3405a aVar = (C3405a) obj;
                return this.f130492a == aVar.f130492a && this.f130493b == aVar.f130493b && this.f130494c == aVar.f130494c && this.f130495d == aVar.f130495d;
            }

            public final int hashCode() {
                return (((((this.f130492a * 31) + this.f130493b) * 31) + this.f130494c) * 31) + this.f130495d;
            }

            public final String toString() {
                return "TimeData(day=" + this.f130492a + ", hour=" + this.f130493b + ", minute=" + this.f130494c + ", second=" + this.f130495d + ")";
            }

            public C3405a(int i2, int i3, int i4, int i5) {
                this.f130492a = i2;
                this.f130493b = i3;
                this.f130494c = i4;
                this.f130495d = i5;
            }
        }
    }

    public static abstract class b {
        static {
            Covode.recordClassIndex(85568);
        }

        private b() {
        }

        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f130496a = new a();

            private a() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(85569);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.f$b$b  reason: collision with other inner class name */
        public static final class C3406b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C3406b f130497a = new C3406b();

            private C3406b() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(85570);
            }
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final LinearLayout getStickerView() {
        return this.f130485g;
    }

    /* access modifiers changed from: package-private */
    public final long getCurrentTimeStamp() {
        return System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ScheduledFuture<?> scheduledFuture = this.f130482c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f130498a;

        static {
            Covode.recordClassIndex(85571);
        }

        c(f fVar) {
            this.f130498a = fVar;
        }

        public final void run() {
            Activity a2 = e.a(this.f130498a.getContext());
            if (a2 != null) {
                a2.runOnUiThread(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.f.c.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ c f130499a;

                    static {
                        Covode.recordClassIndex(85572);
                    }

                    {
                        this.f130499a = r1;
                    }

                    public final void run() {
                        long j2;
                        k kVar;
                        f fVar = this.f130499a.f130498a;
                        CountDownStickerStruct countDownStickerStruct = fVar.f130480a;
                        if (countDownStickerStruct != null) {
                            j2 = countDownStickerStruct.getMillSecond();
                        } else {
                            j2 = 0;
                        }
                        if (j2 > fVar.getCurrentTimeStamp()) {
                            fVar.a();
                            return;
                        }
                        k kVar2 = fVar.f130481b;
                        if (!(kVar2 == null || !kVar2.isVisible() || (kVar = fVar.f130481b) == null)) {
                            kVar.a((k.b) k.b.f.f130561a, false);
                        }
                        ScheduledFuture<?> scheduledFuture = fVar.f130482c;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        Long l2;
        CountDownStickerStruct countDownStickerStruct = this.f130480a;
        if (countDownStickerStruct != null) {
            l2 = Long.valueOf(countDownStickerStruct.getMillSecond());
        } else {
            l2 = null;
        }
        a.C3405a a2 = a(l2);
        if (a2.f130492a > 0) {
            a(b.a.f130496a);
            CountDownStickerItemView countDownStickerItemView = this.f130489k;
            if (countDownStickerItemView != null) {
                countDownStickerItemView.a(a2.f130492a / 10, a2.f130492a % 10);
            }
            CountDownStickerItemView countDownStickerItemView2 = this.f130490l;
            if (countDownStickerItemView2 != null) {
                countDownStickerItemView2.a(a2.f130493b / 10, a2.f130493b % 10);
            }
            CountDownStickerItemView countDownStickerItemView3 = this.f130491m;
            if (countDownStickerItemView3 != null) {
                countDownStickerItemView3.a(a2.f130494c / 10, a2.f130494c % 10);
                return;
            }
            return;
        }
        a(b.C3406b.f130497a);
        CountDownStickerItemView countDownStickerItemView4 = this.f130489k;
        if (countDownStickerItemView4 != null) {
            countDownStickerItemView4.a(a2.f130493b / 10, a2.f130493b % 10);
        }
        CountDownStickerItemView countDownStickerItemView5 = this.f130490l;
        if (countDownStickerItemView5 != null) {
            countDownStickerItemView5.a(a2.f130494c / 10, a2.f130494c % 10);
        }
        CountDownStickerItemView countDownStickerItemView6 = this.f130491m;
        if (countDownStickerItemView6 != null) {
            countDownStickerItemView6.a(a2.f130495d / 10, a2.f130495d % 10);
        }
    }

    public final void setFeedCountdownStickerDialogFragment(k kVar) {
        this.f130481b = kVar;
    }

    public final void setStickerView(LinearLayout linearLayout) {
        l.d(linearLayout, "");
        this.f130485g = linearLayout;
    }

    private static a.C3405a a(Long l2) {
        long j2;
        if (l2 != null) {
            j2 = l2.longValue() - System.currentTimeMillis();
        } else {
            j2 = 0;
        }
        long j3 = j2 % 86400000;
        long j4 = j3 % 3600000;
        return new a.C3405a((int) (j2 / 86400000), (int) (j3 / 3600000), (int) (j4 / 60000), (int) ((j4 % 60000) / 1000));
    }

    private final void a(b bVar) {
        if (l.a(bVar, b.a.f130496a)) {
            TextView textView = this.f130486h;
            if (textView != null) {
                textView.setText(getResources().getText(R.string.av5));
            }
            TextView textView2 = this.f130487i;
            if (textView2 != null) {
                textView2.setText(getResources().getText(R.string.ave));
            }
            TextView textView3 = this.f130488j;
            if (textView3 != null) {
                textView3.setText(getResources().getText(R.string.avf));
            }
        } else if (l.a(bVar, b.C3406b.f130497a)) {
            TextView textView4 = this.f130486h;
            if (textView4 != null) {
                textView4.setText(getResources().getText(R.string.ave));
            }
            TextView textView5 = this.f130487i;
            if (textView5 != null) {
                textView5.setText(getResources().getText(R.string.avf));
            }
            TextView textView6 = this.f130488j;
            if (textView6 != null) {
                textView6.setText(getResources().getText(R.string.avk));
            }
        }
    }

    public final void setCountDownStickerStruct(CountDownStickerStruct countDownStickerStruct) {
        this.f130480a = countDownStickerStruct;
        if (countDownStickerStruct == null) {
            this.f130480a = new CountDownStickerStruct(null, 0, 0, null, null, null, null, 127, null);
            Calendar instance = Calendar.getInstance(TimeZone.getDefault());
            l.b(instance, "");
            instance.set(2020, 11, 6, 19, 1, 1);
            CountDownStickerStruct countDownStickerStruct2 = this.f130480a;
            if (countDownStickerStruct2 != null) {
                countDownStickerStruct2.setExpiredTime(Long.valueOf(instance.getTimeInMillis() / 1000));
            }
            CountDownStickerStruct countDownStickerStruct3 = this.f130480a;
            if (countDownStickerStruct3 != null) {
                countDownStickerStruct3.setSubscribe(false);
            }
            CountDownStickerStruct countDownStickerStruct4 = this.f130480a;
            if (countDownStickerStruct4 != null) {
                countDownStickerStruct4.setSubscribeNum(500);
            }
            CountDownStickerStruct countDownStickerStruct5 = this.f130480a;
            if (countDownStickerStruct5 != null) {
                countDownStickerStruct5.setTitle("");
            }
            CountDownStickerStruct countDownStickerStruct6 = this.f130480a;
            if (countDownStickerStruct6 != null) {
                countDownStickerStruct6.setTextAlreadyExpired("");
            }
        }
    }

    public final void setData(CountDownStickerStruct countDownStickerStruct) {
        long j2;
        ScheduledFuture<?> scheduledFuture;
        if (countDownStickerStruct != null) {
            this.f130480a = countDownStickerStruct;
            TextView textView = this.f130484f;
            if (textView != null) {
                textView.setText(countDownStickerStruct.getTitle());
            }
            long currentTimeStamp = getCurrentTimeStamp();
            CountDownStickerStruct countDownStickerStruct2 = this.f130480a;
            if (countDownStickerStruct2 != null) {
                j2 = countDownStickerStruct2.getMillSecond();
            } else {
                j2 = 0;
            }
            if (currentTimeStamp <= j2) {
                a();
                if (this.o == null) {
                    this.o = g.d();
                }
                ScheduledExecutorService scheduledExecutorService = this.o;
                if (scheduledExecutorService != null) {
                    scheduledFuture = scheduledExecutorService.scheduleAtFixedRate(new c(this), 0, 1, TimeUnit.SECONDS);
                } else {
                    scheduledFuture = null;
                }
                this.f130482c = scheduledFuture;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Context context, Aweme aweme) {
        super(context);
        l.d(context, "");
        MethodCollector.i(5107);
        View a2 = com.a.a(LayoutInflater.from(getContext()), R.layout.bjb, this, false);
        if (a2 != null) {
            LinearLayout linearLayout = (LinearLayout) a2;
            this.f130485g = linearLayout;
            this.f130483e = (TextView) linearLayout.findViewById(R.id.exz);
            this.f130484f = (TextView) this.f130485g.findViewById(R.id.f2i);
            this.f130486h = (TextView) this.f130485g.findViewById(R.id.c9u);
            this.f130487i = (TextView) this.f130485g.findViewById(R.id.cmb);
            this.f130488j = (TextView) this.f130485g.findViewById(R.id.dne);
            this.f130489k = (CountDownStickerItemView) this.f130485g.findViewById(R.id.afw);
            this.f130490l = (CountDownStickerItemView) this.f130485g.findViewById(R.id.afx);
            this.f130491m = (CountDownStickerItemView) this.f130485g.findViewById(R.id.afy);
            TuxTextView tuxTextView = (TuxTextView) this.f130485g.findViewById(R.id.f67);
            if (tuxTextView != null) {
                tuxTextView.a(37.0f);
            }
            TuxTextView tuxTextView2 = (TuxTextView) this.f130485g.findViewById(R.id.f1p);
            if (tuxTextView2 != null) {
                tuxTextView2.a(37.0f);
            }
            addView(this.f130485g);
            this.n = aweme;
            MethodCollector.o(5107);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        MethodCollector.o(5107);
        throw nullPointerException;
    }
}
