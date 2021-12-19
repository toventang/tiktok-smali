package com.ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.challenge.model.Segment;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.ss.android.ugc.aweme.search.model.e;
import java.util.List;

public class CommentAtSummonFriendItem {
    public boolean isFromSug;
    public boolean isMentionBlocked;
    public String keyword;
    public String label;
    public LogPbBean logPbBean;
    @c(a = "user_info")
    public CommentAtUser mUser;
    public List<Position> positions;
    public String requestId;
    public String searchId;
    @c(a = "position")
    public List<Segment> segments;
    public int type = 1;
    public Word wordRecord;

    static {
        Covode.recordClassIndex(44293);
    }

    public static CommentAtSummonFriendItem toCommentAtSummonFriendItem(SummonFriendItem summonFriendItem) {
        CommentAtSummonFriendItem commentAtSummonFriendItem = new CommentAtSummonFriendItem();
        commentAtSummonFriendItem.label = summonFriendItem.label;
        commentAtSummonFriendItem.segments = summonFriendItem.segments;
        commentAtSummonFriendItem.type = summonFriendItem.type;
        commentAtSummonFriendItem.mUser = CommentAtUser.Companion.toCommentAtUser(summonFriendItem.mUser);
        commentAtSummonFriendItem.logPbBean = summonFriendItem.logPbBean;
        commentAtSummonFriendItem.searchId = summonFriendItem.searchId;
        commentAtSummonFriendItem.isMentionBlocked = summonFriendItem.isMentionBlocked;
        return commentAtSummonFriendItem;
    }

    public static CommentAtSummonFriendItem fromSearchSugEntity(e eVar, String str, String str2) {
        CommentAtSummonFriendItem commentAtSummonFriendItem = new CommentAtSummonFriendItem();
        commentAtSummonFriendItem.positions = eVar.f121520c;
        commentAtSummonFriendItem.mUser = CommentAtUser.Companion.fromSearchSugInfo(eVar.f121524g);
        boolean z = true;
        commentAtSummonFriendItem.isFromSug = true;
        commentAtSummonFriendItem.requestId = str2;
        commentAtSummonFriendItem.keyword = str;
        commentAtSummonFriendItem.wordRecord = eVar.f121523f;
        if (eVar.f121524g.getMentionBlockType() == 0) {
            z = false;
        }
        commentAtSummonFriendItem.isMentionBlocked = z;
        return commentAtSummonFriendItem;
    }
}
