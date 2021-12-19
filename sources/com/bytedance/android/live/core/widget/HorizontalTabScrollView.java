package com.bytedance.android.live.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import androidx.recyclerview.widget.s;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import java.util.List;

public class HorizontalTabScrollView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f9276a;

    /* renamed from: b  reason: collision with root package name */
    public g f9277b;

    /* renamed from: c  reason: collision with root package name */
    private a f9278c;

    /* renamed from: d  reason: collision with root package name */
    private int f9279d = -1;

    public interface c {
        static {
            Covode.recordClassIndex(4740);
        }

        void a(int i2);
    }

    public interface d {
        static {
            Covode.recordClassIndex(4741);
        }

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(4737);
    }

    public static class g extends s {

        /* renamed from: b  reason: collision with root package name */
        public List<d> f9288b;

        static {
            Covode.recordClassIndex(4745);
        }

        private g() {
        }

        /* synthetic */ g(byte b2) {
            this();
        }

        @Override // androidx.recyclerview.widget.s, androidx.recyclerview.widget.ac
        public final View a(RecyclerView.i iVar) {
            int i2;
            View a2 = super.a(iVar);
            if (a2 != null) {
                i2 = ((RecyclerView.j) a2.getLayoutParams()).f3847c.getBindingAdapterPosition();
                if (i2 == 0) {
                    a2 = iVar.c(1);
                    i2 = 1;
                } else if (i2 == iVar.A() - 1) {
                    i2 = iVar.A() - 2;
                    a2 = iVar.c(i2);
                }
            } else {
                i2 = -1;
            }
            int i3 = i2 - 1;
            List<d> list = this.f9288b;
            if (list != null && !list.isEmpty()) {
                for (d dVar : this.f9288b) {
                    dVar.a(i3);
                }
            }
            return a2;
        }
    }

    /* access modifiers changed from: package-private */
    public static class a extends LinearLayoutManager {

        /* renamed from: a  reason: collision with root package name */
        public boolean f9280a;

        static {
            Covode.recordClassIndex(4738);
        }

        public a() {
            super(0, false);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
        public final void a(RecyclerView recyclerView, RecyclerView.s sVar, int i2) {
            b bVar = new b(recyclerView.getContext());
            bVar.f9281f = this.f9280a;
            bVar.f3862g = i2;
            a(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    public class f extends RecyclerView.a {

        /* renamed from: b  reason: collision with root package name */
        private RecyclerView.a f9287b;

        static {
            Covode.recordClassIndex(4744);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
            return a(this, viewGroup, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final int getItemCount() {
            return this.f9287b.getItemCount() + 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final int getItemViewType(int i2) {
            if (i2 == 0 || i2 == getItemCount() - 1) {
                return -1;
            }
            return this.f9287b.getItemViewType(i2);
        }

        public f(RecyclerView.a aVar) {
            this.f9287b = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
            this.f9287b.onBindViewHolder(viewHolder, i2 - 1);
        }

        private static RecyclerView.ViewHolder a(f fVar, ViewGroup viewGroup, int i2) {
            RecyclerView.ViewHolder viewHolder;
            boolean a2;
            MethodCollector.i(9981);
            if (i2 == -1) {
                Space space = new Space(viewGroup.getContext());
                space.setLayoutParams(new ViewGroup.LayoutParams(HorizontalTabScrollView.this.getHalfScreenWidth(), -2));
                viewHolder = new h(space);
            } else {
                viewHolder = fVar.f9287b.onCreateViewHolder(viewGroup, i2);
            }
            try {
                if (viewHolder.itemView.getParent() != null) {
                    try {
                        a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a2) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                        com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(viewHolder.itemView);
                        }
                    }
                }
            } catch (Exception e2) {
                ai.a(e2);
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
            gg.f143005a = viewHolder.getClass().getName();
            MethodCollector.o(9981);
            return viewHolder;
        }
    }

    public int getHalfScreenWidth() {
        return (int) (((((float) getResources().getDisplayMetrics().widthPixels) * 1.0f) / 4.0f) * 3.0f);
    }

    static class b extends r {

        /* renamed from: f  reason: collision with root package name */
        public boolean f9281f;

        static {
            Covode.recordClassIndex(4739);
        }

        public b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.r
        public final float a(DisplayMetrics displayMetrics) {
            return 80.0f / ((float) displayMetrics.densityDpi);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r, androidx.recyclerview.widget.r
        public final void a(View view, RecyclerView.s sVar, RecyclerView.r.a aVar) {
            int b2 = b(view, b());
            int a2 = a(view, c());
            int a3 = a((int) Math.sqrt((double) ((b2 * b2) + (a2 * a2))));
            if (this.f9281f) {
                aVar.a(-b2, -a2, 1, null);
            } else if (a3 > 0) {
                aVar.a(-b2, -a2, a3, this.f4200b);
            }
        }

        @Override // androidx.recyclerview.widget.r
        public final int a(int i2, int i3, int i4, int i5, int i6) {
            return (i4 + ((i5 - i4) / 2)) - (i2 + ((i3 - i2) / 2));
        }
    }

    /* access modifiers changed from: package-private */
    public static class h extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(4746);
        }

        public h(View view) {
            super(view);
        }
    }

    public final void a(int i2) {
        this.f9278c.f9280a = false;
        this.f9276a.d(i2 + 1);
    }

    public final void b(int i2) {
        RecyclerView.a adapter = this.f9276a.getAdapter();
        if (adapter != null) {
            adapter.notifyItemChanged(i2 + 1);
        }
    }

    public void setAdapter(RecyclerView.a aVar) {
        RecyclerView recyclerView = this.f9276a;
        if (recyclerView != null) {
            recyclerView.setAdapter(new f(aVar));
        }
    }

    public static class e implements RecyclerView.m {

        /* renamed from: a  reason: collision with root package name */
        public c f9282a;

        /* renamed from: b  reason: collision with root package name */
        private GestureDetector f9283b;

        static {
            Covode.recordClassIndex(4742);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final void a(boolean z) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
            if (this.f9283b.onTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }

        private e(Context context, final RecyclerView recyclerView, c cVar) {
            this.f9282a = cVar;
            this.f9283b = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
                /* class com.bytedance.android.live.core.widget.HorizontalTabScrollView.e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(4743);
                }

                public final boolean onSingleTapUp(MotionEvent motionEvent) {
                    View a2;
                    RecyclerView recyclerView = recyclerView;
                    if (recyclerView == null || (a2 = recyclerView.a(motionEvent.getX(), motionEvent.getY())) == null || e.this.f9282a == null) {
                        return false;
                    }
                    e.this.f9282a.a(RecyclerView.e(a2) - 1);
                    return true;
                }
            });
        }

        public /* synthetic */ e(Context context, RecyclerView recyclerView, c cVar, byte b2) {
            this(context, recyclerView, cVar);
        }
    }

    public HorizontalTabScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(9976);
        removeAllViews();
        this.f9276a = new RecyclerView(getContext());
        getContext();
        a aVar = new a();
        this.f9278c = aVar;
        this.f9276a.setLayoutManager(aVar);
        g gVar = new g((byte) 0);
        this.f9277b = gVar;
        gVar.a(this.f9276a);
        addView(this.f9276a, new FrameLayout.LayoutParams(-1, -1));
        MethodCollector.o(9976);
    }
}
