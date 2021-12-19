package com.ss.android.ugc.aweme.ftc.components.toolbar;

import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.p;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.gamora.editor.y;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class FTCEditToolbarState extends UiState {
    private final String backTipText;
    private final Boolean backTipVisible;
    private final Boolean backVisible;
    private final List<y> bottomBarItems;
    private final Integer bottomHeight;
    private final Drawable chooseMusicIcon;
    private final String chooseMusicText;
    private final p hideMoreEvent;
    private final List<y> titleBarItems;
    private final Integer topMargin;
    private final a ui;

    static {
        Covode.recordClassIndex(62435);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FTCEditToolbarState copy$default(FTCEditToolbarState fTCEditToolbarState, a aVar, Boolean bool, Boolean bool2, String str, List list, List list2, p pVar, String str2, Drawable drawable, Integer num, Integer num2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = fTCEditToolbarState.getUi();
        }
        if ((i2 & 2) != 0) {
            bool = fTCEditToolbarState.backVisible;
        }
        if ((i2 & 4) != 0) {
            bool2 = fTCEditToolbarState.backTipVisible;
        }
        if ((i2 & 8) != 0) {
            str = fTCEditToolbarState.backTipText;
        }
        if ((i2 & 16) != 0) {
            list = fTCEditToolbarState.titleBarItems;
        }
        if ((i2 & 32) != 0) {
            list2 = fTCEditToolbarState.bottomBarItems;
        }
        if ((i2 & 64) != 0) {
            pVar = fTCEditToolbarState.hideMoreEvent;
        }
        if ((i2 & 128) != 0) {
            str2 = fTCEditToolbarState.chooseMusicText;
        }
        if ((i2 & 256) != 0) {
            drawable = fTCEditToolbarState.chooseMusicIcon;
        }
        if ((i2 & 512) != 0) {
            num = fTCEditToolbarState.topMargin;
        }
        if ((i2 & 1024) != 0) {
            num2 = fTCEditToolbarState.bottomHeight;
        }
        return fTCEditToolbarState.copy(aVar, bool, bool2, str, list, list2, pVar, str2, drawable, num, num2);
    }

    public final a component1() {
        return getUi();
    }

    public final Integer component10() {
        return this.topMargin;
    }

    public final Integer component11() {
        return this.bottomHeight;
    }

    public final Boolean component2() {
        return this.backVisible;
    }

    public final Boolean component3() {
        return this.backTipVisible;
    }

    public final String component4() {
        return this.backTipText;
    }

    public final List<y> component5() {
        return this.titleBarItems;
    }

    public final List<y> component6() {
        return this.bottomBarItems;
    }

    public final p component7() {
        return this.hideMoreEvent;
    }

    public final String component8() {
        return this.chooseMusicText;
    }

    public final Drawable component9() {
        return this.chooseMusicIcon;
    }

    public final FTCEditToolbarState copy(a aVar, Boolean bool, Boolean bool2, String str, List<y> list, List<y> list2, p pVar, String str2, Drawable drawable, Integer num, Integer num2) {
        l.d(aVar, "");
        return new FTCEditToolbarState(aVar, bool, bool2, str, list, list2, pVar, str2, drawable, num, num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditToolbarState)) {
            return false;
        }
        FTCEditToolbarState fTCEditToolbarState = (FTCEditToolbarState) obj;
        return l.a(getUi(), fTCEditToolbarState.getUi()) && l.a(this.backVisible, fTCEditToolbarState.backVisible) && l.a(this.backTipVisible, fTCEditToolbarState.backTipVisible) && l.a(this.backTipText, fTCEditToolbarState.backTipText) && l.a(this.titleBarItems, fTCEditToolbarState.titleBarItems) && l.a(this.bottomBarItems, fTCEditToolbarState.bottomBarItems) && l.a(this.hideMoreEvent, fTCEditToolbarState.hideMoreEvent) && l.a(this.chooseMusicText, fTCEditToolbarState.chooseMusicText) && l.a(this.chooseMusicIcon, fTCEditToolbarState.chooseMusicIcon) && l.a(this.topMargin, fTCEditToolbarState.topMargin) && l.a(this.bottomHeight, fTCEditToolbarState.bottomHeight);
    }

    public final int hashCode() {
        a ui2 = getUi();
        int i2 = 0;
        int hashCode = (ui2 != null ? ui2.hashCode() : 0) * 31;
        Boolean bool = this.backVisible;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.backTipVisible;
        int hashCode3 = (hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        String str = this.backTipText;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        List<y> list = this.titleBarItems;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        List<y> list2 = this.bottomBarItems;
        int hashCode6 = (hashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31;
        p pVar = this.hideMoreEvent;
        int hashCode7 = (hashCode6 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        String str2 = this.chooseMusicText;
        int hashCode8 = (hashCode7 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Drawable drawable = this.chooseMusicIcon;
        int hashCode9 = (hashCode8 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num = this.topMargin;
        int hashCode10 = (hashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.bottomHeight;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return hashCode10 + i2;
    }

    public final String toString() {
        return "FTCEditToolbarState(ui=" + getUi() + ", backVisible=" + this.backVisible + ", backTipVisible=" + this.backTipVisible + ", backTipText=" + this.backTipText + ", titleBarItems=" + this.titleBarItems + ", bottomBarItems=" + this.bottomBarItems + ", hideMoreEvent=" + this.hideMoreEvent + ", chooseMusicText=" + this.chooseMusicText + ", chooseMusicIcon=" + this.chooseMusicIcon + ", topMargin=" + this.topMargin + ", bottomHeight=" + this.bottomHeight + ")";
    }

    public final String getBackTipText() {
        return this.backTipText;
    }

    public final Boolean getBackTipVisible() {
        return this.backTipVisible;
    }

    public final Boolean getBackVisible() {
        return this.backVisible;
    }

    public final List<y> getBottomBarItems() {
        return this.bottomBarItems;
    }

    public final Integer getBottomHeight() {
        return this.bottomHeight;
    }

    public final Drawable getChooseMusicIcon() {
        return this.chooseMusicIcon;
    }

    public final String getChooseMusicText() {
        return this.chooseMusicText;
    }

    public final p getHideMoreEvent() {
        return this.hideMoreEvent;
    }

    public final List<y> getTitleBarItems() {
        return this.titleBarItems;
    }

    public final Integer getTopMargin() {
        return this.topMargin;
    }

    @Override // com.bytedance.ui_component.UiState
    public final a getUi() {
        return this.ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FTCEditToolbarState(a aVar, Boolean bool, Boolean bool2, String str, List<y> list, List<y> list2, p pVar, String str2, Drawable drawable, Integer num, Integer num2) {
        super(aVar);
        l.d(aVar, "");
        this.ui = aVar;
        this.backVisible = bool;
        this.backTipVisible = bool2;
        this.backTipText = str;
        this.titleBarItems = list;
        this.bottomBarItems = list2;
        this.hideMoreEvent = pVar;
        this.chooseMusicText = str2;
        this.chooseMusicIcon = drawable;
        this.topMargin = num;
        this.bottomHeight = num2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FTCEditToolbarState(a aVar, Boolean bool, Boolean bool2, String str, List list, List list2, p pVar, String str2, Drawable drawable, Integer num, Integer num2, int i2, g gVar) {
        this(aVar, (i2 & 2) != 0 ? null : bool, (i2 & 4) != 0 ? null : bool2, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : list2, (i2 & 64) != 0 ? null : pVar, (i2 & 128) != 0 ? null : str2, (i2 & 256) != 0 ? null : drawable, (i2 & 512) != 0 ? null : num, (i2 & 1024) == 0 ? num2 : null);
    }
}
