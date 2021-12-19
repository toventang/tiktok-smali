package com.bytedance.android.live.design.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.zhiliaoapp.musically.R;

public class h {

    /* renamed from: a  reason: collision with root package name */
    protected Context f9456a;

    /* renamed from: b  reason: collision with root package name */
    protected View f9457b;

    /* renamed from: c  reason: collision with root package name */
    protected View f9458c;

    /* renamed from: d  reason: collision with root package name */
    protected int f9459d;

    /* renamed from: e  reason: collision with root package name */
    protected int f9460e;

    /* renamed from: f  reason: collision with root package name */
    protected int f9461f;

    /* renamed from: g  reason: collision with root package name */
    protected long f9462g;

    /* renamed from: h  reason: collision with root package name */
    protected int f9463h;

    /* renamed from: i  reason: collision with root package name */
    protected boolean f9464i;

    /* renamed from: j  reason: collision with root package name */
    protected c f9465j;

    /* renamed from: k  reason: collision with root package name */
    protected b f9466k;

    static {
        Covode.recordClassIndex(4816);
    }

    public static class a<T extends a<T>> {

        /* renamed from: b  reason: collision with root package name */
        protected Context f9467b;

        /* renamed from: c  reason: collision with root package name */
        protected View f9468c;

        /* renamed from: d  reason: collision with root package name */
        protected View f9469d;

        /* renamed from: e  reason: collision with root package name */
        protected int f9470e = 48;

        /* renamed from: f  reason: collision with root package name */
        protected int f9471f;

        /* renamed from: g  reason: collision with root package name */
        protected int f9472g;

        /* renamed from: h  reason: collision with root package name */
        protected long f9473h;

        /* renamed from: i  reason: collision with root package name */
        protected boolean f9474i;

        /* renamed from: j  reason: collision with root package name */
        protected int f9475j;

        /* renamed from: k  reason: collision with root package name */
        protected boolean f9476k;

        /* renamed from: l  reason: collision with root package name */
        protected c f9477l;

        /* renamed from: m  reason: collision with root package name */
        protected b f9478m;
        protected boolean n = true;

        static {
            Covode.recordClassIndex(4817);
        }

        public final T d() {
            this.n = false;
            return this;
        }

        public final T c() {
            this.f9470e = 80;
            return this;
        }

        public h b() {
            return new h(this);
        }

        public T a(View view) {
            this.f9469d = view;
            return this;
        }

        public final T a(long j2) {
            this.f9473h = j2;
            this.f9474i = true;
            return this;
        }

        public final T b(int i2) {
            this.f9475j = i2;
            this.f9476k = true;
            return this;
        }

        public final T a(b bVar) {
            this.f9478m = bVar;
            return this;
        }

        public a(View view) {
            this.f9468c = view;
            if (view != null) {
                this.f9467b = view.getContext();
            }
        }

        public final T a(c cVar) {
            this.f9477l = cVar;
            return this;
        }
    }

    protected h(a<?> aVar) {
        Context context = aVar.f9467b;
        this.f9456a = context;
        if (context != null) {
            if (!aVar.f9474i) {
                this.f9462g = (long) a(this.f9456a.getResources());
            } else {
                this.f9462g = aVar.f9473h;
            }
            if (!aVar.f9476k) {
                this.f9463h = this.f9456a.getResources().getDimensionPixelSize(R.dimen.z5);
            } else {
                this.f9463h = aVar.f9475j;
            }
        }
        this.f9457b = aVar.f9468c;
        this.f9458c = aVar.f9469d;
        this.f9459d = aVar.f9470e;
        this.f9460e = aVar.f9471f;
        this.f9461f = aVar.f9472g;
        this.f9464i = aVar.n;
        this.f9465j = aVar.f9477l;
        this.f9466k = aVar.f9478m;
    }

    private static int a(Resources resources) {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(R.integer.bi);
        if (matchConfig == null) {
            return resources.getInteger(R.integer.bi);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(R.integer.bi);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i2 = 0; i2 < min; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(R.integer.bi);
        }
    }
}
