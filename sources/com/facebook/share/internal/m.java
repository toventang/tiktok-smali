package com.facebook.share.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.ad;
import com.facebook.j;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class m {
    static {
        Covode.recordClassIndex(30690);
    }

    private static Bundle a(ShareContent shareContent) {
        Bundle bundle = new Bundle();
        ShareHashtag shareHashtag = shareContent.f49102m;
        if (shareHashtag != null) {
            ad.a(bundle, "hashtag", shareHashtag.f49109a);
        }
        return bundle;
    }

    public static Bundle a(ShareLinkContent shareLinkContent) {
        Bundle a2 = a((ShareContent) shareLinkContent);
        ad.a(a2, "href", shareLinkContent.f49097h);
        ad.a(a2, "quote", shareLinkContent.f49114d);
        return a2;
    }

    public static Bundle a(ShareOpenGraphContent shareOpenGraphContent) {
        Bundle a2 = a((ShareContent) shareOpenGraphContent);
        ad.a(a2, "action_type", shareOpenGraphContent.f49147a.b("og:type"));
        try {
            JSONObject a3 = k.a(k.a(shareOpenGraphContent), false);
            if (a3 != null) {
                ad.a(a2, "action_properties", a3.toString());
            }
            return a2;
        } catch (JSONException e2) {
            throw new j("Unable to serialize the ShareOpenGraphContent to JSON", e2);
        }
    }

    public static Bundle a(SharePhotoContent sharePhotoContent) {
        Bundle a2 = a((ShareContent) sharePhotoContent);
        String[] strArr = new String[sharePhotoContent.f49159a.size()];
        ad.a((List) sharePhotoContent.f49159a, (ad.b) new ad.b<SharePhoto, String>() {
            /* class com.facebook.share.internal.m.AnonymousClass1 */

            static {
                Covode.recordClassIndex(30691);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.facebook.internal.ad.b
            public final /* synthetic */ String a(SharePhoto sharePhoto) {
                return sharePhoto.f49152c.toString();
            }
        }).toArray(strArr);
        a2.putStringArray("media", strArr);
        return a2;
    }
}
