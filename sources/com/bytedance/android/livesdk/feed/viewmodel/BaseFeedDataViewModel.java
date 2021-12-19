package com.bytedance.android.livesdk.feed.viewmodel;

import android.text.TextUtils;
import androidx.lifecycle.t;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.media.d;
import com.bytedance.android.live.base.model.user.b;
import com.bytedance.android.live.core.paging.b;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.feed.a;
import com.bytedance.android.livesdk.feed.i;
import com.bytedance.android.livesdk.feed.l;
import com.bytedance.android.livesdk.feed.repository.BaseFeedRepository;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.covode.number.Covode;
import java.util.List;

public class BaseFeedDataViewModel extends PagingViewModel<FeedItem> {

    /* renamed from: a  reason: collision with root package name */
    public l f17697a;

    /* renamed from: i  reason: collision with root package name */
    public t<Integer> f17698i = new t<>();

    /* renamed from: j  reason: collision with root package name */
    public t<d> f17699j = new t<>();

    /* renamed from: k  reason: collision with root package name */
    public t<Integer> f17700k = new t<>();

    /* renamed from: l  reason: collision with root package name */
    public t<Integer> f17701l = new t<>();

    /* renamed from: m  reason: collision with root package name */
    public t<List<ImageModel>> f17702m = new t<>();
    public t<BaseFeedRepository.a> n = new t<>();
    public t<BaseFeedRepository.a> o = new t<>();
    protected b<FeedItem> p;
    protected String q;
    public int r;
    public int s;
    protected String t;
    public FeedDataKey u;
    public t<b.a> v = new t<>();
    private a<com.bytedance.android.live.core.paging.b<FeedItem>, com.bytedance.android.livesdk.feed.feed.b> w;
    private com.bytedance.android.livesdk.feed.feed.b x;
    private com.bytedance.android.livesdk.feed.g.a y;
    private long z;

    static {
        Covode.recordClassIndex(9819);
    }

    public boolean g() {
        return false;
    }

    /* access modifiers changed from: protected */
    public String d() {
        return this.q;
    }

    public final FeedDataKey e() {
        if (this.u == null) {
            this.u = f();
        }
        return this.u;
    }

    /* access modifiers changed from: protected */
    public FeedDataKey f() {
        return FeedDataKey.a(this.t, d(), this.z);
    }

    @Override // com.bytedance.android.live.core.paging.viewmodel.PagingViewModel
    public final boolean a() {
        boolean a2 = super.a();
        if (a2) {
            this.f17698i.setValue(0);
            com.bytedance.android.b.a.a.f6785g.d();
        }
        return a2;
    }

    public void c() {
        try {
            a<com.bytedance.android.live.core.paging.b<FeedItem>, com.bytedance.android.livesdk.feed.feed.b> a2 = this.f17697a.a(d());
            this.w = a2;
            this.p = a2.f17461a;
            N n2 = this.w.f17462b;
            this.x = n2;
            n2.f17463a.observeForever(new a(this));
            this.x.f17464b.observeForever(new b(this));
            a(this.p);
            this.o.observeForever(new c(this));
            a(this.f17697a.a().a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new d(this), e.f17716a));
            a(this.f17697a.b().a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f(this), g.f17718a));
            l lVar = this.f17697a;
            if (lVar instanceof BaseFeedRepository) {
                a(((BaseFeedRepository) lVar).f17596c.a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new h(this), i.f17720a));
                a(((BaseFeedRepository) this.f17697a).f17597d.a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new j(this), k.f17722a));
            }
        } catch (Exception unused) {
        }
    }

    public final boolean a(String str) {
        this.f17697a.a(str, null);
        b(str);
        return a();
    }

    /* access modifiers changed from: package-private */
    public final void b(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "enter_auto") && !TextUtils.equals(str, "detail_loadmore") && this.y.a()) {
            Integer value = this.f17700k.getValue();
            if (value == null) {
                this.f17700k.setValue(1);
            } else {
                this.f17700k.setValue(Integer.valueOf(value.intValue() + 1));
            }
        }
    }

    public BaseFeedDataViewModel(l lVar, i iVar, com.bytedance.android.livesdk.feed.g.a aVar) {
        this.f17697a = lVar;
        if (iVar != null) {
            this.q = iVar.a();
            this.r = 10;
            this.s = iVar.c();
            this.t = iVar.b();
            this.y = aVar;
            this.z = 0;
            this.f17697a.a(new l.a() {
                /* class com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(9820);
                }

                @Override // com.bytedance.android.livesdk.feed.l.a
                public final FeedDataKey a() {
                    return BaseFeedDataViewModel.this.e();
                }

                @Override // com.bytedance.android.livesdk.feed.l.a
                public final int b() {
                    return BaseFeedDataViewModel.this.r;
                }

                @Override // com.bytedance.android.livesdk.feed.l.a
                public final int c() {
                    return BaseFeedDataViewModel.this.s;
                }
            });
        }
    }
}
