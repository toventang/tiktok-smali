package com.bytedance.liko.memoryexplorer.analyse.trace;

import com.bytedance.covode.number.Covode;
import com.bytedance.liko.memoryexplorer.analyse.trace.ExcludedRefs;
import com.bytedance.liko.memoryexplorer.android.AndroidOS;
import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class AndroidExcludeRefs {
    static {
        Covode.recordClassIndex(24740);
    }

    private AndroidExcludeRefs() {
    }

    private static void excludeInvalidReference(ExcludedRefs.Builder builder) {
        builder.instanceField(SoftReference.class.getName(), "referent");
        builder.instanceField(WeakReference.class.getName(), "referent");
        builder.instanceField(PhantomReference.class.getName(), "referent");
        builder.instanceField("java.lang.ref.FinalizerReference", "referent");
        builder.instanceField("java.lang.ref.Finalizer", "prev");
        builder.instanceField("java.lang.ref.Finalizer", "element");
        builder.instanceField("java.lang.ref.Finalizer", "next");
        builder.instanceField("java.lang.ref.FinalizerReference", "prev");
        builder.instanceField("java.lang.ref.FinalizerReference", "element");
        builder.instanceField("java.lang.ref.FinalizerReference", "next");
        builder.instanceField("sun.misc.Cleaner", "prev");
        builder.instanceField("sun.misc.Cleaner", "next");
    }

    public static void buildSystemExcludeRefs(ExcludedRefs.Builder builder) {
        excludeInvalidReference(builder);
        if (AndroidOS.SDK_INT >= 19 && AndroidOS.SDK_INT <= 21) {
            builder.instanceField("android.app.ActivityThread$ActivityClientRecord", "nextIdle");
        }
        if (AndroidOS.SDK_INT <= 19) {
            builder.instanceField("android.widget.Editor$EasyEditSpanController", "this$0");
            builder.instanceField("android.widget.Editor$SpanController", "this$0");
        }
        if (AndroidOS.SDK_INT == 21) {
            builder.staticField("android.media.session.MediaSessionLegacyHelper", "sInstance");
        }
        if (AndroidOS.SDK_INT < 22) {
            builder.staticField("android.text.TextLine", "sCached");
        }
        if (AndroidOS.SDK_INT < 21) {
            builder.instanceField("android.os.Message", "obj");
            builder.instanceField("android.os.Message", "next");
            builder.instanceField("android.os.Message", "target");
        }
        if (AndroidOS.SDK_INT >= 19 && AndroidOS.SDK_INT <= 22) {
            builder.instanceField("android.view.inputmethod.InputMethodManager", "mNextServedView");
            builder.instanceField("android.view.inputmethod.InputMethodManager", "mServedView");
            builder.instanceField("android.view.inputmethod.InputMethodManager", "mServedInputConnection");
        }
        if (AndroidOS.SDK_INT >= 15 && AndroidOS.SDK_INT <= 22) {
            builder.instanceField("android.view.inputmethod.InputMethodManager", "mCurRootView");
        }
        if (AndroidOS.SDK_INT >= 14 && AndroidOS.SDK_INT <= 22) {
            builder.instanceField("android.animation.LayoutTransition$1", "val$parent");
        }
        if (AndroidOS.SDK_INT >= 16 || AndroidOS.SDK_INT <= 22) {
            builder.instanceField("android.view.textservice.SpellCheckerSession$1", "this$0");
        }
        if ("motorola".equals(AndroidOS.MANUFACTURER) && AndroidOS.SDK_INT == 19) {
            builder.instanceField("android.app.admin.DevicePolicyManager$SettingsObserver", "this$0");
        }
        if ("samsung".equals(AndroidOS.MANUFACTURER) && AndroidOS.SDK_INT == 19) {
            builder.staticField("com.samsung.android.smartclip.SpenGestureManager", "mContext");
        }
        if ("samsung".equals(AndroidOS.MANUFACTURER) && AndroidOS.SDK_INT >= 19 && AndroidOS.SDK_INT <= 21) {
            builder.staticField("android.sec.clipboard.ClipboardUIManager", "sInstance");
        }
        if ("LGE".equals(AndroidOS.MANUFACTURER) && AndroidOS.SDK_INT >= 19 && AndroidOS.SDK_INT <= 21) {
            builder.staticField("android.widget.BubblePopupHelper", "sHelper");
        }
        if ("samsung".equals(AndroidOS.MANUFACTURER) && AndroidOS.SDK_INT == 19) {
            builder.staticField("com.android.org.chromium.android_webview.AwResource", "sResources");
        }
        if ("NVIDIA".equals(AndroidOS.MANUFACTURER) && AndroidOS.SDK_INT == 19) {
            builder.instanceField("com.nvidia.ControllerMapper.MapperClient$ServiceClient", "this$0");
        }
        if ("samsung".equals(AndroidOS.MANUFACTURER) && AndroidOS.SDK_INT == 19) {
            builder.staticField("android.widget.TextView", "mLastHoveredView");
        }
        if ("samsung".equals(AndroidOS.MANUFACTURER) && AndroidOS.SDK_INT == 19) {
            builder.instanceField("android.os.PersonaManager", "mContext");
        }
        if ("samsung".equals(AndroidOS.MANUFACTURER) && AndroidOS.SDK_INT == 19) {
            builder.instanceField("android.content.res.Resources", "mContext");
        }
        if ("samsung".equals(AndroidOS.MANUFACTURER) && AndroidOS.SDK_INT == 19) {
            builder.instanceField("android.view.ViewConfiguration", "mContext");
        }
        if ("samsung".equals(AndroidOS.MANUFACTURER) && AndroidOS.SDK_INT == 19) {
            builder.staticField("android.media.AudioManager", "mContext_static");
        }
        if (AndroidOS.SDK_INT <= 22) {
            builder.instanceField("android.media.AudioManager$1", "this$0");
        }
        if (AndroidOS.SDK_INT <= 22) {
            builder.instanceField("android.widget.Editor$Blink", "this$0");
        }
        if (AndroidOS.SDK_INT <= 23) {
            builder.instanceField("android.net.ConnectivityManager", "sInstance");
        }
        if (AndroidOS.SDK_INT >= 26 && AndroidOS.SDK_INT <= 27) {
            builder.instanceField("android.view.accessibility.AccessibilityNodeInfo", "mOriginalText");
        }
        if (AndroidOS.SDK_INT >= 26 && AndroidOS.SDK_INT <= 24) {
            builder.instanceField("com.android.internal.policy.BackdropFrameRenderer", "mDecorView");
        }
        if (AndroidOS.SDK_INT == 24) {
            builder.instanceField("android.speech.tts.TextToSpeech", "mContext");
            builder.instanceField("android.speech.tts.TtsEngines", "mContext");
        }
        if (AndroidOS.MANUFACTURER.equalsIgnoreCase("HUAWEI") && AndroidOS.SDK_INT >= 24 && AndroidOS.SDK_INT <= 25) {
            builder.instanceField("android.gestureboost.GestureBoostManager", "mContext");
        }
        if (AndroidOS.SDK_INT == 28) {
            builder.instanceField("android.view.ViewGroup$ViewLocationHolder", "mRoot");
            builder.staticField("android.view.ViewGroup$ViewLocationHolder", "sPool");
        }
    }
}
