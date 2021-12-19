package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class ProfileNgoStruct implements Serializable {
    @c(a = "ngo_donation_link")
    private String donationLink = "";
    @c(a = "ngo_icon_url")
    private String iconUrl = "";
    @c(a = "ngo_id")
    private int id;
    @c(a = "ngo_name")
    private String name = "";

    static {
        Covode.recordClassIndex(75250);
    }

    public final String getDonationLink() {
        return this.donationLink;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final void setId(int i2) {
        this.id = i2;
    }

    public final void setDonationLink(String str) {
        l.d(str, "");
        this.donationLink = str;
    }

    public final void setIconUrl(String str) {
        l.d(str, "");
        this.iconUrl = str;
    }

    public final void setName(String str) {
        l.d(str, "");
        this.name = str;
    }
}
