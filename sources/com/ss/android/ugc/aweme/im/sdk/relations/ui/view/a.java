package com.ss.android.ugc.aweme.im.sdk.relations.ui.view;

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
import com.bytedance.ies.dmt.ui.widget.util.b;
import com.bytedance.ies.dmt.ui.widget.util.d;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class a extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    public int f103297a;

    /* renamed from: b  reason: collision with root package name */
    public int f103298b = -1;

    /* renamed from: c  reason: collision with root package name */
    public boolean f103299c;

    /* renamed from: d  reason: collision with root package name */
    private Context f103300d;

    /* renamed from: e  reason: collision with root package name */
    private Resources f103301e;

    /* renamed from: f  reason: collision with root package name */
    private float f103302f;

    /* renamed from: g  reason: collision with root package name */
    private Paint f103303g;

    /* renamed from: h  reason: collision with root package name */
    private Paint f103304h;

    /* renamed from: i  reason: collision with root package name */
    private int f103305i;

    /* renamed from: j  reason: collision with root package name */
    private int f103306j;

    /* renamed from: k  reason: collision with root package name */
    private float f103307k;

    /* renamed from: l  reason: collision with root package name */
    private float f103308l;

    /* renamed from: m  reason: collision with root package name */
    private float f103309m;
    private Rect n;
    private Rect o;
    private boolean p;
    private String q;
    private List<String> r;
    private List<Integer> s;

    static {
        Covode.recordClassIndex(66204);
    }

    private String a(int i2) {
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= this.s.size()) {
                i3 = -1;
                break;
            }
            i4 += this.s.get(i3).intValue();
            if (i2 < i4) {
                break;
            }
            i3++;
        }
        String str = null;
        if (i3 != -1) {
            str = this.r.get(i3);
        }
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.q)) {
            str = this.q;
        }
        if ("recent".equals(str)) {
            str = this.f103300d.getString(R.string.ch_);
        } else if ("Friend".equals(str)) {
            str = this.f103300d.getString(R.string.cgf);
        } else if (i2 == 0) {
            int i5 = this.f103298b;
            if (i5 == 0) {
                str = this.f103300d.getString(R.string.cet);
            } else if (i5 == -1 || i5 == 1) {
                str = this.f103300d.getString(R.string.cge);
            }
        }
        this.q = str;
        return str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.s sVar) {
        super.onDraw(canvas, recyclerView, sVar);
    }

    public a(Context context, List<String> list, List<Integer> list2) {
        this.f103300d = context;
        this.f103301e = context.getResources();
        this.f103302f = n.b(context, 32.0f);
        Paint paint = new Paint();
        this.f103303g = paint;
        paint.setColor(this.f103301e.getColor(R.color.an));
        Paint paint2 = new Paint(1);
        this.f103304h = paint2;
        paint2.setColor(this.f103301e.getColor(R.color.c5));
        this.f103304h.setTextSize(n.b(this.f103300d, 13.0f));
        this.f103304h.setTypeface(b.a().a(d.f33801g));
        Paint.FontMetrics fontMetrics = this.f103304h.getFontMetrics();
        this.f103305i = (int) (fontMetrics.bottom - fontMetrics.top);
        this.f103306j = ((int) fontMetrics.bottom) - ((int) n.b(this.f103300d, 8.0f));
        this.f103307k = n.b(this.f103300d, 16.0f);
        this.n = new Rect();
        this.f103308l = n.b(this.f103300d, 2.0f);
        this.f103309m = n.b(this.f103300d, 16.0f);
        float f2 = this.f103309m;
        this.o = new Rect(0, 0, (int) f2, (int) f2);
        this.r = list;
        this.s = list2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.s sVar) {
        int k2;
        RecyclerView.ViewHolder f2;
        super.onDrawOver(canvas, recyclerView, sVar);
        this.f103299c = false;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (linearLayoutManager != null && (k2 = linearLayoutManager.k()) != -1 && k2 >= this.f103297a && (f2 = recyclerView.f(k2)) != null) {
            int i2 = k2 - this.f103297a;
            View view = f2.itemView;
            String a2 = a(i2);
            if (!TextUtils.isEmpty(a2)) {
                boolean z = true;
                this.f103299c = true;
                this.p = false;
                if (TextUtils.equals(this.f103300d.getString(R.string.cgf), a2)) {
                    this.p = true;
                }
                int i3 = i2 + 1;
                if (a(i3) == null || TextUtils.equals(a(i3), a2) || ((float) (view.getHeight() + view.getTop())) >= this.f103302f) {
                    z = false;
                } else {
                    canvas.save();
                    canvas.translate(0.0f, ((float) (view.getHeight() + view.getTop())) - this.f103302f);
                }
                this.n.set(0, 0, recyclerView.getRight() - recyclerView.getPaddingRight(), (int) (((float) recyclerView.getPaddingTop()) + this.f103302f));
                this.f103303g.setColor(this.f103301e.getColor(R.color.f159928l));
                canvas.drawRect((float) recyclerView.getPaddingLeft(), (float) recyclerView.getPaddingTop(), (float) (recyclerView.getRight() - recyclerView.getPaddingRight()), ((float) recyclerView.getPaddingTop()) + this.f103302f, this.f103303g);
                float f3 = this.f103302f;
                canvas.drawText(a2, ((float) view.getPaddingLeft()) + this.f103307k, ((((float) recyclerView.getPaddingTop()) + f3) - ((f3 - ((float) this.f103305i)) / 2.0f)) - ((float) this.f103306j), this.f103304h);
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
