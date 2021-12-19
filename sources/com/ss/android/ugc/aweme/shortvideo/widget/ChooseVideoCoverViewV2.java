package com.ss.android.ugc.aweme.shortvideo.widget;

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
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import f.a.d.k;
import f.a.t;
import h.f.b.l;
import java.util.concurrent.TimeUnit;

public final class ChooseVideoCoverViewV2 extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public q f132773a;

    /* renamed from: b  reason: collision with root package name */
    public a f132774b;

    /* renamed from: c  reason: collision with root package name */
    public final f.a.l.c<MotionEvent> f132775c;

    /* renamed from: d  reason: collision with root package name */
    private int f132776d;

    /* renamed from: e  reason: collision with root package name */
    private int f132777e;

    /* renamed from: f  reason: collision with root package name */
    private int f132778f;

    /* renamed from: g  reason: collision with root package name */
    private RecyclerView f132779g;

    /* renamed from: h  reason: collision with root package name */
    private View f132780h;

    /* renamed from: i  reason: collision with root package name */
    private final t<MotionEvent> f132781i;

    /* renamed from: j  reason: collision with root package name */
    private final t<MotionEvent> f132782j;

    /* renamed from: k  reason: collision with root package name */
    private final t<MotionEvent> f132783k;

    /* renamed from: l  reason: collision with root package name */
    private final t<MotionEvent> f132784l;

    public interface a {
        static {
            Covode.recordClassIndex(86887);
        }

        void a(float f2);

        void b(float f2);

        void c();
    }

    static {
        Covode.recordClassIndex(86881);
    }

    public ChooseVideoCoverViewV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final int getCoverSize() {
        return this.f132776d;
    }

    public final int getCurPage() {
        return this.f132778f;
    }

    public final int getItemCount() {
        return this.f132776d;
    }

    public final RecyclerView getRecyclerView() {
        return this.f132779g;
    }

    public final View getShadowView() {
        return this.f132780h;
    }

    public final int getTotalPage() {
        return this.f132777e;
    }

    public final q getVideoCoverView() {
        return this.f132773a;
    }

    public final RecyclerView.a<RecyclerView.ViewHolder> getAdapter() {
        return this.f132779g.getAdapter();
    }

    public final float getVideoCoverViewX() {
        return this.f132773a.getX();
    }

    public final float getOneThumbWidth() {
        return (float) (getMeasuredWidth() / (this.f132776d / this.f132777e));
    }

    private final float getOneThumbHeight() {
        return ((float) this.f132773a.getHeight()) - (n.b(getContext(), 2.0f) * 2.0f);
    }

    public final void setCurPage(int i2) {
        this.f132778f = i2;
    }

    public final void setItemCount(int i2) {
        this.f132776d = i2;
    }

    public final void setTotalPage(int i2) {
        this.f132777e = i2;
    }

    public final void setOnScrollListener(a aVar) {
        l.d(aVar, "");
        this.f132774b = aVar;
    }

    public final void setRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        this.f132779g = recyclerView;
    }

    public final void setShadowView(View view) {
        l.d(view, "");
        this.f132780h = view;
    }

    public final void setVideoCoverView(q qVar) {
        l.d(qVar, "");
        this.f132773a = qVar;
    }

    public final void setAdapter(RecyclerView.a<RecyclerView.ViewHolder> aVar) {
        l.d(aVar, "");
        this.f132779g.setAdapter(aVar);
    }

    static final class b<T> implements k {

        /* renamed from: a  reason: collision with root package name */
        public static final b f132790a = new b();

        static {
            Covode.recordClassIndex(86888);
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
        public static final c f132791a = new c();

        static {
            Covode.recordClassIndex(86889);
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
        public static final d f132792a = new d();

        static {
            Covode.recordClassIndex(86890);
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
        public static final e f132793a = new e();

        static {
            Covode.recordClassIndex(86891);
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
        this.f132773a.animate().scaleX(f2).scaleY(f2).setDuration(100).start();
    }

    public final void a(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        if (x <= getOneThumbWidth() / 2.0f) {
            this.f132773a.setX(0.0f);
        } else if (x >= ((float) getMeasuredWidth()) - (getOneThumbWidth() / 2.0f)) {
            this.f132773a.setX(((float) getMeasuredWidth()) - getOneThumbWidth());
        } else {
            this.f132773a.setX(x - (getOneThumbWidth() / 2.0f));
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
            measuredWidth = 0.9f;
        }
        return (1.0f / ((float) this.f132777e)) * (((float) this.f132778f) + measuredWidth);
    }

    public final void setVideoCoverFrameView(Bitmap bitmap) {
        int i2;
        int i3;
        MethodCollector.i(8353);
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
        q qVar = this.f132773a;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i3, i2, true);
        int min = Math.min(i3, i2);
        int i5 = (int) ((((float) min) * oneThumbHeight) / oneThumbWidth);
        int max = Math.max((i3 - min) / 2, 0);
        int max2 = Math.max((i2 - i5) / 2, 0);
        if (max + min > i3 || max2 + i5 > i2) {
            qVar.setImageBitmap(createScaledBitmap);
            MethodCollector.o(8353);
            return;
        }
        androidx.core.graphics.drawable.b a2 = androidx.core.graphics.drawable.d.a(qVar.getResources(), Bitmap.createBitmap(createScaledBitmap, max, max2, min, i5));
        a2.a(n.b(qVar.getContext(), 4.0f));
        qVar.setImageDrawable(a2);
        MethodCollector.o(8353);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(8330);
        super.onMeasure(i2, i3);
        this.f132773a.a(getMeasuredWidth() / (this.f132776d / this.f132777e), getMeasuredHeight());
        MethodCollector.o(8330);
    }

    private /* synthetic */ ChooseVideoCoverViewV2(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ChooseVideoCoverViewV2(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(8370);
        this.f132776d = 7;
        this.f132777e = 1;
        RecyclerView recyclerView = new RecyclerView(context, attributeSet);
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setHasFixedSize(true);
        this.f132779g = recyclerView;
        q qVar = new q(context);
        qVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        qVar.setColor(androidx.core.content.b.c(context, R.color.bh));
        this.f132773a = qVar;
        View view = new View(context, attributeSet);
        view.setBackgroundResource(R.drawable.q2);
        this.f132780h = view;
        f.a.l.c<MotionEvent> cVar = new f.a.l.c<>();
        l.b(cVar, "");
        this.f132775c = cVar;
        t<MotionEvent> a2 = cVar.a(c.f132791a);
        this.f132781i = a2;
        t<MotionEvent> a3 = cVar.a(d.f132792a);
        this.f132782j = a3;
        t<MotionEvent> a4 = cVar.a(e.f132793a);
        this.f132783k = a4;
        t<MotionEvent> a5 = cVar.a(b.f132790a);
        this.f132784l = a5;
        addView(this.f132779g, new FrameLayout.LayoutParams(-1, -1));
        addView(this.f132780h, new FrameLayout.LayoutParams(-1, -1));
        addView(this.f132773a);
        setOnTouchListener(new View.OnTouchListener(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ChooseVideoCoverViewV2 f132785a;

            static {
                Covode.recordClassIndex(86882);
            }

            {
                this.f132785a = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.f132785a.f132775c.onNext(motionEvent);
                return true;
            }
        });
        a2.a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new f(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ChooseVideoCoverViewV2 f132786a;

            static {
                Covode.recordClassIndex(86883);
            }

            {
                this.f132786a = r1;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                MotionEvent motionEvent = (MotionEvent) obj;
                this.f132786a.a(1.2f);
                ChooseVideoCoverViewV2 chooseVideoCoverViewV2 = this.f132786a;
                l.b(motionEvent, "");
                chooseVideoCoverViewV2.a(motionEvent);
                a aVar = this.f132786a.f132774b;
                if (aVar != null) {
                    this.f132786a.b(motionEvent);
                    aVar.c();
                }
            }
        });
        a3.a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new f(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2.AnonymousClass3 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ChooseVideoCoverViewV2 f132787a;

            static {
                Covode.recordClassIndex(86884);
            }

            {
                this.f132787a = r1;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                MotionEvent motionEvent = (MotionEvent) obj;
                ChooseVideoCoverViewV2 chooseVideoCoverViewV2 = this.f132787a;
                l.b(motionEvent, "");
                chooseVideoCoverViewV2.a(motionEvent);
                a aVar = this.f132787a.f132774b;
                if (aVar != null) {
                    aVar.a(this.f132787a.b(motionEvent));
                }
            }
        });
        a4.d(200, TimeUnit.MILLISECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new f(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2.AnonymousClass4 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ChooseVideoCoverViewV2 f132788a;

            static {
                Covode.recordClassIndex(86885);
            }

            {
                this.f132788a = r1;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                MotionEvent motionEvent = (MotionEvent) obj;
                this.f132788a.a(1.0f);
                ChooseVideoCoverViewV2 chooseVideoCoverViewV2 = this.f132788a;
                l.b(motionEvent, "");
                chooseVideoCoverViewV2.a(motionEvent);
                a aVar = this.f132788a.f132774b;
                if (aVar != null) {
                    aVar.b(this.f132788a.b(motionEvent));
                }
            }
        });
        a5.a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new f(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2.AnonymousClass5 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ChooseVideoCoverViewV2 f132789a;

            static {
                Covode.recordClassIndex(86886);
            }

            {
                this.f132789a = r1;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                this.f132789a.a(1.0f);
            }
        });
        MethodCollector.o(8370);
    }
}
