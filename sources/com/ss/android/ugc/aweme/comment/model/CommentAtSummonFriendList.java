package com.ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.ss.android.ugc.aweme.friends.model.SummonFriendList;
import com.ss.android.ugc.aweme.search.model.e;
import com.ss.android.ugc.aweme.search.model.h;
import java.util.ArrayList;
import java.util.List;

public class CommentAtSummonFriendList extends BaseResponse {
    @c(a = "cursor")
    public long cursor;
    @c(a = "has_more")
    public boolean hasMore;
    @c(a = "user_list")
    public List<CommentAtSummonFriendItem> items;
    @c(a = "input_keyword")
    public String keyword;
    @c(a = "log_pb")
    public LogPbBean logPbBean;
    @c(a = "rid")
    public String requestId;

    static {
        Covode.recordClassIndex(44294);
    }

    public CommentAtSummonFriendList() {
    }

    public static List<CommentAtSummonFriendItem> toCommonAtSummonFriendItems(List<SummonFriendItem> list) {
        ArrayList arrayList = new ArrayList();
        for (SummonFriendItem summonFriendItem : list) {
            arrayList.add(CommentAtSummonFriendItem.toCommentAtSummonFriendItem(summonFriendItem));
        }
        return arrayList;
    }

    public static CommentAtSummonFriendList toCommonAtSummonFriendList(SummonFriendList summonFriendList) {
        CommentAtSummonFriendList commentAtSummonFriendList = new CommentAtSummonFriendList();
        commentAtSummonFriendList.cursor = summonFriendList.cursor;
        commentAtSummonFriendList.hasMore = summonFriendList.hasMore;
        commentAtSummonFriendList.keyword = summonFriendList.keyword;
        commentAtSummonFriendList.logPbBean = summonFriendList.logPbBean;
        commentAtSummonFriendList.requestId = summonFriendList.requestId;
        commentAtSummonFriendList.items = toCommonAtSummonFriendItems(summonFriendList.items);
        return commentAtSummonFriendList;
    }

    public static CommentAtSummonFriendList fromSearchSug(h hVar, String str) {
        CommentAtSummonFriendList commentAtSummonFriendList = new CommentAtSummonFriendList();
        commentAtSummonFriendList.hasMore = hVar.a();
        commentAtSummonFriendList.keyword = str;
        commentAtSummonFriendList.logPbBean = hVar.f121537b;
        commentAtSummonFriendList.requestId = hVar.f121538c;
        commentAtSummonFriendList.items = fromSearchSugToList(hVar, str);
        return commentAtSummonFriendList;
    }

    public static List<CommentAtSummonFriendItem> fromSearchSugToList(h hVar, String str) {
        ArrayList arrayList = new ArrayList();
        if (!(hVar == null || hVar.f121536a == null || hVar.f121536a.isEmpty())) {
            for (e eVar : hVar.f121536a) {
                arrayList.add(CommentAtSummonFriendItem.fromSearchSugEntity(eVar, str, hVar.f121538c));
            }
        }
        return arrayList;
    }

    public CommentAtSummonFriendList(List<CommentAtSummonFriendItem> list, long j2, boolean z, String str) {
        this.items = list;
        this.cursor = j2;
        this.hasMore = z;
        this.keyword = str;
    }
}
