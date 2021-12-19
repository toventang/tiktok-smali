package com.ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.p;

public class ChooseVideoCoverView extends FrameLayout implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private int f132752a;

    /* renamed from: b  reason: collision with root package name */
    private RecyclerView f132753b;

    /* renamed from: c  reason: collision with root package name */
    private q f132754c;

    /* renamed from: d  reason: collision with root package name */
    private Context f132755d;

    /* renamed from: e  reason: collision with root package name */
    private float f132756e;

    /* renamed from: f  reason: collision with root package name */
    private float f132757f;

    /* renamed from: g  reason: collision with root package name */
    private View f132758g;

    /* renamed from: h  reason: collision with root package name */
    private View f132759h;

    /* renamed from: i  reason: collision with root package name */
    private FrameLayout.LayoutParams f132760i;

    /* renamed from: j  reason: collision with root package name */
    private FrameLayout.LayoutParams f132761j;

    /* renamed from: k  reason: collision with root package name */
    private int f132762k;

    /* renamed from: l  reason: collision with root package name */
    private int f132763l;

    /* renamed from: m  reason: collision with root package name */
    private b f132764m;

    public interface b {
        static {
            Covode.recordClassIndex(86880);
        }
    }

    static {
        Covode.recordClassIndex(86877);
    }

    public int getCoverSize() {
        return this.f132752a;
    }

    public int getFrameHeight() {
        return this.f132763l;
    }

    public int getFrameWidth() {
        return this.f132762k;
    }

    public static class a extends RecyclerView.a<C3438a> {

        /* renamed from: a  reason: collision with root package name */
        p f132765a;

        /* renamed from: b  reason: collision with root package name */
        p[] f132766b;

        /* renamed from: c  reason: collision with root package name */
        boolean f132767c = true;

        /* renamed from: d  reason: collision with root package name */
        f.a.b.b f132768d;

        /* renamed from: e  reason: collision with root package name */
        private int f132769e;

        /* renamed from: f  reason: collision with root package name */
        private int f132770f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f132771g;

        static {
            Covode.recordClassIndex(86878);
        }

        /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ C3438a onCreateViewHolder(ViewGroup viewGroup, int i2) {
            return a(this, viewGroup, i2);
        }

        public final void b() {
            this.f132768d.dispose();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final int getItemCount() {
            return this.f132765a.f132955a;
        }

        public final void a() {
            this.f132768d = this.f132765a.a().d(new d(this));
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView$a$a  reason: collision with other inner class name */
        public static class C3438a extends RecyclerView.ViewHolder {

            /* renamed from: a  reason: collision with root package name */
            public ImageView f132772a;

            static {
                Covode.recordClassIndex(86879);
            }

            public C3438a(View view) {
                super(view);
                this.f132772a = (ImageView) view.findViewById(R.id.c22);
            }
        }

        public final void a(boolean z) {
            if (this.f132771g ^ z) {
                this.f132771g = z;
                notifyDataSetChanged();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(C3438a aVar, int i2) {
            p pVar;
            Bitmap bitmap;
            int i3;
            C3438a aVar2 = aVar;
            int itemCount = getItemCount();
            if (this.f132771g && (itemCount - i2) - 1 >= 0 && i3 < itemCount) {
                i2 = i3;
            }
            p pVar2 = this.f132766b[i2];
            if ((pVar2 == null || (bitmap = (Bitmap) pVar2.getSecond()) == null || bitmap.isRecycled()) && ((pVar = this.f132766b[0]) == null || (bitmap = (Bitmap) pVar.getSecond()) == null || bitmap.isRecycled())) {
                bitmap = null;
            }
            aVar2.f132772a.setImageBitmap(bitmap);
            aVar2.f132772a.setPadding(0, 0, 0, 0);
        }

        public a(p pVar, int i2, int i3) {
            this.f132765a = pVar;
            this.f132769e = i2;
            this.f132770f = i3;
            this.f132766b = new p[pVar.f132955a];
            a();
        }

        private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
            boolean a2;
            MethodCollector.i(8150);
            ImageView imageView = (ImageView) com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b3r, viewGroup, false);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = aVar.f132770f;
            layoutParams.width = aVar.f132769e;
            imageView.setLayoutParams(layoutParams);
            C3438a aVar2 = new C3438a(imageView);
            try {
                if (aVar2.itemView.getParent() != null) {
                    try {
                        a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a2) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                        com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) aVar2.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(aVar2.itemView);
                        }
                    }
                }
            } catch (Exception e2) {
                ai.a(e2);
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
            gg.f143005a = aVar2.getClass().getName();
            MethodCollector.o(8150);
            return aVar2;
        }
    }

    public RecyclerView.a getAdapter() {
        return this.f132753b.getAdapter();
    }

    public float getOneThumbWidth() {
        return (float) (getMeasuredWidth() / this.f132752a);
    }

    public final void a() {
        q qVar = this.f132754c;
        if (qVar != null) {
            qVar.setOnTouchListener(null);
            this.f132754c.setVisibility(8);
        }
    }

    public float getOneThumbHeight() {
        return ((float) this.f132754c.getHeight()) - (n.b(getContext(), 2.0f) * 2.0f);
    }

    public void setCoverSize(int i2) {
        this.f132752a = i2;
    }

    public void setOnScrollListener(b bVar) {
        this.f132764m = bVar;
    }

    private void b(float f2) {
        if (this.f132764m != null) {
            a(f2);
        }
    }

    private void c(float f2) {
        if (this.f132764m != null) {
            a(f2);
        }
    }

    private void d(float f2) {
        if (this.f132764m != null) {
            a(f2);
        }
    }

    public void setAdapter(RecyclerView.a aVar) {
        this.f132753b.setAdapter(aVar);
    }

    public void setLayoutManager(RecyclerView.i iVar) {
        this.f132753b.setLayoutManager(iVar);
    }

    private float a(float f2) {
        return f2 / ((float) (this.f132754c.getWidth() * this.f132752a));
    }

    private void b(MotionEvent motionEvent) {
        float a2 = a(motionEvent);
        this.f132754c.animate().x(a2).y(this.f132754c.getY()).setDuration(0).start();
        e(a2);
        d(a2);
    }

    private void e(float f2) {
        this.f132760i.width = (int) (f2 - 0.0f);
        this.f132758g.setLayoutParams(this.f132760i);
        this.f132761j.width = (int) ((((float) getMeasuredWidth()) - f2) + ((float) this.f132754c.getWidth()));
        this.f132759h.setX(f2 + ((float) this.f132754c.getWidth()));
        this.f132759h.setLayoutParams(this.f132761j);
    }

    public void setVideoCoverFrameView(Bitmap bitmap) {
        MethodCollector.i(8597);
        if (bitmap == null) {
            MethodCollector.o(8597);
            return;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int oneThumbWidth = (int) getOneThumbWidth();
        int oneThumbHeight = (int) getOneThumbHeight();
        int i2 = height * oneThumbWidth;
        int i3 = width * oneThumbHeight;
        if (i2 > i3) {
            oneThumbWidth = i3 / height;
        } else {
            oneThumbHeight = i2 / width;
        }
        this.f132754c.setImageBitmap(Bitmap.createScaledBitmap(bitmap, oneThumbWidth, oneThumbHeight, true));
        MethodCollector.o(8597);
    }

    private float a(MotionEvent motionEvent) {
        this.f132756e = (float) ((ViewGroup) getParent()).getPaddingLeft();
        this.f132757f = (float) getPaddingLeft();
        float rawX = (this.f132757f + (motionEvent.getRawX() - this.f132756e)) - (((float) this.f132754c.getWidth()) / 2.0f);
        if (rawX > ((float) (this.f132754c.getWidth() * (this.f132752a - 1)))) {
            rawX = (float) (this.f132754c.getWidth() * (this.f132752a - 1));
        }
        if (rawX < 0.0f) {
            return 0.0f;
        }
        return rawX;
    }

    public ChooseVideoCoverView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(8374);
        super.onMeasure(i2, i3);
        this.f132754c.a(getMeasuredWidth() / this.f132752a, getMeasuredHeight());
        e(this.f132754c.getX());
        MethodCollector.o(8374);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        String str = (String) view.getTag();
        if (str == null) {
            return false;
        }
        if (str.equals("tag_VideoCoverFrameView")) {
            int action = motionEvent.getAction();
            if (action == 0) {
                b(a(motionEvent));
            } else if (action == 1) {
                c(a(motionEvent));
            } else if (action == 2) {
                b(motionEvent);
            }
            return true;
        } else if (!str.equals("tag_RecyclerView")) {
            return super.onTouchEvent(motionEvent);
        } else {
            int action2 = motionEvent.getAction();
            if (action2 == 0) {
                b(a(motionEvent));
            } else if (action2 == 1) {
                b(motionEvent);
                c(a(motionEvent));
            }
            return true;
        }
    }

    private ChooseVideoCoverView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(8344);
        this.f132752a = 7;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.qa, R.attr.qr, R.attr.qs, R.attr.uz, R.attr.v0, R.attr.a1v, R.attr.a5g, R.attr.a5h, R.attr.a6a, R.attr.a7j, R.attr.abv, R.attr.acv, R.attr.af8});
            this.f132762k = Math.round(obtainStyledAttributes.getDimension(4, 0.0f));
            this.f132763l = Math.round(obtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.f132755d = context;
        RecyclerView recyclerView = new RecyclerView(this.f132755d);
        this.f132753b = recyclerView;
        recyclerView.setTag("tag_RecyclerView");
        this.f132753b.setOnTouchListener(this);
        addView(this.f132753b, new FrameLayout.LayoutParams(-1, -1));
        q qVar = new q(this.f132755d);
        this.f132754c = qVar;
        qVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f132754c.setColor(androidx.core.content.b.c(getContext(), R.color.bh));
        this.f132754c.setTag("tag_VideoCoverFrameView");
        this.f132754c.setOnTouchListener(this);
        addView(this.f132754c);
        this.f132758g = new View(this.f132755d);
        this.f132760i = new FrameLayout.LayoutParams(-1, -1);
        this.f132758g.setBackgroundResource(R.drawable.q2);
        this.f132759h = new View(this.f132755d);
        this.f132761j = new FrameLayout.LayoutParams(-1, -1);
        this.f132759h.setBackgroundResource(R.drawable.q2);
        MethodCollector.o(8344);
    }
}
