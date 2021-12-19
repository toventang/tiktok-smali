package com.ss.android.ugc.aweme.net;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.b.a.a.a;
import com.ss.android.common.applog.q;
import com.ss.android.http.a.b.d;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class b<T> {

    /* renamed from: h  reason: collision with root package name */
    public static final String f112219h = b.class.getSimpleName();

    /* renamed from: i  reason: collision with root package name */
    static final CommonApi f112220i = ((CommonApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(CommonApi.class));

    /* renamed from: a  reason: collision with root package name */
    public d<T> f112221a;

    /* renamed from: b  reason: collision with root package name */
    public String f112222b;

    /* renamed from: c  reason: collision with root package name */
    i f112223c;

    /* renamed from: d  reason: collision with root package name */
    List<d> f112224d;

    /* renamed from: e  reason: collision with root package name */
    Class<T> f112225e;

    /* renamed from: f  reason: collision with root package name */
    String f112226f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f112227g;

    static {
        Covode.recordClassIndex(72127);
    }

    public final void a(final Context context) {
        a.a(new Runnable() {
            /* class com.ss.android.ugc.aweme.net.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(72128);
            }

            public final void run() {
                Object a2;
                try {
                    i iVar = b.this.f112223c;
                    String str = b.this.f112222b;
                    List<d> list = b.this.f112224d;
                    String str2 = b.this.f112226f;
                    Class<T> cls = b.this.f112225e;
                    HashMap hashMap = new HashMap();
                    if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
                        for (d dVar : list) {
                            hashMap.put(dVar.f59532a, dVar.f59533b);
                        }
                    }
                    if (iVar == i.POST) {
                        q.b(hashMap, true);
                        T t = b.f112220i.doPost(str, hashMap).execute().f42630b;
                        if (String.class.equals(cls)) {
                            a2 = Api.a(t, Api.d.f66578a, str2, str);
                        } else {
                            a2 = Api.a(t, new Api.b(cls), str2, str);
                        }
                    } else if (iVar == i.GET) {
                        T t2 = b.f112220i.doGet(str, hashMap).execute().f42630b;
                        if (String.class.equals(cls)) {
                            a2 = Api.a(t2, Api.d.f66578a, str2, str);
                        } else {
                            a2 = Api.a(t2, new Api.b(cls), str2, str);
                        }
                    } else {
                        throw new IllegalStateException("Unsupport http type !");
                    }
                    if (b.this.f112221a != null) {
                        a.b(new c(this, a2));
                    }
                } catch (Exception e2) {
                    if (b.this.f112221a != null) {
                        a.b(new Runnable() {
                            /* class com.ss.android.ugc.aweme.net.b.AnonymousClass1.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(72129);
                            }

                            public final void run() {
                                if (b.this.f112227g) {
                                    com.ss.android.ugc.aweme.app.api.b.a.a(context, (Throwable) e2, (int) R.string.g4j);
                                }
                                b.this.f112221a.a(e2);
                            }
                        });
                    } else {
                        com.ss.android.ugc.aweme.app.api.b.a.a(context, (Throwable) e2, (int) R.string.g4j);
                    }
                }
            }
        });
    }

    public b(String str, i iVar, Class<T> cls) {
        this(str, iVar, "", cls);
    }

    private b(String str, i iVar, String str2, Class<T> cls) {
        this(str, iVar, null, str2, cls);
    }

    public b(String str, i iVar, List<d> list, Class<T> cls) {
        this(str, iVar, list, null, cls);
    }

    private b(String str, i iVar, List<d> list, String str2, Class<T> cls) {
        this.f112227g = true;
        this.f112222b = str;
        this.f112223c = iVar;
        this.f112224d = list;
        this.f112225e = cls;
        this.f112226f = str2;
    }
}
