package com.kakao.usermgmt.response.model;

import com.bytedance.covode.number.Covode;
import com.kakao.network.response.ResponseBody;
import org.json.JSONObject;

public class Profile {
    private String nickname;
    private String profileImageUrl;
    private JSONObject response;
    private String thumbnailImageUrl;

    static {
        Covode.recordClassIndex(34456);
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    public String getThumbnailImageUrl() {
        return this.thumbnailImageUrl;
    }

    public String toString() {
        return this.response.toString();
    }

    Profile(ResponseBody responseBody) {
        this.nickname = responseBody.optString("nickname", null);
        this.thumbnailImageUrl = responseBody.optString("thumbnail_image_url", null);
        this.profileImageUrl = responseBody.optString("profile_image_url", null);
        this.response = responseBody.getJson();
    }
}
