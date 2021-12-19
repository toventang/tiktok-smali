package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.ac;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.arch.widgets.base.c;
import h.f.b.l;
import java.util.HashMap;

public final class InteractStickerViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public m f130639a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, Object> f130640b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, c<b>> f130641c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private Thread f130642d;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f130643e = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(85661);
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InteractStickerViewModel f130644a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f130645b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f130646c;

        static {
            Covode.recordClassIndex(85662);
        }

        a(InteractStickerViewModel interactStickerViewModel, String str, Object obj) {
            this.f130644a = interactStickerViewModel;
            this.f130645b = str;
            this.f130646c = obj;
        }

        public final void run() {
            this.f130644a.a(this.f130645b, this.f130646c);
        }
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        this.f130640b.clear();
        this.f130641c.clear();
        this.f130639a = null;
    }

    private final boolean a() {
        if (this.f130642d == null) {
            this.f130642d = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == this.f130642d) {
            return true;
        }
        return false;
    }

    private final c<b> b(String str) {
        c<b> cVar = this.f130641c.get(str);
        if (cVar == null) {
            cVar = new c<>();
            if (this.f130640b.containsKey(str)) {
                cVar.setValue(new b(str, this.f130640b.get(str)));
            }
            this.f130641c.put(str, cVar);
        }
        return cVar;
    }

    public final <T> T a(String str) {
        l.d(str, "");
        T t = (T) this.f130640b.get(str);
        if (t != null) {
            return t;
        }
        return null;
    }

    public final InteractStickerViewModel a(String str, u<b> uVar) {
        l.d(str, "");
        l.d(uVar, "");
        return a(str, uVar, false);
    }

    public final InteractStickerViewModel a(String str, Object obj) {
        l.d(str, "");
        if (!a()) {
            this.f130643e.post(new a(this, str, obj));
            return this;
        }
        this.f130640b.put(str, obj);
        c<b> cVar = this.f130641c.get(str);
        if (cVar != null) {
            cVar.setValue(new b(str, obj));
        }
        return this;
    }

    public final InteractStickerViewModel a(String str, u<b> uVar, boolean z) {
        l.d(str, "");
        if (!TextUtils.isEmpty(str) && uVar != null) {
            c<b> b2 = b(str);
            m mVar = this.f130639a;
            if (mVar == null) {
                l.b();
            }
            b2.a(mVar, uVar, z);
        }
        return this;
    }
}
