package com.bytedance.bpea.entry.a.a;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.entry.common.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0567a f26662a = new C0567a((byte) 0);

    static {
        Covode.recordClassIndex(15707);
    }

    /* renamed from: com.bytedance.bpea.entry.a.a.a$a  reason: collision with other inner class name */
    public static final class C0567a {
        static {
            Covode.recordClassIndex(15708);
        }

        private static void b(ClipboardManager clipboardManager, ClipData clipData) {
            if (!((Boolean) com.bytedance.helios.sdk.a.a(clipboardManager, new Object[]{clipData}, 101807, "void", false, null).first).booleanValue()) {
                clipboardManager.setPrimaryClip(clipData);
                com.bytedance.helios.sdk.a.a(null, clipboardManager, new Object[]{clipData}, 101807, "com_bytedance_bpea_entry_api_clipboard_ClipboardEntry$Companion_android_content_ClipboardManager_setPrimaryClip(Landroid/content/ClipboardManager;Landroid/content/ClipData;)V");
            }
        }

        private C0567a() {
        }

        public /* synthetic */ C0567a(byte b2) {
            this();
        }

        private static void a(ClipboardManager clipboardManager, ClipData clipData) {
            l.d(clipData, "");
            try {
                b(clipboardManager, clipData);
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a(2, "ClipboardLancet", e2.getLocalizedMessage());
            }
        }

        public static void a(ClipboardManager clipboardManager, ClipData clipData, PrivacyCert privacyCert) {
            l.c(clipboardManager, "");
            l.c(clipData, "");
            a.C0572a.c(privacyCert, "clipboard_setClip");
            a(clipboardManager, clipData);
        }
    }
}
