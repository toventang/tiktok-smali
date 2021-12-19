package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.search.activity.SearchResultActivity;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public final class gu {

    /* renamed from: a  reason: collision with root package name */
    public static int f143031a = b.a().a(true, "search_result_activity_limit", 6);

    /* renamed from: b  reason: collision with root package name */
    public static Queue<List<SearchResultActivity>> f143032b = new LinkedList();

    /* renamed from: c  reason: collision with root package name */
    public static final gu f143033c = new gu();

    private gu() {
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f143034a;

        static {
            Covode.recordClassIndex(93610);
        }

        a(Activity activity) {
            this.f143034a = activity;
        }

        public final void run() {
            gu.a(this.f143034a);
        }
    }

    public static List<SearchResultActivity> b() {
        List<SearchResultActivity> list = (List) n.f((Iterable) f143032b);
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    public static SearchResultActivity a() {
        List<SearchResultActivity> b2 = b();
        if (b2 == null || b2.isEmpty()) {
            return null;
        }
        return b2.get(b2.size() - 1);
    }

    static {
        Covode.recordClassIndex(93609);
    }

    public static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public static void b(Activity activity) {
        new Handler(Looper.getMainLooper()).postDelayed(new a(activity), 500);
    }

    public static boolean a(e eVar) {
        l.d(eVar, "");
        Iterator<T> it = f143032b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            l.b(next, "");
            Iterator it2 = next.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (l.a(it2.next(), eVar)) {
                        if (next.size() > 1) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void a(Activity activity) {
        for (T t : f143032b) {
            l.b(t, "");
            Iterator it = t.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (l.a(it.next(), activity)) {
                        Iterator it2 = t.iterator();
                        while (it2.hasNext()) {
                            SearchResultActivity searchResultActivity = (SearchResultActivity) it2.next();
                            if (!l.a(searchResultActivity, activity)) {
                                it2.remove();
                                searchResultActivity.finish();
                            }
                        }
                        return;
                    }
                }
            }
        }
    }

    public static void a(SearchResultActivity searchResultActivity) {
        l.d(searchResultActivity, "");
        if (!f143032b.isEmpty()) {
            Iterator<List<SearchResultActivity>> it = f143032b.iterator();
            while (it.hasNext()) {
                List<SearchResultActivity> next = it.next();
                Iterator<SearchResultActivity> it2 = next.iterator();
                while (it2.hasNext()) {
                    if (l.a(it2.next(), searchResultActivity)) {
                        it2.remove();
                    }
                }
                if (next.size() == 0) {
                    it.remove();
                }
            }
        }
    }
}
