package com.bytedance.bae.router.device.base;

import com.bytedance.covode.number.Covode;

public interface IAudioDeviceManager {

    public interface HotplugDeviceListener extends NotHotPlugableDeviceListener {
        static {
            Covode.recordClassIndex(15392);
        }

        void onDeviceOffline();

        void onDeviceOnline();
    }

    public interface IHotplugDevice extends HotplugDeviceListener {
        static {
            Covode.recordClassIndex(15393);
        }

        int getOnlineState();
    }

    public interface INotHotPlugableDevice extends NotHotPlugableDeviceListener {
        static {
            Covode.recordClassIndex(15394);
        }

        void activeDevice();

        int getActiveState();

        void inactiveDevice();

        boolean isActive();
    }

    public interface NotHotPlugableDeviceListener {
        static {
            Covode.recordClassIndex(15395);
        }
    }

    public interface OnHotPlugDeviceCallback extends HotplugDeviceListener, OnNotHotPlugableDeviceCallback {
        static {
            Covode.recordClassIndex(15396);
        }
    }

    public interface OnNotHotPlugableDeviceCallback extends NotHotPlugableDeviceListener {
        static {
            Covode.recordClassIndex(15397);
        }

        void onError(int i2, String str);
    }

    static {
        Covode.recordClassIndex(15390);
    }
}
