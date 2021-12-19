package com.ss.android.ugc.aweme.kids.choosemusic.h;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    int f105725a;

    /* renamed from: b  reason: collision with root package name */
    int f105726b;

    /* renamed from: c  reason: collision with root package name */
    int f105727c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f105728d = true;

    /* renamed from: e  reason: collision with root package name */
    private a f105729e;

    /* renamed from: f  reason: collision with root package name */
    private int f105730f;

    /* renamed from: g  reason: collision with root package name */
    private int f105731g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f105732h = true;

    /* renamed from: i  reason: collision with root package name */
    private int f105733i;

    /* renamed from: j  reason: collision with root package name */
    private int f105734j;

    public interface a {
        static {
            Covode.recordClassIndex(67699);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(67698);
    }

    /* access modifiers changed from: package-private */
    public class b implements View.OnScrollChangeListener {
        static {
            Covode.recordClassIndex(67700);
        }

        private b() {
        }

        /* synthetic */ b(q qVar, byte b2) {
            this();
        }

        public final void onScrollChange(View view, int i2, int i3, int i4, int i5) {
            if (view instanceof RecyclerView) {
                q.this.b((RecyclerView) view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends RecyclerView.n {
        static {
            Covode.recordClassIndex(67701);
        }

        private c() {
        }

        /* synthetic */ c(q qVar, byte b2) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            super.a(recyclerView, i2, i3);
            q.this.b(recyclerView);
        }
    }

    public final void a(RecyclerView recyclerView) {
        if (Build.VERSION.SDK_INT >= 23) {
            recyclerView.setOnScrollChangeListener(new b(this, (byte) 0));
        } else {
            recyclerView.setOnScrollListener(new c(this, (byte) 0));
        }
    }

    public final void b(RecyclerView recyclerView) {
        if (this.f105728d) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            this.f105726b = recyclerView.getChildCount();
            this.f105727c = linearLayoutManager.A();
            int k2 = linearLayoutManager.k();
            this.f105725a = k2;
            int i2 = this.f105727c;
            if (i2 < this.f105731g) {
                this.f105734j = this.f105733i;
                this.f105731g = i2;
                if (i2 == 0) {
                    this.f105732h = true;
                }
            }
            if (this.f105732h && i2 > this.f105731g) {
                this.f105732h = false;
                this.f105731g = i2;
                this.f105734j++;
            }
            if (!this.f105732h && i2 - this.f105726b <= k2 + this.f105730f) {
                a aVar = this.f105729e;
                if (aVar != null) {
                    aVar.a();
                }
                this.f105732h = true;
            }
        }
    }

    public q(a aVar, int i2) {
        this.f105729e = aVar;
        this.f105730f = i2;
    }
}
