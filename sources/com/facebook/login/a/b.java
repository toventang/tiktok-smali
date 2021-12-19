package com.facebook.login.a;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f48881a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<View> f48882b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f48883c;

    /* renamed from: d  reason: collision with root package name */
    private a f48884d;

    /* renamed from: e  reason: collision with root package name */
    private PopupWindow f48885e;

    /* renamed from: f  reason: collision with root package name */
    private EnumC1190b f48886f = EnumC1190b.BLUE;

    /* renamed from: g  reason: collision with root package name */
    private long f48887g = 6000;

    /* renamed from: h  reason: collision with root package name */
    private final ViewTreeObserver.OnScrollChangedListener f48888h = new ViewTreeObserver.OnScrollChangedListener() {
        /* class com.facebook.login.a.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(29466);
        }

        public final void onScrollChanged() {
            if (b.a(b.this).get() != null && b.b(b.this) != null && b.b(b.this).isShowing()) {
                if (b.b(b.this).isAboveAnchor()) {
                    b.c(b.this).b();
                } else {
                    b.c(b.this).a();
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(29465);
    }

    /* access modifiers changed from: package-private */
    public class a extends FrameLayout {

        /* renamed from: a  reason: collision with root package name */
        public ImageView f48892a = ((ImageView) findViewById(R.id.a94));

        /* renamed from: b  reason: collision with root package name */
        public ImageView f48893b = ((ImageView) findViewById(R.id.a92));

        /* renamed from: c  reason: collision with root package name */
        public View f48894c = findViewById(R.id.a8v);

        /* renamed from: d  reason: collision with root package name */
        public ImageView f48895d = ((ImageView) findViewById(R.id.a8w));

        static {
            Covode.recordClassIndex(29469);
        }

        public final void a() {
            this.f48892a.setVisibility(0);
            this.f48893b.setVisibility(4);
        }

        public final void b() {
            this.f48892a.setVisibility(4);
            this.f48893b.setVisibility(0);
        }

        public a(Context context) {
            super(context);
            MethodCollector.i(4372);
            LayoutInflater.from(getContext()).inflate(R.layout.nf, this);
            MethodCollector.o(4372);
        }
    }

    /* renamed from: com.facebook.login.a.b$b  reason: collision with other inner class name */
    public enum EnumC1190b {
        BLUE,
        BLACK;

        static {
            Covode.recordClassIndex(29470);
        }
    }

    private void c() {
        if (!com.facebook.internal.a.b.a.a(this)) {
            try {
                PopupWindow popupWindow = this.f48885e;
                if (popupWindow != null && popupWindow.isShowing()) {
                    if (this.f48885e.isAboveAnchor()) {
                        this.f48884d.b();
                    } else {
                        this.f48884d.a();
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, this);
            }
        }
    }

    private void d() {
        if (!com.facebook.internal.a.b.a.a(this)) {
            try {
                e();
                if (this.f48882b.get() != null) {
                    this.f48882b.get().getViewTreeObserver().addOnScrollChangedListener(this.f48888h);
                }
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, this);
            }
        }
    }

    private void e() {
        if (!com.facebook.internal.a.b.a.a(this)) {
            try {
                if (this.f48882b.get() != null) {
                    this.f48882b.get().getViewTreeObserver().removeOnScrollChangedListener(this.f48888h);
                }
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, this);
            }
        }
    }

    public final void b() {
        if (!com.facebook.internal.a.b.a.a(this)) {
            try {
                e();
                PopupWindow popupWindow = this.f48885e;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                }
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, this);
            }
        }
    }

    public final void a() {
        if (!com.facebook.internal.a.b.a.a(this)) {
            try {
                if (this.f48882b.get() != null) {
                    a aVar = new a(this.f48883c);
                    this.f48884d = aVar;
                    ((TextView) aVar.findViewById(R.id.a93)).setText(this.f48881a);
                    if (this.f48886f == EnumC1190b.BLUE) {
                        this.f48884d.f48894c.setBackgroundResource(2131231606);
                        this.f48884d.f48893b.setImageResource(2131231607);
                        this.f48884d.f48892a.setImageResource(2131231608);
                        this.f48884d.f48895d.setImageResource(2131231609);
                    } else {
                        this.f48884d.f48894c.setBackgroundResource(2131231602);
                        this.f48884d.f48893b.setImageResource(2131231603);
                        this.f48884d.f48892a.setImageResource(2131231604);
                        this.f48884d.f48895d.setImageResource(2131231605);
                    }
                    View decorView = ((Activity) this.f48883c).getWindow().getDecorView();
                    int width = decorView.getWidth();
                    int height = decorView.getHeight();
                    d();
                    this.f48884d.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
                    a aVar2 = this.f48884d;
                    PopupWindow popupWindow = new PopupWindow(aVar2, aVar2.getMeasuredWidth(), this.f48884d.getMeasuredHeight());
                    this.f48885e = popupWindow;
                    popupWindow.showAsDropDown(this.f48882b.get());
                    c();
                    if (this.f48887g > 0) {
                        this.f48884d.postDelayed(new Runnable() {
                            /* class com.facebook.login.a.b.AnonymousClass2 */

                            static {
                                Covode.recordClassIndex(29467);
                            }

                            public final void run() {
                                if (!com.facebook.internal.a.b.a.a(this)) {
                                    try {
                                        b.this.b();
                                    } catch (Throwable th) {
                                        com.facebook.internal.a.b.a.a(th, this);
                                    }
                                }
                            }
                        }, this.f48887g);
                    }
                    this.f48885e.setTouchable(true);
                    this.f48884d.setOnClickListener(new View.OnClickListener() {
                        /* class com.facebook.login.a.b.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(29468);
                        }

                        public final void onClick(View view) {
                            if (!com.facebook.internal.a.b.a.a(this)) {
                                try {
                                    b.this.b();
                                } catch (Throwable th) {
                                    com.facebook.internal.a.b.a.a(th, this);
                                }
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, this);
            }
        }
    }

    public final void a(long j2) {
        if (!com.facebook.internal.a.b.a.a(this)) {
            try {
                this.f48887g = j2;
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, this);
            }
        }
    }

    static /* synthetic */ WeakReference a(b bVar) {
        if (com.facebook.internal.a.b.a.a(b.class)) {
            return null;
        }
        try {
            return bVar.f48882b;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, b.class);
            return null;
        }
    }

    static /* synthetic */ PopupWindow b(b bVar) {
        if (com.facebook.internal.a.b.a.a(b.class)) {
            return null;
        }
        try {
            return bVar.f48885e;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, b.class);
            return null;
        }
    }

    static /* synthetic */ a c(b bVar) {
        if (com.facebook.internal.a.b.a.a(b.class)) {
            return null;
        }
        try {
            return bVar.f48884d;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, b.class);
            return null;
        }
    }

    public final void a(EnumC1190b bVar) {
        if (!com.facebook.internal.a.b.a.a(this)) {
            try {
                this.f48886f = bVar;
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, this);
            }
        }
    }

    public b(String str, View view) {
        this.f48881a = str;
        this.f48882b = new WeakReference<>(view);
        this.f48883c = view.getContext();
    }
}
