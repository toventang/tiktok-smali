package com.ss.android.ugc.aweme.friends.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;

public final class h extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f96773a;

    /* renamed from: b  reason: collision with root package name */
    private Context f96774b;

    /* renamed from: c  reason: collision with root package name */
    private Resources f96775c;

    /* renamed from: d  reason: collision with root package name */
    private float f96776d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f96777e;

    /* renamed from: f  reason: collision with root package name */
    private Paint f96778f;

    /* renamed from: g  reason: collision with root package name */
    private int f96779g;

    /* renamed from: h  reason: collision with root package name */
    private int f96780h;

    /* renamed from: i  reason: collision with root package name */
    private float f96781i;

    /* renamed from: j  reason: collision with root package name */
    private Rect f96782j;

    /* renamed from: k  reason: collision with root package name */
    private String f96783k;

    /* renamed from: l  reason: collision with root package name */
    private c f96784l;

    static {
        Covode.recordClassIndex(61410);
    }

    private String a(int i2) {
        String str;
        int a2 = this.f96784l.a(i2);
        if (a2 != -1) {
            str = (String) this.f96784l.getSections()[a2];
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f96783k)) {
            str = this.f96783k;
        }
        this.f96783k = str;
        return str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.s sVar) {
        super.onDraw(canvas, recyclerView, sVar);
    }

    public h(Context context, c cVar, boolean z) {
        this.f96774b = context;
        this.f96775c = context.getResources();
        this.f96776d = n.b(context, 32.0f);
        Paint paint = new Paint();
        this.f96777e = paint;
        paint.setColor(this.f96775c.getColor(R.color.f159928l));
        Paint paint2 = new Paint();
        this.f96778f = paint2;
        paint2.setColor(this.f96775c.getColor(R.color.bx));
        this.f96778f.setTextSize(n.b(this.f96774b, 14.0f));
        if (gb.a()) {
            this.f96778f.setTextAlign(Paint.Align.RIGHT);
        }
        this.f96778f.setAntiAlias(true);
        Paint.FontMetrics fontMetrics = this.f96778f.getFontMetrics();
        this.f96779g = (int) (fontMetrics.bottom - fontMetrics.top);
        this.f96780h = (int) fontMetrics.bottom;
        this.f96781i = n.b(this.f96774b, 16.0f);
        this.f96782j = new Rect();
        this.f96784l = cVar;
        this.f96773a = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.s sVar) {
        RecyclerView.ViewHolder f2;
        super.onDrawOver(canvas, recyclerView, sVar);
        int k2 = ((LinearLayoutManager) recyclerView.getLayoutManager()).k();
        int l2 = ((LinearLayoutManager) recyclerView.getLayoutManager()).l() - (this.f96773a ? 1 : 0);
        if (k2 != -1 && l2 > 0 && (f2 = recyclerView.f(k2)) != null) {
            if (this.f96773a) {
                k2--;
            }
            View view = f2.itemView;
            String a2 = a(k2);
            if (!TextUtils.isEmpty(a2)) {
                boolean z = true;
                int i2 = k2 + 1;
                if (a(i2) == null || TextUtils.equals(a(i2), a2) || ((float) (view.getHeight() + view.getTop())) >= this.f96776d) {
                    z = false;
                } else {
                    canvas.save();
                    canvas.translate(0.0f, ((float) (view.getHeight() + view.getTop())) - this.f96776d);
                }
                this.f96782j.set(0, 0, recyclerView.getRight() - recyclerView.getPaddingRight(), (int) (((float) recyclerView.getPaddingTop()) + this.f96776d));
                this.f96777e.setColor(this.f96775c.getColor(R.color.f159928l));
                if (gb.a()) {
                    canvas.drawRect((float) recyclerView.getPaddingEnd(), (float) recyclerView.getPaddingTop(), (float) (recyclerView.getRight() - recyclerView.getPaddingStart()), ((float) recyclerView.getPaddingTop()) + this.f96776d, this.f96777e);
                    float f3 = this.f96776d;
                    canvas.drawText(a2, ((float) (view.getRight() - view.getPaddingStart())) - this.f96781i, ((((float) recyclerView.getPaddingTop()) + f3) - ((f3 - ((float) this.f96779g)) / 2.0f)) - ((float) this.f96780h), this.f96778f);
                } else {
                    canvas.drawRect((float) recyclerView.getPaddingLeft(), (float) recyclerView.getPaddingTop(), (float) (recyclerView.getRight() - recyclerView.getPaddingRight()), ((float) recyclerView.getPaddingTop()) + this.f96776d, this.f96777e);
                    float f4 = this.f96776d;
                    canvas.drawText(a2, ((float) view.getPaddingLeft()) + this.f96781i, ((((float) recyclerView.getPaddingTop()) + f4) - ((f4 - ((float) this.f96779g)) / 2.0f)) - ((float) this.f96780h), this.f96778f);
                }
                if (z) {
                    canvas.restore();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        super.getItemOffsets(rect, view, recyclerView, sVar);
    }
}
