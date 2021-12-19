package com.bytedance.ies.xelement;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter;
import com.lynx.tasm.behavior.v;

public class LynxPullRefreshView$$PropsSetter extends UIGroup$$PropsSetter {
    static {
        Covode.recordClassIndex(21923);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar) {
        LynxPullRefreshView lynxPullRefreshView = (LynxPullRefreshView) lynxBaseUI;
        str.hashCode();
        if (str.equals("enable-loadmore")) {
            lynxPullRefreshView.setEnableLoadMore(vVar.a(str, true));
        } else if (!str.equals("enable-refresh")) {
            super.setProperty(lynxBaseUI, str, vVar);
        } else {
            lynxPullRefreshView.setEnableRefresh(vVar.a(str, true));
        }
    }
}
