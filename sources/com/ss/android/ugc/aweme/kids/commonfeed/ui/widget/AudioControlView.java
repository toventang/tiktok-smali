package com.ss.android.ugc.aweme.kids.commonfeed.ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.h.v;
import b.i;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

public class AudioControlView extends View {

    /* renamed from: a  reason: collision with root package name */
    int f106251a;

    /* renamed from: b  reason: collision with root package name */
    int f106252b;

    /* renamed from: c  reason: collision with root package name */
    public b f106253c;

    /* renamed from: d  reason: collision with root package name */
    public ValueAnimator f106254d;

    /* renamed from: e  reason: collision with root package name */
    public a f106255e;

    /* renamed from: f  reason: collision with root package name */
    volatile boolean f106256f;

    /* renamed from: g  reason: collision with root package name */
    private Paint f106257g;

    /* renamed from: h  reason: collision with root package name */
    private int f106258h;

    /* renamed from: i  reason: collision with root package name */
    private float f106259i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f106260j;

    /* renamed from: k  reason: collision with root package name */
    private HandlerThread f106261k;

    public interface b {
        static {
            Covode.recordClassIndex(67941);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(67937);
    }

    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        final WeakReference<AudioControlView> f106264a;

        /* renamed from: b  reason: collision with root package name */
        int f106265b;

        /* renamed from: c  reason: collision with root package name */
        int f106266c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f106267d;

        /* renamed from: e  reason: collision with root package name */
        private AudioManager f106268e;

        /* renamed from: f  reason: collision with root package name */
        private int f106269f;

        static {
            Covode.recordClassIndex(67940);
        }

        private void b() {
            d();
            c();
        }

        private void c() {
            i.b(new a(this), i.f4826c);
        }

        private void a() {
            try {
                this.f106266c = this.f106268e.getStreamVolume(3);
                com.ss.android.ugc.aweme.framework.a.a.b(4, "VoiceAdjust", "currentVolume(syncCurrentVolume) = " + this.f106266c);
            } catch (NullPointerException e2) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                this.f106267d = true;
            }
        }

        private void d() {
            try {
                com.ss.android.ugc.aweme.framework.a.a.b(4, "VoiceAdjust", "currentVolume(setVolume) = " + this.f106266c);
                this.f106268e.setStreamVolume(3, this.f106266c, 8);
            } catch (SecurityException e2) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            }
        }

        public final void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                com.ss.android.ugc.aweme.framework.a.a.a(4, "VoiceAdjust", "initVolume");
                int streamMaxVolume = this.f106268e.getStreamMaxVolume(3);
                this.f106265b = streamMaxVolume;
                int i3 = streamMaxVolume / 15;
                this.f106269f = i3;
                if (i3 == 0) {
                    this.f106269f = 1;
                }
                a();
            } else if (i2 == 2) {
                com.ss.android.ugc.aweme.framework.a.a.a(4, "VoiceAdjust", "execAddVolume");
                a();
                int i4 = this.f106266c + this.f106269f;
                this.f106266c = i4;
                int i5 = this.f106265b;
                if (i4 > i5) {
                    this.f106266c = i5;
                }
                b();
            } else if (i2 == 3) {
                com.ss.android.ugc.aweme.framework.a.a.a(4, "VoiceAdjust", "execCutVolume");
                a();
                int i6 = this.f106266c - this.f106269f;
                this.f106266c = i6;
                if (i6 < 0) {
                    this.f106266c = 0;
                }
                b();
            }
        }

        private a(Looper looper, AudioControlView audioControlView) {
            super(looper);
            this.f106264a = new WeakReference<>(audioControlView);
            this.f106268e = (AudioManager) a(audioControlView.getContext(), DataType.AUDIO);
            sendEmptyMessage(1);
        }

        private static Object a(Context context, String str) {
            Object obj;
            MethodCollector.i(7000);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                    try {
                        new com.bytedance.platform.godzilla.b.b.b().a();
                        com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                        obj = context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = context.getSystemService(str);
            } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = context.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                            } catch (Exception e2) {
                                d.a(e2, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                    } finally {
                        MethodCollector.o(7000);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }

        /* synthetic */ a(Looper looper, AudioControlView audioControlView, byte b2) {
            this(looper, audioControlView);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f106256f = false;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        ValueAnimator valueAnimator = this.f106254d;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f106254d.cancel();
            this.f106254d = null;
        }
    }

    public final void a() {
        if (this.f106261k == null) {
            HandlerThread handlerThread = new HandlerThread("Audio-Api-Thread");
            this.f106261k = handlerThread;
            handlerThread.start();
            this.f106255e = new a(this.f106261k.getLooper(), this, (byte) 0);
        }
    }

    public ObjectAnimator getHideVolumeAnim() {
        return ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 0.0f).setDuration(0L);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        this.f106253c = null;
        HandlerThread handlerThread = this.f106261k;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f106261k = null;
            this.f106255e = null;
        }
        this.f106256f = true;
    }

    public ObjectAnimator getShowVolumeAnim() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 1.0f).setDuration(150L);
        duration.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.AudioControlView.AnonymousClass2 */

            static {
                Covode.recordClassIndex(67939);
            }

            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                AudioControlView.this.a();
            }
        });
        return duration;
    }

    public void setOnAudioControlViewHideListener(b bVar) {
        this.f106253c = bVar;
    }

    public void setProgress(float f2) {
        this.f106259i = f2;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void setForegroundColor(int i2) {
        this.f106258h = i2;
        this.f106257g.setColor(i2);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.i(6862);
        super.onDraw(canvas);
        if (this.f106260j) {
            int i2 = this.f106251a;
            int i3 = this.f106252b;
            canvas.drawLine((float) i2, (float) (i3 / 2), ((float) i2) - (((float) i2) * this.f106259i), (float) (i3 / 2), this.f106257g);
            MethodCollector.o(6862);
            return;
        }
        int i4 = this.f106252b;
        canvas.drawLine(0.0f, (float) (i4 / 2), ((float) this.f106251a) * this.f106259i, (float) (i4 / 2), this.f106257g);
        MethodCollector.o(6862);
    }

    public AudioControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(6713);
        super.onMeasure(i2, i3);
        this.f106251a = getMeasuredWidth();
        this.f106252b = getMeasuredHeight();
        boolean z = true;
        if (v.e(this) != 1) {
            z = false;
        }
        this.f106260j = z;
        MethodCollector.o(6713);
    }

    private AudioControlView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(6638);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.jd, R.attr.uw});
        this.f106258h = obtainStyledAttributes.getColor(1, androidx.core.content.b.c(context, R.color.nq));
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f106257g = paint;
        paint.setAntiAlias(true);
        this.f106257g.setColor(this.f106258h);
        this.f106257g.setStyle(Paint.Style.FILL);
        this.f106257g.setStrokeWidth(2.0f);
        MethodCollector.o(6638);
    }
}
