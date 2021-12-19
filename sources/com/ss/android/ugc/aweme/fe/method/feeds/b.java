package com.ss.android.ugc.aweme.fe.method.feeds;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.o;
import com.ss.android.ugc.aweme.fe.method.feeds.b.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.util.List;
import org.json.JSONObject;

public final class b extends com.ss.android.ugc.aweme.common.e.a<Aweme, a> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91296a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private int f91297b;

    /* renamed from: c  reason: collision with root package name */
    private final String f91298c;

    /* renamed from: d  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.fe.method.feeds.api.a f91299d;

    static {
        Covode.recordClassIndex(57461);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57462);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static b a(com.ss.android.ugc.aweme.fe.method.feeds.b.a aVar, String str, com.ss.android.ugc.aweme.fe.method.feeds.api.a aVar2) {
            l.d(aVar, "");
            l.d(str, "");
            l.d(aVar2, "");
            return new b(aVar, str, aVar2, (byte) 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final List<Aweme> getItems() {
        return ((a) this.mData).f91300a;
    }

    public final void a() {
        ((a) this.mData).f91300a.clear();
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isHasMore() {
        if (this.mData == null || !((a) this.mData).f91301b) {
            return false;
        }
        return true;
    }

    private void b() {
        com.ss.android.ugc.aweme.fe.method.feeds.api.a aVar = this.f91299d;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("page", this.f91297b + 1);
        jSONObject2.put("react_id", this.f91298c);
        jSONObject.put("data", jSONObject2);
        jSONObject.put("eventName", "load_feeds_more");
        aVar.b("notification", jSONObject);
    }

    private final void c() {
        this.mIsLoading = false;
        List<o> list = this.mNotifyListeners;
        if (list != null) {
            for (o oVar : list) {
                if (oVar != null) {
                    oVar.a_(new Exception());
                }
            }
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
        b();
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        l.d(objArr, "");
        b();
    }

    private b(a aVar, String str, com.ss.android.ugc.aweme.fe.method.feeds.api.a aVar2) {
        this.f91298c = str;
        this.f91299d = aVar2;
        this.mData = aVar;
    }

    public /* synthetic */ b(a aVar, String str, com.ss.android.ugc.aweme.fe.method.feeds.api.a aVar2, byte b2) {
        this(aVar, str, aVar2);
    }

    public final void a(List<? extends Aweme> list, int i2, boolean z, boolean z2) {
        l.d(list, "");
        if (list.isEmpty()) {
            c();
            return;
        }
        this.f91297b = i2;
        T t = this.mData;
        if (t != null) {
            this.mIsNewDataEmpty = t.f91300a.isEmpty();
            ((a) this.mData).f91301b = z;
            if (z2) {
                ((a) this.mData).f91300a.addAll(0, list);
            } else {
                ((a) this.mData).f91300a.addAll(list);
            }
        }
        this.mIsLoading = false;
        List<o> list2 = this.mNotifyListeners;
        if (list2 != null) {
            for (o oVar : list2) {
                if (oVar != null) {
                    oVar.c();
                }
            }
        }
    }
}
