package com.bytedance.creativex.filter.view.widget;

import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class a extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public static final String f28036a = a.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public TextView f28037b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f28038c;

    /* renamed from: d  reason: collision with root package name */
    public float f28039d;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f28040e;

    /* renamed from: f  reason: collision with root package name */
    private RunnableC0594a f28041f;

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    static {
        Covode.recordClassIndex(16420);
    }

    /* renamed from: com.bytedance.creativex.filter.view.widget.a$a  reason: collision with other inner class name */
    class RunnableC0594a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        CharSequence f28044a;

        /* renamed from: b  reason: collision with root package name */
        CharSequence f28045b;

        /* renamed from: c  reason: collision with root package name */
        boolean f28046c;

        static {
            Covode.recordClassIndex(16423);
        }

        public final void run() {
            float f2;
            TextView textView;
            TextView textView2;
            float f3;
            if (a.this.f28037b != null && a.this.f28038c != null) {
                a.this.animate().cancel();
                a.this.f28037b.animate().cancel();
                a.this.f28038c.animate().cancel();
                a aVar = a.this;
                aVar.removeCallbacks(aVar.f28040e);
                a.this.setAlpha(1.0f);
                a.this.setVisibility(0);
                if (this.f28046c) {
                    f2 = a.this.f28039d;
                } else {
                    f2 = 0.0f;
                }
                if (this.f28046c) {
                    textView = a.this.f28037b;
                } else {
                    textView = a.this.f28038c;
                }
                if (this.f28046c) {
                    textView2 = a.this.f28038c;
                } else {
                    textView2 = a.this.f28037b;
                }
                if (this.f28046c) {
                    f3 = 0.0f;
                } else {
                    f3 = a.this.f28039d;
                }
                textView.setTranslationX(f3);
                textView2.setTranslationX(f3);
                textView.setAlpha(1.0f);
                textView2.setAlpha(0.0f);
                textView.setText(this.f28044a);
                textView2.setText(this.f28045b);
                textView.animate().translationX(f2).alpha(0.0f).withEndAction(new Runnable() {
                    /* class com.bytedance.creativex.filter.view.widget.a.RunnableC0594a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(16424);
                    }

                    public final void run() {
                        a.this.postDelayed(a.this.f28040e, 600);
                    }
                }).setDuration(300).start();
                textView2.animate().translationX(f2).alpha(1.0f).setDuration(300).start();
            }
        }

        public RunnableC0594a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
            this.f28044a = charSequence;
            this.f28045b = charSequence2;
            this.f28046c = z;
        }
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    public a(Context context) {
        this(context, (byte) 0);
    }

    private a(Context context, byte b2) {
        this(context, (char) 0);
    }

    private a(Context context, char c2) {
        super(context, null, 0);
        MethodCollector.i(7240);
        this.f28040e = new Runnable() {
            /* class com.bytedance.creativex.filter.view.widget.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(16421);
            }

            public final void run() {
                a.this.animate().alpha(0.0f).withEndAction(new Runnable() {
                    /* class com.bytedance.creativex.filter.view.widget.a.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(16422);
                    }

                    public final void run() {
                        a.this.setVisibility(8);
                    }
                }).setDuration(300).start();
            }
        };
        inflate(getContext(), R.layout.b4f, this);
        this.f28037b = (TextView) findViewById(R.id.b3w);
        this.f28038c = (TextView) findViewById(R.id.dwm);
        this.f28037b.setAlpha(1.0f);
        this.f28038c.setAlpha(1.0f);
        this.f28038c.setVisibility(0);
        this.f28037b.setVisibility(0);
        MethodCollector.o(7240);
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        RunnableC0594a aVar = new RunnableC0594a(charSequence, charSequence2, z);
        if (this.f28039d != 0.0f) {
            aVar.run();
        } else {
            this.f28041f = aVar;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        MethodCollector.i(7248);
        super.onLayout(z, i2, i3, i4, i5);
        TextView textView = this.f28037b;
        if (!(textView == null || this.f28038c == null)) {
            this.f28039d = textView.getX() - this.f28038c.getX();
        }
        RunnableC0594a aVar = this.f28041f;
        if (aVar != null) {
            aVar.run();
            this.f28041f = null;
        }
        MethodCollector.o(7248);
    }
}
