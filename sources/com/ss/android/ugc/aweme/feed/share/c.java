package com.ss.android.ugc.aweme.feed.share;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInterestLevel;
import com.ss.android.ugc.aweme.feed.x.m;
import com.ss.android.ugc.aweme.share.improve.a.an;
import com.ss.android.ugc.aweme.share.improve.a.g;
import com.ss.android.ugc.aweme.share.improve.a.i;
import com.ss.android.ugc.aweme.share.improve.a.j;
import com.ss.android.ugc.aweme.share.improve.a.k;
import com.ss.android.ugc.aweme.sharer.ui.e;
import com.ss.android.ugc.aweme.utils.in;
import h.f.b.l;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Aweme f93889a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f93890b;

    /* renamed from: c  reason: collision with root package name */
    private final Activity f93891c;

    /* renamed from: d  reason: collision with root package name */
    private final e.b f93892d;

    /* renamed from: e  reason: collision with root package name */
    private final s<ag> f93893e;

    /* renamed from: f  reason: collision with root package name */
    private final String f93894f;

    /* renamed from: g  reason: collision with root package name */
    private final int f93895g;

    /* renamed from: h  reason: collision with root package name */
    private final String f93896h;

    /* renamed from: i  reason: collision with root package name */
    private final String f93897i;

    /* renamed from: j  reason: collision with root package name */
    private final String f93898j;

    /* renamed from: k  reason: collision with root package name */
    private final String f93899k;

    static {
        Covode.recordClassIndex(59736);
    }

    private final void b() {
        if (!m.a(this.f93889a) && !this.f93890b) {
            this.f93892d.a(new an(this.f93889a, this.f93893e, this.f93894f));
        }
    }

    private final void c() {
        this.f93892d.a(new g(this.f93891c, this.f93889a, this.f93894f, this.f93897i, this.f93898j, this.f93899k));
    }

    private final void d() {
        if (m.a(this.f93889a)) {
            this.f93892d.a(new i(this.f93894f, this.f93893e));
        }
    }

    private final boolean f() {
        boolean z = false;
        try {
            z = new JSONObject(this.f93889a.getUploadMiscInfoStruct().mvInfo.getExtra()).optBoolean("is_commerce_music", false);
            return z;
        } catch (Exception e2) {
            e2.printStackTrace();
            return z;
        }
    }

    private final void e() {
        ACLCommonShare downloadGeneral;
        if (!in.d()) {
            AwemeACLShare awemeACLShareInfo = this.f93889a.getAwemeACLShareInfo();
            if (awemeACLShareInfo == null || (downloadGeneral = awemeACLShareInfo.getDownloadGeneral()) == null || downloadGeneral.getShowType() != 0) {
                this.f93892d.a(new k(this.f93891c, this.f93889a, this.f93894f, "click_download_icon", this.f93896h));
            }
        }
    }

    private final void g() {
        if (this.f93890b || b.U(this.f93889a)) {
            return;
        }
        if ((l.a((Object) this.f93894f, (Object) "homepage_hot") || b(this.f93889a)) && !m.a(this.f93889a)) {
            this.f93892d.a(new j(this.f93889a, this.f93894f));
        }
    }

    private final void h() {
        SharePrefCache inst = SharePrefCache.inst();
        l.b(inst, "");
        aj<Boolean> isPrivateAvailable = inst.getIsPrivateAvailable();
        l.b(isPrivateAvailable, "");
        Boolean c2 = isPrivateAvailable.c();
        l.b(c2, "");
        if (c2.booleanValue() && m.a(this.f93889a)) {
            this.f93892d.a(new com.ss.android.ugc.aweme.share.improve.a.ag(this.f93889a, this.f93894f));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0338, code lost:
        if (com.ss.android.ugc.aweme.feed.x.m.a(r13.f93889a) == false) goto L_0x0357;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0347, code lost:
        if (r1 != 4) goto L_0x0349;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x020e, code lost:
        if (r0.getHasAnalyticsMetrics() != false) goto L_0x0210;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
        // Method dump skipped, instructions count: 1464
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.share.c.a():void");
    }

    private static String a(Aweme aweme) {
        InteractionTagInfo interactionTagInfo = aweme.getInteractionTagInfo();
        if (interactionTagInfo != null) {
            int interestLevel = interactionTagInfo.getInterestLevel();
            if (interestLevel == InteractionTagInterestLevel.LOW.getLevel()) {
                return "low_interest";
            }
            if (interestLevel == InteractionTagInterestLevel.HIGH.getLevel()) {
                return "high_interest";
            }
        }
        return "";
    }

    private static boolean b(Aweme aweme) {
        if (aweme.getAwemeRawAd() == null || !TalentAdRevenueShareServiceImpl.e().c()) {
            return false;
        }
        return true;
    }

    public /* synthetic */ c(Aweme aweme, boolean z, Activity activity, e.b bVar, s sVar, String str, int i2, String str2) {
        this(aweme, z, activity, bVar, sVar, str, i2, str2, "", "", "");
    }

    public c(Aweme aweme, boolean z, Activity activity, e.b bVar, s<ag> sVar, String str, int i2, String str2, String str3, String str4, String str5) {
        l.d(aweme, "");
        l.d(activity, "");
        l.d(bVar, "");
        l.d(sVar, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        this.f93889a = aweme;
        this.f93890b = z;
        this.f93891c = activity;
        this.f93892d = bVar;
        this.f93893e = sVar;
        this.f93894f = str;
        this.f93895g = i2;
        this.f93896h = str2;
        this.f93897i = str3;
        this.f93898j = str4;
        this.f93899k = str5;
    }
}
