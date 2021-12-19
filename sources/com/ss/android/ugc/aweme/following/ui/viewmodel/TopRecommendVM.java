package com.ss.android.ugc.aweme.following.ui.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ac;
import com.bytedance.android.widget.d;
import com.bytedance.covode.number.Covode;
import h.z;
import java.util.concurrent.atomic.AtomicBoolean;

public final class TopRecommendVM extends ac {

    /* renamed from: h  reason: collision with root package name */
    public static final a f96647h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f96648a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public boolean f96649b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f96650c = true;

    /* renamed from: d  reason: collision with root package name */
    public final d<z> f96651d;

    /* renamed from: e  reason: collision with root package name */
    public final LiveData<z> f96652e;

    /* renamed from: f  reason: collision with root package name */
    public final d<Boolean> f96653f;

    /* renamed from: g  reason: collision with root package name */
    public final LiveData<Boolean> f96654g;

    static {
        Covode.recordClassIndex(61296);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(61297);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public TopRecommendVM() {
        d<z> dVar = new d<>();
        this.f96651d = dVar;
        this.f96652e = dVar;
        d<Boolean> dVar2 = new d<>();
        this.f96653f = dVar2;
        this.f96654g = dVar2;
    }

    public final boolean a() {
        Boolean value;
        if (!this.f96648a.get() || (value = this.f96653f.getValue()) == null || !value.booleanValue()) {
            return false;
        }
        return true;
    }

    public final void a(boolean z) {
        if (z) {
            if (a()) {
                return;
            }
        } else if (!a()) {
            return;
        }
        if (!this.f96649b) {
            this.f96653f.setValue(Boolean.valueOf(z));
        }
    }
}
