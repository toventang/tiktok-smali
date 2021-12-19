package com.ss.android.ugc.aweme.story.edit.business.shared.toolbar;

import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.p;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class StoryEditToolbarState extends UiState {
    private final Boolean backIconVisible;
    private final Integer bottomHeight;
    private final Drawable chooseMusicIcon;
    private final String chooseMusicText;
    private final Boolean isSoundMute;
    private final Boolean muteIconVisible;
    private final Boolean publishBtnVisible;
    private final p refresh;
    private final List<o> titleBarItems;
    private final Boolean toolbarVisible;
    private final Integer topMargin;
    private final a ui;

    static {
        Covode.recordClassIndex(89900);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.StoryEditToolbarState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StoryEditToolbarState copy$default(StoryEditToolbarState storyEditToolbarState, a aVar, List list, Integer num, Integer num2, p pVar, String str, Drawable drawable, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = storyEditToolbarState.getUi();
        }
        if ((i2 & 2) != 0) {
            list = storyEditToolbarState.titleBarItems;
        }
        if ((i2 & 4) != 0) {
            num = storyEditToolbarState.topMargin;
        }
        if ((i2 & 8) != 0) {
            num2 = storyEditToolbarState.bottomHeight;
        }
        if ((i2 & 16) != 0) {
            pVar = storyEditToolbarState.refresh;
        }
        if ((i2 & 32) != 0) {
            str = storyEditToolbarState.chooseMusicText;
        }
        if ((i2 & 64) != 0) {
            drawable = storyEditToolbarState.chooseMusicIcon;
        }
        if ((i2 & 128) != 0) {
            bool = storyEditToolbarState.backIconVisible;
        }
        if ((i2 & 256) != 0) {
            bool2 = storyEditToolbarState.toolbarVisible;
        }
        if ((i2 & 512) != 0) {
            bool3 = storyEditToolbarState.publishBtnVisible;
        }
        if ((i2 & 1024) != 0) {
            bool4 = storyEditToolbarState.isSoundMute;
        }
        if ((i2 & 2048) != 0) {
            bool5 = storyEditToolbarState.muteIconVisible;
        }
        return storyEditToolbarState.copy(aVar, list, num, num2, pVar, str, drawable, bool, bool2, bool3, bool4, bool5);
    }

    public final a component1() {
        return getUi();
    }

    public final Boolean component10() {
        return this.publishBtnVisible;
    }

    public final Boolean component11() {
        return this.isSoundMute;
    }

    public final Boolean component12() {
        return this.muteIconVisible;
    }

    public final List<o> component2() {
        return this.titleBarItems;
    }

    public final Integer component3() {
        return this.topMargin;
    }

    public final Integer component4() {
        return this.bottomHeight;
    }

    public final p component5() {
        return this.refresh;
    }

    public final String component6() {
        return this.chooseMusicText;
    }

    public final Drawable component7() {
        return this.chooseMusicIcon;
    }

    public final Boolean component8() {
        return this.backIconVisible;
    }

    public final Boolean component9() {
        return this.toolbarVisible;
    }

    public final StoryEditToolbarState copy(a aVar, List<o> list, Integer num, Integer num2, p pVar, String str, Drawable drawable, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        l.d(aVar, "");
        return new StoryEditToolbarState(aVar, list, num, num2, pVar, str, drawable, bool, bool2, bool3, bool4, bool5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryEditToolbarState)) {
            return false;
        }
        StoryEditToolbarState storyEditToolbarState = (StoryEditToolbarState) obj;
        return l.a(getUi(), storyEditToolbarState.getUi()) && l.a(this.titleBarItems, storyEditToolbarState.titleBarItems) && l.a(this.topMargin, storyEditToolbarState.topMargin) && l.a(this.bottomHeight, storyEditToolbarState.bottomHeight) && l.a(this.refresh, storyEditToolbarState.refresh) && l.a(this.chooseMusicText, storyEditToolbarState.chooseMusicText) && l.a(this.chooseMusicIcon, storyEditToolbarState.chooseMusicIcon) && l.a(this.backIconVisible, storyEditToolbarState.backIconVisible) && l.a(this.toolbarVisible, storyEditToolbarState.toolbarVisible) && l.a(this.publishBtnVisible, storyEditToolbarState.publishBtnVisible) && l.a(this.isSoundMute, storyEditToolbarState.isSoundMute) && l.a(this.muteIconVisible, storyEditToolbarState.muteIconVisible);
    }

    public final int hashCode() {
        a ui2 = getUi();
        int i2 = 0;
        int hashCode = (ui2 != null ? ui2.hashCode() : 0) * 31;
        List<o> list = this.titleBarItems;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Integer num = this.topMargin;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.bottomHeight;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        p pVar = this.refresh;
        int hashCode5 = (hashCode4 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        String str = this.chooseMusicText;
        int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 31;
        Drawable drawable = this.chooseMusicIcon;
        int hashCode7 = (hashCode6 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Boolean bool = this.backIconVisible;
        int hashCode8 = (hashCode7 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.toolbarVisible;
        int hashCode9 = (hashCode8 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.publishBtnVisible;
        int hashCode10 = (hashCode9 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.isSoundMute;
        int hashCode11 = (hashCode10 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Boolean bool5 = this.muteIconVisible;
        if (bool5 != null) {
            i2 = bool5.hashCode();
        }
        return hashCode11 + i2;
    }

    public final String toString() {
        return "StoryEditToolbarState(ui=" + getUi() + ", titleBarItems=" + this.titleBarItems + ", topMargin=" + this.topMargin + ", bottomHeight=" + this.bottomHeight + ", refresh=" + this.refresh + ", chooseMusicText=" + this.chooseMusicText + ", chooseMusicIcon=" + this.chooseMusicIcon + ", backIconVisible=" + this.backIconVisible + ", toolbarVisible=" + this.toolbarVisible + ", publishBtnVisible=" + this.publishBtnVisible + ", isSoundMute=" + this.isSoundMute + ", muteIconVisible=" + this.muteIconVisible + ")";
    }

    public final Boolean getBackIconVisible() {
        return this.backIconVisible;
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

    public final Boolean getMuteIconVisible() {
        return this.muteIconVisible;
    }

    public final Boolean getPublishBtnVisible() {
        return this.publishBtnVisible;
    }

    public final p getRefresh() {
        return this.refresh;
    }

    public final List<o> getTitleBarItems() {
        return this.titleBarItems;
    }

    public final Boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    public final Integer getTopMargin() {
        return this.topMargin;
    }

    @Override // com.bytedance.ui_component.UiState
    public final a getUi() {
        return this.ui;
    }

    public final Boolean isSoundMute() {
        return this.isSoundMute;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryEditToolbarState(a aVar, List<o> list, Integer num, Integer num2, p pVar, String str, Drawable drawable, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        super(aVar);
        l.d(aVar, "");
        this.ui = aVar;
        this.titleBarItems = list;
        this.topMargin = num;
        this.bottomHeight = num2;
        this.refresh = pVar;
        this.chooseMusicText = str;
        this.chooseMusicIcon = drawable;
        this.backIconVisible = bool;
        this.toolbarVisible = bool2;
        this.publishBtnVisible = bool3;
        this.isSoundMute = bool4;
        this.muteIconVisible = bool5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoryEditToolbarState(a aVar, List list, Integer num, Integer num2, p pVar, String str, Drawable drawable, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, int i2, g gVar) {
        this(aVar, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : num2, (i2 & 16) != 0 ? null : pVar, (i2 & 32) != 0 ? null : str, (i2 & 64) != 0 ? null : drawable, (i2 & 128) != 0 ? null : bool, (i2 & 256) != 0 ? null : bool2, (i2 & 512) != 0 ? null : bool3, (i2 & 1024) != 0 ? null : bool4, (i2 & 2048) == 0 ? bool5 : null);
    }
}
