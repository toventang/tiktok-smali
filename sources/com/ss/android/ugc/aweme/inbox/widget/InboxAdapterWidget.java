package com.ss.android.ugc.aweme.inbox.widget;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import h.a.n;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class InboxAdapterWidget implements m, au {

    /* renamed from: g  reason: collision with root package name */
    public static final List<b> f104365g = n.b(b.EMPTY, b.SUCCESS, b.FAIL);

    /* renamed from: h  reason: collision with root package name */
    public static final a f104366h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private final t<Boolean> f104367a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    private final LiveData<Boolean> f104368b;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, String> f104369d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public final Fragment f104370e;

    /* renamed from: f  reason: collision with root package name */
    public final LiveData<b> f104371f;

    public enum b {
        EMPTY,
        SUCCESS,
        FAIL,
        LOADING;

        static {
            Covode.recordClassIndex(66839);
        }
    }

    public abstract int a(int i2);

    public void a(int i2, b bVar) {
        l.d(bVar, "");
    }

    public void a(ad.b bVar) {
        l.d(bVar, "");
    }

    public abstract LiveData<b> f();

    public abstract RecyclerView.a<?> g();

    @Override // androidx.lifecycle.m
    public i getLifecycle() {
        return this.f104370e.getLifecycle();
    }

    public abstract void h();

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66838);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public t<Boolean> bq_() {
        return this.f104367a;
    }

    public LiveData<Boolean> e() {
        return this.f104368b;
    }

    static {
        Covode.recordClassIndex(66837);
    }

    public String toString() {
        return "[widget: (" + getClass().getSimpleName() + ")] state: " + f().getValue() + ", isExpanded: " + bq_().getValue();
    }

    public InboxAdapterWidget(Fragment fragment, LiveData<b> liveData) {
        l.d(fragment, "");
        l.d(liveData, "");
        this.f104370e = fragment;
        this.f104371f = liveData;
    }
}
