package com.ss.android.ugc.aweme.search.q;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.discover.a.y;
import com.ss.android.ugc.aweme.discover.alading.d;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.e.a;
import com.ss.android.ugc.aweme.e.b;
import com.ss.android.ugc.aweme.search.k.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c implements a, b {

    /* renamed from: a  reason: collision with root package name */
    public LinearLayout f121580a;

    /* renamed from: b  reason: collision with root package name */
    private View f121581b;

    /* renamed from: c  reason: collision with root package name */
    private d f121582c;

    /* renamed from: d  reason: collision with root package name */
    private b f121583d;

    /* renamed from: e  reason: collision with root package name */
    private a f121584e;

    /* renamed from: f  reason: collision with root package name */
    private SearchUser f121585f;

    /* renamed from: g  reason: collision with root package name */
    private com.ss.android.ugc.aweme.discover.mixfeed.b.a f121586g;

    /* renamed from: h  reason: collision with root package name */
    private r f121587h;

    /* renamed from: i  reason: collision with root package name */
    private final ViewStub f121588i;

    /* renamed from: j  reason: collision with root package name */
    private final ViewGroup f121589j;

    static {
        Covode.recordClassIndex(79184);
    }

    public c() {
        this(null, null, 3);
    }

    @Override // com.ss.android.ugc.aweme.e.b
    public final void aN_() {
    }

    public final void b() {
        if (this.f121580a != null) {
            LinearLayout linearLayout = this.f121580a;
            if (linearLayout == null) {
                l.a("rootView");
            }
            p.b(linearLayout);
        }
    }

    private final void d() {
        if (this.f121582c == null) {
            LinearLayout linearLayout = this.f121580a;
            if (linearLayout == null) {
                l.a("rootView");
            }
            this.f121582c = new d(linearLayout);
            LinearLayout linearLayout2 = this.f121580a;
            if (linearLayout2 == null) {
                l.a("rootView");
            }
            this.f121581b = linearLayout2.findViewById(R.id.fdx);
            this.f121583d = com.ss.android.ugc.aweme.search.b.a(this.f121582c, this.f121585f);
        }
    }

    public final void c() {
        View view;
        RecyclerView recyclerView;
        d dVar = this.f121582c;
        if (!(dVar == null || (recyclerView = dVar.f80749a) == null)) {
            recyclerView.b(0);
        }
        a aVar = this.f121584e;
        RecyclerView recyclerView2 = null;
        if (aVar != null) {
            view = aVar.f121558c;
        } else {
            view = null;
        }
        if (view instanceof RecyclerView) {
            recyclerView2 = view;
        }
        RecyclerView recyclerView3 = recyclerView2;
        if (recyclerView3 != null) {
            recyclerView3.b(0);
        }
    }

    private final void e() {
        View view;
        MethodCollector.i(1102);
        if (y.a()) {
            a aVar = this.f121584e;
            if (aVar == null || (view = aVar.f121558c) == null) {
                MethodCollector.o(1102);
                return;
            }
            p.a(view);
            MethodCollector.o(1102);
            return;
        }
        if (y.b()) {
            LinearLayout linearLayout = this.f121580a;
            if (linearLayout == null) {
                l.a("rootView");
            }
            a aVar2 = new a(linearLayout);
            LinearLayout linearLayout2 = this.f121580a;
            if (linearLayout2 == null) {
                l.a("rootView");
            }
            linearLayout2.addView(aVar2.a(), 0);
            this.f121584e = aVar2;
            aVar2.a(this.f121586g, this.f121587h);
            a aVar3 = this.f121584e;
            if (aVar3 != null) {
                aVar3.a(this.f121585f);
                MethodCollector.o(1102);
                return;
            }
        }
        MethodCollector.o(1102);
    }

    public final void b(SearchUser searchUser) {
        MethodCollector.i(1092);
        this.f121585f = searchUser;
        if (this.f121580a != null) {
            MethodCollector.o(1092);
            return;
        }
        ViewGroup viewGroup = this.f121589j;
        LinearLayout linearLayout = null;
        if (viewGroup != null) {
            View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.axf, this.f121589j, false);
            if (a2 instanceof LinearLayout) {
                linearLayout = a2;
            }
            LinearLayout linearLayout2 = (LinearLayout) linearLayout;
            if (linearLayout2 != null) {
                this.f121580a = linearLayout2;
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("View configuration error");
                MethodCollector.o(1092);
                throw illegalArgumentException;
            }
        } else {
            ViewStub viewStub = this.f121588i;
            if (viewStub != null) {
                viewStub.setLayoutResource(R.layout.axf);
                View inflate = this.f121588i.inflate();
                if (inflate instanceof LinearLayout) {
                    linearLayout = inflate;
                }
                LinearLayout linearLayout3 = linearLayout;
                if (linearLayout3 != null) {
                    this.f121580a = linearLayout3;
                } else {
                    IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("ViewStub configuration error");
                    MethodCollector.o(1092);
                    throw illegalArgumentException2;
                }
            }
        }
        d();
        e();
        MethodCollector.o(1092);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c2, code lost:
        if (r14 != null) goto L_0x003f;
     */
    @Override // com.ss.android.ugc.aweme.e.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.discover.model.SearchUser r14) {
        /*
        // Method dump skipped, instructions count: 208
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.q.c.a(com.ss.android.ugc.aweme.discover.model.SearchUser):void");
    }

    @Override // com.ss.android.ugc.aweme.e.a
    public final void a(com.ss.android.ugc.aweme.discover.mixfeed.b.a aVar, r rVar) {
        this.f121586g = aVar;
        this.f121587h = rVar;
    }

    private c(ViewStub viewStub, ViewGroup viewGroup) {
        this.f121588i = viewStub;
        this.f121589j = viewGroup;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ViewStub viewStub, ViewGroup viewGroup, int i2) {
        this((i2 & 1) != 0 ? null : viewStub, (i2 & 2) != 0 ? null : viewGroup);
    }
}
