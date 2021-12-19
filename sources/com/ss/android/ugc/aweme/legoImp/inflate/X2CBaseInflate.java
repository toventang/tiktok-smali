package com.ss.android.ugc.aweme.legoImp.inflate;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.a.b.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.q;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.main.MainPageServiceImpl;
import java.util.ArrayList;
import java.util.List;

public abstract class X2CBaseInflate implements q {

    /* renamed from: a  reason: collision with root package name */
    private int f107678a = -1;

    /* renamed from: b  reason: collision with root package name */
    private w f107679b = new w() {
        /* class com.ss.android.ugc.aweme.legoImp.inflate.X2CBaseInflate.AnonymousClass2 */

        static {
            Covode.recordClassIndex(68888);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final int bK_() {
            return 1048575;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ad f() {
            return x.a(this);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String g() {
            return "task_";
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final boolean i() {
            return true;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final List j() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.lego.w
        public final ae b() {
            return ae.BOOT_FINISH;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ab k() {
            return ab.DEFAULT;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String h() {
            return getClass().getSimpleName();
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final void a(Context context) {
            X2CBaseInflate.this.l();
        }
    };

    /* renamed from: e  reason: collision with root package name */
    protected List<SparseArray<View>> f107680e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public boolean f107681f = false;

    static {
        Covode.recordClassIndex(68886);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    /* access modifiers changed from: protected */
    public int c() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public abstract int[] d();

    /* access modifiers changed from: protected */
    public boolean e() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "inflate_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return ad.INFLATE;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.q
    public final Class<? extends Activity> b() {
        return MainPageServiceImpl.b().a();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public String h() {
        return getClass().getSimpleName();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void o() {
        synchronized (this.f107680e) {
            this.f107680e.clear();
        }
    }

    /* access modifiers changed from: protected */
    public final void l() {
        this.f107681f = true;
        new Handler(Looper.getMainLooper()).post(new d(this));
    }

    /* access modifiers changed from: protected */
    public final boolean m() {
        if (this.f107678a == -1) {
            this.f107678a = f.f107691b;
        }
        if (this.f107678a == -2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean n() {
        if (this.f107678a == -1) {
            this.f107678a = f.f107691b;
        }
        if (this.f107678a == 2) {
            return true;
        }
        return false;
    }

    public View a(Context context, int i2) {
        if (n()) {
            for (SparseArray<View> sparseArray : this.f107680e) {
                View view = sparseArray.get(i2);
                if (view != null) {
                    sparseArray.remove(i2);
                    return view;
                }
            }
            return a.a(context, i2, new FrameLayout(context), false);
        } else if (m()) {
            return com.a.a(LayoutInflater.from(context), i2, new FrameLayout(context), false);
        } else {
            return a.a(context, i2, new FrameLayout(context), false);
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.q
    public void a(Context context, Activity activity) {
        if (activity != null && n()) {
            for (int i2 = 0; i2 < c(); i2++) {
                SparseArray<View> sparseArray = new SparseArray<>();
                synchronized (this.f107680e) {
                    this.f107680e.add(sparseArray);
                }
            }
            for (SparseArray<View> sparseArray2 : this.f107680e) {
                int[] d2 = d();
                for (int i3 : d2) {
                    sparseArray2.put(i3, a.a(activity, i3, new FrameLayout(activity), false));
                }
            }
            if (e()) {
                final int hashCode = activity.hashCode();
                f.f().d(new f.a.d.f<Activity>() {
                    /* class com.ss.android.ugc.aweme.legoImp.inflate.X2CBaseInflate.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(68887);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Activity activity) {
                        if (!X2CBaseInflate.this.f107681f && activity.hashCode() == hashCode) {
                            X2CBaseInflate.this.l();
                        }
                    }
                });
                return;
            }
            new f.c().b(this.f107679b).a();
        }
    }
}
