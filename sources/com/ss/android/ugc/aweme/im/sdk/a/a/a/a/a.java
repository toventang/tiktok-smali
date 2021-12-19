package com.ss.android.ugc.aweme.im.sdk.a.a.a.a;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.f;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final f f100087a;

    static {
        Covode.recordClassIndex(63791);
    }

    public a(f fVar) {
        l.d(fVar, "");
        this.f100087a = fVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.a.a.a.a.a$a  reason: collision with other inner class name */
    public static final class DialogInterface$OnDismissListenerC2456a implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f100088a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DataCenter f100089b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f100090c;

        static {
            Covode.recordClassIndex(63792);
        }

        public DialogInterface$OnDismissListenerC2456a(a aVar, DataCenter dataCenter, Fragment fragment) {
            this.f100088a = aVar;
            this.f100089b = dataCenter;
            this.f100090c = fragment;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            int i2 = 0;
            this.f100089b.a("ENTER_DISLIKE_MODE", (Object) false);
            if (com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.f.a(this.f100090c.getActivity())) {
                e activity = this.f100090c.getActivity();
                if (activity != null) {
                    i2 = activity.hashCode();
                }
                com.ss.android.ugc.aweme.feed.i.f fVar = new com.ss.android.ugc.aweme.feed.i.f(i2);
                if (l.a((Object) "report", (Object) this.f100088a.f100087a.d())) {
                    fVar.f93481g = true;
                }
                c.a(fVar);
            }
        }
    }
}
