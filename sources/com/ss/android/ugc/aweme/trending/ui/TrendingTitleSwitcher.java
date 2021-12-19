package com.ss.android.ugc.aweme.trending.ui;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextSwitcher;
import android.widget.ViewSwitcher;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.search.l;
import com.zhiliaoapp.musically.R;
import h.h;
import h.i;
import h.z;
import java.lang.ref.WeakReference;
import java.util.List;

public final class TrendingTitleSwitcher implements au {

    /* renamed from: g  reason: collision with root package name */
    private static final a f141090g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    int f141091a;

    /* renamed from: b  reason: collision with root package name */
    public final TextSwitcher f141092b;

    /* renamed from: c  reason: collision with root package name */
    final m f141093c;

    /* renamed from: d  reason: collision with root package name */
    final List<l> f141094d;

    /* renamed from: e  reason: collision with root package name */
    private final h f141095e = i.a((h.f.a.a) new c(this));

    /* renamed from: f  reason: collision with root package name */
    private final h.f.a.m<String, Integer, z> f141096f;

    /* access modifiers changed from: package-private */
    public static final class b extends Handler {

        /* renamed from: b  reason: collision with root package name */
        private static final a f141097b = new a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<TrendingTitleSwitcher> f141098a;

        static {
            Covode.recordClassIndex(92111);
        }

        static final class a {
            static {
                Covode.recordClassIndex(92112);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        public final void a() {
            if (!hasMessages(101)) {
                removeMessages(101);
                sendEmptyMessageDelayed(101, 3000);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(TrendingTitleSwitcher trendingTitleSwitcher) {
            super(Looper.getMainLooper());
            h.f.b.l.d(trendingTitleSwitcher, "");
            this.f141098a = new WeakReference<>(trendingTitleSwitcher);
        }

        public final void handleMessage(Message message) {
            h.f.b.l.d(message, "");
            if (message.what == 101) {
                TrendingTitleSwitcher trendingTitleSwitcher = this.f141098a.get();
                if (trendingTitleSwitcher != null) {
                    int i2 = 0;
                    if (trendingTitleSwitcher.f141091a + 1 >= trendingTitleSwitcher.f141094d.size()) {
                        trendingTitleSwitcher.f141091a = 0;
                    } else {
                        trendingTitleSwitcher.f141091a++;
                        i2 = trendingTitleSwitcher.f141091a;
                    }
                    trendingTitleSwitcher.a(i2, true);
                }
                sendEmptyMessageDelayed(101, 3000);
            }
        }
    }

    static {
        Covode.recordClassIndex(92109);
    }

    /* access modifiers changed from: package-private */
    public final b a() {
        return (b) this.f141095e.getValue();
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_START) {
            onStart();
        } else if (aVar == i.a.ON_STOP) {
            onStop();
        }
    }

    static final class a {
        static {
            Covode.recordClassIndex(92110);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<b> {
        final /* synthetic */ TrendingTitleSwitcher this$0;

        static {
            Covode.recordClassIndex(92113);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(TrendingTitleSwitcher trendingTitleSwitcher) {
            super(0);
            this.this$0 = trendingTitleSwitcher;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            return new b(this.this$0);
        }
    }

    @v(a = i.a.ON_START)
    public final void onStart() {
        a().a();
    }

    @v(a = i.a.ON_STOP)
    public final void onStop() {
        a().removeCallbacksAndMessages(null);
    }

    static final class d implements ViewSwitcher.ViewFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TrendingTitleSwitcher f141099a;

        static {
            Covode.recordClassIndex(92114);
        }

        d(TrendingTitleSwitcher trendingTitleSwitcher) {
            this.f141099a = trendingTitleSwitcher;
        }

        public final View makeView() {
            Context context = this.f141099a.f141092b.getContext();
            Context context2 = this.f141099a.f141092b.getContext();
            h.f.b.l.b(context2, "");
            TuxTextView tuxTextView = new TuxTextView(context2, null, 0, 6);
            tuxTextView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            tuxTextView.setMaxLines(1);
            tuxTextView.setGravity(8388611);
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            tuxTextView.setTextDirection(2);
            tuxTextView.setTextAlignment(5);
            tuxTextView.setTextColor(androidx.core.content.b.c(context, R.color.a9));
            tuxTextView.setTuxFont(62);
            return tuxTextView;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, boolean z) {
        int size = this.f141094d.size();
        if (i2 >= 0 && size > i2) {
            String trendingName = this.f141094d.get(i2).getTrendingName();
            if (z) {
                this.f141092b.setText(trendingName);
            } else {
                this.f141092b.setCurrentText(trendingName);
            }
            h.f.a.m<String, Integer, z> mVar = this.f141096f;
            if (mVar != null) {
                if (trendingName == null) {
                    trendingName = "";
                }
                mVar.invoke(trendingName, Integer.valueOf(i2));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.m<? super java.lang.String, ? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public TrendingTitleSwitcher(TextSwitcher textSwitcher, m mVar, List<l> list, h.f.a.m<? super String, ? super Integer, z> mVar2) {
        h.f.b.l.d(textSwitcher, "");
        h.f.b.l.d(list, "");
        this.f141092b = textSwitcher;
        this.f141093c = mVar;
        this.f141094d = list;
        this.f141096f = mVar2;
    }
}
