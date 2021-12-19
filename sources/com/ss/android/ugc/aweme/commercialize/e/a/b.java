package com.ss.android.ugc.aweme.commercialize.e.a;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.c;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.d;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.f;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.a;
import com.ss.android.ugc.aweme.commercialize.model.ac;
import com.ss.android.ugc.aweme.commercialize.model.ag;
import com.ss.android.ugc.aweme.commercialize.model.j;
import com.ss.android.ugc.aweme.commercialize.model.l;
import com.ss.android.ugc.aweme.commercialize.model.m;
import com.ss.android.ugc.aweme.commercialize.model.w;
import com.ss.android.ugc.aweme.commercialize.utils.bh;
import com.ss.android.ugc.aweme.feed.model.AdInteractionData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.feed.model.BottomBanner;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.DynamicVideo;
import com.ss.android.ugc.aweme.feed.model.NativeAuthorInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class b {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f73806a = true;

    static {
        Covode.recordClassIndex(45450);
    }

    public static String I(Aweme aweme) {
        AwemeSplashInfo m2 = m(aweme);
        if (m2 == null) {
            return null;
        }
        return m2.getAwesomeSplashId();
    }

    public static boolean K(Aweme aweme) {
        if (L(aweme) != null || M(aweme)) {
            return true;
        }
        return false;
    }

    public static boolean M(Aweme aweme) {
        if (N(aweme) != null) {
            return true;
        }
        return false;
    }

    public static boolean P(Aweme aweme) {
        if (aweme == null || aweme.getCommerceVideoAuthInfo() == null) {
            return false;
        }
        return true;
    }

    public static boolean Q(Aweme aweme) {
        if (R(aweme) != null) {
            return true;
        }
        return false;
    }

    public static boolean S(Aweme aweme) {
        if (aweme == null || !e(aweme.getAwemeRawAd())) {
            return false;
        }
        return true;
    }

    public static boolean U(Aweme aweme) {
        if (aweme == null || aweme.getAwemeType() != 34) {
            return false;
        }
        return true;
    }

    public static String aT(Aweme aweme) {
        a commerceVideoAuthInfo;
        if (aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null) {
            return null;
        }
        return commerceVideoAuthInfo.getStudyId();
    }

    public static boolean ab(Aweme aweme) {
        if (aweme == null || !aweme.isCmtSwt()) {
            return false;
        }
        return true;
    }

    public static String ac(Aweme aweme) {
        AwemeSplashInfo m2 = m(aweme);
        if (m2 == null) {
            return "";
        }
        return m2.getSplashButtonText();
    }

    public static boolean af(Aweme aweme) {
        AwemeSplashInfo m2 = m(aweme);
        if (m2 == null) {
            return false;
        }
        return m2.isShown();
    }

    public static void aj(Aweme aweme) {
        AwemeSplashInfo m2 = m(aweme);
        if (m2 != null) {
            m2.setShown(true);
        }
    }

    public static boolean b(String str) {
        if (str == null || !str.contains("__back_url__")) {
            return false;
        }
        return true;
    }

    public static Aweme d(String str) {
        IAwemeService b2 = AwemeService.b();
        Aweme d2 = b2.d(str);
        Aweme b3 = b2.b(str);
        if (d2 != null) {
            return d2;
        }
        return b3;
    }

    public static boolean i(Aweme aweme) {
        if (j(aweme) != null) {
            return true;
        }
        return false;
    }

    public static boolean l(Aweme aweme) {
        AwemeSplashInfo m2 = m(aweme);
        if (m2 == null) {
            return false;
        }
        return m2.adCardShownOnce;
    }

    public static AwemeSplashInfo m(Aweme aweme) {
        AwemeRawAd n = n(aweme);
        if (n == null) {
            return null;
        }
        return n.getSplashInfo();
    }

    public static AwemeRawAd n(Aweme aweme) {
        if (aweme != null && aweme.isAd()) {
            return aweme.getAwemeRawAd();
        }
        return null;
    }

    public static void o(Aweme aweme) {
        AwemeSplashInfo m2 = m(aweme);
        if (m2 != null) {
            m2.adCardShownOnce = true;
        }
    }

    public static boolean s(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        return true;
    }

    public static boolean B(Aweme aweme) {
        AwemeSplashInfo m2 = m(aweme);
        if (m2 != null && !TextUtils.isEmpty(m2.getAwesomeSplashId())) {
            return true;
        }
        return false;
    }

    public static boolean C(Aweme aweme) {
        AdInteractionData adInteractionData;
        if (aweme == null || !aweme.isAd() || (adInteractionData = aweme.getAwemeRawAd().getAdInteractionData()) == null || adInteractionData.getGestureGuidance() == null) {
            return false;
        }
        return true;
    }

    public static int D(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return 0;
        }
        return aweme.getAwemeRawAd().getShowButtonSeconds() * 1000;
    }

    public static boolean E(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        User author = aweme.getAuthor();
        if (author == null) {
            return true;
        }
        return author.isAdFake();
    }

    public static boolean G(Aweme aweme) {
        AwemeSplashInfo m2 = m(aweme);
        if (m2 != null && !TextUtils.isEmpty(m2.getAwesomeSplashId())) {
            return true;
        }
        return false;
    }

    public static boolean H(Aweme aweme) {
        AwemeSplashInfo m2 = m(aweme);
        if (m2 != null && ((long) m2.getEndTime()) >= System.currentTimeMillis() / 1000) {
            return false;
        }
        return true;
    }

    public static CardStruct L(Aweme aweme) {
        CardStruct e2 = e(aweme);
        if (e2 == null || e2.getCardType() != 14) {
            return null;
        }
        return e2;
    }

    public static CardStruct N(Aweme aweme) {
        CardStruct cardStruct;
        if (P(aweme) && (cardStruct = aweme.getCommerceVideoAuthInfo().getCardStruct()) != null && cardStruct.getCardType() == 14) {
            return cardStruct;
        }
        return null;
    }

    public static boolean O(Aweme aweme) {
        if (!P(aweme)) {
            return false;
        }
        return aweme.getCommerceVideoAuthInfo().isHasUserSubmittedFeedback();
    }

    public static m R(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return null;
        }
        return aweme.getAwemeRawAd().getStickerData();
    }

    public static boolean V(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || !E(aweme) || aweme.getAwemeRawAd().getAdAvatarLinkTagStyle() == 0) {
            return false;
        }
        return true;
    }

    public static boolean W(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getSystemOrigin() != 0) {
            return false;
        }
        return true;
    }

    public static boolean X(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getSystemOrigin() != 1) {
            return false;
        }
        return true;
    }

    public static boolean Y(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getSystemOrigin() != 2) {
            return false;
        }
        return true;
    }

    public static boolean Z(Aweme aweme) {
        if (aweme == null || aweme.getCommerceVideoAuthInfo() == null || aweme.getCommerceVideoAuthInfo().getAdSource() != 1) {
            return false;
        }
        return true;
    }

    public static String a(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return "";
        }
        return aweme.getAwemeRawAd().getFormUrl();
    }

    public static boolean aF(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getAdLive() == null) {
            return false;
        }
        return true;
    }

    public static boolean aM(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd() == null) {
            return false;
        }
        return TextUtils.equals(aweme.getAwemeRawAd().getType(), "app");
    }

    public static boolean aN(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd() == null) {
            return false;
        }
        return c(aweme.getAwemeRawAd().getOpenUrl());
    }

    public static boolean aO(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd() == null || TextUtils.isEmpty(aweme.getAwemeRawAd().getWebUrl())) {
            return false;
        }
        return true;
    }

    public static boolean aP(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd() == null) {
            return false;
        }
        return aweme.getAwemeRawAd().allowJumpToPlayStore();
    }

    public static boolean aQ(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd() == null) {
            return false;
        }
        return TextUtils.equals(aweme.getAwemeRawAd().getType(), "web");
    }

    public static boolean aV(Aweme aweme) {
        if (!aU(aweme) || aweme.getAwemeRawAd().getDisclaimer().getType() != 2) {
            return false;
        }
        return true;
    }

    public static boolean aX(Aweme aweme) {
        if (aweme == null || !aW(aweme) || FeedAdServiceImpl.c().b().a(aweme.getAid()).f65745a != 1) {
            return false;
        }
        return true;
    }

    public static boolean aY(Aweme aweme) {
        j aZ = aZ(aweme);
        if (aZ == null || aZ.getEntryType() == 0 || aZ.getLynxScheme() == null || aZ.getGeckoChannel() == null) {
            return false;
        }
        return true;
    }

    public static j aZ(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return null;
        }
        return aweme.getAwemeRawAd().getLynxEntryData();
    }

    public static boolean aa(Aweme aweme) {
        if (!X(aweme) || aweme.getAwemeRawAd().getDisableFollowToClick() != 0) {
            return false;
        }
        return true;
    }

    public static void ad(Aweme aweme) {
        AwemeSplashInfo m2;
        if (w(aweme) && (m2 = m(aweme)) != null) {
            m2.hasUpdateLiving = true;
        }
    }

    public static boolean ae(Aweme aweme) {
        ac a2;
        if (aweme == null || (a2 = bh.a(aweme)) == null || a2.feedShowType != 3) {
            return false;
        }
        return true;
    }

    public static boolean ag(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getAdTagPosition() != 1) {
            return false;
        }
        return true;
    }

    public static boolean ah(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        return aweme.getAwemeRawAd().isShowAdAfterInteraction();
    }

    public static int ai(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return 0;
        }
        return aweme.getAwemeRawAd().getInteractionSeconds();
    }

    public static boolean an(Aweme aweme) {
        if (aweme != null && aweme.isAd() && !X(aweme)) {
            return true;
        }
        return false;
    }

    public static boolean ao(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getAnimationType() != 2) {
            return false;
        }
        return true;
    }

    public static boolean ap(Aweme aweme) {
        if (!P(aweme)) {
            return false;
        }
        return aweme.getCommerceVideoAuthInfo().isMusicNotClickable();
    }

    public static boolean aq(Aweme aweme) {
        if (!P(aweme)) {
            return false;
        }
        return aweme.getCommerceVideoAuthInfo().isPersonalPageForbidden();
    }

    public static CardStruct ar(Aweme aweme) {
        Map<String, CardStruct> cardInfos;
        AwemeRawAd n = n(aweme);
        if (n == null || (cardInfos = n.getCardInfos()) == null) {
            return null;
        }
        return cardInfos.get("4");
    }

    public static boolean as(Aweme aweme) {
        if (!s(aweme) || !aweme.getAwemeRawAd().isContextTrackSent()) {
            return false;
        }
        return true;
    }

    public static boolean at(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getAdType() != 1) {
            return false;
        }
        return true;
    }

    public static boolean aw(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getAdType() != 2) {
            return false;
        }
        return true;
    }

    public static boolean ax(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || !aweme.getAwemeRawAd().isDisableLikeType()) {
            return false;
        }
        return true;
    }

    public static boolean az(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || TextUtils.isEmpty(awemeRawAd.getOpenUrl())) {
            return false;
        }
        return awemeRawAd.isOpenUrlSupportPullUp();
    }

    public static String b(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return "";
        }
        return aweme.getAwemeRawAd().getWebUrl();
    }

    private static String ba(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return "";
        }
        return aweme.getAwemeRawAd().getType();
    }

    public static boolean d(Aweme aweme) {
        if (e(aweme) != null) {
            return true;
        }
        return false;
    }

    public static boolean e(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null && awemeRawAd.getCardInteractionType() == 1 && !TextUtils.isEmpty(awemeRawAd.getWebUrl())) {
            return true;
        }
        return false;
    }

    public static boolean f(AwemeRawAd awemeRawAd) {
        if (awemeRawAd == null || awemeRawAd.getFakeAuthor() == null || awemeRawAd.getFakeAuthor().getFakeAuthorVersion().intValue() != 2) {
            return false;
        }
        return true;
    }

    public static boolean g(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getPlayFunModel() == null) {
            return false;
        }
        return true;
    }

    public static boolean h(AwemeRawAd awemeRawAd) {
        if (awemeRawAd == null || awemeRawAd.getFakeAuthor() == null || !awemeRawAd.getFakeAuthor().getShouldShowBanner()) {
            return false;
        }
        return true;
    }

    public static boolean i(AwemeRawAd awemeRawAd) {
        if (awemeRawAd == null || awemeRawAd.getFakeAuthor() == null || !awemeRawAd.getFakeAuthor().getAutoShowWebview().booleanValue()) {
            return false;
        }
        return true;
    }

    public static w j(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return null;
        }
        return aweme.getAwemeRawAd().getDouPlusLinkData();
    }

    public static boolean k(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return false;
        }
        return TextUtils.equals(awemeRawAd.getType(), "app");
    }

    public static boolean p(Aweme aweme) {
        AwemeRawAd n = n(aweme);
        if (n == null || !n.isPopUps()) {
            return false;
        }
        String openUrl = n.getOpenUrl();
        if (TextUtils.isEmpty(openUrl)) {
            return false;
        }
        return e(openUrl);
    }

    public static boolean r(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || !aweme.getAwemeRawAd().isOpenSystemBrowser()) {
            return false;
        }
        return true;
    }

    public static String t(Aweme aweme) {
        if (aweme == null || aweme.getNewLiveRoomData() == null || aweme.getNewLiveRoomData().owner == null) {
            return "";
        }
        return aweme.getNewLiveRoomData().owner.getUid();
    }

    public static long u(Aweme aweme) {
        if (aweme == null || aweme.getNewLiveRoomData() == null) {
            return 0;
        }
        return aweme.getNewLiveRoomData().id;
    }

    public static boolean w(Aweme aweme) {
        AwemeSplashInfo m2 = m(aweme);
        if (m2 != null && !TextUtils.isEmpty(m2.getAwesomeSplashId()) && m2.getSplashFeedType() == 2) {
            return true;
        }
        return false;
    }

    public static boolean y(Aweme aweme) {
        AwemeSplashInfo m2;
        if (w(aweme) && (m2 = m(aweme)) != null && !m2.hasUpdateLiving) {
            return true;
        }
        return false;
    }

    public static boolean A(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (!B(aweme) || (awemeRawAd = aweme.getAwemeRawAd()) == null || !TextUtils.equals(awemeRawAd.getType(), "app")) {
            return false;
        }
        String packageName = awemeRawAd.getPackageName();
        c a2 = d.a();
        List arrayList = new ArrayList();
        if (!(a2 == null || a2.f34803a == null)) {
            arrayList = Arrays.asList(a2.f34803a);
        }
        if (!arrayList.contains(packageName)) {
            return true;
        }
        return false;
    }

    public static boolean F(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        if (!f73806a && aweme.getAwemeRawAd() == null) {
            throw new AssertionError();
        } else if (E(aweme) && aweme.getAwemeRawAd().getFakeAuthor() != null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean J(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || !TextUtils.equals(aweme.getAwemeRawAd().getType(), "app") || aweme.getAwemeRawAd().getWebType() != 1 || TextUtils.isEmpty(aweme.getAwemeRawAd().getWebUrl())) {
            return false;
        }
        return true;
    }

    public static boolean T(Aweme aweme) {
        com.ss.android.ugc.aweme.commerce.model.b activityPendant;
        UrlModel image;
        if (!(aweme == null || aweme.getActivityPendant() == null || (image = (activityPendant = aweme.getActivityPendant()).getImage()) == null || com.bytedance.common.utility.collection.b.a((Collection) image.getUrlList()))) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (currentTimeMillis < activityPendant.getStartTime() || currentTimeMillis > activityPendant.getEndTime()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean aA(Aweme aweme) {
        NativeAuthorInfo nativeAuthorInfo;
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        User author = aweme.getAuthor();
        if ((author != null && author.isAdFake()) || (nativeAuthorInfo = awemeRawAd.getNativeAuthorInfo()) == null || nativeAuthorInfo.getBottomBanner() == null) {
            return false;
        }
        return true;
    }

    public static boolean aE(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        if (aweme.isLive()) {
            return true;
        }
        User author = aweme.getAuthor();
        if (author == null || !author.isLive() || !aF(aweme)) {
            return false;
        }
        return true;
    }

    public static boolean aH(Aweme aweme) {
        l lVar;
        if (aweme == null || !aweme.isAd()) {
            lVar = null;
        } else {
            lVar = aweme.getAwemeRawAd().getAdQuestionnaire();
        }
        if (lVar != null && !TextUtils.isEmpty(lVar.getSchema())) {
            return true;
        }
        return false;
    }

    public static boolean aJ(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || TextUtils.isEmpty(aweme.getAwemeRawAd().getButtonIcon()) || !aweme.getAwemeRawAd().getButtonIcon().endsWith(".webp")) {
            return false;
        }
        return true;
    }

    public static boolean aL(Aweme aweme) {
        if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (g(awemeRawAd) || aN(aweme) || TextUtils.isEmpty(awemeRawAd.getWebUrl()) || !h(awemeRawAd) || !i(awemeRawAd) || !aM(aweme)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static String aR(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getAdLive() == null || TextUtils.isEmpty(aweme.getAwemeRawAd().getAdLive().getButtonText())) {
            return "";
        }
        return aweme.getAwemeRawAd().getAdLive().getButtonText();
    }

    public static boolean aU(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getDisclaimer() == null || aweme.getAwemeRawAd().getDisclaimer().getType() == 0) {
            return false;
        }
        return true;
    }

    public static boolean aW(Aweme aweme) {
        DynamicVideo dynamicVideo;
        if (aweme == null || !aweme.isAd() || (dynamicVideo = aweme.getAwemeRawAd().getDynamicVideo()) == null || TextUtils.isEmpty(dynamicVideo.getLynxScheme())) {
            return false;
        }
        return true;
    }

    public static String ak(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return com.bytedance.ies.ugc.appcontext.d.a().getResources().getString(R.color.jq);
        }
        String learnMoreBgColor = aweme.getAwemeRawAd().getLearnMoreBgColor();
        if (TextUtils.isEmpty(learnMoreBgColor)) {
            return com.bytedance.ies.ugc.appcontext.d.a().getResources().getString(R.color.jq);
        }
        return learnMoreBgColor;
    }

    public static boolean al(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        if (x(aweme)) {
            return true;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (TextUtils.isEmpty(awemeRawAd.getWebUrl())) {
            return false;
        }
        if (awemeRawAd.getAnimationType() == 1 || awemeRawAd.getAnimationType() == 2) {
            return true;
        }
        return false;
    }

    public static boolean am(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        if (aweme.getAwemeRawAd().getAnimationType() == 1 || aweme.getAwemeRawAd().getAnimationType() == 3) {
            return true;
        }
        return false;
    }

    public static boolean av(Aweme aweme) {
        if (aweme == null || !aweme.isAppAd()) {
            return false;
        }
        if (!f73806a && aweme.getAwemeRawAd() == null) {
            throw new AssertionError();
        } else if (!TextUtils.isEmpty(aweme.getAwemeRawAd().getLightWebUrl())) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean ay(Aweme aweme) {
        if (!aA(aweme)) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        BottomBanner bottomBanner = aweme.getAwemeRawAd().getNativeAuthorInfo().getBottomBanner();
        if ((!TextUtils.isEmpty(awemeRawAd.getOpenUrl()) || TextUtils.equals(awemeRawAd.getType(), "app")) && bottomBanner.getVersion() == 1 && !awemeRawAd.isDisableUserprofileAdLabel()) {
            return true;
        }
        return false;
    }

    public static boolean b(AwemeRawAd awemeRawAd) {
        AwemeSplashInfo splashInfo;
        if (awemeRawAd != null && (splashInfo = awemeRawAd.getSplashInfo()) != null && !TextUtils.isEmpty(splashInfo.getAwesomeSplashId()) && splashInfo.getSplashFeedType() == 2) {
            return true;
        }
        return false;
    }

    private static CardStruct bb(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getLiveCardInfo() == null) {
            return null;
        }
        return aweme.getAwemeRawAd().getLiveCardInfo();
    }

    private static boolean bc(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        ag nativeSiteConfig;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (nativeSiteConfig = awemeRawAd.getNativeSiteConfig()) == null || !TextUtils.equals(nativeSiteConfig.getRenderType(), "lynx") || TextUtils.isEmpty(nativeSiteConfig.getLynxScheme())) {
            return false;
        }
        return true;
    }

    public static String c(AwemeRawAd awemeRawAd) {
        if (awemeRawAd == null) {
            return com.bytedance.ies.ugc.appcontext.d.a().getResources().getString(R.color.jq);
        }
        String learnMoreBgColor = awemeRawAd.getLearnMoreBgColor();
        if (TextUtils.isEmpty(learnMoreBgColor)) {
            return com.bytedance.ies.ugc.appcontext.d.a().getResources().getString(R.color.jq);
        }
        return learnMoreBgColor;
    }

    public static boolean d(AwemeRawAd awemeRawAd) {
        if (awemeRawAd == null) {
            return false;
        }
        return TextUtils.equals(awemeRawAd.getType(), "app");
    }

    public static CardStruct e(Aweme aweme) {
        if (bb(aweme) != null) {
            return bb(aweme);
        }
        if (f(aweme) != null) {
            return f(aweme);
        }
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getDefaultCardInfo() == null) {
            return null;
        }
        return aweme.getAwemeRawAd().getDefaultCardInfo();
    }

    public static CardStruct f(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getNotificationConfig() != 1 || aweme.getAwemeRawAd().getFollowCardInfo() == null) {
            return null;
        }
        return aweme.getAwemeRawAd().getFollowCardInfo();
    }

    public static boolean g(AwemeRawAd awemeRawAd) {
        if (awemeRawAd.getNativeSiteConfig() == null || !TextUtils.equals(awemeRawAd.getNativeSiteConfig().getRenderType(), "lynx") || TextUtils.isEmpty(awemeRawAd.getNativeSiteConfig().getLynxScheme())) {
            return false;
        }
        return true;
    }

    public static CardStruct h(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getCardInfos() == null || !aweme.getAwemeRawAd().getCardInfos().containsKey("5")) {
            return null;
        }
        return aweme.getAwemeRawAd().getCardInfos().get("5");
    }

    public static boolean q(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return false;
        }
        String openUrl = aweme.getAwemeRawAd().getOpenUrl();
        String microAppUrl = aweme.getAwemeRawAd().getMicroAppUrl();
        if (com.ss.android.ugc.aweme.miniapp_api.d.c(openUrl)) {
            return true;
        }
        if (!com.ss.android.ugc.aweme.miniapp_api.d.c(microAppUrl) || c(openUrl)) {
            return false;
        }
        return true;
    }

    public static boolean v(Aweme aweme) {
        if (s(aweme) && w(aweme) && !x(aweme)) {
            return TextUtils.isEmpty(aweme.getAwemeRawAd().getWebUrl());
        }
        return false;
    }

    public static boolean x(Aweme aweme) {
        if (aweme == null || !w(aweme)) {
            return false;
        }
        if (y(aweme)) {
            return true;
        }
        User author = aweme.getAuthor();
        if (author == null || !author.isLive()) {
            return false;
        }
        return true;
    }

    public static boolean z(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        String webUrl = aweme.getAwemeRawAd().getWebUrl();
        if (TextUtils.isEmpty(webUrl) || !webUrl.endsWith(".apk")) {
            return false;
        }
        return true;
    }

    public static String a(AwemeRawAd awemeRawAd) {
        if (TextUtils.isEmpty(awemeRawAd.getHomepageBottomTextual())) {
            return com.bytedance.ies.ugc.appcontext.d.a().getResources().getString(R.string.nx);
        }
        return awemeRawAd.getHomepageBottomTextual();
    }

    public static boolean aB(Aweme aweme) {
        if (!aA(aweme)) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (aweme.getAwemeRawAd().getNativeAuthorInfo().getBottomBanner().getVersion() != 1 || !TextUtils.equals(awemeRawAd.getType(), "web") || !TextUtils.isEmpty(awemeRawAd.getOpenUrl()) || ((TextUtils.isEmpty(awemeRawAd.getWebUrl()) && !bc(aweme)) || awemeRawAd.isDisableUserprofileAdLabel())) {
            return false;
        }
        return true;
    }

    public static boolean aC(Aweme aweme) {
        if (!aA(aweme)) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (aweme.getAwemeRawAd().getNativeAuthorInfo().getBottomBanner().getVersion() != 1 || awemeRawAd.getNativeAuthorInfo().getAutoPullStyle() != 1 || !TextUtils.equals(awemeRawAd.getType(), "app") || TextUtils.isEmpty(awemeRawAd.getWebUrl()) || aN(aweme) || awemeRawAd.isDisableUserprofileAdLabel()) {
            return false;
        }
        return true;
    }

    public static boolean aD(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return false;
        }
        User author = aweme.getAuthor();
        if (author != null && author.isAdFake()) {
            return false;
        }
        if (w(aweme)) {
            if (awemeRawAd.getCallToActionBarInfo() == null || !x(aweme)) {
                return false;
            }
            return true;
        } else if (aF(aweme)) {
            if (!aE(aweme) || awemeRawAd.getCallToActionBarInfo() == null) {
                return false;
            }
            return true;
        } else if (awemeRawAd.getCallToActionBarInfo() == null || TextUtils.isEmpty(awemeRawAd.getWebUrl())) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean aG(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return false;
        }
        if (w(aweme) && awemeRawAd.getCallToActionBarInfo() != null) {
            return x(aweme);
        }
        if (TextUtils.isEmpty(awemeRawAd.getWebUrl()) && !TextUtils.equals(awemeRawAd.getType(), "app")) {
            return false;
        }
        User author = aweme.getAuthor();
        if (author != null && author.isAdFake()) {
            return false;
        }
        if (awemeRawAd.getCallToActionBarInfo() == null && awemeRawAd.isDisableUserprofileAdLabel()) {
            return false;
        }
        return true;
    }

    public static boolean aI(Aweme aweme) {
        CardStruct cardStruct;
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getCardInfos() == null || !aweme.getAwemeRawAd().getCardInfos().containsKey("5")) {
            cardStruct = null;
        } else {
            cardStruct = aweme.getAwemeRawAd().getCardInfos().get("5");
        }
        if (cardStruct != null && cardStruct.getCardType() == 13) {
            return true;
        }
        return false;
    }

    public static boolean aK(Aweme aweme) {
        if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (h(awemeRawAd)) {
                if (!g(awemeRawAd) && aN(aweme)) {
                    return true;
                }
                if (!g(awemeRawAd) && !aN(aweme) && !i(awemeRawAd) && aM(aweme)) {
                    return true;
                }
                if (!g(awemeRawAd) || !aM(aweme)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static String aS(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getAdLive() == null) {
            return com.bytedance.ies.ugc.appcontext.d.a().getResources().getString(R.color.bh);
        }
        String buttonBgColor = aweme.getAwemeRawAd().getAdLive().getButtonBgColor();
        if (TextUtils.isEmpty(buttonBgColor)) {
            return com.bytedance.ies.ugc.appcontext.d.a().getResources().getString(R.color.bh);
        }
        return buttonBgColor;
    }

    public static Boolean au(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (!TextUtils.isEmpty(awemeRawAd.getAuthorUrl())) {
            return false;
        }
        String openUrl = awemeRawAd.getOpenUrl();
        if (TextUtils.isEmpty(openUrl)) {
            return false;
        }
        Uri parse = Uri.parse(openUrl);
        if (parse.getScheme() == null) {
            return false;
        }
        String lowerCase = parse.getScheme().toLowerCase();
        if (("sslocal".equals(lowerCase) || "localsdk".equals(lowerCase)) && !com.ss.android.ugc.aweme.miniapp_api.d.c(parse.toString())) {
            return true;
        }
        return Boolean.valueOf(e(openUrl));
    }

    public static String c(Aweme aweme) {
        if (d(aweme)) {
            String str = null;
            if (!(aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getDefaultCardInfo() == null)) {
                str = aweme.getAwemeRawAd().getDefaultCardInfo().getCardUrl();
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        if (TextUtils.equals(ba(aweme), "form")) {
            return a(aweme);
        }
        if (TextUtils.equals(ba(aweme), "app")) {
            if (aweme == null || !aweme.isAd()) {
                return "";
            }
            return aweme.getAwemeRawAd().getDownloadUrl();
        } else if (TextUtils.equals(ba(aweme), "web")) {
            return b(aweme);
        } else {
            return "";
        }
    }

    private static boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null) {
            return false;
        }
        String lowerCase = parse.getScheme().toLowerCase();
        if (TextUtils.isEmpty(lowerCase) || a(lowerCase)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        return f.a(GlobalContext.getContext(), intent);
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null) {
            return false;
        }
        String lowerCase = parse.getScheme().toLowerCase();
        if (TextUtils.isEmpty(lowerCase)) {
            return false;
        }
        if (a(lowerCase)) {
            return true;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        return f.a(GlobalContext.getContext(), intent);
    }

    public static boolean a(CardStruct cardStruct) {
        if (cardStruct == null) {
            return false;
        }
        if (cardStruct.getCardType() == 8 || cardStruct.getCardType() == 9) {
            return true;
        }
        return false;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (TextUtils.equals("sslocal", lowerCase) || TextUtils.equals("localsdk", lowerCase)) {
            return true;
        }
        return false;
    }

    public static String a(Aweme aweme, Aweme aweme2) {
        String aid;
        String str = null;
        if (aweme == null) {
            aid = null;
        } else {
            aid = aweme.getAid();
        }
        if (aweme2 != null) {
            str = aweme2.getAid();
        }
        return "itemIds=" + aid + ";" + str;
    }

    private static boolean b(AwemeRawAd awemeRawAd, String str) {
        Uri parse;
        String webUrl;
        if (str == null) {
            if (awemeRawAd.getWebUrl() == null) {
                webUrl = "";
            } else {
                webUrl = awemeRawAd.getWebUrl();
            }
            parse = Uri.parse(webUrl);
        } else {
            parse = Uri.parse(str);
        }
        boolean z = false;
        try {
            String queryParameter = parse.getQueryParameter("immersive_mode");
            boolean booleanValue = awemeRawAd.getUseOrdinaryWeb_().booleanValue();
            String queryParameter2 = parse.getQueryParameter("topbar_type");
            if (TextUtils.equals(queryParameter2, "1")) {
                return true;
            }
            if (queryParameter2 == null || TextUtils.equals(queryParameter2, "0")) {
                if (queryParameter != null) {
                    return TextUtils.equals(queryParameter, "1");
                }
                z = !booleanValue;
            }
            return z;
        } catch (UnsupportedOperationException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean a(AwemeRawAd awemeRawAd, String str) {
        if (awemeRawAd != null && awemeRawAd.getWebviewType() == 1 && !b(awemeRawAd, str)) {
            return true;
        }
        return false;
    }
}
