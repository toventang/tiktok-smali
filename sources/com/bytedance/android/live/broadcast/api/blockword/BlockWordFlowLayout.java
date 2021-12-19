package com.bytedance.android.live.broadcast.api.blockword;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class BlockWordFlowLayout extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public View f7466a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f7467b = true;

    /* renamed from: c  reason: collision with root package name */
    boolean f7468c;

    /* renamed from: d  reason: collision with root package name */
    public b<? super com.bytedance.android.live.broadcast.api.blockword.model.a, z> f7469d;

    /* renamed from: e  reason: collision with root package name */
    private final int f7470e = y.a(8.0f);

    /* renamed from: f  reason: collision with root package name */
    private final int f7471f = y.a(8.0f);

    /* renamed from: g  reason: collision with root package name */
    private final List<List<View>> f7472g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<Integer> f7473h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    private boolean f7474i;

    /* renamed from: j  reason: collision with root package name */
    private int f7475j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f7476k = y.g();

    /* renamed from: l  reason: collision with root package name */
    private HashMap f7477l;

    static {
        Covode.recordClassIndex(3675);
    }

    public final int getSize() {
        return getChildCount() - 1;
    }

    public final void setDeleteListener(b<? super com.bytedance.android.live.broadcast.api.blockword.model.a, z> bVar) {
        l.d(bVar, "");
        this.f7469d = bVar;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BlockWordFlowLayout f7479a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.live.broadcast.api.blockword.model.a f7480b;

        static {
            Covode.recordClassIndex(3677);
        }

        a(BlockWordFlowLayout blockWordFlowLayout, com.bytedance.android.live.broadcast.api.blockword.model.a aVar) {
            this.f7479a = blockWordFlowLayout;
            this.f7480b = aVar;
        }

        public final void onClick(View view) {
            b<? super com.bytedance.android.live.broadcast.api.blockword.model.a, z> bVar = this.f7479a.f7469d;
            if (bVar != null) {
                bVar.invoke(this.f7480b);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockWordFlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        MethodCollector.i(1098);
        View a2 = p.a((ViewGroup) this, (int) R.layout.b5i, false);
        this.f7466a = a2;
        ((ImageView) a2.findViewById(R.id.bi7)).setImageResource(R.drawable.c4x);
        this.f7466a.setOnClickListener(new View.OnClickListener(this) {
            /* class com.bytedance.android.live.broadcast.api.blockword.BlockWordFlowLayout.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ BlockWordFlowLayout f7478a;

            static {
                Covode.recordClassIndex(3676);
            }

            {
                this.f7478a = r1;
            }

            public final void onClick(View view) {
                int i2;
                BlockWordFlowLayout blockWordFlowLayout = this.f7478a;
                blockWordFlowLayout.f7467b = !blockWordFlowLayout.f7467b;
                ImageView imageView = (ImageView) this.f7478a.f7466a.findViewById(R.id.bi7);
                if (this.f7478a.f7467b) {
                    i2 = R.drawable.c4x;
                } else {
                    i2 = R.drawable.c4y;
                }
                imageView.setImageResource(i2);
                this.f7478a.requestLayout();
            }
        });
        addView(this.f7466a);
        MethodCollector.o(1098);
    }

    public final void a(com.bytedance.android.live.broadcast.api.blockword.model.a aVar, int i2) {
        l.d(aVar, "");
        this.f7468c = false;
        if (this.f7477l == null) {
            this.f7477l = new HashMap();
        }
        View view = (View) this.f7477l.get(Integer.valueOf((int) R.id.b75));
        if (view == null) {
            view = findViewById(R.id.b75);
            this.f7477l.put(Integer.valueOf((int) R.id.b75), view);
        }
        BlockWordFlowLayout blockWordFlowLayout = (BlockWordFlowLayout) view;
        l.b(blockWordFlowLayout, "");
        View a2 = p.a((ViewGroup) blockWordFlowLayout, (int) R.layout.b_e, false);
        ((LinearLayout) a2.findViewById(R.id.u0)).setOnClickListener(new a(this, aVar));
        LiveTextView liveTextView = (LiveTextView) a2.findViewById(R.id.tz);
        l.b(liveTextView, "");
        liveTextView.setText(aVar.f7520b);
        addView(a2, i2);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        this.f7472g.clear();
        this.f7473h.clear();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        ArrayList arrayList = new ArrayList();
        this.f7474i = false;
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            l.b(childAt, "");
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (childAt.getVisibility() != 8) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i2, paddingLeft + paddingRight, layoutParams.width), ViewGroup.getChildMeasureSpec(i3, paddingTop + paddingBottom, layoutParams.height));
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (this.f7467b) {
                    if (this.f7474i) {
                        break;
                    } else if (measuredWidth + i5 + this.f7470e > size) {
                        this.f7474i = true;
                        int max = Math.max(i4 - 1, 0);
                        int i9 = 0;
                        while (true) {
                            if (max < 0) {
                                break;
                            }
                            View childAt2 = getChildAt(max);
                            l.b(childAt2, "");
                            i9 += childAt2.getMeasuredWidth() + this.f7470e;
                            if (i9 > y.a(31.0f) + this.f7470e) {
                                this.f7475j = max;
                                this.f7472g.add(arrayList);
                                break;
                            }
                            max--;
                        }
                        i8 += i6 + this.f7471f;
                    }
                }
                if (measuredWidth + i5 + this.f7470e > size) {
                    this.f7472g.add(arrayList);
                    this.f7473h.add(Integer.valueOf(i6));
                    i8 += i6 + this.f7471f;
                    i7 = Math.max(i7, i5 + this.f7470e);
                    arrayList = new ArrayList();
                    i5 = 0;
                    i6 = 0;
                }
                if (!this.f7467b) {
                    arrayList.add(childAt);
                } else if (!l.a(childAt, this.f7466a)) {
                    arrayList.add(childAt);
                }
                i5 += measuredWidth + this.f7470e;
                i6 = Math.max(i6, measuredHeight);
                if (i4 == getChildCount() - 1) {
                    this.f7472g.add(arrayList);
                    this.f7473h.add(Integer.valueOf(i6));
                    i8 += this.f7471f + i6;
                    i7 = Math.max(i7, this.f7470e + i5);
                }
            }
            i4++;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        if (mode != 1073741824) {
            size = i7;
        }
        if (mode2 != 1073741824) {
            size2 = i8;
        }
        int max2 = Math.max(size2, 102);
        if (getChildCount() == 1 && l.a(getChildAt(0), this.f7466a)) {
            max2 = 0;
        }
        setMeasuredDimension(size, max2);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (!this.f7467b || !this.f7474i) {
            if (this.f7476k) {
                int size = this.f7472g.size();
                int measuredWidth = getMeasuredWidth() - getPaddingRight();
                int paddingTop = getPaddingTop();
                for (int i6 = 0; i6 < size; i6++) {
                    Integer num = this.f7473h.get(i6);
                    l.b(num, "");
                    int intValue = num.intValue();
                    for (T t : this.f7472g.get(i6)) {
                        int measuredWidth2 = measuredWidth - t.getMeasuredWidth();
                        t.layout(measuredWidth2, paddingTop, measuredWidth, t.getMeasuredHeight() + paddingTop);
                        measuredWidth = measuredWidth2 - this.f7470e;
                    }
                    paddingTop += intValue + this.f7471f;
                    measuredWidth = getMeasuredWidth() - getPaddingRight();
                }
                return;
            }
            int size2 = this.f7472g.size();
            int paddingLeft = getPaddingLeft();
            int paddingTop2 = getPaddingTop();
            for (int i7 = 0; i7 < size2; i7++) {
                Integer num2 = this.f7473h.get(i7);
                l.b(num2, "");
                int intValue2 = num2.intValue();
                for (T t2 : this.f7472g.get(i7)) {
                    int measuredWidth3 = t2.getMeasuredWidth() + paddingLeft;
                    t2.layout(paddingLeft, paddingTop2, measuredWidth3, t2.getMeasuredHeight() + paddingTop2);
                    paddingLeft = this.f7470e + measuredWidth3;
                }
                paddingTop2 += intValue2 + this.f7471f;
                paddingLeft = getPaddingLeft();
            }
            if (size2 == 1 && this.f7468c) {
                this.f7466a.layout(0, 0, 0, 0);
            }
        } else if (this.f7476k) {
            int measuredWidth4 = getMeasuredWidth() - getPaddingRight();
            int paddingTop3 = getPaddingTop();
            if (getChildCount() != 1) {
                int childCount = getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = getChildAt(i8);
                    if (i8 < this.f7475j) {
                        l.b(childAt, "");
                        int measuredWidth5 = measuredWidth4 - childAt.getMeasuredWidth();
                        childAt.layout(measuredWidth5, paddingTop3, measuredWidth4, childAt.getMeasuredHeight() + paddingTop3);
                        measuredWidth4 = measuredWidth5 - this.f7470e;
                    } else if (!l.a(childAt, this.f7466a)) {
                        childAt.layout(0, 0, 0, 0);
                    }
                }
                if (this.f7475j != getChildCount() - 1 || this.f7475j == 0) {
                    this.f7466a.layout(measuredWidth4 - this.f7466a.getMeasuredWidth(), paddingTop3, measuredWidth4, this.f7466a.getMeasuredHeight() + paddingTop3);
                    return;
                }
                this.f7466a.layout(0, 0, 0, 0);
            }
        } else {
            int paddingLeft2 = getPaddingLeft();
            int paddingTop4 = getPaddingTop();
            if (getChildCount() != 1) {
                int childCount2 = getChildCount();
                for (int i9 = 0; i9 < childCount2; i9++) {
                    View childAt2 = getChildAt(i9);
                    if (i9 < this.f7475j) {
                        l.b(childAt2, "");
                        int measuredWidth6 = childAt2.getMeasuredWidth() + paddingLeft2;
                        childAt2.layout(paddingLeft2, paddingTop4, measuredWidth6, childAt2.getMeasuredHeight() + paddingTop4);
                        paddingLeft2 = measuredWidth6 + this.f7470e;
                    } else if (!l.a(childAt2, this.f7466a)) {
                        childAt2.layout(0, 0, 0, 0);
                    }
                }
                if (this.f7475j != getChildCount() - 1 || this.f7475j == 0) {
                    this.f7466a.layout(paddingLeft2, paddingTop4, this.f7466a.getMeasuredWidth() + paddingLeft2, this.f7466a.getMeasuredHeight() + paddingTop4);
                    return;
                }
                this.f7466a.layout(0, 0, 0, 0);
            }
        }
    }
}
