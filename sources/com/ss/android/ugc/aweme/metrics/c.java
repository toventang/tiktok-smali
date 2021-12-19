package com.ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.common.q;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.HotSearchInfo;
import com.ss.android.ugc.aweme.metrics.c;
import com.ss.android.ugc.aweme.profile.model.HotListStruct;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public abstract class c<E extends c> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f109551a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f109552b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private Map<String, Set<Object>> f109553c = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    protected final String f109554f;

    /* renamed from: g  reason: collision with root package name */
    public final Map<String, String> f109555g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    protected String f109556h;

    /* renamed from: i  reason: collision with root package name */
    protected String f109557i;

    /* renamed from: j  reason: collision with root package name */
    protected boolean f109558j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f109559k = false;

    /* renamed from: l  reason: collision with root package name */
    protected String f109560l;

    /* renamed from: m  reason: collision with root package name */
    protected String f109561m;
    protected String n;
    public Map<String, Object> o = new HashMap();

    static {
        Covode.recordClassIndex(70123);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public void d() {
    }

    public void e() {
        d();
        a();
        this.f109555g.putAll(this.f109552b);
    }

    public final void f() {
        e();
        com.ss.android.b.a.a.a.a(new d(this));
    }

    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f109562a = new a() {
            /* class com.ss.android.ugc.aweme.metrics.c.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(70125);
            }

            @Override // com.ss.android.ugc.aweme.metrics.c.a
            public final String a(String str) {
                if (TextUtils.isEmpty(str) || "null".equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: b  reason: collision with root package name */
        public static final a f109563b = new a() {
            /* class com.ss.android.ugc.aweme.metrics.c.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(70126);
            }

            @Override // com.ss.android.ugc.aweme.metrics.c.a
            public final String a(String str) {
                if (TextUtils.isEmpty(str) || "null".equals(str) || "0".equals(str)) {
                    return "";
                }
                return str;
            }
        };

        String a(String str);

        static {
            Covode.recordClassIndex(70124);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g() {
        try {
            if (this.f109559k) {
                JSONObject a2 = ac.a(this.f109555g);
                if (this.o.size() > 0) {
                    this.f109551a.putAll(this.f109555g);
                    this.f109551a.putAll(this.o);
                    a2 = ac.b(this.f109551a);
                }
                com.ss.android.common.c.a.a(this.f109554f, a2);
                return;
            }
            q.a(this.f109554f, this.f109555g);
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    public final void h(String str) {
        a("log_pb", ac.a.f91473a.a(str), a.f109562a);
    }

    public static String c(Aweme aweme) {
        if (aweme.getAuthor() != null) {
            return aweme.getAuthor().getUid();
        }
        return "";
    }

    public static String d(Aweme aweme) {
        int awemeType = aweme.getAwemeType();
        if (awemeType == 2) {
            return UGCMonitor.TYPE_PHOTO;
        }
        if (awemeType != 101) {
            return "video";
        }
        return "live";
    }

    public static Long e(Aweme aweme) {
        long id;
        if (aweme.getMusic() == null) {
            id = 0;
        } else {
            id = aweme.getMusic().getId();
        }
        return Long.valueOf(id);
    }

    public c(String str) {
        this.f109554f = str;
    }

    public final E a(Map<String, String> map) {
        this.f109552b.putAll(map);
        return this;
    }

    public void b(Aweme aweme) {
        if (aweme != null) {
            aweme.getAid();
            aweme.getRank();
            if (aweme.getRank() != -1) {
                this.n = String.valueOf(aweme.getRank());
            } else {
                this.n = b(aweme, 9);
            }
            if (!(aweme.getVideo() == null || aweme.getVideo().getVideoTag() == null)) {
                this.f109561m = aweme.getVideo().getVideoTag().getTitle();
            }
            if (TextUtils.isEmpty(this.f109561m) && aweme.getNewLabel() == 1) {
                this.f109561m = "New";
            }
        }
    }

    public final void a(Aweme aweme) {
        if (aweme != null) {
            HotSearchInfo hotSearchInfo = aweme.getHotSearchInfo();
            if (hotSearchInfo == null || hotSearchInfo.getSentence() == null) {
                this.f109557i = aweme.getHotSpot();
            } else {
                this.f109557i = hotSearchInfo.getSentence();
            }
            HotListStruct hotListStruct = aweme.getHotListStruct();
            if (hotListStruct != null) {
                if (hotListStruct.getType() == 9) {
                    this.f109558j = true;
                }
                if (hotListStruct.getType() == 9 && TextUtils.isEmpty(this.f109557i)) {
                    this.f109557i = hotListStruct.getTitile();
                }
            }
        }
    }

    public final c a(String str, String str2) {
        a(str, str2, a.f109562a);
        return this;
    }

    public static String a(Aweme aweme, int i2) {
        return RequestIdService.a().b(aweme, i2).optString("request_id");
    }

    static String b(Aweme aweme, int i2) {
        return RequestIdService.a().b(aweme, i2).optString("order");
    }

    public final c a(String str, int i2) {
        a(str, String.valueOf(i2), a.f109562a);
        return this;
    }

    public final c a(String str, boolean z) {
        a(str, String.valueOf(z), a.f109562a);
        return this;
    }

    public final void a(String str, String str2, a aVar) {
        this.f109555g.put(str, aVar.a(str2));
    }
}
