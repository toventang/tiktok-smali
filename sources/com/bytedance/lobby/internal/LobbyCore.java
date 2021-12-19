package com.bytedance.lobby.internal;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lobby.a;
import com.bytedance.lobby.b;
import com.bytedance.lobby.d;
import com.bytedance.lobby.facebook.FacebookAuth;
import com.bytedance.lobby.facebook.FacebookShare;
import com.bytedance.lobby.google.GoogleAuth;
import com.bytedance.lobby.google.GoogleOneTapAuth;
import com.bytedance.lobby.google.GoogleShare;
import com.bytedance.lobby.google.GoogleWebAuth;
import com.bytedance.lobby.instagram.InstagramAuth;
import com.bytedance.lobby.internal.c;
import com.bytedance.lobby.kakao.KakaoAuth;
import com.bytedance.lobby.line.LineAuth;
import com.bytedance.lobby.twitter.TwitterAuth;
import com.bytedance.lobby.vk.VkAuth;

public final class LobbyCore {
    private static final boolean DEBUG = a.f40144a;
    static volatile boolean isInit;
    private static Application sApplication;
    private static b sProviderConfig;

    public static int com_bytedance_lobby_internal_LobbyCore_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static Application getApplication() {
        return sApplication;
    }

    static {
        Covode.recordClassIndex(24797);
    }

    static void tryInitProviderConfig() {
        MethodCollector.i(8526);
        if (!isInit) {
            synchronized (LobbyCore.class) {
                try {
                    if (!isInit) {
                        if (sProviderConfig.b() != null) {
                            for (d dVar : sProviderConfig.b()) {
                                int i2 = dVar.f40175a;
                                if (i2 == 2) {
                                    registerAuth(dVar);
                                } else if (i2 == 3) {
                                    registerShare(dVar);
                                } else {
                                    registerAuth(dVar);
                                    registerShare(dVar);
                                }
                            }
                        }
                        isInit = true;
                    }
                } finally {
                    MethodCollector.o(8526);
                }
            }
            return;
        }
        MethodCollector.o(8526);
    }

    private static com.bytedance.lobby.a.b createShare(d dVar) {
        String str = dVar.f40176b;
        str.hashCode();
        if (str.equals("google")) {
            return new GoogleShare(dVar);
        }
        if (!str.equals("facebook")) {
            return null;
        }
        return new FacebookShare(dVar);
    }

    public static void initialize(c.a aVar) {
        if (aVar.f40240b != null) {
            sApplication = (Application) aVar.f40239a;
            sProviderConfig = aVar.f40240b;
            a.f40144a = aVar.f40241c;
            if (aVar.f40240b.a()) {
                tryInitProviderConfig();
            }
        } else if (DEBUG) {
            com_bytedance_lobby_internal_LobbyCore_com_ss_android_ugc_aweme_lancet_LogLancet_d("LobbySDK", "No providers specified, skipping initialization.");
        }
    }

    private static void registerAuth(d dVar) {
        com.bytedance.lobby.auth.d createAuth = createAuth(dVar);
        if (createAuth != null) {
            d.a().a(createAuth);
        } else if (a.f40144a) {
            com_bytedance_lobby_internal_LobbyCore_com_ss_android_ugc_aweme_lancet_LogLancet_d("LobbySDK", "Cannot find Provider with id " + dVar.f40176b);
            throw new NullPointerException("Cannot find Provider with id " + dVar.f40176b);
        }
    }

    private static void registerShare(d dVar) {
        com.bytedance.lobby.a.b createShare = createShare(dVar);
        if (createShare != null) {
            com.bytedance.lobby.a.a.a().a(createShare);
        } else if (a.f40144a) {
            com_bytedance_lobby_internal_LobbyCore_com_ss_android_ugc_aweme_lancet_LogLancet_d("LobbySDK", "Cannot find Provider with id " + dVar.f40176b);
            throw new NullPointerException("Cannot find Provider with id " + dVar.f40176b);
        }
    }

    private static com.bytedance.lobby.auth.d createAuth(d dVar) {
        String str = dVar.f40176b;
        str.hashCode();
        switch (str.hashCode()) {
            case -1534815154:
                if (!str.equals("google_web")) {
                    return null;
                }
                return new GoogleWebAuth(dVar);
            case -1240244679:
                if (!str.equals("google")) {
                    return null;
                }
                return new GoogleAuth(dVar);
            case -916346253:
                if (!str.equals("twitter")) {
                    return null;
                }
                return new TwitterAuth(dVar);
            case 3765:
                if (!str.equals("vk")) {
                    return null;
                }
                return new VkAuth(dVar, sApplication);
            case 3321844:
                if (!str.equals("line")) {
                    return null;
                }
                return new LineAuth(dVar);
            case 28903346:
                if (!str.equals("instagram")) {
                    return null;
                }
                return new InstagramAuth(dVar);
            case 323062851:
                if (!str.equals("google_onetap")) {
                    return null;
                }
                return new GoogleOneTapAuth(dVar);
            case 486515695:
                if (!str.equals("kakaotalk")) {
                    return null;
                }
                return new KakaoAuth(dVar);
            case 497130182:
                if (!str.equals("facebook")) {
                    return null;
                }
                return new FacebookAuth(dVar);
            default:
                return null;
        }
    }
}
