package com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed;

import android.content.Context;
import android.graphics.Outline;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class VideoImageMixedView extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public static final b f129431b = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f129432a;

    /* renamed from: c  reason: collision with root package name */
    private View f129433c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f129434d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f129435e;

    static {
        Covode.recordClassIndex(84969);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(84972);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoImageMixedView f129439a;

        static {
            Covode.recordClassIndex(84974);
        }

        d(VideoImageMixedView videoImageMixedView) {
            this.f129439a = videoImageMixedView;
        }

        public final void run() {
            VideoImageMixedView.a(this.f129439a).setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoImageMixedView f129440a;

        static {
            Covode.recordClassIndex(84975);
        }

        e(VideoImageMixedView videoImageMixedView) {
            this.f129440a = videoImageMixedView;
        }

        public final void run() {
            VideoImageMixedView.a(this.f129440a).setVisibility(8);
        }
    }

    public final RecyclerView getMediaSelectRecyclerView() {
        RecyclerView recyclerView = this.f129432a;
        if (recyclerView == null) {
            l.a("mediaSelectRecyclerView");
        }
        return recyclerView;
    }

    public final TextView getSureTextView() {
        TextView textView = this.f129434d;
        if (textView == null) {
            l.a("sureTextView");
        }
        return textView;
    }

    final class c extends ViewOutlineProvider {
        static {
            Covode.recordClassIndex(84973);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public c() {
        }

        public final void getOutline(View view, Outline outline) {
            l.d(view, "");
            l.d(outline, "");
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
        }
    }

    final class a extends LinearLayoutManager {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoImageMixedView f129436a;

        static {
            Covode.recordClassIndex(84970);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedView$a$a  reason: collision with other inner class name */
        final class C3371a extends r {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ a f129437f;

            static {
                Covode.recordClassIndex(84971);
            }

            @Override // androidx.recyclerview.widget.r
            public final float a(DisplayMetrics displayMetrics) {
                l.d(displayMetrics, "");
                return 200.0f / ((float) displayMetrics.densityDpi);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3371a(a aVar, Context context) {
                super(context);
                l.d(context, "");
                this.f129437f = aVar;
            }

            @Override // androidx.recyclerview.widget.r
            public final int a(int i2, int i3, int i4, int i5, int i6) {
                return (i4 + ((i5 - i4) / 2)) - (i2 + ((i3 - i2) / 2));
            }
        }

        public a(VideoImageMixedView videoImageMixedView, Context context) {
            l.d(context, "");
            this.f129436a = videoImageMixedView;
            b(0);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
        public final void a(RecyclerView recyclerView, RecyclerView.s sVar, int i2) {
            l.d(recyclerView, "");
            Context context = recyclerView.getContext();
            l.b(context, "");
            C3371a aVar = new C3371a(this, context);
            aVar.f3862g = i2;
            a(aVar);
        }
    }

    public static final /* synthetic */ RecyclerView a(VideoImageMixedView videoImageMixedView) {
        RecyclerView recyclerView = videoImageMixedView.f129432a;
        if (recyclerView == null) {
            l.a("mediaSelectRecyclerView");
        }
        return recyclerView;
    }

    public final void a(int i2) {
        View view;
        if (i2 >= 0) {
            RecyclerView recyclerView = this.f129432a;
            if (recyclerView == null) {
                l.a("mediaSelectRecyclerView");
            }
            RecyclerView.ViewHolder f2 = recyclerView.f(i2);
            if (f2 != null) {
                view = f2.itemView;
            } else {
                view = null;
            }
            int i3 = 0;
            if (view == null) {
                RecyclerView recyclerView2 = this.f129432a;
                if (recyclerView2 == null) {
                    l.a("mediaSelectRecyclerView");
                }
                int i4 = i2 - 1;
                if (i4 > 0) {
                    i3 = i4;
                }
                recyclerView2.b(i3);
                return;
            }
            RecyclerView recyclerView3 = this.f129432a;
            if (recyclerView3 == null) {
                l.a("mediaSelectRecyclerView");
            }
            int i5 = i2 - 1;
            if (i5 > 0) {
                i3 = i5;
            }
            recyclerView3.d(i3);
        }
    }

    public final void a(boolean z) {
        q.d("VideoImageMixedView showOrHideMediaRecyclerView ".concat(String.valueOf(z)));
        if (z) {
            RecyclerView recyclerView = this.f129432a;
            if (recyclerView == null) {
                l.a("mediaSelectRecyclerView");
            }
            recyclerView.postDelayed(new d(this), 250);
            return;
        }
        RecyclerView recyclerView2 = this.f129432a;
        if (recyclerView2 == null) {
            l.a("mediaSelectRecyclerView");
        }
        recyclerView2.post(new e(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoImageMixedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        MethodCollector.i(11276);
        View inflate = LayoutInflater.from(context).inflate(R.layout.aj4, this);
        l.b(inflate, "");
        this.f129433c = inflate;
        if (inflate == null) {
            l.a("contentRootView");
        }
        View findViewById = inflate.findViewById(R.id.ef_);
        l.b(findViewById, "");
        this.f129434d = (TextView) findViewById;
        View view = this.f129433c;
        if (view == null) {
            l.a("contentRootView");
        }
        View findViewById2 = view.findViewById(R.id.fgg);
        l.b(findViewById2, "");
        this.f129435e = (TextView) findViewById2;
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new c());
            setClipToOutline(true);
            setElevation(com.ss.android.ttve.utils.b.b(context, 16.0f));
        }
        MethodCollector.o(11276);
    }

    public final void a(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            TextView textView = this.f129435e;
            if (textView == null) {
                l.a("hintTextView");
            }
            textView.setText(str);
        } else if (z) {
            TextView textView2 = this.f129435e;
            if (textView2 == null) {
                l.a("hintTextView");
            }
            textView2.setText("");
        }
    }
}
