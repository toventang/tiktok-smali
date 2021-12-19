package com.ss.android.ugc.aweme.ecommerce.gallery.transfer;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.appcompat.app.c;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.gallery.transfer.e;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class g implements DialogInterface.OnKeyListener, DialogInterface.OnShowListener, e.a {

    /* renamed from: a  reason: collision with root package name */
    public Dialog f86043a;

    /* renamed from: b  reason: collision with root package name */
    public e f86044b;

    /* renamed from: c  reason: collision with root package name */
    public d f86045c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f86046d;

    /* renamed from: e  reason: collision with root package name */
    private Context f86047e;

    static {
        Covode.recordClassIndex(53855);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.gallery.transfer.e.a
    public final void a() {
        try {
            this.f86043a.dismiss();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f86046d = false;
    }

    public final void onShow(DialogInterface dialogInterface) {
        this.f86044b.b();
    }

    private static void a(View view) {
        while (true) {
            view.setFitsSystemWindows(false);
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                view = (View) parent;
            } else {
                return;
            }
        }
    }

    public g(Context context) {
        this.f86047e = context;
        e eVar = new e(this.f86047e);
        this.f86044b = eVar;
        eVar.setOnLayoutResetListener(this);
        c.a aVar = new c.a(this.f86047e, R.style.vs);
        aVar.f903a.z = this.f86044b;
        aVar.f903a.y = 0;
        aVar.f903a.E = false;
        c a2 = aVar.a();
        this.f86043a = a2;
        a2.setOnShowListener(this);
        this.f86043a.setOnKeyListener(this);
        a(this.f86044b);
    }

    public final void a(List<ImageView> list) {
        int size = this.f86045c.f86004j.size();
        for (int i2 = 0; i2 < size; i2++) {
            list.add(null);
        }
    }

    public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        if (i2 == 4 && keyEvent.getAction() == 1 && !keyEvent.isCanceled() && this.f86046d && this.f86044b.a(this.f86045c.f85995a)) {
            this.f86046d = false;
        }
        return true;
    }
}
