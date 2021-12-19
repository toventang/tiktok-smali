package com.ss.android.ugc.aweme.search.l;

import android.view.View;
import android.view.ViewParent;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.mixfeed.ui.SearchRecyclerView;

public final class j {
    static {
        Covode.recordClassIndex(79104);
    }

    public static SearchRecyclerView a(View view) {
        if (view == null) {
            return null;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof SearchRecyclerView) {
                return (SearchRecyclerView) parent;
            }
        }
        return null;
    }

    public static void a(final View view, final Runnable runnable) {
        SearchRecyclerView a2 = a(view);
        if (a2 != null || v.y(view)) {
            a(a2, runnable);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                /* class com.ss.android.ugc.aweme.search.l.j.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(79105);
                }

                public final void onViewDetachedFromWindow(View view) {
                    view.removeOnAttachStateChangeListener(this);
                }

                public final void onViewAttachedToWindow(View view) {
                    view.removeOnAttachStateChangeListener(this);
                    j.a(j.a(view), runnable);
                }
            });
        }
    }

    public static void a(final SearchRecyclerView searchRecyclerView, final Runnable runnable) {
        if (searchRecyclerView == null || searchRecyclerView.getVisibility() == 0) {
            runnable.run();
        } else {
            searchRecyclerView.a(new SearchRecyclerView.a() {
                /* class com.ss.android.ugc.aweme.search.l.j.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(79106);
                }

                @Override // com.ss.android.ugc.aweme.discover.mixfeed.ui.SearchRecyclerView.a
                public final void a() {
                    runnable.run();
                    searchRecyclerView.R.a().remove(this);
                }
            });
        }
    }
}
