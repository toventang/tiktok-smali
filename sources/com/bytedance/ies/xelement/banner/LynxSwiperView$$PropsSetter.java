package com.bytedance.ies.xelement.banner;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;
import com.lynx.tasm.behavior.v;

public class LynxSwiperView$$PropsSetter extends UISimpleView$$PropsSetter {
    static {
        Covode.recordClassIndex(22051);
    }

    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar) {
        LynxSwiperView lynxSwiperView = (LynxSwiperView) lynxBaseUI;
        str.hashCode();
        switch (str.hashCode()) {
            case -1992012396:
                if (str.equals("duration")) {
                    lynxSwiperView.setDuration(vVar.a(str, 500));
                    return;
                }
                break;
            case -1597449863:
                if (str.equals("start-margin")) {
                    lynxSwiperView.setStartMargin(vVar.f(str));
                    return;
                }
                break;
            case -1596393144:
                if (str.equals("indicator-dots")) {
                    lynxSwiperView.setIndicator(vVar.a(str, false));
                    return;
                }
                break;
            case -1498085729:
                if (str.equals("circular")) {
                    lynxSwiperView.setCircular(vVar.a(str, false));
                    return;
                }
                break;
            case -1235498272:
                if (str.equals("end-margin")) {
                    lynxSwiperView.setEndMargin(vVar.f(str));
                    return;
                }
                break;
            case -1029251878:
                if (str.equals("indicator-active-color")) {
                    lynxSwiperView.setIndicatorActiveColor(vVar.c(str));
                    return;
                }
                break;
            case -313198140:
                if (str.equals("hardware_texture")) {
                    lynxSwiperView.setRenderHardwareTexture(vVar.a(str, false));
                    return;
                }
                break;
            case -111166008:
                if (str.equals("next-margin")) {
                    lynxSwiperView.setNextMargin(vVar.f(str));
                    return;
                }
                break;
            case 3357091:
                if (str.equals("mode")) {
                    lynxSwiperView.setMode(vVar.c(str));
                    return;
                }
                break;
            case 24002884:
                if (str.equals("previous-margin")) {
                    lynxSwiperView.setPreviousMargin(vVar.f(str));
                    return;
                }
                break;
            case 364166425:
                if (str.equals("touchable")) {
                    lynxSwiperView.setTouchable(vVar.a(str, false));
                    return;
                }
                break;
            case 570418373:
                if (str.equals("interval")) {
                    lynxSwiperView.setInterval(vVar.a(str, 5000));
                    return;
                }
                break;
            case 914875020:
                if (str.equals("item-width")) {
                    lynxSwiperView.setItemWidth(vVar.f(str));
                    return;
                }
                break;
            case 1126940025:
                if (str.equals("current")) {
                    lynxSwiperView.setCurrentIndex(vVar.a(str, 0));
                    return;
                }
                break;
            case 1127093697:
                if (str.equals("current-item-id")) {
                    lynxSwiperView.setCurrentItemId(vVar.c(str));
                    return;
                }
                break;
            case 1255595234:
                if (str.equals("hideshadow")) {
                    lynxSwiperView.setHideShadow(vVar.a(str, true));
                    return;
                }
                break;
            case 1439562083:
                if (str.equals("autoplay")) {
                    lynxSwiperView.setAutoPlay(vVar.a(str, false));
                    return;
                }
                break;
            case 1599847372:
                if (str.equals("smooth-scroll")) {
                    lynxSwiperView.setSmoothScroll(vVar.a(str, true));
                    return;
                }
                break;
            case 1616798838:
                if (str.equals("shadow-color")) {
                    lynxSwiperView.setShadowColor(vVar.c(str));
                    return;
                }
                break;
            case 1665556140:
                if (str.equals("page-margin")) {
                    lynxSwiperView.setPageMargin(vVar.f(str));
                    return;
                }
                break;
            case 2050488869:
                if (str.equals("indicator-color")) {
                    lynxSwiperView.setIndicatorColor(vVar.c(str));
                    return;
                }
                break;
        }
        super.setProperty(lynxBaseUI, str, vVar);
    }
}
