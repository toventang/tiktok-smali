package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.b;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.List;

public final class RelationLabelNew implements Serializable {
    @b(a = StringJsonAdapterFactory.class)
    @c(a = "extra")
    public RelationLabelExtra extra;
    @c(a = StringSet.type)
    public Integer type = 0;
    @c(a = "user_list")
    public List<RelationLabelUser> userList;

    static {
        Covode.recordClassIndex(59449);
    }

    public final RelationLabelExtra getExtra() {
        return this.extra;
    }

    public final Integer getType() {
        return this.type;
    }

    public final List<RelationLabelUser> getUserList() {
        return this.userList;
    }

    public final void setExtra(RelationLabelExtra relationLabelExtra) {
        this.extra = relationLabelExtra;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public final void setUserList(List<RelationLabelUser> list) {
        this.userList = list;
    }
}
