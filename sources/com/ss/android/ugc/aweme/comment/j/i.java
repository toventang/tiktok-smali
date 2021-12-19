package com.ss.android.ugc.aweme.comment.j;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.comment.adapter.d;
import com.ss.android.ugc.aweme.comment.api.CommentApi;
import com.ss.android.ugc.aweme.comment.f.l;
import com.ss.android.ugc.aweme.comment.m.d;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.comment.ui.de;
import com.ss.android.ugc.aweme.comment.util.f;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.emoji.c.a;
import com.ss.android.ugc.aweme.emoji.i.b.b;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.in;
import h.a.ag;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class i extends a<Comment, CommentItemList> {

    /* renamed from: b  reason: collision with root package name */
    public String f72033b;

    /* renamed from: c  reason: collision with root package name */
    protected String f72034c;

    /* renamed from: d  reason: collision with root package name */
    public String f72035d;

    /* renamed from: e  reason: collision with root package name */
    public l f72036e;

    /* renamed from: f  reason: collision with root package name */
    public long f72037f;

    /* renamed from: g  reason: collision with root package name */
    public de f72038g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f72039h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f72040i;

    /* renamed from: j  reason: collision with root package name */
    private int f72041j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f72042k = Keva.getRepo("ab_repo_cold_boot").getBoolean("clear_red_point_cost", false);

    static {
        Covode.recordClassIndex(44254);
    }

    public final long b() {
        if (this.mData == null) {
            return 0;
        }
        return ((CommentItemList) this.mData).total;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public boolean isHasMore() {
        if (this.mData == null || !((CommentItemList) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public List<Comment> getItems() {
        l lVar;
        if (this.mData == null) {
            return null;
        }
        if (((CommentItemList) this.mData).replyStyle != 2 || (lVar = this.f72036e) == null) {
            return ((CommentItemList) this.mData).items;
        }
        return lVar.a();
    }

    public final boolean a() {
        if (TextUtils.equals(this.f72034c, "v1") || TextUtils.equals(this.f72034c, "v2")) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 5) {
            return false;
        }
        return true;
    }

    private static void a(Comment comment) {
        comment.setTimeFormat(f.b(comment));
        User user = comment.getUser();
        if (user != null) {
            user.setUserDisplayName(in.a(user, false));
        }
        b.a((Context) null, comment.getText());
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public void refreshList(Object... objArr) {
        a((String) objArr[1], 0, (String) objArr[2], (Long) objArr[3], ((Integer) objArr[4]).intValue());
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public void loadMoreList(Object... objArr) {
        long j2;
        String str = (String) objArr[1];
        if (isDataEmpty()) {
            j2 = 0;
        } else {
            j2 = ((CommentItemList) this.mData).cursor;
        }
        a(str, j2, (String) objArr[2], (Long) objArr[3], ((Integer) objArr[4]).intValue());
    }

    protected static CommentItemList a(CommentItemList commentItemList) {
        List<Comment> list;
        if (!(!d.a().f71352a || commentItemList == null || (list = commentItemList.items) == null || list.size() == 0)) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                a(list.get(i2));
                List<Comment> replyComments = list.get(i2).getReplyComments();
                if (replyComments != null) {
                    for (int i3 = 0; i3 < replyComments.size(); i3++) {
                        a(replyComments.get(i3));
                    }
                }
            }
        }
        return commentItemList;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void a(CommentItemList commentItemList) {
        int size;
        if (this.f72033b != null) {
            com.ss.android.ugc.aweme.comment.m.d dVar = this.f72020a;
            String str = this.f72033b;
            h.f.b.l.d(str, "");
            dVar.f72109a.put("GroupId", str);
        }
        com.ss.android.ugc.aweme.comment.m.d dVar2 = this.f72020a;
        String str2 = this.f72034c;
        h.f.b.l.d(str2, "");
        dVar2.f72109a.put("MethodName", str2);
        if (commentItemList != null) {
            this.f72020a.f72109a.put("TotalCount", String.valueOf(commentItemList.total));
            com.ss.android.ugc.aweme.comment.m.d dVar3 = this.f72020a;
            if (commentItemList.items == null) {
                size = 0;
            } else {
                size = commentItemList.items.size();
            }
            dVar3.f72109a.put("ActualReturnCount", String.valueOf(size));
            this.f72020a.f72109a.put("Offset", String.valueOf(commentItemList.cursor));
        }
        com.ss.android.ugc.aweme.comment.m.d dVar4 = this.f72020a;
        if (!dVar4.f72109a.containsKey("UserId")) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            if (g2.isLogin()) {
                ConcurrentHashMap<String, String> concurrentHashMap = dVar4.f72109a;
                IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                h.f.b.l.b(g3, "");
                String curUserId = g3.getCurUserId();
                h.f.b.l.b(curUserId, "");
                concurrentHashMap.put("UserId", curUserId);
            }
        }
        if (!dVar4.f72109a.containsKey("DeviceId")) {
            ConcurrentHashMap<String, String> concurrentHashMap2 = dVar4.f72109a;
            String deviceId = DeviceRegisterManager.getDeviceId();
            h.f.b.l.b(deviceId, "");
            concurrentHashMap2.put("DeviceId", deviceId);
        }
        try {
            n.a("aweme_comment_list_api_monitor_log", new JSONObject(ag.c(dVar4.f72109a)));
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.comment.j.a, com.ss.android.ugc.aweme.common.b
    public /* synthetic */ void handleData(CommentItemList commentItemList) {
        boolean z;
        CommentItemList commentItemList2 = commentItemList;
        com.ss.android.ugc.aweme.comment.m.d dVar = this.f72020a;
        dVar.f72109a.put("Duration", String.valueOf(System.currentTimeMillis() - dVar.f72110b));
        if (commentItemList2 != null) {
            if (commentItemList2.newInsertIds != null) {
                this.f72035d = commentItemList2.newInsertIds;
            }
            this.f72020a.a(commentItemList2);
            if (this.f72039h) {
                for (Comment comment : commentItemList2.items) {
                    if (TextUtils.equals(this.f72035d, comment.getCid())) {
                        this.f72038g.a(comment);
                    }
                }
            }
            if (this.f72040i) {
                for (Comment comment2 : commentItemList2.items) {
                    if (TextUtils.equals(this.f72035d, comment2.getCid())) {
                        this.f72038g.b(comment2);
                    }
                }
            }
        }
        a(commentItemList2);
        if (a()) {
            long j2 = this.f72037f;
            if (j2 != 0) {
                if (commentItemList2 == null) {
                    d.a.a(this.f72034c, this.f72033b, j2, 102, "", "");
                } else if (com.bytedance.common.utility.collection.b.a((Collection) commentItemList2.items)) {
                    d.a.a(this.f72034c, this.f72033b, this.f72037f, 101, "", "");
                }
            }
        }
        boolean z2 = false;
        if (commentItemList2 == null || (com.bytedance.common.utility.collection.b.a((Collection) commentItemList2.items) && this.mListQueryType == 4)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i2 = this.mListQueryType;
            if (i2 == 1) {
                List<Comment> list = commentItemList2.items;
                this.mData = commentItemList2;
                ((CommentItemList) this.mData).items = new ArrayList();
                a(list);
            } else if (i2 == 4) {
                a(commentItemList2.items);
                ((CommentItemList) this.mData).total = commentItemList2.total;
                ((CommentItemList) this.mData).cursor = commentItemList2.cursor;
                CommentItemList commentItemList3 = (CommentItemList) this.mData;
                if (commentItemList2.hasMore && ((CommentItemList) this.mData).hasMore) {
                    z2 = true;
                }
                commentItemList3.hasMore = z2;
            }
        } else if (this.mData != null) {
            if (this.mListQueryType == 1) {
                List<Comment> list2 = commentItemList2.items;
                this.mData = commentItemList2;
                ((CommentItemList) this.mData).items = new ArrayList();
                a(list2);
            }
            ((CommentItemList) this.mData).hasMore = false;
        }
        a.f89110a.a();
    }

    /* access modifiers changed from: protected */
    public void a(List<Comment> list) {
        l lVar;
        if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
            if (((CommentItemList) this.mData).replyStyle != 2 || (lVar = this.f72036e) == null) {
                for (Comment comment : list) {
                    if (!com.bytedance.common.utility.collection.b.a((Collection) comment.getReplyComments())) {
                        Comment comment2 = comment.getReplyComments().get(0);
                        ArrayList arrayList = new ArrayList();
                        comment.setReplyComments(null);
                        arrayList.add(comment);
                        comment2.setReplyComments(arrayList);
                        comment = comment2;
                    }
                    comment.setNeedHint(TextUtils.equals(this.f72035d, comment.getCid()));
                    if (!((CommentItemList) this.mData).items.contains(comment)) {
                        comment.setCommentType(1);
                        ((CommentItemList) this.mData).items.add(comment);
                    }
                }
                return;
            }
            lVar.b();
            this.f72036e.a(this.f72035d);
            this.f72036e.a(this.f72041j);
            if (this.mListQueryType == 1) {
                this.f72036e.c();
            }
            this.f72036e.a(list);
        }
    }

    private void a(String str, long j2, String str2, Long l2, int i2) {
        this.f72033b = str;
        this.f72035d = str2;
        this.f72041j = i2;
        if (this.f72042k) {
            b.i.b(new j(this, str2, j2, l2, i2), g.a());
            return;
        }
        com.ss.android.ugc.aweme.framework.a.a.b(4, "CommentLog", "CommentFetchModel: fetchList: aid = " + this.f72033b + " insertCids = " + str2);
        this.f72034c = "v2";
        if (com.ss.android.ugc.aweme.comment.adapter.d.a().f71352a) {
            CommentApi.a(this.f72033b, j2, 20, str2, l2, i2).a(new b.g<CommentItemList, CommentItemList>() {
                /* class com.ss.android.ugc.aweme.comment.j.i.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(44256);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
                @Override // b.g
                public final /* synthetic */ CommentItemList then(b.i<CommentItemList> iVar) {
                    if (!iVar.c()) {
                        return i.a(iVar.d());
                    }
                    throw iVar.e();
                }
            }).a(new com.ss.android.ugc.aweme.net.g(this.mHandler));
        } else {
            CommentApi.a(this.f72033b, j2, 20, str2, l2, i2).a(new com.ss.android.ugc.aweme.net.g(this.mHandler));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(String str, long j2, int i2, Long l2, int i3) {
        com.ss.android.ugc.aweme.framework.a.a.b(4, "CommentLog", "CommentFetchModel: fetchList task call: aid = " + this.f72033b + " insertCids = " + str);
        this.f72034c = "v2";
        if (com.ss.android.ugc.aweme.comment.adapter.d.a().f71352a) {
            CommentApi.a(this.f72033b, j2, i2, str, l2, i3).a(new b.g<CommentItemList, CommentItemList>() {
                /* class com.ss.android.ugc.aweme.comment.j.i.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(44255);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
                @Override // b.g
                public final /* synthetic */ CommentItemList then(b.i<CommentItemList> iVar) {
                    if (!iVar.c()) {
                        return i.a(iVar.d());
                    }
                    throw iVar.e();
                }
            }).a(new com.ss.android.ugc.aweme.net.g(this.mHandler));
            return null;
        }
        CommentApi.a(this.f72033b, j2, i2, str, l2, i3).a(new com.ss.android.ugc.aweme.net.g(this.mHandler));
        return null;
    }
}
