package com.ss.android.ugc.aweme.account.login.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;

public final class PhoneCountryCodeResponse {
    private final HashMap<String, List<PhoneCountryData>> map;

    static {
        Covode.recordClassIndex(39139);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.account.login.model.PhoneCountryCodeResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhoneCountryCodeResponse copy$default(PhoneCountryCodeResponse phoneCountryCodeResponse, HashMap hashMap, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hashMap = phoneCountryCodeResponse.map;
        }
        return phoneCountryCodeResponse.copy(hashMap);
    }

    public final HashMap<String, List<PhoneCountryData>> component1() {
        return this.map;
    }

    public final PhoneCountryCodeResponse copy(HashMap<String, List<PhoneCountryData>> hashMap) {
        return new PhoneCountryCodeResponse(hashMap);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof PhoneCountryCodeResponse) && l.a(this.map, ((PhoneCountryCodeResponse) obj).map);
        }
        return true;
    }

    public final int hashCode() {
        HashMap<String, List<PhoneCountryData>> hashMap = this.map;
        if (hashMap != null) {
            return hashMap.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PhoneCountryCodeResponse(map=" + this.map + ")";
    }

    public final HashMap<String, List<PhoneCountryData>> getMap() {
        return this.map;
    }

    public PhoneCountryCodeResponse(HashMap<String, List<PhoneCountryData>> hashMap) {
        this.map = hashMap;
    }
}
