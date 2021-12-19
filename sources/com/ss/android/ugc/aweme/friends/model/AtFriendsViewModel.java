package com.ss.android.ugc.aweme.friends.model;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.bq.a.d;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import h.f.a.a;
import h.f.b.g;
import h.f.b.l;
import h.h;
import h.i;
import h.m.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class AtFriendsViewModel {
    public static final Companion Companion = new Companion(null);
    public boolean fiteSameUid;
    public String latestSearchKey = "";
    public List<IMUser> latestSearchUsers = new ArrayList();
    private final h searchUserService$delegate = i.a((a) AtFriendsViewModel$searchUserService$2.INSTANCE);

    static {
        Covode.recordClassIndex(61559);
    }

    public final ISearchUserService getSearchUserService() {
        return (ISearchUserService) this.searchUserService$delegate.getValue();
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(61560);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public static final class SearchResult {
            public final List<IMUser> allFriends;
            public final List<IMUser> followingFriends;

            static {
                Covode.recordClassIndex(61562);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel$Companion$SearchResult */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ SearchResult copy$default(SearchResult searchResult, List list, List list2, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    list = searchResult.followingFriends;
                }
                if ((i2 & 2) != 0) {
                    list2 = searchResult.allFriends;
                }
                return searchResult.copy(list, list2);
            }

            public final SearchResult copy(List<? extends IMUser> list, List<? extends IMUser> list2) {
                l.d(list, "");
                l.d(list2, "");
                return new SearchResult(list, list2);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SearchResult)) {
                    return false;
                }
                SearchResult searchResult = (SearchResult) obj;
                return l.a(this.followingFriends, searchResult.followingFriends) && l.a(this.allFriends, searchResult.allFriends);
            }

            public final int hashCode() {
                List<IMUser> list = this.followingFriends;
                int i2 = 0;
                int hashCode = (list != null ? list.hashCode() : 0) * 31;
                List<IMUser> list2 = this.allFriends;
                if (list2 != null) {
                    i2 = list2.hashCode();
                }
                return hashCode + i2;
            }

            public final String toString() {
                return "SearchResult(followingFriends=" + this.followingFriends + ", allFriends=" + this.allFriends + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
            /* JADX WARN: Multi-variable type inference failed */
            public SearchResult(List<? extends IMUser> list, List<? extends IMUser> list2) {
                l.d(list, "");
                l.d(list2, "");
                this.followingFriends = list;
                this.allFriends = list2;
            }
        }

        public static final class AllFriends {
            public final List<IMUser> allFollowingFriends;
            public final List<IMUser> filterFriends;
            public final List<Integer> indexLabelCount;
            public final List<String> indexLabels;
            public final List<String> mobRecentUsers;
            public final List<IMUser> mutualFriends;
            public final List<IMUser> recentFriends;

            static {
                Covode.recordClassIndex(61561);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel$Companion$AllFriends */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ AllFriends copy$default(AllFriends allFriends, List list, List list2, List list3, List list4, List list5, List list6, List list7, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    list = allFriends.recentFriends;
                }
                if ((i2 & 2) != 0) {
                    list2 = allFriends.mutualFriends;
                }
                if ((i2 & 4) != 0) {
                    list3 = allFriends.allFollowingFriends;
                }
                if ((i2 & 8) != 0) {
                    list4 = allFriends.indexLabels;
                }
                if ((i2 & 16) != 0) {
                    list5 = allFriends.indexLabelCount;
                }
                if ((i2 & 32) != 0) {
                    list6 = allFriends.filterFriends;
                }
                if ((i2 & 64) != 0) {
                    list7 = allFriends.mobRecentUsers;
                }
                return allFriends.copy(list, list2, list3, list4, list5, list6, list7);
            }

            public final AllFriends copy(List<? extends IMUser> list, List<? extends IMUser> list2, List<? extends IMUser> list3, List<String> list4, List<Integer> list5, List<? extends IMUser> list6, List<String> list7) {
                l.d(list, "");
                l.d(list2, "");
                l.d(list3, "");
                l.d(list4, "");
                l.d(list5, "");
                l.d(list6, "");
                l.d(list7, "");
                return new AllFriends(list, list2, list3, list4, list5, list6, list7);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AllFriends)) {
                    return false;
                }
                AllFriends allFriends = (AllFriends) obj;
                return l.a(this.recentFriends, allFriends.recentFriends) && l.a(this.mutualFriends, allFriends.mutualFriends) && l.a(this.allFollowingFriends, allFriends.allFollowingFriends) && l.a(this.indexLabels, allFriends.indexLabels) && l.a(this.indexLabelCount, allFriends.indexLabelCount) && l.a(this.filterFriends, allFriends.filterFriends) && l.a(this.mobRecentUsers, allFriends.mobRecentUsers);
            }

            public final int hashCode() {
                List<IMUser> list = this.recentFriends;
                int i2 = 0;
                int hashCode = (list != null ? list.hashCode() : 0) * 31;
                List<IMUser> list2 = this.mutualFriends;
                int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
                List<IMUser> list3 = this.allFollowingFriends;
                int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
                List<String> list4 = this.indexLabels;
                int hashCode4 = (hashCode3 + (list4 != null ? list4.hashCode() : 0)) * 31;
                List<Integer> list5 = this.indexLabelCount;
                int hashCode5 = (hashCode4 + (list5 != null ? list5.hashCode() : 0)) * 31;
                List<IMUser> list6 = this.filterFriends;
                int hashCode6 = (hashCode5 + (list6 != null ? list6.hashCode() : 0)) * 31;
                List<String> list7 = this.mobRecentUsers;
                if (list7 != null) {
                    i2 = list7.hashCode();
                }
                return hashCode6 + i2;
            }

            public final String toString() {
                return "AllFriends(recentFriends=" + this.recentFriends + ", mutualFriends=" + this.mutualFriends + ", allFollowingFriends=" + this.allFollowingFriends + ", indexLabels=" + this.indexLabels + ", indexLabelCount=" + this.indexLabelCount + ", filterFriends=" + this.filterFriends + ", mobRecentUsers=" + this.mobRecentUsers + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
            /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
            /* JADX WARN: Multi-variable type inference failed */
            public AllFriends(List<? extends IMUser> list, List<? extends IMUser> list2, List<? extends IMUser> list3, List<String> list4, List<Integer> list5, List<? extends IMUser> list6, List<String> list7) {
                l.d(list, "");
                l.d(list2, "");
                l.d(list3, "");
                l.d(list4, "");
                l.d(list5, "");
                l.d(list6, "");
                l.d(list7, "");
                this.recentFriends = list;
                this.mutualFriends = list2;
                this.allFollowingFriends = list3;
                this.indexLabels = list4;
                this.indexLabelCount = list5;
                this.filterFriends = list6;
                this.mobRecentUsers = list7;
            }
        }
    }

    public final b.i<Companion.AllFriends> loadAllFriends() {
        b.i<Companion.AllFriends> b2 = b.i.b(new AtFriendsViewModel$loadAllFriends$1(this), b.i.f4824a);
        l.b(b2, "");
        return b2;
    }

    public final void setLatestSearchKey(String str) {
        l.d(str, "");
        this.latestSearchKey = str;
    }

    public final void setLatestSearchUsers(List<IMUser> list) {
        l.d(list, "");
        this.latestSearchUsers = list;
    }

    public final List<String> getMentionBlockedUidsFromRecentContact(d dVar) {
        ArrayList arrayList = new ArrayList();
        for (T t : dVar.f68762b) {
            if (t.f68757b.get(0).f68758a == 6 && t.f68757b.get(0).f68759b == 1) {
                arrayList.add(t.f68756a);
            }
        }
        return arrayList;
    }

    public final boolean latestSearchUsersContain(String str) {
        l.d(str, "");
        Iterator<T> it = this.latestSearchUsers.iterator();
        while (it.hasNext()) {
            if (l.a((Object) it.next().getUid(), (Object) str)) {
                return true;
            }
        }
        return false;
    }

    public final List<IMUser> filterSameUser(List<? extends IMUser> list) {
        if (b.a((Collection) list)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (IMUser iMUser : list) {
            if (!arrayList.contains(iMUser)) {
                String uid = iMUser.getUid();
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                if (!l.a((Object) uid, (Object) g2.getCurUserId())) {
                    arrayList.add(iMUser);
                }
            }
        }
        return arrayList;
    }

    private final boolean containKeyWord(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase();
        l.b(lowerCase, "");
        if (p.e((CharSequence) lowerCase, (CharSequence) str2)) {
            return true;
        }
        return false;
    }

    public final b.i<List<IMUser>> searchKeyWord(String str, List<? extends IMUser> list) {
        l.d(str, "");
        l.d(list, "");
        this.latestSearchKey = str;
        b.i<List<IMUser>> b2 = b.i.b(new AtFriendsViewModel$searchKeyWord$1(this, list, str), b.i.f4824a).b(new AtFriendsViewModel$searchKeyWord$2(this), b.i.f4826c);
        l.b(b2, "");
        return b2;
    }

    public final List<IMUser> searchFollowIMUser(List<? extends IMUser> list, String str) {
        List<IMUser> searchFollowIMUser = IMService.createIIMServicebyMonsterPlugin(false).searchFollowIMUser(list, str);
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase();
        l.b(lowerCase, "");
        for (T t : list) {
            String uniqueId = t.getUniqueId();
            if (uniqueId == null || uniqueId.length() == 0) {
                String shortId = t.getShortId();
                l.b(shortId, "");
                if (containKeyWord(shortId, lowerCase)) {
                    t.setSearchType(1);
                    searchFollowIMUser.add(t);
                }
            } else {
                String uniqueId2 = t.getUniqueId();
                l.b(uniqueId2, "");
                if (containKeyWord(uniqueId2, lowerCase)) {
                    t.setSearchType(1);
                    searchFollowIMUser.add(t);
                }
            }
        }
        if (this.fiteSameUid) {
            List<IMUser> filterSameUser = filterSameUser(searchFollowIMUser);
            searchFollowIMUser.clear();
            searchFollowIMUser.addAll(filterSameUser);
        }
        return searchFollowIMUser;
    }
}
