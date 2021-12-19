package com.ss.android.ugc.aweme.social.ext;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.n;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.model.LocalContact;
import com.ss.android.ugc.aweme.friends.service.IContactService;
import com.ss.android.ugc.aweme.profile.model.ExternalRecommendReasonStruct;
import h.a.ag;
import h.p;
import h.v;

public final class b {
    static {
        Covode.recordClassIndex(87455);
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f133682a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f133683b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f133684c;

        static {
            Covode.recordClassIndex(87456);
        }

        a(n nVar, String str, String str2) {
            this.f133682a = nVar;
            this.f133683b = str;
            this.f133684c = str2;
        }

        public final void run() {
            if (this.f133683b != null && com.ss.android.ugc.aweme.friends.service.a.f97047a.d().c()) {
                r.a("rec_user_video_pref", ag.a(v.a("cache_ready", com.ss.android.ugc.aweme.social.widget.card.c.a.a(this.f133682a.a())), v.a("group_id", this.f133683b)));
            }
        }
    }

    static final p<String, String> a(ExternalRecommendReasonStruct externalRecommendReasonStruct, String str) {
        String formatReason;
        LocalContact a2;
        String str2;
        p<String, String> a3;
        if (externalRecommendReasonStruct == null || !externalRecommendReasonStruct.isValid() || (formatReason = externalRecommendReasonStruct.getFormatReason()) == null) {
            return null;
        }
        if (!h.m.p.a((CharSequence) formatReason, (CharSequence) "%s", false)) {
            return v.a(formatReason, "");
        }
        String hashedPhoneNumber = externalRecommendReasonStruct.getHashedPhoneNumber();
        if (!(hashedPhoneNumber == null || hashedPhoneNumber.length() == 0)) {
            n a4 = ((IContactService) ServiceManager.get().getService(IContactService.class)).a();
            r.a().execute(new a(a4, str, formatReason));
            if (!(!a4.a() || (a2 = a4.a(hashedPhoneNumber)) == null || (str2 = a2.contactName) == null || str2.length() == 0 || (a3 = v.a(formatReason, str2)) == null)) {
                return a3;
            }
        }
        String externalUsername = externalRecommendReasonStruct.getExternalUsername();
        if (externalUsername == null || externalUsername.length() == 0) {
            return null;
        }
        return v.a(formatReason, externalUsername);
    }
}
