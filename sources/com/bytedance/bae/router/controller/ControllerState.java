package com.bytedance.bae.router.controller;

import com.bytedance.covode.number.Covode;

interface ControllerState {
    static {
        Covode.recordClassIndex(15376);
    }

    int getState();

    void onEvent(int i2, int i3);
}
