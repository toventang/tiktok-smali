package com.bytedance.ies.bullet.service.d;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.a.j;
import com.bytedance.ies.bullet.service.base.y;
import com.bytedance.ies.d.a.i;
import com.bytedance.ies.d.a.m;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

public final class b extends com.bytedance.ies.bullet.service.base.b.a implements y {

    /* renamed from: b  reason: collision with root package name */
    public static final a f32674b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public AbstractC0704b f32675a;

    /* renamed from: c  reason: collision with root package name */
    private final HashSet<Uri> f32676c = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    private final m f32677f;

    /* renamed from: g  reason: collision with root package name */
    private final String f32678g;

    /* renamed from: com.bytedance.ies.bullet.service.d.b$b  reason: collision with other inner class name */
    public interface AbstractC0704b {
        static {
            Covode.recordClassIndex(19427);
        }

        JSONObject a();
    }

    static {
        Covode.recordClassIndex(19425);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(19426);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.y
    public final void a(Uri uri) {
        l.c(uri, "");
        this.f32676c.add(uri);
        d(uri);
    }

    @Override // com.bytedance.ies.bullet.service.base.y
    public final Object a(Object obj) {
        l.c(obj, "");
        return new a(this.f32678g, this, (com.bytedance.ies.bullet.c.e.a.b) obj, this.f32677f);
    }

    @Override // com.bytedance.ies.bullet.service.base.y
    public final void b(Uri uri) {
        l.c(uri, "");
        if (!this.f32676c.remove(uri)) {
            d(uri);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.y
    public final JSONObject c(Uri uri) {
        AbstractC0704b bVar;
        l.c(uri, "");
        l.c(uri, "");
        if (p.a(uri.getScheme(), "lynxview", false)) {
            Uri.Builder builder = new Uri.Builder();
            builder.scheme("lynxview").authority("prefetch").path(l.a(uri.getAuthority(), (Object) uri.getPath()));
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            l.a((Object) queryParameterNames, "");
            for (T t : queryParameterNames) {
                builder.appendQueryParameter(t, uri.getQueryParameter(t));
            }
            String builder2 = builder.toString();
            l.a((Object) builder2, "");
            List<com.bytedance.ies.d.a.y> b2 = this.f32677f.b(builder2);
            if (b2 != null) {
                JSONObject jSONObject = null;
                for (T t2 : b2) {
                    if (t2.f33274f != null) {
                        if (jSONObject == null) {
                            jSONObject = new JSONObject();
                        }
                        String str = t2.f33276h.f33281b;
                        i.c cVar = t2.f33274f;
                        if (cVar == null) {
                            l.a();
                        }
                        jSONObject.put(str, cVar.b().getJSONObject("raw"));
                    }
                }
                if (jSONObject != null) {
                    return jSONObject;
                }
            }
        }
        String valueOf = String.valueOf(uri);
        l.c(valueOf, "");
        if (valueOf.length() == 0 || (bVar = this.f32675a) == null) {
            return null;
        }
        return bVar.a();
    }

    private void d(Uri uri) {
        String str;
        String str2;
        String queryParameter;
        List<String> b2;
        l.c(uri, "");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            String authority = uri.getAuthority();
            if (authority == null || (b2 = p.b(authority, new String[]{"_"})) == null || (str = (String) n.h((List) b2)) == null) {
                str = uri.getAuthority();
            }
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1772600516) {
                    if (hashCode != -1377934078) {
                        if (hashCode == 1224424441 && str.equals("webview") && (queryParameter = uri.getQueryParameter("url")) != null) {
                            Uri.Builder buildUpon = Uri.parse(queryParameter).buildUpon();
                            Set<String> queryParameterNames = uri.getQueryParameterNames();
                            l.a((Object) queryParameterNames, "");
                            for (T t : queryParameterNames) {
                                if (!l.a((Object) t, (Object) "url")) {
                                    buildUpon.appendQueryParameter(t, uri.getQueryParameter(t));
                                }
                            }
                            str2 = buildUpon.toString();
                        } else {
                            return;
                        }
                    } else if (!str.equals("bullet") || (str2 = uri.getQueryParameter("url")) == null) {
                        return;
                    } else {
                        if (p.b(str2, "lynxview", false)) {
                            Uri parse = Uri.parse(str2);
                            l.a((Object) parse, "");
                            String path = parse.getPath();
                            if (path == null || path.length() == 0) {
                                Uri.Builder buildUpon2 = Uri.parse(parse.getQueryParameter("surl")).buildUpon();
                                Set<String> queryParameterNames2 = parse.getQueryParameterNames();
                                l.a((Object) queryParameterNames2, "");
                                for (T t2 : queryParameterNames2) {
                                    if (!l.a((Object) t2, (Object) "surl")) {
                                        buildUpon2.appendQueryParameter(t2, parse.getQueryParameter(t2));
                                    }
                                }
                                str2 = buildUpon2.toString();
                            } else {
                                Uri.Builder buildUpon3 = parse.buildUpon();
                                buildUpon3.authority("prefetch").path(l.a(parse.getHost(), (Object) parse.getPath()));
                                str2 = buildUpon3.toString();
                            }
                        } else {
                            if (!p.b(str2, "http", false) && !p.b(str2, "https", false)) {
                                return;
                            }
                            this.f32677f.a(str2);
                            j.b.a(this, "start prefetch:" + str2 + ", with time cost:" + (System.currentTimeMillis() - currentTimeMillis), null, null, 6);
                        }
                    }
                } else if (str.equals("lynxview")) {
                    String queryParameter2 = uri.getQueryParameter("channel");
                    String queryParameter3 = uri.getQueryParameter("bundle");
                    if ((queryParameter2 == null || queryParameter2.length() == 0) && (queryParameter3 == null || queryParameter3.length() == 0)) {
                        Uri.Builder buildUpon4 = Uri.parse(uri.getQueryParameter("surl")).buildUpon();
                        Set<String> queryParameterNames3 = uri.getQueryParameterNames();
                        l.a((Object) queryParameterNames3, "");
                        for (T t3 : queryParameterNames3) {
                            if (!l.a((Object) t3, (Object) "surl")) {
                                buildUpon4.appendQueryParameter(t3, uri.getQueryParameter(t3));
                            }
                        }
                        str2 = buildUpon4.toString();
                    } else {
                        Uri.Builder builder = new Uri.Builder();
                        builder.scheme("lynxview").authority("prefetch").path(queryParameter2 + '/' + queryParameter3);
                        Set<String> queryParameterNames4 = uri.getQueryParameterNames();
                        l.a((Object) queryParameterNames4, "");
                        for (T t4 : queryParameterNames4) {
                            if ((!l.a((Object) t4, (Object) "channel")) && (!l.a((Object) t4, (Object) "bundle"))) {
                                builder.appendQueryParameter(t4, uri.getQueryParameter(t4));
                            }
                        }
                        str2 = builder.toString();
                    }
                } else {
                    return;
                }
                if (str2 == null) {
                    return;
                }
                this.f32677f.a(str2);
                j.b.a(this, "start prefetch:" + str2 + ", with time cost:" + (System.currentTimeMillis() - currentTimeMillis), null, null, 6);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public b(m mVar, String str) {
        l.c(mVar, "");
        l.c(str, "");
        this.f32677f = mVar;
        this.f32678g = str;
    }
}
