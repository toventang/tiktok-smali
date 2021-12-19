package com.bytedance.android.live.wallet.adapter;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.android.live.wallet.adapter.a;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.android.livesdk.wallet.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class b extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public int f13032a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f13033b = -1;

    /* renamed from: c  reason: collision with root package name */
    public List<? extends c> f13034c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public int f13035d = -1;

    /* renamed from: e  reason: collision with root package name */
    public DiamondPackageExtra f13036e;

    /* renamed from: f  reason: collision with root package name */
    public int f13037f;

    /* renamed from: g  reason: collision with root package name */
    public SparseArray<Long> f13038g = new SparseArray<>(32);

    /* renamed from: h  reason: collision with root package name */
    final a.b f13039h;

    static {
        Covode.recordClassIndex(7239);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return 1;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        l.d(obj, "");
        return -2;
    }

    public static final class a extends GridLayoutManager.c {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f13040e;

        static {
            Covode.recordClassIndex(7240);
        }

        a(a aVar) {
            this.f13040e = aVar;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int a(int i2) {
            if (this.f13040e.getItemViewType(i2) == -1 || this.f13040e.getItemViewType(i2) == -2) {
                return 3;
            }
            return 1;
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.adapter.b$b  reason: collision with other inner class name */
    public static final class C0273b extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f13041a;

        static {
            Covode.recordClassIndex(7241);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C0273b(b bVar) {
            this.f13041a = bVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            boolean z;
            l.d(recyclerView, "");
            super.a(recyclerView, i2, i3);
            b bVar = this.f13041a;
            int[] iArr = new int[2];
            RecyclerView.i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                iArr[0] = linearLayoutManager.k();
                iArr[1] = linearLayoutManager.m();
                int i4 = linearLayoutManager.f3778j;
                int i5 = iArr[0];
                int i6 = iArr[1];
                if (i5 <= i6) {
                    while (true) {
                        View c2 = layoutManager.c(i5);
                        if (c2 != null) {
                            Rect rect = new Rect();
                            boolean globalVisibleRect = c2.getGlobalVisibleRect(rect);
                            if (i4 != 1 || ((float) rect.height()) < ((float) c2.getMeasuredHeight()) / 1.25f || !globalVisibleRect) {
                                z = false;
                            } else {
                                z = true;
                            }
                            Long l2 = bVar.f13038g.get(i5, -1L);
                            long currentTimeMillis = System.currentTimeMillis();
                            if (l2.longValue() > 0) {
                                if (!z) {
                                    l.b(l2, "");
                                    if (l2.longValue() != currentTimeMillis) {
                                        bVar.f13038g.put(i5, -1L);
                                        bVar.f13039h.a(false, i5, (c) bVar.f13034c.get(i5));
                                    }
                                }
                            } else if (z) {
                                bVar.f13038g.put(i5, Long.valueOf(currentTimeMillis));
                                bVar.f13039h.a(true, i5, (c) bVar.f13034c.get(i5));
                            }
                        }
                        if (i5 != i6) {
                            i5++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void a(List<? extends c> list) {
        l.d(list, "");
        this.f13034c = list;
    }

    public b(a.b bVar) {
        l.d(bVar, "");
        this.f13039h = bVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        l.d(view, "");
        l.d(obj, "");
        return l.a(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i2) {
        MethodCollector.i(8845);
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.bdy, viewGroup, false);
        if (a2 != null) {
            RecyclerView recyclerView = (RecyclerView) a2;
            recyclerView.setOverScrollMode(2);
            RechargePagerAdapter$instantiateItem$layoutManager$1 rechargePagerAdapter$instantiateItem$layoutManager$1 = new RechargePagerAdapter$instantiateItem$layoutManager$1(viewGroup, viewGroup.getContext());
            recyclerView.setLayoutManager(rechargePagerAdapter$instantiateItem$layoutManager$1);
            a aVar = new a(this.f13034c, this.f13039h, this.f13035d, this.f13033b, this.f13032a, this.f13037f);
            recyclerView.setAdapter(aVar);
            rechargePagerAdapter$instantiateItem$layoutManager$1.a(new a(aVar));
            recyclerView.a(new C0273b(this));
            viewGroup.addView(a2);
            MethodCollector.o(8845);
            return a2;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        MethodCollector.o(8845);
        throw nullPointerException;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        MethodCollector.i(9053);
        l.d(viewGroup, "");
        l.d(obj, "");
        viewGroup.removeView((View) obj);
        MethodCollector.o(9053);
    }
}
