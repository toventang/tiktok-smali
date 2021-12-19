package com.ss.android.ugc.aweme.search.ecom;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.a.f;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.h.i;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class ProductListView extends PowerList {
    public static final int R;
    private static final a aa = new a((byte) 0);
    public boolean P;
    public h.f.a.a<z> Q;
    private com.ss.android.ugc.aweme.search.ecom.a.b S;
    private e T;
    private a U;
    private boolean V;
    private int W;

    public ProductListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    static final class a {
        static {
            Covode.recordClassIndex(78847);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ ProductListView this$0;

        static {
            Covode.recordClassIndex(78849);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ProductListView productListView) {
            super(0);
            this.this$0 = productListView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            h.f.a.a<z> aVar = this.this$0.Q;
            if (aVar != null) {
                aVar.invoke();
            }
            return z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(78844);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        R = h.g.a.a(TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics()));
    }

    public final class b extends RecyclerView.h {

        /* renamed from: b  reason: collision with root package name */
        private final int f121031b;

        static {
            Covode.recordClassIndex(78848);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b() {
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            this.f121031b = h.g.a.a(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics()));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
            l.d(rect, "");
            l.d(view, "");
            l.d(recyclerView, "");
            l.d(sVar, "");
            int d2 = RecyclerView.d(view);
            int a2 = sVar.a() - 1;
            if (d2 == 0) {
                if (i.a(ProductListView.this)) {
                    rect.left = this.f121031b;
                    rect.right = 0;
                    return;
                }
                rect.right = this.f121031b;
                rect.left = 0;
            } else if (d2 != a2) {
                rect.left = this.f121031b;
                rect.right = this.f121031b;
            } else if (a2 < 0) {
            } else {
                if (i.a(ProductListView.this)) {
                    rect.left = 0;
                    rect.right = this.f121031b;
                    return;
                }
                rect.right = 0;
                rect.left = this.f121031b;
            }
        }
    }

    public final void setData(com.ss.android.ugc.aweme.search.ecom.a.b bVar) {
        l.d(bVar, "");
        getState().a();
        this.W = 0;
        this.S = bVar;
        List<com.ss.android.ugc.aweme.search.ecom.a.a> list = bVar.f121050b;
        if (list != null) {
            ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
            for (T t : list) {
                if (t.f121039g != null) {
                    this.V = true;
                }
                arrayList.add(new c(t, this.U, this.T));
            }
            getState().a(arrayList);
        }
        if (l.a((Object) bVar.f121049a, (Object) true)) {
            getState().a(new d(new c(this)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onMeasure(int i2, int i3) {
        int height;
        int i4 = this.W;
        if (i4 > 0) {
            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
            return;
        }
        int i5 = 0;
        RecyclerView.ViewHolder f2 = f(0);
        if (f2 == null) {
            f2 = a(0, false);
        }
        if (!(f2 instanceof ProductCell)) {
            f2 = null;
        }
        ProductCell productCell = (ProductCell) f2;
        if (productCell == null) {
            super.onMeasure(i2, i3);
            return;
        }
        if (this.V) {
            if (productCell.f121021a != null) {
                SmartImageView smartImageView = productCell.f121021a;
                if (smartImageView == null) {
                    l.a("coverImage");
                }
                int height2 = smartImageView.getHeight();
                SmartImageView smartImageView2 = productCell.f121021a;
                if (smartImageView2 == null) {
                    l.a("coverImage");
                }
                int a2 = height2 + ProductCell.a((View) smartImageView2);
                TextView textView = productCell.f121022b;
                if (textView == null) {
                    l.a("titleText");
                }
                int height3 = textView.getHeight();
                TextView textView2 = productCell.f121022b;
                if (textView2 == null) {
                    l.a("titleText");
                }
                int a3 = height3 + ProductCell.a((View) textView2);
                TextView textView3 = productCell.f121023j;
                if (textView3 == null) {
                    l.a("priceText");
                }
                int height4 = textView3.getHeight();
                TextView textView4 = productCell.f121023j;
                if (textView4 == null) {
                    l.a("priceText");
                }
                int a4 = height4 + ProductCell.a((View) textView4);
                ViewGroup viewGroup = productCell.f121024k;
                if (viewGroup == null) {
                    l.a("tagLayout");
                }
                int visibility = viewGroup.getVisibility();
                ViewGroup viewGroup2 = productCell.f121024k;
                if (viewGroup2 == null) {
                    l.a("tagLayout");
                }
                if (viewGroup2.getVisibility() != 0) {
                    ViewGroup viewGroup3 = productCell.f121024k;
                    if (viewGroup3 == null) {
                        l.a("tagLayout");
                    }
                    p.c(viewGroup3);
                }
                ViewGroup viewGroup4 = productCell.f121024k;
                if (viewGroup4 == null) {
                    l.a("tagLayout");
                }
                if (viewGroup4.getHeight() <= 0) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                    ViewGroup viewGroup5 = productCell.f121024k;
                    if (viewGroup5 == null) {
                        l.a("tagLayout");
                    }
                    viewGroup5.measure(0, makeMeasureSpec);
                    ViewGroup viewGroup6 = productCell.f121024k;
                    if (viewGroup6 == null) {
                        l.a("tagLayout");
                    }
                    height = viewGroup6.getMeasuredHeight();
                } else {
                    ViewGroup viewGroup7 = productCell.f121024k;
                    if (viewGroup7 == null) {
                        l.a("tagLayout");
                    }
                    height = viewGroup7.getHeight();
                }
                ViewGroup viewGroup8 = productCell.f121024k;
                if (viewGroup8 == null) {
                    l.a("tagLayout");
                }
                int a5 = height + ProductCell.a((View) viewGroup8);
                ViewGroup viewGroup9 = productCell.f121024k;
                if (viewGroup9 == null) {
                    l.a("tagLayout");
                }
                viewGroup9.setVisibility(visibility);
                i5 = a2 + a3 + a5 + a4;
            }
        } else if (productCell.f121021a != null) {
            SmartImageView smartImageView3 = productCell.f121021a;
            if (smartImageView3 == null) {
                l.a("coverImage");
            }
            int height5 = smartImageView3.getHeight();
            SmartImageView smartImageView4 = productCell.f121021a;
            if (smartImageView4 == null) {
                l.a("coverImage");
            }
            int a6 = height5 + ProductCell.a((View) smartImageView4);
            TextView textView5 = productCell.f121022b;
            if (textView5 == null) {
                l.a("titleText");
            }
            int height6 = textView5.getHeight();
            TextView textView6 = productCell.f121022b;
            if (textView6 == null) {
                l.a("titleText");
            }
            int a7 = height6 + ProductCell.a((View) textView6);
            TextView textView7 = productCell.f121023j;
            if (textView7 == null) {
                l.a("priceText");
            }
            int height7 = textView7.getHeight();
            TextView textView8 = productCell.f121023j;
            if (textView8 == null) {
                l.a("priceText");
            }
            i5 = a6 + a7 + height7 + ProductCell.a((View) textView8);
        }
        int i6 = i5 + R;
        this.W = i6;
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
    }

    public final void a(e eVar, a aVar, h.f.a.a<z> aVar2) {
        this.T = eVar;
        this.U = aVar;
        this.Q = aVar2;
    }

    private /* synthetic */ ProductListView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ProductListView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        setClipToPadding(false);
        setOrientation(0);
        a(new b());
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        Integer valueOf = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        i.a((View) this, valueOf, Integer.valueOf(R), Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics()))), (Integer) 0, false, 16);
        a(ProductCell.class, ProductSeeAllCell.class);
        RecyclerView.a adapter = getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(new RecyclerView.c(this) {
                /* class com.ss.android.ugc.aweme.search.ecom.ProductListView.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ ProductListView f121028a;

                static {
                    Covode.recordClassIndex(78845);
                }

                /* renamed from: com.ss.android.ugc.aweme.search.ecom.ProductListView$1$a */
                static final class a implements Runnable {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f121029a;

                    static {
                        Covode.recordClassIndex(78846);
                    }

                    a(AnonymousClass1 r1) {
                        this.f121029a = r1;
                    }

                    public final void run() {
                        RecyclerView.a adapter;
                        this.f121029a.f121028a.requestLayout();
                        if (this.f121029a.f121028a.P && (adapter = this.f121029a.f121028a.getAdapter()) != null) {
                            adapter.notifyDataSetChanged();
                        }
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f121028a = r1;
                }

                @Override // androidx.recyclerview.widget.RecyclerView.c
                public final void b(int i2, int i3) {
                    this.f121028a.postDelayed(new a(this), 300);
                }
            });
        }
        this.P = true;
        addOnAttachStateChangeListener(new f());
    }
}
