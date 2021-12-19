package com.ss.android.ugc.aweme.feed.ui.seekbar.b;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.a.b.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.q.al;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar;
import com.ss.android.ugc.aweme.feed.ui.seekbar.a.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    public static final C2288a f95079c = new C2288a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public al f95080a;

    /* renamed from: b  reason: collision with root package name */
    public e f95081b;

    /* renamed from: d  reason: collision with root package name */
    private e f95082d;

    /* renamed from: e  reason: collision with root package name */
    private SparseArray f95083e;

    static {
        Covode.recordClassIndex(60274);
    }

    public final View a(int i2) {
        if (this.f95083e == null) {
            this.f95083e = new SparseArray();
        }
        View view = (View) this.f95083e.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f95083e.put(i2, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.b.a$a  reason: collision with other inner class name */
    public static final class C2288a {
        static {
            Covode.recordClassIndex(60275);
        }

        private C2288a() {
        }

        public /* synthetic */ C2288a(byte b2) {
            this();
        }
    }

    public final e getSt() {
        return this.f95082d;
    }

    public final VideoSeekBar getVideoSeekBar() {
        return (VideoSeekBar) a(R.id.fh7);
    }

    public final void setSt(e eVar) {
        this.f95082d = eVar;
    }

    public static final class b extends ViewPager.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f95084a;

        static {
            Covode.recordClassIndex(60276);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b(a aVar) {
            this.f95084a = aVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.h, androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
            if (i2 == 0) {
                this.f95084a.setVisibility(0);
            } else {
                this.f95084a.setVisibility(8);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        this(context, (byte) 0);
        l.d(context, "");
    }

    public final void setLiveMode(boolean z) {
        if (z) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private a(Context context, byte b2) {
        this(context, (char) 0);
        l.d(context, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context, char c2) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(7043);
        setClipChildren(false);
        if (context != null) {
            c.a((Activity) context, R.layout.wz, this, true);
            ((TuxTextView) a(R.id.ahp)).a(32.0f);
            ((TuxTextView) a(R.id.ept)).a(32.0f);
            MethodCollector.o(7043);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        MethodCollector.o(7043);
        throw nullPointerException;
    }
}
