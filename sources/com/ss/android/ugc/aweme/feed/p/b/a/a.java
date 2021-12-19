package com.ss.android.ugc.aweme.feed.p.b.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.feed.p.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public static final C2273a f93642b = new C2273a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final FrameLayout f93643a;

    /* renamed from: c  reason: collision with root package name */
    private final View f93644c;

    static {
        Covode.recordClassIndex(59587);
    }

    public a(Context context, char c2) {
        this(context, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.p.b.a.a$a  reason: collision with other inner class name */
    public static final class C2273a {
        static {
            Covode.recordClassIndex(59588);
        }

        private C2273a() {
        }

        public /* synthetic */ C2273a(byte b2) {
            this();
        }
    }

    public final FrameLayout getContent() {
        return this.f93643a;
    }

    public final View getRoot() {
        return this.f93644c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(9061);
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.a0c, this, true);
        this.f93644c = a2;
        FrameLayout frameLayout = (FrameLayout) a2.findViewById(R.id.d32);
        this.f93643a = frameLayout;
        if (b.a()) {
            View a3 = com.a.a(LayoutInflater.from(getContext()), R.layout.aip, frameLayout, true);
            View findViewById = a3.findViewById(R.id.dp0);
            ImageView imageView = (ImageView) a3.findViewById(R.id.by0);
            TextView textView = (TextView) a3.findViewById(R.id.exf);
            l.b(imageView, "");
            imageView.setVisibility(8);
            l.b(textView, "");
            textView.setText(getContext().getString(R.string.de8));
            findViewById.setBackgroundColor(androidx.core.content.b.c(getContext(), R.color.as));
            l.b(findViewById, "");
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams != null) {
                ((LinearLayout.LayoutParams) layoutParams).setMargins(0, ((int) n.b(getContext(), 52.0f)) + n.e(getContext()), 0, 0);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                MethodCollector.o(9061);
                throw nullPointerException;
            }
        }
        MethodCollector.o(9061);
    }

    private /* synthetic */ a(Context context, byte b2) {
        this(context);
    }
}
