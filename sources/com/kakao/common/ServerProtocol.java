package com.kakao.common;

import com.bytedance.covode.number.Covode;

public final class ServerProtocol {
    public static final String PLUS_FRIEND_AUTHORITY = initPlusFriendAuthority();

    private static String initPlusFriendAuthority() {
        return "pf.kakao.com";
    }

    static {
        Covode.recordClassIndex(34351);
    }

    /* renamed from: com.kakao.common.ServerProtocol$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$kakao$common$KakaoPhase;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 34352(0x8630, float:4.8137E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.kakao.common.KakaoPhase[] r0 = com.kakao.common.KakaoPhase.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.kakao.common.ServerProtocol.AnonymousClass1.$SwitchMap$com$kakao$common$KakaoPhase = r2
                com.kakao.common.KakaoPhase r0 = com.kakao.common.KakaoPhase.DEV     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.kakao.common.ServerProtocol.AnonymousClass1.$SwitchMap$com$kakao$common$KakaoPhase     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.kakao.common.KakaoPhase r0 = com.kakao.common.KakaoPhase.SANDBOX     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.kakao.common.ServerProtocol.AnonymousClass1.$SwitchMap$com$kakao$common$KakaoPhase     // Catch:{ NoSuchFieldError -> 0x002e }
                com.kakao.common.KakaoPhase r0 = com.kakao.common.KakaoPhase.CBT     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.kakao.common.ServerProtocol.AnonymousClass1.$SwitchMap$com$kakao$common$KakaoPhase     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.kakao.common.KakaoPhase r0 = com.kakao.common.KakaoPhase.PRODUCTION     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kakao.common.ServerProtocol.AnonymousClass1.<clinit>():void");
        }
    }

    public static String naviAuthority() {
        PhaseInfo phaseInfo = KakaoContextService.getInstance().phaseInfo();
        if (phaseInfo == null) {
            return "kakaonavi-wguide.kakao.com";
        }
        int i2 = AnonymousClass1.$SwitchMap$com$kakao$common$KakaoPhase[phaseInfo.phase().ordinal()];
        if (i2 == 1 || i2 == 2) {
            return "sandbox-kakaonavi-wguide.kakao.com";
        }
        return "kakaonavi-wguide.kakao.com";
    }

    public static String plusFriendAuthority() {
        PhaseInfo phaseInfo = KakaoContextService.getInstance().phaseInfo();
        if (phaseInfo == null) {
            return initPlusFriendAuthority();
        }
        int i2 = AnonymousClass1.$SwitchMap$com$kakao$common$KakaoPhase[phaseInfo.phase().ordinal()];
        if (i2 == 1 || i2 == 2) {
            return "sandbox-pf.kakao.com";
        }
        if (i2 != 3) {
            return "pf.kakao.com";
        }
        return "beta-pf.kakao.com";
    }
}
