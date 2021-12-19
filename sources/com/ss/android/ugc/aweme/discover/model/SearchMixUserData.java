package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.mixfeed.g;
import java.util.List;

public class SearchMixUserData {
    public g cardInfo;
    public String cardTitle;
    public boolean hasTopUser;
    public List<SearchUser> users;

    static {
        Covode.recordClassIndex(50948);
    }

    public SearchMixUserData setCardTitle(String str) {
        this.cardTitle = str;
        return this;
    }

    public SearchMixUserData setHasTopUser(boolean z) {
        this.hasTopUser = z;
        return this;
    }

    public SearchMixUserData setUsers(List<SearchUser> list) {
        this.users = list;
        return this;
    }
}
