package com.ss.android.ugc.aweme.ftc.widgets;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.shortvideo.widget.q;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import f.a.d.k;
import f.a.t;
import h.f.b.l;
import java.util.concurrent.TimeUnit;

public final class FTCChooseCoverView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public q f98909a;

    /* renamed from: b  reason: collision with root package name */
    public a f98910b;

    /* renamed from: c  reason: collision with root package name */
    public final f.a.l.c<MotionEvent> f98911c;

    /* renamed from: d  reason: collision with root package name */
    private int f98912d;

    /* renamed from: e  reason: collision with root package name */
    private RecyclerView f98913e;

    /* renamed from: f  reason: collision with root package name */
    private View f98914f;

    /* renamed from: g  reason: collision with root package name */
    private final t<MotionEvent> f98915g;

    /* renamed from: h  reason: collision with root package name */
    private final t<MotionEvent> f98916h;

    /* renamed from: i  reason: collision with root package name */
    private final t<MotionEvent> f98917i;

    /* renamed from: j  reason: collision with root package name */
    private final t<MotionEvent> f98918j;

    public interface a {
        static {
            Covode.recordClassIndex(62893);
        }

        void a(float f2);

        void b(float f2);

        void d();
    }

    static {
        Covode.recordClassIndex(62887);
    }

    public FTCChooseCoverView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final int getCoverSize() {
        return this.f98912d;
    }

    public final RecyclerView getRecyclerView() {
        return this.f98913e;
    }

    public final q getVideoCoverView() {
        return this.f98909a;
    }

    public final float getVideoCoverViewX() {
        return this.f98909a.getX();
    }

    public final float getOneThumbWidth() {
        return (float) (getMeasuredWidth() / this.f98912d);
    }

    private final float getOneThumbHeight() {
        return ((float) this.f98909a.getHeight()) - (n.b(getContext(), 2.0f) * 2.0f);
    }

    public final void setOnScrollListener(a aVar) {
        l.d(aVar, "");
        this.f98910b = aVar;
    }

    public final void setRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        this.f98913e = recyclerView;
    }

    public final void setVideoCoverView(q qVar) {
        l.d(qVar, "");
        this.f98909a = qVar;
    }

    public final void setAdapter(RecyclerView.a<RecyclerView.ViewHolder> aVar) {
        l.d(aVar, "");
        this.f98913e.setAdapter(aVar);
    }

    static final class b<T> implements k {

        /* renamed from: a  reason: collision with root package name */
        public static final b f98924a = new b();

        static {
            Covode.recordClassIndex(62894);
        }

        b() {
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            MotionEvent motionEvent = (MotionEvent) obj;
            l.d(motionEvent, "");
            if (motionEvent.getActionMasked() == 3) {
                return true;
            }
            return false;
        }
    }

    static final class c<T> implements k {

        /* renamed from: a  reason: collision with root package name */
        public static final c f98925a = new c();

        static {
            Covode.recordClassIndex(62895);
        }

        c() {
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            MotionEvent motionEvent = (MotionEvent) obj;
            l.d(motionEvent, "");
            if (motionEvent.getActionMasked() == 0) {
                return true;
            }
            return false;
        }
    }

    static final class d<T> implements k {

        /* renamed from: a  reason: collision with root package name */
        public static final d f98926a = new d();

        static {
            Covode.recordClassIndex(62896);
        }

        d() {
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            MotionEvent motionEvent = (MotionEvent) obj;
            l.d(motionEvent, "");
            if (motionEvent.getActionMasked() == 2) {
                return true;
            }
            return false;
        }
    }

    static final class e<T> implements k {

        /* renamed from: a  reason: collision with root package name */
        public static final e f98927a = new e();

        static {
            Covode.recordClassIndex(62897);
        }

        e() {
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            MotionEvent motionEvent = (MotionEvent) obj;
            l.d(motionEvent, "");
            if (motionEvent.getActionMasked() == 1) {
                return true;
            }
            return false;
        }
    }

    public final void a(float f2) {
        this.f98909a.animate().scaleX(f2).scaleY(f2).setDuration(100).start();
    }

    public final void setVideoCoverFrameView(Bitmap bitmap) {
        int i2;
        int i3;
        MethodCollector.i(12738);
        l.d(bitmap, "");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float oneThumbWidth = getOneThumbWidth();
        float oneThumbHeight = getOneThumbHeight();
        if (((float) height) * oneThumbWidth > ((float) width) * oneThumbHeight) {
            i2 = (int) oneThumbHeight;
            i3 = (width * i2) / height;
        } else {
            int i4 = (int) oneThumbWidth;
            i2 = (height * i4) / width;
            i3 = i4;
        }
        this.f98909a.setImageBitmap(Bitmap.createScaledBitmap(bitmap, i3, i2, true));
        MethodCollector.o(12738);
    }

    public final void a(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        if (x <= getOneThumbWidth() / 2.0f) {
            this.f98909a.setX(0.0f);
        } else if (x >= ((float) getMeasuredWidth()) - (getOneThumbWidth() / 2.0f)) {
            this.f98909a.setX(((float) getMeasuredWidth()) - getOneThumbWidth());
        } else {
            this.f98909a.setX(x - (getOneThumbWidth() / 2.0f));
        }
    }

    public final float b(MotionEvent motionEvent) {
        float x;
        float oneThumbWidth;
        float f2;
        if (motionEvent.getX() <= getOneThumbWidth() / 2.0f) {
            f2 = 0.0f;
        } else {
            if (motionEvent.getX() >= ((float) getMeasuredWidth()) - (getOneThumbWidth() / 2.0f)) {
                x = (float) getMeasuredWidth();
                oneThumbWidth = getOneThumbWidth();
            } else {
                x = motionEvent.getX();
                oneThumbWidth = getOneThumbWidth() / 2.0f;
            }
            f2 = x - oneThumbWidth;
        }
        float measuredWidth = f2 / (((float) getMeasuredWidth()) - getOneThumbWidth());
        if (measuredWidth > 0.9f) {
            return 0.9f;
        }
        return measuredWidth;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(12616);
        super.onMeasure(i2, i3);
        this.f98909a.a(getMeasuredWidth() / this.f98912d, getMeasuredHeight());
        MethodCollector.o(12616);
    }

    private /* synthetic */ FTCChooseCoverView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FTCChooseCoverView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(12741);
        this.f98912d = 7;
        RecyclerView recyclerView = new RecyclerView(context, attributeSet);
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setHasFixedSize(true);
        this.f98913e = recyclerView;
        q qVar = new q(context);
        qVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        qVar.setColor(androidx.core.content.b.c(context, R.color.bh));
        this.f98909a = qVar;
        View view = new View(context, attributeSet);
        view.setBackgroundResource(R.drawable.q2);
        this.f98914f = view;
        f.a.l.c<MotionEvent> cVar = new f.a.l.c<>();
        l.b(cVar, "");
        this.f98911c = cVar;
        t<MotionEvent> a2 = cVar.a(c.f98925a);
        this.f98915g = a2;
        t<MotionEvent> a3 = cVar.a(d.f98926a);
        this.f98916h = a3;
        t<MotionEvent> a4 = cVar.a(e.f98927a);
        this.f98917i = a4;
        t<MotionEvent> a5 = cVar.a(b.f98924a);
        this.f98918j = a5;
        addView(this.f98913e, new FrameLayout.LayoutParams(-1, -1));
        addView(this.f98914f, new FrameLayout.LayoutParams(-1, -1));
        addView(this.f98909a);
        setOnTouchListener(new View.OnTouchListener(this) {
            /* class com.ss.android.ugc.aweme.ftc.widgets.FTCChooseCoverView.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FTCChooseCoverView f98919a;

            static {
                Covode.recordClassIndex(62888);
            }

            {
                this.f98919a = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.f98919a.f98911c.onNext(motionEvent);
                return true;
            }
        });
        a2.a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new f(this) {
            /* class com.ss.android.ugc.aweme.ftc.widgets.FTCChooseCoverView.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FTCChooseCoverView f98920a;

            static {
                Covode.recordClassIndex(62889);
            }

            {
                this.f98920a = r1;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                MotionEvent motionEvent = (MotionEvent) obj;
                this.f98920a.a(1.2f);
                FTCChooseCoverView fTCChooseCoverView = this.f98920a;
                l.b(motionEvent, "");
                fTCChooseCoverView.a(motionEvent);
                a aVar = this.f98920a.f98910b;
                if (aVar != null) {
                    this.f98920a.b(motionEvent);
                    aVar.d();
                }
            }
        });
        a3.a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new f(this) {
            /* class com.ss.android.ugc.aweme.ftc.widgets.FTCChooseCoverView.AnonymousClass3 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FTCChooseCoverView f98921a;

            static {
                Covode.recordClassIndex(62890);
            }

            {
                this.f98921a = r1;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                MotionEvent motionEvent = (MotionEvent) obj;
                FTCChooseCoverView fTCChooseCoverView = this.f98921a;
                l.b(motionEvent, "");
                fTCChooseCoverView.a(motionEvent);
                a aVar = this.f98921a.f98910b;
                if (aVar != null) {
                    aVar.a(this.f98921a.b(motionEvent));
                }
            }
        });
        a4.d(200, TimeUnit.MILLISECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new f(this) {
            /* class com.ss.android.ugc.aweme.ftc.widgets.FTCChooseCoverView.AnonymousClass4 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FTCChooseCoverView f98922a;

            static {
                Covode.recordClassIndex(62891);
            }

            {
                this.f98922a = r1;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                MotionEvent motionEvent = (MotionEvent) obj;
                this.f98922a.a(1.0f);
                FTCChooseCoverView fTCChooseCoverView = this.f98922a;
                l.b(motionEvent, "");
                fTCChooseCoverView.a(motionEvent);
                a aVar = this.f98922a.f98910b;
                if (aVar != null) {
                    aVar.b(this.f98922a.b(motionEvent));
                }
            }
        });
        a5.a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new f(this) {
            /* class com.ss.android.ugc.aweme.ftc.widgets.FTCChooseCoverView.AnonymousClass5 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FTCChooseCoverView f98923a;

            static {
                Covode.recordClassIndex(62892);
            }

            {
                this.f98923a = r1;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                this.f98923a.a(1.0f);
            }
        });
        MethodCollector.o(12741);
    }
}
