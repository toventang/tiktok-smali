package com.facebook.share.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.facebook.j;
import com.facebook.m;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareMessengerActionButton;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import com.facebook.share.model.ShareMessengerURLActionButton;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import java.util.List;
import java.util.Locale;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static b f49074a;

    /* renamed from: b  reason: collision with root package name */
    private static b f49075b;

    /* renamed from: c  reason: collision with root package name */
    private static b f49076c;

    static {
        Covode.recordClassIndex(30673);
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f49077a;

        static {
            Covode.recordClassIndex(30675);
        }

        private b() {
        }

        public void a(ShareStoryContent shareStoryContent) {
            i.a(shareStoryContent, this);
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        public final void a(ShareOpenGraphContent shareOpenGraphContent) {
            this.f49077a = true;
            i.a(shareOpenGraphContent, this);
        }

        public void a(ShareVideoContent shareVideoContent) {
            i.a(shareVideoContent.f49170d);
            SharePhoto sharePhoto = shareVideoContent.f49169c;
            if (sharePhoto != null) {
                a(sharePhoto);
            }
        }

        public void a(ShareMediaContent shareMediaContent) {
            List<ShareMedia> list = shareMediaContent.f49123a;
            if (list == null || list.isEmpty()) {
                throw new j("Must specify at least one medium in ShareMediaContent.");
            } else if (list.size() <= 6) {
                for (ShareMedia shareMedia : list) {
                    i.a(shareMedia, this);
                }
            } else {
                throw new j(com.a.a(Locale.ROOT, "Cannot add more than %d media.", new Object[]{6}));
            }
        }

        public void a(SharePhoto sharePhoto) {
            i.a(sharePhoto);
            Bitmap bitmap = sharePhoto.f49151b;
            Uri uri = sharePhoto.f49152c;
            if (bitmap == null && ad.b(uri) && !this.f49077a) {
                throw new j("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
            } else if (sharePhoto.f49151b != null || !ad.b(sharePhoto.f49152c)) {
                ae.a();
                Context context = m.f48921g;
                ae.a((Object) context, "context");
                String b2 = ae.b();
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    String concat = "com.facebook.app.FacebookContentProvider".concat(String.valueOf(b2));
                    if (packageManager.resolveContentProvider(concat, 0) == null) {
                        throw new IllegalStateException(com.a.a("A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.", new Object[]{concat}));
                    }
                }
            }
        }
    }

    public static void a(ShareStoryContent shareStoryContent, b bVar) {
        if (shareStoryContent == null || (shareStoryContent.f49161a == null && shareStoryContent.f49162b == null)) {
            throw new j("Must pass the Facebook app a background asset, a sticker asset, or both");
        }
        if (shareStoryContent.f49161a != null) {
            a(shareStoryContent.f49161a, bVar);
        }
        if (shareStoryContent.f49162b != null) {
            bVar.a(shareStoryContent.f49162b);
        }
    }

    private static void a(SharePhotoContent sharePhotoContent, b bVar) {
        List<SharePhoto> list = sharePhotoContent.f49159a;
        if (list == null || list.isEmpty()) {
            throw new j("Must specify at least one Photo in SharePhotoContent.");
        } else if (list.size() <= 6) {
            for (SharePhoto sharePhoto : list) {
                bVar.a(sharePhoto);
            }
        } else {
            throw new j(com.a.a(Locale.ROOT, "Cannot add more than %d photos.", new Object[]{6}));
        }
    }

    static void a(SharePhoto sharePhoto) {
        if (sharePhoto != null) {
            Bitmap bitmap = sharePhoto.f49151b;
            Uri uri = sharePhoto.f49152c;
            if (bitmap == null && uri == null) {
                throw new j("SharePhoto does not have a Bitmap or ImageUrl specified");
            }
            return;
        }
        throw new j("Cannot share a null SharePhoto");
    }

    public static void a(ShareVideo shareVideo) {
        if (shareVideo != null) {
            Uri uri = shareVideo.f49165b;
            if (uri == null) {
                throw new j("ShareVideo does not have a LocalUrl specified");
            } else if (!ad.c(uri) && !ad.d(uri)) {
                throw new j("ShareVideo must reference a video that is on the device");
            }
        } else {
            throw new j("Cannot share a null ShareVideo");
        }
    }

    public static void a(ShareOpenGraphContent shareOpenGraphContent, b bVar) {
        ShareOpenGraphAction shareOpenGraphAction = shareOpenGraphContent.f49147a;
        if (shareOpenGraphAction == null) {
            throw new j("Must specify a non-null ShareOpenGraphAction");
        } else if (!ad.a(shareOpenGraphAction.b("og:type"))) {
            a(shareOpenGraphAction, bVar, false);
            String str = shareOpenGraphContent.f49148b;
            if (ad.a(str)) {
                throw new j("Must specify a previewPropertyName.");
            } else if (shareOpenGraphContent.f49147a.a(str) == null) {
                throw new j("Property \"" + str + "\" was not found on the action. The name of the preview property must match the name of an action property.");
            }
        } else {
            throw new j("ShareOpenGraphAction must have a non-empty actionType");
        }
    }

    private static void a(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) {
        if (ad.a(shareMessengerOpenGraphMusicTemplateContent.f49100k)) {
            throw new j("Must specify Page Id for ShareMessengerOpenGraphMusicTemplateContent");
        } else if (shareMessengerOpenGraphMusicTemplateContent.f49139a != null) {
            a(shareMessengerOpenGraphMusicTemplateContent.f49140b);
        } else {
            throw new j("Must specify url for ShareMessengerOpenGraphMusicTemplateContent");
        }
    }

    private static void a(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) {
        if (ad.a(shareMessengerMediaTemplateContent.f49100k)) {
            throw new j("Must specify Page Id for ShareMessengerMediaTemplateContent");
        } else if (shareMessengerMediaTemplateContent.f49136c != null || !ad.a(shareMessengerMediaTemplateContent.f49135b)) {
            a(shareMessengerMediaTemplateContent.f49137d);
        } else {
            throw new j("Must specify either attachmentId or mediaURL for ShareMessengerMediaTemplateContent");
        }
    }

    private static void a(Object obj, b bVar) {
        if (obj instanceof ShareOpenGraphObject) {
            a((ShareOpenGraphObject) obj, bVar);
        } else if (obj instanceof SharePhoto) {
            bVar.a((SharePhoto) obj);
        }
    }

    private static void a(ShareOpenGraphObject shareOpenGraphObject, b bVar) {
        if (shareOpenGraphObject != null) {
            a(shareOpenGraphObject, bVar, true);
            return;
        }
        throw new j("Cannot share a null ShareOpenGraphObject");
    }

    private static void a(ShareOpenGraphValueContainer shareOpenGraphValueContainer, b bVar, boolean z) {
        for (String str : shareOpenGraphValueContainer.f49149a.keySet()) {
            if (z) {
                String[] split = str.split(":");
                if (split.length >= 2) {
                    for (String str2 : split) {
                        if (str2.isEmpty()) {
                            throw new j("Invalid key found in Open Graph dictionary: %s", str);
                        }
                    }
                } else {
                    throw new j("Open Graph keys must be namespaced: %s", str);
                }
            }
            Object a2 = shareOpenGraphValueContainer.a(str);
            if (a2 instanceof List) {
                for (Object obj : (List) a2) {
                    if (obj != null) {
                        a(obj, bVar);
                    } else {
                        throw new j("Cannot put null objects in Lists in ShareOpenGraphObjects and ShareOpenGraphActions");
                    }
                }
                continue;
            } else {
                a(a2, bVar);
            }
        }
    }

    public static class a extends b {
        static {
            Covode.recordClassIndex(30674);
        }

        private a() {
            super((byte) 0);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @Override // com.facebook.share.internal.i.b
        public final void a(ShareStoryContent shareStoryContent) {
            i.a(shareStoryContent, (b) this);
        }
    }

    static class c extends b {
        static {
            Covode.recordClassIndex(30676);
        }

        private c() {
            super((byte) 0);
        }

        /* synthetic */ c(byte b2) {
            this();
        }

        @Override // com.facebook.share.internal.i.b
        public final void a(SharePhoto sharePhoto) {
            i.a(sharePhoto);
        }

        @Override // com.facebook.share.internal.i.b
        public final void a(ShareMediaContent shareMediaContent) {
            throw new j("Cannot share ShareMediaContent via web sharing dialogs");
        }

        @Override // com.facebook.share.internal.i.b
        public final void a(ShareVideoContent shareVideoContent) {
            throw new j("Cannot share ShareVideoContent via web sharing dialogs");
        }
    }

    private static void a(ShareMessengerURLActionButton shareMessengerURLActionButton) {
        if (shareMessengerURLActionButton.f49141b == null) {
            throw new j("Must specify url for ShareMessengerURLActionButton");
        }
    }

    private static void a(ShareCameraEffectContent shareCameraEffectContent) {
        if (ad.a(shareCameraEffectContent.f49094a)) {
            throw new j("Must specify a non-empty effectId");
        }
    }

    public static void b(ShareContent shareContent) {
        if (f49075b == null) {
            f49075b = new c((byte) 0);
        }
        a(shareContent, f49075b);
    }

    public static void a(ShareContent shareContent) {
        if (f49076c == null) {
            f49076c = new b((byte) 0);
        }
        a(shareContent, f49076c);
    }

    private static void a(ShareLinkContent shareLinkContent) {
        Uri uri = shareLinkContent.f49113c;
        if (uri != null && !ad.b(uri)) {
            throw new j("Image Url must be an http:// or https:// url");
        }
    }

    private static void a(ShareMessengerActionButton shareMessengerActionButton) {
        if (shareMessengerActionButton != null) {
            if (ad.a(shareMessengerActionButton.f49124a)) {
                throw new j("Must specify title for ShareMessengerActionButton");
            } else if (shareMessengerActionButton instanceof ShareMessengerURLActionButton) {
                a((ShareMessengerURLActionButton) shareMessengerActionButton);
            }
        }
    }

    private static void a(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) {
        if (ad.a(shareMessengerGenericTemplateContent.f49100k)) {
            throw new j("Must specify Page Id for ShareMessengerGenericTemplateContent");
        } else if (shareMessengerGenericTemplateContent.f49127c == null) {
            throw new j("Must specify element for ShareMessengerGenericTemplateContent");
        } else if (!ad.a(shareMessengerGenericTemplateContent.f49127c.f49129a)) {
            a(shareMessengerGenericTemplateContent.f49127c.f49133e);
        } else {
            throw new j("Must specify title for ShareMessengerGenericTemplateElement");
        }
    }

    public static void a(ShareContent shareContent, b bVar) {
        if (shareContent == null) {
            throw new j("Must provide non-null content to share");
        } else if (shareContent instanceof ShareLinkContent) {
            a((ShareLinkContent) shareContent);
        } else if (shareContent instanceof SharePhotoContent) {
            a((SharePhotoContent) shareContent, bVar);
        } else if (shareContent instanceof ShareVideoContent) {
            bVar.a((ShareVideoContent) shareContent);
        } else if (shareContent instanceof ShareOpenGraphContent) {
            bVar.a((ShareOpenGraphContent) shareContent);
        } else if (shareContent instanceof ShareMediaContent) {
            bVar.a((ShareMediaContent) shareContent);
        } else if (shareContent instanceof ShareCameraEffectContent) {
            a((ShareCameraEffectContent) shareContent);
        } else if (shareContent instanceof ShareMessengerOpenGraphMusicTemplateContent) {
            a((ShareMessengerOpenGraphMusicTemplateContent) shareContent);
        } else if (shareContent instanceof ShareMessengerMediaTemplateContent) {
            a((ShareMessengerMediaTemplateContent) shareContent);
        } else if (shareContent instanceof ShareMessengerGenericTemplateContent) {
            a((ShareMessengerGenericTemplateContent) shareContent);
        } else if (shareContent instanceof ShareStoryContent) {
            bVar.a((ShareStoryContent) shareContent);
        }
    }

    public static void a(ShareMedia shareMedia, b bVar) {
        if (shareMedia instanceof SharePhoto) {
            bVar.a((SharePhoto) shareMedia);
        } else if (shareMedia instanceof ShareVideo) {
            a((ShareVideo) shareMedia);
        } else {
            throw new j(com.a.a(Locale.ROOT, "Invalid media type: %s", new Object[]{shareMedia.getClass().getSimpleName()}));
        }
    }
}
