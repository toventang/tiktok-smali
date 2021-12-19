package com.ss.android.ugc.aweme.ecommerce.router;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.abmock.i;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import h.a.am;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public final class g implements IInterceptor {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f87162b = am.a((Object[]) new String[]{"aweme://ec/pdp", "aweme://ec/sku", "aweme://ec/delivery", "aweme://ec/address/list", "aweme://ec/address/edit", "aweme://ec/order_center"});

    /* renamed from: c  reason: collision with root package name */
    public static final a f87163c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public volatile HashMap<String, SchemaFallbackConfig> f87164a;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f87165d;

    public static final class a {
        static {
            Covode.recordClassIndex(54701);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b implements i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f87167a;

        static {
            Covode.recordClassIndex(54702);
        }

        b(g gVar) {
            this.f87167a = gVar;
        }

        @Override // com.bytedance.ies.abmock.i
        public final void a() {
            com.ss.android.ugc.aweme.cw.g.b().execute(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.router.g.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f87168a;

                static {
                    Covode.recordClassIndex(54703);
                }

                {
                    this.f87168a = r1;
                }

                public final void run() {
                    this.f87168a.f87167a.a();
                }
            });
        }
    }

    public g() {
        com.ss.android.ugc.aweme.cw.g.b().execute(new Runnable(this) {
            /* class com.ss.android.ugc.aweme.ecommerce.router.g.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g f87166a;

            static {
                Covode.recordClassIndex(54700);
            }

            {
                this.f87166a = r1;
            }

            public final void run() {
                g gVar = this.f87166a;
                gVar.a();
                SettingsManager.a().a(new b(gVar));
            }
        });
    }

    static {
        Covode.recordClassIndex(54699);
    }

    public final void a() {
        HashMap<String, SchemaFallbackConfig> hashMap = new HashMap<>();
        SchemaFallbackConfig[] schemaFallbackConfigArr = (SchemaFallbackConfig[]) SettingsManager.a().a("ecom_schema_fallback_config", SchemaFallbackConfig[].class, k.f87172a);
        if (schemaFallbackConfigArr == null) {
            schemaFallbackConfigArr = k.f87172a;
        }
        ArrayList<SchemaFallbackConfig> arrayList = new ArrayList();
        for (SchemaFallbackConfig schemaFallbackConfig : schemaFallbackConfigArr) {
            if (f87162b.contains(schemaFallbackConfig.getKey())) {
                arrayList.add(schemaFallbackConfig);
            }
        }
        for (SchemaFallbackConfig schemaFallbackConfig2 : arrayList) {
            hashMap.put(schemaFallbackConfig2.getKey(), schemaFallbackConfig2);
        }
        this.f87164a = hashMap;
        this.f87165d = true;
    }

    public static String a(Uri uri) {
        StringBuilder sb = new StringBuilder();
        String scheme = uri.getScheme();
        if (scheme != null && scheme.length() > 0) {
            sb.append(l.a(uri.getScheme(), (Object) "://"));
        }
        String authority = uri.getAuthority();
        if (authority != null && authority.length() > 0) {
            sb.append(uri.getAuthority());
        }
        String path = uri.getPath();
        if (path != null && path.length() > 0) {
            sb.append(uri.getPath());
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        if (!(routeIntent == null || routeIntent.getUri() == null)) {
            if (!this.f87165d) {
                a();
            }
            HashMap<String, SchemaFallbackConfig> hashMap = this.f87164a;
            if (hashMap == null) {
                l.a("configMap");
            }
            if (hashMap.isEmpty()) {
                return false;
            }
            Uri uri = routeIntent.getUri();
            l.b(uri, "");
            String a2 = a(uri);
            HashMap<String, SchemaFallbackConfig> hashMap2 = this.f87164a;
            if (hashMap2 == null) {
                l.a("configMap");
            }
            if (hashMap2.get(a2) != null) {
                Uri uri2 = routeIntent.getUri();
                l.b(uri2, "");
                if (!uri2.getQueryParameterNames().contains("fallback")) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        if (!(routeIntent == null || routeIntent.getUri() == null)) {
            Uri uri = routeIntent.getUri();
            l.b(uri, "");
            String a2 = a(uri);
            HashMap<String, SchemaFallbackConfig> hashMap = this.f87164a;
            if (hashMap == null) {
                l.a("configMap");
            }
            SchemaFallbackConfig schemaFallbackConfig = hashMap.get(a2);
            if (schemaFallbackConfig != null) {
                Uri.Builder builder = new Uri.Builder();
                Uri.Builder encodedPath = builder.scheme(uri.getScheme()).encodedAuthority(uri.getAuthority()).encodedPath(uri.getPath());
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                l.b(queryParameterNames, "");
                for (T t : queryParameterNames) {
                    encodedPath.appendQueryParameter(t, uri.getQueryParameter(t));
                }
                builder.appendQueryParameter("fallback", schemaFallbackConfig.getFallback());
                routeIntent.setUrl(builder.build().toString());
            }
        }
        return false;
    }
}
