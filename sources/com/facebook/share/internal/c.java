package com.facebook.share.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.facebook.j;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {
    static {
        Covode.recordClassIndex(30665);
    }

    private static Bundle a(ShareContent shareContent, boolean z) {
        Bundle bundle = new Bundle();
        ad.a(bundle, "com.facebook.platform.extra.LINK", shareContent.f49097h);
        ad.a(bundle, "com.facebook.platform.extra.PLACE", shareContent.f49099j);
        ad.a(bundle, "com.facebook.platform.extra.REF", shareContent.f49101l);
        bundle.putBoolean("com.facebook.platform.extra.DATA_FAILURES_FATAL", z);
        List<String> list = shareContent.f49098i;
        if (!ad.a(list)) {
            bundle.putStringArrayList("com.facebook.platform.extra.FRIENDS", new ArrayList<>(list));
        }
        return bundle;
    }

    public static Bundle a(UUID uuid, ShareContent shareContent, boolean z) {
        ae.a(shareContent, "shareContent");
        ae.a(uuid, "callId");
        if (shareContent instanceof ShareLinkContent) {
            ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent;
            Bundle a2 = a(shareLinkContent, z);
            ad.a(a2, "com.facebook.platform.extra.TITLE", shareLinkContent.f49112b);
            ad.a(a2, "com.facebook.platform.extra.DESCRIPTION", shareLinkContent.f49111a);
            ad.a(a2, "com.facebook.platform.extra.IMAGE", shareLinkContent.f49113c);
            return a2;
        } else if (shareContent instanceof SharePhotoContent) {
            SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
            List<String> a3 = k.a(sharePhotoContent, uuid);
            Bundle a4 = a(sharePhotoContent, z);
            a4.putStringArrayList("com.facebook.platform.extra.PHOTOS", new ArrayList<>(a3));
            return a4;
        } else if ((shareContent instanceof ShareVideoContent) || !(shareContent instanceof ShareOpenGraphContent)) {
            return null;
        } else {
            ShareOpenGraphContent shareOpenGraphContent = (ShareOpenGraphContent) shareContent;
            try {
                JSONObject a5 = k.a(uuid, shareOpenGraphContent);
                Bundle a6 = a(shareOpenGraphContent, z);
                ad.a(a6, "com.facebook.platform.extra.PREVIEW_PROPERTY_NAME", shareOpenGraphContent.f49148b);
                ad.a(a6, "com.facebook.platform.extra.ACTION_TYPE", shareOpenGraphContent.f49147a.b("og:type"));
                ad.a(a6, "com.facebook.platform.extra.ACTION", a5.toString());
                return a6;
            } catch (JSONException e2) {
                throw new j("Unable to create a JSON Object from the provided ShareOpenGraphContent: " + e2.getMessage());
            }
        }
    }
}
