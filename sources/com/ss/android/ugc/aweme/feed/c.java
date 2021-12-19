package com.ss.android.ugc.aweme.feed;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.u.a;
import com.ss.android.ugc.aweme.feed.u.c;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tcm.impl.service.TcmServiceImpl;
import f.a.t;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static String f92673a;

    /* renamed from: b  reason: collision with root package name */
    public static String f92674b = "";

    /* renamed from: c  reason: collision with root package name */
    private static a f92675c;

    /* renamed from: d  reason: collision with root package name */
    private static String f92676d;

    /* renamed from: e  reason: collision with root package name */
    private static Long f92677e = Long.valueOf(System.currentTimeMillis());

    /* renamed from: f  reason: collision with root package name */
    private static int f92678f = -1;

    /* renamed from: g  reason: collision with root package name */
    private static String f92679g = "";

    static {
        Covode.recordClassIndex(58777);
    }

    private static String a(Aweme aweme) {
        return RequestIdService.a().b(aweme, 0).optString("order");
    }

    public static void a(int i2, String str, int i3) {
        t.a(new d(i2, str, i3)).b(f.a.h.a.b(f.a.k.a.f158006c)).g();
    }

    public static void a(String str, int i2, String str2, int i3, Aweme aweme, String str3) {
        int i4;
        int i5;
        User author;
        int i6 = -1;
        if (aweme == null || (author = aweme.getAuthor()) == null) {
            i4 = -1;
            i5 = -1;
        } else {
            i5 = author.getFollowStatus();
            i4 = author.getFollowerStatus();
        }
        if (f92675c == null) {
            f92675c = new a();
        }
        c.a aVar = new c.a();
        aVar.f93987a = str2;
        aVar.f93989c = 1;
        aVar.f93995i = i5;
        aVar.f93996j = i4;
        aVar.f93991e = i3;
        if (!(aweme == null || !aweme.isForwardAweme() || aweme.getForwardItem() == null)) {
            aVar.f93997k = aweme.getForwardItem().getAid();
            aVar.f93998l = aweme.getForwardItem().getAuthorUid();
            aVar.f93999m = aweme.getForwardItem().getFollowStatus();
            aVar.s = aweme.getForwardItem().getAuthor().getFollowerStatus();
            aVar.t = false;
        }
        if (!TextUtils.isEmpty(f92676d) && !TextUtils.isEmpty(f92673a)) {
            aVar.a(f92676d);
            aVar.b(f92673a);
            if (!TextUtils.isEmpty(f92674b)) {
                aVar.c(f92674b);
            }
        }
        aVar.d(str);
        if (TcmServiceImpl.j().a(aweme, str)) {
            aVar.B = 1;
        } else {
            aVar.B = 0;
        }
        f92676d = str2;
        if (i2 == 0) {
            if (aweme != null && (aweme.getAwemeType() != 40 || !aweme.getAuthorUid().equalsIgnoreCase(f92679g))) {
                aVar.o = f92678f;
                aVar.n = aweme.getAwemePosition();
                f92678f = aweme.getAwemePosition();
                aVar.p = a(aweme);
                aVar.q = str3;
                aVar.r = f92677e.longValue();
                aVar.e(aweme.getItemDistributeSource());
                aVar.C = aweme.getItemSourceCategory();
                aVar.a(aweme.isAd());
                if (aweme.getAwemeType() == 40) {
                    f92679g = aweme.getAuthorUid();
                } else {
                    f92679g = "";
                }
            }
            i6 = 0;
        } else if (i2 == 1) {
            i6 = 1;
        } else if (i2 == 2 || i2 == 7) {
            i6 = 2;
        } else if (i2 == 22) {
            i6 = 10;
        } else if (i2 == 27) {
            i6 = 12;
        } else if (i2 == 5000) {
            i6 = 7;
        } else if (i2 != 8000) {
            if (i2 != 1000) {
                if (i2 != 1001) {
                    if (i2 != 2000) {
                        if (i2 != 2001) {
                            if (i2 == 3002) {
                                i6 = 5;
                            } else if (i2 == 3003) {
                                i6 = 9;
                            } else if (i2 == 4000) {
                                i6 = 6;
                            } else if (i2 == 4001) {
                                i6 = 8;
                            }
                        }
                    }
                }
                i6 = 4;
            }
            i6 = 3;
        } else {
            i6 = 20;
        }
        aVar.f93992f = i6;
        f92675c.sendRequest(aVar.a());
    }
}
