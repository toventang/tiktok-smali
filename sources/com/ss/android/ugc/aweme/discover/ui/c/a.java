package com.ss.android.ugc.aweme.discover.ui.c;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.d.g;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.google.gson.p;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.autoplay.b.h;
import com.ss.android.ugc.aweme.bo;
import com.ss.android.ugc.aweme.discover.ui.c.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.c;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.k.r;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f82491a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final f f82492b = new f();

    private a() {
    }

    static {
        Covode.recordClassIndex(51363);
    }

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    private static String b(List<? extends RoomInfo> list) {
        try {
            String b2 = f82492b.b(list);
            l.b(b2, "");
            return b2;
        } catch (p unused) {
            return "";
        }
    }

    public static String a(List<? extends Aweme> list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        for (T t : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            T t2 = t;
            if (i2 > 0) {
                sb.append(",");
            }
            sb.append(t2.getAid());
            i2 = i3;
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }

    private static String c(List<? extends RoomInfo> list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        for (T t : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            T t2 = t;
            if (i2 > 0) {
                sb.append(",");
            }
            sb.append(t2.getRoomId());
            i2 = i3;
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.c.a$a  reason: collision with other inner class name */
    public static final class C1936a implements IAccountService.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f82493a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f82494b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ EnterRoomConfig f82495c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f82496d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List f82497e;

        static {
            Covode.recordClassIndex(51364);
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            if (i2 == 1 && i3 == 1) {
                Context applicationContext = this.f82493a.getApplicationContext();
                if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
                a.a(applicationContext, this.f82494b, this.f82495c, "from_search_live", this.f82496d, this.f82497e);
            }
        }

        C1936a(Context context, long j2, EnterRoomConfig enterRoomConfig, ArrayList arrayList, List list) {
            this.f82493a = context;
            this.f82494b = j2;
            this.f82495c = enterRoomConfig;
            this.f82496d = arrayList;
            this.f82497e = list;
        }
    }

    public static void a(Aweme aweme, h hVar, EnterRoomConfig enterRoomConfig, b.AbstractC1937b bVar) {
        r rVar;
        EnterRoomConfig.RoomsData roomsData;
        String str;
        Long l2;
        Aweme aweme2;
        if (hVar != null && (rVar = hVar.f67311b) != null) {
            String str2 = rVar.f121271f;
            if (str2.length() > 0) {
                Aweme aweme3 = null;
                if (1 != 0 && str2 != null && enterRoomConfig != null && (roomsData = enterRoomConfig.f23299c) != null && (str = roomsData.J) != null && str.length() > 0 && (l2 = hVar.f67315f) != null) {
                    l2.longValue();
                    Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
                    List<Aweme> list = hVar.f67312c;
                    if (list != null) {
                        aweme2 = list.get(0);
                    } else {
                        aweme2 = null;
                    }
                    List<Aweme> list2 = hVar.f67312c;
                    if (list2 != null) {
                        aweme3 = list2.get(hVar.f67312c.size() - 1);
                    }
                    if (aweme != null) {
                        aweme.getAid();
                        User author = aweme.getAuthor();
                        if (author != null) {
                            author.getUniqueId();
                        }
                    }
                    if (aweme2 != null) {
                        aweme2.getAid();
                        User author2 = aweme2.getAuthor();
                        if (author2 != null) {
                            author2.getUniqueId();
                        }
                    }
                    if (aweme3 != null) {
                        aweme3.getAid();
                        User author3 = aweme3.getAuthor();
                        if (author3 != null) {
                            author3.getUniqueId();
                        }
                    }
                    b bVar2 = new b(rVar.f121271f, hVar.f67315f.longValue(), c(hVar.f67314e), rVar.f121272g, rVar.f121274i, bVar);
                    ILiveOuterService s = LiveOuterService.s();
                    l.b(s, "");
                    s.i().a(j2, enterRoomConfig, aweme, hVar.f67312c, bVar2);
                }
            }
        }
    }

    public static void a(Context context, long j2, EnterRoomConfig enterRoomConfig, String str, ArrayList<Long> arrayList, List<? extends RoomInfo> list) {
        Context context2;
        ILiveOuterService s = LiveOuterService.s();
        l.b(s, "");
        com.ss.android.ugc.aweme.r.a i2 = s.i();
        String str2 = null;
        if (context != null) {
            context2 = a(context);
        } else {
            context2 = null;
        }
        if (list != null) {
            str2 = b(list);
        }
        i2.a(context2, j2, enterRoomConfig, str, arrayList, str2);
    }

    public static void a(Context context, long j2, ArrayList<Long> arrayList, List<? extends RoomInfo> list, EnterRoomConfig enterRoomConfig, String str) {
        l.d(context, "");
        l.d(enterRoomConfig, "");
        l.d(str, "");
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (!g2.isLogin() && com.bytedance.ies.ugc.appcontext.f.j() != null) {
            bo b2 = com.ss.android.ugc.aweme.account.b.b();
            IAccountService.d dVar = new IAccountService.d();
            Activity j3 = com.bytedance.ies.ugc.appcontext.f.j();
            if (j3 == null) {
                l.b();
            }
            dVar.f62401a = j3;
            dVar.f62405e = new C1936a(context, j2, enterRoomConfig, arrayList, list);
            b2.showLoginAndRegisterView(dVar.a());
        }
        a(context, j2, enterRoomConfig, str, arrayList, list);
    }

    public final void a(Aweme aweme, h hVar, b.AbstractC1937b bVar, EnterRoomConfig enterRoomConfig, String str, Context context) {
        long j2;
        r rVar;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        ArrayList<Long> arrayList;
        g a2;
        String str9;
        String str10;
        l.d(aweme, "");
        l.d(enterRoomConfig, "");
        l.d(context, "");
        User author = aweme.getAuthor();
        if (author != null) {
            j2 = author.roomId;
        } else {
            j2 = 0;
        }
        List<RoomInfo> list = null;
        if (hVar != null) {
            rVar = hVar.f67311b;
        } else {
            rVar = null;
        }
        EnterRoomConfig.LogData logData = enterRoomConfig.f23298b;
        if (rVar != null) {
            str2 = rVar.f121274i;
        } else {
            str2 = null;
        }
        logData.x = str2;
        EnterRoomConfig.LogData logData2 = enterRoomConfig.f23298b;
        if (rVar != null) {
            str3 = rVar.f121271f;
        } else {
            str3 = null;
        }
        logData2.y = str3;
        EnterRoomConfig.LogData logData3 = enterRoomConfig.f23298b;
        if (rVar != null) {
            str4 = rVar.f121269d;
        } else {
            str4 = null;
        }
        logData3.A = str4;
        EnterRoomConfig.LogData logData4 = enterRoomConfig.f23298b;
        if (rVar != null) {
            str5 = rVar.n;
        } else {
            str5 = null;
        }
        logData4.z = str5;
        EnterRoomConfig.LogData logData5 = enterRoomConfig.f23298b;
        if (rVar != null) {
            str6 = rVar.f121274i;
        } else {
            str6 = null;
        }
        logData5.f23309a = str6;
        EnterRoomConfig.LogData logData6 = enterRoomConfig.f23298b;
        if (author != null) {
            str7 = author.getUid();
        } else {
            str7 = null;
        }
        logData6.f23310b = str7;
        enterRoomConfig.f23298b.B = String.valueOf(j2);
        enterRoomConfig.f23299c.L = "live_cell";
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.f23299c;
        if (rVar != null) {
            str8 = rVar.f121272g;
        } else {
            str8 = null;
        }
        roomsData.J = str8;
        LiveRoomStruct newLiveRoomData = aweme.getNewLiveRoomData();
        if (newLiveRoomData == null) {
            RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
            l.b(roomFeedCellStruct, "");
            newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData();
        }
        ILiveOuterService s = LiveOuterService.s();
        l.b(s, "");
        c d2 = s.d();
        Object a3 = d2.a("enable_search_live_card_reuse_player", (Object) false);
        l.b(a3, "");
        if (((Boolean) a3).booleanValue() && (a2 = d2.a(str)) != null && !TextUtils.isEmpty(a2.n())) {
            String n = a2.n();
            if (newLiveRoomData != null) {
                str9 = newLiveRoomData.getMultiStreamData();
            } else {
                str9 = null;
            }
            if (l.a((Object) n, (Object) str9) && a2.l()) {
                enterRoomConfig.f23299c.ar = a2.l();
                a2.h(false);
                EnterRoomConfig.StreamData streamData = enterRoomConfig.f23297a;
                if (newLiveRoomData != null) {
                    str10 = newLiveRoomData.getMultiStreamData();
                } else {
                    str10 = null;
                }
                streamData.f23341e = str10;
                enterRoomConfig.f23299c.E = str;
            }
        }
        if (com.ss.android.ugc.aweme.discover.a.n.a()) {
            a(aweme, hVar, enterRoomConfig, bVar);
            return;
        }
        if (hVar != null) {
            arrayList = hVar.f67313d;
            list = hVar.f67314e;
        } else {
            arrayList = null;
        }
        a(context, j2, arrayList, list, enterRoomConfig, "general_search");
    }
}
