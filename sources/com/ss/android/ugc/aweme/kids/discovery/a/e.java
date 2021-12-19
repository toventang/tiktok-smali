package com.ss.android.ugc.aweme.kids.discovery.a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.discovery.a.f;
import h.f.b.l;

public final class e extends c {

    /* renamed from: i  reason: collision with root package name */
    public static final a f106400i = new a((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    public b f106401g = new a();

    /* renamed from: h  reason: collision with root package name */
    public c f106402h;

    /* renamed from: j  reason: collision with root package name */
    private int f106403j = -1;

    /* renamed from: k  reason: collision with root package name */
    private f f106404k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f106405l;

    /* renamed from: m  reason: collision with root package name */
    private View f106406m;

    public static abstract class b {
        static {
            Covode.recordClassIndex(67997);
        }

        public abstract View a(ViewGroup viewGroup, e eVar);

        public abstract void a(int i2);
    }

    public interface c {
        static {
            Covode.recordClassIndex(67998);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(67994);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(67996);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f106408a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f106409b;

        static {
            Covode.recordClassIndex(67999);
        }

        d(e eVar, int i2) {
            this.f106408a = eVar;
            this.f106409b = i2;
        }

        public final void run() {
            this.f106408a.f106401g.a(this.f106409b);
        }
    }

    public final void a() {
        if (!this.f106405l && this.f106403j == 1) {
            this.f106405l = true;
            c cVar = this.f106402h;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    private final void c(int i2) {
        RecyclerView recyclerView = this.f106391e;
        if (recyclerView != null) {
            recyclerView.post(new d(this, i2));
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        if (this.f106403j != i2) {
            this.f106403j = i2;
            c(i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.discovery.a.c, androidx.recyclerview.widget.RecyclerView.a
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        super.onDetachedFromRecyclerView(recyclerView);
        recyclerView.b(this.f106404k);
    }

    @Override // com.ss.android.ugc.aweme.kids.discovery.a.c, androidx.recyclerview.widget.RecyclerView.a
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        if (this.f106406m == viewHolder.itemView) {
            a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(RecyclerView.a<RecyclerView.ViewHolder> aVar) {
        super(aVar);
        l.d(aVar, "");
        f fVar = new f();
        this.f106404k = fVar;
        AnonymousClass1 r0 = new f.a(this) {
            /* class com.ss.android.ugc.aweme.kids.discovery.a.e.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f106407a;

            static {
                Covode.recordClassIndex(67995);
            }

            @Override // com.ss.android.ugc.aweme.kids.discovery.a.f.a
            public final void a() {
                this.f106407a.a();
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f106407a = r1;
            }
        };
        l.d(r0, "");
        fVar.f106410a = r0;
    }

    public final void a(int i2) {
        if (i2 != 0) {
            this.f106405l = false;
            b(i2);
            return;
        }
        throw new IllegalArgumentException("STATE_INIT only can be set in the LoadMoreAdapterWrapper");
    }

    @Override // com.ss.android.ugc.aweme.kids.discovery.a.c, androidx.recyclerview.widget.RecyclerView.a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        if (this.f106406m == null) {
            this.f106406m = this.f106401g.a(recyclerView, this);
            this.f106401g.a(0);
            View view = this.f106406m;
            if (view == null) {
                l.b();
            }
            a(view);
        }
        recyclerView.a(this.f106404k);
    }
}
