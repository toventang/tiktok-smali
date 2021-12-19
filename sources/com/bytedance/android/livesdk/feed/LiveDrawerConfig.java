package com.bytedance.android.livesdk.feed;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class LiveDrawerConfig implements Serializable {
    @c(a = "enable_drawer_cell_show_avatar")
    private final boolean drawerCellShowAvatar;
    @c(a = "enable_drawer_cell_show_name")
    private final boolean drawerCellShowName;
    @c(a = "enable_drawer_go_live_animation")
    private final boolean drawerGoLiveAnimation;
    @c(a = "drawer_refresh_interval")
    private final long drawerRefreshInterval = 1;
    @c(a = "enable_drawer_bottom_left_label")
    private final boolean enableDrawerBottomLeftLabel;
    @c(a = "enable_drawer_repeat_jump")
    private final boolean enableDrawerRepeatJump;
    @c(a = "enable_full_entrance")
    private final boolean enableFullEntrance;
    @c(a = "enable_guide_animation")
    private final boolean enableGuideAnimation;
    @c(a = "enable_return_btn")
    private final boolean enableReturnBtn;
    @c(a = "guide_animation_show_time")
    private final int guideAnimationShowTime = 20;
    @c(a = "guide_animation_total_count")
    private final int guideAnimationTotalCount = 5;
    @c(a = "enable_open_drawer_return")
    private final boolean openDrawerReturn = true;

    static {
        Covode.recordClassIndex(9560);
    }

    public final boolean getDrawerCellShowAvatar() {
        return this.drawerCellShowAvatar;
    }

    public final boolean getDrawerCellShowName() {
        return this.drawerCellShowName;
    }

    public final long getDrawerRefreshInterval() {
        return this.drawerRefreshInterval;
    }

    public final boolean getEnableDrawerRepeatJump() {
        return this.enableDrawerRepeatJump;
    }

    public final boolean getEnableFullEntrance() {
        return this.enableFullEntrance;
    }

    public final int getGuideAnimationShowTime() {
        return this.guideAnimationShowTime;
    }

    public final int getGuideAnimationTotalCount() {
        return this.guideAnimationTotalCount;
    }

    public final boolean enableDrawerBottomLeftLabel() {
        if (!this.enableDrawerBottomLeftLabel || !this.enableFullEntrance) {
            return false;
        }
        return true;
    }

    public final boolean enableGoLiveAnimation() {
        if (!this.drawerGoLiveAnimation || !this.enableFullEntrance) {
            return false;
        }
        return true;
    }

    public final boolean enableGuideAnimation() {
        if (!this.enableGuideAnimation || !this.enableFullEntrance) {
            return false;
        }
        return true;
    }

    public final boolean enableReturnBtn() {
        if (!this.enableReturnBtn || !this.enableFullEntrance) {
            return false;
        }
        return true;
    }

    public final boolean openDrawerReturn() {
        if (!this.openDrawerReturn || !this.enableFullEntrance) {
            return false;
        }
        return true;
    }
}
