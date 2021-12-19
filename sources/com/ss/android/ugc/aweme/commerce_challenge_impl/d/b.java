package com.ss.android.ugc.aweme.commerce_challenge_impl.d;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.commerce_sticker_impl.service.CommerceStickerServiceImpl;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.sticker.model.g;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f73553a = new b();

    public static final class a extends com.google.gson.b.a<g> {
        static {
            Covode.recordClassIndex(45269);
        }

        a() {
        }
    }

    private b() {
    }

    static {
        Covode.recordClassIndex(45268);
    }

    public static final boolean a(Challenge challenge) {
        if (challenge == null) {
            return false;
        }
        try {
            g gVar = (g) new f().a(challenge.getChallengeStickerDetail(), new a().type);
            if (gVar == null) {
                return false;
            }
            return CommerceStickerServiceImpl.c().b().a(gVar);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
