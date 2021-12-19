package com.ss.android.ugc.aweme.tools.music.f;

import com.bytedance.covode.number.Covode;
import com.google.c.a.f;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class a implements f<Challenge, AVChallenge> {

    /* renamed from: a  reason: collision with root package name */
    public static final C3715a f140591a = new C3715a((byte) 0);

    static {
        Covode.recordClassIndex(91820);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.f.a$a  reason: collision with other inner class name */
    public static final class C3715a {
        static {
            Covode.recordClassIndex(91821);
        }

        private C3715a() {
        }

        public /* synthetic */ C3715a(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.c.a.f
    public final /* bridge */ /* synthetic */ AVChallenge a(Challenge challenge) {
        return a(challenge);
    }

    public static AVChallenge a(Challenge challenge) {
        AVChallenge aVChallenge = new AVChallenge();
        if (challenge == null) {
            l.b();
        }
        aVChallenge.cid = challenge.getCid();
        aVChallenge.challengeName = challenge.getChallengeName();
        aVChallenge.stickerId = challenge.getStickerId();
        aVChallenge.type = challenge.getType();
        aVChallenge.viewCount = challenge.getViewCount();
        aVChallenge.userCount = challenge.getUserCount();
        aVChallenge.isCommerce = challenge.isCommerce();
        aVChallenge.musicId = b(challenge);
        aVChallenge.mvId = challenge.getMvId();
        aVChallenge.mStatus = false;
        return aVChallenge;
    }

    private static String b(Challenge challenge) {
        Music music;
        Music music2;
        List<Music> connectMusics;
        Music music3;
        Music music4;
        List<Music> connectMusics2;
        Music music5;
        if (challenge != null) {
            if (challenge.isCommerce()) {
                ICommerceMediaService f2 = CommerceMediaServiceImpl.f();
                List<Music> connectMusics3 = challenge.getConnectMusics();
                if (connectMusics3 != null) {
                    music4 = (Music) n.h((List) connectMusics3);
                } else {
                    music4 = null;
                }
                if (f2.a(music4) || (connectMusics2 = challenge.getConnectMusics()) == null || (music5 = (Music) n.h((List) connectMusics2)) == null) {
                    return null;
                }
                return music5.getMid();
            } else if (challenge.isStrongMusic()) {
                if (CommerceMediaServiceImpl.f().a()) {
                    ICommerceMediaService f3 = CommerceMediaServiceImpl.f();
                    List<Music> connectMusics4 = challenge.getConnectMusics();
                    if (connectMusics4 != null) {
                        music2 = (Music) n.h((List) connectMusics4);
                    } else {
                        music2 = null;
                    }
                    if (f3.a(music2) || (connectMusics = challenge.getConnectMusics()) == null || (music3 = (Music) n.h((List) connectMusics)) == null) {
                        return null;
                    }
                    return music3.getMid();
                }
                List<Music> connectMusics5 = challenge.getConnectMusics();
                if (!(connectMusics5 == null || (music = (Music) n.h((List) connectMusics5)) == null)) {
                    return music.getMid();
                }
            }
        }
        return null;
    }
}
