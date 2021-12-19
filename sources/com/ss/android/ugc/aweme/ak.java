package com.ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.api.AnchorApi;
import com.ss.android.ugc.aweme.api.resp.c;
import com.ss.android.ugc.aweme.base.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class ak extends com.ss.android.ugc.aweme.common.e.a<Object, c> {

    /* renamed from: g  reason: collision with root package name */
    public static final a f66350g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final List<Object> f66351a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public List<com.ss.android.ugc.aweme.api.model.a> f66352b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public List<Object> f66353c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f66354d;

    /* renamed from: e  reason: collision with root package name */
    public String f66355e;

    /* renamed from: f  reason: collision with root package name */
    public final int f66356f;

    /* renamed from: h  reason: collision with root package name */
    private int f66357h = 1;

    /* renamed from: i  reason: collision with root package name */
    private boolean f66358i;

    static {
        Covode.recordClassIndex(40770);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40771);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final List<Object> getItems() {
        return this.f66351a;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isHasMore() {
        return this.f66358i;
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ak f66359a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f66360b;

        static {
            Covode.recordClassIndex(40772);
        }

        b(ak akVar, int i2) {
            this.f66359a = akVar;
            this.f66360b = i2;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            c cVar = ((AnchorApi.RealApi) AnchorApi.f66431a.a(AnchorApi.RealApi.class)).getAnchorSelectionResponse(this.f66359a.f66356f, 0, this.f66360b, 20).get();
            l.b(cVar, "");
            return cVar;
        }
    }

    public final int a() {
        Integer num;
        int i2 = 0;
        for (Object obj : this.f66351a) {
            if ((obj instanceof com.ss.android.ugc.aweme.api.model.a) && (num = ((com.ss.android.ugc.aweme.api.model.a) obj).f66463a) != null && num.intValue() == 2) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    private final void a(int i2) {
        n.a().a(this.mHandler, new b(this, i2), 0);
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
        a(this.f66357h);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        l.d(objArr, "");
        a(0);
    }

    public ak(int i2) {
        this.f66356f = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c6, code lost:
        if (r0 != null) goto L_0x00c8;
     */
    @Override // com.ss.android.ugc.aweme.common.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void handleData(java.lang.Object r11) {
        /*
        // Method dump skipped, instructions count: 390
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ak.handleData(java.lang.Object):void");
    }
}
