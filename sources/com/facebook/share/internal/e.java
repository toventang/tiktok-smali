package com.facebook.share.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.a.b.a;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.facebook.j;
import com.facebook.share.internal.b;
import com.facebook.share.model.CameraEffectArguments;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerGenericTemplateElement;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideoContent;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {
    static {
        Covode.recordClassIndex(30668);
    }

    public static Bundle a(UUID uuid, ShareContent shareContent, boolean z) {
        ae.a(shareContent, "shareContent");
        ae.a(uuid, "callId");
        List list = null;
        if (shareContent instanceof ShareLinkContent) {
            ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent;
            Bundle a2 = a(shareLinkContent, z);
            ad.a(a2, "TITLE", shareLinkContent.f49112b);
            ad.a(a2, "DESCRIPTION", shareLinkContent.f49111a);
            ad.a(a2, "IMAGE", shareLinkContent.f49113c);
            ad.a(a2, "QUOTE", shareLinkContent.f49114d);
            ad.a(a2, "MESSENGER_LINK", shareLinkContent.f49097h);
            ad.a(a2, "TARGET_DISPLAY", shareLinkContent.f49097h);
            return a2;
        } else if (shareContent instanceof SharePhotoContent) {
            SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
            List<String> a3 = k.a(sharePhotoContent, uuid);
            Bundle a4 = a(sharePhotoContent, z);
            a4.putStringArrayList("PHOTOS", new ArrayList<>(a3));
            return a4;
        } else if (shareContent instanceof ShareVideoContent) {
            ShareVideoContent shareVideoContent = (ShareVideoContent) shareContent;
            String a5 = k.a(shareVideoContent, uuid);
            Bundle a6 = a(shareVideoContent, z);
            ad.a(a6, "TITLE", shareVideoContent.f49168b);
            ad.a(a6, "DESCRIPTION", shareVideoContent.f49167a);
            ad.a(a6, "VIDEO", a5);
            return a6;
        } else if (shareContent instanceof ShareOpenGraphContent) {
            ShareOpenGraphContent shareOpenGraphContent = (ShareOpenGraphContent) shareContent;
            try {
                JSONObject a7 = k.a(k.a(uuid, shareOpenGraphContent), false);
                Bundle a8 = a(shareOpenGraphContent, z);
                ad.a(a8, "PREVIEW_PROPERTY_NAME", (String) k.a(shareOpenGraphContent.f49148b).second);
                ad.a(a8, "ACTION_TYPE", shareOpenGraphContent.f49147a.b("og:type"));
                ad.a(a8, "ACTION", a7.toString());
                return a8;
            } catch (JSONException e2) {
                throw new j("Unable to create a JSON Object from the provided ShareOpenGraphContent: " + e2.getMessage());
            }
        } else if (shareContent instanceof ShareMediaContent) {
            ShareMediaContent shareMediaContent = (ShareMediaContent) shareContent;
            List<Bundle> a9 = k.a(shareMediaContent, uuid);
            Bundle a10 = a(shareMediaContent, z);
            a10.putParcelableArrayList("MEDIA", new ArrayList<>(a9));
            return a10;
        } else if (shareContent instanceof ShareCameraEffectContent) {
            ShareCameraEffectContent shareCameraEffectContent = (ShareCameraEffectContent) shareContent;
            return a(shareCameraEffectContent, k.a(shareCameraEffectContent, uuid), z);
        } else if (shareContent instanceof ShareMessengerGenericTemplateContent) {
            return a((ShareMessengerGenericTemplateContent) shareContent, z);
        } else {
            if (shareContent instanceof ShareMessengerOpenGraphMusicTemplateContent) {
                return a((ShareMessengerOpenGraphMusicTemplateContent) shareContent, z);
            }
            if (shareContent instanceof ShareMessengerMediaTemplateContent) {
                return a((ShareMessengerMediaTemplateContent) shareContent, z);
            }
            if (!(shareContent instanceof ShareStoryContent)) {
                return null;
            }
            ShareStoryContent shareStoryContent = (ShareStoryContent) shareContent;
            Bundle b2 = k.b(shareStoryContent, uuid);
            Bundle a11 = k.a(shareStoryContent, uuid);
            Bundle a12 = a(shareStoryContent, z);
            if (b2 != null) {
                a12.putParcelable("bg_asset", b2);
            }
            if (a11 != null) {
                a12.putParcelable("interactive_asset_uri", a11);
            }
            if (shareStoryContent.f49163c != null) {
                list = Collections.unmodifiableList(shareStoryContent.f49163c);
            }
            if (!ad.a(list)) {
                a12.putStringArrayList("top_background_color_list", new ArrayList<>(list));
            }
            ad.a(a12, "content_url", shareStoryContent.f49164d);
            return a12;
        }
    }

    private static Bundle a(ShareContent shareContent, boolean z) {
        Bundle bundle = new Bundle();
        ad.a(bundle, "LINK", shareContent.f49097h);
        ad.a(bundle, "PLACE", shareContent.f49099j);
        ad.a(bundle, "PAGE", shareContent.f49100k);
        ad.a(bundle, "REF", shareContent.f49101l);
        bundle.putBoolean("DATA_FAILURES_FATAL", z);
        List<String> list = shareContent.f49098i;
        if (!ad.a(list)) {
            bundle.putStringArrayList("FRIENDS", new ArrayList<>(list));
        }
        ShareHashtag shareHashtag = shareContent.f49102m;
        if (shareHashtag != null) {
            ad.a(bundle, "HASHTAG", shareHashtag.f49109a);
        }
        return bundle;
    }

    private static Bundle a(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent, boolean z) {
        Bundle a2 = a((ShareContent) shareMessengerGenericTemplateContent, z);
        try {
            if (!a.a(d.class)) {
                try {
                    ShareMessengerGenericTemplateElement shareMessengerGenericTemplateElement = shareMessengerGenericTemplateContent.f49127c;
                    if (!a.a(d.class)) {
                        try {
                            if (shareMessengerGenericTemplateElement.f49133e != null) {
                                d.a(a2, shareMessengerGenericTemplateElement.f49133e, false);
                            } else if (shareMessengerGenericTemplateElement.f49132d != null) {
                                d.a(a2, shareMessengerGenericTemplateElement.f49132d, true);
                            }
                            ad.a(a2, "IMAGE", shareMessengerGenericTemplateElement.f49131c);
                            ad.a(a2, "PREVIEW_TYPE", "DEFAULT");
                            ad.a(a2, "TITLE", shareMessengerGenericTemplateElement.f49129a);
                            ad.a(a2, "SUBTITLE", shareMessengerGenericTemplateElement.f49130b);
                        } catch (Throwable th) {
                            a.a(th, d.class);
                        }
                    }
                    ad.a(a2, "MESSENGER_PLATFORM_CONTENT", d.a(shareMessengerGenericTemplateContent));
                } catch (Throwable th2) {
                    a.a(th2, d.class);
                }
            }
            return a2;
        } catch (JSONException e2) {
            throw new j("Unable to create a JSON Object from the provided ShareMessengerGenericTemplateContent: " + e2.getMessage());
        }
    }

    private static Bundle a(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent, boolean z) {
        Bundle a2 = a((ShareContent) shareMessengerMediaTemplateContent, z);
        try {
            if (!a.a(d.class)) {
                try {
                    if (!a.a(d.class)) {
                        try {
                            d.a(a2, shareMessengerMediaTemplateContent.f49137d, false);
                            ad.a(a2, "PREVIEW_TYPE", "DEFAULT");
                            ad.a(a2, "ATTACHMENT_ID", shareMessengerMediaTemplateContent.f49135b);
                            if (shareMessengerMediaTemplateContent.f49136c != null) {
                                ad.a(a2, d.a(shareMessengerMediaTemplateContent.f49136c), shareMessengerMediaTemplateContent.f49136c);
                            }
                            ad.a(a2, StringSet.type, d.a(shareMessengerMediaTemplateContent.f49134a));
                        } catch (Throwable th) {
                            a.a(th, d.class);
                        }
                    }
                    ad.a(a2, "MESSENGER_PLATFORM_CONTENT", d.a(shareMessengerMediaTemplateContent));
                } catch (Throwable th2) {
                    a.a(th2, d.class);
                }
            }
            return a2;
        } catch (JSONException e2) {
            throw new j("Unable to create a JSON Object from the provided ShareMessengerMediaTemplateContent: " + e2.getMessage());
        }
    }

    private static Bundle a(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent, boolean z) {
        Bundle a2 = a((ShareContent) shareMessengerOpenGraphMusicTemplateContent, z);
        try {
            if (!a.a(d.class)) {
                try {
                    if (!a.a(d.class)) {
                        try {
                            d.a(a2, shareMessengerOpenGraphMusicTemplateContent.f49140b, false);
                            ad.a(a2, "PREVIEW_TYPE", "OPEN_GRAPH");
                            ad.a(a2, "OPEN_GRAPH_URL", shareMessengerOpenGraphMusicTemplateContent.f49139a);
                        } catch (Throwable th) {
                            a.a(th, d.class);
                        }
                    }
                    ad.a(a2, "MESSENGER_PLATFORM_CONTENT", d.a(shareMessengerOpenGraphMusicTemplateContent));
                } catch (Throwable th2) {
                    a.a(th2, d.class);
                }
            }
            return a2;
        } catch (JSONException e2) {
            throw new j("Unable to create a JSON Object from the provided ShareMessengerOpenGraphMusicTemplateContent: " + e2.getMessage());
        }
    }

    private static Bundle a(ShareCameraEffectContent shareCameraEffectContent, Bundle bundle, boolean z) {
        JSONObject jSONObject;
        Bundle a2 = a(shareCameraEffectContent, z);
        ad.a(a2, "effect_id", shareCameraEffectContent.f49094a);
        if (bundle != null) {
            a2.putBundle("effect_textures", bundle);
        }
        try {
            CameraEffectArguments cameraEffectArguments = shareCameraEffectContent.f49095b;
            if (cameraEffectArguments == null) {
                jSONObject = null;
            } else {
                jSONObject = new JSONObject();
                for (String str : cameraEffectArguments.f49090a.keySet()) {
                    Object a3 = CameraEffectArguments.a(cameraEffectArguments.f49090a, str);
                    if (a3 != null) {
                        b.a aVar = b.f49067a.get(a3.getClass());
                        if (aVar != null) {
                            aVar.a(jSONObject, str, a3);
                        } else {
                            throw new IllegalArgumentException("Unsupported type: " + a3.getClass());
                        }
                    }
                }
            }
            if (jSONObject != null) {
                ad.a(a2, "effect_arguments", jSONObject.toString());
            }
            return a2;
        } catch (JSONException e2) {
            throw new j("Unable to create a JSON Object from the provided CameraEffectArguments: " + e2.getMessage());
        }
    }
}
