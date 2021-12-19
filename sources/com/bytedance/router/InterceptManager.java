package com.bytedance.router;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.router.interceptor.IInterceptorProvider;
import com.bytedance.router.interceptor.RewriteManager;
import com.bytedance.router.mapping.SmartRouterInterceptor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class InterceptManager {
    private IInterceptorProvider interceptorProvider;
    private Map<String, IInterceptor> mAssignInterceptors = new HashMap();
    private volatile boolean mInterceptorProviderIsInited;
    private List<IInterceptor> mInterceptors = new LinkedList();
    private AtomicBoolean mIsInited = new AtomicBoolean(false);
    private List<IInterceptor> mLastInterceptors = new LinkedList();
    private RewriteManager mRewriteManager;
    private SmartRouterInterceptor mSmartRouterInterceptor;

    static {
        Covode.recordClassIndex(26106);
    }

    public RewriteManager getRewriteManager() {
        return this.mRewriteManager;
    }

    public InterceptManager() {
        if (this.mRewriteManager == null) {
            this.mRewriteManager = new RewriteManager();
        }
        this.mInterceptors.add(this.mRewriteManager);
        this.mSmartRouterInterceptor = new SmartRouterInterceptor();
    }

    public void initInterceptors() {
        if (!this.mIsInited.get()) {
            ArrayList arrayList = new ArrayList();
            this.mSmartRouterInterceptor.initInterceptors(arrayList);
            this.mInterceptors.addAll(arrayList);
            HashMap hashMap = new HashMap();
            this.mSmartRouterInterceptor.initAssignInterceptors(hashMap);
            this.mAssignInterceptors.putAll(hashMap);
        }
        this.mIsInited.set(true);
    }

    public void addInterceptorProvider(IInterceptorProvider iInterceptorProvider) {
        if (iInterceptorProvider != null) {
            this.interceptorProvider = iInterceptorProvider;
        }
    }

    public void addInterceptor(IInterceptor iInterceptor) {
        MethodCollector.i(11447);
        if (iInterceptor == null) {
            MethodCollector.o(11447);
            return;
        }
        synchronized (this) {
            try {
                this.mInterceptors.add(iInterceptor);
            } finally {
                MethodCollector.o(11447);
            }
        }
    }

    public void addLastInterceptor(IInterceptor iInterceptor) {
        MethodCollector.i(11454);
        if (iInterceptor == null) {
            MethodCollector.o(11454);
            return;
        }
        synchronized (this) {
            try {
                this.mLastInterceptors.add(iInterceptor);
            } finally {
                MethodCollector.o(11454);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean whetherIntercept(String str) {
        MethodCollector.i(14459);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(14459);
            return false;
        }
        synchronized (this) {
            try {
                if (!this.mInterceptorProviderIsInited) {
                    IInterceptorProvider iInterceptorProvider = this.interceptorProvider;
                    if (iInterceptorProvider != null) {
                        this.mInterceptors.addAll(iInterceptorProvider.getInterceptors());
                    }
                    this.mInterceptorProviderIsInited = true;
                }
                RouteIntent build = new RouteIntent.Builder(str).build();
                for (IInterceptor iInterceptor : this.mInterceptors) {
                    if (iInterceptor.matchInterceptRules(build)) {
                        return true;
                    }
                }
                for (IInterceptor iInterceptor2 : this.mLastInterceptors) {
                    if (iInterceptor2.matchInterceptRules(build)) {
                        MethodCollector.o(14459);
                        return true;
                    }
                }
                MethodCollector.o(14459);
                return false;
            } finally {
                MethodCollector.o(14459);
            }
        }
    }

    public void addAssignInterceptor(String str, IInterceptor iInterceptor) {
        MethodCollector.i(11629);
        if (TextUtils.isEmpty(str) || iInterceptor == null) {
            MethodCollector.o(11629);
            return;
        }
        synchronized (this) {
            try {
                this.mAssignInterceptors.put(str, iInterceptor);
            } finally {
                MethodCollector.o(11629);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean processRouteIntent(Context context, RouteIntent routeIntent) {
        MethodCollector.i(11790);
        if (routeIntent == null) {
            MethodCollector.o(11790);
            return true;
        }
        synchronized (this) {
            try {
                if (!this.mInterceptorProviderIsInited) {
                    IInterceptorProvider iInterceptorProvider = this.interceptorProvider;
                    if (iInterceptorProvider != null) {
                        this.mInterceptors.addAll(iInterceptorProvider.getInterceptors());
                    }
                    this.mInterceptorProviderIsInited = true;
                }
                for (IInterceptor iInterceptor : this.mInterceptors) {
                    if (iInterceptor.matchInterceptRules(routeIntent) && iInterceptor.onInterceptRoute(context, routeIntent)) {
                        return true;
                    }
                }
                for (IInterceptor iInterceptor2 : this.mLastInterceptors) {
                    if (iInterceptor2.matchInterceptRules(routeIntent) && iInterceptor2.onInterceptRoute(context, routeIntent)) {
                        MethodCollector.o(11790);
                        return true;
                    }
                }
                MethodCollector.o(11790);
                return false;
            } finally {
                MethodCollector.o(11790);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean processAssignInterceptor(Context context, List<String> list, RouteIntent routeIntent) {
        MethodCollector.i(14442);
        if (routeIntent == null) {
            MethodCollector.o(14442);
            return true;
        }
        synchronized (this) {
            try {
                for (String str : list) {
                    IInterceptor iInterceptor = this.mAssignInterceptors.get(str);
                    if (iInterceptor != null && iInterceptor.onInterceptRoute(context, routeIntent)) {
                        return true;
                    }
                }
                MethodCollector.o(14442);
                return false;
            } finally {
                MethodCollector.o(14442);
            }
        }
    }
}
