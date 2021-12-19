package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.LongSparseArray;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import java.util.List;

public class PreloadResCleanerTask implements w {
    static {
        Covode.recordClassIndex(69099);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    private static Context b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        int i2 = 0;
        if (SettingsManager.a().a("enable_preload_opt", false)) {
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    Object a2 = com.bytedance.common.utility.reflect.a.a(b(context).getResources(), "mResourcesImpl");
                    if (a2 != null) {
                        Object a3 = com.bytedance.common.utility.reflect.a.a(a2, "sPreloadedDrawables");
                        if (a3 instanceof LongSparseArray[]) {
                            LongSparseArray[] longSparseArrayArr = (LongSparseArray[]) a3;
                            int length = longSparseArrayArr.length;
                            while (i2 < length) {
                                b.a(longSparseArrayArr[i2]);
                                i2++;
                            }
                        } else {
                            b.a((LongSparseArray) a3);
                        }
                        b.a(com.bytedance.common.utility.reflect.a.a(a2, "sPreloadedColorDrawables"));
                        b.a(com.bytedance.common.utility.reflect.a.a(a2, "sPreloadedComplexColors"));
                        Object a4 = com.bytedance.common.utility.reflect.a.a(a2, "mDrawableCache");
                        if (a4 != null) {
                            b.a(com.bytedance.common.utility.reflect.a.a(a4, "mNullThemedEntries"));
                            b.a(com.bytedance.common.utility.reflect.a.a(a4, "mThemedEntries"));
                            b.a(com.bytedance.common.utility.reflect.a.a(a4, "mUnthemedEntries"));
                        }
                        b.a(com.bytedance.common.utility.reflect.a.a(a2, "mDrawableCache"));
                        b.a(com.bytedance.common.utility.reflect.a.a(a2, "mColorDrawableCache"));
                        b.a(com.bytedance.common.utility.reflect.a.a(a2, "mColorStateListCache"));
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } else if (Build.VERSION.SDK_INT >= 23) {
                try {
                    Resources resources = b(context).getResources();
                    Object a5 = com.bytedance.common.utility.reflect.a.a(resources, "sPreloadedDrawables");
                    if (a5 instanceof LongSparseArray[]) {
                        LongSparseArray[] longSparseArrayArr2 = (LongSparseArray[]) a5;
                        int length2 = longSparseArrayArr2.length;
                        while (i2 < length2) {
                            b.a(longSparseArrayArr2[i2]);
                            i2++;
                        }
                    } else {
                        b.a((LongSparseArray) a5);
                    }
                    b.a(com.bytedance.common.utility.reflect.a.a(resources, "sPreloadedColorDrawables"));
                    b.a(com.bytedance.common.utility.reflect.a.a(resources, "sPreloadedColorStateLists"));
                    b.a(com.bytedance.common.utility.reflect.a.a(resources, "mDrawableCache"));
                    b.a(com.bytedance.common.utility.reflect.a.a(resources, "mColorDrawableCache"));
                    b.a(com.bytedance.common.utility.reflect.a.a(resources, "mColorStateListCache"));
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            } else if (Build.VERSION.SDK_INT == 21 || Build.VERSION.SDK_INT == 19) {
                try {
                    Object a6 = com.bytedance.common.utility.reflect.a.a(b(context).getResources(), "sPreloadedDrawables");
                    if (a6 instanceof LongSparseArray[]) {
                        LongSparseArray[] longSparseArrayArr3 = (LongSparseArray[]) a6;
                        int length3 = longSparseArrayArr3.length;
                        while (i2 < length3) {
                            b.a(longSparseArrayArr3[i2]);
                            i2++;
                        }
                        return;
                    }
                    b.a((LongSparseArray) a6);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }
    }
}
