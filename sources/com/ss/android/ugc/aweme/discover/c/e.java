package com.ss.android.ugc.aweme.discover.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.discover.helper.ab;
import com.ss.android.ugc.aweme.discover.helper.j;
import com.ss.android.ugc.aweme.discover.helper.w;
import com.ss.android.ugc.aweme.discover.mixfeed.d.c;
import com.ss.android.ugc.aweme.discover.mixfeed.g;
import com.ss.android.ugc.aweme.discover.mixfeed.h;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.a.am;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    static final IAwemeService f80918a = AwemeService.b();

    /* renamed from: b  reason: collision with root package name */
    public static final e f80919b = new e();

    /* renamed from: c  reason: collision with root package name */
    private static final IRequestIdService f80920c = RequestIdService.a();

    /* renamed from: d  reason: collision with root package name */
    private static j f80921d;

    private e() {
    }

    static {
        Covode.recordClassIndex(50301);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f80922a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f80923b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f80924c;

        static {
            Covode.recordClassIndex(50302);
        }

        a(e eVar, z.e eVar2, z.e eVar3) {
            this.f80922a = eVar;
            this.f80923b = eVar2;
            this.f80924c = eVar3;
        }

        public final void run() {
            for (Aweme aweme : this.f80923b.element) {
                e.f80918a.a(aweme);
            }
            for (Aweme aweme2 : this.f80924c.element) {
                e.f80918a.a(aweme2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<Integer, Integer> {
        final /* synthetic */ Music $music$inlined;

        static {
            Covode.recordClassIndex(50303);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Music music) {
            super(1);
            this.$music$inlined = music;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Integer invoke(Integer num) {
            this.$music$inlined.getExtraParamFromPretreatment().put("rank", Integer.valueOf(num.intValue()));
            return 1;
        }
    }

    private static void a(h hVar) {
        g gVar = hVar.f81785g;
        if (gVar != null && gVar.f81775c == 2) {
            if (f80921d == null) {
                f80921d = new ab();
            }
            j jVar = f80921d;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    public static List<h> a(List<? extends h> list) {
        l.d(list, "");
        int i2 = 0;
        Set a2 = am.a((Object[]) new Integer[]{65465, 1048336});
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            T t2 = t;
            if (!a2.contains(Integer.valueOf(t2.getFeedType())) || (t2.getFeedType() == 1048336 && ((c.a() == 1 || c.a() == 2) && com.ss.android.ugc.aweme.discover.mixfeed.d.e.a(t2)))) {
                arrayList.add(t);
            }
        }
        List<h> g2 = n.g((Collection) arrayList);
        ArrayList<Number> arrayList2 = new ArrayList();
        boolean z = false;
        int i3 = 0;
        for (T t3 : g2) {
            if (!z && t3.a() && !(com.bytedance.ies.abmock.b.a().a(true, "video_title_optimization", 0) == 1 && i3 == 0)) {
                com.bytedance.x.c.a.a(arrayList2, Integer.valueOf(i3));
            }
            t3.p = i3;
            if (t3.a() || t3.getFeedType() == 1048336) {
                z = true;
            } else {
                z = false;
            }
            i3++;
        }
        for (Number number : arrayList2) {
            int intValue = number.intValue();
            h hVar = new h();
            hVar.setFeedType(65465);
            hVar.f81779a = d.a().getString(R.string.fhm);
            g2.add(intValue + i2, hVar);
            i2++;
        }
        return g2;
    }

    public final void a(com.ss.android.ugc.aweme.discover.mixfeed.m mVar) {
        int i2;
        l.d(mVar, "");
        List<h> list = mVar.f81826c;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        z.e eVar = new z.e();
        eVar.element = (T) new ArrayList();
        z.e eVar2 = new z.e();
        eVar2.element = (T) new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            h hVar = mVar.f81826c.get(i3);
            if (hVar == null) {
                l.b();
            }
            hVar.q = mVar.logPb;
            com.ss.android.ugc.aweme.discover.mixfeed.a.c.f81634b.a(hVar);
            if (hVar.getFeedType() == 65280) {
                eVar2.element.addAll(a(hVar, mVar, i3));
            }
            if (hVar.getFeedType() == 65458) {
                for (SearchUser searchUser : hVar.f81780b) {
                    l.b(searchUser, "");
                    if (searchUser.user != null) {
                        User user = searchUser.user;
                        l.b(user, "");
                        user.setRequestId(mVar.getRequestId());
                        searchUser.mGlobalDoodleConfig = mVar.globalDoodleConfig;
                        List<Aweme> a2 = a(searchUser, mVar.getRequestId());
                        if (a2 != null) {
                            eVar.element.addAll(a2);
                        }
                    }
                }
            }
            if (hVar.getFeedType() == 65456) {
                w.a(hVar.f81782d);
                for (SearchChallenge searchChallenge : hVar.f81782d) {
                    if (searchChallenge != null) {
                        searchChallenge.setRequestId(mVar.getRequestId());
                        if (searchChallenge.getChallenge() != null) {
                            Challenge challenge = searchChallenge.getChallenge();
                            l.b(challenge, "");
                            challenge.setRequestId(mVar.getRequestId());
                        }
                    }
                }
            }
            if (hVar.getFeedType() == 65457) {
                a(hVar);
                for (Music music : hVar.f81781c) {
                    if (music != null) {
                        a(hVar, music);
                    }
                }
            }
            if (hVar.getFeedType() == 70) {
                List<Aweme> list2 = hVar.n.f81854a;
                if (list2 == null) {
                    list2 = h.a.z.INSTANCE;
                }
                for (Aweme aweme : list2) {
                    aweme.setRequestId(mVar.getRequestId());
                }
            }
        }
        com.ss.android.ugc.aweme.cw.g.e().submit(new a(this, eVar, eVar2));
    }

    private static List<Aweme> a(SearchUser searchUser, String str) {
        if (searchUser == null || com.bytedance.common.utility.collection.b.a((Collection) searchUser.awemeCards)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        List<Aweme> list = searchUser.awemeCards;
        l.b(list, "");
        for (T t : list) {
            if (t != null) {
                t.setRequestId(str);
                f80920c.a(t.getAid() + 9, str, i2);
                arrayList.add(t);
            }
            i2++;
        }
        searchUser.awemeCards = arrayList;
        return arrayList;
    }

    private static void a(h hVar, Music music) {
        int i2;
        music.setRequestId(hVar.getRequestId());
        g gVar = hVar.f81785g;
        music.getExtraParamFromPretreatment().put(g.class, hVar.f81785g);
        if (gVar != null) {
            i2 = gVar.f81775c;
        } else {
            i2 = 0;
        }
        music.setSoundsListType(i2);
        j jVar = f80921d;
        if (jVar != null) {
            jVar.a(new b(music));
        }
    }

    public static int a(boolean z, List<? extends Aweme> list, int i2) {
        if (z) {
            i2 = 0;
        }
        if (list != null) {
            for (T t : list) {
                t.setRank(i2);
                t.getAid();
                i2++;
            }
        }
        return i2;
    }

    private static List<Aweme> a(h hVar, com.ss.android.ugc.aweme.discover.mixfeed.m mVar, int i2) {
        Aweme forwardItem;
        Aweme aweme = hVar.getAweme();
        ArrayList arrayList = new ArrayList();
        if (com.ss.android.ugc.aweme.follow.d.a.a(aweme)) {
            l.b(aweme, "");
            arrayList.add(aweme);
            IRequestIdService iRequestIdService = f80920c;
            iRequestIdService.a(aweme.getAid() + 9, mVar.getRequestId(), i2);
            hVar.setAweme(aweme);
            mVar.f81826c.set(i2, hVar);
            aweme.setRequestId(mVar.getRequestId());
            if (aweme.getAwemeType() == 13 && (forwardItem = aweme.getForwardItem()) != null) {
                forwardItem.setRepostFromGroupId(aweme.getAid());
                forwardItem.setRepostFromUserId(aweme.getAuthorUid());
                arrayList.add(forwardItem);
                iRequestIdService.a(forwardItem.getAid() + 1, mVar.getRequestId(), i2);
                forwardItem.setRequestId(mVar.getRequestId());
            }
        }
        return arrayList;
    }
}
