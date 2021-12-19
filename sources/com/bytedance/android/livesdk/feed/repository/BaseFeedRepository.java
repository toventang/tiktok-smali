package com.bytedance.android.livesdk.feed.repository;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.android.live.core.a.b;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.feed.a;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.h;
import com.bytedance.android.livesdk.feed.n;
import com.bytedance.android.livesdk.feed.r;
import com.bytedance.android.livesdk.feed.t;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import f.a.l.c;

public abstract class BaseFeedRepository implements com.bytedance.android.livesdk.feed.a, r<FeedItem>, au {

    /* renamed from: a  reason: collision with root package name */
    protected n f17594a;

    /* renamed from: b  reason: collision with root package name */
    protected final b<FeedDataKey, FeedItem> f17595b;

    /* renamed from: c  reason: collision with root package name */
    public c<a> f17596c = new c<>();

    /* renamed from: d  reason: collision with root package name */
    public c<a> f17597d = new c<>();

    /* renamed from: e  reason: collision with root package name */
    private h f17598e;

    /* renamed from: f  reason: collision with root package name */
    private final f.a.b.a f17599f = new f.a.b.a();

    /* renamed from: g  reason: collision with root package name */
    private t f17600g;

    static {
        Covode.recordClassIndex(9760);
    }

    public abstract FeedDataKey h();

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_CREATE) {
            registerFeedRepository();
        } else if (aVar == i.a.ON_DESTROY) {
            unRegisterFeedRepository();
        }
    }

    private static boolean a() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean b() {
        if (j.f107226e && j.b() && !j.c()) {
            return j.f107226e;
        }
        boolean a2 = a();
        j.f107226e = a2;
        return a2;
    }

    @v(a = i.a.ON_CREATE)
    public void registerFeedRepository() {
        if (h() != null) {
            this.f17598e.a(h(), this);
        }
    }

    @v(a = i.a.ON_DESTROY)
    public void unRegisterFeedRepository() {
        if (this.f17598e.a(h())) {
            f();
            this.f17599f.a();
        }
    }

    public enum a {
        START,
        SUCCESS,
        FAIL;

        static {
            Covode.recordClassIndex(9761);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(f.a.b.b bVar) {
        this.f17599f.a(bVar);
    }

    public final void a(m mVar) {
        if (mVar != null) {
            mVar.getLifecycle().a(this);
        }
    }

    public BaseFeedRepository(h hVar, b<FeedDataKey, FeedItem> bVar) {
        this.f17598e = hVar;
        this.f17594a = null;
        this.f17595b = bVar;
    }

    @Override // com.bytedance.android.livesdk.feed.a
    public final void b(a.EnumC0361a aVar, String str) {
        if (aVar == a.EnumC0361a.REFRESH) {
            this.f17596c.onNext(a.SUCCESS);
            if (this.f17594a != null) {
                h();
                TextUtils.equals(str, "enter_auto");
            }
            t tVar = this.f17600g;
            if (tVar != null) {
                tVar.a("refresh");
            }
        } else if (aVar == a.EnumC0361a.LOAD_MORE) {
            this.f17597d.onNext(a.SUCCESS);
            if (this.f17594a != null) {
                h();
            }
            t tVar2 = this.f17600g;
            if (tVar2 != null) {
                tVar2.a("load_more");
            }
        }
    }

    @Override // com.bytedance.android.livesdk.feed.a
    public final void a(a.EnumC0361a aVar, String str) {
        t tVar = new t();
        this.f17600g = tVar;
        tVar.f17653a = SystemClock.uptimeMillis();
        if (aVar == a.EnumC0361a.REFRESH) {
            this.f17596c.onNext(a.START);
            if (this.f17594a != null) {
                h();
                TextUtils.equals(str, "enter_auto");
            }
        } else if (aVar == a.EnumC0361a.LOAD_MORE) {
            this.f17597d.onNext(a.START);
            t tVar2 = this.f17600g;
            if (tVar2 != null) {
                tVar2.f17653a = SystemClock.uptimeMillis();
            }
            if (this.f17594a != null) {
                h();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.feed.a
    public final void a(a.EnumC0361a aVar, String str, Throwable th) {
        if (aVar == a.EnumC0361a.REFRESH) {
            this.f17596c.onNext(a.FAIL);
            if (this.f17594a != null) {
                h();
                TextUtils.equals(str, "enter_auto");
            }
            if (this.f17600g != null) {
                y.e();
                if (b()) {
                    this.f17600g.a("refresh", th);
                }
            }
        } else if (aVar == a.EnumC0361a.LOAD_MORE) {
            this.f17597d.onNext(a.FAIL);
            if (this.f17594a != null) {
                h();
            }
            if (this.f17600g != null) {
                y.e();
                if (b()) {
                    this.f17600g.a("load_more", th);
                }
            }
        }
    }
}
