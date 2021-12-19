package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2474a f100539a = new C2474a((byte) 0);

    static {
        Covode.recordClassIndex(64289);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.a$a  reason: collision with other inner class name */
    public static final class C2474a {
        static {
            Covode.recordClassIndex(64290);
        }

        private C2474a() {
        }

        public /* synthetic */ C2474a(byte b2) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.a$a$a  reason: collision with other inner class name */
        public static final class DialogInterface$OnDismissListenerC2475a implements DialogInterface.OnDismissListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Activity f100540a;

            static {
                Covode.recordClassIndex(64291);
            }

            public DialogInterface$OnDismissListenerC2475a(Activity activity) {
                this.f100540a = activity;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                if (Build.VERSION.SDK_INT >= 23) {
                    Window window = ((e) this.f100540a).getWindow();
                    l.b(window, "");
                    View decorView = window.getDecorView();
                    l.b(decorView, "");
                    int systemUiVisibility = decorView.getSystemUiVisibility();
                    Window window2 = ((e) this.f100540a).getWindow();
                    l.b(window2, "");
                    View decorView2 = window2.getDecorView();
                    l.b(decorView2, "");
                    decorView2.setSystemUiVisibility(systemUiVisibility | 8192);
                }
            }
        }
    }
}
