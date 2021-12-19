package com.ss.android.ugc.aweme.utils;

import android.graphics.Rect;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;

public final class fo {

    /* renamed from: a  reason: collision with root package name */
    public boolean f142938a = true;

    /* renamed from: b  reason: collision with root package name */
    private final String f142939b = fo.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<String> f142940c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private final RecyclerView f142941d;

    /* renamed from: e  reason: collision with root package name */
    private final a f142942e;

    public interface a {
        static {
            Covode.recordClassIndex(93532);
        }

        void a(int i2, fo foVar);
    }

    static {
        Covode.recordClassIndex(93530);
    }

    public final void a() {
        int[] iArr;
        if (this.f142941d.getVisibility() == 0 && this.f142941d.isShown() && this.f142941d.getGlobalVisibleRect(new Rect())) {
            try {
                RecyclerView.i layoutManager = this.f142941d.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    iArr = new int[]{linearLayoutManager.l(), linearLayoutManager.n()};
                } else if (layoutManager instanceof GridLayoutManager) {
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                    iArr = new int[]{gridLayoutManager.l(), gridLayoutManager.n()};
                } else {
                    return;
                }
                int i2 = iArr[0];
                int i3 = iArr[1];
                if (i2 <= i3) {
                    while (true) {
                        try {
                            a aVar = this.f142942e;
                            if (aVar != null) {
                                aVar.a(i2, this);
                            }
                        } catch (Throwable unused) {
                        }
                        if (i2 != i3) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public final void a(String str, Runnable runnable) {
        l.d(str, "");
        l.d(runnable, "");
        if (!this.f142940c.contains(str)) {
            this.f142940c.add(str);
            runnable.run();
        }
    }

    public fo(RecyclerView recyclerView, a aVar) {
        l.d(recyclerView, "");
        this.f142941d = recyclerView;
        this.f142942e = aVar;
        recyclerView.a(new RecyclerView.n(this) {
            /* class com.ss.android.ugc.aweme.utils.fo.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ fo f142943a;

            static {
                Covode.recordClassIndex(93531);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f142943a = r1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.n
            public final void a(RecyclerView recyclerView, int i2) {
                l.d(recyclerView, "");
                if (i2 == 0) {
                    this.f142943a.a();
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.n
            public final void a(RecyclerView recyclerView, int i2, int i3) {
                l.d(recyclerView, "");
                if (this.f142943a.f142938a) {
                    this.f142943a.f142938a = false;
                    this.f142943a.a();
                }
            }
        });
    }
}
