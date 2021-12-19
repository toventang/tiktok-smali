package com.ss.android.ugc.aweme.choosemusic.view;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public final class ab {

    /* renamed from: a  reason: collision with root package name */
    int f70783a;

    /* renamed from: b  reason: collision with root package name */
    int f70784b;

    /* renamed from: c  reason: collision with root package name */
    int f70785c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f70786d = true;

    /* renamed from: e  reason: collision with root package name */
    private a f70787e;

    /* renamed from: f  reason: collision with root package name */
    private int f70788f;

    /* renamed from: g  reason: collision with root package name */
    private int f70789g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f70790h = true;

    /* renamed from: i  reason: collision with root package name */
    private int f70791i;

    /* renamed from: j  reason: collision with root package name */
    private int f70792j;

    public interface a {
        static {
            Covode.recordClassIndex(43627);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(43626);
    }

    /* access modifiers changed from: package-private */
    public class b implements View.OnScrollChangeListener {
        static {
            Covode.recordClassIndex(43628);
        }

        private b() {
        }

        /* synthetic */ b(ab abVar, byte b2) {
            this();
        }

        public final void onScrollChange(View view, int i2, int i3, int i4, int i5) {
            if (view instanceof RecyclerView) {
                ab.this.b((RecyclerView) view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends RecyclerView.n {
        static {
            Covode.recordClassIndex(43629);
        }

        private c() {
        }

        /* synthetic */ c(ab abVar, byte b2) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            super.a(recyclerView, i2, i3);
            ab.this.b(recyclerView);
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
        if (this.f70786d) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            this.f70784b = recyclerView.getChildCount();
            this.f70785c = linearLayoutManager.A();
            int k2 = linearLayoutManager.k();
            this.f70783a = k2;
            int i2 = this.f70785c;
            if (i2 < this.f70789g) {
                this.f70792j = this.f70791i;
                this.f70789g = i2;
                if (i2 == 0) {
                    this.f70790h = true;
                }
            }
            if (this.f70790h && i2 > this.f70789g) {
                this.f70790h = false;
                this.f70789g = i2;
                this.f70792j++;
            }
            if (!this.f70790h && i2 - this.f70784b <= k2 + this.f70788f) {
                a aVar = this.f70787e;
                if (aVar != null) {
                    aVar.a();
                }
                this.f70790h = true;
            }
        }
    }

    public ab(a aVar, int i2) {
        this.f70787e = aVar;
        this.f70788f = i2;
    }
}
