package com.ss.android.ugc.aweme.liveevent;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.liveevent.LiveEventApi;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class i extends com.ss.android.ugc.aweme.common.e.a<Object, k> {

    /* renamed from: f  reason: collision with root package name */
    public static final a f108677f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    List<j> f108678a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public List<Object> f108679b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public boolean f108680c;

    /* renamed from: d  reason: collision with root package name */
    public String f108681d;

    /* renamed from: e  reason: collision with root package name */
    public final int f108682e;

    /* renamed from: g  reason: collision with root package name */
    private int f108683g = 1;

    /* renamed from: h  reason: collision with root package name */
    private final List<Object> f108684h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private boolean f108685i;

    static {
        Covode.recordClassIndex(69643);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(69644);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final List<Object> getItems() {
        return this.f108684h;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isHasMore() {
        return this.f108685i;
    }

    private final void a() {
        n.a().a(this.mHandler, b.f108686a, 0);
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final b f108686a = new b();

        static {
            Covode.recordClassIndex(69645);
        }

        b() {
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            com.ss.android.ugc.aweme.account.b.a();
            IAccountUserService e2 = com.ss.android.ugc.aweme.account.b.f62864a.e();
            l.b(e2, "");
            String curUserId = e2.getCurUserId();
            l.b(curUserId, "");
            l.d(curUserId, "");
            k kVar = ((LiveEventApi.RealApi) LiveEventApi.f108633a.a(LiveEventApi.RealApi.class)).getAnchorSelectionResponse(curUserId, 2, 0, 100).get();
            l.b(kVar, "");
            return kVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        l.d(objArr, "");
        if (objArr.length == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void loadMoreList(Object... objArr) {
        l.d(objArr, "");
        a();
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        l.d(objArr, "");
        a();
    }

    public i(int i2) {
        this.f108682e = i2;
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final /* synthetic */ void handleData(Object obj) {
        k kVar = (k) obj;
        if (kVar != null) {
            this.f108680c = false;
            if (this.mListQueryType == 1) {
                this.f108683g = 1;
                this.f108678a.clear();
                this.f108684h.clear();
                this.f108678a.addAll(kVar.f108696e);
                this.f108685i = false;
            }
            this.f108684h.addAll(this.f108678a);
        }
    }
}
