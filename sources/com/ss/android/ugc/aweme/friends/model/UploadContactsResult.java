package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

public class UploadContactsResult extends BaseResponse {
    @c(a = "unregistered_contact")
    public List<ContactModel> contacts;
    @c(a = "log_pb")
    public LogPbBean logPbBean;
    @c(a = "registered_user")
    public List<User> users;

    static {
        Covode.recordClassIndex(61623);
    }
}
