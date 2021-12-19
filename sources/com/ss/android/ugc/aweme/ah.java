package com.ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.api.AnchorApi;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.ss.android.ugc.aweme.base.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class ah extends com.ss.android.ugc.aweme.common.e.a<AnchorCell, com.ss.android.ugc.aweme.api.resp.b> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f66302b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f66303a;

    /* renamed from: c  reason: collision with root package name */
    private List<AnchorCell> f66304c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private int f66305d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f66306e;

    static {
        Covode.recordClassIndex(40735);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40736);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final List<AnchorCell> getItems() {
        return this.f66304c;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isHasMore() {
        return this.f66306e;
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ah f66311a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f66312b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f66313c;

        static {
            Covode.recordClassIndex(40737);
        }

        b(ah ahVar, String str, int i2) {
            this.f66311a = ahVar;
            this.f66312b = str;
            this.f66313c = i2;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            int i2 = this.f66311a.f66303a;
            String str = this.f66312b;
            int i3 = this.f66313c;
            l.d(str, "");
            com.ss.android.ugc.aweme.api.resp.b bVar = ((AnchorApi.RealApi) AnchorApi.f66431a.a(AnchorApi.RealApi.class)).getAnchorSearchResponse(i2, str, i3, 20).get();
            l.b(bVar, "");
            return bVar;
        }
    }

    public ah(int i2) {
        this.f66303a = i2;
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        l.d(objArr, "");
        if (objArr.length == 2) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void loadMoreList(Object... objArr) {
        l.d(objArr, "");
        int i2 = this.f66305d;
        Object obj = objArr[1];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
        a(i2, (String) obj);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        l.d(objArr, "");
        Object obj = objArr[1];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
        a(0, (String) obj);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final /* synthetic */ void handleData(Object obj) {
        com.ss.android.ugc.aweme.api.resp.b bVar = (com.ss.android.ugc.aweme.api.resp.b) obj;
        if (bVar != null) {
            if (this.mListQueryType == 1) {
                this.f66304c.clear();
            }
            List<AnchorCell> list = bVar.f66468a;
            if (list == null || list.isEmpty()) {
                this.f66306e = false;
                this.f66304c.clear();
                return;
            }
            this.f66306e = bVar.f66469b;
            List<AnchorCell> list2 = this.f66304c;
            List<AnchorCell> list3 = bVar.f66468a;
            if (list3 == null) {
                l.b();
            }
            list2.addAll(list3);
            this.f66305d++;
        }
    }

    private final void a(int i2, String str) {
        n.a().a(this.mHandler, new b(this, str, i2), 0);
    }
}
