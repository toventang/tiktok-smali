package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.challenge.model.Segment;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

public class SummonFriendItem {
    public boolean isMentionBlocked;
    public String label;
    public LogPbBean logPbBean;
    @c(a = "user_info")
    public User mUser;
    public String searchId;
    @c(a = "position")
    public List<Segment> segments;
    public int type = 1;

    static {
        Covode.recordClassIndex(61606);
    }
}
