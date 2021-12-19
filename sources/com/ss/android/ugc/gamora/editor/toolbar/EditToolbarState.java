package com.ss.android.ugc.gamora.editor.toolbar;

import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.m;
import com.bytedance.jedi.arch.p;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.gamora.editor.y;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class EditToolbarState extends UiState {
    private final a autoEnhanceStatus;
    private final String backTipText;
    private final Boolean backTipVisible;
    private final Boolean backVisible;
    private final List<y> bottomBarItems;
    private final Integer bottomHeight;
    private final Boolean captionStatus;
    private final Drawable chooseMusicIcon;
    private final String chooseMusicText;
    private final p hideMoreEvent;
    private final m musicChooseState;
    private final p refresh;
    private final p refreshAudioEnhanceIcon;
    private final List<y> titleBarItems;
    private final Integer topMargin;
    private final a ui;

    static {
        Covode.recordClassIndex(96799);
    }

    public static /* synthetic */ EditToolbarState copy$default(EditToolbarState editToolbarState, a aVar, Boolean bool, Boolean bool2, String str, List list, List list2, p pVar, String str2, Drawable drawable, Integer num, Integer num2, p pVar2, p pVar3, m mVar, a aVar2, Boolean bool3, int i2, Object obj) {
        a aVar3 = aVar;
        Boolean bool4 = bool;
        List list3 = list;
        String str3 = str;
        Boolean bool5 = bool2;
        String str4 = str2;
        p pVar4 = pVar;
        List list4 = list2;
        Integer num3 = num2;
        Integer num4 = num;
        Drawable drawable2 = drawable;
        m mVar2 = mVar;
        p pVar5 = pVar3;
        p pVar6 = pVar2;
        Boolean bool6 = bool3;
        a aVar4 = aVar2;
        if ((i2 & 1) != 0) {
            aVar3 = editToolbarState.getUi();
        }
        if ((i2 & 2) != 0) {
            bool4 = editToolbarState.backVisible;
        }
        if ((i2 & 4) != 0) {
            bool5 = editToolbarState.backTipVisible;
        }
        if ((i2 & 8) != 0) {
            str3 = editToolbarState.backTipText;
        }
        if ((i2 & 16) != 0) {
            list3 = editToolbarState.titleBarItems;
        }
        if ((i2 & 32) != 0) {
            list4 = editToolbarState.bottomBarItems;
        }
        if ((i2 & 64) != 0) {
            pVar4 = editToolbarState.hideMoreEvent;
        }
        if ((i2 & 128) != 0) {
            str4 = editToolbarState.chooseMusicText;
        }
        if ((i2 & 256) != 0) {
            drawable2 = editToolbarState.chooseMusicIcon;
        }
        if ((i2 & 512) != 0) {
            num4 = editToolbarState.topMargin;
        }
        if ((i2 & 1024) != 0) {
            num3 = editToolbarState.bottomHeight;
        }
        if ((i2 & 2048) != 0) {
            pVar6 = editToolbarState.refresh;
        }
        if ((i2 & 4096) != 0) {
            pVar5 = editToolbarState.refreshAudioEnhanceIcon;
        }
        if ((i2 & 8192) != 0) {
            mVar2 = editToolbarState.musicChooseState;
        }
        if ((i2 & 16384) != 0) {
            aVar4 = editToolbarState.autoEnhanceStatus;
        }
        if ((i2 & 32768) != 0) {
            bool6 = editToolbarState.captionStatus;
        }
        return editToolbarState.copy(aVar3, bool4, bool5, str3, list3, list4, pVar4, str4, drawable2, num4, num3, pVar6, pVar5, mVar2, aVar4, bool6);
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

    public final p component12() {
        return this.refresh;
    }

    public final p component13() {
        return this.refreshAudioEnhanceIcon;
    }

    public final m component14() {
        return this.musicChooseState;
    }

    public final a component15() {
        return this.autoEnhanceStatus;
    }

    public final Boolean component16() {
        return this.captionStatus;
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

    public final EditToolbarState copy(a aVar, Boolean bool, Boolean bool2, String str, List<y> list, List<y> list2, p pVar, String str2, Drawable drawable, Integer num, Integer num2, p pVar2, p pVar3, m mVar, a aVar2, Boolean bool3) {
        l.d(aVar, "");
        return new EditToolbarState(aVar, bool, bool2, str, list, list2, pVar, str2, drawable, num, num2, pVar2, pVar3, mVar, aVar2, bool3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditToolbarState)) {
            return false;
        }
        EditToolbarState editToolbarState = (EditToolbarState) obj;
        return l.a(getUi(), editToolbarState.getUi()) && l.a(this.backVisible, editToolbarState.backVisible) && l.a(this.backTipVisible, editToolbarState.backTipVisible) && l.a(this.backTipText, editToolbarState.backTipText) && l.a(this.titleBarItems, editToolbarState.titleBarItems) && l.a(this.bottomBarItems, editToolbarState.bottomBarItems) && l.a(this.hideMoreEvent, editToolbarState.hideMoreEvent) && l.a(this.chooseMusicText, editToolbarState.chooseMusicText) && l.a(this.chooseMusicIcon, editToolbarState.chooseMusicIcon) && l.a(this.topMargin, editToolbarState.topMargin) && l.a(this.bottomHeight, editToolbarState.bottomHeight) && l.a(this.refresh, editToolbarState.refresh) && l.a(this.refreshAudioEnhanceIcon, editToolbarState.refreshAudioEnhanceIcon) && l.a(this.musicChooseState, editToolbarState.musicChooseState) && l.a(this.autoEnhanceStatus, editToolbarState.autoEnhanceStatus) && l.a(this.captionStatus, editToolbarState.captionStatus);
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
        int hashCode11 = (hashCode10 + (num2 != null ? num2.hashCode() : 0)) * 31;
        p pVar2 = this.refresh;
        int hashCode12 = (hashCode11 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        p pVar3 = this.refreshAudioEnhanceIcon;
        int hashCode13 = (hashCode12 + (pVar3 != null ? pVar3.hashCode() : 0)) * 31;
        m mVar = this.musicChooseState;
        int hashCode14 = (hashCode13 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        a aVar = this.autoEnhanceStatus;
        int hashCode15 = (hashCode14 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Boolean bool3 = this.captionStatus;
        if (bool3 != null) {
            i2 = bool3.hashCode();
        }
        return hashCode15 + i2;
    }

    public final String toString() {
        return "EditToolbarState(ui=" + getUi() + ", backVisible=" + this.backVisible + ", backTipVisible=" + this.backTipVisible + ", backTipText=" + this.backTipText + ", titleBarItems=" + this.titleBarItems + ", bottomBarItems=" + this.bottomBarItems + ", hideMoreEvent=" + this.hideMoreEvent + ", chooseMusicText=" + this.chooseMusicText + ", chooseMusicIcon=" + this.chooseMusicIcon + ", topMargin=" + this.topMargin + ", bottomHeight=" + this.bottomHeight + ", refresh=" + this.refresh + ", refreshAudioEnhanceIcon=" + this.refreshAudioEnhanceIcon + ", musicChooseState=" + this.musicChooseState + ", autoEnhanceStatus=" + this.autoEnhanceStatus + ", captionStatus=" + this.captionStatus + ")";
    }

    public final a getAutoEnhanceStatus() {
        return this.autoEnhanceStatus;
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

    public final Boolean getCaptionStatus() {
        return this.captionStatus;
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

    public final m getMusicChooseState() {
        return this.musicChooseState;
    }

    public final p getRefresh() {
        return this.refresh;
    }

    public final p getRefreshAudioEnhanceIcon() {
        return this.refreshAudioEnhanceIcon;
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
    public EditToolbarState(a aVar, Boolean bool, Boolean bool2, String str, List<y> list, List<y> list2, p pVar, String str2, Drawable drawable, Integer num, Integer num2, p pVar2, p pVar3, m mVar, a aVar2, Boolean bool3) {
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
        this.refresh = pVar2;
        this.refreshAudioEnhanceIcon = pVar3;
        this.musicChooseState = mVar;
        this.autoEnhanceStatus = aVar2;
        this.captionStatus = bool3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditToolbarState(a aVar, Boolean bool, Boolean bool2, String str, List list, List list2, p pVar, String str2, Drawable drawable, Integer num, Integer num2, p pVar2, p pVar3, m mVar, a aVar2, Boolean bool3, int i2, g gVar) {
        this(aVar, (i2 & 2) != 0 ? null : bool, (i2 & 4) != 0 ? null : bool2, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : list2, (i2 & 64) != 0 ? null : pVar, (i2 & 128) != 0 ? null : str2, (i2 & 256) != 0 ? null : drawable, (i2 & 512) != 0 ? null : num, (i2 & 1024) != 0 ? null : num2, (i2 & 2048) != 0 ? null : pVar2, (i2 & 4096) != 0 ? null : pVar3, (i2 & 8192) != 0 ? null : mVar, (i2 & 16384) != 0 ? null : aVar2, (i2 & 32768) == 0 ? bool3 : null);
    }
}
