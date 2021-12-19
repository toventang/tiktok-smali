package com.ss.android.ugc.aweme.feed.model;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.api.j;
import com.ss.android.ugc.aweme.feed.helper.m;
import com.ss.android.ugc.aweme.follow.b.b;
import com.ss.android.ugc.d.a.c;
import f.a.d.f;
import h.f.b.l;
import h.m.p;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class FollowingFeedListModel$loadList$1<T> implements f {
    final /* synthetic */ int $cursor;
    final /* synthetic */ boolean $isBlueUser;
    final /* synthetic */ int $refreshType;
    final /* synthetic */ String $uid;
    final /* synthetic */ FollowingFeedListModel this$0;

    static {
        Covode.recordClassIndex(59386);
    }

    FollowingFeedListModel$loadList$1(FollowingFeedListModel followingFeedListModel, int i2, String str, boolean z, int i3) {
        this.this$0 = followingFeedListModel;
        this.$refreshType = i2;
        this.$uid = str;
        this.$isBlueUser = z;
        this.$cursor = i3;
    }

    public final void accept(j jVar) {
        boolean z = true;
        if (jVar.getCode() != 0) {
            Message obtainMessage = this.this$0.mHandler.obtainMessage(0);
            l.b(obtainMessage, "");
            obtainMessage.obj = new RuntimeException(jVar.getMsg());
            this.this$0.mHandler.sendMessage(obtainMessage);
            this.this$0.mIsNewDataEmpty = true;
            return;
        }
        int i2 = this.$refreshType;
        int i3 = -1;
        if (i2 == 1) {
            Iterator<String> it = this.this$0.uidList.iterator();
            int i4 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (p.a(it.next(), this.$uid, true)) {
                    i3 = i4;
                    break;
                } else {
                    i4++;
                }
            }
            this.this$0.hasMoreHeader = true;
            if (i3 == 0) {
                this.this$0.hasMoreHeader = false;
            } else {
                FollowingFeedListModel followingFeedListModel = this.this$0;
                followingFeedListModel.headerUid = followingFeedListModel.uidList.get(i3 - 1);
                this.this$0.headerNextCursor = 0;
            }
            this.this$0.hasMoreFooter = true;
            if (jVar.getHasMore()) {
                this.this$0.footerUid = this.$uid;
                this.this$0.footerNextCursor = jVar.getNextCursor();
            } else if (i3 == this.this$0.uidList.size() - 1) {
                this.this$0.hasMoreFooter = false;
            } else {
                FollowingFeedListModel followingFeedListModel2 = this.this$0;
                followingFeedListModel2.footerUid = followingFeedListModel2.uidList.get(i3 + 1);
                this.this$0.footerNextCursor = 0;
            }
            Map<String, String> map = m.f93407a;
            String str = this.$uid;
            String str2 = jVar.getAwemeList().get(0).aid;
            l.b(str2, "");
            map.put(str, str2);
            if (!jVar.getHasMore()) {
                Map<String, String> map2 = m.f93408b;
                String str3 = this.$uid;
                String str4 = jVar.getAwemeList().get(jVar.getAwemeList().size() - 1).aid;
                l.b(str4, "");
                map2.put(str3, str4);
            }
            if (this.$isBlueUser) {
                c.a(new b(this.$uid));
            }
        } else if (i2 == 3) {
            if (jVar.getHasMore()) {
                this.this$0.headerUid = this.$uid;
                this.this$0.headerNextCursor = jVar.getNextCursor();
            } else {
                Iterator<String> it2 = this.this$0.uidList.iterator();
                int i5 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (p.a(it2.next(), this.$uid, true)) {
                        i3 = i5;
                        if (i3 == 0) {
                            this.this$0.hasMoreHeader = false;
                        }
                    } else {
                        i5++;
                    }
                }
                FollowingFeedListModel followingFeedListModel3 = this.this$0;
                followingFeedListModel3.headerUid = followingFeedListModel3.uidList.get(i3 - 1);
                this.this$0.headerNextCursor = 0;
            }
            if (this.$cursor == 0) {
                Map<String, String> map3 = m.f93408b;
                String str5 = this.$uid;
                String str6 = jVar.getAwemeList().get(jVar.getAwemeList().size() - 1).aid;
                l.b(str6, "");
                map3.put(str5, str6);
            }
            if (!jVar.getHasMore()) {
                Map<String, String> map4 = m.f93407a;
                String str7 = this.$uid;
                String str8 = jVar.getAwemeList().get(0).aid;
                l.b(str8, "");
                map4.put(str7, str8);
            }
        } else {
            if (jVar.getHasMore()) {
                this.this$0.footerUid = this.$uid;
                this.this$0.footerNextCursor = jVar.getNextCursor();
            } else {
                Iterator<String> it3 = this.this$0.uidList.iterator();
                int i6 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    } else if (p.a(it3.next(), this.$uid, true)) {
                        i3 = i6;
                        break;
                    } else {
                        i6++;
                    }
                }
                if (i3 == this.this$0.uidList.size() - 1) {
                    this.this$0.hasMoreFooter = false;
                } else {
                    FollowingFeedListModel followingFeedListModel4 = this.this$0;
                    followingFeedListModel4.footerUid = followingFeedListModel4.uidList.get(i3 + 1);
                    this.this$0.footerNextCursor = 0;
                }
            }
            if (this.$cursor == 0) {
                Map<String, String> map5 = m.f93407a;
                String str9 = this.$uid;
                String str10 = jVar.getAwemeList().get(0).aid;
                l.b(str10, "");
                map5.put(str9, str10);
            }
            if (!jVar.getHasMore()) {
                Map<String, String> map6 = m.f93408b;
                String str11 = this.$uid;
                String str12 = jVar.getAwemeList().get(jVar.getAwemeList().size() - 1).aid;
                l.b(str12, "");
                map6.put(str11, str12);
            }
        }
        FollowingFeedListModel followingFeedListModel5 = this.this$0;
        List<Aweme> awemeList = jVar.getAwemeList();
        if (awemeList != null && !awemeList.isEmpty()) {
            z = false;
        }
        followingFeedListModel5.mIsNewDataEmpty = z;
        Message obtainMessage2 = this.this$0.mHandler.obtainMessage(0);
        l.b(obtainMessage2, "");
        obtainMessage2.obj = jVar;
        this.this$0.mHandler.sendMessage(obtainMessage2);
    }
}
