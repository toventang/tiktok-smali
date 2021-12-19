package com.ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.commercialize.AdCardServiceImpl;
import com.ss.android.ugc.aweme.commercialize.IAdCardService;
import com.ss.android.ugc.aweme.commercialize.depend.b;
import com.ss.android.ugc.aweme.commercialize.depend.t;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import h.a.am;
import h.f.b.l;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f75774a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final Set<Integer> f75775b = am.a((Object[]) new Integer[]{2, 3, 10, 6, 11, 7});

    private i() {
    }

    static {
        Covode.recordClassIndex(46737);
    }

    public static final boolean c(Aweme aweme) {
        if (a(aweme) != null) {
            return true;
        }
        return false;
    }

    public static final int e(Aweme aweme) {
        CardStruct a2 = a(aweme);
        if (a2 != null) {
            return a2.getShowDuration();
        }
        return -1;
    }

    public static final CardStruct a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        Map<String, CardStruct> cardInfos;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (cardInfos = awemeRawAd.getCardInfos()) == null) {
            return null;
        }
        return cardInfos.get("3");
    }

    public static final CardStruct b(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        Map<String, CardStruct> cardInfos;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (cardInfos = awemeRawAd.getCardInfos()) == null) {
            return null;
        }
        return cardInfos.get("5");
    }

    public static final boolean h(Aweme aweme) {
        l.d(aweme, "");
        CardStruct i2 = i(aweme);
        if (i2 == null) {
            return false;
        }
        if (i2.getCardType() == 9 || i2.getCardType() == 1001) {
            return true;
        }
        return false;
    }

    private static CardStruct i(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        Map<String, CardStruct> cardInfos;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (cardInfos = awemeRawAd.getCardInfos()) == null) {
            return null;
        }
        return cardInfos.get("4");
    }

    public static final View a(ViewGroup viewGroup) {
        MethodCollector.i(8934);
        if (viewGroup == null) {
            MethodCollector.o(8934);
            return null;
        }
        View childAt = viewGroup.getChildAt(0);
        if (childAt == null) {
            int i2 = Build.VERSION.SDK_INT;
            int generateViewId = View.generateViewId();
            childAt = new FrameLayout(viewGroup.getContext());
            ((FrameLayout) childAt).setId(generateViewId);
            viewGroup.addView(childAt, new FrameLayout.LayoutParams(-1, -1));
        }
        MethodCollector.o(8934);
        return childAt;
    }

    public static final boolean d(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        String webUrl;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        if (awemeRawAd == null || awemeRawAd.getAnimationType() != 2 || (webUrl = awemeRawAd.getWebUrl()) == null || webUrl.length() <= 0) {
            return false;
        }
        return true;
    }

    public static final void g(Aweme aweme) {
        CardStruct i2;
        AwemeRawAd awemeRawAd;
        Map<String, CardStruct> cardInfos;
        if (aweme != null && (i2 = i(aweme)) != null && i2.getCardType() == 1001 && (awemeRawAd = aweme.getAwemeRawAd()) != null && (cardInfos = awemeRawAd.getCardInfos()) != null) {
            cardInfos.remove("4");
        }
    }

    public static final boolean f(Aweme aweme) {
        CardStruct f2;
        boolean z;
        boolean z2;
        boolean z3;
        l.d(aweme, "");
        t a2 = b.f73781b.a();
        if (a2 == null || (f2 = a2.f(aweme)) == null) {
            return false;
        }
        if (f2.getCardStyle() == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean contains = f75775b.contains(Integer.valueOf(f2.getCardType()));
        if (f2.getCardStyle() == 2 && f2.getDynamicType() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        IAdCardService c2 = AdCardServiceImpl.c();
        if (c2 != null) {
            z3 = c2.a(f2);
        } else {
            z3 = false;
        }
        if ((!z || !contains) && !z2 && !z3) {
            return false;
        }
        return true;
    }

    public static final int a(CardStruct cardStruct, View view) {
        Integer valueOf;
        l.d(view, "");
        if (!(cardStruct == null || (valueOf = Integer.valueOf(cardStruct.getCardType())) == null)) {
            if (valueOf.intValue() == 1) {
                return n.a(278.0d);
            }
            if (valueOf.intValue() == 9) {
                return n.a(342.0d);
            }
            if (valueOf.intValue() == 8) {
                return n.a(295.0d);
            }
        }
        return view.getHeight();
    }

    public static final void a(Context context, Aweme aweme, ViewGroup viewGroup) {
        if (context != null && aweme != null && viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (aweme.isHotSearchAweme() || aweme.isHotVideoAweme() || aweme.isMixAweme()) {
                marginLayoutParams.bottomMargin += com.ss.android.ugc.aweme.framework.d.b.a(context, 32.0f);
            }
            viewGroup.setLayoutParams(marginLayoutParams);
        }
    }
}
