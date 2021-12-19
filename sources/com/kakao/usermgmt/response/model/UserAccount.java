package com.kakao.usermgmt.response.model;

import com.bytedance.covode.number.Covode;
import com.kakao.network.response.ResponseBody;
import com.kakao.util.OptionalBoolean;
import org.json.JSONObject;

public class UserAccount {
    private AgeRange ageRange;
    private OptionalBoolean ageRangeNeedsAgreement;
    private String birthday;
    private OptionalBoolean birthdayNeedsAgreement;
    private BirthdayType birthdayType;
    private String birthyear;
    private OptionalBoolean birthyearNeedsAgreement;
    private String ci;
    private String ciAuthenticatedAt;
    private OptionalBoolean ciNeedsAgreement;
    private String displayId;
    private String email;
    private OptionalBoolean emailNeedsAgreement;
    private Gender gender;
    private OptionalBoolean genderNeedsAgreement;
    private OptionalBoolean hasAgeRange;
    private OptionalBoolean hasBirthday;
    private OptionalBoolean hasBirthyear;
    private OptionalBoolean hasCi;
    private OptionalBoolean hasEmail;
    private OptionalBoolean hasGender;
    private OptionalBoolean hasPhoneNumber;
    private OptionalBoolean isEmailValid;
    private OptionalBoolean isEmailVerified;
    private OptionalBoolean isKakaoTalkUser;
    private OptionalBoolean isKorean;
    private OptionalBoolean isKoreanNeedsAgreement;
    private String legalBirthDate;
    private OptionalBoolean legalBirthDateNeedsAgreement;
    private Gender legalGender;
    private OptionalBoolean legalGenderNeedsAgreement;
    private String legalName;
    private OptionalBoolean legalNameNeedsAgreement;
    private String phoneNumber;
    private OptionalBoolean phoneNumberNeedsAgreement;
    private Profile profile;
    private OptionalBoolean profileNeedsAgreement;
    private JSONObject response;

    static {
        Covode.recordClassIndex(34462);
    }

    public OptionalBoolean ageRangeNeedsAgreement() {
        return this.ageRangeNeedsAgreement;
    }

    public OptionalBoolean birthdayNeedsAgreement() {
        return this.birthdayNeedsAgreement;
    }

    public OptionalBoolean birthyearNeedsAgreement() {
        return this.birthyearNeedsAgreement;
    }

    public String ciAuthenticatedAt() {
        return this.ciAuthenticatedAt;
    }

    public OptionalBoolean ciNeedsAgreement() {
        return this.ciNeedsAgreement;
    }

    public OptionalBoolean emailNeedsAgreement() {
        return this.emailNeedsAgreement;
    }

    public OptionalBoolean genderNeedsAgreement() {
        return this.genderNeedsAgreement;
    }

    public AgeRange getAgeRange() {
        return this.ageRange;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public BirthdayType getBirthdayType() {
        return this.birthdayType;
    }

    public String getBirthyear() {
        return this.birthyear;
    }

    public String getCI() {
        return this.ci;
    }

    public String getDisplayId() {
        return this.displayId;
    }

    public String getEmail() {
        return this.email;
    }

    public Gender getGender() {
        return this.gender;
    }

    public String getLegalBirthDate() {
        return this.legalBirthDate;
    }

    public Gender getLegalGender() {
        return this.legalGender;
    }

    public String getLegalName() {
        return this.legalName;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public Profile getProfile() {
        return this.profile;
    }

    public JSONObject getResponse() {
        return this.response;
    }

    public OptionalBoolean hasAgeRange() {
        return this.hasAgeRange;
    }

    public OptionalBoolean hasBirthday() {
        return this.hasBirthday;
    }

    public OptionalBoolean hasBirthyear() {
        return this.hasBirthyear;
    }

    public OptionalBoolean hasCI() {
        return this.hasCi;
    }

    public OptionalBoolean hasEmail() {
        return this.hasEmail;
    }

    public OptionalBoolean hasGender() {
        return this.hasGender;
    }

    public OptionalBoolean hasPhoneNumber() {
        return this.hasPhoneNumber;
    }

    public OptionalBoolean isEmailValid() {
        return this.isEmailValid;
    }

    public OptionalBoolean isEmailVerified() {
        return this.isEmailVerified;
    }

    public OptionalBoolean isKakaoTalkUser() {
        return this.isKakaoTalkUser;
    }

    public OptionalBoolean isKorean() {
        return this.isKorean;
    }

    public OptionalBoolean isKoreanNeedsAgreement() {
        return this.isKoreanNeedsAgreement;
    }

    public OptionalBoolean legalBirthDateNeedsAgreement() {
        return this.legalBirthDateNeedsAgreement;
    }

    public OptionalBoolean legalGenderNeedsAgreement() {
        return this.legalGenderNeedsAgreement;
    }

    public OptionalBoolean legalNameNeedsAgreement() {
        return this.legalNameNeedsAgreement;
    }

    public OptionalBoolean phoneNumberNeedsAgreement() {
        return this.phoneNumberNeedsAgreement;
    }

    public OptionalBoolean profileNeedsAgreement() {
        return this.profileNeedsAgreement;
    }

    public String toString() {
        return this.response.toString();
    }

    public boolean isKakaotalkUserNeedsAgreement() {
        if (this.isKakaoTalkUser == OptionalBoolean.NONE) {
            return true;
        }
        return false;
    }

    public boolean needsScopeAccountEmail() {
        if (this.hasEmail == OptionalBoolean.TRUE && this.email == null) {
            return true;
        }
        return false;
    }

    public boolean needsScopeAgeRange() {
        if (this.hasAgeRange == OptionalBoolean.TRUE && this.ageRange == null) {
            return true;
        }
        return false;
    }

    public boolean needsScopeBirthday() {
        if (this.hasBirthday == OptionalBoolean.TRUE && this.birthday == null) {
            return true;
        }
        return false;
    }

    public boolean needsScopeGender() {
        if (this.hasGender == OptionalBoolean.TRUE && this.gender == null) {
            return true;
        }
        return false;
    }

    public boolean needsScopeIsKakaotalkUser() {
        if (this.isKakaoTalkUser == OptionalBoolean.NONE) {
            return true;
        }
        return false;
    }

    public boolean needsScopePhoneNumber() {
        if (this.hasPhoneNumber == OptionalBoolean.TRUE && this.phoneNumber == null) {
            return true;
        }
        return false;
    }

    public UserAccount(ResponseBody responseBody) {
        OptionalBoolean optionalBoolean;
        OptionalBoolean optionalBoolean2;
        OptionalBoolean optionalBoolean3;
        OptionalBoolean optionalBoolean4;
        OptionalBoolean optionalBoolean5;
        OptionalBoolean optionalBoolean6;
        OptionalBoolean optionalBoolean7;
        OptionalBoolean optionalBoolean8;
        OptionalBoolean optionalBoolean9;
        OptionalBoolean optionalBoolean10;
        OptionalBoolean optionalBoolean11;
        OptionalBoolean optionalBoolean12;
        OptionalBoolean optionalBoolean13;
        OptionalBoolean optionalBoolean14;
        OptionalBoolean optionalBoolean15;
        OptionalBoolean optionalBoolean16;
        OptionalBoolean optionalBoolean17;
        OptionalBoolean optionalBoolean18;
        OptionalBoolean optionalBoolean19;
        OptionalBoolean optionalBoolean20;
        OptionalBoolean optionalBoolean21;
        OptionalBoolean optionalBoolean22;
        OptionalBoolean optionalBoolean23;
        if (responseBody.has("profile_needs_agreement")) {
            optionalBoolean = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(responseBody.getBoolean("profile_needs_agreement")));
        } else {
            optionalBoolean = OptionalBoolean.NONE;
        }
        this.profileNeedsAgreement = optionalBoolean;
        if (responseBody.has("has_email")) {
            optionalBoolean2 = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(responseBody.getBoolean("has_email")));
        } else {
            optionalBoolean2 = OptionalBoolean.NONE;
        }
        this.hasEmail = optionalBoolean2;
        if (responseBody.has("email_needs_agreement")) {
            optionalBoolean3 = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(responseBody.getBoolean("email_needs_agreement")));
        } else {
            optionalBoolean3 = OptionalBoolean.NONE;
        }
        this.emailNeedsAgreement = optionalBoolean3;
        if (responseBody.has("is_email_verified")) {
            optionalBoolean4 = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(responseBody.getBoolean("is_email_verified")));
        } else {
            optionalBoolean4 = OptionalBoolean.NONE;
        }
        this.isEmailVerified = optionalBoolean4;
        if (responseBody.has("is_email_valid")) {
            optionalBoolean5 = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(responseBody.getBoolean("is_email_valid")));
        } else {
            optionalBoolean5 = OptionalBoolean.NONE;
        }
        this.isEmailValid = optionalBoolean5;
        if (responseBody.has("has_phone_number")) {
            optionalBoolean6 = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(responseBody.getBoolean("has_phone_number")));
        } else {
            optionalBoolean6 = OptionalBoolean.NONE;
        }
        this.hasPhoneNumber = optionalBoolean6;
        if (responseBody.has("phone_number_needs_agreement")) {
            optionalBoolean7 = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(responseBody.getBoolean("phone_number_needs_agreement")));
        } else {
            optionalBoolean7 = OptionalBoolean.NONE;
        }
        this.phoneNumberNeedsAgreement = optionalBoolean7;
        if (responseBody.has("has_age_range")) {
            optionalBoolean8 = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(responseBody.getBoolean("has_age_range")));
        } else {
            optionalBoolean8 = OptionalBoolean.NONE;
        }
        this.hasAgeRange = optionalBoolean8;
        if (responseBody.has("age_range_needs_agreement")) {
            optionalBoolean9 = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(responseBody.getBoolean("age_range_needs_agreement")));
        } else {
            optionalBoolean9 = OptionalBoolean.NONE;
        }
        this.ageRangeNeedsAgreement = optionalBoolean9;
        if (responseBody.has("has_birthday")) {
            optionalBoolean10 = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(responseBody.getBoolean("has_birthday")));
        } else {
            optionalBoolean10 = OptionalBoolean.NONE;
        }
        this.hasBirthday = optionalBoolean10;
        if (responseBody.has("birthday_needs_agreement")) {
            optionalBoolean11 = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(responseBody.getBoolean("birthday_needs_agreement")));
        } else {
            optionalBoolean11 = OptionalBoolean.NONE;
        }
        this.birthdayNeedsAgreement = optionalBoolean11;
        if (responseBody.has("has_birthyear")) {
            optionalBoolean12 = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(responseBody.getBoolean("has_birthyear")));
        } else {
            optionalBoolean12 = OptionalBoolean.NONE;
        }
        this.hasBirthyear = optionalBoolean12;
        if (responseBody.has("birthyear_needs_agreement")) {
            optionalBoolean13 = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(responseBody.getBoolean("birthyear_needs_agreement")));
        } else {
            optionalBoolean13 = OptionalBoolean.NONE;
        }
        this.birthyearNeedsAgreement = optionalBoolean13;
        if (responseBody.has("has_gender")) {
            optionalBoolean14 = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(responseBody.getBoolean("has_gender")));
        } else {
            optionalBoolean14 = OptionalBoolean.NONE;
        }
        this.hasGender = optionalBoolean14;
        if (responseBody.has("gender_needs_agreement")) {
            optionalBoolean15 = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(responseBody.getBoolean("gender_needs_agreement")));
        } else {
            optionalBoolean15 = OptionalBoolean.NONE;
        }
        this.genderNeedsAgreement = optionalBoolean15;
        if (responseBody.has("has_ci")) {
            optionalBoolean16 = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(responseBody.getBoolean("has_ci")));
        } else {
            optionalBoolean16 = OptionalBoolean.NONE;
        }
        this.hasCi = optionalBoolean16;
        if (responseBody.has("ci_needs_agreement")) {
            optionalBoolean17 = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(responseBody.getBoolean("ci_needs_agreement")));
        } else {
            optionalBoolean17 = OptionalBoolean.NONE;
        }
        this.ciNeedsAgreement = optionalBoolean17;
        if (responseBody.has("legal_name_needs_agreement")) {
            optionalBoolean18 = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(responseBody.getBoolean("legal_name_needs_agreement")));
        } else {
            optionalBoolean18 = OptionalBoolean.NONE;
        }
        this.legalNameNeedsAgreement = optionalBoolean18;
        if (responseBody.has("legal_birth_date_needs_agreement")) {
            optionalBoolean19 = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(responseBody.getBoolean("legal_birth_date_needs_agreement")));
        } else {
            optionalBoolean19 = OptionalBoolean.NONE;
        }
        this.legalBirthDateNeedsAgreement = optionalBoolean19;
        if (responseBody.has("legal_gender_needs_agreement")) {
            optionalBoolean20 = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(responseBody.getBoolean("legal_gender_needs_agreement")));
        } else {
            optionalBoolean20 = OptionalBoolean.NONE;
        }
        this.legalGenderNeedsAgreement = optionalBoolean20;
        if (responseBody.has("is_korean_needs_agreement")) {
            optionalBoolean21 = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(responseBody.getBoolean("is_korean_needs_agreement")));
        } else {
            optionalBoolean21 = OptionalBoolean.NONE;
        }
        this.isKoreanNeedsAgreement = optionalBoolean21;
        if (responseBody.has("is_kakaotalk_user")) {
            optionalBoolean22 = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(responseBody.getBoolean("is_kakaotalk_user")));
        } else {
            optionalBoolean22 = OptionalBoolean.NONE;
        }
        this.isKakaoTalkUser = optionalBoolean22;
        if (responseBody.has("is_korean")) {
            optionalBoolean23 = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(responseBody.getBoolean("is_korean")));
        } else {
            optionalBoolean23 = OptionalBoolean.NONE;
        }
        this.isKorean = optionalBoolean23;
        if (responseBody.has("profile")) {
            this.profile = new Profile(responseBody.getBody("profile"));
        }
        if (responseBody.has("email")) {
            this.email = responseBody.getString("email");
        }
        if (responseBody.has("phone_number")) {
            this.phoneNumber = responseBody.getString("phone_number");
        }
        if (responseBody.has("age_range")) {
            this.ageRange = AgeRange.getRange(responseBody.getString("age_range"));
        }
        if (responseBody.has("birthday_type")) {
            this.birthdayType = BirthdayType.getType(responseBody.getString("birthday_type"));
        }
        if (responseBody.has("birthday")) {
            this.birthday = responseBody.getString("birthday");
        }
        if (responseBody.has("birthyear")) {
            this.birthyear = responseBody.getString("birthyear");
        }
        if (responseBody.has("gender")) {
            this.gender = Gender.getGender(responseBody.getString("gender"));
        }
        if (responseBody.has("ci")) {
            this.ci = responseBody.getString("ci");
        }
        if (responseBody.has("ci_authenticated_at")) {
            this.ciAuthenticatedAt = responseBody.getString("ci_authenticated_at");
        }
        if (responseBody.has("legal_name")) {
            this.legalName = responseBody.getString("legal_name");
        }
        if (responseBody.has("legal_birth_date")) {
            this.legalBirthDate = responseBody.getString("legal_birth_date");
        }
        if (responseBody.has("legal_gender")) {
            this.legalGender = Gender.getGender(responseBody.getString("legal_gender"));
        }
        if (responseBody.has("display_id")) {
            this.displayId = responseBody.getString("display_id");
        }
        this.response = responseBody.getJson();
    }
}
