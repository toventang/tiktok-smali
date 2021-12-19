package com.bytedance.bae.router.device.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.bytedance.bae.router.device.base.IAudioDeviceManager;
import com.bytedance.bae.router.receiver.base.BaseAudioDeviceBroadcastReceiver;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;

public abstract class BaseHotplugAudioDeviceManager extends BaseAudioDeviceManager implements IAudioDeviceManager.IHotplugDevice {
    private BaseAudioDeviceBroadcastReceiver mBroadcastReceiver;
    protected IAudioDeviceManager.OnHotPlugDeviceCallback mCallback;
    protected int mOnlineState;

    static {
        Covode.recordClassIndex(15389);
    }

    private void setDeviceOffline() {
        this.mOnlineState = 1;
    }

    private void setDeviceOnline() {
        this.mOnlineState = 2;
    }

    /* access modifiers changed from: protected */
    public abstract IntentFilter getBroadcastIntentFilter();

    /* access modifiers changed from: protected */
    public abstract BaseAudioDeviceBroadcastReceiver getBroadcastReceiver();

    /* access modifiers changed from: protected */
    public abstract void onStickyIntentFoundWhenRegister(Intent intent);

    public void destory() {
        onDestroy();
    }

    @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.IHotplugDevice
    public int getOnlineState() {
        return this.mOnlineState;
    }

    public void onDestroy() {
        unRegisterReceiver();
    }

    @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.HotplugDeviceListener
    public void onDeviceOffline() {
        setDeviceOffline();
        this.mCallback.onDeviceOffline();
    }

    @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.HotplugDeviceListener
    public void onDeviceOnline() {
        setDeviceOnline();
        this.mCallback.onDeviceOnline();
    }

    private void unRegisterReceiver() {
        BaseAudioDeviceBroadcastReceiver baseAudioDeviceBroadcastReceiver;
        Context context = getContext();
        if (context != null && (baseAudioDeviceBroadcastReceiver = this.mBroadcastReceiver) != null && baseAudioDeviceBroadcastReceiver.getRegistered()) {
            context.unregisterReceiver(this.mBroadcastReceiver);
            this.mBroadcastReceiver.setRegistered(false);
        }
    }

    public void registerReceiver() {
        Context context = getContext();
        if (context != null && !this.mBroadcastReceiver.getRegistered()) {
            Intent com_bytedance_bae_router_device_base_BaseHotplugAudioDeviceManager_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver = com_bytedance_bae_router_device_base_BaseHotplugAudioDeviceManager_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver(context, this.mBroadcastReceiver, getBroadcastIntentFilter(), null, null);
            this.mBroadcastReceiver.setRegistered(true);
            if (com_bytedance_bae_router_device_base_BaseHotplugAudioDeviceManager_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver != null) {
                onStickyIntentFoundWhenRegister(com_bytedance_bae_router_device_base_BaseHotplugAudioDeviceManager_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver);
            }
        }
    }

    public BaseHotplugAudioDeviceManager(Context context, IAudioDeviceManager.OnHotPlugDeviceCallback onHotPlugDeviceCallback) {
        this(context, onHotPlugDeviceCallback, false);
    }

    public BaseHotplugAudioDeviceManager(Context context, IAudioDeviceManager.OnHotPlugDeviceCallback onHotPlugDeviceCallback, boolean z) {
        super(context, onHotPlugDeviceCallback);
        this.mCallback = onHotPlugDeviceCallback;
        this.mBroadcastReceiver = getBroadcastReceiver();
        if (z) {
            registerReceiver();
        }
    }

    public static Intent com_bytedance_bae_router_device_base_BaseHotplugAudioDeviceManager_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter, str, handler);
            }
            throw e2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.c.a.a.a.b.a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent com_bytedance_bae_router_device_base_BaseHotplugAudioDeviceManager_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3, java.lang.String r4, android.os.Handler r5) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
            com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
            android.content.Intent r0 = com_bytedance_bae_router_device_base_BaseHotplugAudioDeviceManager_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3, r4, r5)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.c.a.a.a.b.a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bae.router.device.base.BaseHotplugAudioDeviceManager.com_bytedance_bae_router_device_base_BaseHotplugAudioDeviceManager_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter, java.lang.String, android.os.Handler):android.content.Intent");
    }
}
