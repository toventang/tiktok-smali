package com.ss.android.ugc.aweme.friends.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public final class v extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f97275a;

    /* renamed from: b  reason: collision with root package name */
    private Context f97276b;

    /* renamed from: c  reason: collision with root package name */
    private Resources f97277c;

    /* renamed from: d  reason: collision with root package name */
    private float f97278d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f97279e;

    /* renamed from: f  reason: collision with root package name */
    private Paint f97280f;

    /* renamed from: g  reason: collision with root package name */
    private int f97281g;

    /* renamed from: h  reason: collision with root package name */
    private int f97282h;

    /* renamed from: i  reason: collision with root package name */
    private float f97283i;

    /* renamed from: j  reason: collision with root package name */
    private float f97284j;

    /* renamed from: k  reason: collision with root package name */
    private float f97285k;

    /* renamed from: l  reason: collision with root package name */
    private Bitmap f97286l;

    /* renamed from: m  reason: collision with root package name */
    private Bitmap f97287m;
    private Rect n;
    private Rect o;
    private boolean p;
    private String q;
    private List<String> r = new ArrayList();
    private List<Integer> s = new ArrayList();

    static {
        Covode.recordClassIndex(61800);
    }

    private String a(int i2) {
        String str = null;
        if (this.f97275a) {
            return null;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= this.s.size()) {
                break;
            }
            i4 += this.s.get(i3).intValue();
            if (i2 >= i4) {
                i3++;
            } else if (i3 != -1) {
                str = this.r.get(i3);
            }
        }
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.q)) {
            str = this.q;
        }
        if ("Recent".equals(str)) {
            str = this.f97276b.getString(R.string.gao);
        } else if ("Friend".equals(str)) {
            str = this.f97276b.getString(R.string.gjt);
        } else if (i2 == 0) {
            str = this.f97276b.getString(R.string.vj);
        }
        this.q = str;
        return str;
    }

    public v(Context context, List<String> list, List<Integer> list2) {
        this.f97276b = context;
        this.f97277c = context.getResources();
        this.f97278d = n.b(context, 32.0f);
        Paint paint = new Paint();
        this.f97279e = paint;
        paint.setColor(859328726);
        Paint paint2 = new Paint();
        this.f97280f = paint2;
        paint2.setColor(this.f97277c.getColor(R.color.bx));
        this.f97280f.setTextSize(n.b(this.f97276b, 13.0f));
        Paint.FontMetrics fontMetrics = this.f97280f.getFontMetrics();
        this.f97281g = (int) (fontMetrics.bottom - fontMetrics.top);
        this.f97282h = (int) fontMetrics.bottom;
        this.f97283i = n.b(this.f97276b, 16.0f);
        this.n = new Rect();
        this.f97284j = n.b(this.f97276b, 2.0f);
        this.f97286l = ((BitmapDrawable) this.f97277c.getDrawable(2131232239)).getBitmap();
        this.f97287m = ((BitmapDrawable) this.f97277c.getDrawable(2131232319)).getBitmap();
        this.f97285k = n.b(this.f97276b, 16.0f);
        float f2 = this.f97285k;
        this.o = new Rect(0, 0, (int) f2, (int) f2);
        this.r = list;
        this.s = list2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.s sVar) {
        RecyclerView.ViewHolder f2;
        super.onDrawOver(canvas, recyclerView, sVar);
        int k2 = ((LinearLayoutManager) recyclerView.getLayoutManager()).k();
        if (k2 != -1 && (f2 = recyclerView.f(k2)) != null) {
            View view = f2.itemView;
            String a2 = a(k2);
            if (!TextUtils.isEmpty(a2)) {
                this.p = false;
                boolean z = true;
                if (TextUtils.equals(this.f97276b.getString(R.string.gjt), a2)) {
                    this.p = true;
                }
                int i2 = k2 + 1;
                if (a(i2) == null || TextUtils.equals(a(i2), a2) || ((float) (view.getHeight() + view.getTop())) >= this.f97278d) {
                    z = false;
                } else {
                    canvas.save();
                    canvas.translate(0.0f, ((float) (view.getHeight() + view.getTop())) - this.f97278d);
                }
                this.n.set(0, 0, recyclerView.getRight() - recyclerView.getPaddingRight(), (int) (((float) recyclerView.getPaddingTop()) + this.f97278d));
                this.f97279e.setColor(this.f97277c.getColor(R.color.f159928l));
                canvas.drawRect((float) recyclerView.getPaddingLeft(), (float) recyclerView.getPaddingTop(), (float) (recyclerView.getRight() - recyclerView.getPaddingRight()), ((float) recyclerView.getPaddingTop()) + this.f97278d, this.f97279e);
                float f3 = this.f97278d;
                canvas.drawText(a2, ((float) view.getPaddingLeft()) + this.f97283i, ((((float) recyclerView.getPaddingTop()) + f3) - ((f3 - ((float) this.f97281g)) / 2.0f)) - ((float) this.f97282h), this.f97280f);
                if (this.p) {
                    this.f97280f.getTextBounds(a2, 0, a2.length(), this.n);
                    canvas.drawBitmap(this.f97287m, ((float) recyclerView.getPaddingLeft()) + this.f97283i + ((float) this.n.width()) + this.f97284j, ((float) recyclerView.getPaddingTop()) + ((this.f97278d - ((float) this.f97281g)) / 2.0f) + ((float) this.f97282h), this.f97280f);
                } else if (TextUtils.equals(this.f97276b.getString(R.string.gao), a2)) {
                    this.f97280f.getTextBounds(a2, 0, a2.length(), this.n);
                    float paddingLeft = ((float) recyclerView.getPaddingLeft()) + this.f97283i + ((float) this.n.width()) + this.f97284j;
                    float paddingTop = ((((float) recyclerView.getPaddingTop()) + ((this.f97278d - ((float) this.f97281g)) / 2.0f)) + ((float) this.f97282h)) - this.f97284j;
                    float f4 = this.f97285k;
                    this.o.set((int) paddingLeft, (int) paddingTop, (int) (paddingLeft + f4), (int) (paddingTop + f4));
                    canvas.drawBitmap(this.f97286l, (Rect) null, this.o, this.f97280f);
                }
                if (z) {
                    canvas.restore();
                }
            }
        }
    }
}
