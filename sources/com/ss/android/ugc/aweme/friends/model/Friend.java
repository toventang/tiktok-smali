package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.reflect.Field;
import java.util.Objects;

public class Friend extends User {
    private boolean invited;
    private boolean isFirstOne;
    @c(a = "phone_number")
    private String phoneNumber;
    private transient String photoUri;
    private String section = "";
    @c(a = "social_name")
    private String socialName;

    static {
        Covode.recordClassIndex(61573);
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getPhotoUri() {
        return this.photoUri;
    }

    public String getSection() {
        return this.section;
    }

    public String getSocialName() {
        return this.socialName;
    }

    public boolean isFirstOne() {
        return this.isFirstOne;
    }

    public boolean isInvited() {
        return this.invited;
    }

    @Override // com.ss.android.ugc.aweme.profile.model.User
    public int hashCode() {
        int i2;
        int hashCode = super.hashCode() * 31;
        String str = this.socialName;
        int i3 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = (hashCode + i2) * 31;
        String str2 = this.phoneNumber;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i4 + i3;
    }

    public void setFirstOne(boolean z) {
        this.isFirstOne = z;
    }

    public void setInvited(boolean z) {
        this.invited = z;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public void setPhotoUri(String str) {
        this.photoUri = str;
    }

    public void setSection(String str) {
        this.section = str;
    }

    public void setSocialName(String str) {
        this.socialName = str;
    }

    public Friend(String str) {
        this.socialName = str;
    }

    public static Friend copyFrom(User user) {
        if (user == null) {
            return null;
        }
        if (user instanceof Friend) {
            return (Friend) user;
        }
        Friend friend = new Friend(null);
        Field[] declaredFields = User.class.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.getAnnotation(c.class) != null) {
                field.setAccessible(true);
                try {
                    field.set(friend, field.get(user));
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                }
            }
        }
        return friend;
    }

    @Override // com.ss.android.ugc.aweme.profile.model.User
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        Friend friend = (Friend) obj;
        if (!Objects.equals(this.socialName, friend.socialName) || !Objects.equals(this.phoneNumber, friend.phoneNumber)) {
            return false;
        }
        return true;
    }
}
