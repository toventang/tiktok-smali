package com.kakao.usermgmt.response;

import com.bytedance.covode.number.Covode;
import com.kakao.network.response.JSONObjectResponse;
import com.kakao.network.response.ResponseBody;
import com.kakao.network.response.ResponseStringConverter;
import com.kakao.usermgmt.response.model.UserAccount;
import com.kakao.util.OptionalBoolean;
import java.util.Map;
import org.json.JSONObject;

public class MeV2Response extends JSONObjectResponse {
    public static final ResponseStringConverter<MeV2Response> CONVERTER = new ResponseStringConverter<MeV2Response>() {
        /* class com.kakao.usermgmt.response.MeV2Response.AnonymousClass1 */

        static {
            Covode.recordClassIndex(34446);
        }

        public final MeV2Response convert(String str) {
            return new MeV2Response(str);
        }
    };
    private String connectedAt;
    private JSONObject forPartners;
    private String groupUserToken;
    private OptionalBoolean hasSignedUp;
    private Long id;
    private UserAccount kakaoAccount;
    private String nickname;
    private String profileImagePath;
    private Map<String, String> properties;
    private String synchedAt;
    private String thumbnailImagePath;

    public JSONObject forPartners() {
        return this.forPartners;
    }

    public String getConnectedAt() {
        return this.connectedAt;
    }

    public String getGroupUserToken() {
        return this.groupUserToken;
    }

    public UserAccount getKakaoAccount() {
        return this.kakaoAccount;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getProfileImagePath() {
        return this.profileImagePath;
    }

    public Map<String, String> getProperties() {
        return this.properties;
    }

    public String getSynchedAt() {
        return this.synchedAt;
    }

    public String getThumbnailImagePath() {
        return this.thumbnailImagePath;
    }

    public OptionalBoolean hasSignedUp() {
        return this.hasSignedUp;
    }

    public long getId() {
        return this.id.longValue();
    }

    static {
        Covode.recordClassIndex(34445);
    }

    public String toString() {
        return getBody().toString();
    }

    MeV2Response(String str) {
        super(str);
        OptionalBoolean optionalBoolean;
        if (getBody().has("id")) {
            this.id = Long.valueOf(getBody().getLong("id"));
        }
        this.groupUserToken = getBody().optString("group_user_token", null);
        if (getBody().has("has_signed_up")) {
            optionalBoolean = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(getBody().getBoolean("has_signed_up")));
        } else {
            optionalBoolean = OptionalBoolean.NONE;
        }
        this.hasSignedUp = optionalBoolean;
        if (getBody().has("properties")) {
            Map<String, String> map = ResponseBody.toMap(getBody().getBody("properties"));
            this.properties = map;
            if (map.containsKey("nickname")) {
                this.nickname = this.properties.get("nickname");
            }
            if (this.properties.containsKey("thumbnail_image")) {
                this.thumbnailImagePath = this.properties.get("thumbnail_image");
            }
            if (this.properties.containsKey("profile_image")) {
                this.profileImagePath = this.properties.get("profile_image");
            }
        }
        if (getBody().has("kakao_account")) {
            this.kakaoAccount = new UserAccount(getBody().getBody("kakao_account"));
        }
        if (getBody().has("for_partner")) {
            this.forPartners = getBody().getBody("for_partner").getJson();
        }
        this.connectedAt = getBody().optString("connected_at", null);
        this.synchedAt = getBody().optString("synched_at", null);
    }
}
