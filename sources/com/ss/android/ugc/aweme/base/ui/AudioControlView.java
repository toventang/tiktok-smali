package com.ss.android.ugc.aweme.base.ui;

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
    int f68265a;

    /* renamed from: b  reason: collision with root package name */
    int f68266b;

    /* renamed from: c  reason: collision with root package name */
    public b f68267c;

    /* renamed from: d  reason: collision with root package name */
    public ValueAnimator f68268d;

    /* renamed from: e  reason: collision with root package name */
    public a f68269e;

    /* renamed from: f  reason: collision with root package name */
    volatile boolean f68270f;

    /* renamed from: g  reason: collision with root package name */
    private Paint f68271g;

    /* renamed from: h  reason: collision with root package name */
    private int f68272h;

    /* renamed from: i  reason: collision with root package name */
    private float f68273i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f68274j;

    /* renamed from: k  reason: collision with root package name */
    private HandlerThread f68275k;

    public interface b {
        static {
            Covode.recordClassIndex(42050);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(42046);
    }

    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        final WeakReference<AudioControlView> f68278a;

        /* renamed from: b  reason: collision with root package name */
        int f68279b;

        /* renamed from: c  reason: collision with root package name */
        int f68280c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f68281d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f68282e;

        /* renamed from: f  reason: collision with root package name */
        private AudioManager f68283f;

        /* renamed from: g  reason: collision with root package name */
        private int f68284g;

        static {
            Covode.recordClassIndex(42049);
        }

        private void b() {
            d();
            c();
        }

        private void c() {
            i.b(new c(this), i.f4826c);
        }

        private void a() {
            try {
                this.f68280c = this.f68283f.getStreamVolume(3);
                com.ss.android.ugc.aweme.framework.a.a.b(4, "VoiceAdjust", "currentVolume(syncCurrentVolume) = " + this.f68280c);
            } catch (NullPointerException e2) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                this.f68281d = true;
            }
        }

        private void d() {
            try {
                if (this.f68282e) {
                    com.ss.android.ugc.aweme.framework.a.a.b(4, "VoiceAdjust", "currentVolume(setVolume) = " + this.f68280c);
                    this.f68283f.setStreamVolume(3, this.f68280c, 8);
                }
            } catch (SecurityException e2) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            }
        }

        public final void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                com.ss.android.ugc.aweme.framework.a.a.a(4, "VoiceAdjust", "initVolume");
                int streamMaxVolume = this.f68283f.getStreamMaxVolume(3);
                this.f68279b = streamMaxVolume;
                int i3 = streamMaxVolume / 15;
                this.f68284g = i3;
                if (i3 == 0) {
                    this.f68284g = 1;
                }
                a();
            } else if (i2 == 2) {
                com.ss.android.ugc.aweme.framework.a.a.a(4, "VoiceAdjust", "execAddVolume");
                a();
                int i4 = this.f68280c + this.f68284g;
                this.f68280c = i4;
                int i5 = this.f68279b;
                if (i4 > i5) {
                    this.f68280c = i5;
                }
                b();
            } else if (i2 == 3) {
                com.ss.android.ugc.aweme.framework.a.a.a(4, "VoiceAdjust", "execCutVolume");
                a();
                int i6 = this.f68280c - this.f68284g;
                this.f68280c = i6;
                if (i6 < 0) {
                    this.f68280c = 0;
                }
                b();
            }
        }

        private a(Looper looper, AudioControlView audioControlView) {
            super(looper);
            this.f68282e = true;
            this.f68278a = new WeakReference<>(audioControlView);
            this.f68283f = (AudioManager) a(audioControlView.getContext(), DataType.AUDIO);
            sendEmptyMessage(1);
        }

        private static Object a(Context context, String str) {
            Object obj;
            MethodCollector.i(8801);
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
                        MethodCollector.o(8801);
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
        this.f68270f = false;
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        ValueAnimator valueAnimator = this.f68268d;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f68268d.cancel();
            this.f68268d = null;
        }
    }

    public final boolean e() {
        a aVar = this.f68269e;
        if (aVar != null) {
            return aVar.f68281d;
        }
        return false;
    }

    public final void a() {
        if (this.f68275k == null) {
            HandlerThread handlerThread = new HandlerThread("Audio-Api-Thread");
            this.f68275k = handlerThread;
            handlerThread.start();
            this.f68269e = new a(this.f68275k.getLooper(), this, (byte) 0);
        }
    }

    public final void b() {
        a();
        com.ss.android.ugc.aweme.framework.a.a.a(4, "VoiceAdjust", "cutVolume");
        this.f68269e.sendEmptyMessage(3);
    }

    public final void c() {
        a();
        com.ss.android.ugc.aweme.framework.a.a.a(4, "VoiceAdjust", "addVolume");
        this.f68269e.sendEmptyMessage(2);
    }

    public ObjectAnimator getHideVolumeAnim() {
        return ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 0.0f).setDuration(0L);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        this.f68267c = null;
        HandlerThread handlerThread = this.f68275k;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f68275k = null;
            this.f68269e = null;
        }
        this.f68270f = true;
    }

    public ObjectAnimator getShowVolumeAnim() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 1.0f).setDuration(150L);
        duration.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.ugc.aweme.base.ui.AudioControlView.AnonymousClass2 */

            static {
                Covode.recordClassIndex(42048);
            }

            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                AudioControlView.this.a();
            }
        });
        return duration;
    }

    public void setOnAudioControlViewHideListener(b bVar) {
        this.f68267c = bVar;
    }

    public void setProgress(float f2) {
        this.f68273i = f2;
    }

    public AudioControlView(Context context) {
        this(context, null);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void setForegroundColor(int i2) {
        this.f68272h = i2;
        this.f68271g.setColor(i2);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.i(8827);
        super.onDraw(canvas);
        if (this.f68274j) {
            int i2 = this.f68265a;
            int i3 = this.f68266b;
            canvas.drawLine((float) i2, (float) (i3 / 2), ((float) i2) - (((float) i2) * this.f68273i), (float) (i3 / 2), this.f68271g);
            MethodCollector.o(8827);
            return;
        }
        int i4 = this.f68266b;
        canvas.drawLine(0.0f, (float) (i4 / 2), ((float) this.f68265a) * this.f68273i, (float) (i4 / 2), this.f68271g);
        MethodCollector.o(8827);
    }

    public AudioControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(8825);
        super.onMeasure(i2, i3);
        this.f68265a = getMeasuredWidth();
        this.f68266b = getMeasuredHeight();
        boolean z = true;
        if (v.e(this) != 1) {
            z = false;
        }
        this.f68274j = z;
        MethodCollector.o(8825);
    }

    private AudioControlView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(8821);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.jd, R.attr.uw});
        this.f68272h = obtainStyledAttributes.getColor(1, androidx.core.content.b.c(context, R.color.nq));
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f68271g = paint;
        paint.setAntiAlias(true);
        this.f68271g.setColor(this.f68272h);
        this.f68271g.setStyle(Paint.Style.FILL);
        this.f68271g.setStrokeWidth(2.0f);
        MethodCollector.o(8821);
    }
}
