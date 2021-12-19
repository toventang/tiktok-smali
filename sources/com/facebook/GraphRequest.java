package com.facebook;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.internal.ab;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.facebook.internal.w;
import com.facebook.q;
import com.kakao.usermgmt.StringSet;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public class GraphRequest {

    /* renamed from: a  reason: collision with root package name */
    public static final String f46539a = GraphRequest.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public static final String f46540b;
    private static String o;
    private static Pattern p = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    private static volatile String r;

    /* renamed from: c  reason: collision with root package name */
    public AccessToken f46541c;

    /* renamed from: d  reason: collision with root package name */
    public s f46542d;

    /* renamed from: e  reason: collision with root package name */
    public String f46543e;

    /* renamed from: f  reason: collision with root package name */
    public JSONObject f46544f;

    /* renamed from: g  reason: collision with root package name */
    public String f46545g;

    /* renamed from: h  reason: collision with root package name */
    public String f46546h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f46547i;

    /* renamed from: j  reason: collision with root package name */
    public Bundle f46548j;

    /* renamed from: k  reason: collision with root package name */
    public b f46549k;

    /* renamed from: l  reason: collision with root package name */
    public Object f46550l;

    /* renamed from: m  reason: collision with root package name */
    public String f46551m;
    public boolean n;
    private String q;

    public interface b {
        static {
            Covode.recordClassIndex(28398);
        }

        void a(r rVar);
    }

    /* access modifiers changed from: package-private */
    public interface c {
        static {
            Covode.recordClassIndex(28399);
        }

        void a(String str, String str2);
    }

    public interface d extends b {
        static {
            Covode.recordClassIndex(28400);
        }
    }

    public final void a(final b bVar) {
        if (m.a(u.GRAPH_API_DEBUG_INFO) || m.a(u.GRAPH_API_DEBUG_WARNING)) {
            this.f46549k = new b() {
                /* class com.facebook.GraphRequest.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(28392);
                }

                @Override // com.facebook.GraphRequest.b
                public final void a(r rVar) {
                    JSONObject optJSONObject;
                    JSONArray optJSONArray;
                    JSONObject jSONObject = rVar.f49017b;
                    if (!(jSONObject == null || (optJSONObject = jSONObject.optJSONObject("__debug__")) == null || (optJSONArray = optJSONObject.optJSONArray("messages")) == null)) {
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
                            if (optJSONObject2 != null) {
                                String optString = optJSONObject2.optString("message");
                                String optString2 = optJSONObject2.optString(StringSet.type);
                                String optString3 = optJSONObject2.optString("link");
                                if (!(optString == null || optString2 == null)) {
                                    u uVar = u.GRAPH_API_DEBUG_INFO;
                                    if (optString2.equals("warning")) {
                                        uVar = u.GRAPH_API_DEBUG_WARNING;
                                    }
                                    if (!ad.a(optString3)) {
                                        optString = optString + " Link: " + optString3;
                                    }
                                    w.a(uVar, GraphRequest.f46539a, optString);
                                }
                            }
                        }
                    }
                    b bVar = bVar;
                    if (bVar != null) {
                        bVar.a(rVar);
                    }
                }
            };
        } else {
            this.f46549k = bVar;
        }
    }

    private static void a(final q qVar, List<r> list) {
        int size = qVar.size();
        final ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            GraphRequest a2 = qVar.get(i2);
            if (a2.f46549k != null) {
                arrayList.add(new Pair(a2.f46549k, list.get(i2)));
            }
        }
        if (arrayList.size() > 0) {
            AnonymousClass2 r1 = new Runnable() {
                /* class com.facebook.GraphRequest.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(28393);
                }

                public final void run() {
                    if (!com.facebook.internal.a.b.a.a(this)) {
                        try {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                Pair pair = (Pair) it.next();
                                ((b) pair.first).a((r) pair.second);
                            }
                            for (q.a aVar : qVar.f49013e) {
                                aVar.a();
                            }
                        } catch (Throwable th) {
                            com.facebook.internal.a.b.a.a(th, this);
                        }
                    }
                }
            };
            Handler handler = qVar.f49009a;
            if (handler == null) {
                r1.run();
            } else {
                handler.post(r1);
            }
        }
    }

    private void a(JSONArray jSONArray, Map<String, a> map) {
        JSONObject jSONObject = new JSONObject();
        String str = this.f46545g;
        if (str != null) {
            jSONObject.put(StringSet.name, str);
            jSONObject.put("omit_response_on_success", this.f46547i);
        }
        String str2 = this.f46546h;
        if (str2 != null) {
            jSONObject.put("depends_on", str2);
        }
        String c2 = c();
        jSONObject.put("relative_url", c2);
        jSONObject.put("method", this.f46542d);
        AccessToken accessToken = this.f46541c;
        if (accessToken != null) {
            w.a(accessToken.f46498e);
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : this.f46548j.keySet()) {
            Object a2 = a(this.f46548j, str3);
            if (c(a2)) {
                String a3 = com.a.a(Locale.ROOT, "%s%d", new Object[]{"file", Integer.valueOf(map.size())});
                arrayList.add(a3);
                map.put(a3, new a(this, a2));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        if (this.f46544f != null) {
            final ArrayList arrayList2 = new ArrayList();
            a(this.f46544f, c2, new c() {
                /* class com.facebook.GraphRequest.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(28394);
                }

                @Override // com.facebook.GraphRequest.c
                public final void a(String str, String str2) {
                    arrayList2.add(com.a.a(Locale.US, "%s=%s", new Object[]{str, URLEncoder.encode(str2, "UTF-8")}));
                }
            });
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    private static void a(q qVar, w wVar, int i2, URL url, OutputStream outputStream, boolean z) {
        e eVar = new e(outputStream, wVar, z);
        if (i2 == 1) {
            GraphRequest a2 = qVar.get(0);
            HashMap hashMap = new HashMap();
            for (String str : a2.f46548j.keySet()) {
                Object a3 = a(a2.f46548j, str);
                if (c(a3)) {
                    hashMap.put(str, new a(a2, a3));
                }
            }
            if (wVar != null) {
                wVar.b("  Parameters:\n");
            }
            a(a2.f46548j, eVar, a2);
            if (wVar != null) {
                wVar.b("  Attachments:\n");
            }
            a(hashMap, eVar);
            JSONObject jSONObject = a2.f46544f;
            if (jSONObject != null) {
                a(jSONObject, url.getPath(), eVar);
                return;
            }
            return;
        }
        String f2 = f(qVar);
        if (!ad.a(f2)) {
            eVar.a("batch_app_id", f2);
            HashMap hashMap2 = new HashMap();
            a(eVar, qVar, hashMap2);
            if (wVar != null) {
                wVar.b("  Attachments:\n");
            }
            a(hashMap2, eVar);
            return;
        }
        throw new j("App ID was not specified at the request or Settings.");
    }

    private static void a(String str, Object obj, c cVar, boolean z) {
        while (true) {
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                JSONObject jSONObject = (JSONObject) obj;
                if (z) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        a(com.a.a("%s[%s]", new Object[]{str, next}), jSONObject.opt(next), cVar, z);
                    }
                    return;
                } else if (jSONObject.has("id")) {
                    obj = jSONObject.optString("id");
                } else if (jSONObject.has("url")) {
                    obj = jSONObject.optString("url");
                } else if (jSONObject.has("fbsdk:create_object")) {
                    obj = jSONObject.toString();
                } else {
                    return;
                }
            } else if (JSONArray.class.isAssignableFrom(cls)) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    a(com.a.a(Locale.ROOT, "%s[%d]", new Object[]{str, Integer.valueOf(i2)}), jSONArray.opt(i2), cVar, z);
                }
                return;
            } else if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                cVar.a(str, obj.toString());
                return;
            } else if (Date.class.isAssignableFrom(cls)) {
                cVar.a(str, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj));
                return;
            } else {
                return;
            }
        }
    }

    private static void a(Bundle bundle, e eVar, GraphRequest graphRequest) {
        for (String str : bundle.keySet()) {
            Object a2 = a(bundle, str);
            if (a(a2)) {
                eVar.a(str, a2, graphRequest);
            }
        }
    }

    private static void a(Map<String, a> map, e eVar) {
        for (String str : map.keySet()) {
            a aVar = map.get(str);
            if (c(aVar.f46561b)) {
                eVar.a(str, aVar.f46561b, aVar.f46560a);
            }
        }
    }

    private static void a(e eVar, Collection<GraphRequest> collection, Map<String, a> map) {
        JSONArray jSONArray = new JSONArray();
        for (GraphRequest graphRequest : collection) {
            graphRequest.a(jSONArray, map);
        }
        eVar.a("batch", jSONArray, collection);
    }

    public static boolean a(Object obj) {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    /* access modifiers changed from: package-private */
    public static class e implements c {

        /* renamed from: a  reason: collision with root package name */
        private final OutputStream f46562a;

        /* renamed from: b  reason: collision with root package name */
        private final w f46563b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f46564c = true;

        /* renamed from: d  reason: collision with root package name */
        private boolean f46565d;

        static {
            Covode.recordClassIndex(28401);
        }

        public final void a(String str, Object obj, GraphRequest graphRequest) {
            OutputStream outputStream = this.f46562a;
            if (outputStream instanceof z) {
                ((z) outputStream).a(graphRequest);
            }
            if (GraphRequest.a(obj)) {
                a(str, GraphRequest.b(obj));
            } else if (obj instanceof Bitmap) {
                a(str, (Bitmap) obj);
            } else if (obj instanceof byte[]) {
                a(str, (byte[]) obj);
            } else if (obj instanceof Uri) {
                a(str, (Uri) obj, (String) null);
            } else if (obj instanceof ParcelFileDescriptor) {
                a(str, (ParcelFileDescriptor) obj, (String) null);
            } else if (obj instanceof ParcelableResourceWithMimeType) {
                ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
                RESOURCE resource = parcelableResourceWithMimeType.f46559b;
                String str2 = parcelableResourceWithMimeType.f46558a;
                if (resource instanceof ParcelFileDescriptor) {
                    a(str, (ParcelFileDescriptor) resource, str2);
                } else if (resource instanceof Uri) {
                    a(str, (Uri) resource, str2);
                } else {
                    throw a();
                }
            } else {
                throw a();
            }
        }

        public final void a(String str, JSONArray jSONArray, Collection<GraphRequest> collection) {
            OutputStream outputStream = this.f46562a;
            if (!(outputStream instanceof z)) {
                a(str, jSONArray.toString());
                return;
            }
            z zVar = (z) outputStream;
            a(str, (String) null, (String) null);
            a("[", new Object[0]);
            int i2 = 0;
            for (GraphRequest graphRequest : collection) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                zVar.a(graphRequest);
                if (i2 > 0) {
                    a(",%s", jSONObject.toString());
                } else {
                    a("%s", jSONObject.toString());
                }
                i2++;
            }
            a("]", new Object[0]);
            w wVar = this.f46563b;
            if (wVar != null) {
                wVar.a("    ".concat(String.valueOf(str)), (Object) jSONArray.toString());
            }
        }

        @Override // com.facebook.GraphRequest.c
        public final void a(String str, String str2) {
            a(str, (String) null, (String) null);
            b("%s", str2);
            b();
            w wVar = this.f46563b;
            if (wVar != null) {
                wVar.a("    ".concat(String.valueOf(str)), (Object) str2);
            }
        }

        private static RuntimeException a() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        private void b() {
            MethodCollector.i(2698);
            if (!this.f46565d) {
                b("--%s", GraphRequest.f46540b);
                MethodCollector.o(2698);
                return;
            }
            this.f46562a.write("&".getBytes());
            MethodCollector.o(2698);
        }

        private void b(String str, Object... objArr) {
            a(str, objArr);
            if (!this.f46565d) {
                a("\r\n", new Object[0]);
            }
        }

        private void a(String str, Bitmap bitmap) {
            MethodCollector.i(2290);
            a(str, str, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.f46562a);
            b("", new Object[0]);
            b();
            w wVar = this.f46563b;
            if (wVar != null) {
                wVar.a("    ".concat(String.valueOf(str)), (Object) "<Image>");
            }
            MethodCollector.o(2290);
        }

        private void a(String str, byte[] bArr) {
            MethodCollector.i(2293);
            a(str, str, "content/unknown");
            this.f46562a.write(bArr);
            b("", new Object[0]);
            b();
            w wVar = this.f46563b;
            if (wVar != null) {
                wVar.a("    ".concat(String.valueOf(str)), (Object) com.a.a(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(bArr.length)}));
            }
            MethodCollector.o(2293);
        }

        private void a(String str, Object... objArr) {
            MethodCollector.i(3234);
            if (!this.f46565d) {
                if (this.f46564c) {
                    this.f46562a.write("--".getBytes());
                    this.f46562a.write(GraphRequest.f46540b.getBytes());
                    this.f46562a.write("\r\n".getBytes());
                    this.f46564c = false;
                }
                this.f46562a.write(com.a.a(str, objArr).getBytes());
                MethodCollector.o(3234);
                return;
            }
            this.f46562a.write(URLEncoder.encode(com.a.a(Locale.US, str, objArr), "UTF-8").getBytes());
            MethodCollector.o(3234);
        }

        public e(OutputStream outputStream, w wVar, boolean z) {
            this.f46562a = outputStream;
            this.f46563b = wVar;
            this.f46565d = z;
        }

        private void a(String str, Uri uri, String str2) {
            int a2;
            MethodCollector.i(2655);
            if (str2 == null) {
                str2 = "content/unknown";
            }
            a(str, str, str2);
            if (this.f46562a instanceof x) {
                ((x) this.f46562a).a(ad.e(uri));
                a2 = 0;
            } else {
                ae.a();
                a2 = ad.a(m.f48921g.getContentResolver().openInputStream(uri), this.f46562a) + 0;
            }
            b("", new Object[0]);
            b();
            w wVar = this.f46563b;
            if (wVar != null) {
                wVar.a("    ".concat(String.valueOf(str)), (Object) com.a.a(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(a2)}));
            }
            MethodCollector.o(2655);
        }

        private void a(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) {
            int a2;
            MethodCollector.i(2695);
            if (str2 == null) {
                str2 = "content/unknown";
            }
            a(str, str, str2);
            OutputStream outputStream = this.f46562a;
            if (outputStream instanceof x) {
                ((x) outputStream).a(parcelFileDescriptor.getStatSize());
                a2 = 0;
            } else {
                a2 = ad.a((InputStream) new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.f46562a) + 0;
            }
            b("", new Object[0]);
            b();
            w wVar = this.f46563b;
            if (wVar != null) {
                wVar.a("    ".concat(String.valueOf(str)), (Object) com.a.a(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(a2)}));
            }
            MethodCollector.o(2695);
        }

        private void a(String str, String str2, String str3) {
            MethodCollector.i(2715);
            if (!this.f46565d) {
                a("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    a("; filename=\"%s\"", str2);
                }
                b("", new Object[0]);
                if (str3 != null) {
                    b("%s: %s", "Content-Type", str3);
                }
                b("", new Object[0]);
                MethodCollector.o(2715);
                return;
            }
            this.f46562a.write(com.a.a("%s=", new Object[]{str}).getBytes());
            MethodCollector.o(2715);
        }
    }

    public final p a() {
        GraphRequest[] graphRequestArr = {this};
        ae.a(graphRequestArr, "requests");
        return b(new q(Arrays.asList(graphRequestArr)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(org.json.JSONObject r5, java.lang.String r6, com.facebook.GraphRequest.c r7) {
        /*
            java.util.regex.Pattern r0 = com.facebook.GraphRequest.p
            java.util.regex.Matcher r2 = r0.matcher(r6)
            boolean r1 = r2.matches()
            r0 = 1
            if (r1 == 0) goto L_0x005e
            java.lang.String r2 = r2.group(r0)
        L_0x0011:
            java.lang.String r0 = "me/"
            boolean r1 = r2.startsWith(r0)
            r0 = 0
            if (r1 != 0) goto L_0x0022
            java.lang.String r0 = "/me/"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L_0x005c
        L_0x0022:
            java.lang.String r0 = ":"
            int r2 = r6.indexOf(r0)
            java.lang.String r0 = "?"
            int r1 = r6.indexOf(r0)
            r0 = 3
            if (r2 <= r0) goto L_0x005c
            r0 = -1
            if (r1 == r0) goto L_0x0036
            if (r2 >= r1) goto L_0x005c
        L_0x0036:
            r4 = 1
        L_0x0037:
            java.util.Iterator r3 = r5.keys()
        L_0x003b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0060
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r5.opt(r2)
            if (r4 == 0) goto L_0x005a
            java.lang.String r0 = "image"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x005a
            r0 = 1
        L_0x0056:
            a(r2, r1, r7, r0)
            goto L_0x003b
        L_0x005a:
            r0 = 0
            goto L_0x0056
        L_0x005c:
            r4 = 0
            goto L_0x0037
        L_0x005e:
            r2 = r6
            goto L_0x0011
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.a(org.json.JSONObject, java.lang.String, com.facebook.GraphRequest$c):void");
    }

    public static class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {
        public static final Parcelable.Creator<ParcelableResourceWithMimeType> CREATOR = new Parcelable.Creator<ParcelableResourceWithMimeType>() {
            /* class com.facebook.GraphRequest.ParcelableResourceWithMimeType.AnonymousClass1 */

            static {
                Covode.recordClassIndex(28396);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ ParcelableResourceWithMimeType[] newArray(int i2) {
                return new ParcelableResourceWithMimeType[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ParcelableResourceWithMimeType createFromParcel(Parcel parcel) {
                return new ParcelableResourceWithMimeType(parcel, (byte) 0);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public final String f46558a;

        /* renamed from: b  reason: collision with root package name */
        public final RESOURCE f46559b;

        public int describeContents() {
            return 1;
        }

        static {
            Covode.recordClassIndex(28395);
        }

        private ParcelableResourceWithMimeType(Parcel parcel) {
            this.f46558a = parcel.readString();
            ae.a();
            this.f46559b = (RESOURCE) parcel.readParcelable(m.f48921g.getClassLoader());
        }

        /* synthetic */ ParcelableResourceWithMimeType(Parcel parcel, byte b2) {
            this(parcel);
        }

        public ParcelableResourceWithMimeType(RESOURCE resource, String str) {
            this.f46558a = str;
            this.f46559b = resource;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f46558a);
            parcel.writeParcelable(this.f46559b, i2);
        }
    }

    public GraphRequest() {
        this(null, null, null, null, null);
    }

    private String d() {
        if (p.matcher(this.f46543e).matches()) {
            return this.f46543e;
        }
        return com.a.a("%s/%s", new Object[]{this.f46551m, this.f46543e});
    }

    static {
        Covode.recordClassIndex(28391);
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        for (int i2 = 0; i2 < nextInt; i2++) {
            sb.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        f46540b = sb.toString();
    }

    private String c() {
        if (this.q == null) {
            String a2 = com.a.a("%s/%s", new Object[]{ab.b(), d()});
            b();
            Uri parse = Uri.parse(a(a2, (Boolean) true));
            return com.a.a("%s?%s", new Object[]{parse.getPath(), parse.getQuery()});
        }
        throw new j("Can't override URL for a batch request");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{Request:  accessToken: ");
        Object obj = this.f46541c;
        if (obj == null) {
            obj = "null";
        }
        return sb.append(obj).append(", graphPath: ").append(this.f46543e).append(", graphObject: ").append(this.f46544f).append(", httpMethod: ").append(this.f46542d).append(", parameters: ").append(this.f46548j).append("}").toString();
    }

    private void b() {
        if (this.f46541c != null) {
            if (!this.f46548j.containsKey("access_token")) {
                String str = this.f46541c.f46498e;
                w.a(str);
                this.f46548j.putString("access_token", str);
            }
        } else if (!this.n && !this.f46548j.containsKey("access_token")) {
            ae.a();
            String str2 = m.f48915a;
            ae.a();
            String str3 = m.f48917c;
            if (!ad.a(str2) && !ad.a(str3)) {
                this.f46548j.putString("access_token", str2 + "|" + str3);
            }
        }
        this.f46548j.putString("sdk", "android");
        this.f46548j.putString("format", "json");
        if (m.a(u.GRAPH_API_DEBUG_INFO)) {
            this.f46548j.putString("debug", "info");
        } else if (m.a(u.GRAPH_API_DEBUG_WARNING)) {
            this.f46548j.putString("debug", "warning");
        }
    }

    public static GraphRequest a(String str) {
        return new GraphRequest(null, str, null, null, null);
    }

    public static p b(q qVar) {
        ae.a((Collection) qVar, "requests");
        p pVar = new p(qVar);
        pVar.executeOnExecutor(m.c(), new Void[0]);
        return pVar;
    }

    private static boolean c(Object obj) {
        if ((obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType)) {
            return true;
        }
        return false;
    }

    public static r a(GraphRequest graphRequest) {
        List<r> a2 = a(graphRequest);
        if (a2 != null && a2.size() == 1) {
            return a2.get(0);
        }
        throw new j("invalid state: expected a single response");
    }

    public static String b(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number)) {
            return obj.toString();
        }
        if (obj instanceof Date) {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(obj);
        }
        throw new IllegalArgumentException("Unsupported parameter type.");
    }

    private static boolean e(q qVar) {
        Iterator it = qVar.iterator();
        while (it.hasNext()) {
            GraphRequest graphRequest = (GraphRequest) it.next();
            Iterator<String> it2 = graphRequest.f46548j.keySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (c(a(graphRequest.f46548j, it2.next()))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static String f(q qVar) {
        String str;
        if (!ad.a(qVar.f49014f)) {
            return qVar.f49014f;
        }
        Iterator it = qVar.iterator();
        while (it.hasNext()) {
            AccessToken accessToken = ((GraphRequest) it.next()).f46541c;
            if (accessToken != null && (str = accessToken.f46501h) != null) {
                return str;
            }
        }
        if (!ad.a(o)) {
            return o;
        }
        ae.a();
        return m.f48915a;
    }

    private static boolean d(q qVar) {
        for (q.a aVar : qVar.f49013e) {
            if (aVar instanceof q.b) {
                return true;
            }
        }
        Iterator it = qVar.iterator();
        while (it.hasNext()) {
            if (((GraphRequest) it.next()).f46549k instanceof d) {
                return true;
            }
        }
        return false;
    }

    public static List<r> a(q qVar) {
        ae.a((Collection) qVar, "requests");
        try {
            HttpURLConnection c2 = c(qVar);
            try {
                return a(c2, qVar);
            } finally {
                ad.a(c2);
            }
        } catch (Exception e2) {
            List<r> a2 = r.a(qVar.f49010b, (HttpURLConnection) null, new j(e2));
            a(qVar, a2);
            ad.a((URLConnection) null);
            return a2;
        }
    }

    private static List<r> a(Collection<GraphRequest> collection) {
        return a(new q(collection));
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x000d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0152 A[Catch:{ IOException | JSONException -> 0x027f }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01a2 A[Catch:{ IOException | JSONException -> 0x0277 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b0 A[Catch:{ IOException | JSONException -> 0x0277 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.net.HttpURLConnection c(com.facebook.q r24) {
        /*
        // Method dump skipped, instructions count: 671
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.c(com.facebook.q):java.net.HttpURLConnection");
    }

    private static List<r> a(GraphRequest... graphRequestArr) {
        ae.a(graphRequestArr, "requests");
        return a((Collection<GraphRequest>) Arrays.asList(graphRequestArr));
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final GraphRequest f46560a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f46561b;

        static {
            Covode.recordClassIndex(28397);
        }

        public a(GraphRequest graphRequest, Object obj) {
            this.f46560a = graphRequest;
            this.f46561b = obj;
        }
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    private String a(String str, Boolean bool) {
        if (!bool.booleanValue() && this.f46542d == s.POST) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f46548j.keySet()) {
            Object a2 = a(this.f46548j, str2);
            if (a2 == null) {
                a2 = "";
            }
            if (a(a2)) {
                buildUpon.appendQueryParameter(str2, b(a2).toString());
            } else if (this.f46542d == s.GET) {
                throw new IllegalArgumentException(com.a.a(Locale.US, "Unsupported parameter type for GET request: %s", new Object[]{a2.getClass().getSimpleName()}));
            }
        }
        return buildUpon.toString();
    }

    public static List<r> a(HttpURLConnection httpURLConnection, q qVar) {
        List<r> a2 = r.a(httpURLConnection, qVar);
        ad.a(httpURLConnection);
        int size = qVar.size();
        if (size == a2.size()) {
            a(qVar, a2);
            b.a().b();
            return a2;
        }
        throw new j(com.a.a(Locale.US, "Received %d responses while expecting %d", new Object[]{Integer.valueOf(a2.size()), Integer.valueOf(size)}));
    }

    public static GraphRequest a(AccessToken accessToken, String str, JSONObject jSONObject, b bVar) {
        GraphRequest graphRequest = new GraphRequest(accessToken, str, null, s.POST, bVar);
        graphRequest.f46544f = jSONObject;
        return graphRequest;
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, s sVar, b bVar) {
        this(accessToken, str, bundle, sVar, bVar, (byte) 0);
    }

    private GraphRequest(AccessToken accessToken, String str, Bundle bundle, s sVar, b bVar, byte b2) {
        this.f46547i = true;
        this.f46541c = accessToken;
        this.f46543e = str;
        this.f46551m = null;
        a(bVar);
        if (this.q == null || sVar == s.GET) {
            this.f46542d = sVar == null ? s.GET : sVar;
            if (bundle != null) {
                this.f46548j = new Bundle(bundle);
            } else {
                this.f46548j = new Bundle();
            }
            if (this.f46551m == null) {
                this.f46551m = m.e();
                return;
            }
            return;
        }
        throw new j("Can't change HTTP method on request with overridden URL.");
    }
}
