package com.ss.android.ugc.aweme.openshare;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.openshare.entity.DYBaseRequest;
import com.ss.android.ugc.aweme.openshare.entity.DYBaseResp;
import com.ss.android.ugc.aweme.openshare.entity.DYMediaContent;
import java.util.ArrayList;

public final class Share {
    static {
        Covode.recordClassIndex(73721);
    }

    public static class Response extends DYBaseResp {
        public String state;
        public int subErrorCode;

        static {
            Covode.recordClassIndex(73723);
        }

        @Override // com.bytedance.sdk.a.c.a.b, com.ss.android.ugc.aweme.openshare.entity.DYBaseResp
        public int getType() {
            return 4;
        }

        public Response() {
        }

        public Response(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // com.bytedance.sdk.a.c.a.b, com.ss.android.ugc.aweme.openshare.entity.DYBaseResp
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.state = bundle.getString("_aweme_open_sdk_params_state");
            this.subErrorCode = bundle.getInt("_aweme_open_sdk_params_sub_error_code");
        }

        @Override // com.bytedance.sdk.a.c.a.b, com.ss.android.ugc.aweme.openshare.entity.DYBaseResp
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_aweme_open_sdk_params_state", this.state);
            bundle.putInt("_aweme_open_sdk_params_sub_error_code", this.subErrorCode);
        }
    }

    public static class Request extends DYBaseRequest {
        public ArrayList<String> mHashTagList = new ArrayList<>();
        public DYMediaContent mMediaContent;
        public int mTargetSceneType;

        static {
            Covode.recordClassIndex(73722);
        }

        public static int com_ss_android_ugc_aweme_openshare_Share$Request_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
            return 0;
        }

        @Override // com.bytedance.sdk.a.c.a.a, com.ss.android.ugc.aweme.openshare.entity.DYBaseRequest
        public int getType() {
            return 3;
        }

        public Request() {
        }

        @Override // com.bytedance.sdk.a.c.a.a
        public boolean checkArgs() {
            DYMediaContent dYMediaContent = this.mMediaContent;
            if (dYMediaContent != null) {
                return dYMediaContent.checkArgs();
            }
            com_ss_android_ugc_aweme_openshare_Share$Request_com_ss_android_ugc_aweme_lancet_LogLancet_e("Aweme.OpenSDK.Share", "checkArgs fail ,mediaContent is null");
            return false;
        }

        public Request(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // com.bytedance.sdk.a.c.a.a, com.ss.android.ugc.aweme.openshare.entity.DYBaseRequest
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.mTargetSceneType = bundle.getInt("_aweme_open_sdk_params_target_landpage_scene", 0);
            this.mHashTagList = bundle.getStringArrayList("_aweme_open_sdk_params_hashtag_list");
            this.mMediaContent = DYMediaContent.a.a(bundle);
        }

        @Override // com.bytedance.sdk.a.c.a.a, com.ss.android.ugc.aweme.openshare.entity.DYBaseRequest
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            DYMediaContent dYMediaContent = this.mMediaContent;
            Bundle bundle2 = new Bundle();
            if (dYMediaContent.mMediaObject != null) {
                bundle2.putString("_dyobject_identifier_", dYMediaContent.mMediaObject.getClass().getName());
                dYMediaContent.mMediaObject.serialize(bundle2);
            }
            bundle.putAll(bundle2);
            bundle.putInt("_aweme_open_sdk_params_target_landpage_scene", this.mTargetSceneType);
            bundle.putStringArrayList("_aweme_open_sdk_params_hashtag_list", this.mHashTagList);
        }
    }
}
