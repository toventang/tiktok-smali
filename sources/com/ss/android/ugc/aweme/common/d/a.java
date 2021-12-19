package com.ss.android.ugc.aweme.common.d;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.challenge.ui.z;
import com.ss.android.ugc.aweme.common.a.g;
import com.ss.android.ugc.aweme.lancet.j;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f76399a;

    /* renamed from: b  reason: collision with root package name */
    public z f76400b;

    static {
        Covode.recordClassIndex(47155);
    }

    public final void a() {
        RecyclerView recyclerView = this.f76399a;
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                RecyclerView.ViewHolder a2 = this.f76399a.a(this.f76399a.getChildAt(i2));
                if (a2.getItemViewType() == 0) {
                    g gVar = (g) a2;
                    gVar.a(false);
                    gVar.ak_();
                }
            }
        }
    }

    public a(RecyclerView recyclerView, z zVar) {
        this.f76400b = zVar;
        this.f76399a = recyclerView;
    }

    public final void a(final boolean z, boolean z2) {
        int i2;
        AnonymousClass1 r1 = new Runnable() {
            /* class com.ss.android.ugc.aweme.common.d.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(47156);
            }

            private static boolean a() {
                try {
                    return f.a.f68431a.c();
                } catch (Exception unused) {
                    return false;
                }
            }

            public final void run() {
                if (a.this.f76400b != null && a.this.f76399a != null) {
                    if (z) {
                        d.a();
                        if (!j.f107229h || !j.b() || j.c()) {
                            j.f107229h = a();
                        }
                        if (!j.f107229h) {
                            return;
                        }
                    }
                    a.this.f76400b.a(a.this.f76399a, z);
                }
            }
        };
        if (z2) {
            i2 = 100;
        } else {
            i2 = 0;
        }
        com.ss.android.b.a.a.a.a(r1, i2);
    }
}
