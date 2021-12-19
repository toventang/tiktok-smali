package com.kakao.usermgmt.response.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.kakao.auth.Session;
import com.kakao.network.response.ResponseBody;
import com.kakao.util.helper.SharedPreferencesCache;
import java.util.HashMap;
import java.util.Map;

public class UserProfile implements Parcelable, User {
    public static final Parcelable.Creator<UserProfile> CREATOR = new Parcelable.Creator<UserProfile>() {
        /* class com.kakao.usermgmt.response.model.UserProfile.AnonymousClass1 */

        static {
            Covode.recordClassIndex(34464);
        }

        @Override // android.os.Parcelable.Creator
        public final UserProfile[] newArray(int i2) {
            return new UserProfile[i2];
        }

        @Override // android.os.Parcelable.Creator
        public final UserProfile createFromParcel(Parcel parcel) {
            return new UserProfile(parcel);
        }
    };
    private String email;
    private boolean emailVerified;
    private final long id;
    private String nickname;
    private String profileImagePath;
    private Map<String, String> properties = new HashMap();
    private final int remainingGroupMsgCount;
    private final int remainingInviteCount;
    private final long serviceUserId;
    private String thumbnailImagePath;
    private final String uuid;

    public int describeContents() {
        return 0;
    }

    public String getEmail() {
        return this.email;
    }

    public boolean getEmailVerified() {
        return this.emailVerified;
    }

    @Override // com.kakao.usermgmt.response.model.User
    public long getId() {
        return this.id;
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

    public int getRemainingGroupMsgCount() {
        return this.remainingGroupMsgCount;
    }

    public int getRemainingInviteCount() {
        return this.remainingInviteCount;
    }

    @Override // com.kakao.usermgmt.response.model.User
    public long getServiceUserId() {
        return this.serviceUserId;
    }

    public String getThumbnailImagePath() {
        return this.thumbnailImagePath;
    }

    @Override // com.kakao.usermgmt.response.model.User
    public String getUUID() {
        return this.uuid;
    }

    static {
        Covode.recordClassIndex(34463);
    }

    public static UserProfile loadFromCache() {
        SharedPreferencesCache appCache = Session.getCurrentSession().getAppCache();
        if (appCache == null) {
            return null;
        }
        return new UserProfile(appCache);
    }

    public void saveUserToCache() {
        SharedPreferencesCache appCache = Session.getCurrentSession().getAppCache();
        if (appCache != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("com.kakao.user.userId", this.id);
            bundle.putString("com.kakao.user.email", this.email);
            bundle.putBoolean("com.kakao.user.email_verified", this.emailVerified);
            bundle.putString("com.kakao.user.nickname", this.nickname);
            bundle.putString("com.kakao.user.thumbbnailpath", this.thumbnailImagePath);
            bundle.putString("com.kakao.user.profilepath", this.profileImagePath);
            bundle.putString("com.kakao.user.uuid", this.uuid);
            bundle.putLong("com.kakao.user.serviceuserid", this.serviceUserId);
            bundle.putInt("com.kakao.user.remaininginvitecount", this.remainingInviteCount);
            bundle.putInt("com.kakao.user.remaininggroupmsgcount", this.remainingGroupMsgCount);
            if (!this.properties.isEmpty()) {
                for (String str : this.properties.keySet()) {
                    bundle.putString("com.kakao.user.properties.".concat(String.valueOf(str)), this.properties.get(str));
                }
            }
            appCache.save(bundle);
        }
    }

    public String toString() {
        return "UserProfile{nickname='" + this.nickname + '\'' + ", email='" + this.email + '\'' + ", email_verified='" + this.emailVerified + '\'' + ", thumbnailImagePath='" + this.thumbnailImagePath + '\'' + ", profileImagePath='" + this.profileImagePath + '\'' + ", code='" + this.uuid + '\'' + ", serviceUserId='" + this.serviceUserId + '\'' + ", remainingInviteCount='" + this.remainingInviteCount + '\'' + ", remainingGroupMsgCount='" + this.remainingGroupMsgCount + '\'' + ", properties=" + this.properties + '}';
    }

    public String getProperty(String str) {
        Map<String, String> map = this.properties;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public UserProfile updateUserProfile(Map<String, String> map) {
        if (map != null) {
            String remove = map.remove("nickname");
            if (remove != null) {
                this.nickname = remove;
            }
            String remove2 = map.remove("thumbnail_image");
            if (remove2 != null) {
                this.thumbnailImagePath = remove2;
            }
            String remove3 = map.remove("profile_image");
            if (remove3 != null) {
                this.profileImagePath = remove3;
            }
            if (!map.isEmpty()) {
                this.properties.putAll(map);
            }
        }
        return this;
    }

    public UserProfile(Parcel parcel) {
        boolean z;
        this.id = parcel.readLong();
        this.email = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.emailVerified = z;
        this.nickname = parcel.readString();
        this.thumbnailImagePath = parcel.readString();
        this.profileImagePath = parcel.readString();
        this.uuid = parcel.readString();
        this.serviceUserId = parcel.readLong();
        this.remainingInviteCount = parcel.readInt();
        this.remainingGroupMsgCount = parcel.readInt();
        parcel.readMap(this.properties, getClass().getClassLoader());
    }

    public UserProfile(ResponseBody responseBody) {
        long j2 = responseBody.getLong("id");
        this.id = j2;
        if (j2 > 0) {
            this.email = responseBody.optString("kaccount_email", null);
            this.emailVerified = responseBody.optBoolean("kaccount_email_verified", false);
            this.uuid = responseBody.optString("uuid", null);
            this.serviceUserId = responseBody.optLong("service_user_id", 0);
            this.remainingInviteCount = responseBody.optInt("remaining_invite_count", 0);
            this.remainingGroupMsgCount = responseBody.optInt("remaining_group_msg_count", 0);
            if (responseBody.has("properties")) {
                Map<String, String> map = ResponseBody.toMap(responseBody.getBody("properties"));
                this.properties = map;
                this.nickname = map.remove("nickname");
                this.thumbnailImagePath = this.properties.remove("thumbnail_image");
                this.profileImagePath = this.properties.remove("profile_image");
                return;
            }
            this.nickname = null;
            this.thumbnailImagePath = null;
            this.profileImagePath = null;
            return;
        }
        throw new ResponseBody.ResponseBodyException("User is called but the result user is null.");
    }

    public UserProfile(SharedPreferencesCache sharedPreferencesCache) {
        this.id = sharedPreferencesCache.getLong("com.kakao.user.userId").longValue();
        this.email = sharedPreferencesCache.getString("com.kakao.user.email");
        this.emailVerified = sharedPreferencesCache.getBoolean("com.kakao.user.email_verified").booleanValue();
        this.nickname = sharedPreferencesCache.getString("com.kakao.user.nickname");
        this.thumbnailImagePath = sharedPreferencesCache.getString("com.kakao.user.thumbbnailpath");
        this.profileImagePath = sharedPreferencesCache.getString("com.kakao.user.profilepath");
        this.properties = sharedPreferencesCache.getStringMap("com.kakao.user.properties.");
        this.uuid = sharedPreferencesCache.getString("com.kakao.user.uuid");
        this.serviceUserId = sharedPreferencesCache.getLong("com.kakao.user.serviceuserid").longValue();
        this.remainingInviteCount = sharedPreferencesCache.getInt("com.kakao.user.remaininginvitecount");
        this.remainingGroupMsgCount = sharedPreferencesCache.getInt("com.kakao.user.remaininggroupmsgcount");
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.id);
        parcel.writeString(this.email);
        parcel.writeInt(this.emailVerified ? 1 : 0);
        parcel.writeString(this.nickname);
        parcel.writeString(this.thumbnailImagePath);
        parcel.writeString(this.profileImagePath);
        parcel.writeString(this.uuid);
        parcel.writeLong(this.serviceUserId);
        parcel.writeInt(this.remainingInviteCount);
        parcel.writeInt(this.remainingGroupMsgCount);
        parcel.writeMap(this.properties);
    }
}
