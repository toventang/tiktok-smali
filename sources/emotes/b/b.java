package emotes.b;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import emotes.a.e;
import h.f.b.l;

public final class b {

    /* renamed from: l  reason: collision with root package name */
    public static final a f157099l = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public float f157100a;

    /* renamed from: b  reason: collision with root package name */
    public long f157101b;

    /* renamed from: c  reason: collision with root package name */
    public long f157102c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f157103d = true;

    /* renamed from: e  reason: collision with root package name */
    public long f157104e;

    /* renamed from: f  reason: collision with root package name */
    public int f157105f = -1;

    /* renamed from: g  reason: collision with root package name */
    public final Handler f157106g = new Handler(Looper.getMainLooper());

    /* renamed from: h  reason: collision with root package name */
    public float f157107h;

    /* renamed from: i  reason: collision with root package name */
    public float f157108i;

    /* renamed from: j  reason: collision with root package name */
    public e f157109j;

    /* renamed from: k  reason: collision with root package name */
    public int f157110k = 5;

    /* renamed from: m  reason: collision with root package name */
    private View f157111m;

    static {
        Covode.recordClassIndex(104325);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(104326);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: emotes.b.b$b  reason: collision with other inner class name */
    public static final class RunnableC4152b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f157112a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f157113b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f157114c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ EmoteModel f157115d;

        static {
            Covode.recordClassIndex(104327);
        }

        public RunnableC4152b(b bVar, View view, int i2, EmoteModel emoteModel) {
            this.f157112a = bVar;
            this.f157113b = view;
            this.f157114c = i2;
            this.f157115d = emoteModel;
        }

        public final void run() {
            b bVar = this.f157112a;
            bVar.a(bVar.f157107h, this.f157113b, this.f157114c, this.f157115d);
        }
    }

    public final void a(float f2, View view, int i2, EmoteModel emoteModel) {
        View view2;
        if (this.f157105f != i2 && System.currentTimeMillis() - this.f157104e > 500 && Math.abs(f2 - this.f157100a) < 20.0f) {
            this.f157103d = false;
            this.f157106g.removeCallbacksAndMessages(null);
        }
        int i3 = this.f157105f;
        if (!(i3 < 0 || i2 == i3 || (view2 = this.f157111m) == null)) {
            view2.setBackground(new ColorDrawable(0));
        }
        if (!this.f157103d) {
            View findViewById = view.findViewById(R.id.bwm);
            if (emoteModel.f7391h != null) {
                Context context = view.getContext();
                l.b(context, "");
                a(i2, emoteModel, findViewById, context);
            }
        }
    }

    private final void a(int i2, EmoteModel emoteModel, View view, Context context) {
        int i3;
        MethodCollector.i(1051);
        if (this.f157105f == i2 || view == null) {
            MethodCollector.o(1051);
            return;
        }
        this.f157105f = i2;
        this.f157111m = view;
        int a2 = (int) i.a.a.a.a.b.a(126.0f);
        int i4 = i2 % this.f157110k;
        View inflate = LayoutInflater.from(context).inflate(R.layout.bbk, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.c2c);
        l.b(imageView, "");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (i4 == 0) {
                marginLayoutParams.setMarginStart(y.a(25.0f));
            } else if (i4 == this.f157110k - 1) {
                marginLayoutParams.setMarginStart(y.a(67.0f));
            } else {
                marginLayoutParams.setMarginStart(y.a(46.0f));
            }
            imageView.setLayoutParams(marginLayoutParams);
            e eVar = this.f157109j;
            if (eVar == null || !eVar.isShowing()) {
                this.f157109j = new e();
            } else {
                e eVar2 = this.f157109j;
                if (eVar2 == null) {
                    l.b();
                }
                eVar2.dismiss();
            }
            e eVar3 = this.f157109j;
            if (eVar3 != null) {
                eVar3.a(inflate, context, (int) i.a.a.a.a.b.a(126.0f), (int) i.a.a.a.a.b.a(130.0f));
            }
            e eVar4 = this.f157109j;
            if (eVar4 != null) {
                eVar4.f157092a = 0;
            }
            if (i4 == this.f157110k - 1) {
                i3 = -(a2 - view.getWidth());
            } else {
                i3 = (-(a2 - view.getWidth())) / 2;
            }
            View findViewById = inflate.findViewById(R.id.by4);
            l.b(findViewById, "");
            HSImageView hSImageView = (HSImageView) findViewById;
            if (emoteModel.f7391h != null) {
                e eVar5 = this.f157109j;
                if (eVar5 == null) {
                    l.b();
                }
                eVar5.a(view, i3);
                p.a(hSImageView, emoteModel.f7391h, 0);
                e eVar6 = this.f157109j;
                if (eVar6 == null) {
                    l.b();
                }
                eVar6.update((int) i.a.a.a.a.b.a(126.0f), (int) i.a.a.a.a.b.a(130.0f));
            }
            MethodCollector.o(1051);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        MethodCollector.o(1051);
        throw nullPointerException;
    }
}
