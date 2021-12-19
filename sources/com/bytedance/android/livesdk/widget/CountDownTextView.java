package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.utils.an;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;

public final class CountDownTextView extends LiveTextView {

    /* renamed from: a  reason: collision with root package name */
    public f.a.b.b f22471a;

    /* renamed from: b  reason: collision with root package name */
    public a f22472b;

    public static abstract class a {
        static {
            Covode.recordClassIndex(13266);
        }

        public void a(TextView textView) {
            l.d(textView, "");
        }
    }

    static {
        Covode.recordClassIndex(13265);
    }

    public CountDownTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        f.a.b.b bVar;
        super.onDetachedFromWindow();
        f.a.b.b bVar2 = this.f22471a;
        if (bVar2 != null && !bVar2.isDisposed() && (bVar = this.f22471a) != null) {
            bVar.dispose();
        }
    }

    public final void setCountDownListener(a aVar) {
        l.d(aVar, "");
        this.f22472b = aVar;
    }

    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f22477a = new c();

        static {
            Covode.recordClassIndex(13268);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.core.c.a.b(((Throwable) obj).toString());
        }
    }

    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CountDownTextView f22473a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f22474b = R.string.gr2;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f22475c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f22476d;

        static {
            Covode.recordClassIndex(13267);
        }

        public b(CountDownTextView countDownTextView, long j2) {
            this.f22473a = countDownTextView;
            this.f22475c = j2;
            this.f22476d = 0;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            a aVar;
            Long l2 = (Long) obj;
            if (!(l2 == null || l2.longValue() != 0 || this.f22473a.f22472b == null)) {
                l.d(this.f22473a, "");
            }
            CountDownTextView countDownTextView = this.f22473a;
            Resources resources = countDownTextView.getResources();
            int i2 = this.f22474b;
            long j2 = this.f22475c;
            l.b(l2, "");
            countDownTextView.setText(resources.getString(i2, an.a(j2 - l2.longValue())));
            if (this.f22473a.f22472b != null) {
                CountDownTextView countDownTextView2 = this.f22473a;
                l2.longValue();
                l.d(countDownTextView2, "");
            }
            if (l2.longValue() == this.f22475c - this.f22476d && (aVar = this.f22473a.f22472b) != null) {
                aVar.a(this.f22473a);
            }
        }
    }

    private /* synthetic */ CountDownTextView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CountDownTextView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
    }
}
