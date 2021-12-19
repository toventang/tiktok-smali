package com.ss.android.ugc.aweme.commercialize.profile.talent;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.commercialize.profile.talent.a.d;

public interface ProfileAdTalentShareApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f75246a = a.f75248b;

    static {
        Covode.recordClassIndex(46433);
    }

    @h(a = "/aweme/v1/commerce/profile/ad/")
    q<d> getTalentProfileAd(@z(a = "sec_uid") String str, @z(a = "item_ids") String str2, @z(a = "index") int i2, @z(a = "source") int i3, @z(a = "last_ad_show_gap") Integer num);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final String f75247a = ("https://" + com.bytedance.ies.ugc.appcontext.d.f34604k.f34586a);

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f75248b = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(46434);
        }
    }
}
