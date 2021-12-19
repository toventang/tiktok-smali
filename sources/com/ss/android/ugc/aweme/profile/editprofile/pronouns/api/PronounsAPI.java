package com.ss.android.ugc.aweme.profile.editprofile.pronouns.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.editprofile.pronouns.a.c;
import f.a.t;
import l.b.e;
import l.b.o;

public interface PronounsAPI {

    /* renamed from: a  reason: collision with root package name */
    public static final a f116172a = a.f116173a;

    static {
        Covode.recordClassIndex(74939);
    }

    @o(a = "/tiktok/user/profile/pronoun/update/v1")
    @e
    t<c> updatePronouns(@l.b.c(a = "pronouns") String str);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f116173a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(74940);
        }
    }
}
