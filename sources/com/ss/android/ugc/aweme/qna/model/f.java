package com.ss.android.ugc.aweme.qna.model;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.i18n.b;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.question.c;
import com.ss.android.ugc.aweme.utils.ib;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class f {

    /* renamed from: i  reason: collision with root package name */
    public static final a f119495i = new a((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    public final int f119496g;

    /* renamed from: h  reason: collision with root package name */
    public final String f119497h;

    static {
        Covode.recordClassIndex(77664);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(77665);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static String a(User user) {
            if (user == null) {
                return "";
            }
            String a2 = in.a(user, false);
            l.b(a2, "");
            return a2;
        }

        private static String b(User user) {
            UrlModel avatarThumb;
            List<String> urlList;
            if (user == null || (avatarThumb = user.getAvatarThumb()) == null || (urlList = avatarThumb.getUrlList()) == null || !(!urlList.isEmpty())) {
                return null;
            }
            return urlList.get(0);
        }

        private static String a(Integer num) {
            if (num == null) {
                return null;
            }
            int intValue = num.intValue();
            String a2 = b.a((long) intValue);
            return d.a().getResources().getQuantityString(R.plurals.h1, intValue, a2);
        }

        private static com.ss.android.ugc.aweme.qna.vm.d a(User user, Long l2) {
            String str;
            String str2 = null;
            if (user != null) {
                str = user.getUid();
                str2 = user.getSecUid();
            } else {
                str = null;
            }
            return new com.ss.android.ugc.aweme.qna.vm.d(str, str2, l2);
        }

        private static k a(String str, Aweme aweme) {
            Video video;
            UrlModel cover;
            List<String> urlList;
            if (aweme == null || (video = aweme.getVideo()) == null || (cover = video.getCover()) == null || (urlList = cover.getUrlList()) == null || !(!urlList.isEmpty())) {
                return null;
            }
            return new k(str, aweme.getAid(), urlList.get(0));
        }

        public static h a(c cVar, boolean z) {
            String string;
            List list;
            List<User> inviterList;
            Integer totalInviterCount;
            l.d(cVar, "");
            Context a2 = d.a();
            String a3 = a(cVar.getCreator());
            boolean z2 = false;
            if (z) {
                string = a2.getString(R.string.f4t);
            } else {
                string = a2.getString(R.string.f61, a3);
            }
            l.b(string, "");
            Long id = cVar.getId();
            ArrayList arrayList = null;
            String valueOf = id != null ? String.valueOf(id.longValue()) : null;
            com.ss.android.ugc.aweme.qna.vm.d a4 = a(cVar.getCreator(), cVar.getId());
            k a5 = a(String.valueOf(cVar.getId()), cVar.getVideo());
            String content = cVar.getContent();
            String a6 = a(cVar.getAnswerCount());
            if (z) {
                com.ss.android.ugc.aweme.question.d inviteInfo = cVar.getInviteInfo();
                if (!(inviteInfo == null || (totalInviterCount = inviteInfo.getTotalInviterCount()) == null)) {
                    int intValue = totalInviterCount.intValue();
                    List<User> inviterList2 = inviteInfo.getInviterList();
                    if (inviterList2 != null) {
                        int size = intValue - inviterList2.size();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i2 = 0; i2 < size; i2++) {
                            User user = new User();
                            user.setAvatarThumb(new UrlModel());
                            arrayList2.add(user);
                        }
                        list = n.d((Collection) inviterList2, (Iterable) arrayList2);
                    }
                }
                list = null;
            } else {
                User creator = cVar.getCreator();
                if (creator != null) {
                    list = n.a(creator);
                }
                list = null;
            }
            Integer collectStatus = cVar.getCollectStatus();
            if (collectStatus != null && collectStatus.intValue() == 1) {
                z2 = true;
            }
            Boolean valueOf2 = Boolean.valueOf(z2);
            com.ss.android.ugc.aweme.question.d inviteInfo2 = cVar.getInviteInfo();
            if (!(inviteInfo2 == null || (inviterList = inviteInfo2.getInviterList()) == null)) {
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it = inviterList.iterator();
                while (it.hasNext()) {
                    String uid = it.next().getUid();
                    if (uid != null) {
                        arrayList3.add(uid);
                    }
                }
                arrayList = arrayList3;
            }
            return new h(2, valueOf, a4, a5, string, content, a6, list, null, valueOf2, z, arrayList, 2048);
        }

        private static List<k> a(String str, List<? extends Aweme> list) {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    k a2 = a(str, (Aweme) it.next());
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
            }
            return arrayList;
        }

        public static f a(com.ss.android.ugc.aweme.qna.api.a aVar, String str, boolean z) {
            String str2;
            String str3;
            String str4;
            boolean z2;
            l.d(aVar, "");
            User user = aVar.f119222c;
            if (user != null) {
                str2 = user.getUid();
            } else {
                str2 = null;
            }
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            boolean equals = TextUtils.equals(str2, g2.getCurUserId());
            String valueOf = String.valueOf(aVar.f119220a);
            com.ss.android.ugc.aweme.qna.vm.d a2 = a(aVar.f119222c, (Long) null);
            String a3 = a(aVar.f119222c);
            if (str == null) {
                str3 = aVar.f119221b;
            } else {
                str3 = str;
            }
            String b2 = b(aVar.f119222c);
            String b3 = b(aVar.f119223d);
            String a4 = a(aVar.f119223d);
            List<Aweme> list = aVar.f119224e;
            if (list == null || !(!list.isEmpty())) {
                str4 = null;
            } else {
                str4 = " · " + ib.a(d.a(), list.get(0).getCreateTime() * 1000);
            }
            e eVar = new e(b3, a4, str4, a(aVar.f119223d, (Long) null), a(String.valueOf(aVar.f119220a), aVar.f119224e));
            if (str != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new c(valueOf, a2, a3, str3, b2, eVar, new j(z2, z, !equals));
        }

        public static g a(c cVar, String str, boolean z) {
            String str2;
            String str3;
            String str4;
            boolean z2;
            l.d(cVar, "");
            User creator = cVar.getCreator();
            String str5 = null;
            if (creator != null) {
                str2 = creator.getUid();
            } else {
                str2 = null;
            }
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            boolean equals = TextUtils.equals(str2, g2.getCurUserId());
            Long id = cVar.getId();
            if (id != null) {
                str3 = String.valueOf(id.longValue());
            } else {
                str3 = null;
            }
            com.ss.android.ugc.aweme.qna.vm.d a2 = a(cVar.getCreator(), (Long) null);
            k a3 = a(String.valueOf(cVar.getId()), cVar.getVideo());
            String a4 = a(cVar.getCreator());
            if (str == null) {
                str4 = cVar.getContent();
            } else {
                str4 = str;
            }
            String a5 = a(cVar.getAnswerCount());
            String b2 = b(cVar.getCreator());
            if (str != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            j jVar = new j(z2, z, !equals);
            String questionType = cVar.getQuestionType();
            Long createTime = cVar.getCreateTime();
            if (createTime != null) {
                str5 = " · " + ib.a(d.a(), createTime.longValue() * 1000);
            }
            return new g(str3, a2, a3, a4, str4, a5, b2, jVar, questionType, str5);
        }
    }

    public f(int i2, String str) {
        this.f119496g = i2;
        this.f119497h = str;
    }
}
