package com.bytedance.globalpayment.iap.google.helper;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.globalpayment.iap.a.b;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.google.c.a;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.payment.common.lib.j.e;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import com.bytedance.globalpayment.service.manager.iap.google.RestoreGoogleOrderService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class RestoreOrderService implements WeakHandler.IHandler, RestoreGoogleOrderService {
    private static volatile RestoreOrderService ins;
    private final int MSG_WHAT_ADD_NEW_ORDER = 103;
    private final int MSG_WHAT_REMOVE_ORDER = 104;
    private final int MSG_WHAT_RESTORE_ORDER = 102;
    private final int MSG_WHAT_START_MONITOR_GP_CALLBACK = 101;
    private final String TAG = "RestoreOrderService";
    private final String THREAD_NAME = "restore_order_thread";
    private b mBillingQueryListener = new b() {
        /* class com.bytedance.globalpayment.iap.google.helper.RestoreOrderService.AnonymousClass2 */

        static {
            Covode.recordClassIndex(17648);
        }

        @Override // com.bytedance.globalpayment.iap.a.b
        public final void onQueryFinished(IapPaymentMethod iapPaymentMethod, AbsResult absResult, List<AbsIapChannelOrderData> list) {
            Object obj;
            RestoreOrderService restoreOrderService = RestoreOrderService.this;
            StringBuilder append = new StringBuilder("onQueryFinished: payResult.ResultCode is ").append(absResult.getCode()).append(" purchases size is ");
            if (list != null) {
                obj = Integer.valueOf(list.size());
            } else {
                obj = "0";
            }
            restoreOrderService.showLog(append.append(obj).toString());
            if (absResult.getCode() == 0 && list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list.toArray()) {
                    AbsIapChannelOrderData absIapChannelOrderData = (AbsIapChannelOrderData) obj2;
                    String selfOrderId = absIapChannelOrderData.getSelfOrderId();
                    if (!TextUtils.isEmpty(selfOrderId)) {
                        arrayList.add(selfOrderId);
                        if (RestoreOrderService.this.mProcessingOrders.contains(selfOrderId) || absIapChannelOrderData.getOrderState() == 2) {
                            RestoreOrderService.this.showLog("onQueryFinished: " + selfOrderId + " state is pending");
                            if (!RestoreOrderService.this.mNeedRestoreOrderMap.containsKey(selfOrderId)) {
                                RestoreOrderService.this.mWeakHandler.sendMessage(RestoreOrderService.this.mWeakHandler.obtainMessage(103, selfOrderId));
                            }
                        } else {
                            RestoreOrderService.this.showLog("onQueryFinished: " + selfOrderId + " state is not pending, start extra upload token");
                            RestoreOrderService.this.mProcessingOrders.add(selfOrderId);
                            PaymentServiceManager.get().getIapExternalService().executeUnUploadTokenOrder(IapPaymentMethod.GOOGLE, absIapChannelOrderData);
                        }
                    } else if (absIapChannelOrderData instanceof a) {
                        RestoreOrderService.this.showLog("onQueryFinished: selfOrderId is empty , not normal pipo order,not restore , purchase.getOriginalJson() is " + absIapChannelOrderData.getOriginalJson());
                    }
                }
                HashSet hashSet = new HashSet();
                for (String str : RestoreOrderService.this.mNeedRestoreOrderMap.keySet()) {
                    if (!arrayList.contains(str)) {
                        hashSet.add(str);
                    }
                }
                for (Object obj3 : hashSet) {
                    RestoreOrderService.this.showLog("onQueryFinished: adjust mNeedRestoreOrderMap with purchases and remove ".concat(String.valueOf(obj3)));
                    RestoreOrderService.this.mWeakHandler.sendMessage(RestoreOrderService.this.mWeakHandler.obtainMessage(104, obj3));
                }
            }
            RestoreOrderService.this.mWeakHandler.sendEmptyMessageDelayed(102, RestoreOrderService.this.mRestoreOrderIntervalInMill);
        }
    };
    private Context mContext;
    private boolean mEnableRestoreOrder;
    private Set<String> mHasCalledBackOrders;
    private AtomicBoolean mHasInitEd;
    private long mMaxRestoreOrderTimeInMill;
    public Map<String, Long> mNeedRestoreOrderMap;
    public Set<String> mProcessingOrders;
    public long mRestoreOrderIntervalInMill;
    private long mTryToStartRestoreTaskDelayAfterGpDismissInMill;
    public WeakHandler mWeakHandler;

    static {
        Covode.recordClassIndex(17646);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.RestoreGoogleOrderService
    public boolean isEnableRestoreOrder() {
        return this.mEnableRestoreOrder;
    }

    public void updateSettings() {
        initOnlineSettings(false);
    }

    private void checkThread() {
        if (com.bytedance.globalpayment.payment.common.lib.h.a.a().i().a() && !TextUtils.equals(Thread.currentThread().getName(), "restore_order_thread")) {
            throw new RuntimeException("function run on a error thread!");
        }
    }

    public void init() {
        if (this.mHasInitEd.compareAndSet(false, true)) {
            checkThread();
            String a2 = com.bytedance.globalpayment.payment.common.lib.h.a.a().h().c().a();
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(a2)) {
                for (String str : a2.split(",")) {
                    String[] split = str.split(":");
                    if (split.length == 2) {
                        hashMap.put(split[0], Long.valueOf(split[1]));
                    }
                }
            }
            this.mNeedRestoreOrderMap = hashMap;
            this.mHasCalledBackOrders = new HashSet();
            this.mProcessingOrders = new HashSet();
            Looper.prepare();
            this.mWeakHandler = new WeakHandler(Looper.myLooper(), this);
            initOnlineSettings(true);
            showLog("init RestoreOrderService, mEnableRestoreOrder is " + this.mEnableRestoreOrder + " mTryToStartRestoreTaskDelayAfterGpDismissInMill is " + this.mTryToStartRestoreTaskDelayAfterGpDismissInMill + " mRestoreOrderIntervalInMill is " + this.mRestoreOrderIntervalInMill + " mMaxRestoreOrderTimeInMill is " + this.mMaxRestoreOrderTimeInMill + " mNeedRestoreOrderMap is " + com.bytedance.globalpayment.payment.common.lib.h.a.a().h().c().a());
            Looper.loop();
        }
    }

    private void onFinishedTokenUploadInHandlerThread(String str) {
        checkThread();
        removeOrderInHandlerThread(str);
    }

    public void showLog(String str) {
        Thread.currentThread().getName();
        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
    }

    private void onGpCallbackTimeOutInHandlerThread(String str) {
        checkThread();
        if (!this.mNeedRestoreOrderMap.containsKey(str)) {
            addOrderInHandlerThread(str);
            this.mWeakHandler.sendEmptyMessage(102);
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.RestoreGoogleOrderService
    public void onFailedFinishedTokenUpload(String str) {
        Set<String> set;
        if (this.mEnableRestoreOrder && (set = this.mProcessingOrders) != null) {
            set.remove(str);
            WeakHandler weakHandler = this.mWeakHandler;
            weakHandler.sendMessageDelayed(weakHandler.obtainMessage(102, true), this.mRestoreOrderIntervalInMill);
        }
    }

    private RestoreOrderService(Context context) {
        this.mContext = context;
        this.mHasInitEd = new AtomicBoolean(false);
        new Thread(new Runnable() {
            /* class com.bytedance.globalpayment.iap.google.helper.RestoreOrderService.AnonymousClass1 */

            static {
                Covode.recordClassIndex(17647);
            }

            public final void run() {
                RestoreOrderService.this.init();
            }
        }, "restore_order_thread").start();
    }

    private void addOrderInHandlerThread(String str) {
        checkThread();
        this.mNeedRestoreOrderMap.put(str, Long.valueOf(SystemClock.uptimeMillis()));
        com.bytedance.globalpayment.payment.common.lib.h.a.a().h().c().a(e.a(this.mNeedRestoreOrderMap));
    }

    public static RestoreOrderService getIns(Context context) {
        MethodCollector.i(9244);
        if (ins == null) {
            synchronized (RestoreOrderService.class) {
                try {
                    if (ins == null) {
                        ins = new RestoreOrderService(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9244);
                    throw th;
                }
            }
        }
        RestoreOrderService restoreOrderService = ins;
        MethodCollector.o(9244);
        return restoreOrderService;
    }

    private void removeOrderInHandlerThread(String str) {
        checkThread();
        if (this.mNeedRestoreOrderMap.remove(str) != null) {
            com.bytedance.globalpayment.payment.common.lib.h.a.a().h().c().a(e.a(this.mNeedRestoreOrderMap));
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.RestoreGoogleOrderService
    public void onSuccessFinishedTokenUpload(String str) {
        if (this.mEnableRestoreOrder) {
            showLog("onFinishedTokenUpload: " + str + " remove it from restoreOrders");
            WeakHandler weakHandler = this.mWeakHandler;
            weakHandler.sendMessage(weakHandler.obtainMessage(104, str));
        }
    }

    private void doRestoreOrderInHandlerThread(boolean z) {
        if (z || !this.mNeedRestoreOrderMap.isEmpty()) {
            showLog("doRestoreOrderInHandlerThread: mNeedRestoreOrderMap.size()  is " + this.mNeedRestoreOrderMap.size() + " forceQuery is " + z + " do restore");
            com.bytedance.globalpayment.iap.google.a.a().a(this.mBillingQueryListener);
            return;
        }
        showLog("doRestoreOrderInHandlerThread: mNeedRestoreOrderMap is empty, stop restore");
    }

    private void initOnlineSettings(boolean z) {
        if (this.mHasInitEd.get() || z) {
            boolean z2 = this.mEnableRestoreOrder;
            this.mTryToStartRestoreTaskDelayAfterGpDismissInMill = com.bytedance.globalpayment.payment.common.lib.h.a.a().h().e();
            this.mRestoreOrderIntervalInMill = com.bytedance.globalpayment.payment.common.lib.h.a.a().h().f();
            this.mMaxRestoreOrderTimeInMill = com.bytedance.globalpayment.payment.common.lib.h.a.a().h().i();
            boolean d2 = com.bytedance.globalpayment.payment.common.lib.h.a.a().h().d();
            this.mEnableRestoreOrder = d2;
            if (!z2 && d2) {
                showLog("[init] start restore");
                WeakHandler weakHandler = this.mWeakHandler;
                weakHandler.sendMessage(weakHandler.obtainMessage(102, true));
            }
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (this.mEnableRestoreOrder) {
            if (message.what == 101) {
                showLog("handle Msg for MSG_WHAT_START_MONITOR_GP_CALLBACK");
                onGpCallbackTimeOutInHandlerThread((String) message.obj);
            } else if (message.what == 102) {
                showLog("handle Msg for MSG_WHAT_RESTORE_ORDER");
                boolean z = false;
                if (message.obj instanceof Boolean) {
                    z = ((Boolean) message.obj).booleanValue();
                }
                doRestoreOrderInHandlerThread(z);
            } else if (message.what == 103) {
                showLog("handle Msg for MSG_WHAT_ADD_NEW_ORDER");
                addOrderInHandlerThread((String) message.obj);
            } else if (message.what == 104) {
                showLog("handle Msg for MSG_WHAT_REMOVE_ORDER");
                onFinishedTokenUploadInHandlerThread((String) message.obj);
            }
        }
    }

    public void onGoogleCallback(AbsIapChannelOrderData absIapChannelOrderData) {
        if (this.mEnableRestoreOrder) {
            String selfOrderId = absIapChannelOrderData.getSelfOrderId();
            if (absIapChannelOrderData.getOrderState() != 2) {
                showLog("onGoogleCallback: " + selfOrderId + " purchase state is not pending ,remove add restore delay task");
                this.mHasCalledBackOrders.add(selfOrderId);
                this.mWeakHandler.removeMessages(101, selfOrderId);
                return;
            }
            showLog("onGoogleCallback: " + selfOrderId + " purchase state is pending ,try add it to unfinished order map");
            this.mWeakHandler.removeMessages(103, selfOrderId);
        }
    }

    public void onGooglePanelDismiss(OrderData orderData) {
        showLog("onGooglePanelDismiss: " + orderData.getOrderId());
        if (this.mEnableRestoreOrder) {
            if (this.mHasCalledBackOrders.contains(orderData.getOrderId())) {
                showLog("onGooglePanelDismiss: order has callback ,do noting");
                return;
            }
            this.mWeakHandler.sendMessageDelayed(this.mWeakHandler.obtainMessage(101, orderData.getOrderId()), this.mTryToStartRestoreTaskDelayAfterGpDismissInMill);
        }
    }
}
