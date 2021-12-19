package com.facebook.share.internal;

import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.a.b.a;
import com.facebook.internal.ad;
import com.facebook.share.model.ShareMessengerActionButton;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerGenericTemplateElement;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import com.facebook.share.model.ShareMessengerURLActionButton;
import com.kakao.usermgmt.StringSet;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f49068a = Pattern.compile("^(.+)\\.(facebook\\.com)$");

    static void a(Bundle bundle, ShareMessengerActionButton shareMessengerActionButton, boolean z) {
        String str;
        if (!a.a(d.class) && shareMessengerActionButton != null) {
            try {
                if (shareMessengerActionButton instanceof ShareMessengerURLActionButton) {
                    ShareMessengerURLActionButton shareMessengerURLActionButton = (ShareMessengerURLActionButton) shareMessengerActionButton;
                    if (!a.a(d.class)) {
                        if (z) {
                            try {
                                str = ad.a(shareMessengerURLActionButton.f49141b);
                            } catch (Throwable th) {
                                a.a(th, d.class);
                                return;
                            }
                        } else {
                            str = shareMessengerURLActionButton.f49124a + " - " + ad.a(shareMessengerURLActionButton.f49141b);
                        }
                        ad.a(bundle, "TARGET_DISPLAY", str);
                        ad.a(bundle, "ITEM_URL", shareMessengerURLActionButton.f49141b);
                    }
                }
            } catch (Throwable th2) {
                a.a(th2, d.class);
            }
        }
    }

    static JSONObject a(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) {
        if (a.a(d.class)) {
            return null;
        }
        try {
            return new JSONObject().put("attachment", new JSONObject().put(StringSet.type, "template").put("payload", new JSONObject().put("template_type", "generic").put("sharable", shareMessengerGenericTemplateContent.f49125a).put("image_aspect_ratio", a(shareMessengerGenericTemplateContent.f49126b)).put("elements", new JSONArray().put(a(shareMessengerGenericTemplateContent.f49127c)))));
        } catch (Throwable th) {
            a.a(th, d.class);
            return null;
        }
    }

    static JSONObject a(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) {
        if (a.a(d.class)) {
            return null;
        }
        try {
            return new JSONObject().put("attachment", new JSONObject().put(StringSet.type, "template").put("payload", new JSONObject().put("template_type", "open_graph").put("elements", new JSONArray().put(b(shareMessengerOpenGraphMusicTemplateContent)))));
        } catch (Throwable th) {
            a.a(th, d.class);
            return null;
        }
    }

    static JSONObject a(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) {
        if (a.a(d.class)) {
            return null;
        }
        try {
            return new JSONObject().put("attachment", new JSONObject().put(StringSet.type, "template").put("payload", new JSONObject().put("template_type", "media").put("elements", new JSONArray().put(b(shareMessengerMediaTemplateContent)))));
        } catch (Throwable th) {
            a.a(th, d.class);
            return null;
        }
    }

    private static JSONObject a(ShareMessengerGenericTemplateElement shareMessengerGenericTemplateElement) {
        if (a.a(d.class)) {
            return null;
        }
        try {
            JSONObject put = new JSONObject().put("title", shareMessengerGenericTemplateElement.f49129a).put("subtitle", shareMessengerGenericTemplateElement.f49130b).put("image_url", ad.a(shareMessengerGenericTemplateElement.f49131c));
            if (shareMessengerGenericTemplateElement.f49133e != null) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(a(shareMessengerGenericTemplateElement.f49133e));
                put.put("buttons", jSONArray);
            }
            if (shareMessengerGenericTemplateElement.f49132d != null) {
                put.put("default_action", a(shareMessengerGenericTemplateElement.f49132d, true));
            }
            return put;
        } catch (Throwable th) {
            a.a(th, d.class);
            return null;
        }
    }

    private static JSONObject a(ShareMessengerURLActionButton shareMessengerURLActionButton, boolean z) {
        String str;
        if (a.a(d.class)) {
            return null;
        }
        try {
            JSONObject put = new JSONObject().put(StringSet.type, "web_url");
            if (z) {
                str = null;
            } else {
                str = shareMessengerURLActionButton.f49124a;
            }
            return put.put("title", str).put("url", ad.a(shareMessengerURLActionButton.f49141b)).put("webview_height_ratio", a(shareMessengerURLActionButton.f49145f)).put("messenger_extensions", shareMessengerURLActionButton.f49143d).put("fallback_url", ad.a(shareMessengerURLActionButton.f49142c)).put("webview_share_button", a(shareMessengerURLActionButton));
        } catch (Throwable th) {
            a.a(th, d.class);
            return null;
        }
    }

    static {
        Covode.recordClassIndex(30666);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.share.internal.d$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f49069a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f49070b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f49071c;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0039 */
        static {
            /*
                r0 = 30667(0x77cb, float:4.2974E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.facebook.share.model.ShareMessengerMediaTemplateContent$a[] r0 = com.facebook.share.model.ShareMessengerMediaTemplateContent.a.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.facebook.share.internal.d.AnonymousClass1.f49071c = r1
                r2 = 1
                com.facebook.share.model.ShareMessengerMediaTemplateContent$a r0 = com.facebook.share.model.ShareMessengerMediaTemplateContent.a.VIDEO     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                com.facebook.share.model.ShareMessengerGenericTemplateContent$a[] r0 = com.facebook.share.model.ShareMessengerGenericTemplateContent.a.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.facebook.share.internal.d.AnonymousClass1.f49070b = r1
                com.facebook.share.model.ShareMessengerGenericTemplateContent$a r0 = com.facebook.share.model.ShareMessengerGenericTemplateContent.a.SQUARE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.facebook.share.model.ShareMessengerURLActionButton$a[] r0 = com.facebook.share.model.ShareMessengerURLActionButton.a.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.facebook.share.internal.d.AnonymousClass1.f49069a = r1
                com.facebook.share.model.ShareMessengerURLActionButton$a r0 = com.facebook.share.model.ShareMessengerURLActionButton.a.WebviewHeightRatioCompact     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.facebook.share.internal.d.AnonymousClass1.f49069a     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.facebook.share.model.ShareMessengerURLActionButton$a r0 = com.facebook.share.model.ShareMessengerURLActionButton.a.WebviewHeightRatioTall     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.d.AnonymousClass1.<clinit>():void");
        }
    }

    private static String a(ShareMessengerURLActionButton shareMessengerURLActionButton) {
        if (a.a(d.class)) {
            return null;
        }
        try {
            if (shareMessengerURLActionButton.f49144e) {
                return "hide";
            }
            return null;
        } catch (Throwable th) {
            a.a(th, d.class);
            return null;
        }
    }

    static String a(Uri uri) {
        if (a.a(d.class)) {
            return null;
        }
        try {
            String host = uri.getHost();
            if (ad.a(host) || !f49068a.matcher(host).matches()) {
                return "IMAGE";
            }
            return "uri";
        } catch (Throwable th) {
            a.a(th, d.class);
            return null;
        }
    }

    private static JSONObject b(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) {
        if (a.a(d.class)) {
            return null;
        }
        try {
            JSONObject put = new JSONObject().put("url", ad.a(shareMessengerOpenGraphMusicTemplateContent.f49139a));
            if (shareMessengerOpenGraphMusicTemplateContent.f49140b != null) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(a(shareMessengerOpenGraphMusicTemplateContent.f49140b));
                put.put("buttons", jSONArray);
            }
            return put;
        } catch (Throwable th) {
            a.a(th, d.class);
            return null;
        }
    }

    private static String a(ShareMessengerGenericTemplateContent.a aVar) {
        if (a.a(d.class)) {
            return null;
        }
        if (aVar == null) {
            return "horizontal";
        }
        try {
            if (AnonymousClass1.f49070b[aVar.ordinal()] != 1) {
                return "horizontal";
            }
            return "square";
        } catch (Throwable th) {
            a.a(th, d.class);
            return null;
        }
    }

    private static JSONObject b(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) {
        if (a.a(d.class)) {
            return null;
        }
        try {
            JSONObject put = new JSONObject().put("attachment_id", shareMessengerMediaTemplateContent.f49135b).put("url", ad.a(shareMessengerMediaTemplateContent.f49136c)).put("media_type", a(shareMessengerMediaTemplateContent.f49134a));
            if (shareMessengerMediaTemplateContent.f49137d != null) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(a(shareMessengerMediaTemplateContent.f49137d));
                put.put("buttons", jSONArray);
            }
            return put;
        } catch (Throwable th) {
            a.a(th, d.class);
            return null;
        }
    }

    static String a(ShareMessengerMediaTemplateContent.a aVar) {
        if (a.a(d.class)) {
            return null;
        }
        if (aVar == null) {
            return "image";
        }
        try {
            if (AnonymousClass1.f49071c[aVar.ordinal()] != 1) {
                return "image";
            }
            return "video";
        } catch (Throwable th) {
            a.a(th, d.class);
            return null;
        }
    }

    private static String a(ShareMessengerURLActionButton.a aVar) {
        if (a.a(d.class)) {
            return null;
        }
        if (aVar == null) {
            return "full";
        }
        try {
            int i2 = AnonymousClass1.f49069a[aVar.ordinal()];
            if (i2 == 1) {
                return "compact";
            }
            if (i2 != 2) {
                return "full";
            }
            return "tall";
        } catch (Throwable th) {
            a.a(th, d.class);
            return null;
        }
    }

    private static JSONObject a(ShareMessengerActionButton shareMessengerActionButton) {
        if (a.a(d.class)) {
            return null;
        }
        try {
            return a(shareMessengerActionButton, false);
        } catch (Throwable th) {
            a.a(th, d.class);
            return null;
        }
    }

    private static JSONObject a(ShareMessengerActionButton shareMessengerActionButton, boolean z) {
        if (a.a(d.class)) {
            return null;
        }
        try {
            if (shareMessengerActionButton instanceof ShareMessengerURLActionButton) {
                return a((ShareMessengerURLActionButton) shareMessengerActionButton, z);
            }
            return null;
        } catch (Throwable th) {
            a.a(th, d.class);
            return null;
        }
    }
}
