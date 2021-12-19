package com.bytedance.android.livesdk.feed.drawerfeed;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.paging.a.b;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.feed.h;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import java.util.Map;

public final class a extends com.bytedance.android.livesdk.feed.a.a {
    private final l z;

    static {
        Covode.recordClassIndex(9623);
    }

    /* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.a$a  reason: collision with other inner class name */
    public class C0365a extends com.bytedance.android.livesdk.ui.b {
        static {
            Covode.recordClassIndex(9624);
        }

        @Override // com.bytedance.android.livesdk.ui.b
        public final void e() {
            super.e();
        }

        public static void d() {
            b.a.a("livesdk_explore_no_more_show").a("has_banner", com.bytedance.android.b.a.a.f6785g.c()).a().b();
        }

        public C0365a(View view) {
            super(view);
        }

        @Override // com.bytedance.android.livesdk.ui.b
        public final void a(Object obj, int i2) {
            d();
            if (a.this.s != null) {
                a(a.this.s.d(new b(this)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends b.a {

        /* renamed from: a  reason: collision with root package name */
        PagingViewModel f17366a;

        /* renamed from: c  reason: collision with root package name */
        private View f17368c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f17369d;

        /* renamed from: e  reason: collision with root package name */
        private TextView f17370e;

        /* renamed from: f  reason: collision with root package name */
        private final f.a.b.a f17371f = new f.a.b.a();

        static {
            Covode.recordClassIndex(9625);
        }

        @Override // com.bytedance.android.live.core.paging.a.b.a
        public final void a() {
            this.f17371f.a();
        }

        static void b() {
            b.a.a("livesdk_explore_page_show").a("show_type", "network_error").a().b();
        }

        @Override // com.bytedance.android.live.core.paging.a.b.a
        public final void a(boolean z) {
            TextView textView = this.f17369d;
            textView.setTextColor(textView.getResources().getColor(R.color.wl));
            this.f17369d.setText(R.string.dzl);
            this.f17370e.setText(R.string.dzm);
            TextView textView2 = this.f17370e;
            textView2.setTextColor(textView2.getResources().getColor(R.color.xa));
            if (!z) {
                int k2 = this.f17366a.f9217h.k();
                for (int i2 = 0; i2 < k2; i2++) {
                    this.f17366a.f9217h.j();
                }
            }
            this.f17370e.setOnClickListener(new c(this));
            if (a.this.s != null) {
                this.f17371f.a(a.this.s.d(new d(this)));
            }
            b();
        }

        b(View view, PagingViewModel pagingViewModel) {
            super(view);
            this.f17366a = pagingViewModel;
            this.f17368c = view.findViewById(R.id.axn);
            this.f17369d = (TextView) view.findViewById(R.id.axt);
            this.f17370e = (TextView) view.findViewById(R.id.axp);
        }
    }

    static class c extends b.f {

        /* renamed from: a  reason: collision with root package name */
        public View f17373a;

        /* renamed from: b  reason: collision with root package name */
        private ViewGroup f17374b;

        /* renamed from: c  reason: collision with root package name */
        private PagingViewModel f17375c;

        static {
            Covode.recordClassIndex(9626);
        }

        @Override // com.bytedance.android.live.core.paging.a.b.f
        public final void a() {
            this.f17375c.f9211b.observeForever(new u<com.bytedance.android.live.core.e.b>() {
                /* class com.bytedance.android.livesdk.feed.drawerfeed.a.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(9627);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(com.bytedance.android.live.core.e.b bVar) {
                    com.bytedance.android.live.core.e.b bVar2 = bVar;
                    if (bVar2 == null) {
                        return;
                    }
                    if (bVar2.a()) {
                        c.this.f17373a.setVisibility(0);
                    } else {
                        c.this.f17373a.setVisibility(8);
                    }
                }
            });
        }

        c(View view, PagingViewModel pagingViewModel) {
            super(view);
            MethodCollector.i(778);
            this.f17375c = pagingViewModel;
            this.f17374b = (ViewGroup) view.findViewById(R.id.chp);
            LiveLoadingView liveLoadingView = new LiveLoadingView(view.getContext());
            this.f17373a = liveLoadingView;
            this.f17374b.addView(liveLoadingView);
            MethodCollector.o(778);
        }
    }

    @Override // com.bytedance.android.live.core.paging.a.b
    public final RecyclerView.ViewHolder b(ViewGroup viewGroup) {
        return new C0365a(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b5x, viewGroup, false));
    }

    @Override // com.bytedance.android.livesdk.feed.a.a
    public final int c(int i2) {
        if (i2 != 1) {
            if (i2 == 3) {
                return R.layout.b_o;
            }
            if (i2 == 6) {
                return R.layout.bem;
            }
            if (i2 == 1004) {
                return R.layout.b_r;
            }
            if (i2 == 1001) {
                return R.layout.bem;
            }
            if (i2 != 1002) {
                return super.c(i2);
            }
            return R.layout.ber;
        } else if (l.f()) {
            return R.layout.b_k;
        } else {
            return R.layout.b_p;
        }
    }

    @Override // com.bytedance.android.live.core.paging.a.b
    public final void c(RecyclerView.ViewHolder viewHolder, int i2) {
        super.c(viewHolder, i2);
        if (viewHolder instanceof C0365a) {
            ((com.bytedance.android.livesdk.ui.b) viewHolder).a(null, i2);
        }
    }

    @Override // com.bytedance.android.live.core.paging.a.b
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        if (i2 == -1091576148) {
            return new c(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b8n, viewGroup, false), ((com.bytedance.android.live.core.paging.a.b) this).f9133a);
        }
        if (i2 == -1091576149) {
            return new b(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b5r, viewGroup, false), ((com.bytedance.android.live.core.paging.a.b) this).f9133a);
        }
        return super.a(viewGroup, i2);
    }

    public a(Map<Integer, com.bytedance.android.live.core.g.a> map, h hVar, l lVar) {
        super(map, hVar);
        this.z = lVar;
    }
}
