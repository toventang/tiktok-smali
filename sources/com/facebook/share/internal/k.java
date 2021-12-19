package com.facebook.share.internal;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.a.m;
import com.facebook.h;
import com.facebook.internal.a.b.a;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.facebook.internal.x;
import com.facebook.internal.y;
import com.facebook.j;
import com.facebook.l;
import com.facebook.s;
import com.facebook.share.a;
import com.facebook.share.internal.g;
import com.facebook.share.model.CameraEffectTextures;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import com.kakao.usermgmt.StringSet;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class k {
    static {
        Covode.recordClassIndex(30678);
    }

    static /* synthetic */ x.a a(UUID uuid, ShareMedia shareMedia) {
        if (a.a(k.class)) {
            return null;
        }
        try {
            return b(uuid, shareMedia);
        } catch (Throwable th) {
            a.a(th, k.class);
            return null;
        }
    }

    public static String a(Bundle bundle) {
        if (a.a(k.class)) {
            return null;
        }
        try {
            if (bundle.containsKey("completionGesture")) {
                return bundle.getString("completionGesture");
            }
            return bundle.getString("com.facebook.platform.extra.COMPLETION_GESTURE");
        } catch (Throwable th) {
            a.a(th, k.class);
            return null;
        }
    }

    public static boolean a(int i2, Intent intent, h hVar) {
        if (a.a(k.class)) {
            return false;
        }
        try {
            com.facebook.internal.a a2 = a(i2, intent);
            if (a2 == null) {
                return false;
            }
            File a3 = x.a(a2.b(), false);
            if (a3 != null) {
                ad.a(a3);
            }
            if (hVar == null) {
                return true;
            }
            j a4 = y.a(y.d(intent));
            if (a4 == null) {
                hVar.a(y.c(intent));
            } else if (a4 instanceof l) {
                hVar.a();
            } else {
                hVar.a(a4);
            }
            return true;
        } catch (Throwable th) {
            a.a(th, k.class);
            return false;
        }
    }

    public static h a() {
        if (a.a(k.class)) {
            return null;
        }
        try {
            return new h() {
                /* class com.facebook.share.internal.k.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ h f49079a = null;

                static {
                    Covode.recordClassIndex(30679);
                }

                @Override // com.facebook.share.internal.h
                public final void a() {
                    k.a(this.f49079a);
                }

                @Override // com.facebook.share.internal.h
                public final void a(j jVar) {
                    k.a(this.f49079a, jVar);
                }

                @Override // com.facebook.share.internal.h
                public final void a(Bundle bundle) {
                    if (bundle != null) {
                        String a2 = k.a(bundle);
                        if (a2 == null || UGCMonitor.TYPE_POST.equalsIgnoreCase(a2)) {
                            String b2 = k.b(bundle);
                            h hVar = this.f49079a;
                            if (!a.a(k.class)) {
                                try {
                                    k.a("succeeded", (String) null);
                                    if (hVar != null) {
                                        hVar.a(new a.C1192a(b2));
                                    }
                                } catch (Throwable th) {
                                    com.facebook.internal.a.b.a.a(th, k.class);
                                }
                            }
                        } else if ("cancel".equalsIgnoreCase(a2)) {
                            k.a(this.f49079a);
                        } else {
                            k.a(this.f49079a, new j("UnknownError"));
                        }
                    }
                }
            };
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, k.class);
            return null;
        }
    }

    public static List<String> a(SharePhotoContent sharePhotoContent, final UUID uuid) {
        if (!com.facebook.internal.a.b.a.a(k.class) && sharePhotoContent != null) {
            try {
                List<SharePhoto> list = sharePhotoContent.f49159a;
                if (list != null) {
                    List a2 = ad.a((List) list, (ad.b) new ad.b<SharePhoto, x.a>() {
                        /* class com.facebook.share.internal.k.AnonymousClass5 */

                        static {
                            Covode.recordClassIndex(30684);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.facebook.internal.ad.b
                        public final /* bridge */ /* synthetic */ x.a a(SharePhoto sharePhoto) {
                            return k.a(uuid, sharePhoto);
                        }
                    });
                    List<String> a3 = ad.a(a2, (ad.b) new ad.b<x.a, String>() {
                        /* class com.facebook.share.internal.k.AnonymousClass6 */

                        static {
                            Covode.recordClassIndex(30685);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.facebook.internal.ad.b
                        public final /* bridge */ /* synthetic */ String a(x.a aVar) {
                            return aVar.f48693b;
                        }
                    });
                    x.a(a2);
                    return a3;
                }
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, k.class);
            }
        }
        return null;
    }

    public static String a(ShareVideoContent shareVideoContent, UUID uuid) {
        if (!com.facebook.internal.a.b.a.a(k.class) && shareVideoContent != null) {
            try {
                if (shareVideoContent.f49170d != null) {
                    x.a a2 = x.a(uuid, shareVideoContent.f49170d.f49165b);
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(a2);
                    x.a(arrayList);
                    return a2.f48693b;
                }
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, k.class);
            }
        }
        return null;
    }

    public static List<Bundle> a(ShareMediaContent shareMediaContent, final UUID uuid) {
        if (!com.facebook.internal.a.b.a.a(k.class) && shareMediaContent != null) {
            try {
                List<ShareMedia> list = shareMediaContent.f49123a;
                if (list != null) {
                    final ArrayList arrayList = new ArrayList();
                    List<Bundle> a2 = ad.a((List) list, (ad.b) new ad.b<ShareMedia, Bundle>() {
                        /* class com.facebook.share.internal.k.AnonymousClass7 */

                        static {
                            Covode.recordClassIndex(30686);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.facebook.internal.ad.b
                        public final /* synthetic */ Bundle a(ShareMedia shareMedia) {
                            ShareMedia shareMedia2 = shareMedia;
                            x.a a2 = k.a(uuid, shareMedia2);
                            arrayList.add(a2);
                            Bundle bundle = new Bundle();
                            bundle.putString(StringSet.type, shareMedia2.a().name());
                            bundle.putString("uri", a2.f48693b);
                            return bundle;
                        }
                    });
                    x.a(arrayList);
                    return a2;
                }
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, k.class);
            }
        }
        return null;
    }

    public static JSONObject a(final UUID uuid, ShareOpenGraphContent shareOpenGraphContent) {
        Set c2;
        if (com.facebook.internal.a.b.a.a(k.class)) {
            return null;
        }
        try {
            ShareOpenGraphAction shareOpenGraphAction = shareOpenGraphContent.f49147a;
            final ArrayList arrayList = new ArrayList();
            JSONObject a2 = g.a(shareOpenGraphAction, (g.a) new g.a() {
                /* class com.facebook.share.internal.k.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(30687);
                }

                @Override // com.facebook.share.internal.g.a
                public final JSONObject a(SharePhoto sharePhoto) {
                    x.a a2 = k.a(uuid, sharePhoto);
                    if (a2 == null) {
                        return null;
                    }
                    arrayList.add(a2);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("url", a2.f48693b);
                        if (sharePhoto.f49153d) {
                            jSONObject.put("user_generated", true);
                        }
                        return jSONObject;
                    } catch (JSONException e2) {
                        throw new j("Unable to attach images", e2);
                    }
                }
            });
            x.a(arrayList);
            if (shareOpenGraphContent.f49099j != null && ad.a(a2.optString("place"))) {
                a2.put("place", shareOpenGraphContent.f49099j);
            }
            if (shareOpenGraphContent.f49098i != null) {
                JSONArray optJSONArray = a2.optJSONArray("tags");
                if (optJSONArray == null) {
                    c2 = new HashSet();
                } else {
                    c2 = ad.c(optJSONArray);
                }
                for (String str : shareOpenGraphContent.f49098i) {
                    c2.add(str);
                }
                a2.put("tags", new JSONArray((Collection) c2));
            }
            return a2;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, k.class);
            return null;
        }
    }

    public static JSONObject a(ShareOpenGraphContent shareOpenGraphContent) {
        if (com.facebook.internal.a.b.a.a(k.class)) {
            return null;
        }
        try {
            return g.a(shareOpenGraphContent.f49147a, (g.a) new g.a() {
                /* class com.facebook.share.internal.k.AnonymousClass9 */

                static {
                    Covode.recordClassIndex(30688);
                }

                @Override // com.facebook.share.internal.g.a
                public final JSONObject a(SharePhoto sharePhoto) {
                    Uri uri = sharePhoto.f49152c;
                    if (ad.b(uri)) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("url", uri.toString());
                            return jSONObject;
                        } catch (JSONException e2) {
                            throw new j("Unable to attach images", e2);
                        }
                    } else {
                        throw new j("Only web images may be used in OG objects shared via the web dialog");
                    }
                }
            });
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, k.class);
            return null;
        }
    }

    private static JSONArray a(JSONArray jSONArray, boolean z) {
        if (com.facebook.internal.a.b.a.a(k.class)) {
            return null;
        }
        try {
            JSONArray jSONArray2 = new JSONArray();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                Object obj = jSONArray.get(i2);
                if (obj instanceof JSONArray) {
                    obj = a((JSONArray) obj, z);
                } else if (obj instanceof JSONObject) {
                    obj = a((JSONObject) obj, z);
                }
                jSONArray2.put(obj);
            }
            return jSONArray2;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, k.class);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:36|37|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0095, code lost:
        throw new com.facebook.j("Failed to create json object from share content");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0096, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0097, code lost:
        com.facebook.internal.a.b.a.a(r0, com.facebook.share.internal.k.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009a, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x008e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject a(org.json.JSONObject r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.k.a(org.json.JSONObject, boolean):org.json.JSONObject");
    }

    static void a(h<a.C1192a> hVar) {
        if (!com.facebook.internal.a.b.a.a(k.class)) {
            try {
                a("cancelled", (String) null);
                if (hVar != null) {
                    hVar.c();
                }
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, k.class);
            }
        }
    }

    static void a(h<a.C1192a> hVar, j jVar) {
        if (!com.facebook.internal.a.b.a.a(k.class)) {
            try {
                a("error", jVar.getMessage());
                if (hVar != null) {
                    hVar.a(jVar);
                }
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, k.class);
            }
        }
    }

    public static String a(Uri uri) {
        if (com.facebook.internal.a.b.a.a(k.class) || uri == null) {
            return null;
        }
        try {
            String uri2 = uri.toString();
            int lastIndexOf = uri2.lastIndexOf(46);
            if (lastIndexOf == -1) {
                return null;
            }
            return uri2.substring(lastIndexOf);
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, k.class);
            return null;
        }
    }

    static void a(String str, String str2) {
        if (!com.facebook.internal.a.b.a.a(k.class)) {
            try {
                ae.a();
                m mVar = new m(com.facebook.m.f48921g);
                Bundle bundle = new Bundle();
                bundle.putString("fb_share_dialog_outcome", str);
                if (str2 != null) {
                    bundle.putString("error_message", str2);
                }
                mVar.d();
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, k.class);
            }
        }
    }

    public static Pair<String, String> a(String str) {
        String str2;
        int i2;
        if (com.facebook.internal.a.b.a.a(k.class)) {
            return null;
        }
        try {
            int indexOf = str.indexOf(58);
            if (indexOf == -1 || str.length() <= (i2 = indexOf + 1)) {
                str2 = null;
            } else {
                str2 = str.substring(0, indexOf);
                str = str.substring(i2);
            }
            return new Pair<>(str2, str);
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, k.class);
            return null;
        }
    }

    public static String b(Bundle bundle) {
        if (com.facebook.internal.a.b.a.a(k.class)) {
            return null;
        }
        try {
            if (bundle.containsKey("postId")) {
                return bundle.getString("postId");
            }
            if (bundle.containsKey("com.facebook.platform.extra.POST_ID")) {
                return bundle.getString("com.facebook.platform.extra.POST_ID");
            }
            return bundle.getString("post_id");
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, k.class);
            return null;
        }
    }

    private static com.facebook.internal.a a(int i2, Intent intent) {
        if (com.facebook.internal.a.b.a.a(k.class)) {
            return null;
        }
        try {
            UUID a2 = y.a(intent);
            if (a2 == null) {
                return null;
            }
            return com.facebook.internal.a.a(a2, i2);
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, k.class);
            return null;
        }
    }

    public static Bundle a(ShareStoryContent shareStoryContent, final UUID uuid) {
        if (!com.facebook.internal.a.b.a.a(k.class) && shareStoryContent != null) {
            try {
                if (shareStoryContent.f49162b != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(shareStoryContent.f49162b);
                    List a2 = ad.a((List) arrayList, (ad.b) new ad.b<SharePhoto, x.a>() {
                        /* class com.facebook.share.internal.k.AnonymousClass10 */

                        static {
                            Covode.recordClassIndex(30680);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.facebook.internal.ad.b
                        public final /* bridge */ /* synthetic */ x.a a(SharePhoto sharePhoto) {
                            return k.a(uuid, sharePhoto);
                        }
                    });
                    List a3 = ad.a(a2, (ad.b) new ad.b<x.a, Bundle>() {
                        /* class com.facebook.share.internal.k.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(30681);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.facebook.internal.ad.b
                        public final /* synthetic */ Bundle a(x.a aVar) {
                            x.a aVar2 = aVar;
                            Bundle bundle = new Bundle();
                            bundle.putString("uri", aVar2.f48693b);
                            String a2 = k.a(aVar2.f48696e);
                            if (a2 != null) {
                                ad.a(bundle, "extension", a2);
                            }
                            return bundle;
                        }
                    });
                    x.a(a2);
                    return (Bundle) a3.get(0);
                }
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, k.class);
            }
        }
        return null;
    }

    public static Bundle b(ShareStoryContent shareStoryContent, final UUID uuid) {
        if (!com.facebook.internal.a.b.a.a(k.class) && shareStoryContent != null) {
            try {
                if (shareStoryContent.f49161a != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(shareStoryContent.f49161a);
                    final ArrayList arrayList2 = new ArrayList();
                    List a2 = ad.a((List) arrayList, (ad.b) new ad.b<ShareMedia, Bundle>() {
                        /* class com.facebook.share.internal.k.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(30682);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.facebook.internal.ad.b
                        public final /* synthetic */ Bundle a(ShareMedia shareMedia) {
                            ShareMedia shareMedia2 = shareMedia;
                            x.a a2 = k.a(uuid, shareMedia2);
                            arrayList2.add(a2);
                            Bundle bundle = new Bundle();
                            bundle.putString(StringSet.type, shareMedia2.a().name());
                            bundle.putString("uri", a2.f48693b);
                            String a3 = k.a(a2.f48696e);
                            if (a3 != null) {
                                ad.a(bundle, "extension", a3);
                            }
                            return bundle;
                        }
                    });
                    x.a(arrayList2);
                    return (Bundle) a2.get(0);
                }
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, k.class);
            }
        }
        return null;
    }

    public static Bundle a(ShareCameraEffectContent shareCameraEffectContent, UUID uuid) {
        if (!com.facebook.internal.a.b.a.a(k.class) && shareCameraEffectContent != null) {
            try {
                CameraEffectTextures cameraEffectTextures = shareCameraEffectContent.f49096c;
                if (cameraEffectTextures != null) {
                    Bundle bundle = new Bundle();
                    ArrayList arrayList = new ArrayList();
                    for (String str : cameraEffectTextures.f49092a.keySet()) {
                        Object a2 = CameraEffectTextures.a(cameraEffectTextures.f49092a, str);
                        Uri uri = a2 instanceof Uri ? (Uri) a2 : null;
                        Object a3 = CameraEffectTextures.a(cameraEffectTextures.f49092a, str);
                        x.a a4 = a(uuid, uri, a3 instanceof Bitmap ? (Bitmap) a3 : null);
                        arrayList.add(a4);
                        bundle.putString(str, a4.f48693b);
                    }
                    x.a(arrayList);
                    return bundle;
                }
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, k.class);
            }
        }
        return null;
    }

    private static x.a b(UUID uuid, ShareMedia shareMedia) {
        Uri uri;
        Bitmap bitmap;
        if (com.facebook.internal.a.b.a.a(k.class)) {
            return null;
        }
        try {
            if (shareMedia instanceof SharePhoto) {
                SharePhoto sharePhoto = (SharePhoto) shareMedia;
                bitmap = sharePhoto.f49151b;
                uri = sharePhoto.f49152c;
            } else if (shareMedia instanceof ShareVideo) {
                uri = ((ShareVideo) shareMedia).f49165b;
                bitmap = null;
            } else {
                uri = null;
                bitmap = null;
            }
            return a(uuid, uri, bitmap);
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, k.class);
            return null;
        }
    }

    public static GraphRequest a(AccessToken accessToken, Uri uri, GraphRequest.b bVar) {
        if (com.facebook.internal.a.b.a.a(k.class)) {
            return null;
        }
        try {
            if (ad.d(uri)) {
                return a(accessToken, new File(uri.getPath()), bVar);
            }
            if (ad.c(uri)) {
                GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(uri, "image/png");
                Bundle bundle = new Bundle(1);
                bundle.putParcelable("file", parcelableResourceWithMimeType);
                return new GraphRequest(accessToken, "me/staging_resources", bundle, s.POST, bVar);
            }
            throw new j("The image Uri must be either a file:// or content:// Uri");
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, k.class);
            return null;
        }
    }

    private static GraphRequest a(AccessToken accessToken, File file, GraphRequest.b bVar) {
        if (com.facebook.internal.a.b.a.a(k.class)) {
            return null;
        }
        try {
            GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(ParcelFileDescriptor.open(file, 268435456), "image/png");
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", parcelableResourceWithMimeType);
            return new GraphRequest(accessToken, "me/staging_resources", bundle, s.POST, bVar);
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, k.class);
            return null;
        }
    }

    private static x.a a(UUID uuid, Uri uri, Bitmap bitmap) {
        if (com.facebook.internal.a.b.a.a(k.class)) {
            return null;
        }
        if (bitmap != null) {
            try {
                return x.a(uuid, bitmap);
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, k.class);
                return null;
            }
        } else if (uri != null) {
            return x.a(uuid, uri);
        } else {
            return null;
        }
    }
}
