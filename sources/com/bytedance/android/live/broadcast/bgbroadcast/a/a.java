package com.bytedance.android.live.broadcast.bgbroadcast.a;

import com.bytedance.covode.number.Covode;

public enum a {
    CMD_SNAPPED_TIMER_ENDED,
    CMD_HIDE_MSG_WINDOW,
    CMD_ORIENTATION_CHANGED,
    CMD_NEW_COMMON_MSG,
    CMD_NEW_REMIND_MSG,
    CMD_READ_REMIND_MSG,
    CMD_CLICK_FLOAT_BALL,
    CMD_CLICK_MSG_BTN_CHECKED,
    CMD_CLICK_MSG_BTN_UNCHECKED,
    CMD_CTRL_MENU_COLLAPSE,
    CMD_DRAG_MOVE_START,
    CMD_DRAG_ONGOING,
    CMD_DRAG_MOVE_END,
    CMD_TRANSITION_TO_INIT,
    CMD_TRANSITION_TO_HIDDEN,
    CMD_TRANSITION_TO_DESTROY,
    CMD_TRANSITION_TO_FLOATING;
    
    private Object param;

    static {
        Covode.recordClassIndex(3748);
    }

    public final Object getParam() {
        return this.param;
    }

    public final void setParam(Object obj) {
        this.param = obj;
    }
}
