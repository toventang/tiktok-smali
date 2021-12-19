package com.ss.android.ugc.aweme.common.widget.scrollablelayout;

import android.os.Build;
import android.view.View;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public View f76604a;

    /* renamed from: b  reason: collision with root package name */
    public AbstractC1744a f76605b;

    /* renamed from: c  reason: collision with root package name */
    private int f76606c = Build.VERSION.SDK_INT;

    /* renamed from: com.ss.android.ugc.aweme.common.widget.scrollablelayout.a$a  reason: collision with other inner class name */
    public interface AbstractC1744a {
        static {
            Covode.recordClassIndex(47292);
        }

        View m();
    }

    public interface b {
        static {
            Covode.recordClassIndex(47293);
        }

        boolean q();
    }

    static {
        Covode.recordClassIndex(47291);
    }

    public final boolean b() {
        View a2 = a();
        if (a2 == null) {
            return false;
        }
        if (a2 instanceof AdapterView) {
            return a((AdapterView) a2);
        }
        if (a2 instanceof ScrollView) {
            return a((ScrollView) a2);
        }
        if (a2 instanceof b) {
            return ((b) a2).q();
        }
        if (a2 instanceof RecyclerView) {
            return a((RecyclerView) a2);
        }
        if (a2 instanceof WebView) {
            return a((WebView) a2);
        }
        throw new IllegalStateException("scrollableView must be a instance of AdapterView|ScrollView|RecyclerView");
    }

    public final View a() {
        AbstractC1744a aVar = this.f76605b;
        if (aVar == null) {
            return this.f76604a;
        }
        return aVar.m();
    }

    private static boolean a(WebView webView) {
        if (webView == null || webView.getScrollY() > 0) {
            return false;
        }
        return true;
    }

    private static boolean a(AdapterView adapterView) {
        if (adapterView != null) {
            int firstVisiblePosition = adapterView.getFirstVisiblePosition();
            View childAt = adapterView.getChildAt(0);
            if (childAt == null) {
                return true;
            }
            if (firstVisiblePosition == 0 && childAt.getTop() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    private static boolean a(ScrollView scrollView) {
        if (scrollView == null || scrollView.getScrollY() > 0) {
            return false;
        }
        return true;
    }

    private static boolean a(RecyclerView recyclerView) {
        if (recyclerView == null || recyclerView.canScrollVertically(-1)) {
            return false;
        }
        return true;
    }

    public final void a(int i2, int i3, int i4) {
        View a2 = a();
        if (a2 instanceof AbsListView) {
            AbsListView absListView = (AbsListView) a2;
            if (this.f76606c >= 21) {
                absListView.fling(i2);
            } else {
                absListView.smoothScrollBy(i3, i4);
            }
        } else if (a2 instanceof ScrollView) {
            ((ScrollView) a2).fling(i2);
        } else if (a2 instanceof RecyclerView) {
            ((RecyclerView) a2).b(0, i2);
        } else if (a2 instanceof WebView) {
            ((WebView) a2).flingScroll(0, i2);
        }
    }
}
